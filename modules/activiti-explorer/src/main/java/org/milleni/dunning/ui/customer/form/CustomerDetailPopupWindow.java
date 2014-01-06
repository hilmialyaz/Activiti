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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.activiti.engine.delegate.BpmnError;
import org.activiti.explorer.ExplorerApp;
import org.activiti.explorer.I18nManager;
import org.activiti.explorer.Messages;
import org.activiti.explorer.NotificationManager;
import org.activiti.explorer.ViewManager;
import org.activiti.explorer.ui.Images;
import org.activiti.explorer.ui.custom.PrettyTimeLabel;
import org.activiti.explorer.ui.mainlayout.ExplorerLayout;
import org.activiti.explorer.ui.process.simple.editor.table.PropertyTable;
import org.activiti.explorer.ui.process.simple.editor.table.TaskFormModel;
import org.activiti.explorer.ui.util.ThemeImageColumnGenerator;
import org.activiti.workflow.simple.definition.FormDefinition;
import org.activiti.workflow.simple.definition.FormPropertyDefinition;
import org.milleni.dunning.datamodel.dao.DunningProcessDetailRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessDetailLogs;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.rule.InvoicePaymentRuleService;
import org.milleni.dunning.datamodel.service.ProcessSignalService;
import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.datamodel.util.DaoHelper;
import org.milleni.dunning.ui.customer.component.DunningStepTableComponent;
import org.milleni.dunning.ui.customer.component.InvoiceTableComponent;
import org.springframework.util.StringUtils;

