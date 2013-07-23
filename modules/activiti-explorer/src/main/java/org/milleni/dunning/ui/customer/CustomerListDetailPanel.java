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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.explorer.ExplorerApp;
import org.activiti.explorer.I18nManager;
import org.activiti.explorer.Messages;
import org.activiti.explorer.data.LazyLoadingContainer;
import org.activiti.explorer.data.LazyLoadingQuery;
import org.activiti.explorer.ui.Images;
import org.activiti.explorer.ui.custom.DetailPanel;
import org.activiti.explorer.ui.custom.PrettyTimeLabel;
import org.activiti.explorer.ui.custom.UserProfileLink;
import org.activiti.explorer.ui.mainlayout.ExplorerLayout;
import org.activiti.explorer.ui.process.ProcessDefinitionListQuery;
import org.activiti.explorer.ui.util.ThemeImageColumnGenerator;
import org.activiti.explorer.ui.variable.VariableRendererManager;
import org.milleni.dunning.datamodel.dao.CustomerDao;
import org.milleni.dunning.datamodel.dao.CustomerRepository;
import org.milleni.dunning.datamodel.dao.DunningProcessDetailRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessDetailLogs;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.service.CustomerService;
import org.milleni.dunning.datamodel.service.DunningProcessService;
import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.datamodel.util.DaoHelper;
import org.milleni.dunning.ui.customer.component.DunningStepTableComponent;
import org.milleni.dunning.ui.customer.form.CustomProcessInstanceDetailPanel;
import org.milleni.dunning.ui.customer.form.CustomerDetailPopupWindow;
import org.milleni.dunning.ui.customer.form.ProcessDetailPopupWindow;
import org.milleni.dunning.ui.db.Invoice;
import org.milleni.dunning.ui.dpmaster.DunningProcessTableListItem;
import org.springframework.util.StringUtils;

import com.google.gwt.user.client.rpc.core.java.util.Collections;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.themes.Reindeer;

/**
 * @author Tijs Rademakers
 */
public class CustomerListDetailPanel extends DetailPanel {

	private static final long serialVersionUID = 1L;

	protected transient HistoryService historyService;
	protected transient RepositoryService repositoryService;
	protected transient RuntimeService runtimeService;
	protected transient IdentityService identityService;
	protected I18nManager i18nManager;
	protected VariableRendererManager variableRendererManager;

	protected HorizontalLayout definitionsLayout;
	protected Table definitionsTable;
	protected Label noMembersTable;
	protected HorizontalLayout instancesLayout;
	protected Table customerTable;

	protected Table duningProcessTable;

	protected List<HistoricProcessInstance> instanceList;

	private CustomerService customerService;
	private DunningProcessService dunningProcessService;
	private LazyLoadingQuery lazyLoadingQuery = null;
	private DunningProcessDetailRepository dunningProcessDetailRepository;

	public CustomerListDetailPanel(LazyLoadingQuery lazyLoadingQuery) {
		this.lazyLoadingQuery = lazyLoadingQuery;
		this.runtimeService = ProcessEngines.getDefaultProcessEngine().getRuntimeService();
		this.historyService = ProcessEngines.getDefaultProcessEngine().getHistoryService();
		this.repositoryService = ProcessEngines.getDefaultProcessEngine().getRepositoryService();
		this.identityService = ProcessEngines.getDefaultProcessEngine().getIdentityService();
		this.variableRendererManager = ExplorerApp.get().getVariableRendererManager();
		this.instanceList = historyService.createHistoricProcessInstanceQuery().unfinished().list();
		this.i18nManager = ExplorerApp.get().getI18nManager();
		this.customerService = DaoHelper.getInstance().getCustomerService();
		this.dunningProcessService = DaoHelper.getInstance().getDunningProcessService();
		this.dunningProcessDetailRepository = DaoHelper.getInstance().getDunningProcessDetailRepository();
		init();
	}

	protected void init() {
		setSizeFull();
		addStyleName(Reindeer.PANEL_LIGHT);
		initInstances();
	}

