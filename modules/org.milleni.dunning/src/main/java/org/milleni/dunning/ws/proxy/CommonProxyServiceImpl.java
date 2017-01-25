package org.milleni.dunning.ws.proxy;

import java.math.BigDecimal;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.TimeZone;

import javax.annotation.Resource;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;

import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.ws.client.callcenter.ArrayOfInvoice;
import org.milleni.dunning.ws.client.callcenter.CallCenterNotificationOperationsSoap;
import org.milleni.dunning.ws.client.callcenter.CallType;
import org.milleni.dunning.ws.client.coa.COASoap;
import org.milleni.dunning.ws.client.coa.ServiceResponse;
import org.milleni.dunning.ws.client.crm.ActivateAccountRequestModel;
import org.milleni.dunning.ws.client.crm.ActivateAccountResponseModel;
import org.milleni.dunning.ws.client.crm.CustomerInfoServiceV1;
import org.milleni.dunning.ws.client.crm.CustomerInfoServiceV1ActivateAccountBusinessFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.crm.CustomerInfoServiceV1ActivateAccountSystemFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.crm.CustomerInfoServiceV1DeactivateAccountBusinessFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.crm.CustomerInfoServiceV1DeactivateAccountSystemFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.crm.CustomerInfoServiceV1SuspendAccountBusinessFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.crm.CustomerInfoServiceV1SuspendAccountSystemFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.crm.DeactivateAccountRequestModel;
import org.milleni.dunning.ws.client.crm.DeactivateAccountResponseModel;
import org.milleni.dunning.ws.client.crm.SuspendAccountRequestModel;
import org.milleni.dunning.ws.client.crm.SuspendAccountResponseModel;
import org.milleni.dunning.ws.client.crmaccountcoa.AccountServiceV1;
import org.milleni.dunning.ws.client.crmaccountcoa.AccountServiceV1SendIhtarAnnounceByBillingCustomerIdBusinessFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.crmaccountcoa.AddDeactivationRequest;
import org.milleni.dunning.ws.client.crmaccountcoa.AddDeactivationRequestResponse;
import org.milleni.dunning.ws.client.crmaccountcoa.AddDeactivationRequestResponseModel;
import org.milleni.dunning.ws.client.crmaccountcoa.AddDeactivationRequestToAccountRequestModel;
import org.milleni.dunning.ws.client.crmaccountcoa.SendAnnounceByBillingCustomerNoRequestModel;
import org.milleni.dunning.ws.client.crmcontact.ContactServiceV1;
import org.milleni.dunning.ws.client.crmcontact.SendDunningSmsRequestModel;
import org.milleni.dunning.ws.client.crmcontact.SendSmsByBillingCustomerNo;
import org.milleni.dunning.ws.client.crmcontact.SendSmsByBillingCustomerNoRequestModel;
import org.milleni.dunning.ws.client.crmcontact.SmsCode;
import org.milleni.dunning.ws.client.customerservice.CustomerInfoServiceSoap;
import org.milleni.dunning.ws.client.customerservice.TeconCustomerInfoResponse;
import org.milleni.dunning.ws.client.customerstatus.CustomerStatusOperationsSoap;
import org.milleni.dunning.ws.client.customerstatus.STATUS;
import org.milleni.dunning.ws.client.customerstatus.STATUSREASON;
import org.milleni.dunning.ws.client.freezexdsl.DunningFreezeCustomerXDSLRequest;
import org.milleni.dunning.ws.client.freezexdsl.DunningFreezeCustomerXDSLResponse;
import org.milleni.dunning.ws.client.freezexdsl.DunningUnfreezeCustomerXDSLRequest;
import org.milleni.dunning.ws.client.freezexdsl.DunningUnfreezeCustomerXDSLResponse;
import org.milleni.dunning.ws.client.freezexdsl.FreezeDunningService;
import org.milleni.dunning.ws.client.freezexdsl.IFreezeDunningService;
import org.milleni.dunning.ws.client.freezexdsl.IFreezeDunningServiceDunningFreezeXDSLBusinessFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.freezexdsl.IFreezeDunningServiceDunningFreezeXDSLSystemFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.freezexdsl.IFreezeDunningServiceDunningUnfreezeXDSLBusinessFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.freezexdsl.IFreezeDunningServiceDunningUnfreezeXDSLSystemFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.milinternal.FaturaDetayi;
import org.milleni.dunning.ws.client.milinternal.MillenicomInternalSoap;
import org.milleni.dunning.ws.client.milldesk.MilldeskSoap;
import org.milleni.dunning.ws.client.notif.ArrayOfstring;
import org.milleni.dunning.ws.client.notif.INotificationServiceV1;
import org.milleni.dunning.ws.client.notif.INotificationServiceV1SendImediateSmsToCustomerBusinessFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.notif.INotificationServiceV1SendImediateSmsToCustomerSystemFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.notif.SendImediateSmsToCustomerRequestModel;
import org.milleni.dunning.ws.client.notif.SendSmsRequestModel;
import org.milleni.dunning.ws.client.notif.SmsSenderApplication;
import org.milleni.dunning.ws.client.sms.SmsgwSoap;
import org.milleni.dunning.ws.client.tahsilat.ArrayOfAcikKalem;
import org.milleni.dunning.ws.client.tahsilat.MilleniComOnlineTahsilatSoap;
import org.milleni.dunning.ws.client.tts.ApproveNotificationEnum;
import org.milleni.dunning.ws.client.tts.CreateTicklerRequestModel;
import org.milleni.dunning.ws.client.tts.ITTSServiceV1;
import org.milleni.dunning.ws.client.tts.RequestChannelEnum;
import org.milleni.dunning.ws.client.tts.RequestData;
import org.milleni.dunning.ws.client.tts.RequestFeedBackEnum;
import org.milleni.dunning.ws.client.tts.RequestPriorityEnum;
import org.milleni.dunning.ws.client.tts.TTSServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "commonProxyService")
public class CommonProxyServiceImpl implements CommonProxySerivce {

