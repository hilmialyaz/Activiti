package org.milleni.dunning.process.test;

import java.util.Map;

import org.activiti.engine.delegate.BpmnError;
import org.drools.KnowledgeBase;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.definition.type.FactType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.util.Constants;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.activiti.engine.test.Deployment;
import org.activiti.spring.impl.test.SpringActivitiTestCase;
import org.milleni.dunning.datamodel.dao.CustomerInvoicesRepository;
import org.milleni.dunning.datamodel.dao.CustomerRepository;
import org.milleni.dunning.datamodel.dao.DunningProcessDetailRepository;
import org.milleni.dunning.datamodel.dao.DunningProcessMasterRepository;
import org.milleni.dunning.datamodel.dao.ProcessStepsRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerGroup;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.model.ProcessSteps;
import org.milleni.dunning.datamodel.service.CustomerService;
import org.milleni.dunning.datamodel.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * Test using spring-orm in spring-bean combined with JPA-variables in activiti.
 * 
 * @author Frederik Heremans
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class StartDunningDroolsTest extends SpringActivitiTestCase {

	@Autowired
	CustomerService customerService;

	@Autowired
	CustomerInvoicesRepository invoiceRepository;

	@Autowired
	DunningProcessMasterRepository dunninProcessMasterRep;

	@Autowired
	DunningProcessDetailRepository dunninProcessDetailRep;



	
	public void testRejectionRules() throws InstantiationException, IllegalAccessException{ 
		String drlFileName = "rules/startDunningDecisionRules.drl";
		
		Object[] obj = customerService.findByTheCustomerById(9439286l);
		
		Customer customer = (Customer)obj[0];
		
		KnowledgeBase knowledgeBase = getKnowledgeBuilder(drlFileName);
		StatefulKnowledgeSession workingMemory = knowledgeBase.newStatefulKnowledgeSession();
		
		FactType executionResultType = knowledgeBase.getFactType( "org.milleni.dunning.datamodel.startuprules", "ExecutionResult" );
		Object result = executionResultType.newInstance();
		executionResultType.set( result,"resultCode", 0 );
		executionResultType.set( result,"resultText", "" );
		
		CustomerGroup group = customerService.getCustomerGroup(customer.getCustomerGroup().getGroupId());
		workingMemory.insert(group);
		workingMemory.insert(customer);
		workingMemory.insert(result);
		workingMemory.fireAllRules();
		
		Map execMap = executionResultType.getAsMap(result);
		Integer executionResult = (Integer) execMap.get("resultCode");
		
		
	}

	
	public KnowledgeBase getKnowledgeBuilder(String drlFileName){
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newClassPathResource(drlFileName, getClass()), ResourceType.DRL);
		if (kbuilder.hasErrors()) {
			throw new RuntimeException("Error in drools: " + kbuilder.getErrors().toString());
		}
		return kbuilder.newKnowledgeBase();
	}


	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	
	

}
