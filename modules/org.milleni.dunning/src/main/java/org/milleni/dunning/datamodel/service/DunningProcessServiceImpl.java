package org.milleni.dunning.datamodel.service;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.delegate.BpmnError;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.runtime.ProcessInstance;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.milleni.dunning.datamodel.dao.CustomerInvoicesRepository;
import org.milleni.dunning.datamodel.dao.DunningPolicyRepository;
import org.milleni.dunning.datamodel.dao.DunningProcessDetailLogsRepository;
import org.milleni.dunning.datamodel.dao.DunningProcessDetailRepository;
import org.milleni.dunning.datamodel.dao.DunningProcessMasterRepository;
import org.milleni.dunning.datamodel.dao.ProcessStepsRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.DunningPolicy;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessDetailLogs;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.model.ProcessSteps;
import org.milleni.dunning.datamodel.rule.InvoicePaymentRuleService;
import org.milleni.dunning.datamodel.util.CalendarUtil;
import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.datamodel.util.DaoHelper;
import org.milleni.dunning.ws.client.customerstatus.TTSTATUS;
import org.milleni.dunning.ws.proxy.BpmWsDelegateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service(value = "dunningProcessService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED, noRollbackFor = { BpmnError.class })
public class DunningProcessServiceImpl implements DunningProcessService {

	@Autowired
	DunningProcessMasterRepository dunningProcessMasterRepository;

	@Autowired
	DunningProcessDetailRepository dunningProcessDetailRepository;

	@Autowired
	ProcessStepsRepository processStepsRepository;

	@Autowired
	DunningProcessDetailLogsRepository dunningProcessDetailLogsRepository;

	@Autowired
	DunningPolicyRepository dunningPolicyRepository;

	@Autowired
	CustomerInvoicesRepository invoiceRepository;

	@Autowired
	CustomerService customerService;

	@Autowired
	InvoicePaymentRuleService invoicePaymentRuleService;

	@Autowired
	BpmWsDelegateService bpmWsDelegateService;

	@Autowired
	protected transient RuntimeService runtimeService;

	protected static final Logger LOGGER = Logger.getLogger(DunningProcessServiceImpl.class);

	public List<DunningProcessDetail> listCustomerDunningProcessDetails(Long dunningProcessId) {
		return dunningProcessDetailRepository.findDunningProcessDetails(dunningProcessId);
	}

	public DunningProcessMaster initializeDunningProcessMaster(DelegateExecution execution) throws Exception {
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		boolean processStatusSuccess = true;
		String processStatusDesc = null;

		if (customerId == null)
			return null;
		Customer customer = customerService.findOne(customerId);
		if (customer == null)
			return null;

		DunningProcessMaster dunningProcess = null;
		dunningProcess = dunningProcessMasterRepository.getCustomerLastDunningProcessMaster(customerId);
		if (dunningProcess == null) {
			dunningProcess = createDunningProcessMaster(execution, customer, Constants.RUNNING);
		} else {
			if (Constants.RUNNING.equalsIgnoreCase(dunningProcess.getStatus().getId())) {
				if (!execution.getProcessInstanceId().equals(dunningProcess.getBpmProcessId())) {
					long isExist = runtimeService.createProcessInstanceQuery().processInstanceId(dunningProcess.getBpmProcessId()).count();
					if (isExist > 0) {
						processStatusDesc = Constants.CUSTOMER_HAS_MASTER_BUT_NO_BPM_FOUND + " su anki instance:" + execution.getProcessInstanceId() + " mevcuttaki:" + dunningProcess.getBpmProcessId();
						processStatusSuccess = false;
					} else
						dunningProcess.setBpmProcessId(execution.getProcessInstanceId());
				}
			} else if (Constants.INITIAL.equalsIgnoreCase(dunningProcess.getStatus().getId())) {
				dunningProcess.setStatus(dunningProcessMasterRepository.getProcessStatus(Constants.RUNNING));
				dunningProcess.setBpmProcessId(execution.getProcessInstanceId());
			} else {

				long isExist = runtimeService.createProcessInstanceQuery().processInstanceId(dunningProcess.getBpmProcessId()).count();
				if (isExist > 0) {
					processStatusDesc = Constants.CUSTOMER_HAS_MASTER_BUT_NO_BPM_FOUND + " status:" + dunningProcess.getStatus().getId() + " su anki instance:" + execution.getProcessInstanceId() + " mevcuttaki:" + dunningProcess.getBpmProcessId();
					processStatusSuccess = false;
				} else {
					List<ProcessInstance> processInstances = runtimeService.createProcessInstanceQuery().variableValueEquals(Constants.customerId, customerId).list();

					if (processInstances != null && processInstances.size() > 1) {
						processStatusSuccess = false;
						String ids = "";
						for (ProcessInstance processInstance : processInstances)
							ids = ids + processInstance.getId().toString() + ",";
						processStatusDesc = Constants.CUSTOMER_HAS_RUNNING_INSTANCE + " processInstances:" + ids;
					} else {
						dunningProcess = createDunningProcessMaster(execution, customer, Constants.RUNNING);
					}
				}
			}
		}

		if (Constants.VAR.equals(customer.getYasalTakipte())) {
			processStatusDesc = Constants.CUSTOMER_IS_IN_LEGAL;
			processStatusSuccess = false;
		}

		if (processStatusSuccess) {
			boolean customerHasUnpaidBill = invoicePaymentRuleService.customerHasUnpaidBillInLimit(customer.getCustomerId(), true);
			dunningProcess.setCurrentDebit(invoiceRepository.getCustomerUnpaidTotalInvoiceAmount(customer.getCustomerId()));
			if (!customerHasUnpaidBill) {
				processStatusSuccess = false;
				processStatusDesc = Constants.WARNING_NO_UNPAID_INVOICE;
			}
		}
		if (processStatusSuccess == false) {
			dunningProcess = createDunningProcessMaster(execution, customer, Constants.ERROR);
			dunningProcess.setStatusDesc(processStatusDesc);
		} else {
			CustomerInvoices customerFirstInvoice = invoicePaymentRuleService.getCustomersFirstUnpaidInvoice(customerId);
			if (customerFirstInvoice == null) {
				processStatusSuccess = false;
				processStatusDesc = Constants.WARNING_NO_UNPAID_INVOICE;
			} else {
				dunningProcess.setDunningInvoiceId(customerFirstInvoice);
			}
		}
		this.dunningProcessMasterRepository.save(dunningProcess);
		execution.setVariable(Constants.dunningProcessMaster, dunningProcess.getProcessId());

		if (processStatusSuccess == false)
			return null;

		return dunningProcess;
	}

	public DunningProcessMaster createDunningProcessMaster(DelegateExecution execution, Customer customer, String status) {
		DunningProcessMaster dunningProcess = new DunningProcessMaster();
		dunningProcess.setCustomerId(customer);
		dunningProcess.setBpmProcessId(execution.getProcessInstanceId());
		DunningPolicy dunningPolicy = dunningPolicyRepository.findDunningPolicyByName(execution.getProcessDefinitionId().substring(0, execution.getProcessDefinitionId().indexOf(":")), new Date());
		dunningProcess.setDunningPolicyId(dunningPolicy);
		dunningProcess.setStatus(dunningProcessMasterRepository.getProcessStatus(status));
		return dunningProcess;
	}

	public DunningProcessDetail createDunningProcessDetail(DunningProcessMaster dunningProcessMaster, ProcessSteps step) {
		DunningProcessDetail processDetail = new DunningProcessDetail();
		processDetail.setProcessId(dunningProcessMaster);
		processDetail.setProcessStepId(step);
		processDetail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.INITIAL));
		// processDetail.setStatusDate(new Date());
		processDetail.setCurrentDebit(invoiceRepository.getCustomerUnpaidTotalInvoiceAmount(dunningProcessMaster.getCustomerId().getCustomerId()));
		saveDunningProcessDetail(processDetail);
		return processDetail;
	}

	// taskLog=logKey:processVariable
	public void logUserTaskVariablesActivitiStep(DelegateExecution execution, String taskLog) {
		if (!StringUtils.hasText(taskLog))
			return;

		String user = (String) execution.getVariable(Constants.lastCompletedTaskUserName);
		DunningProcessDetail lastProcessDetail = getCurrentProcessDetail(execution);
		String message = "Dunning Kullanıcı :" + user + " ";
		if (lastProcessDetail != null) {
			String[] logStrings = taskLog.split(",");
			for (String logKeyText : logStrings) {
				String logs[] = logKeyText.split(":");
				Object paramValue = execution.getVariable(logs[1]);
				if (paramValue != null) {
					String processVariableValue = String.valueOf(paramValue);
					message = message + logs[0] + ":" + processVariableValue + " ";
					addDunningProcessDetailLogs(lastProcessDetail, logs[0], processVariableValue);
				}
			}
		}
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		bpmWsDelegateService.addTaskQuick(customerId, message);
	}

	public void setCustomerInYasalTakip(DelegateExecution execution) {
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		Customer customer = customerService.findOne(customerId);
		String taskStatusFinans = (String) execution.getVariable(Constants.taskStatusFinans);
		customer.setYasalTakipte(Constants.VAR);
		if (Constants.takipDisiBirak.equalsIgnoreCase(taskStatusFinans))
			customer.setYasalTakipte(Constants.TAKIP_DISI);

		customer.setYasalTakipTarihi(new Date());
		customerService.saveCustomer(customer);
		successProcessDetail(execution);
		successProcessMaster(execution);
	}

	public void successProcessDetail(DelegateExecution execution) {
		DunningProcessMaster dunningProcessMaster = getDunningProcessMaster(execution);
		DunningProcessDetail lastProcessDetail = getCurrentProcessDetail(execution);
		if (lastProcessDetail != null) {
			if (Constants.INITIAL.equals(lastProcessDetail.getStatus().getId())) {
				lastProcessDetail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.SUCCESS));
				saveDunningProcessDetail(lastProcessDetail);
			}
			dunningProcessMaster.setProcessLastStepId(lastProcessDetail.getProcessStepId());
			dunningProcessMasterRepository.save(dunningProcessMaster);
			execution.setVariable(Constants.dunningProcessDetail, lastProcessDetail.getProcessDetailId());
			execution.setVariable(Constants.processStepName, lastProcessDetail.getProcessStepId().getStepText());// Son
																													// yapılan
																													// adim.

			Date stepStartDateTime = (Date) execution.getVariable(Constants.stepStartDateTime);
			if (stepStartDateTime == null) {
				execution.setVariable(Constants.stepStartDateTime, lastProcessDetail.getCreateDate());
			}
		}

		arrageProcessWaitTime(execution);
	}

	public void successLastProcessDetail(DelegateExecution execution, String status) {
		Long dunningProcesDetailId = (Long) execution.getVariable(Constants.dunningProcessDetail);
		DunningProcessDetail dpDetail = null;
		if (dunningProcesDetailId == null) {
			dpDetail = getCurrentProcessDetail(execution);
			if (dpDetail == null)
				return;
		}
		dpDetail = dunningProcessDetailRepository.findOne(dunningProcesDetailId);
		if (dpDetail != null && !Constants.ERROR.equals(dpDetail.getStatus().getId())) {
			dpDetail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(status));
			saveDunningProcessDetail(dpDetail);
		}
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void errorProcessDetail(Long dpDetailId) {
		DunningProcessDetail dpDetail = dunningProcessDetailRepository.findOne(dpDetailId);
		dpDetail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.ERROR));
		saveDunningProcessDetail(dpDetail);
	}

	// processin steplerinde gecikme olursa
	public void arrageProcessWaitTime(DelegateExecution execution) {
		Date from = (Date) execution.getVariable(Constants.stepStartDateTime);
		if (from == null)
			return;

		Date now = new Date();
		String processWaitTime = (String) execution.getVariable(Constants.processWaitTime);
		DateTime jDateTime = new DateTime(from);
		Date executionDate = jDateTime.plus(Period.parse(processWaitTime)).toDate();
		if (now.getTime() < executionDate.getTime()) {
			Period period = new Period(now.getTime(), executionDate.getTime(), PeriodType.dayTime());
			execution.setVariable(Constants.processWaitTime, period.toString());
		} else {
			execution.setVariable(Constants.processWaitTime, "PT1M");
		}
	}

	public void successProcessMaster(DelegateExecution execution) {
		setDunningProcessMasterStatus(execution, Constants.SUCCESS);
	}

	public void paidAndFinishedProcessMaster(DelegateExecution execution) {
		setDunningProcessMasterStatus(execution, Constants.PAID_AND_FINISHED);
		
		DunningProcessDetail detail = getCurrentProcessDetail(execution);
		if (detail != null && (Constants.NOTIFICATION== detail.getStatus().getStatusKey() || Constants.INITIAL== detail.getStatus().getStatusKey())) {
			detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.NOT_EXECUTED_4PAYMENT));
			saveDunningProcessDetail(detail);
		}
		
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		Customer customer = customerService.updateCustomerStatusFromTeconCurrentTx("", customerId);

		if (Constants.SUSPEND.equalsIgnoreCase(customer.getStatus())) {
			bpmWsDelegateService.activateCrmAccount(customerId, null);
			// if(customer.getContractType()!=null &&
			// customer.getContractType().indexOf("ADSL")>0 ){
			// try{
			// bpmWsDelegateService.ttCrmUnfreezeCustomer(execution);
			// }catch(Exception ex){}
			// }
		}
	}

	public boolean activateIfSuspend(Long customerId) {
		Customer customer = customerService.updateCustomerStatusFromTecon("", customerId);
		if (Constants.SUSPEND.equalsIgnoreCase(customer.getStatus())) {
			bpmWsDelegateService.activateCrmAccount(customerId, null);
			// if(customer.getContractType()!=null &&
			// customer.getContractType().indexOf("ADSL")>0 ){
			// try {
			// bpmWsDelegateService.unfreezeCustomer(customerId);
			// } catch (Exception e) {
			// }
			// }
			return true;
		}
		return false;
	}

	public void manualyFinishedProcessMaster(DelegateExecution execution) {
		setDunningProcessMasterStatus(execution, Constants.MANUAL_FINISHED);
	}

	public void setDunningProcessMasterStatus(DelegateExecution execution, String status) {
		DunningProcessMaster dunningProcessMaster = getDunningProcessMaster(execution);
		if (dunningProcessMaster != null) {
			dunningProcessMaster.setStatus(dunningProcessMasterRepository.getProcessStatus(status));
			dunningProcessMasterRepository.save(dunningProcessMaster);
		}
	}

	public void failedProcessMaster(DelegateExecution execution) {
		DunningProcessMaster dunningProcessMaster = getDunningProcessMaster(execution);
		if (dunningProcessMaster == null) {
			Long customerId = (Long) execution.getVariable(Constants.customerId);
			Customer customer = customerService.findOne(customerId);
			if (customer == null)
				return;
			dunningProcessMaster = createDunningProcessMaster(execution, customer, Constants.ERROR);
		}

		String processStatus = (String) execution.getVariable(Constants.PROCESS_STATUS);
		String processStatusDesc = (String) execution.getVariable(Constants.PROCESS_STATUS_DESC);
		if (StringUtils.hasText(processStatus)) {
			dunningProcessMaster.setStatus(dunningProcessMasterRepository.getProcessStatus(processStatus));
			dunningProcessMaster.setStatusDesc(processStatusDesc);

			if (Constants.SUSPENSION_POSTPONE_DESC.equals(processStatusDesc)) {
				dunningProcessMaster.setStatus(dunningProcessMasterRepository.getProcessStatus(Constants.FINISHED_UNDER_LIMIT));
				setDunningProcessDetailStatus(execution, Constants.UNDER_LIMIT_SKIPPED);
				dunningProcessMaster.setStatusDesc(processStatusDesc);
			}
		} else
			dunningProcessMaster.setStatus(dunningProcessMasterRepository.getProcessStatus(Constants.ERROR));
		dunningProcessMasterRepository.save(dunningProcessMaster);
	}

	public DunningProcessDetail getCurrentProcessDetail(DelegateExecution execution) {
		DunningProcessMaster dunningProcessMaster = getDunningProcessMaster(execution);
		if (dunningProcessMaster == null)
			return null;
		List<DunningProcessDetail> lastDetailList = dunningProcessDetailRepository.findLastDunningProcessDetail(dunningProcessMaster.getProcessId(), new PageRequest(0, 1));
		if (lastDetailList != null && lastDetailList.size() > 0) {
			return lastDetailList.get(0);
		}
		return null;
	}

	public DunningProcessMaster getDunningProcessMaster(DelegateExecution execution) {
		Long dunningProcessMasterId = (Long) execution.getVariable(Constants.dunningProcessMaster);
		if (dunningProcessMasterId == null) {
			Long customerId = (Long) execution.getVariable(Constants.customerId);
			if (customerId == null)
				return null;

			Customer customer = customerService.findOne(customerId);
			DunningProcessMaster dunningProcessMaster = customer.getDunningProcessMaster();
			execution.setVariable(Constants.dunningProcessMaster, dunningProcessMaster.getProcessId());
			return dunningProcessMaster;
		}
		return dunningProcessMasterRepository.findOne(dunningProcessMasterId);
	}

	public void throwNotRetryError(DelegateExecution execution, String processStatus, String processStatusDesc) {
		execution.setVariable(Constants.PROCESS_STATUS, processStatus);
		execution.setVariable(Constants.PROCESS_STATUS_DESC, processStatusDesc);
		throw new BpmnError(Constants.NOT_RETRY_ERROR, processStatusDesc);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void startDunningProcessBatch(DelegateExecution execution) {

	}

	public void addDunningProcessDetailLogs(DunningProcessDetail detail, String key, String value) {
		DunningProcessDetailLogs log = new DunningProcessDetailLogs();
		log.setLogKey(key);
		log.setLogText(value);
		log.setProcessDetailId(detail);
		dunningProcessDetailLogsRepository.save(log);
	}

	public void addDunningProcessDetailLogs(DunningProcessDetail detail, String key, String value, String step) {
		DunningProcessDetailLogs log = new DunningProcessDetailLogs();
		log.setLogKey(key);
		log.setLogText(value);
		log.setProcessDetailId(detail);
		log.setLogStep(step);
		dunningProcessDetailLogsRepository.save(log);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void setDunningProcessDetailStatus(DelegateExecution execution, String status) {
		DunningProcessDetail detail = getCurrentProcessDetail(execution);
		if (detail != null) {
			detail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(status));
			saveDunningProcessDetail(detail);
		}
 	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void setDetailNotification(DelegateExecution execution) {
		setDunningProcessDetailStatus(execution, Constants.NOTIFICATION);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void setDetailSkipped(DelegateExecution execution) {
		setDunningProcessDetailStatus(execution, Constants.SKIPPED);
		// DunningProcessMaster dpm = getDunningProcessMaster(execution);
		// if(dpm.getCurrentStepId().getStepText().toLowerCase().contains("deaktivasyon"))
		// return;

		// ProcessSteps fesihYasalUyariMektup
		// =dunningPolicyRepository.retrieveDunningProcessStepByDesc(dpm.getDunningPolicyId().getPolicyId(),Constants.PROCESS_STEP_DESC_FESIH_MEKTUBU);
		// if(fesihYasalUyariMektup!=null){
		// dpm.setNextStepId(fesihYasalUyariMektup);
		// String processWaitTime = "P"+CalendarUtil.nextMountLastWorkDay()+"D";
		// execution.setVariable(Constants.processWaitTime, processWaitTime );
		// dpm.setNextStepExecutionDate(CalendarUtil.arrangeJodaToDate(processWaitTime));
		// }
	}

	public void saveDunningProcessDetail(DunningProcessDetail detail) {
		dunningProcessDetailRepository.save(detail);
	}

	public void saveDunningProcessMaster(DunningProcessMaster master) {
		dunningProcessMasterRepository.save(master);
	}

}
