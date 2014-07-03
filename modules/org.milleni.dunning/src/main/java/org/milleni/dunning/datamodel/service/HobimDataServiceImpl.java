package org.milleni.dunning.datamodel.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Properties;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.activiti.engine.delegate.DelegateExecution;
import org.apache.log4j.Logger;
import org.milleni.dunning.datamodel.dao.CustomerGroupsRepository;
import org.milleni.dunning.datamodel.dao.CustomerInvoicesRepository;
import org.milleni.dunning.datamodel.dao.CustomerRepository;
import org.milleni.dunning.datamodel.dao.CustomerTypesRepository;
import org.milleni.dunning.datamodel.dao.DunningProcessDetailRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.rule.InvoicePaymentRuleService;
import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.ws.proxy.BpmWsDelegateService;
import org.milleni.dunning.ws.proxy.CommonProxySerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "hobimDataService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public class HobimDataServiceImpl implements HobimDataService {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CustomerInvoicesRepository customerInvoicesRepository;

	@Autowired
	DunningProcessDetailRepository dunningProcessDetailRepository;

	@Autowired
	CustomerTypesRepository customerTypeRepository;

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	CommonProxySerivce commonProxyService;

	@Autowired
	BpmWsDelegateService bpmWsDelegateService;

	@Autowired
	InvoicePaymentRuleService invoicePaymentRuleService;

	@Autowired
	CustomerInvoicesRepository invoiceRepository;

	@Resource(name = "dunningPropertyPlaceholder")
	private Properties dunningProperties;

	@Autowired
	ProcessSignalService processSignalService;
	
	@Autowired
	DunningProcessService dunningProcessService;

	@Autowired
	CustomerInvoicesRepository cuInvoicesRepository;

	private String aDate = null;
	private String bDate = null;
	
	StringBuilder sbMain = null;
	SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");
	SimpleDateFormat FILE_DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy_hhmmss");
	SimpleDateFormat MONTH_DATE_FORMAT = new SimpleDateFormat("MM");
	SimpleDateFormat YEAR_DATE_FORMAT = new SimpleDateFormat("yyyy");

	
	protected static final Logger LOGGER = Logger.getLogger(BulkSuspensionOperationsServiceImpl.class);
	
	public void generateHobimFile(DelegateExecution execution) {
		sbMain = new StringBuilder(""); 
		defineABLetterDate();
		String  stepName = (String) execution.getVariable("letterType");
		execution.setVariable(Constants.mailBody, "");
		if(stepName==null)
			return;
		
		
		long currentDetailId = 0;
		int maxRetrieveInOneExecution = Integer.parseInt(dunningProperties.getProperty(Constants.MAX_FESIH_MEKTUBU_IN_EXECUTION));
		List<Object[]> dpDetails = dunningProcessDetailRepository.findNotificationStateDunningProcessDetail(stepName, new PageRequest(0,maxRetrieveInOneExecution));
		
		List<Long> objects = new ArrayList<Long>();
		for (Object[] obj : dpDetails) 	objects.add(((DunningProcessDetail)obj[0]).getProcessDetailId());			
		if(objects.size()>0) dunningProcessDetailRepository.updateDetailNotificationToRunning(objects,new Date());
		
		Customer customer =null;
		for (Object[] obj : dpDetails) {
			try {
				DunningProcessDetail dpDetail = (DunningProcessDetail) obj[0];
				DunningProcessMaster dpMaster = (DunningProcessMaster) obj[1];
				customer = (Customer) obj[2];
				currentDetailId = dpDetail.getProcessDetailId();
				
				boolean customerHasUnpaidBill = invoicePaymentRuleService.customerHasUnpaidBillInLimit(customer.getCustomerId(), true);
				if (customerHasUnpaidBill)
					feedLetterData(customer, dpDetail);
				else
					processSignalService.signalCustomerProcessIfPaymentReceived(customer.getCustomerId());
			} catch (Exception e) {
				LOGGER.error("Error Suspending:"+customer.getCustomerId(), e);
				dunningProcessService.errorProcessDetail(currentDetailId);
			}
		}
		
		if (sbMain.toString().length() > 0) {
			writeToFile(execution, stepName);			
		}
	}

	public void feedLetterData(Customer customer, DunningProcessDetail dpDetail) {
		//DecimalFormat df = new DecimalFormat("#0,##");
		NumberFormat df = NumberFormat.getNumberInstance(new Locale("tr-TR")); 
		Double totalAmount = 0.0d;
		StringBuilder sLine = new StringBuilder("");
		String activationDate = null;
		if(customer.getActivationDate()!=null)
			activationDate=appendString(DATE_FORMAT.format(customer.getActivationDate()));
		else{
			activationDate="";
		}
		
		sLine.append(appendString(customer.getCustomerId()) + "|" + appendString(customer.getCustomerName()) + "|" + appendString(customer.getCustomerAddress()) + "|" + appendString(customer.getDistrict()) + "|" + appendString(customer.getCity()) + "|"
				+activationDate+ "|0,00|");

		Collection<CustomerInvoices> invoices = cuInvoicesRepository.getCustomerUnpaidInvoices(customer.getCustomerId());
		StringBuilder sLineInv = new StringBuilder();
		int unpaidInvoiceCount = 0;
		for (CustomerInvoices invoice : invoices) {
			if (Constants.UNPAID.equals(invoice.getPaymentStatus())) {
				sLineInv.append(getInvPeriodMonth(invoice) + "." + getInvPeriodYear(invoice) + "|" + df.format(invoice.getInvoiceAmount())+ "|"  );
				totalAmount += invoice.getInvoiceAmount();
				unpaidInvoiceCount++;
			}
		}
		sLine.append(unpaidInvoiceCount + "|" + sLineInv + df.format(totalAmount)+"|" +aDate+ "|" +bDate+"|"+customer.getStatus() );
		dpDetail.setStatus(dunningProcessDetailRepository.getDunningProcessDetailStatus(Constants.SUCCESS));
		dunningProcessService.saveDunningProcessDetail(dpDetail);
		sbMain.append(sLine + "\n");
	}
	
	public void writeToFile(DelegateExecution execution,String stepName){
		PrintWriter out =  null;
		try {
			String fileName =FILE_DATE_FORMAT.format(new Date())+"_"+stepName+".txt";
			String filePath = dunningProperties.getProperty(Constants.PATH_FESIH_MEKTUBU)+"/"+fileName;
			out = new PrintWriter(filePath, "UTF-8");
			//out = new BufferedWriter(new FileWriter(dunningProperties.getProperty(Constants.PATH_FESIH_MEKTUBU)+"/"+fileName));
			out.print(sbMain.toString());
			execution.setVariable(Constants.mailBody, dunningProperties.getProperty(Constants.LINK_FESIH_MEKTUBU)+fileName);
		} catch (IOException e) {
			e.printStackTrace();
			execution.setVariable(Constants.mailBody,"HATA:"+e.getMessage());
			throw new RuntimeException(e.getMessage());
		}finally{
			if(out!=null)
				try {
					out.close();
				} catch (Exception e2) {
				}
		}
	}

	public String appendString(Object obj) {
		if (obj != null)
			return String.valueOf(obj);
		else
			return "";
	}

	public String getInvPeriodMonth(CustomerInvoices invoice) {
		return MONTH_DATE_FORMAT.format(invoice.getInvoiceDate());
	}

	public String getInvPeriodYear(CustomerInvoices invoice) {
		return YEAR_DATE_FORMAT.format(invoice.getInvoiceDate());
	}
	
	public void defineABLetterDate(){
		Date dateA= new Date();
		Calendar calBDate = Calendar.getInstance();
		calBDate.add(Calendar.DATE, 15);
		if (calBDate.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || calBDate.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			if (calBDate.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
				calBDate.add(Calendar.DATE, 2);
			else
				calBDate.add(Calendar.DATE, 1);
		}
		
		bDate = DATE_FORMAT.format(calBDate.getTime());
		aDate = DATE_FORMAT.format(dateA);
	}

}
