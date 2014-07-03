package org.milleni.dunning.datamodel.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.milleni.dunning.datamodel.model.ProcessSteps;
import org.milleni.dunning.datamodel.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Intergration test showing the basic usage of {@link SimpleUserRepository}.
 * 
 * @author Oliver Gierke
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:simple-repository-context.xml")
@Transactional
public class ProcessStepsRepositorySample {

	@Autowired
	ProcessStepsRepository repository;

	
	@Autowired
	BaseRepository baseRepository;
	
	
	
	ProcessSteps step;

	@Before
	public void setUp() {
	}

	/**
	 * Tests inserting a user and asserts it can be loaded again.
	 */
	@Test
	public void testInsert() {
		step = new ProcessSteps();
		step.setStepId(1l);
		step.setStepName(Constants.OVERDUE);		
		step = repository.save(step);
		
		step = new ProcessSteps();
		step.setStepId(2l);
		step.setStepName(Constants.SMS_HATIRLATMA);		
		step = repository.save(step);
		
		step = new ProcessSteps();
		step.setStepId(3l);
		step.setStepName(Constants.COA_HATIRLATMA);		
		step = repository.save(step);	
		
		
		
		
		
		
	}

}
