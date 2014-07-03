package org.milleni.dunning.datamodel.rule;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.delegate.BpmnError;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.runtime.ProcessInstance;
import org.milleni.dunning.datamodel.dao.DunningPolicyRepository;
import org.milleni.dunning.datamodel.dao.DunningProcessMasterRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerGroup;
import org.milleni.dunning.datamodel.model.DunningPolicy;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.model.ProcessSteps;
import org.milleni.dunning.datamodel.service.CustomerService;
import org.milleni.dunning.datamodel.service.DunningProcessService;
import org.milleni.dunning.datamodel.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "batchProcessOperationsRuleService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public class BatchProcessOperationsRuleServiceImpl extends AbstractRuleService implements BatchProcessOperationsRuleService {

	@Autowired
	CustomerService customerService;
	
	@Autowired
	protected RuntimeService runtimeService;

	@Autowired
	DunningProcessService dunningProcessService;
	
	@Autowired
	CustomerRulesService customerRulesService;
	
	@Autowired
	DunningPolicyRepository dunningPolicyRepository;
	
	@Autowired
	DunningProcessMasterRepository dunningProcessMasterRepository;
	


	public void fireCustomerRules(DelegateExecution execution) throws Exception {
		DunningProcessMaster dpMaster = dunningProcessService.initializeDunningProcessMaster(execution);
		if(dpMaster==null) return; 
		
		//dpMaster = dunningProcessMasterRepository.findOne(dpMaster.getProcessId());
		//if(Constants.ERROR.equalsIgnoreCase(dpMaster.getStatus().getId())) return;
		String  processStatusDesc = null; 
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		Customer customer = customerService.findOne(customerId);
		CustomerGroup group = customerService.getCustomerGroup(customer.getCustomerGroup().getGroupId());
		
		Map execMap = executeRules(Constants.RULES_PROCESS_STARTUP,null, group,customer);
		String bpmProcessName = (String) execMap.get("bpmProcess");
		
		if(bpmProcessName==null)
			processStatusDesc=Constants.BPM_PROCESS_NOT_FOUND;
		
		if(Constants.FL99_MustNotInDunningProcess.equals(bpmProcessName))
			processStatusDesc=Constants.CUSTOMER_MUST_NOT_IN_DUNNING;
		
		if(processStatusDesc==null){
			Long userSelectedProcessStep = (Long) execution.getVariable(Constants.userSelectedProcessStep);
			DunningPolicy dunningPolicy = dunningPolicyRepository.findDunningPolicyByName(bpmProcessName,new Date());
			boolean policyHasStep = false;
			List<ProcessSteps> processSteps =  dunningPolicyRepository.retrieveDunningProcessSteps(dunningPolicy.getPolicyId());
			if(userSelectedProcessStep!=null){
				for (ProcessSteps processStep : processSteps) {
					if(processStep.getStepId()==userSelectedProcessStep){
						policyHasStep = true;
						dpMaster.setNextStepId(processStep);
						break;
						//variables.put(Constants.userSelectedProcessStep, execution.getVariable(Constants.userSelectedProcessStep));
					}
				}
				if(!policyHasStep)
					processStatusDesc=Constants.USER_DEFINED_PROCESS_NOT_ASSIGNABLE;
			}else{
				dpMaster.setNextStepId(processSteps.get(1));
			}
			dpMaster.setDunningPolicyId(dunningPolicy);
		}
		
		if(processStatusDesc==null){
			Map<String,Object> variables = new HashMap<String, Object>();
			variables.put(Constants.user,execution.getVariable(Constants.user) );
			variables.put(Constants.customerId, customer.getCustomerId());
			variables.put(Constants.dunningProcessMaster, dpMaster.getProcessId());
			variables.put(Constants.firstStepNext, execution.getVariable(Constants.firstStepNext));
			ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(bpmProcessName,variables);	    
			dpMaster.setBpmProcessId(processInstance.getProcessInstanceId());	   
		}else{
			dpMaster.setStatus(dunningProcessMasterRepository.getProcessStatus(Constants.ERROR));
			dpMaster.setStatusDesc(processStatusDesc);	
		}
		
	    customer.setDunningProcessMaster(dpMaster);
	    customerService.saveCustomer(customer);
		dunningProcessService.saveDunningProcessMaster(dpMaster);
	}
	
	

	
	
}
