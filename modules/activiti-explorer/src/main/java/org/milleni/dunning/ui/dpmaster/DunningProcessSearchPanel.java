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

package org.milleni.dunning.ui.dpmaster;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.activiti.engine.ProcessEngines;
import org.activiti.engine.TaskService;
import org.activiti.explorer.ExplorerApp;
import org.activiti.explorer.I18nManager;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.DunningPolicy;
import org.milleni.dunning.datamodel.model.DunningPolicySteps;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.model.DunningProcessMasterStatus;
import org.milleni.dunning.datamodel.model.ProcessSteps;
import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.datamodel.util.DaoHelper;
import org.springframework.util.StringUtils;

import com.vaadin.data.Item;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.data.util.BeanItem;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.util.PropertyFormatter;
import com.vaadin.event.Action;
import com.vaadin.event.Action.Handler;
import com.vaadin.event.ShortcutAction;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.DateField;
import com.vaadin.ui.DefaultFieldFactory;
import com.vaadin.ui.Field;
import com.vaadin.ui.Form;
import com.vaadin.ui.FormFieldFactory;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.themes.Reindeer;

/**
 * Header that is shown on top of each task list, which allows the quick
 * creation of new tasks.
 * 
 * @author Frederik Heremans
 * @author Joram Barrez
 */
public class DunningProcessSearchPanel extends Panel {

	private static final long serialVersionUID = 1L;

	protected I18nManager i18nManager;
	protected transient TaskService taskService;

	protected TextField inputField;
	
	private ComboBox policyCombo ;
	private ComboBox stepCombo ;
	private ComboBox currentStepCombo ;
	private ComboBox nextStepCombo ;
	private ComboBox statusCombo ;
	
	private DateField processStartDate;
	private DateField processStartEnd;
	
	private DateField nextStepDateStart;
	private DateField nextStepDateEnd;

	private DateField invoiceDateStart;
	private DateField invoiceDateEnd;
	
	private DateField processStatusDateStart;
	private DateField processStatusDateEnd;
	


	private DunningProcessPage dunningProcessPage;
	
	FormLayout formLayout = null;
	
	TextField txtCustomerId =  null;
	TextField txtCustomerName =  null;
	
	private DunningProcessMaster dpMaster = null;

