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

import org.activiti.engine.ProcessEngines;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.activiti.explorer.ExplorerApp;
import org.activiti.explorer.I18nManager;
import org.activiti.explorer.Messages;
import org.activiti.explorer.ui.mainlayout.ExplorerLayout;
import org.activiti.explorer.util.StringUtil;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerGroup;
import org.milleni.dunning.datamodel.model.CustomerType;
import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.datamodel.util.DaoHelper;
import org.springframework.util.StringUtils;

import com.vaadin.data.Item;
import com.vaadin.data.util.BeanItem;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.util.MethodProperty;
import com.vaadin.data.util.NestedMethodProperty;
import com.vaadin.data.util.PropertyFormatter;
import com.vaadin.event.Action;
import com.vaadin.event.Action.Handler;
import com.vaadin.event.ShortcutAction;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.DefaultFieldFactory;
import com.vaadin.ui.Field;
import com.vaadin.ui.Form;
import com.vaadin.ui.FormFieldFactory;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.Reindeer;

/**
 * Header that is shown on top of each task list, which allows the quick
 * creation of new tasks.
 * 
 * @author Frederik Heremans
 * @author Joram Barrez
 */
public class CustomerSearchPanel extends Panel {

	private static final long serialVersionUID = 1L;

	protected I18nManager i18nManager;
	protected transient TaskService taskService;

	protected TextField inputField;
	

	private CustomerPage customerPage;
	
	FormLayout formLayout = null;
	
	TextField txtCustomerId =  null;
	TextField txtCustomerName =  null;
	
	private Customer customer = null;

	public CustomerSearchPanel(CustomerPage customerPage) {
		this.customerPage = customerPage;
		this.i18nManager = ExplorerApp.get().getI18nManager();
		this.taskService = ProcessEngines.getDefaultProcessEngine().getTaskService();

		addStyleName(Reindeer.PANEL_LIGHT);
		//addStyleName(ExplorerLayout.STYLE_SEARCHBOX);
		
		initInputField();
		initKeyboardListener();

		// initSortMenu();
	}

	protected void initInputField() {
		/*
		
		BeanFieldGroup<Customer>personBinder = new BeanFieldGroup<Customer>(PersonVo.class);
		personBinder.setItemDataSource(person);
		myFormLayout.addComponent(personBinder.buildAndBind("Firstname", "firstName"));
		myFormLayout.addComponent(personBinder.buildAndBind("Country", "country.name"));
		
		*/
		
		formLayout = new FormLayout();

		//txtCustomerId = new TextField(i18nManager.getMessage(Constants.CUSTOMER_ID));
		//formLayout.addComponent(txtCustomerId);

		txtCustomerName = new TextField(i18nManager.getMessage(Constants.CUSTOMER_NAME));
		//formLayout.addComponent(txtCustomerName);
		

		formLayout.setWidth(100, UNITS_PERCENTAGE); // 99, otherwise the Panel will
												// display scrollbars
		//formLayout.setSpacing(true);
		//formLayout.setMargin(false, false, true, true);
		
		customer = new Customer();
				
		Form customerSearchForm = new Form();
		
		customerSearchForm.setFormFieldFactory(new FormFieldFactory() {
			@Override
		    public Field createField(Item item, Object propertyId,  Component uiContext) {
		        Field field = DefaultFieldFactory.get().createField(item, propertyId, uiContext);
		         if (field instanceof TextField) {
		             ((TextField) field).setNullRepresentation("");
		         }
		         
		         if ("customerId".equals(propertyId)) {
		        	 ((TextField) field).setCaption(i18nManager.getMessage(Constants.CUSTOMER_ID));
		        	 txtCustomerId = (TextField) field;
		        	 ((TextField) field).setPropertyDataSource(new PropertyFormatter() {
						
						@Override
						public Object parse(String formattedValue) throws Exception {
								if(StringUtils.hasText(formattedValue))
									try {
										return Long.parseLong(formattedValue);
									} catch (Exception e) {
										return null;
									}
									
								else
									return null;
						}
						
						@Override
						public String format(Object value) {
							 return String.valueOf(value);
						}
					});
		        	 
		         }
		         else if ("customerName".equals(propertyId)) {
		        	 ((TextField) field).setCaption(i18nManager.getMessage(Constants.CUSTOMER_NAME));
		         }else if("customerType".equals(propertyId)){
		        	    List<CustomerType> customerTypesList = new ArrayList<CustomerType>();
		        	    Iterable<CustomerType> types = DaoHelper.getInstance().getCustomerService().listAllCustomerTypes();
		        	    for (CustomerType customerType : types) {
		        	    	customerTypesList.add(customerType);
						}
		        	    BeanItemContainer<CustomerType> objects = new BeanItemContainer(CustomerType.class, customerTypesList);

		        	    ComboBox combo = new ComboBox(i18nManager.getMessage(Constants.CUSTOMER_TYPE), objects);
		        	    combo.setItemCaptionPropertyId("typeName");
		        	    return combo;
		         }else if("customerGroup".equals(propertyId)){
		        	    List<CustomerGroup> customerGroupList = new ArrayList<CustomerGroup>();
		        	    Iterable<CustomerGroup> groups = DaoHelper.getInstance().getCustomerService().listAllCustomerGroups();
		        	    for (CustomerGroup customerGroup : groups) {
		        	    	customerGroupList.add(customerGroup);
						}
		        	    BeanItemContainer<CustomerGroup> objects = new BeanItemContainer(CustomerGroup.class, customerGroupList);

		        	    ComboBox combo = new ComboBox(i18nManager.getMessage(Constants.CUSTOMER_GROUP), objects);
		        	    combo.setItemCaptionPropertyId("groupName");
		        	    return combo;
		         }
		        return field;
		    }
			
		});
		
		BeanItem<Customer> item = new BeanItem<Customer>(customer,new String[]{"customerId","customerName","customerType","customerGroup"});
		//item.addItemProperty(i18nManager.getMessage(Constants.CUSTOMER_ID), new NestedMethodProperty(customer, "customerId"));
		customerSearchForm.setItemDataSource(item);
		
		formLayout.addComponent(customerSearchForm);
		
		setContent(formLayout);
		
		
	}

	protected void initKeyboardListener() {
		addActionHandler(new Handler() {
			public void handleAction(Action action, Object sender, Object target) {
				CustomerListLazyLoadinQuery query = new CustomerListLazyLoadinQuery();
				/*
				if(txtCustomerId!=null ){
					try {
						Long customerId = Long.parseLong(txtCustomerId.getValue().toString());
					} catch (Exception e) {
						customer.setCustomerId(null);
						txtCustomerId.setValue("");
					}
					//customer.setCustomerId(Long.parseLong(txtCustomerId.getValue().toString()));
				}*/
				if (customer != null)
					query.setCustomer(customer);
				//customer.setCustomerType(new CustomerType(1l));
				customerPage.setDetailComponent(query);
			}

			public Action[] getActions(Object target, Object sender) {
				return new Action[] { new ShortcutAction("enter", ShortcutAction.KeyCode.ENTER, null) };
			}
		});
	}



	@Override
	public void focus() {
		txtCustomerId.focus();
	}
	
	 
}
