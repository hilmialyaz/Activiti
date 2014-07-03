package org.milleni.dunning.process.test;

import java.util.Date;
import java.util.HashMap;
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
@ContextConfiguration("classpath:dunning_test.xml")
public class FL101ActivitiTest extends SpringActivitiTestCase {
	
	@Autowired
	CustomerRepository customerRep;
	
	@Autowired
	CustomerInvoicesRepository invoiceRepository;
	
	@Autowired
	DunningProcessMasterRepository dunninProcessMasterRep;
	

	@Autowired
	DunningProcessDetailRepository dunninProcessDetailRep;
	
	@Autowired
	ProcessStepsRepository processStepRep;
	

	public void setDunninProcessDetailRep(DunningProcessDetailRepository dunninProcessDetailRep) {
		this.dunninProcessDetailRep = dunninProcessDetailRep;
	}

	public void setProcessStepRep(ProcessStepsRepository processStepRep) {
		this.processStepRep = processStepRep;
	}

	public void setCustomerService(CustomerRepository customerRep) {
		this.customerRep = customerRep;
	}

	@Deployment(resources = { "FL101_VipCustomerDunningProcess.bpmn20.xml" ,"rejectionRules.drl"})
	public void testFL101() {
		Customer cust= new Customer();
		cust.setCustomerId(123l);
		cust.setCustomerName("test  test");
		cust.setStatus("a");
		cust.setCreateDate(new Date());
		cust.setCreateUser("test test");
		cust.setActivationDate(new Date());
		customerRep.save(cust);
		
		CustomerInvoices inv= new CustomerInvoices();
		inv.setCustomerId(cust);
		inv.setInvoiceId(1l);
		inv.setInvoiceAmount(3d);
		inv.setInvoiceDate(new Date());
		inv.setInvoiceDueDate(new Date());
		inv.setPaymentStatus(Constants.UNPAID);
		invoiceRepository.save(inv);
		
		
		CustomerInvoices inv2= new CustomerInvoices();
		inv2.setCustomerId(cust);
		inv2.setInvoiceId(2l);
		inv2.setInvoiceAmount(6d);
		inv2.setInvoiceDate(new Date());
		inv2.setInvoiceDueDate(new Date());
		inv2.setPaymentStatus(Constants.UNPAID);
		invoiceRepository.save(inv2);
		
		ProcessSteps step1 = new ProcessSteps();
		step1.setStepId(1l);
		step1.setStepName(Constants.SMS_HATIRLATMA);
		processStepRep.save(step1);
		
		ProcessSteps step2 = new ProcessSteps();
		step2.setStepId(2l);
		step2.setStepName("COA");
		processStepRep.save(step2);
		
		ProcessSteps step3 = new ProcessSteps();
		step3.setStepId(3l);
		step3.setStepName("TASK");
		processStepRep.save(step3);
		
		
		
		
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("customerId",123l);

		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("FL101_VipCustomerDunningProcess", variables);
		
		waitForJobExecutorToProcessAllJobs(20000L, 20L);
		
		Iterable<DunningProcessDetail> details =  dunninProcessDetailRep.findAll();
		
		for (DunningProcessDetail dunningProcessDetail : details) {
			System.out.println(dunningProcessDetail);
		}
		
		System.out.println(processInstance);
		
		System.out.println(processInstance);
		
		
	}

	
	public void testCache(){
		System.out.println("test");
	}
}
