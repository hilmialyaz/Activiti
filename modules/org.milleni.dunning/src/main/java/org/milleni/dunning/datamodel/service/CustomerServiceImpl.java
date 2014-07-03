package org.milleni.dunning.datamodel.service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.activiti.engine.delegate.DelegateExecution;
import org.antlr.grammar.v3.ANTLRv3Parser.throwsSpec_return;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.milleni.dunning.datamodel.dao.CustomerGroupsRepository;
import org.milleni.dunning.datamodel.dao.CustomerInvoicesRepository;
import org.milleni.dunning.datamodel.dao.CustomerRepository;
import org.milleni.dunning.datamodel.dao.CustomerTypesRepository;
import org.milleni.dunning.datamodel.dao.DunningProcessMasterRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerGroup;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.CustomerType;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.ws.client.customerservice.TeconCustomerInfo;
import org.milleni.dunning.ws.client.customerservice.TeconCustomerInfoResponse;
import org.milleni.dunning.ws.proxy.CommonProxySerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "customerService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CustomerInvoicesRepository customerInvoicesRepository;

	@Autowired
	DunningProcessMasterRepository dunningProcessMasterRepository;

	@Autowired
	CustomerTypesRepository customerTypeRepository;

	@Autowired
	CustomerGroupsRepository customerGroupRepository;

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	CommonProxySerivce commonProxyService;

	public Iterable<Customer> listCustomer() {
		return customerRepository.findAll();
	}

	public Iterable<Customer> listCustomer(int page, int pageSize) {
		Pageable pageable = new PageRequest(page, pageSize);
		return customerRepository.findAll(pageable);
	}

	public long customerCount() {
		return customerRepository.count();
	}

	public List<CustomerInvoices> listCustomerInvoices(Long customerId) {
		return customerInvoicesRepository.findCustomersInvoices(customerId);
	}

	public List<DunningProcessMaster> listCustomerDunningProcesses(Long customerId) {
		return dunningProcessMasterRepository.findDunningProcessMasters(customerId);
	}

	public DunningProcessMasterRepository getDunningProcessMasterRepository() {
		return dunningProcessMasterRepository;
	}

	public void setDunningProcessMasterRepository(DunningProcessMasterRepository dunningProcessMasterRepository) {
		this.dunningProcessMasterRepository = dunningProcessMasterRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public Customer findOne(Long id) {
		return customerRepository.findOne(id);
	}

	public int findByExampleRowCount(Customer customer) {
		Criteria criteria = getCustomerExampleCriteria(customer);
		Long rowCount = (Long) criteria.setProjection(Projections.rowCount()).uniqueResult();
		return rowCount.intValue();
	}

	public List<Customer> findByExample(Customer customer, int start, int count) {
		Criteria criteria = getCustomerExampleCriteria(customer);
		criteria.setFirstResult(start);
		criteria.setMaxResults(count);
		return criteria.list();
	}

	public Criteria getCustomerExampleCriteria(Customer customer) {
		Session session = (Session) entityManager.getDelegate();
		Example customerExample = Example.create(customer).ignoreCase().enableLike(MatchMode.ANYWHERE);
		Criteria criteria = session.createCriteria(Customer.class).add(customerExample);
		if (customer != null && customer.getCustomerType() != null)
			criteria.add(Restrictions.eq("customerType", customer.getCustomerType()));// createCriteria("customerType").add(Example.create(customer.getCustomerType())).addR;
		if (customer != null && customer.getCustomerGroup() != null)
			criteria.add(Restrictions.eq("customerGroup", customer.getCustomerGroup()));
		return criteria;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void updateCustomerInfoFromTecon(String guid,Long customerId,boolean contractDetails) {
		Customer customer = this.findOne(customerId);
		TeconCustomerInfoResponse response = commonProxyService.retrieveExternalCustomerInfo(guid,customerId,contractDetails);
		if (response != null && response.getResultCode() == 0 && response.getCustomer() != null) {
			TeconCustomerInfo teconCustomerInfo = response.getCustomer();
			if (customer == null)
				customer = new Customer(customerId);
			customer.setCustomerName(teconCustomerInfo.getCustomerName());
			customer.setStatus(teconCustomerInfo.getStatus());
			CustomerGroup group = customerGroupRepository.findOne((long) teconCustomerInfo.getCustomerGroupId());
			if (group == null) {
				group = new CustomerGroup((long) teconCustomerInfo.getCustomerGroupId(), teconCustomerInfo.getCustomerGroup());				
				customer.setCustomerGroup(group);
				customerGroupRepository.save(group);
			}
			customer.setCustomerGroup(group);
			// customer.setCustomerType(new CustomerT)
			Iterable<CustomerType> customerTypes = this.listAllCustomerTypes();
			for (CustomerType customerType : customerTypes) {
				if(customerType.getTypeName().equalsIgnoreCase(teconCustomerInfo.getRegisterType())){
					customer.setCustomerType(customerType);
				}
			}
			
			if (teconCustomerInfo.getActivationDate() != null)
				customer.setActivationDate(teconCustomerInfo.getActivationDate().toGregorianCalendar().getTime());

			if (teconCustomerInfo.getDeactivationDate() != null)
				customer.setDeactivationDate(teconCustomerInfo.getDeactivationDate().toGregorianCalendar().getTime());

			customer.setCustomerAddress(teconCustomerInfo.getCustomerAddress());
			customer.setCity(teconCustomerInfo.getCity());
			customer.setDistrict(teconCustomerInfo.getDistrict());
			customer.setTel1(teconCustomerInfo.getTel1());
			customer.setTel2(teconCustomerInfo.getTel2());
			customer.setMobil(teconCustomerInfo.getMobil());
			customer.setFax(teconCustomerInfo.getFax());
			if(teconCustomerInfo.getContractType()!=null)	customer.setContractType(teconCustomerInfo.getContractType());
			if (teconCustomerInfo.getFirstCdrDate() != null)
				customer.setFirstCdrDate(teconCustomerInfo.getFirstCdrDate().toGregorianCalendar().getTime());
			customer.setLastStatusUpdateDate(new Date());
			customer.setRegisterNumber(teconCustomerInfo.getRegisterNumber());
			this.saveCustomer(customer);
		}else{
			throw new RuntimeException(response.getResultCode()+" "+response.getResultDescription());
		}
	}

	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Customer updateCustomerStatusFromTecon(String guid,Long customerId) {
		Customer customer = this.findOne(customerId);
		if(customer==null)
			throw new RuntimeException(customerId+" "+Constants.CUSTOMER_ID_NOT_FOUND);
		TeconCustomerInfoResponse response = commonProxyService.retrieveExternalCustomerStatus(guid,customerId);
		if (response != null && response.getResultCode() == 0 && response.getCustomer() != null) {
			TeconCustomerInfo teconCustomerInfo = response.getCustomer();			
			customer.setStatus(teconCustomerInfo.getStatus());			
			customer.setLastStatusUpdateDate(new Date());
			this.saveCustomer(customer);
		}else{
			throw new RuntimeException(response.getResultCode()+" "+response.getResultDescription());
		}
		return customer;
	}
	 
	public List<Customer> listCustomerByCustomerIdList(Set<Long> customerIds){
		if(customerIds.size()==0)
			return null;
		return customerRepository.listCustomerByCustomerIdList(customerIds);
	}
	
	public void retrieveCustomerAggreement(String guid,Long customerId) {
		Customer customer = this.findOne(customerId);
		int response = commonProxyService.retrieveCustomerAgreementDocumentCount(guid,customerId);
		if(response==0){
			customer.setSozlesme(Constants.YOK);
		}else{
			customer.setSozlesme(Constants.VAR);
		}
		this.saveCustomer(customer);
	}
	
	public CustomerGroup getCustomerGroup(Long customerGroupId){
		return customerGroupRepository.findOne(customerGroupId);
	}
	
	
	
	
	public void retrieveCustomerTaksitCount(String guid,Long customerId) {
		Customer customer = this.findOne(customerId);
		int response = commonProxyService.retrieveCustomerTaksitCount(guid,customerId);
		customer.setTaksitSayisi(response);
		customerRepository.save(customer);
	}
	
	
	public void retrieveCustomerTicklerCount(String guid,Long customerId) {
		Customer customer = this.findOne(customerId);
		if(customer.getFirstCdrDate()!=null)
			return;
		int openTicklerCount = commonProxyService.getTicklerCount(customerId);	
		customer.setSikayetSayisi(openTicklerCount);
		customerRepository.save(customer);
	}
	
	public void retrieveCustomerHasCdr(String guid,Long customerId) {
		Customer customer = this.findOne(customerId);
		boolean hasCdr = commonProxyService.retrieveCustomerHasCdr(guid,customerId);
		if(hasCdr){
			Calendar cal =  GregorianCalendar.getInstance();
			cal.set(Calendar.YEAR, 1900);
			customer.setFirstCdrDate(cal.getTime());
			customerRepository.save(customer);
		}
	}
	
	public Iterable<CustomerType> listAllCustomerTypes() {
		return customerTypeRepository.findAll();
	}

	
	public Iterable<CustomerGroup> listAllCustomerGroups() {
		return customerGroupRepository.findAll();
	}

	public List<Customer> collectOverdueCustomers() {
		return customerRepository.collectOverdueCustomers();
	}

	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	public Object[] findByTheCustomerById(Long id) {
		return customerRepository.findByTheCustomerById(id);
	}
}
