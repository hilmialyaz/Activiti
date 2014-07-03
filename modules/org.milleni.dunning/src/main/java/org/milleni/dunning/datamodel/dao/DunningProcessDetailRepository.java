package org.milleni.dunning.datamodel.dao;

import java.util.Date;
import java.util.List;

import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessDetailLogs;
import org.milleni.dunning.datamodel.model.DunningProcessDetailStatus;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.model.DunningProcessMasterStatus;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Repository interface for {@link User} instances. Provides basic CRUD operations due to the extension of
 * {@link JpaRepository}. Includes custom implemented functionality by extending {@link UserRepositoryCustom}.
 * 
 * @author Oliver Gierke
 */
public interface DunningProcessDetailRepository extends BaseRepository<DunningProcessDetail, Long>{

	  @Query("select dpd from DunningProcessDetail dpd, DunningProcessMaster dpm where dpd.processId=dpm and dpm.processId=?1 order by dpd.createDate desc")
	  List<DunningProcessDetail> findDunningProcessDetails(Long processId);
	  
	  
	  @Query("select dpd from DunningProcessDetail dpd, DunningProcessMaster dpm where dpd.processId=dpm and dpm.processId=?1 order by dpd.processDetailId desc")
	  List<DunningProcessDetail> findLastDunningProcessDetail(Long processId, Pageable page);
	  
	  @Query("select dpd from DunningProcessDetail dpd where dpd.status=?1 order by dpd.createDate")
	  List<DunningProcessDetail> findDunningProcessDetailByStatus(String status);
	  
	  
	  //running olup stepi N (notifikasyon ) olanlari getirir
	  //@Query("select dpd , dpm , cust from DunningProcessDetail dpd , DunningProcessMaster dpm, ProcessSteps ps, Customer cust  where dpd.processId=dpm and dpm.status='R' and dpm.customerId=cust and dpd.status='N' and ps=dpd.processStepId and ps.stepName like %?1% and rownum<?2 order by dpd.createDate")
	  @Query("select dpd , dpm , cust from DunningProcessDetail dpd , DunningProcessMaster dpm, ProcessSteps ps, Customer cust  where dpd.processId=dpm and dpm.status='R' and dpm.customerId=cust and (dpd.status='N' or (dpd.status='R' and DATEDIFF(MINUTE,dpd.statusDate,GETDATE())>120 )) and ps=dpd.processStepId and ps.stepName like %?1%  order by dpd.currentDebit desc")
	  List<Object[]> findNotificationStateDunningProcessDetail(String stepName,Pageable page);
	  
	  @Query("select dpd , dpm , cust from DunningProcessDetail dpd , DunningProcessMaster dpm, ProcessSteps ps, Customer cust  where dpd.processId=dpm and dpm.status='R' and dpm.customerId=cust and (dpd.status='N' or (dpd.status='R' and DATEDIFF(MINUTE,dpd.statusDate,GETDATE())>120 )) and ps=dpd.processStepId and ps.stepName in (?1)  order by dpd.currentDebit desc")
	  List<Object[]> findNotificationStateDunningProcessDetail(List<String> stepNameList,Pageable page);
	  
	  
	  @Cacheable("constants.cache")
	  @Query("select dpds from DunningProcessDetailStatus dpds  where dpds.id=?1")
	  DunningProcessDetailStatus getDunningProcessDetailStatus(String id);
	  
	  
	  @Query("select dpl from DunningProcessDetailLogs dpl where  dpl.processDetailId=?1 ")
	  List<DunningProcessDetailLogs> getDunningProcessDetailLog(DunningProcessDetail dpd);
	  
	  @Transactional(propagation = Propagation.REQUIRES_NEW)
	  @Modifying
	  @Query("update DunningProcessDetail dpd set dpd.status='R', dpd.statusDate=?2 where dpd.processDetailId in (?1)")
	  int updateDetailNotificationToRunning(List<Long> detail ,Date now);
	  

}
