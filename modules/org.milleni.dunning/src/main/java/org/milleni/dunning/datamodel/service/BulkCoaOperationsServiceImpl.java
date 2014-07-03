package org.milleni.dunning.datamodel.service;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.annotation.Resource;

import org.activiti.engine.delegate.DelegateExecution;
import org.milleni.dunning.datamodel.dao.CustomerInvoicesRepository;
import org.milleni.dunning.datamodel.dao.CustomerTypesRepository;
import org.milleni.dunning.datamodel.dao.DunningProcessDetailRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.rule.InvoicePaymentRuleService;
import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.ws.proxy.BpmWsDelegateService;
import org.milleni.dunning.ws.proxy.CommonProxySerivce;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service(value = "bulkCoaOperationsService")
public class BulkCoaOperationsServiceImpl implements BulkCoaOperationsService {

	@Autowired
	DunningProcessDetailRepository dunningProcessDetailRepository;

	@Autowired
	CustomerTypesRepository customerTypeRepository;


	@Autowired
	CommonProxySerivce commonProxyService;

	@Autowired
	BpmWsDelegateService bpmWsDelegateService;

	@Autowired
	InvoicePaymentRuleService invoicePaymentRuleService;

	@Autowired
	CustomerInvoicesRepository invoiceRepository;
	
	@Autowired
	DunningProcessService dunningProcessService;

	@Resource(name = "dunningPropertyPlaceholder")
	private Properties dunningProperties;

	@Autowired
	ProcessSignalService processSignalService;

	protected static final Logger LOGGER = LoggerFactory.getLogger(BulkCoaOperationsServiceImpl.class);

	public void collectAndProcess(DelegateExecution execution) {
		LOGGER.info("pid:"+execution.getId()+"|m:collectAndSendSms");
		int maxRetrieveInOneExecution = Integer.parseInt(dunningProperties.getProperty(Constants.MAX_COA_IN_EXECUTION));
		List<Object[]> dpDetails = dunningProcessDetailRepository.findNotificationStateDunningProcessDetail("COA", new PageRequest(0, maxRetrieveInOneExecution));

		List<Long> objects = new ArrayList<Long>();
		for (Object[] obj : dpDetails) 	objects.add(((DunningProcessDetail)obj[0]).getProcessDetailId());			
		if(objects.size()>0) dunningProcessDetailRepository.updateDetailNotificationToRunning(objects,new Date());
		
		
		int totalCoaOperations = dpDetails.size();
		int successCoaMessages = 0;
		int failedCoaMessages = 0;
		int notSendPaymentReason = 0;
		int hatirlatmaCoaAnnounce = 0;
		int ihtarCoaAnnounce = 0;
		
		long currentDetailId = 0;
		for (Object[] obj : dpDetails) {
			try {
				DunningProcessDetail dpDetail = (DunningProcessDetail) obj[0];				
				DunningProcessMaster dpMaster = (DunningProcessMaster) obj[1];
				Customer customer = (Customer) obj[2];
				currentDetailId = dpDetail.getProcessDetailId();
				
				boolean customerHasUnpaidBill = invoicePaymentRuleService.customerHasUnpaidBillInLimit(customer.getCustomerId(), true);
				if (customerHasUnpaidBill) {
					if(Constants.STEP_BIR_COA_HATIRLATMA.equals(dpDetail.getProcessStepId().getStepName())){
						bpmWsDelegateService.sendHatirlatmaCoaAnnounce(customer.getCustomerId(),dpDetail);
						hatirlatmaCoaAnnounce++;
					}
					if(Constants.STEP_BIR_COA_IHTAR.equals(dpDetail.getProcessStepId().getStepName())){
						bpmWsDelegateService.sendIhtarCoaAnnounce(customer.getCustomerId(),dpDetail);
						ihtarCoaAnnounce++;
					}
					if (Constants.SUCCESS.equals(dpDetail.getStatus().getId()))
						successCoaMessages++;
					else
						failedCoaMessages++;
				} else {
					processSignalService.signalCustomerProcessIfPaymentReceived(customer.getCustomerId());
					notSendPaymentReason++;
				}
			} catch (Exception e) {
				failedCoaMessages++;
				dunningProcessService.errorProcessDetail(currentDetailId);
				LOGGER.error("Error Coa Basim", e);
			}
		}
		execution.setVariable(Constants.mailBody, "");
		if (totalCoaOperations > 0) {
			String mailReport = dunningProperties.getProperty(Constants.COA_MAIL_REPORT);
			Object[] params = new Object[] { totalCoaOperations, successCoaMessages, failedCoaMessages, notSendPaymentReason,hatirlatmaCoaAnnounce,ihtarCoaAnnounce };
			String msg = MessageFormat.format(mailReport, params);
			execution.setVariable(Constants.mailBody, msg);
		}
		LOGGER.info("pid:"+execution.getId()+"|m:collectAndSendSms");
	}

	
	public void collectAndAddToList(DelegateExecution execution) {
		List<Long> objects = new ArrayList<Long>();
		LOGGER.info("pid:"+execution.getId()+"|s:collectAndAddToList");
		int maxRetrieveInOneExecution = Integer.parseInt(dunningProperties.getProperty(Constants.MAX_COA_IN_EXECUTION));
		List<Object[]> dpDetails = dunningProcessDetailRepository.findNotificationStateDunningProcessDetail("COA", new PageRequest(0, maxRetrieveInOneExecution));
		
		for (Object[] obj : dpDetails) {
				DunningProcessDetail dpDetail = (DunningProcessDetail) obj[0];
				objects.add(dpDetail.getProcessDetailId());			
		}
		if(objects.size()>0)
			dunningProcessDetailRepository.updateDetailNotificationToRunning(objects,new Date());
		
		execution.setVariable("objects", objects);
		LOGGER.info("pid:"+execution.getId()+"|e:collectAndAddToList");
	}
}
