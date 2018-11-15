package org.milleni.dunning.ws.proxy;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.delegate.BpmnError;
import org.activiti.engine.delegate.DelegateExecution;
import org.jboss.logging.Logger;
import org.milleni.dunning.datamodel.dao.CustomerInvoicesRepository;
import org.milleni.dunning.datamodel.dao.DunningProcessDetailRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.CustomerType;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.rule.InvoicePaymentRuleService;
import org.milleni.dunning.datamodel.service.CustomerService;
import org.milleni.dunning.datamodel.service.DunningProcessService;
import org.milleni.dunning.datamodel.service.ProcessSignalService;
import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.ws.client.callcenter.ArrayOfInvoice;
import org.milleni.dunning.ws.client.callcenter.CallType;
import org.milleni.dunning.ws.client.callcenter.Invoice;
import org.milleni.dunning.ws.client.coa.ServiceResponse;
import org.milleni.dunning.ws.client.crm.CustomerInfoServiceV1SuspendAccountBusinessFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.crm.CustomerInfoServiceV1SuspendAccountSystemFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.crmcontact.SmsCode;
import org.milleni.dunning.ws.client.customerstatus.ContractServiceResponse;
import org.milleni.dunning.ws.client.customerstatus.ContractStatus;
import org.milleni.dunning.ws.client.customerstatus.STATUS;
import org.milleni.dunning.ws.client.customerstatus.STATUSREASON;
import org.milleni.dunning.ws.client.customerstatus.TTSTATUS;
import org.milleni.dunning.ws.client.freezexdsl.IFreezeDunningServiceDunningUnfreezeXDSLBusinessFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.freezexdsl.IFreezeDunningServiceDunningUnfreezeXDSLSystemFaultFaultFaultMessage;
import org.milleni.dunning.ws.client.tahsilat.AcikKalem;
import org.milleni.dunning.ws.client.tahsilat.ArrayOfAcikKalem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service(value = "bpmWsDelegateService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED, noRollbackFor = { BpmnError.class })
public class BpmWsDelegateServiceImpl implements BpmWsDelegateService {

	@Autowired
	CustomerService customerService;

	@Autowired
	ProcessSignalService processSignalService;

	@Autowired
	CommonProxySerivce commonProxyService;

	@Autowired
	DunningProcessService dunningProcessService;

	@Resource(name = "dunningPropertyPlaceholder")
	private Properties dunningProperties;

	@Autowired
	CustomerInvoicesRepository invoiceRepository;

	@Autowired
	DunningProcessDetailRepository dunningProcessDetailRepository;
	
	@Autowired
	InvoicePaymentRuleService invoicePaymentRuleService;
	
	@Autowired
	protected transient RuntimeService runtimeService;
	
	protected static final Logger LOGGER = Logger.getLogger(BpmWsDelegateServiceImpl.class);

	// "ihtar1","suspend","welcome","netfatura","update_info","gunkapali","hatirlatma","quota_landing","quota_stopped"

	public void sendHatirlatmaCoaAnnounce(DelegateExecution execution) {
		sendCoaAnnounce(execution, Constants.COA_ANNOUNCE_HATIRLATMA);
	}

	public void sendIhtarCoaAnnounce(DelegateExecution execution) {
		sendCoaAnnounce(execution, Constants.COA_ANNOUNCE_IHTAR1);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void sendHatirlatmaCoaAnnounce(Long customerId, DunningProcessDetail detail) {
		coaAnnounce(customerId, detail, Constants.COA_ANNOUNCE_HATIRLATMA);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void sendIhtarCoaAnnounce(Long customerId, DunningProcessDetail detail) {
		coaAnnounce(customerId, detail, Constants.COA_ANNOUNCE_IHTAR1);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void sendIhtarCoaAnnounce(Long customerId, Long detailId) {
		DunningProcessDetail detail = dunningProcessDetailRepository.findOne(detailId);
		coaAnnounce(customerId, detail, Constants.COA_ANNOUNCE_IHTAR1);
	}

	public void sendSuspendCoaAnnounce(DelegateExecution execution) {
		sendCoaAnnounce(execution, Constants.COA_ANNOUNCE_SUSPEND);
	}

	public void sendCoaAnnounce(DelegateExecution execution, int announceType) {
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		if (customerId == null)
			return;

		DunningProcessDetail detail = dunningProcessService.getCurrentProcessDetail(execution);
	   coaAnnounce(customerId, detail, announceType);
	}

	public void coaAnnounce(Long customerId, DunningProcessDetail detail, int announceType) {
		Customer customer = customerService.findOne(customerId);
		
		if (announceType != Constants.COA_ANNOUNCE_SUSPEND && customer.getCustomerType() != null && customer.getCustomerType().getTypeName().equalsIgnoreCase(Constants.KURUMSAL)) {
			detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.SKIPPED));
			dunningProcessService.saveDunningProcessDetail(detail);
			return;
		}

		if (customer.getContractType() != null && customer.getContractType().indexOf("-ADSL-") < 0) {
			detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.SKIPPED));
			dunningProcessService.saveDunningProcessDetail(detail);
			return;
		}
		
		
		ServiceResponse response = commonProxyService.sendCoaAnnounce(customerId, announceType);
		if (response != null) {// hata durumu 0 basarisiz
			if (detail == null)
				return;
			if (response.getResultCode() != 0) {
				if (response.getResultDescription().indexOf("Existing: ihtar1 New: ihtar1") > 0) {
					detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.SUCCESS));
				} else {
					addReturnLog(detail, String.valueOf(response.getResultCode()), response.getResultDescription(), Constants.STEP_COA);
					detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.ERROR));
				}
			} else {
				detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.SUCCESS));
			}
			dunningProcessService.saveDunningProcessDetail(detail);
		}
	}

	public void sendBireyselSmsHatirlatma(DelegateExecution execution) {
		//sendSms(execution, dunningProperties.getProperty(Constants.SMS_BIR_HATIRLATMA));
	}

	public void sendBireyselSmsIhtar(DelegateExecution execution) {
		//sendSms(execution, dunningProperties.getProperty(Constants.SMS_BIR_IHTAR));
	}

	public void sendIptalBildirimSms(DelegateExecution execution) {
		sendSms(execution, dunningProperties.getProperty(Constants.SMS_IPTAL),true);
	}
	
	public void sendOdemeBildirimSms(DelegateExecution execution) {
		//sendSms(execution, dunningProperties.getProperty(Constants.SMS_ODEMEBILDIRIM));
	}
	
	public void sendOdemeGelmediSms(DelegateExecution execution) {
		//sendSms(execution, dunningProperties.getProperty(Constants.SMS_ODEMEGELMEDI));
	}

	public void sendSms(DelegateExecution execution, String message,boolean skipIfFail) {
		DunningProcessDetail detail = dunningProcessService.getCurrentProcessDetail(execution);
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		Customer customer = customerService.findOne(customerId);
		sendMessage(customerId, detail,skipIfFail);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void sendMessageWithStepName(DunningProcessDetail dpDetail) {
		if (dpDetail.getProcessStepId() == null)
			return;

		if (dpDetail.getProcessId() != null && dpDetail.getProcessId().getCustomerId() != null && dpDetail.getProcessId().getCustomerId().getCustomerId() != null)
			sendMessage(dpDetail.getProcessId().getCustomerId().getCustomerId(), dpDetail,false);
	}
	
	public static final String MSISDN_FORMAT_REGEXP = "5[0-9]{9}";

	public void sendMessage(Long customerId, DunningProcessDetail detail,boolean skipIfFailed) {
		Customer customer = customerService.findOne(customerId);
		String dpdStepName = detail.getProcessStepId().getStepName();
		if(Constants.STEP_KUR_SMS_IHTAR.equals(dpdStepName)){
			if(customer.getContractType()!=null && customer.getContractType().indexOf("DSL")>0){
				dpdStepName = Constants.STEP_BIR_SMS_IHTAR;
			}
		}

	
		String debit = invoiceRepository.getCustomerUnpaidTotalInvoiceAmount(customerId).toString();
		String response = commonProxyService.sendSms(customerId,debit,dpdStepName);
		
		if (!skipIfFailed && response != null && detail != null) {// 103|Erisim izniniz yok
								
			if(response.length()>100) response = response.substring(0,100);
			detail.setBackendStatusDesc(response);
			detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.ERROR));			
		}else{
			detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.SUCCESS));
		}
		dunningProcessService.saveDunningProcessDetail(detail);
	}

	public String getCustomerValidMsisdn(Customer customer) {
		String msisdn = isMsisdnValid(customer.getMobil());
		if (msisdn != null)
			return msisdn;

		msisdn = isMsisdnValid(customer.getTel1());
		if (msisdn != null)
			return msisdn;

		msisdn = isMsisdnValid(customer.getTel2());
		if (msisdn != null)
			return msisdn;

		return null;
	}

	public String isMsisdnValid(String msisdn) {
		if (!StringUtils.hasText(msisdn))
			return null;
		msisdn = replaceNonDigits(msisdn);
		if (msisdn.matches(MSISDN_FORMAT_REGEXP))
			return msisdn;
		try {
			msisdn = msisdn.substring(msisdn.length() - 10, msisdn.length());
		} catch (Exception ex) {
			return null;
		}
		if (!msisdn.matches(MSISDN_FORMAT_REGEXP))
			return null;
		else
			return msisdn;
	}

	public String replaceNonDigits(final String string) {
		if (string == null || string.length() == 0) {
			return "";
		}
		return string.replaceAll("[^0-9]+", "");
	}

	
	public org.milleni.dunning.ws.client.customerstatus.ServiceResponse billingActivateCustomer(Long customerId) {
		return  wsChangeStatus(
				"", STATUS.ACTIVATE, STATUSREASON.BORCTAN_DOLAYI_SUSPEND, customerId);
		
	}
	
	public void suspendCustomer(DelegateExecution execution) {
		changeCustomerStatus(execution, STATUS.SUSPEND, STATUSREASON.BORCTAN_DOLAYI_SUSPEND);
	}

	public void deactivateCustomer(DelegateExecution execution) {
		changeCustomerStatus(execution, STATUS.DEACTIVATE, STATUSREASON.BORCTAN_DOLAYI_IPTAL);
	}

	public void changeCustomerStatus(DelegateExecution execution, STATUS status, STATUSREASON reason) {
		/*
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		Customer customer = customerService.findOne(customerId);
		org.milleni.dunning.ws.client.customerstatus.ServiceResponse response = wsChangeStatus(
				execution.getProcessInstanceId(), status, reason, customerId);
		if (response != null) {// hata durumu
			if (response.getResultCode() == -1) {
				throw new RuntimeException(response.getResultCode() + ": " + response.getResultDescription());
			} else if (response.getResultCode() != 0) {
				DunningProcessDetail detail = dunningProcessService.getCurrentProcessDetail(execution);
				if (detail == null)
					return;
				addReturnLog(detail, String.valueOf(response.getResultCode()), response.getResultDescription(), execution.getCurrentActivityId());
				detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.ERROR));
				dunningProcessService.saveDunningProcessDetail(detail);
			}
		}
		*/
	}

	public org.milleni.dunning.ws.client.customerstatus.ServiceResponse wsChangeStatus(String processId, STATUS status, STATUSREASON reason,
			Long customerId) {
		/*
		org.milleni.dunning.ws.client.customerstatus.ServiceResponse response = commonProxyService.changeCustomerStatus(processId, customerId, status, reason);
		return response;
		*/
		return null;
	}

	public void oloThkIptal(DelegateExecution execution) {
		Long customerId = (Long) execution.getVariable(Constants.customerId);

		org.milleni.dunning.ws.client.customerstatus.ServiceResponse response = commonProxyService.oloThkIptal(execution.getProcessInstanceId(), customerId);
		if (response != null) {// hata durumu
			if (response.getResultCode() == -1) {
				throw new RuntimeException(response.getResultCode() + ": " + response.getResultDescription());
			} else if (response.getResultCode() != 0) {
				DunningProcessDetail detail = dunningProcessService.getCurrentProcessDetail(execution);
				if (detail == null)
					return;
				addReturnLog(detail, String.valueOf(response.getResultCode()), response.getResultDescription(), execution.getCurrentActivityId());
				detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.ERROR));
				dunningProcessService.saveDunningProcessDetail(detail);
			}
		}
	}

	public void ttCrmFreezeCustomer(DelegateExecution execution) {
		LOGGER.error("freezeCustomer kaldirilmasina ragmen freeze girdi.");
		/*
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		DunningProcessDetail detail = dunningProcessService.getCurrentProcessDetail(execution);
		try {
			//freezeCustomer(customerId);
			
		} catch (Exception e) {
			detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.ERROR));
			dunningProcessService.saveDunningProcessDetail(detail);
		}
		*/
	}

	public void ttCrmUnfreezeCustomer(DelegateExecution execution) {
		/*
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		DunningProcessDetail detail = dunningProcessService.getCurrentProcessDetail(execution);
		try {
			unfreezeCustomer(customerId);
		} catch (Exception e) {
			detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.ERROR));
			dunningProcessService.saveDunningProcessDetail(detail);
		}
		*/
		LOGGER.error("ttCrmUnfreezeCustomer kaldirilmasina ragmen freeze girdi.");

	}

	public void ttCrmDeactivateCustomer(DelegateExecution execution) {
		//ttCrmOperations(execution, TTSTATUS.DEACTIVATE);
	}

	public void ttCrmOperations(DelegateExecution execution, TTSTATUS status) {
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		org.milleni.dunning.ws.client.customerstatus.ContractServiceResponse response = wsTtCrmStatus(execution.getProcessInstanceId(), status, customerId);
		if (response != null) {// hata durumu
			if (response.getResultCode() == -1) {
				throw new RuntimeException(response.getResultCode() + ": " + response.getResultDescription());
			} else if (response.getResultCode() != 0) {
				if(status == TTSTATUS.UNFREEZE)
					return;
				
				if(response.getResultDescription()!=null && response.getResultDescription().indexOf("3001101")>-1){
					return;
				}
				DunningProcessDetail detail = dunningProcessService.getCurrentProcessDetail(execution);
				if (detail == null)
					return;

				addReturnLog(detail, String.valueOf(response.getResultCode()), response.getResultDescription(), execution.getCurrentActivityId());
				if (response.getContractStatusList() != null && response.getContractStatusList().getContractStatus() != null)
					for (ContractStatus contStatus : response.getContractStatusList().getContractStatus()) {
						addReturnLog(detail, "Kontrat:" + String.valueOf(contStatus.getContract()), contStatus.getResultDesc(), execution.getCurrentActivityId());
					}
				detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.ERROR));
				dunningProcessService.saveDunningProcessDetail(detail);
			}

		}
	}

	public org.milleni.dunning.ws.client.customerstatus.ContractServiceResponse wsTtCrmStatus(String processId, TTSTATUS status, Long customerId) {
		//org.milleni.dunning.ws.client.customerstatus.ContractServiceResponse response = commonProxyService.fchangeCustomerTTCRMStatus(processId, customerId, status);
		return null;
	}
	
	public void freezeCustomer(Long customerId) throws Exception{
		LOGGER.error("freezeCustomer freezeCustomer kaldirilmasina ragmen freeze girdi.");
//		try{
//			commonProxyService.freezeCustomer(customerId);
//		}catch(Exception ex){
//			LOGGER.error("freezeCustomer:"+ex);
//		}
	}
	
	public void unfreezeCustomer(Long customerId) throws Exception{
		LOGGER.error("unfreezeCustomer unfreezeCustomer  kaldirilmasina ragmen freeze girdi.");

		//commonProxyService.unfreezeCustomer(customerId);
	}

	public void crmSuspendCustomer(DelegateExecution execution) {
		millnetCrmOperations(execution, STATUS.SUSPEND);
	}

	public void crmDeactivateCustomer(DelegateExecution execution) throws Exception{
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		//invoicePaymentRuleService.checkInvoicePaymentStatusWithCustomerId(customerId);
		Customer customer = customerService.findOne(customerId);		
			
		if(customer.getCustomerGroup() != null && customer.getCustomerGroup().getGroupName().toLowerCase().contains("kamu")){
			throw new BpmnError(Constants.KAMU_SUSPEND_OLMAMALI);
		}
			
		DunningProcessMaster dpMaster = customer.getDunningProcessMaster();
		String reason = null;
		if(dpMaster!=null && dpMaster.getDunningPolicyId()!=null && Constants.yeniAktivasyonYabanciDunning.equals(dpMaster.getDunningPolicyId().getPolicyName())){
			reason = Constants.YENI_YABANCI_DEACTIVATION_REASON;
		}
		deactivateCrmAccount(customerId,reason);
	}

	public void millnetCrmOperations(DelegateExecution execution, STATUS status) {
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		int reason = 0;
		if (STATUS.ACTIVATE == status)
			reason = 903;
		else if (STATUS.SUSPEND == status)
			reason = 904;
		else
			reason = 905;

		ContractServiceResponse response = commonProxyService.changeCrmCustomerStatus(execution.getProcessInstanceId(), customerId, status, reason);
		if (response.getResultCode() == -1) {
			throw new RuntimeException(response.getResultCode() + ": " + response.getResultDescription());
		} else if (response != null) {// hata durumu
			DunningProcessDetail detail = dunningProcessService.getCurrentProcessDetail(execution);
			if (detail == null)
				return;
			if (response.getResultCode() != 0) {
				if (response.getContractStatusList() != null && response.getContractStatusList().getContractStatus() != null && response.getContractStatusList().getContractStatus().size() > 0) {
					for (org.milleni.dunning.ws.client.customerstatus.ContractStatus contractStatus : response.getContractStatusList().getContractStatus()) {
						addReturnLog(detail, String.valueOf(contractStatus.getContract()), contractStatus.getResultDesc(), execution.getCurrentActivityId());
					}
				}
				addReturnLog(detail, String.valueOf(response.getResultCode()), response.getResultDescription(), execution.getCurrentActivityId());
				detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.ERROR));
				dunningProcessService.saveDunningProcessDetail(detail);
			}

		}
	}

	public void voipSuspendCustomer(DelegateExecution execution) {
		changeVoipCustomerStatus(execution, STATUS.SUSPEND);
	}

	public void voipActivateCustomer(DelegateExecution execution) {
		changeVoipCustomerStatus(execution, STATUS.ACTIVATE);
	}

	public void changeVoipCustomerStatus(DelegateExecution execution, STATUS status) {
		Long customerId = (Long) execution.getVariable(Constants.customerId);

		org.milleni.dunning.ws.client.customerstatus.ServiceResponse response = commonProxyService.changeVoipCustomerStatus(execution.getProcessInstanceId(), customerId, status);

		if (response != null) {// hata durumu
			if (response.getResultCode() == -1) {
				throw new RuntimeException(response.getResultCode() + ": " + response.getResultDescription());
			} else if (response.getResultCode() != 0) {
				DunningProcessDetail detail = dunningProcessService.getCurrentProcessDetail(execution);
				if (detail == null)
					return;
				addReturnLog(detail, String.valueOf(response.getResultCode()), response.getResultDescription(), execution.getCurrentActivityId());
				detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.ERROR));
				dunningProcessService.saveDunningProcessDetail(detail);
			}
		}
	}

	public void agentCallSuspensionBireysel(DelegateExecution execution) {
		agentCallService(execution, CallType.TAHSILAT_ADSL);
	}

	public void agentCallSuspensionKurumsal(DelegateExecution execution) {
		agentCallService(execution, CallType.TAHSILAT_SES);
	}

	public void agentCallAvukatBireysel(DelegateExecution execution) {
		agentCallService(execution, CallType.AVUKAT_ADSL);
	}

	public void agentCallAvukatKurumsal(DelegateExecution execution) {
		agentCallService(execution, CallType.AVUKAT_SES);
	}

	public void agentCallService(DelegateExecution execution, CallType callType) {
		dunningProcessService.setDetailNotification(execution);
		/*
		GregorianCalendar calendar = new GregorianCalendar();
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		List<CustomerInvoices> customerInvoices = invoiceRepository.getCustomerUnpaidInvoices(customerId);
		ArrayOfInvoice arrayOfInvoice = new ArrayOfInvoice();
		List<Invoice> invoiceList = arrayOfInvoice.getInvoice();
		for (CustomerInvoices customerInvoice : customerInvoices) {
			Invoice inv = new Invoice();
			inv.setAmount(customerInvoice.getInvoiceAmount());
			calendar.setTime(customerInvoice.getInvoiceDate());
			try {
				XMLGregorianCalendar xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
				inv.setInvoiceDate(xmlCalendar);
				invoiceList.add(inv);
			} catch (Exception ex) {
			}

		}
		org.milleni.dunning.ws.client.callcenter.ServiceResponse response = commonProxyService.informCallCenter(execution.getProcessInstanceId(), callType, customerId, arrayOfInvoice);
		if (response != null) {// hata durumu
			if (response.getResultCode() == -1)
				throw new RuntimeException(response.getResultCode() + ": " + response.getResultDescription());

			DunningProcessDetail detail = dunningProcessService.getCurrentProcessDetail(execution);
			if (detail == null)
				return;

			if (response.getResultCode() != 0) {
				addReturnLog(detail, String.valueOf(response.getResultCode()), response.getResultDescription(), execution.getCurrentActivityId());
				detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.ERROR));
			} else {
				detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.SUCCESS));
			}
			dunningProcessService.saveDunningProcessDetail(detail);
		}
		*/
	}

	public void addReturnLog(DunningProcessDetail detail, String resultCode, String resultDesc, String stepName) {
		if (resultDesc != null && resultDesc.length() > 400)
			resultDesc = resultDesc.substring(0, 390);
		dunningProcessService.addDunningProcessDetailLogs(detail, resultCode, resultDesc, stepName);
	}

	public void addTaskQuick(Long customerId, String sMessage) {
//		Customer customer = customerService.findOne(customerId);
//		String reason = Constants.nedenPstn;
//		if (customer.getContractType() != null && customer.getContractType().indexOf("ADSL") > 0)
//			reason = Constants.nedenAdsl;
//		String response = commonProxyService.addQuickTickler(customerId, reason, Constants.talepKonusu, Constants.altDurum, Constants.talepStatus, sMessage);
//		System.out.println(response);
		
		Customer customer = customerService.findOne(customerId);
		boolean isIndividual = customer.getCustomerType()!=null && customer.getCustomerType().getTypeName()!=null && customer.getCustomerType().getTypeName().toLowerCase().contains("bireysel") ? true : false;
		commonProxyService.createTickler(customerId,customer.getCustomerName(),isIndividual, sMessage);
	}	
	
	public void retrieveCustomerAggreement(DelegateExecution execution) {
//		Long customerId = (Long) execution.getVariable(Constants.customerId);
//		customerService.retrieveCustomerAggreement(execution.getProcessInstanceId(), customerId);
	}

	public void retrieveCustomerHasCdr(DelegateExecution execution) {
//		Long customerId = (Long) execution.getVariable(Constants.customerId);
//		customerService.retrieveCustomerHasCdr(execution.getProcessInstanceId(), customerId);
	}

	public void retrieveCustomerTaksitCount(DelegateExecution execution) {
//		Long customerId = (Long) execution.getVariable(Constants.customerId);
//		customerService.retrieveCustomerTaksitCount(execution.getProcessInstanceId(), customerId);
	}

	public void retrieveCustomerTicklerCount(DelegateExecution execution) {
//		Long customerId = (Long) execution.getVariable(Constants.customerId);
//		customerService.retrieveCustomerTicklerCount(execution.getProcessInstanceId(), customerId);
	}

	/*
	 * public void exceptionHandler(DunningProcessDetail detail, Exception e) {
	 * detail.setStatus(Constants.ERROR); String exceptionMessage =
	 * e.getMessage(); if (exceptionMessage.length() > 400) exceptionMessage =
	 * exceptionMessage.substring(0, 390);
	 * dunningProcessService.addDunningProcessDetailLogs(detail,
	 * Constants.ERROR, exceptionMessage); }
	 */

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void signalProcessInNewTx(long customerId) {
		processSignalService.signalCustomerProcessIfPaymentReceived(customerId);
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED ,timeout=60)
    //@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void retrieveSapPaymentStatus(Long customerId) throws Exception {
		Customer customer = customerService.findOne(customerId);
		ArrayOfAcikKalem acikKalemler = commonProxyService.retrieveAcikkalemPaymentInfo(customerId);

		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		DecimalFormat decimalFormatter = new DecimalFormat();

		Map<String, CustomerInvoices> mapInvoices = new HashMap<String, CustomerInvoices>();
		for (CustomerInvoices inv : customer.getCustomerInvoicesCollection()) {
			inv.setPaymentStatus(Constants.PAID);
			mapInvoices.put(inv.getExtPaymentInvId(), inv);
		}
		Double totalDebit = new Double(0);
		List<AcikKalem> acikKalemList = acikKalemler.getAcikKalem();
		for (AcikKalem acikKalem : acikKalemList) {
			CustomerInvoices inv = mapInvoices.get(acikKalem.getReferansNo());
			if (inv != null) {// faturayi odememis
				inv.setPaymentStatus(Constants.UNPAID);
				inv.setInvoiceDueDate(dateFormatter.parse(acikKalem.getSonOdemeTarihi()));
				inv.setInvoiceDate(dateFormatter.parse(acikKalem.getFaturaTarihi()));
				inv.setInvoiceAmount(Double.parseDouble(acikKalem.getTutar().trim()));
			} else {
				inv = new CustomerInvoices();
				inv.setCustomerId(customer);
				inv.setExtPaymentInvId(acikKalem.getReferansNo());
				inv.setInvoiceDueDate(dateFormatter.parse(acikKalem.getSonOdemeTarihi()));
				inv.setInvoiceDate(dateFormatter.parse(acikKalem.getFaturaTarihi()));
				inv.setInvoiceAmount(Double.parseDouble(acikKalem.getTutar().trim()));
				inv.setPaymentStatus(Constants.UNPAID);
				mapInvoices.put(inv.getExtPaymentInvId(), inv);
			}
			totalDebit += inv.getInvoiceAmount();
		}
		customer.setLastInvoiceUpdateDate(new java.util.Date());
		customer.setCurrentDebit(totalDebit);
		customerService.saveCustomer(customer);
		invoiceRepository.save(mapInvoices.values());
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void suspendCrmAccount(Long customerId, DunningProcessMaster dpMaster ,DunningProcessDetail detail) {
		try {
			LOGGER.info("suspendCrmAccount start customerId:"+customerId);
			Customer customer = customerService.findOne(customerId);
			LOGGER.info("suspendCrmAccount customerselected customerId:"+customerId);
			if(Constants.DEAKTIF.equalsIgnoreCase(customer.getStatus())){
				throw new BpmnError(Constants.DEAKTIF);
			}
			dpMaster = customer.getDunningProcessMaster();
			if(dpMaster==null || !Constants.RUNNING.equalsIgnoreCase(dpMaster.getStatus().getId())){
				throw new BpmnError(Constants.DUNNING_PROCESS_MASTER_NOT_FOUND);
			}
			LOGGER.info("suspendCrmAccount getCustomerUnpaidTotalInvoiceAmount started customerId:"+customerId);
			Double invoiceAmount = invoiceRepository.getCustomerUnpaidTotalInvoiceAmount(customerId);
			LOGGER.info("suspendCrmAccount getCustomerUnpaidTotalInvoiceAmount ended customerId:"+customerId);
			boolean checkLimit =true;
			
			if(dpMaster!=null && dpMaster.getDunningPolicyId()!=null && Constants.yeniAktivasyonYabanciDunning.equals(dpMaster.getDunningPolicyId().getPolicyName())){
				checkLimit =false;
			}
			
			
			if (customer.getCustomerGroup() != null) {
				
				if(customer.getCustomerGroup().getGroupName().toLowerCase().contains("kamu")){
					throw new BpmnError(Constants.KAMU_SUSPEND_OLMAMALI);
				}
				
				Long maxInvoiceLimit = Long.parseLong(dunningProperties.getProperty(Constants.MAX_ADSL_SUSPENSION_INVOICE_LIMIT));
				if (Constants.KURUMSAL.equalsIgnoreCase(customer.getCustomerType().getTypeName())) {
					maxInvoiceLimit = Long.parseLong(dunningProperties.getProperty(Constants.MAX_SES_SUSPENSION_INVOICE_LIMIT));
				}
				if (checkLimit && ( invoiceAmount == null || invoiceAmount < maxInvoiceLimit ))
					throw new BpmnError(Constants.SUSPENSION_POSTPONE_DESC);
			}
			LOGGER.info("suspendCrmAccount suspendCrmAccount started customerId:"+customerId);
			commonProxyService.suspendCrmAccount(customerId);
			LOGGER.info("suspendCrmAccount suspendCrmAccount ended customerId:"+customerId);
			setDpDetailSuccess(detail);
			try{
				LOGGER.info("suspendCrmAccount getCustomerUnpaidTotalInvoiceAmount started customerId:"+customerId);
				String debit = invoiceRepository.getCustomerUnpaidTotalInvoiceAmount(customerId).toString();
				LOGGER.info("suspendCrmAccount getCustomerUnpaidTotalInvoiceAmount ended customerId:"+customerId);
				String dpdStepName = detail.getProcessStepId().getStepName();
				LOGGER.info("suspendCrmAccount sendSms started customerId:"+customerId);
				commonProxyService.sendSms(customerId, debit , dpdStepName  );
				LOGGER.info("suspendCrmAccount sendSms ended customerId:"+customerId);
			}catch(Exception ee){}
			
		} catch (Exception ex) {
			if(ex.getMessage().contains("ACCOUNT_NOT_FOUND"))
				throw new BpmnError(Constants.DEAKTIF);
			if(ex instanceof BpmnError){
				throw (BpmnError)ex;
			}
			if (dpMaster!=null && detail!=null && ex.getMessage()!=null && ex.getMessage().indexOf(Constants.CrmAccountNotFound)> -1) {
				try {
					Map<String, Object> variables = new HashMap<String, Object>();
					variables.put(Constants.customerId, customerId);
					variables.put(Constants.dunningProcessMaster,dpMaster.getProcessId());	
					variables.put(Constants.dunningProcessDetail, detail.getProcessDetailId());
					runtimeService.startProcessInstanceByKey(Constants.FL400_CustomerSuspensionProcess, variables);
				} catch (Exception e) {
					setStatusAfterFault(detail, e);
				}
			} else {
				setStatusAfterFault(detail, ex);
			}
		}
		LOGGER.info("suspendCrmAccount start customerId:"+customerId);
	}

	public void activateCrmAccount(Long customerId, DunningProcessDetail detail) {
		try {
			commonProxyService.activateCrmAccountOneWay(customerId);
			//setDpDetailSuccess(detail);
		} catch (Exception ex) {
			/*
			 org.milleni.dunning.ws.client.customerstatus.ServiceResponse  resp = billingActivateCustomer(customerId);
			 if(resp.getResultCode()==-1)
				 setStatusAfterFault(detail, ex);
			 else{
				 setStatusAfterFault(detail, ex);
			 }
			 */
		}
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void deactivateCrmAccount(Long customerId,String reason) throws BpmnError{
		try {
			commonProxyService.addDeactivationRequest(customerId,reason);
		} catch (Exception ex) {
			throw new BpmnError(Constants.CRM_DEACTIVATION_FAILED, ex.getMessage());
		}
	}

	private void setDpDetailSuccess(DunningProcessDetail detail) {
		if (detail != null) {
			detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.SUCCESS));
			dunningProcessService.saveDunningProcessDetail(detail);
		}
	}

	private void setStatusAfterFault(DunningProcessDetail detail, Exception fault) {
		if (detail == null)
			throw new RuntimeException(fault.getMessage());

		addReturnLog(detail, "error_statuschange", fault.getMessage(), "");
		detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.ERROR));
		dunningProcessService.saveDunningProcessDetail(detail);
		// throw new RuntimeException(fault.getMessage());
	}

}