import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.themes.Reindeer;
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

	private DunningProcessDetailRepository dunningProcessDetailRepository;

	private Long customerId;
	private Customer customer = null;
	// List<CustomerInvoices> invoiceList = null;
	List<DunningProcessMaster> dngProcessList = null;
	protected I18nManager i18nManager;
	private InvoiceTableComponent invoiceTable;
	
	protected ViewManager viewManager;
	
	private InvoicePaymentRuleService invoicePaymentRuleService; 
	
	private ProcessSignalService processSignalService;
	
	protected NotificationManager notificationManager;
	
	private Label dunningProcessHeader;
	private Label totalDebitSot;
	public CustomerDetailPopupWindow(Long customerId) {		
		initialize(customerId);
	}
	
	public void initialize(Long customerId){
		this.removeAllComponents();
		this.customerId = customerId;
		customer = DaoHelper.getInstance().getCustomerService().findOne(customerId);
		// invoiceList =
		// DaoHelper.getInstance().getCustomerService().listCustomerInvoices(customerId);
		//dngProcessList = new ArrayList<DunningProcessMaster>(customer.getDunningProcessMasterCollection());
		
		
		dngProcessList = DaoHelper.getInstance().getCustomerService().listCustomerDunningProcesses(customerId);
		this.dunningProcessDetailRepository = DaoHelper.getInstance().getDunningProcessDetailRepository();
		this.invoicePaymentRuleService = DaoHelper.getInstance().getInvoicePaymentRuleService();
		this.processSignalService = DaoHelper.getInstance().getProcessSignalService();
		
		this.i18nManager = ExplorerApp.get().getI18nManager();
		// ddInvoices(invoiceList);
		invoiceTable = new InvoiceTableComponent(customerId);
		this.viewManager = ExplorerApp.get().getViewManager();
		this.notificationManager = ExplorerApp.get().getNotificationManager();
		
		addDunningProcessMaster(dngProcessList);
		setModal(true);
		setWidth("80%");
		center();
		setCaption(TITLE);

		initUi();
	}

	protected void initUi() {
		VerticalLayout layout = new VerticalLayout();
		layout.setSpacing(true);
		addComponent(layout);

		// Description
		Button updateInvoiceInfo = new Button(i18nManager.getMessage(Messages.INVOICE_UPDATE));
		updateInvoiceInfo.addStyleName(Reindeer.BUTTON_SMALL);
		updateInvoiceInfo.addListener(new ClickListener() {

			private static final long serialVersionUID = 1L;

			public void buttonClick(ClickEvent event) {
				try {
					boolean customerHasUnpaidBill = invoicePaymentRuleService.customerHasUnpaidBillInLimit(customerId, true);
					if(!customerHasUnpaidBill){
						processSignalService.signalCustomerProcessIfPaymentReceived(customerId);
						notificationManager.showErrorNotification(Messages.INVOICE_PAYMENT_UPDATE_INFO, 
					                i18nManager.getMessage(Messages.INVOICE_PAYMENT_UPDATE_INFO_DESC));
						viewManager.showInboxPage();
					}else{
						initialize(customerId);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		layout.addComponent(updateInvoiceInfo);
		
		Customer bean = DaoHelper.getInstance().getCustomerService().findOne(customerId);
		if(bean==null) return;
		
		final Table custTable = new Table();
		custTable.setWidth(100,com.vaadin.terminal.Sizeable.UNITS_PERCENTAGE);
		custTable.setHeight(60, com.vaadin.terminal.Sizeable.UNITS_PIXELS);

		custTable.setEditable(false);
		custTable.setImmediate(true);
		custTable.setSelectable(true);
		custTable.setSortDisabled(false);

		custTable.addContainerProperty("id", String.class, null, "Müşteri No", null, Table.ALIGN_LEFT);
		custTable.addContainerProperty("musteriAdi", String.class, null, "Müşteri Adı", null, Table.ALIGN_LEFT);
		custTable.addContainerProperty("musteriBorc", String.class, null, "Toplam Borç", null, Table.ALIGN_LEFT);
		custTable.addContainerProperty("hizmetTuru", String.class, null, "Müşteri Tipi", null, Table.ALIGN_LEFT);
		custTable.addContainerProperty("durum", String.class, null, "Durum", null, Table.ALIGN_LEFT);
		
		
		custTable.addItem(new Object[] {bean.getCustomerId(),bean.getCustomerName(),bean.getCurrentDebit(),bean.getCustomerType().getTypeName(),bean.getStatus()}, bean.getCustomerId());
		layout.addComponent(custTable);
		
		
		totalDebitSot = new Label(i18nManager.getMessage(Constants.DUNNING_INVOICE_UNPAID_TOTAL_SOT)+":"+invoicePaymentRuleService.getCustomerUnpaidTotalInvoiceAmountBeforeSot(customerId));
		totalDebitSot.addStyleName(ExplorerLayout.STYLE_H3);
		totalDebitSot.addStyleName(ExplorerLayout.STYLE_DETAIL_BLOCK);
		totalDebitSot.addStyleName(ExplorerLayout.STYLE_NO_LINE);
		
		layout.addComponent(totalDebitSot);
		
		
		layout.addComponent(invoiceTable);
		
		dunningProcessHeader = new Label(i18nManager.getMessage(Constants.CUSTOMER_DUNNING_PROCESSES));
		dunningProcessHeader.addStyleName(ExplorerLayout.STYLE_H3);
		dunningProcessHeader.addStyleName(ExplorerLayout.STYLE_DETAIL_BLOCK);
		dunningProcessHeader.addStyleName(ExplorerLayout.STYLE_NO_LINE);
		layout.addComponent(dunningProcessHeader);
		
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
		// duningProcessTable.setSizeFull();

		

		if (dngPrcsMasterList.size() > 0) {

			duningProcessTable.addContainerProperty("bpmProcessId", Button.class, null, i18nManager.getMessage(Constants.DUNNING_BPM_RPOCESS_ID), null, Table.ALIGN_LEFT);
			duningProcessTable.addContainerProperty("status", String.class, null, i18nManager.getMessage(Constants.CUSTOMER_STATUS), null, Table.ALIGN_LEFT);
			duningProcessTable.addContainerProperty("startDate", Date.class, null, i18nManager.getMessage(Constants.DUNNING_START_DATE), null, Table.ALIGN_LEFT);
			duningProcessTable.addContainerProperty("currentDebit", String.class, null, i18nManager.getMessage(Constants.DUNNING_CURRENT_DEBIT), null, Table.ALIGN_LEFT);

			dunningProcessLayout.addComponent(duningProcessTable);

			for (DunningProcessMaster dnngPMaster : dngPrcsMasterList) {
				
				dnngPMaster = DaoHelper.initializeAndUnproxy(dnngPMaster);
				Item item = duningProcessTable.addItem(dnngPMaster);

				Button detailsField = new Button(dnngPMaster.getBpmProcessId());
				detailsField.setData(dnngPMaster.getBpmProcessId());
				detailsField.addListener(new Button.ClickListener() {

					@Override
					public void buttonClick(ClickEvent event) {
						String processId = (String) event.getButton().getData();
						ExplorerApp.get().getViewManager().showPopupWindow(new ProcessDetailPopupWindow(processId));
					}
				});
				item.getItemProperty("bpmProcessId").setValue(detailsField);
				// item.getItemProperty("bpmProcessId").setValue(dnngPMaster.getBpmProcessId());
				item.getItemProperty("startDate").setValue(dnngPMaster.getCreateDate());

				String masterStatusDesc = "";
				if (StringUtils.hasLength(dnngPMaster.getStatusDesc()))
					masterStatusDesc = "(" + dnngPMaster.getStatusDesc() + ")";
				item.getItemProperty("status").setValue(dnngPMaster.getStatus().getStatusText() + masterStatusDesc);
				item.getItemProperty("currentDebit").setValue(String.valueOf(dnngPMaster.getCurrentDebit() != null ? dnngPMaster.getCurrentDebit() : ""));
			}
			duningProcessTable.setPageLength(duningProcessTable.size());
			duningProcessTable.addListener(new Property.ValueChangeListener() {
				private static final long serialVersionUID = 1L;

				public void valueChange(ValueChangeEvent event) {
					DunningProcessMaster item = (DunningProcessMaster) event.getProperty().getValue();

					if (item != null) {
						if (dunningProcessLayout != null && processStepTable != null)
							dunningProcessLayout.removeComponent(processStepTable);

						List<DunningProcessDetail> dunningProcessDetails = dunningProcessDetailRepository.findDunningProcessDetails(item.getProcessId());
						processStepTable = new DunningStepTableComponent(dunningProcessDetails);
						dunningProcessLayout.addComponent(processStepTable);
					}
				}
			});
			processStepTable = new DunningStepTableComponent(dngPrcsMasterList.get(0).getDunningProcessDetailCollection());
			dunningProcessLayout.addComponent(processStepTable);
		}

	}

	protected Table createProcessStepList(Collection<DunningProcessDetail> processDetails) {
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
			Collection<DunningProcessDetailLogs> logs = dunningProcessDetail.getDunningProcessDetailLogsCollection();
			String logText = "";
			for (DunningProcessDetailLogs dunningProcessDetailLogs : logs) {
				logText += dunningProcessDetailLogs.getLogText() + "\n";
			}
			if (logText.length() > 0) {
				item.getItemProperty("log").setValue(logText);
			}

		}

		return processStepTable;
	}

}
