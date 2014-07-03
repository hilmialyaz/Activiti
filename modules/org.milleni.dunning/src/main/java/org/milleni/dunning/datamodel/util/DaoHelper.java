package org.milleni.dunning.datamodel.util;

import org.hibernate.proxy.HibernateProxy;
import org.milleni.dunning.activiti.executionlistener.ProcessExecutionListenerService;
import org.milleni.dunning.datamodel.dao.CustomerDao;
import org.milleni.dunning.datamodel.dao.CustomerInvoicesRepository;
import org.milleni.dunning.datamodel.dao.CustomerRepository;
import org.milleni.dunning.datamodel.dao.DunningPolicyRepository;
import org.milleni.dunning.datamodel.dao.DunningProcessDetailDao;
import org.milleni.dunning.datamodel.dao.DunningProcessDetailRepository;
import org.milleni.dunning.datamodel.dao.DunningProcessMasterDao;
import org.milleni.dunning.datamodel.dao.DunningProcessMasterRepository;
import org.milleni.dunning.datamodel.rule.InvoicePaymentRuleService;
import org.milleni.dunning.datamodel.service.CustomerService;
import org.milleni.dunning.datamodel.service.DunningProcessService;
import org.milleni.dunning.datamodel.service.ProcessSignalService;
import org.springframework.beans.factory.annotation.Autowired;

public class DaoHelper {
	private static DaoHelper instance = null;

	private CustomerDao customerDao;
	
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	CustomerInvoicesRepository customerInvoicesRepository;
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	DunningProcessService dunningProcessService;
	
	@Autowired
	DunningPolicyRepository dunningPolicyRepository;
	
	@Autowired
	DunningProcessMasterRepository dunningProcessMasterRepository;
	
	@Autowired
	DunningProcessDetailRepository dunningProcessDetailRepository;
	
	@Autowired
	DunningProcessMasterDao dunningProcessMasterDao;


	@Autowired
	DunningProcessDetailDao dunningProcessDetailDao;
	
	
	@Autowired
	InvoicePaymentRuleService invoicePaymentRuleService;
	
	
	@Autowired
	ProcessSignalService processSignalService;
	
	@Autowired
	ProcessExecutionListenerService processExecutionListener;
	
	public ProcessExecutionListenerService getProcessExecutionListener() {
		return processExecutionListener;
	}

	public void setProcessExecutionListener(ProcessExecutionListenerService processExecutionListener) {
		this.processExecutionListener = processExecutionListener;
	}

	public DunningProcessService getDunningProcessService() {
		return dunningProcessService;
	}

	public void setDunningProcessService(DunningProcessService dunningProcessService) {
		this.dunningProcessService = dunningProcessService;
	}

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	protected DaoHelper() {
		
	}

	public static DaoHelper getInstance() {
		if (instance == null) {
			instance = new DaoHelper();
		}
		return instance;
	}

	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public DunningPolicyRepository getDunningPolicyRepository() {
		return dunningPolicyRepository;
	}

	public void setDunningPolicyRepository(
			DunningPolicyRepository dunningPolicyRepository) {
		this.dunningPolicyRepository = dunningPolicyRepository;
	}

	public DunningProcessMasterRepository getDunningProcessMasterRepository() {
		return dunningProcessMasterRepository;
	}

	public void setDunningProcessMasterRepository(DunningProcessMasterRepository dunningProcessMasterRepository) {
		this.dunningProcessMasterRepository = dunningProcessMasterRepository;
	}

	public DunningProcessDetailRepository getDunningProcessDetailRepository() {
		return dunningProcessDetailRepository;
	}

	public void setDunningProcessDetailRepository(DunningProcessDetailRepository dunningProcessDetailRepository) {
		this.dunningProcessDetailRepository = dunningProcessDetailRepository;
	}

	public DunningProcessMasterDao getDunningProcessMasterDao() {
		return dunningProcessMasterDao;
	}

	public void setDunningProcessMasterDao(DunningProcessMasterDao dunningProcessMasterDao) {
		this.dunningProcessMasterDao = dunningProcessMasterDao;
	}

	public DunningProcessDetailDao getDunningProcessDetailDao() {
		return dunningProcessDetailDao;
	}

	public void setDunningProcessDetailDao(DunningProcessDetailDao dunningProcessDetailDao) {
		this.dunningProcessDetailDao = dunningProcessDetailDao;
	}

	public InvoicePaymentRuleService getInvoicePaymentRuleService() {
		return invoicePaymentRuleService;
	}

	public void setInvoicePaymentRuleService(InvoicePaymentRuleService invoicePaymentRuleService) {
		this.invoicePaymentRuleService = invoicePaymentRuleService;
	}

	public ProcessSignalService getProcessSignalService() {
		return processSignalService;
	}

	public void setProcessSignalService(ProcessSignalService processSignalService) {
		this.processSignalService = processSignalService;
	}

	public CustomerInvoicesRepository getCustomerInvoicesRepository() {
		return customerInvoicesRepository;
	}

	public void setCustomerInvoicesRepository(CustomerInvoicesRepository customerInvoicesRepository) {
		this.customerInvoicesRepository = customerInvoicesRepository;
	}
	
	
	public static  <T> T initializeAndUnproxy(T entity) {
        if (entity == null) {
            throw new 
               NullPointerException("Entity passed for initialization is null");
        }
        
        if (entity instanceof HibernateProxy) {
        	//Hibernate.initialize(entity);
            entity = (T) ((HibernateProxy) entity).getHibernateLazyInitializer().getImplementation();
        }
        return entity;
    }
	
	
}