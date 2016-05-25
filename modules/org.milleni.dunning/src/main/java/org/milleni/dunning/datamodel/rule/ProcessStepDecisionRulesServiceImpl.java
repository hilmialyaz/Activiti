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
		
		Boolean processStartStep = true;
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

		if(processStartStep &&  Constants.DEACTIVATION.equalsIgnoreCase(processStepText) && !Constants.DEAKTIF.equalsIgnoreCase(customer.getStatus())){
			int canIDeactivate =0;
			int procParam =0;
			//dunningProcessMasterRepository.canIDeactivateCustomer(customerId,canIDeactivate,procParam);
			canIDeactivate = dunningProcessMasterRepository.canIDeactivateCustomerFunc(customerId);
			if(canIDeactivate==0){
				processWaitTime = "P20D";
				processStartStep=false;
				execution.setVariable(Constants.processWaitTime, processWaitTime);// ruledan gelen
				execution.setVariable(Constants.processStartStep, processStartStep);
			}
		}
		
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
	
	
	@Transactional(noRollbackFor = { BpmnError.class })
	public void fireStepDecisionRulesBUGCOZMECE(DelegateExecution execution) throws Exception {
		Long customerId = (Long) execution.getVariable(Constants.customerId);		
		Customer customer = customerService.findOne(customerId);
		if (customer == null) throwNotRetryError(execution, Constants.ERROR, Constants.CUSTOMER_ID_NOT_FOUND);

		DunningProcessMaster dunningProcessMaster = customer.getDunningProcessMaster();
		if (dunningProcessMaster == null) throwNotRetryError(execution, Constants.ERROR, Constants.DUNNING_PROCESS_MASTER_NOT_FOUND);

		Calendar cal= Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH,10);
		
		
		Date nextStepDate = dunningProcessMaster.getNextStepExecutionDate();
		if(nextStepDate!=null && nextStepDate.before(new Date())){
			nextStepDate = cal.getTime();
		}else{
			nextStepDate=cal.getTime();
		}
		
		Boolean processStartStep = false;
		long currentStepId=dunningProcessMaster.getCurrentStepId().getStepId();
		if(currentStepId==112 || currentStepId==113 || currentStepId==42 //bir 
				|| currentStepId==114 || currentStepId==79 //kur
				|| currentStepId==2 || currentStepId==10 || currentStepId==3 || currentStepId==6 || currentStepId==5 //vip
				|| currentStepId==102 || currentStepId==110 || currentStepId==106 || currentStepId==103				)
		{
			processStartStep = true;
		}
		
		String processStepName = dunningProcessMaster.getCurrentStepId().getStepName();
		String processStepText = dunningProcessMaster.getCurrentStepId().getStepText();
		
		
		Boolean deaktifseAtla = false;
		Date now = new Date();		
		Period period = new Period(now.getTime(),nextStepDate.getTime(),PeriodType.dayTime());
		execution.setVariable(Constants.processWaitTime, period.toString());	
		execution.setVariable(Constants.processStartStep, processStartStep);
		execution.setVariable(Constants.processStep, processStepName);
		execution.setVariable(Constants.processStepName, processStepText);// Son
		execution.setVariable(Constants.deaktifseAtla, deaktifseAtla);

		dunningProcessMaster.setBpmProcessId(execution.getProcessInstanceId());
		dunningProcessService.saveDunningProcessMaster(dunningProcessMaster);
		//deaktivasyon icin ka
	}


}