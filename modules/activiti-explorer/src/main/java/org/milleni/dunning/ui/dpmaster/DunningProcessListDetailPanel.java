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

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.explorer.ExplorerApp;
import org.activiti.explorer.I18nManager;
import org.activiti.explorer.data.LazyLoadingContainer;
import org.activiti.explorer.data.LazyLoadingQuery;
import org.activiti.explorer.ui.custom.DetailPanel;
import org.activiti.explorer.ui.mainlayout.ExplorerLayout;
import org.activiti.explorer.ui.variable.VariableRendererManager;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.milleni.dunning.datamodel.dao.DunningProcessDetailRepository;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.service.CustomerService;
import org.milleni.dunning.datamodel.service.DunningProcessService;
import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.datamodel.util.DaoHelper;
import org.milleni.dunning.ui.customer.component.DunningStepLogTableComponent;
import org.milleni.dunning.ui.customer.component.DunningStepTableComponent;

import com.vaadin.addon.tableexport.ExcelExport;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.BaseTheme;
import com.vaadin.ui.themes.Reindeer;

/**
 * @author Tijs Rademakers
 */
public class DunningProcessListDetailPanel extends DetailPanel {

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
	protected VerticalLayout instancesLayout;
	protected Table dpMasterTable;

	protected List<HistoricProcessInstance> instanceList;

	private CustomerService customerService;
	private DunningProcessService dunningProcessService;
	private DunningProcessDetailRepository dunningProcessDetailRepository;
	private LazyLoadingQuery lazyLoadingQuery = null;

	private Table processStepTable;
	private Table stepLogTable;
	private Label dunningProcessHeader;
	private Label noTasksLabel;
	private Label tasksEmptyHeader;

	VerticalLayout dunningProcessDetailLayout;
	VerticalLayout dunningProcessDetailLogLayout;
	HorizontalLayout instancesHeader ;
	
	private HorizontalLayout detailHeader = null;

	public DunningProcessListDetailPanel(LazyLoadingQuery lazyLoadingQuery) {
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
		
		instancesHeader = new HorizontalLayout();
		instancesHeader.setSpacing(true);
		//instancesHeader.setWidth(100, UNITS_PERCENTAGE);
		instancesHeader.addStyleName(ExplorerLayout.STYLE_DETAIL_BLOCK);
		addDetailComponent(instancesHeader);

		

		instancesLayout = new VerticalLayout();
		instancesLayout.setWidth(100, UNITS_PERCENTAGE);
		addDetailComponent(instancesLayout);

		if (dunningProcessDetailLayout != null) {
			mainPanel.removeComponent(dunningProcessDetailLayout);
		}

		dunningProcessDetailLayout = new VerticalLayout();
		dunningProcessDetailLayout.setSpacing(true);
		dunningProcessDetailLayout.setWidth(100, UNITS_PERCENTAGE);
		addDetailComponent(dunningProcessDetailLayout);

		dunningProcessDetailLogLayout = new VerticalLayout();
		dunningProcessDetailLogLayout.setSpacing(true);
		dunningProcessDetailLogLayout.setWidth(100, UNITS_PERCENTAGE);
		addDetailComponent(dunningProcessDetailLogLayout);

		initInstancesTable();
	}

	protected void initInstancesTitle(HorizontalLayout instancesHeader) {
		Label instancesLabel = new Label(i18nManager.getMessage(Constants.DUNNING_PROCESSES));
		instancesLabel.addStyleName(ExplorerLayout.STYLE_H3);
		instancesHeader.addComponent(instancesLabel);
		instancesHeader.setComponentAlignment(instancesLabel, Alignment.BOTTOM_LEFT);
	}

