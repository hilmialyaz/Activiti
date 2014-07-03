package org.milleni.dunning.datamodel.rule;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.delegate.BpmnError;
import org.activiti.engine.delegate.DelegateExecution;
import org.drools.KnowledgeBase;
import org.drools.definition.type.FactType;
import org.drools.runtime.StatefulKnowledgeSession;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.milleni.dunning.datamodel.dao.DunningPolicyRepository;
import org.milleni.dunning.datamodel.dao.DunningProcessDetailLogsRepository;
import org.milleni.dunning.datamodel.dao.DunningProcessDetailRepository;
import org.milleni.dunning.datamodel.dao.DunningProcessMasterRepository;
import org.milleni.dunning.datamodel.dao.ProcessStepsRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.DunningPolicySteps;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.model.ProcessSteps;
import org.milleni.dunning.datamodel.service.CustomerService;
import org.milleni.dunning.datamodel.service.DunningProcessService;
import org.milleni.dunning.datamodel.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "processStepRuleService")
public class ProcessStepDecisionRulesServiceImpl extends AbstractRuleService implements ProcessStepDecisionRulesService {

	public static int currentStepCount = 0;

	private HashMap<String, Object> factMap = new HashMap<String, Object>();

	@Autowired
	CustomerService customerService;

	@Autowired
	DunningProcessMasterRepository dunningProcessMasterRepository;

	@Autowired
	DunningProcessDetailRepository dunningProcessDetailRepository;

	@Autowired
	ProcessStepsRepository processStepsRepository;

	@Autowired
	DunningProcessDetailLogsRepository dunningProcessDetailLogsRepository;

	@Autowired
	DunningProcessService dunningProcessService;

	@Autowired
	DunningPolicyRepository dunningPolicyRepository;

	@Transactional(noRollbackFor = { BpmnError.class })
	public void fireStepDecisionRules(DelegateExecution execution) throws Exception {
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		Customer customer = customerService.findOne(customerId);
		if (customer == null) throwNotRetryError(execution, Constants.ERROR, Constants.CUSTOMER_ID_NOT_FOUND);

		DunningProcessMaster dunningProcessMaster = dunningProcessService.getDunningProcessMaster(execution);
		if (dunningProcessMaster == null) throwNotRetryError(execution, Constants.ERROR, Constants.DUNNING_PROCESS_MASTER_NOT_FOUND);

		DunningPolicySteps policyStep = defineProcessStep(execution, dunningProcessMaster);
		
		Boolean processStartStep = (Boolean) execution.getVariable(Constants.processStartStep);
		if (processStartStep == null) processStartStep = true;
		String processStepName = policyStep.getProcessSteps().getStepName();
		String processStepText = dunningProcessMaster.getProcessLastStepId() != null ? policyStep.getProcessSteps().getStepText() : "";
		
		Map<String,Object> factTypes= new HashMap<String,Object>();
		factTypes.put( Constants.processStep, processStepName);
		factTypes.put(  Constants.processStartStep, processStartStep);
		factTypes.put( Constants.processWaitTime, execution.getVariable(Constants.processWaitTime));
		Map execMap = executeRules(Constants.RULES_PROCESS_STEP,factTypes, customer);
		
		
		String processWaitTime = (String) execMap.get(Constants.processWaitTime);
		processStartStep = (Boolean) execMap.get(Constants.processStartStep);
		Boolean deaktifseAtla = (Boolean) execMap.get(Constants.deaktifseAtla);
		execution.setVariable(Constants.processWaitTime, processWaitTime);// ruledan gelen
		execution.setVariable(Constants.processStartStep, processStartStep);
		execution.setVariable(Constants.processStep, processStepName);
		execution.setVariable(Constants.processStepName, processStepText);// Son
		execution.setVariable(Constants.deaktifseAtla, deaktifseAtla);

		if (processStartStep) {
			DunningProcessDetail detail = dunningProcessService.createDunningProcessDetail(dunningProcessMaster, policyStep.getProcessSteps());
			dunningProcessMaster.setCurrentStepId(detail.getProcessStepId());
			defineNextProcessStep(execution, dunningProcessMaster, policyStep);
			String preDefinedProcessStep = (String) execution.getVariable(Constants.preDefinedProcessStep);
			if (preDefinedProcessStep != null)
				execution.setVariable(Constants.preDefinedProcessStep, null);
			execution.setVariable(Constants.stepStartDateTime, new Date());
		}else{
			dunningProcessMaster.setNextStepExecutionDate(DateTime.now().plus(Period.parse(processWaitTime)).toDate());			
		}
		dunningProcessService.saveDunningProcessMaster(dunningProcessMaster);
	}

