package org.milleni.dunning.datamodel.rule;

import org.activiti.engine.delegate.DelegateExecution;

public interface ProcessStepDecisionRulesService {

	public void fireStepDecisionRules(DelegateExecution execution) throws Exception;
}
