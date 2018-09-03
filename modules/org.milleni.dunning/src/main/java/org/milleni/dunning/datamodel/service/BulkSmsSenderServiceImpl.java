package org.milleni.dunning.datamodel.service;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.annotation.Resource;

import org.activiti.engine.delegate.DelegateExecution;
import org.apache.log4j.Logger;
import org.milleni.dunning.datamodel.dao.CustomerInvoicesRepository;
import org.milleni.dunning.datamodel.dao.CustomerTypesRepository;
import org.milleni.dunning.datamodel.dao.DunningProcessDetailRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessDetailStatus;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.rule.InvoicePaymentRuleService;
import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.ws.proxy.BpmWsDelegateService;
import org.milleni.dunning.ws.proxy.CommonProxySerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service(value = "bulkSmsSenderService")
public class BulkSmsSenderServiceImpl implements BulkSmsSenderService {

	@Autowired
	DunningProcessDetailRepository dunningProcessDetailRepository;

	@Autowired
	CustomerTypesRepository customerTypeRepository;

	@Autowired
	CommonProxySerivce commonProxyService;

	@Autowired
	BpmWsDelegateService bpmWsDelegateService;
	
	@Autowired
	DunningProcessService dunningProcessService;

	@Autowired
	InvoicePaymentRuleService invoicePaymentRuleService;

	@Autowired
	CustomerInvoicesRepository invoiceRepository;

	@Resource(name = "dunningPropertyPlaceholder")
	private Properties dunningProperties;

	@Autowired
	ProcessSignalService processSignalService;
	
	protected static final Logger LOGGER = Logger.getLogger(BulkSmsSenderServiceImpl.class);

	public void collectAndSendSms(DelegateExecution execution) {
		LOGGER.info("pid:"+execution.getId()+"|m:collectAndSendSms");
		int maxRetrieveInOneExecution = Integer.parseInt(dunningProperties.getProperty(Constants.MAX_SMS_SEND_IN_EXECUTION));
		List<Object[]> dpDetails = dunningProcessDetailRepository.findNotificationStateDunningProcessDetail("SMS",new PageRequest(0, maxRetrieveInOneExecution));
		
		List<Long> objects = new ArrayList<Long>();
		for (Object[] obj : dpDetails) 	objects.add(((DunningProcessDetail)obj[0]).getProcessDetailId());			
		if(objects.size()>0) dunningProcessDetailRepository.updateDetailNotificationToRunning(objects,new Date());


		int totalSmsMessages = dpDetails.size();
		int successSmsMessages = 0;
		int failedSmsMessages = 0;
		int notSendPaymentReason = 0;
		long currentDetailId = 0;
		
		for (Object[] obj : dpDetails) {
			try {
				DunningProcessDetail dpDetail = (DunningProcessDetail) obj[0];
				DunningProcessMaster dpMaster = (DunningProcessMaster) obj[1];
				Customer customer = (Customer) obj[2];
				currentDetailId = dpDetail.getProcessDetailId();
				boolean customerHasUnpaidBill = invoicePaymentRuleService.customerHasUnpaidBillInLimitNewTx(customer.getCustomerId(), true);
				if (customerHasUnpaidBill) {
					bpmWsDelegateService.sendMessageWithStepName(dpDetail);
					if (Constants.SUCCESS.equals(dpDetail.getStatus().getId()))
						successSmsMessages++;
					else
						failedSmsMessages++;
				} else {
					processSignalService.signalCustomerProcessIfPaymentReceived(customer.getCustomerId());
					notSendPaymentReason++;
					dpDetail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.NOT_EXECUTED_4PAYMENT));
				}
			} catch (Exception e) {
				failedSmsMessages++;
				LOGGER.error("Error Sending Bulk Sms", e);
				dunningProcessService.errorProcessDetail(currentDetailId);
			}
		}
		execution.setVariable(Constants.mailBody, "");
		if (totalSmsMessages > 0) {
			String mailReport = dunningProperties.getProperty(Constants.SMS_MAIL_REPORT);
			Object[] params = new Object[] { totalSmsMessages, successSmsMessages, failedSmsMessages, notSendPaymentReason };
			String msg = MessageFormat.format(mailReport, params);
			execution.setVariable(Constants.mailBody, msg);
		}
		LOGGER.info("pid:"+execution.getId()+"|m:collectAndSendSms");
	}

}
