/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.milleni.dunning.ui.customer;

import java.util.ArrayList;
import java.util.List;

import org.activiti.explorer.data.AbstractLazyLoadingQuery;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.service.CustomerService;
import org.milleni.dunning.datamodel.util.DaoHelper;
import org.springframework.util.StringUtils;

import com.vaadin.data.Item;

/**
 * @author Joram Barrez
 */
public class CustomerListLazyLoadinQuery extends AbstractLazyLoadingQuery {

	private CustomerService customerService;
	private Customer customer = null;
	private Long customerId = null;
	private String customerName = null;
	
	private int maxSize = 50;
	
	public CustomerListLazyLoadinQuery() {
		this.customerService = DaoHelper.getInstance().getCustomerService();
	}

	public List<Item> loadItems(int start, int count) {
		List<Item> customerItems = new ArrayList<Item>();
		if(customer!=null){
			if(customer.getCustomerId() != null){
				customerItems.add( new CustomerTableListItem(customerService.findOne(customer.getCustomerId())));
				return customerItems;
			}
			List<Customer> customerList = customerService.findByExample(customer,start,count);
			for (Customer customer : customerList) {
				customerItems.add(new CustomerTableListItem(customer));
			}
			return customerItems;
		}
		
		Iterable<Customer> customerList = customerService.listCustomer(start,count);
		for (Customer cust : customerList) {
			customerItems.add(new CustomerTableListItem(cust));
		}
		return customerItems;
	}

	public Item loadSingleResult(String id) {
		return new CustomerTableListItem(customerService.findOne(Long.parseLong(id)));
	}

	public void setSorting(Object[] propertyIds, boolean[] ascending) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int size() {
		if(customer!=null){
			if(customer.getCustomerId() != null){
				return customerService.findOne(customer.getCustomerId()) !=null ? 1:0;
			}
			return  customerService.findByExampleRowCount(customer);
		}
		return maxSize;	
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	

	

}
