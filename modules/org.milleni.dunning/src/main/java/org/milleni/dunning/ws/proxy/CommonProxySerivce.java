package org.milleni.dunning.ws.proxy;

import org.milleni.dunning.ws.client.callcenter.ArrayOfInvoice;
import org.milleni.dunning.ws.client.callcenter.CallType;
import org.milleni.dunning.ws.client.coa.ServiceResponse;
import org.milleni.dunning.ws.client.crm.ActivateAccountResponseModel;
import org.milleni.dunning.ws.client.crm.CustomerInfoServiceV1ActivateAccountBusinessFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.crm.CustomerInfoServiceV1ActivateAccountSystemFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.crm.CustomerInfoServiceV1DeactivateAccountBusinessFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.crm.CustomerInfoServiceV1DeactivateAccountSystemFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.crm.CustomerInfoServiceV1SuspendAccountBusinessFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.crm.CustomerInfoServiceV1SuspendAccountSystemFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.crm.DeactivateAccountResponseModel;
import org.milleni.dunning.ws.client.crm.SuspendAccountResponseModel;
import org.milleni.dunning.ws.client.crmaccountcoa.AddProcessResponseModel;
import org.milleni.dunning.ws.client.crmcontact.SmsCode;
import org.milleni.dunning.ws.client.customerservice.TeconCustomerInfoResponse;
import org.milleni.dunning.ws.client.customerstatus.STATUS;
import org.milleni.dunning.ws.client.customerstatus.STATUSREASON;
import org.milleni.dunning.ws.client.freezexdsl.DunningFreezeCustomerXDSLResponse;
import org.milleni.dunning.ws.client.freezexdsl.DunningUnfreezeCustomerXDSLResponse;
import org.milleni.dunning.ws.client.freezexdsl.IFreezeDunningServiceDunningFreezeXDSLBusinessFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.freezexdsl.IFreezeDunningServiceDunningFreezeXDSLSystemFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.freezexdsl.IFreezeDunningServiceDunningUnfreezeXDSLBusinessFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.freezexdsl.IFreezeDunningServiceDunningUnfreezeXDSLSystemFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.milinternal.FaturaDetayi;
import org.milleni.dunning.ws.client.tahsilat.ArrayOfAcikKalem;

public interface CommonProxySerivce {
	public ServiceResponse sendCoaAnnounce(Long customerId, int announceType);
	public FaturaDetayi retrievePaymentInfo(Long customerId);
	public String sendSms(Long customerId,String debit , String smsCode);
	public ArrayOfAcikKalem retrieveAcikkalemPaymentInfo(Long customerId);
	public String addQuickTickler(Long customerId,String sNeden,String sTalepKonusu,String sAltDurum,String sStatus,String sMessage);
	public int getTicklerCount(Long customerId) ;
	
	public TeconCustomerInfoResponse retrieveExternalCustomerInfo(String guid,Long customerId,boolean contractDetail); 
	public TeconCustomerInfoResponse retrieveExternalCustomerStatus(String guid,Long customerId) ;
	public int retrieveCustomerTaksitCount(String guid,Long customerId) ;
	public int retrieveCustomerAgreementDocumentCount(String guid,Long customerId);
	public org.milleni.dunning.ws.client.customerstatus.ServiceResponse changeCustomerStatus(String guid,Long customerId,STATUS status, STATUSREASON reason) ;
	public DunningFreezeCustomerXDSLResponse freezeCustomer(Long customerId) throws IFreezeDunningServiceDunningFreezeXDSLBusinessFaultFaultFaultMessage, IFreezeDunningServiceDunningFreezeXDSLSystemFaultFaultFaultMessage ;
	public DunningUnfreezeCustomerXDSLResponse unfreezeCustomer(Long customerId) throws IFreezeDunningServiceDunningUnfreezeXDSLBusinessFaultFaultFaultMessage, IFreezeDunningServiceDunningUnfreezeXDSLSystemFaultFaultFaultMessage ;
	public org.milleni.dunning.ws.client.customerstatus.ContractServiceResponse changeCrmCustomerStatus(String guid,Long customerId,STATUS status, int reason);
	public org.milleni.dunning.ws.client.customerstatus.ServiceResponse changeVoipCustomerStatus(String guid,Long customerId,STATUS status);
	public org.milleni.dunning.ws.client.callcenter.ServiceResponse informCallCenter(String guid,CallType callType, Long customerId,ArrayOfInvoice invoiceList) ;
	public org.milleni.dunning.ws.client.customerstatus.ServiceResponse oloThkIptal(String guid,Long customerId);
	
	public boolean retrieveCustomerHasCdr(String guid,Long customerId);
	
	public SuspendAccountResponseModel suspendCrmAccount(Long customerId) throws CustomerInfoServiceV1SuspendAccountBusinessFaultFaultFaultMessage, CustomerInfoServiceV1SuspendAccountSystemFaultFaultFaultMessage ;
	public DeactivateAccountResponseModel deactivateCrmAccount(Long customerId) throws CustomerInfoServiceV1DeactivateAccountBusinessFaultFaultFaultMessage, CustomerInfoServiceV1DeactivateAccountSystemFaultFaultFaultMessage ;
	public AddProcessResponseModel addDeactivationRequest(Long customerId,String reason) throws Exception;
	public ActivateAccountResponseModel activateCrmAccount(Long customerId) throws CustomerInfoServiceV1ActivateAccountBusinessFaultFaultFaultMessage, CustomerInfoServiceV1ActivateAccountSystemFaultFaultFaultMessage ;
	public ServiceResponse createTickler(Long customerId, String customerName,boolean isIndividual, String sMessage) ;
}
