package org.milleni.dunning.datamodel.service;

import java.util.List;

import org.activiti.engine.delegate.DelegateExecution;
import org.milleni.dunning.datamodel.dao.CustomerRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerGroup;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.CustomerType;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;

public interface ProcessSignalService {
	public void signalCustomerProcessIfPaymentReceived(Long customerId);
	public void signalProcess(DelegateExecution execution) ;
}