	protected void initInstances() {
		HorizontalLayout instancesHeader = new HorizontalLayout();
		instancesHeader.setSpacing(true);
		instancesHeader.setWidth(100, UNITS_PERCENTAGE);
		instancesHeader.addStyleName(ExplorerLayout.STYLE_DETAIL_BLOCK);
		// addDetailComponent(instancesHeader);
		initInstancesTitle(instancesHeader);

		instancesLayout = new HorizontalLayout();
		instancesLayout.setWidth(100, UNITS_PERCENTAGE);
		addDetailComponent(instancesLayout);
		initInstancesTable();
	}

	protected void initInstancesTitle(HorizontalLayout instancesHeader) {
		Label instancesLabel = new Label("Müşteriler");
		instancesLabel.addStyleName(ExplorerLayout.STYLE_H3);
		instancesHeader.addComponent(instancesLabel);
	}

	protected void initInstancesTable() {

		customerTable = new Table() {
			@Override
			public boolean handleError(ComponentErrorEvent error) {

				return false;
			}

			@Override
			public void changeVariables(Object source, Map<String, Object> variables) {
				// TODO Auto-generated method stub
				try {
					super.changeVariables(source, variables);
				} catch (Exception ex) {

				}
			}

		};

		customerTable.setWidth(100, UNITS_PERCENTAGE);
		customerTable.setHeight(250, UNITS_PIXELS);
		customerTable.setEditable(false);
		customerTable.setImmediate(true);
		customerTable.setSelectable(true);
		customerTable.setNullSelectionAllowed(false);
		customerTable.setSortDisabled(true);

		LazyLoadingContainer container = new LazyLoadingContainer(lazyLoadingQuery, 10);
		customerTable.setContainerDataSource(container);

		customerTable.addContainerProperty("id", String.class, null, i18nManager.getMessage(Constants.CUSTOMER_ID), null, Table.ALIGN_LEFT);
		customerTable.addContainerProperty("name", String.class, null, i18nManager.getMessage(Constants.CUSTOMER_NAME), null, Table.ALIGN_LEFT);
		customerTable.addContainerProperty("customerGroup", String.class, null, i18nManager.getMessage(Constants.CUSTOMER_GROUP), null, Table.ALIGN_LEFT);
		customerTable.addContainerProperty("customerType", String.class, null, i18nManager.getMessage(Constants.CUSTOMER_TYPE), null, Table.ALIGN_LEFT);
		customerTable.addContainerProperty("status", String.class, null, i18nManager.getMessage(Constants.CUSTOMER_STATUS), null, Table.ALIGN_LEFT);
		customerTable.addContainerProperty("invoicePopup", Button.class, null, i18nManager.getMessage(Constants.DUNNING_BPM_RPOCESS_ID), null, Table.ALIGN_LEFT);
		
		customerTable.addListener(new Property.ValueChangeListener() {
			private static final long serialVersionUID = 1L;

			public void valueChange(ValueChangeEvent event) {
				Item item = customerTable.getItem(event.getProperty().getValue());

				if (item != null) {
					Long customerId = Long.parseLong(item.getItemProperty("id").getValue().toString());
					// List<CustomerInvoices> invoiceList =
					// customerService.listCustomerInvoices(customerId);
					List<DunningProcessMaster> dngProcessList = customerService.listCustomerDunningProcesses(customerId);

					// if (dngProcessList != null && dngProcessList.size() > 0)
					// {
					addDunningProcessMaster(dngProcessList);
					// }

				}
			}
		});

		instancesLayout.addComponent(customerTable);
		
	}

	protected void refreshInstancesTable() {
		lazyLoadingQuery = new CustomerListLazyLoadinQuery();
		customerTable.setContainerDataSource(new LazyLoadingContainer(lazyLoadingQuery, 10));
	}

	private Embedded currentEmbedded;
	private Label imageHeader;

