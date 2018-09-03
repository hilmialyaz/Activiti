package org.milleni.dunning.datamodel.rule;

import java.util.List;

import org.activiti.engine.delegate.DelegateExecution;
import org.milleni.dunning.datamodel.dao.CustomerRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;

public interface InvoicePaymentRuleService {
	public void checkInvoicePaymentStatus(DelegateExecution execution)  throws Exception;
	public void checkSapPaymentStatus(DelegateExecution execution) throws Exception ;
	public boolean customerHasUnpaidBillInLimit(Long customerId,boolean checkSap) throws Exception;
	
	public boolean customerHasUnpaidBillInLimitNewTx(Long customerId,boolean checkSap) throws Exception;
	
	public CustomerInvoices getCustomersFirstUnpaidInvoice(Long customerId);
	public Double getCustomerUnpaidTotalInvoiceAmountBeforeSot(Long customerId);
	public void checkInvoicePaymentStatusWithCustomerId(Long customerId ) throws Exception;
}
