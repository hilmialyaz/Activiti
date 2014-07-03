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
import org.milleni.dunning.datamodel.dao.CustomerInvoicesRepository;
import org.milleni.dunning.datamodel.dao.DunningProcessDetailRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.CustomerType;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
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
import org.milleni.dunning.ws.client.customerstatus.ContractServiceResponse;
import org.milleni.dunning.ws.client.customerstatus.ContractStatus;
import org.milleni.dunning.ws.client.customerstatus.STATUS;
import org.milleni.dunning.ws.client.customerstatus.STATUSREASON;
import org.milleni.dunning.ws.client.customerstatus.TTSTATUS;
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
	protected transient RuntimeService runtimeService;

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
		Customer customer = customerService.findOne(customerId);

		DunningProcessDetail detail = dunningProcessService.getCurrentProcessDetail(execution);

		if (announceType != Constants.COA_ANNOUNCE_SUSPEND && customer.getCustomerType() != null && customer.getCustomerType().getTypeName().equalsIgnoreCase(Constants.KURUMSAL)) {
			detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.SKIPPED));
			dunningProcessService.saveDunningProcessDetail(detail);
			return;
		}

		if (customer.getContractType() != null && customer.getContractType().indexOf("-ADSL-") > -1) {

			coaAnnounce(customerId, detail, announceType);
		}
	}

	public void coaAnnounce(Long customerId, DunningProcessDetail detail, int announceType) {
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
		sendSms(execution, dunningProperties.getProperty(Constants.SMS_BIR_HATIRLATMA));
	}

	public void sendBireyselSmsIhtar(DelegateExecution execution) {
		sendSms(execution, dunningProperties.getProperty(Constants.SMS_BIR_IHTAR));
	}

	public void sendIptalBildirimSms(DelegateExecution execution) {
		sendSms(execution, dunningProperties.getProperty(Constants.SMS_IPTAL));
	}

	public void sendSms(DelegateExecution execution, String message) {
		DunningProcessDetail detail = dunningProcessService.getCurrentProcessDetail(execution);
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		Customer customer = customerService.findOne(customerId);
		sendMessage(customerId, detail, message);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void sendMessageWithStepName(DunningProcessDetail dpDetail) {
		if (dpDetail.getProcessStepId() == null)
			return;

		String stepName = dpDetail.getProcessStepId().getStepName();
		String message = null;
		if (Constants.STEP_BIR_SMS_HATIRLATMA.equals(dpDetail.getProcessStepId().getStepName()))
			message = dunningProperties.getProperty(Constants.SMS_BIR_HATIRLATMA);

		if (Constants.STEP_BIR_SMS_IHTAR.equals(dpDetail.getProcessStepId().getStepName()))
			message = dunningProperties.getProperty(Constants.SMS_BIR_IHTAR);

		if (Constants.STEP_KUR_SMS_HATIRLATMA.equals(dpDetail.getProcessStepId().getStepName()))
			message = dunningProperties.getProperty(Constants.SMS_KUR_HATIRLATMA);

		if (Constants.STEP_KUR_SMS_IHTAR.equals(dpDetail.getProcessStepId().getStepName()))
			message = dunningProperties.getProperty(Constants.SMS_KUR_IHTAR);

		if (Constants.STEP_KUR_SMS_IDARI.equals(dpDetail.getProcessStepId().getStepName()))
			message = dunningProperties.getProperty(Constants.SMS_KUR_IDARI);

		if (Constants.STEP_SMS_VIP_HATIRLATMA.equals(dpDetail.getProcessStepId().getStepName()))
			message = dunningProperties.getProperty(Constants.SMS_VIP_HATIRLATMA);

		if (StringUtils.hasText(message) && dpDetail.getProcessId() != null && dpDetail.getProcessId().getCustomerId() != null && dpDetail.getProcessId().getCustomerId().getCustomerId() != null)
			sendMessage(dpDetail.getProcessId().getCustomerId().getCustomerId(), dpDetail, message);

	}

	public static final String MSISDN_FORMAT_REGEXP = "5[0-9]{9}";

	public void sendMessage(Long customerId, DunningProcessDetail detail, String message) {
		Customer customer = customerService.findOne(customerId);

		Object[] params = new Object[] { String.valueOf(customerId), invoiceRepository.getCustomerUnpaidTotalInvoiceAmount(customerId) };
		String msg = MessageFormat.format(message, params);
		// dunningProcessService.addDunningProcessDetailLogs(detail,
		// Constants.SMS, msg);
		String msisdn = getCustomerValidMsisdn(customer);
		if (msisdn == null) {
			if (detail == null)
				return;
			detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.ERROR));
			addReturnLog(detail, "ERR", "Telefon Numarasi bulunamadi", Constants.STEP_SMS);
			dunningProcessService.saveDunningProcessDetail(detail);
			return;
		}
		String originator = dunningProperties.getProperty(Constants.WS_SETTINGS_SMS_ORIGINATOR_MILLENICOM);
		if (customer.getContractType() != null && customer.getContractType().indexOf("ADSL") > 0)
			originator = dunningProperties.getProperty(Constants.WS_SETTINGS_SMS_ORIGINATOR_ADSL);

		String response = commonProxyService.sendSms(msisdn, msg, originator);

		if (response != null && detail != null) {// 103|Erisim izniniz yok
													// hatası gelebilir.
			int pipeIndex = response.indexOf("|");
			if (pipeIndex > 0) {// hata var logla
				String key = response.substring(0, pipeIndex);
				String logValue = response.replaceFirst(key + "|", "");
				detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.ERROR));
				addReturnLog(detail, key, logValue, Constants.STEP_SMS);
			} else {
				addReturnLog(detail, msisdn, msg, Constants.STEP_SMS);
				detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.SUCCESS));
			}
			dunningProcessService.saveDunningProcessDetail(detail);
		}
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

	public void suspendCustomer(DelegateExecution execution) {
		changeCustomerStatus(execution, STATUS.SUSPEND, STATUSREASON.BORCTAN_DOLAYI_SUSPEND);
	}

	public void deactivateCustomer(DelegateExecution execution) {
		changeCustomerStatus(execution, STATUS.DEACTIVATE, STATUSREASON.BORCTAN_DOLAYI_IPTAL);
	}

	public void changeCustomerStatus(DelegateExecution execution, STATUS status, STATUSREASON reason) {
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		Customer customer = customerService.findOne(customerId);
		System.out.println("test");
		org.milleni.dunning.ws.client.customerstatus.ServiceResponse response = commonProxyService.changeCustomerStatus(execution.getProcessInstanceId(), customerId, status, reason);
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
		ttCrmOperations(execution, TTSTATUS.FREEZE);
	}

	public void ttCrmUnfreezeCustomer(DelegateExecution execution) {
		ttCrmOperations(execution, TTSTATUS.UNFREEZE);
	}

	public void ttCrmDeactivateCustomer(DelegateExecution execution) {
		ttCrmOperations(execution, TTSTATUS.DEACTIVATE);
	}

	public void ttCrmOperations(DelegateExecution execution, TTSTATUS status) {
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		org.milleni.dunning.ws.client.customerstatus.ContractServiceResponse response = commonProxyService.changeCustomerTTCRMStatus(execution.getProcessInstanceId(), customerId, status);
		if (response != null) {// hata durumu
			if (response.getResultCode() == -1) {
				throw new RuntimeException(response.getResultCode() + ": " + response.getResultDescription());
			} else if (response.getResultCode() != 0) {
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

	public void crmSuspendCustomer(DelegateExecution execution) {
		millnetCrmOperations(execution, STATUS.SUSPEND);
	}

	public void crmDeactivateCustomer(DelegateExecution execution) {
		millnetCrmOperations(execution, STATUS.DEACTIVATE);
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
	}

	public void addReturnLog(DunningProcessDetail detail, String resultCode, String resultDesc, String stepName) {
		if (resultDesc != null && resultDesc.length() > 400)
			resultDesc = resultDesc.substring(0, 390);
		dunningProcessService.addDunningProcessDetailLogs(detail, resultCode, resultDesc, stepName);
	}

	public void addTaskQuick(Long customerId, String sMessage) {
		Customer customer = customerService.findOne(customerId);
		String reason = Constants.nedenAdsl;
		if (customer.getContractType() != null && customer.getContractType().indexOf("PSTN") > 0)
			reason = Constants.nedenPstn;
		String response = commonProxyService.addQuickTickler(customerId, reason, Constants.talepKonusu, Constants.altDurum, Constants.talepStatus, sMessage);
		System.out.println(response);
	}

	public void retrieveCustomerAggreement(DelegateExecution execution) {
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		customerService.retrieveCustomerAggreement(execution.getProcessInstanceId(), customerId);
	}

	public void retrieveCustomerHasCdr(DelegateExecution execution) {
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		customerService.retrieveCustomerHasCdr(execution.getProcessInstanceId(), customerId);
	}

	public void retrieveCustomerTaksitCount(DelegateExecution execution) {
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		customerService.retrieveCustomerTaksitCount(execution.getProcessInstanceId(), customerId);
	}

	public void retrieveCustomerTicklerCount(DelegateExecution execution) {
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		customerService.retrieveCustomerTicklerCount(execution.getProcessInstanceId(), customerId);
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

	@Transactional(propagation = Propagation.REQUIRES_NEW)
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
			commonProxyService.suspendCrmAccount(customerId);
			setDpDetailSuccess(detail);
		} catch (Exception ex) {
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
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void activateCrmAccount(Long customerId, DunningProcessDetail detail) {
		try {
			commonProxyService.activateCrmAccount(customerId);
			setDpDetailSuccess(detail);
		} catch (Exception ex) {
			setStatusAfterFault(detail, ex);
		}
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void deactivateCrmAccount(Long customerId, DunningProcessDetail detail) {
		try {
			commonProxyService.deactivateCrmAccount(customerId);
			setDpDetailSuccess(detail);
		} catch (Exception ex) {
			setStatusAfterFault(detail, ex);
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
