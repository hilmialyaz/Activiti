package org.milleni.dunning.datamodel.dao;

import java.util.List;

import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.model.DunningProcessMasterStatus;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

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
}