	public DunningProcessSearchPanel(DunningProcessPage dunningProcessPage) {
		this.dunningProcessPage = dunningProcessPage;
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
		
		dpMaster = new DunningProcessMaster();
				
		Form dpSearchForm = new Form();
		
		dpSearchForm.setFormFieldFactory(new FormFieldFactory() {
			@SuppressWarnings("serial")
			@Override
		    public Field createField(Item item, Object propertyId,  Component uiContext) {
		        Field field = DefaultFieldFactory.get().createField(item, propertyId, uiContext);
		         if (field instanceof TextField) {
		             ((TextField) field).setNullRepresentation("");
		         }
		         
		         if("dunningPolicyId".equals(propertyId)){
		        	    List<DunningPolicy> dunningPolicyList = new ArrayList<DunningPolicy>();
		        	    Iterable<DunningPolicy> dunningPolicies= DaoHelper.getInstance().getDunningPolicyRepository().findAll();
		        	    for (DunningPolicy dunningPolicy : dunningPolicies) {
		        	    	dunningPolicyList.add(dunningPolicy);
						}
		        	    BeanItemContainer<DunningPolicy> objects = new BeanItemContainer(DunningPolicy.class, dunningPolicyList);

		        	   
		        	   policyCombo = new ComboBox(i18nManager.getMessage(Constants.DUNNING_POLICY_TYPE), objects);
		        	   policyCombo.addListener(new ValueChangeListener() {
		        		   
		        		    @Override
		        	        public void valueChange(ValueChangeEvent event) {
		        	        	DunningPolicy selectedDunningPolicy = (DunningPolicy) event.getProperty().getValue();
		        	        	List<ProcessSteps> processSteps =  DaoHelper.getInstance().getDunningPolicyRepository().retrieveDunningProcessSteps(selectedDunningPolicy.getPolicyId());		        	        	
		        	        	BeanItemContainer<ProcessSteps> objects = new BeanItemContainer(ProcessSteps.class, processSteps);
		        	        	stepCombo.setContainerDataSource(objects); 
		        	        	nextStepCombo.setContainerDataSource(objects); 
		        	        	currentStepCombo.setContainerDataSource(objects);
		        	        }
		        		    
		        	      }); 
		        	    policyCombo.setItemCaptionPropertyId("policyName");
		        	    return policyCombo;
		         }else if("currentStepId".equals(propertyId)){		        	   
		        	 	currentStepCombo = new ComboBox(i18nManager.getMessage(Constants.DUNNING_POLICY_CURRENT_STEP));		        	   
		        	 	currentStepCombo.setItemCaptionPropertyId("stepText");
		        	    return currentStepCombo;
		         }else if("processLastStepId".equals(propertyId)){		        	   
		        	    stepCombo = new ComboBox(i18nManager.getMessage(Constants.DUNNING_POLICY_LAST_STEP));		        	   
		        	    stepCombo.setItemCaptionPropertyId("stepText");
		        	    return stepCombo;
		         }else if("nextStepId".equals(propertyId)){		        	   
		        	 	nextStepCombo = new ComboBox(i18nManager.getMessage(Constants.DUNNING_NEXT_STEP));		        	   
		        	 	nextStepCombo.setItemCaptionPropertyId("stepText");
		        	    return nextStepCombo;
		         }
		         else if("status".equals(propertyId)){		        	   
		        	 	statusCombo = new ComboBox(i18nManager.getMessage(Constants.DUNNING_PROCESS_STATUS));
		        	 	statusCombo.setItemCaptionPropertyId("statusText");
		        	 	List<DunningProcessMasterStatus> statusList = DaoHelper.getInstance().getDunningPolicyRepository().retrieveAllDunningProcessMasterStatus();
		        	 	BeanItemContainer<DunningProcessMasterStatus> objects = new BeanItemContainer(DunningProcessMasterStatus.class, statusList);
		        	 	statusCombo.setContainerDataSource(objects); 
		        	    return statusCombo;
		         }else if("customerId".equals(propertyId)){		
		        	 txtCustomerId = (TextField) field;
		        	 txtCustomerId.setCaption(i18nManager.getMessage(Constants.CUSTOMER_ID));
		        	 txtCustomerId.setPropertyDataSource(new PropertyFormatter() {
						
						@Override
						public Object parse(String formattedValue) throws Exception {
								if(StringUtils.hasText(formattedValue))
									try {
										return new Customer(Long.parseLong(formattedValue));
									} catch (Exception e) {
										return null;
									}
									
								else
									return null;
						}
						
						@Override
						public String format(Object value) {
							 if(value instanceof Customer)
								 return String.valueOf( ((Customer)value).getCustomerId());
							 return String.valueOf(value);
						}
					});
		        	 return txtCustomerId;
		         }
		         
		        return field;
		    }
			
		});
		
		BeanItem<DunningProcessMaster> item = new BeanItem<DunningProcessMaster>(dpMaster,new String[]{"dunningPolicyId","currentStepId","processLastStepId","nextStepId","customerId","status"});
		dpSearchForm.setItemDataSource(item);
		
      	nextStepDateStart  = new DateField(i18nManager.getMessage(Constants.DUNNING_NEXT_STEP_DATE_START));
      	nextStepDateStart.setDateFormat("dd.MM.yyyy");
      	
      	nextStepDateEnd  = new DateField(i18nManager.getMessage(Constants.DUNNING_NEXT_STEP_DATE_END));
      	nextStepDateEnd.setDateFormat("dd.MM.yyyy");
      	
      	processStartDate  = new DateField(i18nManager.getMessage(Constants.DUNNING_PROCESS_DATE_START));
      	processStartDate.setDateFormat("dd.MM.yyyy");
      	
      	processStartEnd  = new DateField(i18nManager.getMessage(Constants.DUNNING_PROCESS_DATE_END));
      	processStartEnd.setDateFormat("dd.MM.yyyy");
      	
      	
      	processStatusDateStart  = new DateField(i18nManager.getMessage(Constants.DUNNING_PROCESS_STATUS_DATE_START));
      	processStatusDateStart.setDateFormat("dd.MM.yyyy");
      	
      	processStatusDateEnd  = new DateField(i18nManager.getMessage(Constants.DUNNING_PROCESS_STATUS_DATE_END));
      	processStatusDateEnd.setDateFormat("dd.MM.yyyy");
      	
      	
      	invoiceDateStart  = new DateField(i18nManager.getMessage(Constants.DUNNING_INVOICE_DATE_START));
      	invoiceDateStart.setDateFormat("dd.MM.yyyy");
      	
      	invoiceDateEnd  = new DateField(i18nManager.getMessage(Constants.DUNNING_INVOICE_DATE_END));
      	invoiceDateEnd.setDateFormat("dd.MM.yyyy");
      	
      	
      	
		//dpSearchForm.addField(processStartFinishDate, processStartFinishDate);
		
		FormLayout layout = (FormLayout)dpSearchForm.getLayout();
		layout.addComponent(nextStepDateStart);
		layout.addComponent(nextStepDateEnd);
		layout.addComponent(processStartDate);
		layout.addComponent(processStartEnd);
		layout.addComponent(processStatusDateStart);
		layout.addComponent(processStatusDateEnd);
		layout.addComponent(invoiceDateStart);
		layout.addComponent(invoiceDateEnd);
		
		formLayout.addComponent(dpSearchForm);
		setContent(formLayout);
	}

	protected void initKeyboardListener() {
		addActionHandler(new Handler() {
			public void handleAction(Action action, Object sender, Object target) {
				DunningProcessListLazyLoadinQuery query = new DunningProcessListLazyLoadinQuery();
				
				if(nextStepDateStart.getValue()!=null) query.setNextStepDateStart((Date)nextStepDateStart.getValue());
				if(nextStepDateEnd.getValue()!=null) query.setNextStepDateEnd((Date)nextStepDateEnd.getValue());
				
				if(processStartDate.getValue()!=null) query.setProcessStartDateStart((Date)processStartDate.getValue());
				if(processStartEnd.getValue()!=null) query.setProcessStartDateEnd((Date)processStartEnd.getValue());
				
				
				if(processStatusDateStart.getValue()!=null) query.setStatusDateStart((Date)processStatusDateStart.getValue());
				if(processStatusDateEnd.getValue()!=null) query.setStatusDateEnd((Date)processStatusDateEnd.getValue());
				
				
				if(invoiceDateStart.getValue()!=null) query.setInvoiceDateStart((Date)invoiceDateStart.getValue());
				if(invoiceDateEnd.getValue()!=null) query.setInvoiceDateEnd((Date)invoiceDateEnd.getValue());
				
				
				if(dpMaster!=null){
					query.setDpMaster(dpMaster);
				}
				dunningProcessPage.setDetailComponent(query);	
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
	
	
	public class Status{
		String code;
		String text;
		
		public Status(String code,String text){
			this.code= code;
			this.text = text;
		}

		public String getCode() {
			return code;
		}

		public String getText() {
			return text;
		}
		
		
	}

}
