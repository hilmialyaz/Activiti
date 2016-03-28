package org.milleni.dunning.datamodel.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.model.DunningProcessMasterStatus;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * Repository interface for {@link User} instances. Provides basic CRUD operations due to the extension of
 * {@link JpaRepository}. Includes custom implemented functionality by extending {@link UserRepositoryCustom}.
 * 
 * @author Oliver Gierke
 */
public interface DunningProcessMasterRepository extends BaseRepository<DunningProcessMaster, Long>{

	  @Query("select dpm from DunningProcessMaster dpm where dpm.customerId.customerId=?1 order by dpm.createDate desc ")
	  List<DunningProcessMaster> findDunningProcessMasters(Long customerId);
	  
	  
	  @Query("select dpm from DunningProcessMaster dpm, Customer cus where dpm.customerId=cus and cus.customerId=?1 and dpm.status.id=?2")
	  List<DunningProcessMaster> findDunningProcessMastersByStatus(Long customerId,String status);
	  
	  @Cacheable(value="constants.cache")
	  @Query("select dpms from DunningProcessMasterStatus dpms  where dpms.id=?1")
	  DunningProcessMasterStatus getProcessStatus(String id);

	  
	  @Query("select dpm from DunningProcessMaster dpm, Customer cus where dpm=cus.dunningProcessMaster and cus.customerId=?1")
	  DunningProcessMaster getCustomerLastDunningProcessMaster(Long customerId);
	  
	  
	  @Transactional(readOnly = true)
	  @Query(nativeQuery = true, value="select distinct dpm.* from DUNNING_PROCESS_MASTER dpm , DUNNING_PROCESS_DETAIL dpd ,ACT_RU_JOB arj "+
			  "where dpm.PROCESS_ID=dpd.PROCESS_ID and dpm.STATUS='R' and dpm.DUNNING_POLICY_ID=?1 "+
			  "and  dpm.NEXT_STEP_ID=?2  and arj.PROCESS_INSTANCE_ID_= dpm.BPM_PROCESS_ID and dpm.NEXTSTEP_EXE_DATE>?3  and arj.DUEDATE_>?3 "+
			  "and dpm.NEXTSTEP_EXE_DATE<?4 and arj.DUEDATE_<?4  "+
			  "and  (arj.HANDLER_CFG_='boundarytimer1' or arj.HANDLER_CFG_='boundarytimerProcessWaitTask') ")
	  List<DunningProcessMaster> listNextStepDunningProcess(long dunningPolicyId , long stepId, Date nextStartDate, Date nextEndDate);
	  
	  
	  @Transactional(readOnly = true)
	  @Query(nativeQuery = true, value="select count(distinct dpm.CUSTOMER_ID) from DUNNING_PROCESS_MASTER dpm , DUNNING_PROCESS_DETAIL dpd ,ACT_RU_JOB arj "+
			  "where dpm.PROCESS_ID=dpd.PROCESS_ID and dpm.STATUS='R' and dpm.DUNNING_POLICY_ID=?1 "+
			  "and  dpm.NEXT_STEP_ID=?2  and arj.PROCESS_INSTANCE_ID_= dpm.BPM_PROCESS_ID and dpm.NEXTSTEP_EXE_DATE>?3 and arj.DUEDATE_>?3 "+
			  "and dpm.NEXTSTEP_EXE_DATE<?4  and arj.DUEDATE_<?4 "+
			  "and  (arj.HANDLER_CFG_='boundarytimer1' or arj.HANDLER_CFG_='boundarytimerProcessWaitTask') ")
	  int listNextStepDunningProcessCount(long dunningPolicyId , long stepId, Date nextStartDate, Date nextEndDate);
	  
	  
	  
	  @Transactional(readOnly = false)
	  @Query(nativeQuery = true, value="select CAST(va2.TEXT_  AS varchar) as customerId ,CAST(va1.TEXT_ AS varchar) as vardesc from ACT_RU_VARIABLE va1, ACT_RU_VARIABLE va2 where va1.NAME_='PROCESS_STATUS_DESC'"+
			  "and va1.PROC_INST_ID_= va2.PROC_INST_ID_  and va2.NAME_='customerId' and va1.PROC_INST_ID_ in ( "+
			  "SELECT [PROC_INST_ID_]  FROM [dunning_migration].[dbo].[ACT_RU_TASK] where [TASK_DEF_KEY_] ='taskYasalProblemli'  )"
	  )
	  List<Object[]> listTaskAndProcDefs();
	  
	 /*
	  @Transactional(readOnly = false)
	  @Query(nativeQuery = true, value ="EXEC updateDPMWithJob "+
		"@policyId = ?1, "+
		"@nextStepId = ?2, "+
		"@nextStartDate = ?3, "+
		"@nextEndDate = ?4, "+
		"@nextDueDate = ?5, "+
		"@nextExecStepId = ?6 "
      )
	  void updateDunningProcessSteps(long dunningPolicyId , long stepId, Date nextStartDate, Date nextEndDate, Date nextStepStartDate,long nextStepId );
	  */
	  
	  @Transactional(readOnly = false)
	  @Query(nativeQuery = true, value ="{ ?7= call updateDPMWithJob(?1,?2,?3,?4,?5,?6,?8) } "
      )
	  int  updateDunningProcessSteps(long dunningPolicyId , long stepId, Date nextStartDate, Date nextEndDate, Date nextStepStartDate,long nextStepId , int count,String userName);
	  
	  /*
	  @Transactional(readOnly = false)
	  @Query(nativeQuery = true, value ="EXEC updateDPMWithJob @policyId = 2, @nextStepId = 39, @nextStartDate = N'2014-07-15 16:52:32.513', @nextEndDate = N'2014-07-26 16:52:32.513', @nextDueDate = N'2014-07-19 16:52:32.513', @nextExecStepId = 39 "
      )
	  void updateDunningProcessSteps();
	  */
	  
}
