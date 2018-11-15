package org.milleni.dunning.datamodel.dao;

import java.util.List;

import javax.persistence.LockModeType;

import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Repository interface for {@link User} instances. Provides basic CRUD operations due to the extension of
 * {@link JpaRepository}. Includes custom implemented functionality by extending {@link UserRepositoryCustom}.
 * 
 * @author Oliver Gierke
 */
public interface CustomerInvoicesRepository extends BaseRepository<CustomerInvoices, Long>{

	  @Query("select inv from CustomerInvoices inv, Customer cus where inv.customerId=cus and cus.customerId=?1")
	  List<CustomerInvoices> findCustomersInvoices(Long customerId);
	  
	  /*// oracle
	  @Query("SELECT  NVL(sum(ci.invoiceAmount),0)  FROM CustomerInvoices ci , Customer cu where cu=ci.customerId and cu.customerId=?1 and ci.paymentStatus='N'")
	  Double getCustomerTotalInvoiceAmount(Long customerId);
	  
	  @Query("SELECT NVL(sum(ci.invoiceAmount),0)  FROM CustomerInvoices ci , Customer cu where cu=ci.customerId and cu.customerId=?1 and ci.paymentStatus='N' and ci.invoiceDueDate<trunc(sysdate)")
	  Double getCustomerUnpaidTotalInvoiceAmount(Long customerId);
	  */
	  
	  @Query("SELECT  isnull(ROUND(sum(ci.invoiceAmount), 2, 0),0)  FROM CustomerInvoices ci where ci.customerId.customerId=?1 and ci.paymentStatus='N'")
	  Double getCustomerTotalInvoiceAmount(Long customerId);
	  
	  //@Query("SELECT ISNULL(sum(ci.invoiceAmount),0)  FROM CustomerInvoices ci , Customer cu where cu=ci.customerId and cu.customerId=?1 and ci.paymentStatus='N' and ci.invoiceDueDate<trunc(sysdate)")
	  @Transactional(readOnly=true , timeout = 20)
	  @Query("SELECT  isnull(ROUND(sum(ci.invoiceAmount), 2, 0),0)  FROM CustomerInvoices ci where ci.customerId.customerId=?1 and ci.paymentStatus='N' and CONVERT(DATE,ci.invoiceDueDate)<CONVERT(DATE, GETDATE())")
	  Double getCustomerUnpaidTotalInvoiceAmount(Long customerId);

	  //@Query("SELECT ci  FROM CustomerInvoices ci  where ci.customerId=?1 and ci.paymentStatus='N' and CONVERT(DATE,ci.invoiceDueDate)<CONVERT(DATE, GETDATE()) order by ci.invoiceDate")	  
	  @Query("SELECT ci  FROM CustomerInvoices ci  where ci.customerId.customerId=?1 and ci.paymentStatus='N' and CONVERT(DATE,ci.invoiceDueDate)<CONVERT(DATE, GETDATE()) order by ci.invoiceDate")
	  List<CustomerInvoices> getCustomerUnpaidInvoices(Long customerId);
	  
	  //@Query("SELECT ci  FROM CustomerInvoices ci , Customer cu where cu=ci.customerId and cu.customerId=?1 and ci.paymentStatus='N' and ci.invoiceDueDate<trunc(sysdate) order by ci.invoiceDate")
	  @Query("SELECT ci  FROM CustomerInvoices ci  where ci.customerId.customerId=?1 and ci.paymentStatus='N' and CONVERT(DATE,ci.invoiceDueDate)<CONVERT(DATE, GETDATE()) order by ci.invoiceDate")
	  List<CustomerInvoices>  getCustomerUnpaidInvoices(Long customerId,Pageable page);
	  
}
