package org.milleni.dunning.datamodel.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.activiti.engine.delegate.DelegateExecution;
import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.milleni.dunning.datamodel.dao.CustomerRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.model.ProcessSteps;
import org.milleni.dunning.datamodel.util.Constants;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface DunningProcessService {
	
	public List<DunningProcessDetail> listCustomerDunningProcessDetails(Long dunningProcessId);
	public void logUserTaskVariablesActivitiStep(DelegateExecution execution, String taskLog);
	public void successProcessDetail(DelegateExecution execution);
	public void successProcessMaster(DelegateExecution execution);
	public void paidAndFinishedProcessMaster(DelegateExecution execution);
	public void failedProcessMaster(DelegateExecution execution);
	public DunningProcessMaster getDunningProcessMaster(DelegateExecution execution);
	public DunningProcessDetail createDunningProcessDetail(DunningProcessMaster dunningProcessMaster, ProcessSteps step);
	public DunningProcessDetail getCurrentProcessDetail(DelegateExecution execution);
	public void saveDunningProcessDetail(DunningProcessDetail detail) ;
	public void addDunningProcessDetailLogs(DunningProcessDetail detail , String key, String value);
	public void addDunningProcessDetailLogs(DunningProcessDetail detail , String key, String value,String logStep);
	public void setDunningProcessDetailStatus(DelegateExecution execution,String status) ;
	
	public void setDetailNotification(DelegateExecution execution);
	public void successLastProcessDetail(DelegateExecution execution,String status);
	public DunningProcessMaster initializeDunningProcessMaster(DelegateExecution execution) throws Exception ;
	public void saveDunningProcessMaster(DunningProcessMaster master);
	public void setDetailSkipped(DelegateExecution execution);
	public void manualyFinishedProcessMaster(DelegateExecution execution) ;
	public void errorProcessDetail(Long dpDetailId) ;
	public void setCustomerInYasalTakip(DelegateExecution execution);
	
	
	
}
