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
package org.milleni.dunning.ui.customer.form;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.activiti.explorer.ExplorerApp;
import org.activiti.explorer.I18nManager;
import org.activiti.explorer.Messages;
import org.activiti.explorer.ui.Images;
import org.activiti.explorer.ui.custom.PrettyTimeLabel;
import org.activiti.explorer.ui.mainlayout.ExplorerLayout;
import org.activiti.explorer.ui.process.simple.editor.table.PropertyTable;
import org.activiti.explorer.ui.process.simple.editor.table.TaskFormModel;
import org.activiti.explorer.ui.util.ThemeImageColumnGenerator;
import org.activiti.workflow.simple.definition.FormDefinition;
import org.activiti.workflow.simple.definition.FormPropertyDefinition;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessDetailLogs;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.util.DaoHelper;
import org.milleni.dunning.ui.customer.component.InvoiceTableComponent;

import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

/**
 * @author Joram Barrez
 */
public class CustomerDetailPopupWindow extends Window {

	protected static final long serialVersionUID = -1754225937375971709L;

	protected static final String TITLE = "Müşteri Detayı";
	protected static final String DESCRIPTION = "";

	protected Object taskItemId;
	protected TaskFormModel formModel;
	
	
	private Table processStepTable;
	HorizontalLayout dunningProcessLayout; 
	protected Table duningProcessTable;
	
	private Long customerId;
	private Customer customer = null;
	//List<CustomerInvoices> invoiceList = null;
	List<DunningProcessMaster> dngProcessList = null;
	protected I18nManager i18nManager;
	private InvoiceTableComponent invoiceTable;
	
	public CustomerDetailPopupWindow(Long customerId) {
		this.customerId = customerId;
		customer = DaoHelper.getInstance().getCustomerService().findOne(customerId);
		//invoiceList = DaoHelper.getInstance().getCustomerService().listCustomerInvoices(customerId);
		dngProcessList = DaoHelper.getInstance().getCustomerService().listCustomerDunningProcesses(customerId);
		this.i18nManager = ExplorerApp.get().getI18nManager();
		//ddInvoices(invoiceList);
		invoiceTable = new InvoiceTableComponent(customerId);
		
		addDunningProcessMaster(dngProcessList);
		setModal(true);
		setWidth("50%");
		center();
		setCaption(TITLE);

		initUi();
	}

	protected void initUi() {
		VerticalLayout layout = new VerticalLayout();
		layout.setSpacing(true);
		addComponent(layout);

		// Description
		layout.addComponent(new Label("Müşteri Adı: "));
		layout.addComponent(invoiceTable);

		layout.addComponent(new Label("Faturalar "));
		layout.addComponent(dunningProcessLayout);

	}
	
	
	
	protected void addDunningProcessMaster(List<DunningProcessMaster> dngPrcsMasterList) {

		dunningProcessLayout = new HorizontalLayout();
		dunningProcessLayout.setSpacing(true);
		dunningProcessLayout.setWidth(100, UNITS_PERCENTAGE);
		
		duningProcessTable = new Table();
		duningProcessTable.addStyleName(ExplorerLayout.STYLE_PROCESS_INSTANCE_TASK_LIST);
		duningProcessTable.setWidth(100, UNITS_PERCENTAGE);
		duningProcessTable.setHeight(250, UNITS_PIXELS);
		duningProcessTable.setEditable(false);
		duningProcessTable.setImmediate(true);
		duningProcessTable.setSelectable(true);
		duningProcessTable.setNullSelectionAllowed(false);
		duningProcessTable.setSortDisabled(true);
		//duningProcessTable.setSizeFull();
	    

		if (dngPrcsMasterList.size() > 0) {

			duningProcessTable.addContainerProperty("id", Long.class, null, i18nManager.getMessage(Messages.ADMIN_FINISHED), null, Table.ALIGN_CENTER);
			duningProcessTable.addContainerProperty("status", String.class, null, i18nManager.getMessage(Messages.TASK_NAME), null, Table.ALIGN_LEFT);
			duningProcessTable.addContainerProperty("statusDate", Date.class, null, i18nManager.getMessage(Messages.TASK_DUEDATE), null, Table.ALIGN_LEFT);

			dunningProcessLayout.addComponent(duningProcessTable);

			for (DunningProcessMaster dnngPMaster : dngPrcsMasterList) {
				Item item = duningProcessTable.addItem(dnngPMaster.getProcessId());
				item.getItemProperty("id").setValue(dnngPMaster.getProcessId());
				item.getItemProperty("status").setValue(dnngPMaster.getStatusDate());
				item.getItemProperty("statusDate").setValue(dnngPMaster.getStatusDate());
			}
			duningProcessTable.setPageLength(duningProcessTable.size());
			duningProcessTable.addListener(new Property.ValueChangeListener() {
				private static final long serialVersionUID = 1L;

				public void valueChange(ValueChangeEvent event) {
					Item item = duningProcessTable.getItem(event.getProperty().getValue()); 
					
					if (item != null) {
						Long dunningProcessMasterId = Long.parseLong(item.getItemProperty("id").getValue().toString());
						List<DunningProcessDetail> dngProcessDetailList = DaoHelper.getInstance().getDunningProcessService().listCustomerDunningProcessDetails(dunningProcessMasterId);	
						
						if(processStepTable!=null){
							dunningProcessLayout.removeComponent(processStepTable);
						}
						createProcessStepList(dngProcessDetailList);
						dunningProcessLayout.addComponent(processStepTable);
						
					}
				}
			});
			createProcessStepList(dngPrcsMasterList.get(0).getDunningProcessDetailCollection());
			dunningProcessLayout.addComponent(processStepTable);
			
		} else {
		
		}
	}
	
	
	
	  
	  protected Table createProcessStepList(Collection<DunningProcessDetail>  processDetails) {
	    processStepTable = new Table();
	    processStepTable.addStyleName(ExplorerLayout.STYLE_PROCESS_DEFINITION_LIST);
	    
	    // Set non-editable, selectable and full-size
	    processStepTable.setEditable(false);
	    processStepTable.setImmediate(true);
	    processStepTable.setSelectable(true);
	    processStepTable.setNullSelectionAllowed(false);
	    processStepTable.setSortDisabled(true);
	    processStepTable.setSizeFull();
	    
	    
	    
	    processStepTable.addGeneratedColumn("icon", new ThemeImageColumnGenerator(Images.PROCESS_22));
	    processStepTable.setColumnWidth("icon", 22);
	    
	    processStepTable.addContainerProperty("name", String.class, null);
	    processStepTable.addContainerProperty("log", String.class, null);
	    processStepTable.setColumnHeaderMode(Table.COLUMN_HEADER_MODE_HIDDEN);
	    
	    
		for (DunningProcessDetail dunningProcessDetail : processDetails) {
			Item item = processStepTable.addItem(dunningProcessDetail.getProcessDetailId());
			item.getItemProperty("name").setValue(dunningProcessDetail.getProcessStepId().getStepName());
			Collection<DunningProcessDetailLogs> logs= dunningProcessDetail.getDunningProcessDetailLogsCollection();
			String logText ="";
			for (DunningProcessDetailLogs dunningProcessDetailLogs : logs) {
				logText += dunningProcessDetailLogs.getLogText() +"\n";
			}
			if(logText.length()>0){
				item.getItemProperty("log").setValue(logText);
			}
				
		}
	    
	    return processStepTable;
	  }

}
