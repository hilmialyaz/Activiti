package org.milleni.dunning.datamodel.rule;

import org.activiti.engine.delegate.DelegateExecution;

public interface BatchProcessOperationsRuleService {
	public void fireCustomerRules(DelegateExecution execution) throws Exception ;
}
