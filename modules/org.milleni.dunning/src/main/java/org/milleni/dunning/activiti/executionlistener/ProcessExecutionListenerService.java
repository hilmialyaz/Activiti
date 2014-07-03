package org.milleni.dunning.activiti.executionlistener;

import java.util.Set;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.DelegateTask;

public interface ProcessExecutionListenerService {
	public void processEvent(DelegateExecution execution);
	public void serviceTaskEvent(DelegateExecution execution) ;
	public void userTaskEvent(DelegateTask task) ;
	public void sendMail(String mail, String subject,String message);
}