	public DunningPolicySteps defineProcessStep(DelegateExecution execution, DunningProcessMaster dunningProcessMaster) {
		if(dunningProcessMaster.getNextStepId()!=null){		
			DunningPolicySteps nextStep = dunningPolicyRepository.retrieveNextDunningPolicyStep(dunningProcessMaster);
			if(nextStep!=null){
				execution.setVariable(Constants.processWaitTime, nextStep.getNextStepWaitDuration());
				return nextStep;
			}
		}else{
			List<DunningPolicySteps> nextSteps = dunningPolicyRepository.retrieveNextDunningPolicyStepFromCurrentStep(dunningProcessMaster);
			if(nextSteps!=null){
				execution.setVariable(Constants.processWaitTime, nextSteps.get(0).getNextStepWaitDuration());
				return nextSteps.get(0);
			}
		}
		throw new RuntimeException("Adim Bulunamadi."+ execution.getVariable(Constants.customerId));
		
		/*
					
		List<Object[]> policySteps = dunningPolicyRepository.retrieveDunningPolicySteps(dunningProcessMaster.getDunningPolicyId().getPolicyId());
		
		// sotune motune bakma direk dal
		execution.setVariable(Constants.processStartStep, true);
		for (Object[] obj : policySteps) {
			DunningPolicySteps dunningPolicySteps = (DunningPolicySteps) obj[0];
			if (dunningProcessMaster.getNextStepId().getStepId() == dunningPolicySteps.getDunningPolicyStepsPK().getStepId()) {
				execution.setVariable(Constants.processWaitTime, dunningPolicySteps.getNextStepWaitDuration());
				return dunningPolicySteps;
			}
		}					
		
		//
		int i =0;
		for (Object[] obj : policySteps) {
			DunningPolicySteps dunningPolicySteps = (DunningPolicySteps) obj[0];
			if (dunningProcessMaster.getProcessLastStepId().getStepId() == dunningPolicySteps.getDunningPolicyStepsPK().getStepId()) {
				execution.setVariable(Constants.processWaitTime,((DunningPolicySteps)(policySteps.get(i+1)[0])).getNextStepWaitDuration());
				return dunningPolicySteps;
			}
			i++;
		}
		return null;
		//todo
		// Buradan assaya gecmez		 
		 */
	}

	public void defineNextProcessStep(DelegateExecution execution, DunningProcessMaster dunningProcessMaster, DunningPolicySteps policyStep) {
		dunningProcessMaster.setNextStepExecutionDate(DateTime.now().plus(Period.parse((String) execution.getVariable(Constants.processWaitTime))).toDate());
		ProcessSteps dps = dunningPolicyRepository.retrieveNextSeqnumDunningPolicyStep(dunningProcessMaster.getDunningPolicyId().getPolicyId(), policyStep.getSeqNum()+1);
		dunningProcessMaster.setNextStepId(dps);
		isActionInWeekdays(execution, dunningProcessMaster);
		/*
		List<Object[]> policySteps = dunningPolicyRepository.retrieveDunningPolicySteps(dunningProcessMaster.getDunningPolicyId().getPolicyId());
		int i = 0;
		for (Object[] obj : policySteps) {
			DunningPolicySteps dunningPolicySteps = (DunningPolicySteps) obj[0];
			if (dunningPolicySteps == policyStep) {
				break;
			}
			i++;
		}
		
		dunningProcessMaster.setNextStepExecutionDate(DateTime.now().plus(Period.parse((String) execution.getVariable(Constants.processWaitTime))).toDate());
		if (policySteps.size() > i + 1) {
			dunningProcessMaster.setNextStepId((ProcessSteps) policySteps.get(i + 1)[1]);				
		} else {
			ProcessSteps dps = dunningPolicyRepository.retrieveNextSeqnumDunningPolicyStep(dunningProcessMaster.getDunningPolicyId().getPolicyId(), policyStep.getSeqNum()+1);
			dunningProcessMaster.setNextStepId(dps);
		}
		isActionInWeekdays(execution, dunningProcessMaster);
		*/
	}

