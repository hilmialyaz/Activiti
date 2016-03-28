package org.milleni.dunning.datamodel.rule;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.activiti.engine.delegate.BpmnError;
import org.activiti.engine.delegate.DelegateExecution;
import org.drools.KnowledgeBase;
import org.drools.definition.type.FactType;
import org.drools.runtime.StatefulKnowledgeSession;
import org.milleni.dunning.datamodel.dao.CustomerInvoicesRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.service.CustomerService;
import org.milleni.dunning.datamodel.service.DunningProcessService;
import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.ws.client.milinternal.ArrayOfFaturaKalemi;
import org.milleni.dunning.ws.client.milinternal.FaturaDetayi;
import org.milleni.dunning.ws.client.milinternal.FaturaKalemi;
import org.milleni.dunning.ws.client.milinternal.MillenicomInternalSoap;
import org.milleni.dunning.ws.proxy.CommonProxySerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service(value = "suspensionRuleService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public class SuspensionRuleServiceImpl extends AbstractRuleService implements SuspensionRuleService {

	@Autowired
	CustomerInvoicesRepository customerInvoiceRepository;

	@Autowired
	CustomerService customerService;

	@Autowired
	CommonProxySerivce commonProxyService;

	@Autowired
	CustomerInvoicesRepository invoiceRepository;

	@Autowired
	DunningProcessService processService;

	@Resource(name = "dunningPropertyPlaceholder")
	private Properties dunningProperties;

	@Transactional(readOnly = true, noRollbackFor = { BpmnError.class })
	public void executeSuspensionRules(DelegateExecution execution) throws Exception {
		Long customerId = (Long) execution.getVariable(Constants.customerId);

		Customer customer = customerService.findOne(customerId);

		KnowledgeBase knowledgeBase = readKnowledgeBase(Constants.RULES_SUSPENSION);
		StatefulKnowledgeSession workingMemory = knowledgeBase.newStatefulKnowledgeSession();

		FactType executionResultType = knowledgeBase.getFactType(Constants.RULES_SUSPENSION, "ExecutionResult");

		Object result = executionResultType.newInstance();
		executionResultType.set(result, "resultCode", 0);
		executionResultType.set(result, "resultText", "");
		executionResultType.set(result, "bpmErrorCode", "");// retryError
															// notRetryError
															// taskError
		executionResultType.set(result, "processWaitTime", "");// retry ise
		executionResultType.set(result, "bpmProcess", execution.getProcessDefinitionId().substring(0, execution.getProcessDefinitionId().indexOf(":")));

		workingMemory.insert(result);
		workingMemory.insert(customer);

		workingMemory.fireAllRules();

		Map execMap = executionResultType.getAsMap(result);
		Integer executionResult = (Integer) execMap.get("resultCode");

		if (executionResult == 1) {
			String errorCode = (String) execMap.get("bpmErrorCode");
			if (Constants.RETRY_ERROR == errorCode) {
				String processWaitTime = (String) execMap.get("processWaitTime");
				execution.setVariable(Constants.processWaitTime, processWaitTime);
			}
			throwBpmError(execution, errorCode, Constants.WARNING, (String) execMap.get("resultText"));
		}

		Double invoiceAmount = invoiceRepository.getCustomerUnpaidTotalInvoiceAmount(customerId);

		if (customer.getCustomerGroup() != null) {
			Long maxInvoiceLimit = Long.parseLong(dunningProperties.getProperty(Constants.MAX_ADSL_SUSPENSION_INVOICE_LIMIT));
			if (Constants.KURUMSAL.equalsIgnoreCase(customer.getCustomerType().getTypeName())) {
				maxInvoiceLimit = Long.parseLong(dunningProperties.getProperty(Constants.MAX_SES_SUSPENSION_INVOICE_LIMIT));
			}
			if (invoiceAmount == null || invoiceAmount < maxInvoiceLimit)
				throwBpmError(execution, Constants.NOT_RETRY_ERROR, Constants.WARNING, Constants.SUSPENSION_POSTPONE_DESC);
		}

	}

}