	protected String getProcessDisplayName(ProcessDefinition processDefinition, ProcessInstance processInstance) {
		if (processDefinition.getName() != null) {
			return processDefinition.getName() + " (" + processInstance.getId() + ")";
		} else {
			return processDefinition.getKey() + " (" + processInstance.getId() + ")";
		}
	}

	private Label dunningProcessHeader;
	private Label noTasksLabel;
	private Label tasksEmptyHeader;

	HorizontalLayout dunningProcessLayout;

	protected void addDunningProcessMaster(List<DunningProcessMaster> dngPrcsMasterList) {

		if (dunningProcessHeader != null) {
			mainPanel.removeComponent(dunningProcessHeader);
		}
		dunningProcessHeader = new Label(i18nManager.getMessage(Constants.CUSTOMER_DUNNING_PROCESSES));
		dunningProcessHeader.addStyleName(ExplorerLayout.STYLE_H3);
		dunningProcessHeader.addStyleName(ExplorerLayout.STYLE_DETAIL_BLOCK);
		dunningProcessHeader.addStyleName(ExplorerLayout.STYLE_NO_LINE);

		addDetailComponent(dunningProcessHeader);

		if (dunningProcessLayout != null) {
			mainPanel.removeComponent(dunningProcessLayout);
		}

		dunningProcessLayout = new HorizontalLayout();
		dunningProcessLayout.setSpacing(true);
		dunningProcessLayout.setWidth(100, UNITS_PERCENTAGE);
		addDetailComponent(dunningProcessLayout);

		// dunningProcessLayout.addComponent(tasksHeader);

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
			duningProcessTable.addContainerProperty("startDate", Date.class, null, i18nManager.getMessage(Constants.DUNNING_START_DATE), null, Table.ALIGN_LEFT);
			duningProcessTable.addContainerProperty("status", String.class, null, i18nManager.getMessage(Constants.CUSTOMER_STATUS), null, Table.ALIGN_LEFT);
			duningProcessTable.addContainerProperty("currentDebit", String.class, null, i18nManager.getMessage(Constants.DUNNING_CURRENT_DEBIT), null, Table.ALIGN_LEFT);

			dunningProcessLayout.addComponent(duningProcessTable);

			for (DunningProcessMaster dnngPMaster : dngPrcsMasterList) {
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
				if( StringUtils.hasLength(dnngPMaster.getStatusDesc())) 
					masterStatusDesc = "("+dnngPMaster.getStatusDesc()+")";
				item.getItemProperty("status").setValue(dnngPMaster.getStatus().getStatusText() + masterStatusDesc);
				item.getItemProperty("currentDebit").setValue(String.valueOf(  dnngPMaster.getCurrentDebit()!=null ? dnngPMaster.getCurrentDebit() : ""));
			}
			duningProcessTable.setPageLength(duningProcessTable.size());
			duningProcessTable.addListener(new Property.ValueChangeListener() {
				private static final long serialVersionUID = 1L;

				public void valueChange(ValueChangeEvent event) {
					DunningProcessMaster item = (DunningProcessMaster) event.getProperty().getValue();
					
					if (item != null) {
						if (dunningProcessLayout != null && processStepTable!=null)	dunningProcessLayout.removeComponent(processStepTable);
						
						List<DunningProcessDetail> dunningProcessDetails = dunningProcessDetailRepository.findDunningProcessDetails(item.getProcessId());
						processStepTable = new DunningStepTableComponent(dunningProcessDetails);
						dunningProcessLayout.addComponent(processStepTable);
					}
				}
			});
			processStepTable = new DunningStepTableComponent(dngPrcsMasterList.get(0).getDunningProcessDetailCollection());
			dunningProcessLayout.addComponent(processStepTable);

		} else {
			// No tasks
			noTasksLabel = new Label(i18nManager.getMessage(Messages.PROCESS_INSTANCE_NO_TASKS));
			dunningProcessLayout.addComponent(noTasksLabel);
		}
	}

	Table processStepTable;



}
