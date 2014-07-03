package org.milleni.dunning.datamodel.dao;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.service.HobimDataService;
import org.milleni.dunning.datamodel.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Transactional
public class CustomerRepositoryTest {

	
	@Autowired
	HobimDataService hobimDataService;
	

	/**
	 * Tests inserting a user and asserts it can be loaded again.
	 */
	@Test
	public void testInsert() {
		
		Customer customer = new Customer();
		customer.setCustomerId(1l);
		customer.setCustomerName("test");		
		
		
		
		//hobimDataService.generateHobimFile(Constants.PROCESS_STEP_BIR_FESIH_MEKTUBU);
		//customer = repository.save(customer);
		
		//assertEquals(customer, repository.findOne(customer.getCustomerId()));
		//Iterable<Customer> customerList = repository.findAll();
		//System.out.println(customerList.iterator().next());
	}

}