	@Autowired
	COASoap coaService;

	@Autowired
	MillenicomInternalSoap milInternalService;

	@Autowired
	MilleniComOnlineTahsilatSoap onlineTahsilatService;

	@Autowired
	CustomerInfoServiceSoap customerInfoService;

	@Autowired
	CustomerStatusOperationsSoap customerStatusOperations;

	@Autowired
	SmsgwSoap smsGatewayService;

	@Autowired
	MilldeskSoap milldeskService;

	@Autowired
	CallCenterNotificationOperationsSoap callCenterInformService;

	@Autowired
	CustomerInfoServiceV1 crmCustomerService;

	@Autowired
	ContactServiceV1 crmContactService;

	@Autowired
	AccountServiceV1 crmAccountService;

	@Autowired
	IFreezeDunningService freezeService;

	@Autowired
	INotificationServiceV1 notificationService;
	
	@Autowired
	ITTSServiceV1 ttsService;

	@Resource(name = "dunningPropertyPlaceholder")
	private Properties dunningProperties;

	public ServiceResponse sendCoaAnnounce(Long customerId, int announceType) {
		((BindingProvider) crmAccountService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_COA_ENDPOINT));
		ServiceResponse response = new ServiceResponse();
		response.setResultCode(0);
		try {
			SendAnnounceByBillingCustomerNoRequestModel request = new SendAnnounceByBillingCustomerNoRequestModel();
			org.milleni.dunning.ws.client.crmaccountcoa.ObjectFactory fact = new org.milleni.dunning.ws.client.crmaccountcoa.ObjectFactory();
			request.setBillingCustomerNo(fact.createSendAnnounceByBillingCustomerNoRequestModelBillingCustomerNo(customerId.toString()));
			crmAccountService.sendIhtarAnnounceByBillingCustomerId(request);
			return new ServiceResponse();
		} catch (Exception ex) {
			response.setResultCode(-1);
			response.setResultDescription(ex.getMessage());
		}
		return response;
	}

	public ArrayOfAcikKalem retrieveAcikkalemPaymentInfo(Long customerId) {
		((BindingProvider) onlineTahsilatService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_ONLINETAHSILAT_ENDPOINT));
		org.milleni.dunning.ws.client.tahsilat.GuvenlikBilgisi secInfo = new org.milleni.dunning.ws.client.tahsilat.GuvenlikBilgisi();
		secInfo.setKullaniciAdi(dunningProperties.getProperty(Constants.WS_SETTINGS_TAHSILAT_USERNAME));
		secInfo.setSifre(dunningProperties.getProperty(Constants.WS_SETTINGS_TAHSILAT_PASSWORD));
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
		try {
			XMLGregorianCalendar xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
			secInfo.setZamanDamgasi(xmlCalendar);
		} catch (Exception ex) {
		}
		return onlineTahsilatService.acikKalemler(secInfo, String.valueOf(customerId));
	}

	public FaturaDetayi retrievePaymentInfo(Long customerId) {
		((BindingProvider) milInternalService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_MILLENIWS_ENDPOINT));
		org.milleni.dunning.ws.client.milinternal.GuvenlikBilgisi secInfo = new org.milleni.dunning.ws.client.milinternal.GuvenlikBilgisi();
		secInfo.setKullaniciAdi("millnet");
		secInfo.setSifre("123456");
		return milInternalService.faturaDetayiGoruntule(secInfo, String.valueOf(customerId), "01.09.2050");
	}

	public TeconCustomerInfoResponse retrieveExternalCustomerInfo(String guid, Long customerId, boolean contractDetail) {
		((BindingProvider) customerInfoService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_CUSTOMER_INFO_ENDPOINT));
		return customerInfoService.retrieveCustomerInfo(guid, customerId, contractDetail);
	}

	
	public ServiceResponse createTickler(Long customerId, String customerName,boolean isIndividual, String sMessage) {
		((BindingProvider) ttsService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_TICKLER_ENDPOINT));
		ServiceResponse response = new ServiceResponse();
		response.setResultCode(0);
		try {
			
			org.milleni.dunning.ws.client.tts.ObjectFactory fac = new org.milleni.dunning.ws.client.tts.ObjectFactory();
			
			CreateTicklerRequestModel model =	 fac.createCreateTicklerRequestModel();
			RequestData dat = fac.createRequestData();
			
			dat.setCustomerId(customerId.intValue());
			dat.setCustomerName(fac.createRequestDataCustomerName(customerName));
			dat.setRequestReason(fac.createRequestDataRequestReason("Kurumsal&Soho"));//kurumsal bireysel
			if(isIndividual){
				dat.setRequestReason(fac.createRequestDataRequestReason("Bireysel"));//kurumsal bireysel	
			}
			dat.setDescription(fac.createRequestDataDescription(sMessage));
			
			dat.setFeedBack(RequestFeedBackEnum.TEL);
			dat.setPriority(RequestPriorityEnum.HIGH);
			dat.setRequestKind(ApproveNotificationEnum.DEMAND);	
			dat.setRequestType(fac.createRequestDataRequestType("Dış Arama"));
			dat.setState(fac.createRequestDataState("Not"));
			dat.setSubState(fac.createRequestDataSubState("Seçiniz"));
			dat.setSubject(fac.createRequestDataSubject("Tahsilat"));
			dat.setCallCenter(fac.createRequestDataCallCenter("Call Center A"));
			dat.setChannel(RequestChannelEnum.CALLCENTER);
			
			model.setRequestData(dat);
			ttsService.createTickler(model);
		} catch (Exception ex) {
			response.setResultCode(-1);
			response.setResultDescription(ex.getMessage());
		}
		return response;
	}

	public TeconCustomerInfoResponse retrieveExternalCustomerStatus(String guid, Long customerId) {
		((BindingProvider) customerInfoService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_CUSTOMER_INFO_ENDPOINT));
		return customerInfoService.retrieveCustomerStatus(guid, customerId);
	}

	public int retrieveCustomerTaksitCount(String guid, Long customerId) {
		((BindingProvider) customerInfoService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_CUSTOMER_INFO_ENDPOINT));
		return customerInfoService.retrieveCustomerTaksitCount(guid, customerId);
	}

	public int retrieveCustomerAgreementDocumentCount(String guid, Long customerId) {
		((BindingProvider) customerInfoService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_CUSTOMER_INFO_ENDPOINT));
		return customerInfoService.retrieveCustomerAgreementDocumentCount(guid, customerId);
	}

	public boolean retrieveCustomerHasCdr(String guid, Long customerId) {
		((BindingProvider) customerInfoService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_CUSTOMER_INFO_ENDPOINT));
		return customerInfoService.retrieveCustomerCdr(guid, customerId.longValue());
	}


	public String sendSms(Long customerId,String debit , String code) {
		return sendSmsBase(customerId, debit , code );
	}
	
	public String sendSmsBase(Long customerId,String debit , String code) {
		((BindingProvider) crmContactService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_CRM_CONTACT_ENDPOINT));

		SendDunningSmsRequestModel request = new SendDunningSmsRequestModel();
		org.milleni.dunning.ws.client.crmcontact.ObjectFactory fact = new org.milleni.dunning.ws.client.crmcontact.ObjectFactory();
		request.setSmsSenderApplication(org.milleni.dunning.ws.client.crmcontact.SmsSenderApplication.DUNNING);
		request.setBillingCustomerNo(fact.createSendSmsByBillingCustomerNoRequestModelBillingCustomerNo(customerId.toString()));		
		request.setDebit(fact.createSendDunningSmsRequestModelDebit(debit));
		request.setSmsCode(fact.createSendDunningSmsRequestModelSmsCode(code));
		try {
			crmContactService.sendDunningSms(request);
		} catch (Exception e) {
			return "105|" + e.getMessage().toString();
		}	
		return "basarili";
	}

	public org.milleni.dunning.ws.client.customerstatus.ServiceResponse changeCustomerStatus(String guid, Long customerId, STATUS status, STATUSREASON reason) {
		((BindingProvider) customerStatusOperations).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_CUSTOMERSTATUS_ENDPOINT));
		return customerStatusOperations.changeCustomerStatus(guid, customerId, status, reason, Constants.applicationName);
	}

	public org.milleni.dunning.ws.client.customerstatus.ServiceResponse oloThkIptal(String guid, Long customerId) {
		((BindingProvider) customerStatusOperations).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_CUSTOMERSTATUS_ENDPOINT));
		return customerStatusOperations.oloThkAboneIptal(guid, customerId);
	}

	public DunningFreezeCustomerXDSLResponse freezeCustomer(Long customerId) throws IFreezeDunningServiceDunningFreezeXDSLBusinessFaultFaultFaultMessage, IFreezeDunningServiceDunningFreezeXDSLSystemFaultFaultFaultMessage {
		((BindingProvider) freezeService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_CRM_FREEZE_ENDPOINT));
		org.milleni.dunning.ws.client.freezexdsl.ObjectFactory fact = new org.milleni.dunning.ws.client.freezexdsl.ObjectFactory();
		DunningFreezeCustomerXDSLRequest dunningFreezeReq = fact.createDunningFreezeCustomerXDSLRequest();
		dunningFreezeReq.setBillingCustomerNo(String.valueOf(customerId));
		return freezeService.dunningFreezeXDSL(dunningFreezeReq);
	}

	public DunningUnfreezeCustomerXDSLResponse unfreezeCustomer(Long customerId) throws IFreezeDunningServiceDunningUnfreezeXDSLBusinessFaultFaultFaultMessage, IFreezeDunningServiceDunningUnfreezeXDSLSystemFaultFaultFaultMessage {
		((BindingProvider) freezeService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_CRM_FREEZE_ENDPOINT));
		org.milleni.dunning.ws.client.freezexdsl.ObjectFactory fact = new org.milleni.dunning.ws.client.freezexdsl.ObjectFactory();
		DunningUnfreezeCustomerXDSLRequest dunningUnFreezeReq = fact.createDunningUnfreezeCustomerXDSLRequest();
		dunningUnFreezeReq.setBillingCustomerNo(String.valueOf(customerId));
		return freezeService.dunningUnfreezeXDSL(dunningUnFreezeReq);
	}

	public org.milleni.dunning.ws.client.customerstatus.ContractServiceResponse changeCrmCustomerStatus(String guid, Long customerId, STATUS status, int reason) {
		((BindingProvider) customerStatusOperations).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_CUSTOMERSTATUS_ENDPOINT));
		return customerStatusOperations.changeCrmCustomerStatus(guid, customerId, status, reason);
	}

	public org.milleni.dunning.ws.client.customerstatus.ServiceResponse changeVoipCustomerStatus(String guid, Long customerId, STATUS status) {
		((BindingProvider) customerStatusOperations).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_CUSTOMERSTATUS_ENDPOINT));
		return customerStatusOperations.voipChangeCustomerStatus(guid, customerId, status);
	}

	public String addQuickTickler(Long customerId, String sNeden, String sTalepKonusu, String sAltDurum, String sStatus, String sMessage) {
		((BindingProvider) milldeskService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_MILLDESK_ENDPOINT));
		return milldeskService.addTaskQuick(customerId.intValue(), sNeden, sTalepKonusu, sAltDurum, sStatus, sMessage);
	}
	
	
	

	public int getTicklerCount(Long customerId) {
		((BindingProvider) milldeskService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_MILLDESK_ENDPOINT));
		return milldeskService.retrieveOpenTicklerCount(customerId.intValue());
	}

	public org.milleni.dunning.ws.client.callcenter.ServiceResponse informCallCenter(String guid, CallType callType, Long customerId, ArrayOfInvoice invoiceList) {
		((BindingProvider) callCenterInformService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_CALLCENTER_ENDPOINT));
		return callCenterInformService.callCenterInform(guid, callType, customerId, invoiceList);
	}

	public SuspendAccountResponseModel suspendCrmAccount(Long customerId) throws CustomerInfoServiceV1SuspendAccountBusinessFaultFaultFaultMessage, CustomerInfoServiceV1SuspendAccountSystemFaultFaultFaultMessage {
		((BindingProvider) crmCustomerService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_CRM_ACCOUNT_ENDPOINT));

		SuspendAccountRequestModel request = new SuspendAccountRequestModel();
		org.milleni.dunning.ws.client.crm.ObjectFactory fact = new org.milleni.dunning.ws.client.crm.ObjectFactory();
		JAXBElement<String> application = fact.createDeactivateAccountRequestModelApplication("Dunning");
		JAXBElement<String> billingCustomerId = fact.createDeactivateAccountRequestModelBillingCustomerId(String.valueOf(customerId));
		JAXBElement<String> reasonDef = fact.createDeactivateAccountRequestModelStatusReasonDef("Borctan Suspend");

		request.setApplication(application);
		request.setBillingCustomerId(billingCustomerId);
		request.setStatusReasonID(904l);
		request.setStatusReasonDef(reasonDef);
		return crmCustomerService.suspendAccount(request);
	}

	public DeactivateAccountResponseModel deactivateCrmAccount(Long customerId) throws CustomerInfoServiceV1DeactivateAccountBusinessFaultFaultFaultMessage, CustomerInfoServiceV1DeactivateAccountSystemFaultFaultFaultMessage {
		((BindingProvider) crmCustomerService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_CRM_ACCOUNT_ENDPOINT));
		DeactivateAccountRequestModel request = new DeactivateAccountRequestModel();

		org.milleni.dunning.ws.client.crm.ObjectFactory fact = new org.milleni.dunning.ws.client.crm.ObjectFactory();
		JAXBElement<String> application = fact.createDeactivateAccountRequestModelApplication("Dunning");
		JAXBElement<String> billingCustomerId = fact.createDeactivateAccountRequestModelBillingCustomerId(String.valueOf(customerId));
		JAXBElement<String> reasonDef = fact.createDeactivateAccountRequestModelStatusReasonDef("Borçtan Deaktivasyon");

		request.setApplication(application);
		request.setBillingCustomerId(billingCustomerId);
		request.setStatusReasonID(905l);
		request.setStatusReasonDef(reasonDef);
		request.setWillBeSentToTT(true);
		return crmCustomerService.deactivateAccount(request);
	}
	
	public AddDeactivationRequestResponseModel addDeactivationRequest(Long customerId) throws Exception  {
		((BindingProvider) crmAccountService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_COA_ENDPOINT));
		org.milleni.dunning.ws.client.crmaccountcoa.ObjectFactory fact = new org.milleni.dunning.ws.client.crmaccountcoa.ObjectFactory();
		AddDeactivationRequestToAccountRequestModel request = fact.createAddDeactivationRequestToAccountRequestModel();
		request.setApplicationName("Dunning");
		request.setBillingCustomerNumber(String.valueOf(customerId));
		request.setReason("Borçtan Deaktivasyon");
		request.setReasonId(905l);
		request.setSendSms(true);
		request.setSendToBilling(true);
		request.setSendToNetwork(true);
		request.setSendToTT(true);
		return crmAccountService.addDeactivationRequest(request);		
	}


	public ActivateAccountResponseModel activateCrmAccount(Long customerId) throws CustomerInfoServiceV1ActivateAccountBusinessFaultFaultFaultMessage, CustomerInfoServiceV1ActivateAccountSystemFaultFaultFaultMessage {
		((BindingProvider) crmCustomerService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, dunningProperties.getProperty(Constants.WS_CRM_ACCOUNT_ENDPOINT));

		ActivateAccountRequestModel request = new ActivateAccountRequestModel();
		org.milleni.dunning.ws.client.crm.ObjectFactory fact = new org.milleni.dunning.ws.client.crm.ObjectFactory();
		JAXBElement<String> application = fact.createDeactivateAccountRequestModelApplication("Dunning");
		JAXBElement<String> billingCustomerId = fact.createDeactivateAccountRequestModelBillingCustomerId(String.valueOf(customerId));
		JAXBElement<String> reasonDef = fact.createDeactivateAccountRequestModelStatusReasonDef("Borctan Aktivasyon");

		request.setApplication(application);
		request.setBillingCustomerId(billingCustomerId);
		request.setStatusReasonID(903l);
		request.setStatusReasonDef(reasonDef);

		return crmCustomerService.activateAccount(request);
	}

}