	public void isActionInWeekdays(DelegateExecution execution, DunningProcessMaster dunningProcessMaster) {
		if (dunningProcessMaster.getNextStepExecutionDate() == null)
			return;

		Calendar nextStepDate = Calendar.getInstance();
		nextStepDate.setTime(dunningProcessMaster.getNextStepExecutionDate());

		Calendar today = Calendar.getInstance();

		if (nextStepDate.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
			nextStepDate.add(Calendar.DATE, 1);

			if (today.getTime().getTime() < nextStepDate.getTime().getTime()) {
				Period period = new Period(today.getTime().getTime(), nextStepDate.getTime().getTime(), PeriodType.dayTime());
				dunningProcessMaster.setNextStepExecutionDate(nextStepDate.getTime());
				execution.setVariable(Constants.processWaitTime, period.toString());
			}
		}

	}

}

/*
 * 
 * Date invDueDate =
 * dunningProcessMaster.getDunningInvoiceId().getInvoiceDueDate(); Date now =
 * new Date(); long diffDate = Math.round((now.getTime() - invDueDate.getTime())
 * / 86400000D); long days = 0; DunningPolicySteps nextStep = null; int i = 0;
 * boolean waitForNextStep = false;// o step yapildiysa ve arada ise // beklemek
 * icin int currentStepIndex = -1; for (Object[] obj : policySteps) {
 * DunningPolicySteps dunningPolicySteps = (DunningPolicySteps) obj[0]; days =
 * days +
 * Long.parseLong(dunningPolicySteps.getNextStepWaitDuration().replaceAll(
 * "[^0-9.]", "")); nextStep = dunningPolicySteps;
 * 
 * if (currentStepIndex == -1 && dunningProcessMaster.getProcessLastStepId() !=
 * null && dunningProcessMaster.getProcessLastStepId().getStepId() ==
 * nextStep.getDunningPolicyStepsPK().getStepId()) { currentStepIndex = i; }
 * 
 * i++;
 * 
 * if (days > diffDate) { break; } } // Bekleme gun sayisi hesapla long waitDays
 * = (days - diffDate) < 0 ? 0 : (days - diffDate); // yapılacak adim son adim
 * yani process_finished ise ise beklemeye gerek // yok. if (policySteps.size()
 * == (i + 1)) waitDays = 0; execution.setVariable(Constants.processWaitTime,
 * "P" + waitDays + "D");
 * 
 * // ayni adim tekrar ediliyorsa if
 * (dunningProcessMaster.getProcessLastStepId() != null &&
 * dunningProcessMaster.getProcessLastStepId().getStepId() ==
 * nextStep.getDunningPolicyStepsPK().getStepId()) { //tekrar eden adim son
 * adimsa if (waitDays == 0) execution.setVariable(Constants.processStartStep,
 * true); else execution.setVariable(Constants.processStartStep, false); //Bir
 * sonraki adima geç return (DunningPolicySteps) policySteps.get(i)[0]; } else {
 * //hesaplanan adım yapılmasi gereken adim degilse. if
 * (dunningProcessMaster.getProcessLastStepId() != null &&
 * nextStep.getDunningPolicyStepsPK().getStepId() != ((DunningPolicySteps)
 * policySteps.get(currentStepIndex +
 * 1)[0]).getDunningPolicyStepsPK().getStepId()) { // farzedelim sot+300 de adam
 * geldi. Bir sonraki adım neyse onu // yap.Bekleme süresini normal olarak gir
 * execution.setVariable(Constants.processStartStep, true);
 * execution.setVariable(Constants.processWaitTime, ((DunningPolicySteps)
 * policySteps.get(currentStepIndex + 1)[0]).getNextStepWaitDuration()); return
 * (DunningPolicySteps) policySteps.get(currentStepIndex + 1)[0]; } }
 * 
 * /* Manual baslamada ilk step yapılmış olabilir. coa1 coa2 daha once basilmis
 * sms atmaya 3 gun var.Normalde processWaitTime 3 gun ama step coa2 olur. Coa2
 * manual yapilmiş ise step sms e setlenip 3 gun beklenir. 3 gun sonra tekrar
 * aynı kontrole girdiginde adım sms ve bekleme suresi de bir sonraki adım
 * olarak atanır.
 */
/*
 * Boolean firstStepNext = (Boolean)
 * execution.getVariable(Constants.firstStepNext); if (firstStepNext != null &&
 * firstStepNext && policySteps.size() > i) {
 * execution.setVariable(Constants.processStartStep, false);
 * execution.setVariable(Constants.firstStepNext, false); return
 * (DunningPolicySteps) policySteps.get(i)[0]; }
 * execution.setVariable(Constants.processStartStep, true);
 * 
 * return nextStep;
 */
