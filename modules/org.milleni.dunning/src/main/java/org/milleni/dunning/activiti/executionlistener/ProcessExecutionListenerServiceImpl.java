package org.milleni.dunning.activiti.executionlistener;

import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.annotation.Resource;

import org.activiti.engine.ActivitiException;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.identity.User;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.impl.context.Context;
import org.activiti.engine.impl.persistence.entity.IdentityLinkEntity;
import org.activiti.engine.impl.persistence.entity.TaskEntity;
import org.activiti.engine.task.IdentityLinkType;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.log4j.Logger;
import org.milleni.dunning.datamodel.util.Constants;

public class ProcessExecutionListenerServiceImpl implements ProcessExecutionListenerService{
	
	@Resource(name = "dunningPropertyPlaceholder")
	private Properties dunningProperties;
	
	protected static final Logger logger = Logger.getLogger(ProcessExecutionListenerServiceImpl.class);
	
	public void processEvent(DelegateExecution execution) {
		StringBuffer logString = new StringBuffer();
		logString.append( "PROCESS:"+execution.getEventName()+": eid:"+execution.getId()+"|pid:"+execution.getProcessInstanceId()+"|pn:"+execution.getProcessDefinitionId()+"|act:"+execution.getCurrentActivityId()+"|var:"); 
		Set<String> variableNames = execution.getVariableNames();
		for (String variableName : variableNames) {
			logString.append(variableName + " :" + execution.getVariable(variableName)+ " - ");
		}
		logger.info(logString);
	}
	
	
	public void serviceTaskEvent(DelegateExecution execution) {
		StringBuffer logString = new StringBuffer();
		logString.append( "SERVICE_TASK:"+execution.getEventName()+"|eid:"+execution.getId()+ "|pid:"+execution.getProcessInstanceId()+"|service:"+execution.getCurrentActivityId()+"|sname:"+execution.getCurrentActivityName()+"|pn:"+execution.getProcessDefinitionId()+"|var:"); 
		Set<String> variableNames = execution.getVariableNames();
		for (String variableName : variableNames) {
			logString.append(variableName + " :" + execution.getVariable(variableName)+ " - ");
		}
		logger.info(logString);
	}

	

	
	
	public void userTaskEvent(DelegateTask delegateTask) {
		StringBuffer logString = new StringBuffer();
		logString.append( "USER_TASK:"+ delegateTask.getEventName()+"|assignee:"+ delegateTask.getAssignee() +"|eid:"+delegateTask.getExecutionId()+"|pid:"+delegateTask.getProcessInstanceId()+"|taskId:"+delegateTask.getId()+"|taskName:"+delegateTask.getName()+"|pn:"+delegateTask.getProcessDefinitionId()+"|var:"); 
		Set<String> variableNames = delegateTask.getVariableNames();
		for (String variableName : variableNames) {
			logString.append(variableName + " :" + delegateTask.getVariable(variableName)+ " - ");
		}
		logger.info(logString);
		if(!"create".equalsIgnoreCase(delegateTask.getEventName()))
			return;
		TaskEntity task = (TaskEntity)delegateTask;
		String assignee = task.getAssignee();
		List<IdentityLinkEntity> identityLinks = task.getIdentityLinks();
 
		StringBuffer message = new StringBuffer("");
		message.append("Taskınız Var <br/><br/>");
		message.append("<a href=\""+dunningProperties.getProperty(Constants.LINK_WEBAPP)+"/#tasks/");
		message.append(task.getId());
		message.append("?category=inbox\">");
		message.append(task.getName());
		message.append("</a>");
 
		if(assignee != null && assignee.length() > 0) {
			User user = Context.getProcessEngineConfiguration().getIdentityService().createUserQuery().userId(assignee).singleResult();
			sendNotification(user, message.toString());
		}
 
		for(IdentityLinkEntity link : identityLinks) {
			if(link.getType().equals(IdentityLinkType.CANDIDATE)) {
				if(link.isUser()) {
					User user = Context.getProcessEngineConfiguration().getIdentityService().createUserQuery().userId(link.getUserId()).singleResult();
					sendNotification(user, message.toString());
				}
				if(link.isGroup()) {
					List<User> users = Context.getProcessEngineConfiguration().getIdentityService().createUserQuery().memberOfGroup(link.getGroupId()).list();
					for(User user : users) {
						sendNotification(user, message.toString());
					}
				}
			}
		}
 
	}
 
	protected void sendNotification(User user, String message) {
		sendMail(user.getEmail(), "Goreviniz Var", message);
	}
	
	public void sendMail(String mail, String subject,String message){
		HtmlEmail email = new HtmlEmail();
		try {
			email.setHtmlMsg(message);
			email.addTo(mail); 
			email.setSubject(subject);
			//email.setFrom("noreply@deltafaucet.com");
 
			setMailServerProperties(email);
 
			email.send();
		} catch (Exception e) {
			logger.error("Email gonderilemedi",e);
		}
	}
 
	protected void setMailServerProperties(Email email) throws Exception{
	    ProcessEngineConfigurationImpl processEngineConfiguration = Context.getProcessEngineConfiguration();

	    String host = processEngineConfiguration.getMailServerHost();
	    if (host == null) {
	      throw new ActivitiException("Could not send email: no SMTP host is configured");
	    }
	    email.setHostName(host);

	    int port = processEngineConfiguration.getMailServerPort();
	    email.setSmtpPort(port);
	    email.setFrom(processEngineConfiguration.getMailServerDefaultFrom());
	    email.setSSL(processEngineConfiguration.getMailServerUseSSL());
	    email.setTLS(processEngineConfiguration.getMailServerUseTLS());

	    String user = processEngineConfiguration.getMailServerUsername();
	    String password = processEngineConfiguration.getMailServerPassword();
	    if (user != null && password != null) {
	      email.setAuthentication(user, password);
	    }
	}
	
	
	
}
