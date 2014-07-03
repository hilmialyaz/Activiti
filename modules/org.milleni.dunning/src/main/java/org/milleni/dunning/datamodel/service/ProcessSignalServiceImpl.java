package org.milleni.dunning.datamodel.service;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.runtime.Execution;
import org.activiti.engine.runtime.ProcessInstance;
import org.apache.log4j.Logger;
import org.milleni.dunning.datamodel.dao.CustomerGroupsRepository;
import org.milleni.dunning.datamodel.dao.CustomerInvoicesRepository;
import org.milleni.dunning.datamodel.dao.CustomerRepository;
import org.milleni.dunning.datamodel.dao.CustomerTypesRepository;
import org.milleni.dunning.datamodel.dao.DunningProcessDetailRepository;
import org.milleni.dunning.datamodel.dao.DunningProcessMasterRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.rule.InvoicePaymentRuleService;
import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.ws.proxy.BpmWsDelegateService;
import org.milleni.dunning.ws.proxy.CommonProxySerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "processSignalService")
public class ProcessSignalServiceImpl implements ProcessSignalService {

	@Autowired
	protected transient RuntimeService runtimeService;

	@Autowired
	BpmWsDelegateService bpmWsDelegateService;
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	DunningProcessMasterRepository dunningProcessMasterRepository;

	protected static final Logger LOGGER = Logger.getLogger(ProcessSignalServiceImpl.class);

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void signalCustomerProcessIfPaymentReceived(Long customerId) {
		try {
			List<ProcessInstance> processInstances = runtimeService.createProcessInstanceQuery().variableValueEquals("customerId", customerId).list();
			if(processInstances!=null && processInstances.size()>0){
				for (ProcessInstance processInstance : processInstances) {
					List<Execution> executions = null;
					executions = runtimeService.createExecutionQuery().processInstanceId(processInstance.getId()).messageEventSubscriptionName(Constants.messagePaymentReceived).list();
					if (executions.size() > 0) {
						//startProcessForPaymentReceived(customerId);
						//return;
						runtimeService.messageEventReceived(Constants.messagePaymentReceived, executions.get(0).getId());
					}
				}
			}else{
				Customer customer = customerService.findOne(customerId);
				List<DunningProcessMaster> dunningPMasters = dunningProcessMasterRepository.findDunningProcessMastersByStatus(customerId, Constants.RUNNING);
				for (DunningProcessMaster runningIns : dunningPMasters) {
					runningIns.setStatus(dunningProcessMasterRepository.getProcessStatus(Constants.ERROR));
					runningIns.setStatusDesc("BPM bitmis ama master surece yansimamis");
				}
				dunningProcessMasterRepository.save(dunningPMasters);
			}
		} catch (Exception ex) {
			LOGGER.error("signalCustomerProcessIfPaymentReceived:" + "|customerId:" + customerId + " message:" + ex.getMessage());
		}
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void signalProcess(DelegateExecution execution) {
		Long customerId = null;
		try {
			customerId = (Long) execution.getVariable(Constants.customerId);
			List<ProcessInstance> processInstances = runtimeService.createProcessInstanceQuery().variableValueEquals("customerId", customerId).list();
			for (ProcessInstance processInstance : processInstances) {
				List<Execution> executions = null;
				executions = runtimeService.createExecutionQuery().processInstanceId(processInstance.getId()).messageEventSubscriptionName(Constants.messagePaymentReceived).list();
				if (executions.size() > 0) {
					runtimeService.messageEventReceived(Constants.messagePaymentReceived, executions.get(0).getId());
				}
			}

		} catch (Exception ex) {
			LOGGER.error("signalProcess:" + "|customerId:" + customerId + " message:" + ex.getMessage());
		}
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void startProcessForPaymentReceived(long customerId) {
		try {
			Map<String, Object> variables = new HashMap<String, Object>();
			variables.put(Constants.customerId, customerId);
			ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("FL422_PaymentSignalProcess", variables);

		} catch (Exception ex) {
			LOGGER.error("signalProcess:" + "|customerId:" + customerId + " message:" + ex.getMessage());
		}
	}

}
