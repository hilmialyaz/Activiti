package org.milleni.dunning.datamodel.service;

import java.util.List;
import java.util.Set;

import org.milleni.dunning.datamodel.dao.CustomerRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerGroup;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.CustomerType;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.springframework.cache.annotation.Cacheable;

public interface CustomerService {
	public Iterable<Customer> listCustomer();
	public void setCustomerRepository(CustomerRepository customerRepository);
	public List<CustomerInvoices> listCustomerInvoices(Long customerId);
	public List<DunningProcessMaster> listCustomerDunningProcesses(Long customerId);
	public Iterable<Customer> listCustomer(int page, int pageSize);
	public long customerCount();
	public Customer findOne(Long id);
	public CustomerGroup getCustomerGroup(Long customerGroupId);
	public List<Customer> findByExample(Customer customer,int start, int count) ;
	public int findByExampleRowCount(Customer customer);
	
	public Object[] findByTheCustomerById(Long id);
	
	@Cacheable(value="constants.cache", key="{#root.methodName,#listAllCustomerTypes}")
	public Iterable<CustomerType> listAllCustomerTypes();
	
	@Cacheable(value="constants.cache", key="{#root.methodName,#listAllCustomerGroups}")
	public Iterable<CustomerGroup> listAllCustomerGroups();
	public List<Customer> collectOverdueCustomers();
	public void saveCustomer(Customer customer);
	
	public void retrieveCustomerAggreement(String guid,Long customerId) ;
	public void retrieveCustomerTaksitCount(String guid ,Long customerId);
	
	public List<Customer> listCustomerByCustomerIdList(Set<Long> customerIds);
	
	public void retrieveCustomerTicklerCount(String guid,Long customerId);
	public void retrieveCustomerHasCdr(String guid,Long customerId) ;
	public void updateCustomerInfoFromTecon(String guid,Long customerId,boolean contractDetails) ;
	public Customer updateCustomerStatusFromTecon(String guid,Long customerId) ;
}
