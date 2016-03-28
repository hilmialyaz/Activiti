package org.milleni.dunning.ws.proxy;

import java.util.List;

import org.activiti.engine.delegate.BpmnError;
import org.activiti.engine.delegate.DelegateExecution;
import org.milleni.dunning.datamodel.dao.CustomerRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.model.ProcessSteps;
import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.ws.client.callcenter.CallType;
import org.milleni.dunning.ws.client.customerstatus.STATUS;
import org.milleni.dunning.ws.client.customerstatus.TTSTATUS;

public interface BpmWsDelegateService {
	
	public void sendCoaAnnounce(DelegateExecution execution,int announceType);
	public void sendBireyselSmsHatirlatma(DelegateExecution execution);
	public void sendHatirlatmaCoaAnnounce(DelegateExecution execution) ;
	public void sendIhtarCoaAnnounce(DelegateExecution execution) ;
	public void sendSuspendCoaAnnounce(DelegateExecution execution);
	
	public void sendBireyselSmsIhtar(DelegateExecution execution) ;
	public void sendIptalBildirimSms(DelegateExecution execution);
	
	public void suspendCustomer(DelegateExecution execution) ;
	public void deactivateCustomer(DelegateExecution execution);
	
	public void ttCrmFreezeCustomer(DelegateExecution execution); 
	public void ttCrmUnfreezeCustomer(DelegateExecution execution);
	public void ttCrmDeactivateCustomer(DelegateExecution execution);
	public void ttCrmOperations(DelegateExecution execution, TTSTATUS status);	 
	public void crmSuspendCustomer(DelegateExecution execution);
	public void crmDeactivateCustomer(DelegateExecution execution) throws Exception;
	public void sendMessage(Long customerId , DunningProcessDetail detail , String message);
	public void sendMessageWithStepName(DunningProcessDetail dpDetail);
	
	public void sendHatirlatmaCoaAnnounce(Long customerId , DunningProcessDetail detail); 
	public void sendIhtarCoaAnnounce(Long customerId , DunningProcessDetail detail);
	public void sendIhtarCoaAnnounce(Long customerId,Long detailId);
	
	public void voipSuspendCustomer(DelegateExecution execution) ;
	public void voipActivateCustomer(DelegateExecution execution) ;
	
	public void retrieveCustomerAggreement(DelegateExecution execution);
	public void retrieveCustomerTaksitCount(DelegateExecution execution);
	public void retrieveCustomerTicklerCount(DelegateExecution execution);
	
	
	public void signalProcessInNewTx(long customerId) ;
	;
	public void retrieveSapPaymentStatus(Long customerId) throws Exception;
	
	
	public void agentCallSuspensionBireysel(DelegateExecution execution);
	public void agentCallSuspensionKurumsal(DelegateExecution execution) ;
	public void agentCallAvukatBireysel(DelegateExecution execution) ;
	public void agentCallAvukatKurumsal(DelegateExecution execution) ;
	public void agentCallService(DelegateExecution execution,CallType callType) ;
	
	public void retrieveCustomerHasCdr(DelegateExecution execution) ;
	public void oloThkIptal(DelegateExecution execution);
	
	public void addTaskQuick(Long customerId,String sMessage);

	
	public void suspendCrmAccount(Long customerId , DunningProcessMaster dpm ,DunningProcessDetail detail); 
	public void activateCrmAccount(Long customerId , DunningProcessDetail detail); 
	public void deactivateCrmAccount(Long customerId) throws BpmnError; 
	
	public void sendOdemeBildirimSms(DelegateExecution execution);	
	public void sendOdemeGelmediSms(DelegateExecution execution);
	
	
	public org.milleni.dunning.ws.client.customerstatus.ContractServiceResponse wsTtCrmStatus(String processId, TTSTATUS status, Long customerId);
	public void freezeCustomer(Long customerId) throws Exception;
	public void unfreezeCustomer(Long customerId) throws Exception;
}
