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
package org.activiti.explorer.ui.task.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.activiti.engine.task.TaskQuery;
import org.activiti.explorer.ExplorerApp;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.service.CustomerService;
import org.milleni.dunning.datamodel.util.DaoHelper;

import com.vaadin.data.Item;
import com.vaadin.data.util.ObjectProperty;

/**
 * @author Joram Barrez
 */
public class CustomerInboxListQuery extends AbstractTaskListQuery {

	protected transient RuntimeService runtimeService;
	
	private CustomerService customerService;
	
	Map<Long, TaskListItem> customerIdMap = new HashMap<Long, TaskListItem>();
	
	public CustomerInboxListQuery() {
	    super();
	    this.runtimeService = ProcessEngines.getDefaultProcessEngine().getRuntimeService();
	    this.customerService = DaoHelper.getInstance().getCustomerService();
	}
	 
	 
	private String customerIdText = "customerId"; 
	
	@Override
	protected TaskQuery getQuery() {
		return taskService.createTaskQuery().taskAssignee(userId).processVariableValueNotEquals("customerId", 0l);
	}

	public List<Item> loadItems(int start, int count) {
		List<Task> tasks = getQuery().listPage(start, count);
		List<Item> items = new ArrayList<Item>();
		for (Task task : tasks) {
			TaskListItem taskListItem = new TaskListItem(task);
			items.add(taskListItem);
			 if(task.getExecutionId() != null && runtimeService.hasVariable(task.getExecutionId(), customerIdText)) {
		          Long customerId  = (Long)runtimeService.getVariable(task.getExecutionId(), customerIdText);
		          customerIdMap.put(customerId, taskListItem);	          
		     }
		}
		
		List<Customer> customerList = customerService.listCustomerByCustomerIdList(customerIdMap.keySet());
		if (customerList != null)
			for (Customer customer : customerList) {
				if (customerIdMap.containsKey(customer.getCustomerId())) {
					TaskListItem taskListItem = customerIdMap.get(customer.getCustomerId());
					taskListItem.addItemProperty("customerName", new ObjectProperty<String>(customer.getCustomerName(), String.class));
					taskListItem.addItemProperty("customerGroup", new ObjectProperty<String>(customer.getCustomerGroup()!=null ? customer.getCustomerGroup().getGroupName():"", String.class));
					taskListItem.addItemProperty("totalAmount", new ObjectProperty<Double>(customer.getCurrentDebit(), Double.class));
					taskListItem.addItemProperty("customerStatus", new ObjectProperty<String>(customer.getStatus(), String.class));
					taskListItem.addItemProperty("customerType", new ObjectProperty<String>(customer.getCustomerType()!=null ? customer.getCustomerType().getTypeName() :"" , String.class));
				}
			}
		
		return items;
	}

	public Item loadSingleResult(String id) {
		Task task = getQuery().taskId(id).singleResult();
		if (task != null) {
			return new TaskListItem(task);
		}
		return null;
	}
}
