package org.milleni.dunning.datamodel.dao;

import java.util.List;

import org.milleni.dunning.datamodel.model.DunningPolicy;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.model.ProcessSteps;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Simple repository interface for {@link User} instances. The interface is used
 * to declare so called query methods, methods to retrieve single entities or
 * collections of them.
 * 
 * @author Oliver Gierke
 */
public interface ProcessStepsRepository extends BaseRepository<ProcessSteps, Long> {
	  
	@Cacheable(value="constants.cache", key="{#root.methodName,#findByStepName}")
	  @Query("SELECT p FROM ProcessSteps p WHERE p.stepName =?1")
	  ProcessSteps findByStepName(String stepName);
}
