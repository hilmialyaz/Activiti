package org.milleni.dunning.datamodel.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.delegate.DelegateExecution;
import org.apache.log4j.Logger;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service(value = "bulkSuspensionService")
public class BulkSuspensionOperationsServiceImpl implements BulkSuspensionOperationsService {

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
	

	
	@Autowired
	protected transient RuntimeService runtimeService;
	
	protected static final Logger LOGGER = Logger.getLogger(BulkSuspensionOperationsServiceImpl.class);

	public void collectAndSuspend(DelegateExecution execution) {
		LOGGER.info("pid:"+execution.getId()+"|m:bulkSuspension");		
		String  stepNames = (String) execution.getVariable("stepNames");
		Long maxRetrieveInOneExecution = (Long) execution.getVariable("maxRetrieveInOneExecution");
		//int maxRetrieveInOneExecution = Integer.parseInt(dunningProperties.getProperty(Constants.MAX_SUSPENSION_EXECUTION));
		List<Object[]> dpDetails = dunningProcessDetailRepository.findNotificationStateDunningProcessDetail(Arrays.asList(stepNames.split(",")),new PageRequest(0, (int)(long)maxRetrieveInOneExecution));

		List<Long> objects = new ArrayList<Long>();
		for (Object[] obj : dpDetails) 	objects.add(((DunningProcessDetail)obj[0]).getProcessDetailId());			
		if(objects.size()>0) dunningProcessDetailRepository.updateDetailNotificationToRunning(objects,new Date());
		
		long currentDetailId = 0;
		for (Object[] obj : dpDetails) {
			
				DunningProcessDetail dpDetail = (DunningProcessDetail) obj[0];
				DunningProcessMaster dpMaster = (DunningProcessMaster) obj[1];
				Customer customer = (Customer) obj[2];
				currentDetailId = dpDetail.getProcessDetailId();
				
				try {
				boolean customerHasUnpaidBill = invoicePaymentRuleService.customerHasUnpaidBillInLimit(customer.getCustomerId(), true);
				if (customerHasUnpaidBill) {
					LOGGER.info("pid:"+execution.getId()+"|m:bulkSuspension|suspend|customerId:"+customer.getCustomerId());
					bpmWsDelegateService.suspendCrmAccount(customer.getCustomerId() ,dpMaster, dpDetail);
					/*					
				    Map<String,Object> variables = new HashMap<String,Object>();
				    variables.put(Constants.customerId,customer.getCustomerId());	
				    variables.put(Constants.dunningProcessMaster,dpMaster.getProcessId());	
				    variables.put(Constants.dunningProcessDetail, dpDetail.getProcessDetailId());
				    runtimeService.startProcessInstanceByKey(Constants.FL400_CustomerSuspensionProcess,variables);
				    */
				} else {
					LOGGER.info("pid:"+execution.getId()+"|m:bulkSuspension|dunningCikis|customerId:"+customer.getCustomerId());
					processSignalService.signalCustomerProcessIfPaymentReceived(customer.getCustomerId());
				}
			} catch (Exception e) {
				LOGGER.error("Error Suspending:"+customer.getCustomerId(), e);
				dunningProcessService.errorProcessDetail(currentDetailId);
			}
		}
		
		LOGGER.info("pid:"+execution.getId()+"|m:bulkSuspension");
	}

}
