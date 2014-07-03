package org.milleni.dunning.datamodel.rule;

import org.activiti.engine.delegate.DelegateExecution;

public interface CustomerRulesService {

	public void fireCustomerRules(DelegateExecution execution) throws Exception;
	public void updateCustomerInfo(DelegateExecution execution);
	public void updateCustomerInfoWithDetails(DelegateExecution execution);
	
}
