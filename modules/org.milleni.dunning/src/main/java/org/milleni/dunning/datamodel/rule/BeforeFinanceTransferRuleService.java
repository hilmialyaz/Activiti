package org.milleni.dunning.datamodel.rule;

import java.util.List;

import org.activiti.engine.delegate.DelegateExecution;
import org.milleni.dunning.datamodel.dao.CustomerRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;

public interface BeforeFinanceTransferRuleService {
	public void executeRules(DelegateExecution execution)  throws Exception;
}