	protected void initInstancesTable() {

		dpMasterTable = new Table() {
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

		dpMasterTable.setWidth(100, UNITS_PERCENTAGE);
		dpMasterTable.setHeight(250, UNITS_PIXELS);
		dpMasterTable.setEditable(false);
		dpMasterTable.setImmediate(true);
		dpMasterTable.setSelectable(true);
		dpMasterTable.setNullSelectionAllowed(false);
		dpMasterTable.setSortDisabled(true);

		LazyLoadingContainer container = new LazyLoadingContainer(lazyLoadingQuery, 50);
		dpMasterTable.setContainerDataSource(container);

		dpMasterTable.addContainerProperty("bpmProcessId", Button.class, null, i18nManager.getMessage(Constants.DUNNING_BPM_RPOCESS_ID), null, Table.ALIGN_LEFT);
		dpMasterTable.addContainerProperty("customerId", Date.class, null, i18nManager.getMessage(Constants.CUSTOMER_ID), null, Table.ALIGN_LEFT);
		dpMasterTable.addContainerProperty("currentStep", String.class, null, i18nManager.getMessage(Constants.DUNNING_CURRENT_STEP), null, Table.ALIGN_LEFT);
		dpMasterTable.addContainerProperty("lastStep", String.class, null, i18nManager.getMessage(Constants.DUNNING_LAST_STEP), null, Table.ALIGN_LEFT);		
		dpMasterTable.addContainerProperty("nextStep", String.class, null, i18nManager.getMessage(Constants.DUNNING_NEXT_STEP), null, Table.ALIGN_LEFT);
		dpMasterTable.addContainerProperty("startDate", Date.class, null, i18nManager.getMessage(Constants.DUNNING_START_DATE), null, Table.ALIGN_LEFT);
		dpMasterTable.addContainerProperty("nextStepDate", Date.class, null, i18nManager.getMessage(Constants.DUNNING_NEXT_STEP_DATE), null, Table.ALIGN_LEFT);
		dpMasterTable.addContainerProperty("status", String.class, null, i18nManager.getMessage(Constants.CUSTOMER_STATUS), null, Table.ALIGN_LEFT);
		dpMasterTable.addContainerProperty("currentDebit", String.class, null, i18nManager.getMessage(Constants.DUNNING_CURRENT_DEBIT), null, Table.ALIGN_LEFT);
		dpMasterTable.addContainerProperty("dunningInvoiceDate", String.class, null, i18nManager.getMessage(Constants.DUNNING_INVOICE_DATE), null,Table.ALIGN_LEFT);
		dpMasterTable.addContainerProperty("dunningInvoiceDueDate", String.class, null, i18nManager.getMessage(Constants.DUNNING_INVOICE_SOT), null,Table.ALIGN_LEFT);
		dpMasterTable.addContainerProperty("statusDesc", String.class, null, i18nManager.getMessage(Constants.CUSTOMER_STATUS), null, Table.ALIGN_LEFT);

		dpMasterTable.addListener(new Property.ValueChangeListener() {
			private static final long serialVersionUID = 1L;

			public void valueChange(ValueChangeEvent event) {
				DunningProcessTableListItem item = (DunningProcessTableListItem) dpMasterTable.getItem(event.getProperty().getValue());

				if (item != null) {
					if (dunningProcessDetailLayout != null && processStepTable != null)
						dunningProcessDetailLayout.removeComponent(processStepTable);
					if (detailHeader != null && detailHeader != null)
						dunningProcessDetailLayout.removeComponent(detailHeader);
					
					List<DunningProcessDetail> dunningProcessDetails = dunningProcessDetailRepository.findDunningProcessDetails(item.getDnngProcessMaster().getProcessId());
					processStepTable = new DunningStepTableComponent(dunningProcessDetails);
					processStepTable.setHeight(200, UNITS_PIXELS);
					
					detailHeader = new HorizontalLayout();
					detailHeader.setSpacing(true);
					detailHeader.setWidth(100, UNITS_PERCENTAGE);
					detailHeader.addStyleName(ExplorerLayout.STYLE_DETAIL_BLOCK);
					dunningProcessDetailLayout.addComponent(detailHeader);		
					
					Label instancesLabel = new Label(i18nManager.getMessage(Constants.DUNNING_PROCESS_STEPS));
					instancesLabel.addStyleName(ExplorerLayout.STYLE_H3);
					detailHeader.addComponent(instancesLabel);
					
					dunningProcessDetailLayout.addComponent(processStepTable);
					
					processStepTable.addListener(new Property.ValueChangeListener() {
						private static final long serialVersionUID = 1L;

						public void valueChange(ValueChangeEvent event) {
							DunningProcessDetail item = (DunningProcessDetail) event.getProperty().getValue();

							if (item != null) {
								if (dunningProcessDetailLogLayout != null && stepLogTable != null)
									dunningProcessDetailLogLayout.removeComponent(stepLogTable);

								stepLogTable = new DunningStepLogTableComponent(item.getDunningProcessDetailLogsCollection());
								stepLogTable.setHeight(150, UNITS_PIXELS);
								dunningProcessDetailLogLayout.addComponent(stepLogTable);
							}
						}
					});

				}
			}
		});

		
		final ThemeResource export = new ThemeResource("../images/table-excel.png");
		final Button excelExportButton = new Button();
		excelExportButton.setIcon(export);
		excelExportButton.setStyleName(BaseTheme.BUTTON_LINK);
		instancesHeader.addComponent(excelExportButton);
		initInstancesTitle(instancesHeader);
		instancesLayout.addComponent(dpMasterTable);

		excelExportButton.addListener(new ClickListener() {
			private static final long serialVersionUID = -73954695086117200L;
			private ExcelExport excelExport;

			public void buttonClick(final ClickEvent event) {
				excelExport = new ExcelExport(dpMasterTable);

				excelExport.excludeCollapsedColumns();
				excelExport.setDisplayTotals(false);
				excelExport.setRowHeaders(true);
				CellStyle cs = excelExport.getTitleStyle();
				cs.setFillBackgroundColor(HSSFColor.GREY_25_PERCENT.index);
				excelExport.setTitleStyle(cs);
				excelExport.setDoubleDataFormat("0.00");
				excelExport.setExcelFormatOfProperty("konto", "0");
				excelExport.export();
			}
		});

	}

	protected void refreshInstancesTable() {
		lazyLoadingQuery = new DunningProcessListLazyLoadinQuery();
		dpMasterTable.setContainerDataSource(new LazyLoadingContainer(lazyLoadingQuery, 50));
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

	public LazyLoadingQuery getLazyLoadingQuery() {
		return lazyLoadingQuery;
	}

	public void setLazyLoadingQuery(LazyLoadingQuery lazyLoadingQuery) {
		this.lazyLoadingQuery = lazyLoadingQuery;
	}

}
