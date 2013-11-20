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
package org.activiti.explorer.ui.task;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.activiti.explorer.ExplorerApp;
import org.activiti.explorer.I18nManager;
import org.activiti.explorer.data.LazyLoadingContainer;
import org.activiti.explorer.data.LazyLoadingQuery;
import org.activiti.explorer.navigation.TaskNavigator;
import org.activiti.explorer.navigation.UriFragment;
import org.activiti.explorer.ui.Images;
import org.activiti.explorer.ui.mainlayout.ExplorerLayout;
import org.activiti.explorer.ui.task.data.CustomerInboxListQuery;
import org.activiti.explorer.ui.task.data.TaskListItem;
import org.activiti.explorer.ui.util.ThemeImageColumnGenerator;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.service.CustomerService;
import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.datamodel.util.DaoHelper;

import com.vaadin.data.util.ObjectProperty;
import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.AbstractSelect;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.Field;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.ColumnGenerator;
import com.vaadin.ui.Table.HeaderClickEvent;
import com.vaadin.ui.Table.HeaderClickListener;

/**
 * The page displaying all tasks currently in ones inbox.
 * 
 * @author Joram Barrez
 */
public class CustomerInboxPage extends TaskPage {

	private static final long serialVersionUID = 1L;

	private CustomerService customerService;
	protected I18nManager i18nManager;
	

	public CustomerInboxPage() {
		this.customerService = DaoHelper.getInstance().getCustomerService();
		this.i18nManager = ExplorerApp.get().getI18nManager();
	}

	/**
	 * Constructor called when page is accessed straight through the url, eg.
	 * /task/id=123
	 */
	public CustomerInboxPage(String taskId) {
		super(taskId);
	}

	@Override
	protected LazyLoadingQuery createLazyLoadingQuery() {
		return new CustomerInboxListQuery();
	}

	@Override
	protected UriFragment getUriFragment(String taskId) {
		UriFragment taskFragment = new UriFragment(TaskNavigator.TASK_URI_PART);

		if (taskId != null) {
			taskFragment.addUriPart(taskId);
		}

		taskFragment.addParameter(TaskNavigator.PARAMETER_CATEGORY, TaskNavigator.CATEGORY_INBOX);
		return taskFragment;
	}

	@Override
	protected Table createList() {
		showEvents = true;
		taskTable = new Table();
		taskTable.addStyleName(ExplorerLayout.STYLE_TASK_LIST);
		taskTable.addStyleName(ExplorerLayout.STYLE_SCROLLABLE);

		// Listener to change right panel when clicked on a task
		taskTable.addListener(getListSelectionListener());

		this.lazyLoadingQuery = createLazyLoadingQuery();
		this.taskListContainer = new LazyLoadingContainer(lazyLoadingQuery, 50);
		taskTable.setContainerDataSource(taskListContainer);

		// Create column header
		taskTable.addGeneratedColumn("icon", new ThemeImageColumnGenerator(Images.TASK_22));
		taskTable.setColumnWidth("icon", 22);

		taskTable.addContainerProperty("name", String.class, null);
		taskTable.addContainerProperty("customerName", String.class,"",i18nManager.getMessage(Constants.CUSTOMER_NAME),null,Table.ALIGN_LEFT);
		taskTable.addContainerProperty("customerGroup", String.class,"",i18nManager.getMessage(Constants.CUSTOMER_GROUP),null,Table.ALIGN_LEFT);
		taskTable.addContainerProperty("totalAmount", Double.class,"",i18nManager.getMessage(Constants.CUSTOMER_DEBIT),null,Table.ALIGN_LEFT);
		taskTable.addContainerProperty("customerStatus", String.class,"",i18nManager.getMessage(Constants.CUSTOMER_STATUS),null,Table.ALIGN_LEFT);
		taskTable.addContainerProperty("customerType", String.class,"",i18nManager.getMessage(Constants.CUSTOMER_TYPE),null,Table.ALIGN_LEFT);
		// taskTable.setColumnHeaderMode(Table.COLUMN_HEADER_MODE_HIDDEN);

		mapCheckBox = new HashMap<Object, CheckBox>();

		taskTable.addGeneratedColumn("checkbox", new ColumnGenerator() {

			public Object generateCell(Table source, Object itemId, Object columnId) {
				Field field = new CheckBox();
				((AbstractComponent) field).setImmediate(true);
				mapCheckBox.put(itemId, (CheckBox) field);
				return field;
			}
		});

		HeaderClickListener headerClickListener = new HeaderClickListener() {

			@Override
			public void headerClick(HeaderClickEvent event) {
				// TODO Auto-generated method stub
				LinkedList<Integer> container = (LinkedList<Integer>) taskTable.getVisibleItemIds();
				System.out.println(container);
				for (Integer intIds : container) {

					CheckBox check = mapCheckBox.get(intIds);
					check.setValue(!checked);
					System.out.println(check);
				}
				checked = !checked;

			}
		};

		taskTable.addListener(headerClickListener);
		return taskTable;
	}

	public TaskEventsPanel getTaskEventPanel() {
		/*
		if (taskTable != null) {
			System.out.println(taskTable.size());
			LinkedList<Integer> container = (LinkedList<Integer>) taskTable.getVisibleItemIds();
			Map<Long, TaskListItem> customerIdMap = new HashMap<Long, TaskListItem>();
			for (Integer intIds : container) {
				TaskListItem taskTT = (TaskListItem) taskTable.getItem(intIds);
				 Map<String, Object> localVars = taskTT.getTask().getTaskLocalVariables();
				 Map<String, Object> globalVars = taskTT.getTask().getProcessVariables();
				String taskName = (String) taskTable.getContainerProperty(intIds, "name").getValue();
				if (taskName != null && taskName.indexOf("{Müsteri No:") > 0) {
					// {Müsteri No: 9003801 }
					int parantez1 = taskName.indexOf("{M");
					int ikiNokta = taskName.indexOf(":", parantez1);
					int parantez2 = taskName.indexOf("}", ikiNokta);
					String strTaskId = taskName.substring(ikiNokta + 1, parantez2).trim();

					customerIdMap.put(Long.parseLong(strTaskId), taskTT);
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
		}
		*/
		return null;
	}

	protected void addSelectComponent() {
		AbstractSelect select = createSelectComponent();
		grid.setColumnExpandRatio(0, .50f);
		grid.setColumnExpandRatio(1, .50f);
		if (select != null) {
			grid.addComponent(select, 0, 2);
		}
	}
}
