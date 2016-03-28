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
public class CustomerServicesTest extends SpringActivitiTestCase {

	@Autowired
	CustomerService customerService;

	@Autowired
	CustomerInvoicesRepository invoiceRepository;

	@Autowired
	DunningProcessMasterRepository dunninProcessMasterRep;

	@Autowired
	DunningProcessDetailRepository dunninProcessDetailRep;



	
	public void testCustomerType() throws InstantiationException, IllegalAccessException{ 
		
		Customer customer = customerService.findOne(9439286l);


		if (customer.getCustomerType() != null && customer.getCustomerType().getTypeName().equalsIgnoreCase(Constants.KURUMSAL)) {
			
			System.out.println("test");
		}
		
		
		
	}

	
	

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	
	

}
