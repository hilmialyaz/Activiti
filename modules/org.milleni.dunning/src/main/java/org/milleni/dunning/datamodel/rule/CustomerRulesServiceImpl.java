package org.milleni.dunning.datamodel.rule;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;
import java.util.StringTokenizer;

import javax.annotation.Resource;

import org.activiti.engine.delegate.BpmnError;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.activiti.engine.impl.el.Expression;
import org.antlr.grammar.v3.ANTLRv3Parser.throwsSpec_return;
import org.drools.KnowledgeBase;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.definition.type.FactType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.milleni.dunning.datamodel.dao.CustomerInvoicesRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.service.CustomerService;
import org.milleni.dunning.datamodel.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "customerRuleService")
public class CustomerRulesServiceImpl extends AbstractRuleService implements CustomerRulesService {

	private HashMap<String, Object> factMap = new HashMap<String, Object>();
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	InvoicePaymentRuleService invoicePaymentRuleService;
	
	@Resource(name = "dunningPropertyPlaceholder")
	private Properties dunningProperties;
	

	public void fireCustomerRules(DelegateExecution execution) throws Exception {
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		Customer customer = customerService.findOne(customerId);
		if(customer==null)
			throwNotRetryError(execution,Constants.ERROR,Constants.CUSTOMER_ID_NOT_FOUND);
			
		KnowledgeBase knowledgeBase = readKnowledgeBase(Constants.RULES_VALIDATION);
		StatefulKnowledgeSession workingMemory = knowledgeBase.newStatefulKnowledgeSession();

		
		FactType executionResultType = knowledgeBase.getFactType( Constants.RULES_VALIDATION, "ExecutionResult" );
		Object result = executionResultType.newInstance();
		executionResultType.set( result,"resultCode", 0 );
		executionResultType.set( result,"resultText", "" );
		executionResultType.set( result,"bpmProcess", execution.getProcessDefinitionId().substring(0, execution.getProcessDefinitionId().indexOf(":")) );
		
		
		workingMemory.insert(result);
		workingMemory.insert(customer);
		workingMemory.fireAllRules();

		Map execMap = executionResultType.getAsMap(result);
		Integer executionResult = (Integer) execMap.get("resultCode");
		if(executionResult==1)
			throwNotRetryError(execution,Constants.WARNING,(String) execMap.get("resultText"));
		
		boolean customerHasUnpaidBill = invoicePaymentRuleService.customerHasUnpaidBillInLimit(customer.getCustomerId(),true);
		if(!customerHasUnpaidBill)
			throwNotRetryError(execution,Constants.WARNING,Constants.WARNING_NO_UNPAID_INVOICE);
	}

	
	@Transactional
	public void updateCustomerInfo(DelegateExecution execution) {
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		if(customerId!=null)
			customerService.updateCustomerInfoFromTecon(execution.getProcessInstanceId(),customerId,false);
		else
			throwNotRetryError(execution,Constants.ERROR,Constants.CUSTOMER_ID_NOT_FOUND);
	}

	
	@Transactional
	public void updateCustomerInfoWithDetails(DelegateExecution execution) {
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		if(customerId!=null)
			customerService.updateCustomerInfoFromTecon(execution.getProcessInstanceId(),customerId,true);
		else
			throwNotRetryError(execution,Constants.ERROR,Constants.CUSTOMER_ID_NOT_FOUND);
	}

}
