package org.milleni.dunning.datamodel.rule;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.activiti.engine.delegate.BpmnError;
import org.activiti.engine.delegate.DelegateExecution;
import org.drools.KnowledgeBase;
import org.drools.definition.type.FactType;
import org.drools.runtime.StatefulKnowledgeSession;
import org.milleni.dunning.datamodel.dao.CustomerInvoicesRepository;
import org.milleni.dunning.datamodel.dao.DunningProcessDetailRepository;
import org.milleni.dunning.datamodel.dao.DunningProcessMasterRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.service.CustomerService;
import org.milleni.dunning.datamodel.service.DunningProcessService;
import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.ws.client.callcenter.Invoice;
import org.milleni.dunning.ws.client.milinternal.ArrayOfFaturaKalemi;
import org.milleni.dunning.ws.client.milinternal.FaturaKalemi;
import org.milleni.dunning.ws.client.tahsilat.AcikKalem;
import org.milleni.dunning.ws.client.tahsilat.ArrayOfAcikKalem;
import org.milleni.dunning.ws.proxy.BpmWsDelegateService;
import org.milleni.dunning.ws.proxy.CommonProxySerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "invoicePaymentRuleService")
public class InvoicePaymentRuleServiceImpl extends AbstractRuleService implements InvoicePaymentRuleService {

	@Autowired
	CustomerInvoicesRepository customerInvoiceRepository;

	@Autowired
	CustomerService customerService;
	
	@Autowired
	CommonProxySerivce commonProxyService;
	
	@Autowired
	DunningProcessMasterRepository dunningProcessMasterRepository;

	@Autowired
	CustomerInvoicesRepository invoiceRepository;
	
	@Autowired
	DunningProcessService processService;
	
	@Autowired
	BpmWsDelegateService bpmWsDelegateService;
	
	@Autowired
	DunningProcessDetailRepository dunningProcessDetailRepository;
	
	@Resource(name = "dunningPropertyPlaceholder")
	private Properties dunningProperties;

	@Transactional(propagation = Propagation.REQUIRES_NEW, timeout=20,noRollbackFor = { BpmnError.class })
	public void checkInvoicePaymentStatus(DelegateExecution execution) throws Exception {
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		
		boolean customerHasUnpaidBill = customerHasUnpaidBillInLimitWithoutTx(customerId,true);
		if(!customerHasUnpaidBill)
			throw new BpmnError(Constants.PAYMENT_RECEIVED, "Fatura Odemesi Gerceklesti..");
	}
	
	
	@Transactional(readOnly = true, noRollbackFor = { BpmnError.class })
	public void checkInvoicePaymentStatusWithCustomerId(Long customerId ) throws Exception {
		boolean customerHasUnpaidBill = customerHasUnpaidBillInLimitNewTx(customerId,true);
		if(!customerHasUnpaidBill)
			throw new BpmnError(Constants.PAYMENT_RECEIVED, "Fatura Odemesi Gerceklesti.");
	}

	
	@Transactional(readOnly = true, noRollbackFor = { BpmnError.class })
	public void checkInvoicePaymentStatusByDetail(Long detailId ) throws Exception {
		DunningProcessDetail detail = dunningProcessDetailRepository.findOne(detailId);
		Long customerId = detail.getProcessId().getCustomerId().getCustomerId();
		
		boolean customerHasUnpaidBill = customerHasUnpaidBillInLimitNewTx(customerId,true);
		if(!customerHasUnpaidBill)
			throw new BpmnError(Constants.PAYMENT_RECEIVED, "Fatura Odemesi Gerceklesti.");
	}
	
	public void checkSapPaymentStatus(DelegateExecution execution) throws Exception {
		Long customerId = (Long) execution.getVariable(Constants.customerId);
		bpmWsDelegateService.retrieveSapPaymentStatus(customerId);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW, timeout=20)
	public boolean customerHasUnpaidBillInLimitNewTx(Long customerId,boolean checkSap) throws Exception{
		return customerHasUnpaidBillInLimitWithoutTx(customerId, checkSap);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW, timeout=20)
	public boolean customerHasUnpaidBillInLimit(Long customerId,boolean checkSap) throws Exception{
		if(checkSap) bpmWsDelegateService.retrieveSapPaymentStatus(customerId);
		Double invoiceAmount = invoiceRepository.getCustomerUnpaidTotalInvoiceAmount(customerId);
		if(invoiceAmount==null || invoiceAmount==0)
			return false;
		
		Long maxInvoiceLimit = Long.parseLong(dunningProperties.getProperty(Constants.MAX_INVOICE_LIMIT));
		if(invoiceAmount<maxInvoiceLimit)
			return false;
		
		return true;
	}
	
	
	public boolean customerHasUnpaidBillInLimitWithoutTx(Long customerId,boolean checkSap) throws Exception{
		if(checkSap) bpmWsDelegateService.retrieveSapPaymentStatus(customerId);
		Double invoiceAmount = invoiceRepository.getCustomerUnpaidTotalInvoiceAmount(customerId);
		if(invoiceAmount==null || invoiceAmount==0)
			return false;
		
		Long maxInvoiceLimit = Long.parseLong(dunningProperties.getProperty(Constants.MAX_INVOICE_LIMIT));
		if(invoiceAmount<maxInvoiceLimit)
			return false;
		
		return true;
	}
	
	public Double getCustomerUnpaidTotalInvoiceAmountBeforeSot(Long customerId){
		return invoiceRepository.getCustomerUnpaidTotalInvoiceAmount(customerId);
	}
	
	public CustomerInvoices getCustomersFirstUnpaidInvoice(Long customerId){
		Long maxInvoiceLimit = Long.parseLong(dunningProperties.getProperty(Constants.MAX_INVOICE_LIMIT));
		Collection<CustomerInvoices> invoices = invoiceRepository.getCustomerUnpaidInvoices(customerId);
		Double invoiceAmount = 0.0;
		if(invoices!=null && invoices.size()>0)
			for (CustomerInvoices invoice : invoices) {
				invoiceAmount += invoice.getInvoiceAmount();
				if(invoiceAmount>maxInvoiceLimit){
					return invoice;	
				}
			}
		return null;
	}

}
