package org.milleni.dunning.datamodel.dao;

import java.util.Date;
import java.util.List;

import org.milleni.dunning.datamodel.model.DunningPolicy;
import org.milleni.dunning.datamodel.model.DunningPolicySteps;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessDetailStatus;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.model.DunningProcessMasterStatus;
import org.milleni.dunning.datamodel.model.ProcessSteps;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Pageable;
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

public interface DunningPolicyRepository extends BaseRepository<DunningPolicy, Long> {
	
	  @Override
	  @Cacheable("constants.cache")
	  public Iterable<DunningPolicy> findAll();
	
	  @Cacheable("constants.cache")
	  @Query("select x from DunningPolicy x where x.policyId = (SELECT max(d.policyId) FROM DunningPolicy d WHERE d.policyName = ?1 and d.validFrom<=?2 and (validTo is null or validTo>?2))")
	  DunningPolicy findDunningPolicyByName(String  policyName,Date now);
	  
	 
	
	  
	  @Query("SELECT dps  FROM DunningProcessMaster dpm, DunningPolicy dpo , DunningPolicySteps dps	where  dps.dunningPolicyStepsPK.policyId = dpm.dunningPolicyId    and dps.dunningPolicyStepsPK.policyId=dpo.policyId    and dpm.processId=?1 and dps.seqNum>?2  order by dps.seqNum")
	  List<DunningPolicySteps> findDunningPolicySteps(Long dunningProcessMasterId,int seqNum,Pageable page);
	  
	  
	  @Query("SELECT dps  FROM DunningProcessMaster dpm, DunningPolicySteps dps, ProcessSteps ps	where  dps.dunningPolicyStepsPK.policyId = dpm.dunningPolicyId    and dpm.processId=?1 and ps.stepId=dpm.lastStepId and ps.stepId = dps.dunningPolicyStepsPK.stepId  order by dps.seqNum")
	  DunningPolicySteps findCurrentDunningPolicyStep(Long dunningProcessMasterId);
	  
	  
	  @Query("SELECT dps  FROM DunningProcessMaster dpm, DunningPolicySteps dps, ProcessSteps ps	where  dps.dunningPolicyStepsPK.policyId = dpm.dunningPolicyId    and dpm.processId=?1 and  ps.stepId = dps.dunningPolicyStepsPK.stepId and ps.stepName=?2 order by dps.seqNum")
	  List<DunningPolicySteps> findCurrentDunningPolicyWithName(Long dunningProcessMasterId,String stepName,Pageable page);
	  
	  
	  
	  @Query("SELECT dps FROM  DunningPolicySteps dps, DunningPolicy dpo,ProcessSteps ps ,DunningProcessMaster dpm 	where dpm.nextStepId=ps.stepId and dpm.dunningPolicyId=dpo.policyId and  dps.dunningPolicyStepsPK.policyId=dpo.policyId and  ps.stepId = dps.dunningPolicyStepsPK.stepId and dpm=?1")
	  DunningPolicySteps retrieveNextDunningPolicyStep(DunningProcessMaster dpm);
	  
	  
	  @Query("SELECT dpsx FROM  DunningPolicySteps dps , DunningPolicySteps dpsx , DunningPolicy dpo,ProcessSteps ps ,DunningProcessMaster dpm 	where dpm.currentStepId=ps.stepId and dpm.dunningPolicyId=dpo.policyId and  dps.dunningPolicyStepsPK.policyId=dpo.policyId and  ps.stepId = dps.dunningPolicyStepsPK.stepId and dpm=?1 and dpsx.seqNum>dps.seqNum and	dps.dunningPolicyStepsPK.policyId=dpsx.dunningPolicyStepsPK.policyId order by dpsx.seqNum")
	  List<DunningPolicySteps> retrieveNextDunningPolicyStepFromCurrentStep(DunningProcessMaster dpm);
	  
	  @Query("SELECT  ps  FROM  DunningPolicySteps dps, DunningPolicy dpo,ProcessSteps ps 	where dps.dunningPolicyStepsPK.policyId=dpo.policyId and  ps.stepId = dps.dunningPolicyStepsPK.stepId and dpo.policyId=?1 and dps.seqNum=?2 ")
	  ProcessSteps retrieveNextSeqnumDunningPolicyStep(Long dunningPolicyId,int seqNum);
	  
	  @Cacheable("constants.cache")
	  @Query("SELECT dps , ps  FROM  DunningPolicySteps dps, DunningPolicy dpo,ProcessSteps ps 	where dps.dunningPolicyStepsPK.policyId=dpo.policyId and  ps.stepId = dps.dunningPolicyStepsPK.stepId and dpo.policyId=?1  order by dps.seqNum")
	  List<Object[]> retrieveDunningPolicySteps(Long dunningPolicyId);
	  
	  @Cacheable("constants.cache")
	  @Query("SELECT ps  FROM  DunningPolicySteps dps, ProcessSteps ps, DunningPolicy dpo	where  dps.dunningPolicyStepsPK.policyId = dpo.policyId and dpo.policyId=?1  and  ps.stepId = dps.dunningPolicyStepsPK.stepId order by dps.seqNum")
	  List<ProcessSteps> retrieveDunningProcessSteps(Long dunningPolicyId);
	  
	  
	  @Query("SELECT ps  FROM  DunningPolicySteps dps, ProcessSteps ps, DunningPolicy dpo	where  dps.dunningPolicyStepsPK.policyId = dpo.policyId and dpo.policyId=?1  and  ps.stepId = dps.dunningPolicyStepsPK.stepId and ps.stepText like %?2%")
	  ProcessSteps retrieveDunningProcessStepByDesc(Long dunningPolicyId,String stepDesc);
	  
	  @Cacheable("constants.cache")
	  @Query("SELECT dpms  FROM  DunningProcessMasterStatus dpms")
	  List<DunningProcessMasterStatus> retrieveAllDunningProcessMasterStatus();
	  
	  @Cacheable("constants.cache")
	  @Query("SELECT dpds  FROM  DunningProcessDetailStatus dpds")
	  List<DunningProcessDetailStatus> retrieveAllDunningProcessDetailStatus();
	  
	  
	  
//	  @Query("select dunning_migration.dbo.DunningDayOfStep(?1)")
//	  int getStepSotPlusExecutionDayCount(String stepName);
	  
	  

	  
	  
}
