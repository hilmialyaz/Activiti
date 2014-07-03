package org.milleni.dunning.datamodel.dao;

import java.util.List;
import java.util.Set;

import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
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
public interface CustomerRepository extends BaseRepository<Customer, Long> , JpaSpecificationExecutor<Customer> {

	@Query("SELECT c FROM Customer c WHERE c.customerName =?1")
	Customer findByTheCustomerByName(String customerName);
	
	@Query("SELECT c,gr FROM Customer c , CustomerGroup gr  WHERE c.customerId =?1 and c.customerGroup=gr")
	Object[] findByTheCustomerById(Long  customerId);
	
	
	
	
	@Transactional(readOnly = true)
	@Query(nativeQuery = true, value="SELECT * FROM CUSTOMER CU WHERE CU.CUSTOMER_ID in (?1) ")
	List<Customer> listCustomerByCustomerIdList(Set<Long> customerIds);
	
	 @Query(nativeQuery = true, value =
			 		"	SELECT * 	"+
					 "	    FROM (	"+
					 "	        SELECT distinct CU.* 	"+
					 "	            FROM CUSTOMER_INVOICES CI,	"+
					 "	                CUSTOMER CU	"+
					 "	            WHERE CU.CUSTOMER_ID = CI.CUSTOMER_ID	"+
					 "	                AND CI.PAYMENT_STATUS = 'N'	"+
					 "	                AND CU.STATUS = 'a'    	"+
					 "	                AND CI.INVOICE_DUE_DATE +12 < TRUNC(SYSDATE)	"+
					 "	                 AND NOT EXISTS (	"+
					 "	                 select    1  from  ACT_RU_EXECUTION RES , ACT_RU_VARIABLE A0 ,ACT_RE_PROCDEF P	"+
					 "	                    WHERE	"+
					 "	                        RES.ID_ = A0.EXECUTION_ID_	"+
					 "	                        and RES.PROC_DEF_ID_ = P.ID_	"+
					 "	                        and RES.PARENT_ID_ is null                                                                                                                                          	"+
					 "	                        and A0.NAME_= 'customerId'                                      	"+
					 "	                        and A0.TYPE_ = 'long'	"+
					 "	                        and A0.LONG_ = CU.CUSTOMER_ID	"+
					 "	                 ) ORDER BY CU.CUSTOMER_ID	"+
					 "	        ) WHERE ROWNUM < 5	", 
			 name = "findTaskHistorysByPositionIdEqualsMostCurrent")
			 @Transactional(readOnly = true)
			 List<Customer> collectOverdueCustomers();

			 
}
