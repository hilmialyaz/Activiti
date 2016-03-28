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
package org.milleni.dunning.ui.prcstart;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.activiti.engine.IdentityService;
import org.activiti.engine.ManagementService;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.management.TableMetaData;
import org.activiti.engine.management.TablePageQuery;
import org.activiti.engine.runtime.Execution;
import org.activiti.explorer.ExplorerApp;
import org.activiti.explorer.I18nManager;
import org.activiti.explorer.Messages;
import org.activiti.explorer.NotificationManager;
import org.activiti.explorer.data.LazyLoadingContainer;
import org.activiti.explorer.data.LazyLoadingQuery;
import org.activiti.explorer.data.MapItem;
import org.activiti.explorer.identity.LoggedInUser;
import org.activiti.explorer.ui.Images;
import org.activiti.explorer.ui.custom.DetailPanel;
import org.activiti.explorer.ui.mainlayout.ExplorerLayout;
import org.activiti.explorer.ui.management.db.TableDataQuery;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.milleni.dunning.datamodel.dao.DunningProcessMasterRepository;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.DunningPolicy;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.model.ProcessSteps;
import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.datamodel.util.DaoHelper;
import org.milleni.dunning.ui.customer.component.DunningStepTableComponent;
import org.milleni.dunning.ui.customer.form.ProcessDetailPopupWindow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.vaadin.addon.tableexport.ExcelExport;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.BaseTheme;
import com.vaadin.ui.themes.Reindeer;

public class TaskViewPanel extends DetailPanel {

	
	@Autowired
	DunningProcessMasterRepository dunningProcessMasterRepository;
	
	
	
	private static final long serialVersionUID = 1L;

	protected transient IdentityService identityService;
	protected I18nManager i18nManager;

	protected ProcessEngineConfigurationImpl engineConfiguration;
	protected VerticalLayout panelLayout;
	protected HorizontalLayout detailLayout;
	
	protected HorizontalLayout queryActionLayout;
	protected VerticalLayout queryLayout;
	protected VerticalLayout actionLayout;
	protected TextArea textArea;
	protected CheckBox check = null;
	private ComboBox taskDefCombo ;
	private LoggedInUser loggedInUser;
	protected RuntimeService runtimeService;
	private Label lblEntityCount ;
	
	protected NotificationManager notificationManager;

	private ManagementService managementService;

	private String tableName="DUNNING_MANUAL_CHANGE";

	private Table lastChangesTable;

	private static List<TaskDefObject> taskDefs = new ArrayList<TaskDefObject>();
	private TaskDefObject selectedTaskDef =null;
	
	public TaskViewPanel() {
		taskDefs.add(new TaskDefObject("taskYasal","Finans Kontrol"));
		taskDefs.add(new TaskDefObject("taskYasalProblemli","Finans Yasal Oncesi Problemli Aboneler"));
		
		runtimeService = ProcessEngines.getDefaultProcessEngine().getRuntimeService();
		this.i18nManager = ExplorerApp.get().getI18nManager();
		loggedInUser=ExplorerApp.get().getLoggedInUser();
		this.notificationManager = ExplorerApp.get().getNotificationManager();
		this.managementService = ProcessEngines.getDefaultProcessEngine().getManagementService();
		this.dunningProcessMasterRepository = DaoHelper.getInstance().getDunningProcessMasterRepository();
		init();
	}

	protected void init() {
		setSizeFull();
		addStyleName(Reindeer.PANEL_LIGHT);

		initPageTitle();
		initDatabaseSettingsDetails();
		//addDunningProcessMaster();
	}

	protected void initPageTitle() {
		HorizontalLayout layout = createHorizontalLayout();
		addDetailComponent(layout);

		Embedded databaseImage = new Embedded(null, Images.DATABASE_50);
		layout.addComponent(databaseImage);

		Label groupName = new Label("Task Durum Sorgula");
		groupName.setSizeUndefined();
		groupName.addStyleName(Reindeer.LABEL_H2);
		layout.addComponent(groupName);
		layout.setComponentAlignment(groupName, Alignment.MIDDLE_LEFT);
		layout.setExpandRatio(groupName, 1.0f);
		
       BeanItemContainer<DunningPolicy> objects = new BeanItemContainer(TaskDefObject.class, taskDefs);
	   
	   taskDefCombo = new ComboBox("Tasklar", objects);
	   taskDefCombo.setItemCaptionPropertyId("desc");
	   
	   taskDefCombo.addListener(new ValueChangeListener() {
		   	@Override
	        public void valueChange(ValueChangeEvent event) {
	        	selectedTaskDef = (TaskDefObject) event.getProperty().getValue();
	        }		    
	      });
	   
	}

	private HorizontalLayout createHorizontalLayout() {
		HorizontalLayout layout = new HorizontalLayout();
		layout.setWidth(100, UNITS_PERCENTAGE);
		layout.addStyleName(ExplorerLayout.STYLE_TITLE_BLOCK);
		layout.setSpacing(true);
		layout.setMargin(false, false, true, false);
		return layout;
	}

	protected void initDatabaseSettingsDetails() {
		Label settingsHeader = new Label("");
		settingsHeader.addStyleName(ExplorerLayout.STYLE_H3);
		settingsHeader.addStyleName(ExplorerLayout.STYLE_DETAIL_BLOCK);

		addDetailComponent(settingsHeader);

		detailLayout = new HorizontalLayout();
		detailLayout.setSpacing(true);
		detailLayout.setMargin(true, false, true, false);
		addDetailComponent(detailLayout);

		initSettingsProperties();
	}

	protected void initSettingsProperties() {
		detailLayout.setMargin(true, true, true, false);
		panelLayout = new VerticalLayout();
		detailLayout.addComponent(panelLayout);
		
		queryActionLayout = createHorizontalLayout();
		panelLayout.addComponent(queryActionLayout);
		
		queryLayout = new VerticalLayout();
		queryLayout.setSpacing(true);
		actionLayout = new VerticalLayout();
		actionLayout.setSpacing(true);
		queryActionLayout.addComponent(queryLayout);
		queryActionLayout.addComponent(actionLayout);
		
		panelLayout.setSpacing(true);
		
		queryLayout.addComponent(taskDefCombo);
		
		Button cmdRetrieve = new Button("Getir");
		
		final Button cmdRetrieveCustomers = new Button("Sonuclari Getir");
		
		lblEntityCount = new Label("Kayit Sayisi");
		lblEntityCount.addStyleName(ExplorerLayout.STYLE_H3);
		lblEntityCount.addStyleName(ExplorerLayout.STYLE_DETAIL_BLOCK);
		
		
		cmdRetrieveCustomers.setIcon(Images.EXECUTE);
		cmdRetrieve.setIcon(Images.EXECUTE);
		cmdRetrieve.addListener(new ClickListener() {
			private static final long serialVersionUID = 1L;

			public void buttonClick(ClickEvent event) {
				long entityCount =runtimeService.createNativeExecutionQuery().sql("SELECT count([PROC_INST_ID_])  FROM [dunning_migration].[dbo].[ACT_RU_TASK] where [TASK_DEF_KEY_] ='taskYasalProblemli'").count();
				lblEntityCount.setValue(entityCount);
				 if(entityCount>0){
					 queryLayout.addComponent(cmdRetrieveCustomers);
				 }else{
					 queryLayout.removeComponent(cmdRetrieveCustomers);
				 }
			}
		});
		
		
		cmdRetrieveCustomers.addListener(new ClickListener() {
			private static final long serialVersionUID = 1L;

			public void buttonClick(ClickEvent event) {
				try{				
					addDunningProcessMaster();
				}catch(Exception ex){
					notificationManager.showErrorNotification("Hata",""+ex.getMessage());
				}
			}
		});
		queryLayout.addComponent(cmdRetrieve);
		queryLayout.addComponent(lblEntityCount);
		
	}

	

	
	
	protected void addDunningProcessMaster() {
		
		List<Object[]> objects = dunningProcessMasterRepository.listTaskAndProcDefs();
		
		// dunningProcessLayout.addComponent(tasksHeader);

		lastChangesTable = new Table();
		lastChangesTable.addStyleName(ExplorerLayout.STYLE_PROCESS_INSTANCE_TASK_LIST);
		lastChangesTable.setWidth(100, UNITS_PERCENTAGE);
		lastChangesTable.setHeight(250, UNITS_PIXELS);
		lastChangesTable.setEditable(false);
		lastChangesTable.setImmediate(true);
		lastChangesTable.setSelectable(true);
		lastChangesTable.setNullSelectionAllowed(false);
		lastChangesTable.setSortDisabled(true);
		
		lastChangesTable.addContainerProperty("CustomerId", String.class, null, "Musteri", null, Table.ALIGN_LEFT);		
		lastChangesTable.addContainerProperty("Desc", String.class, null,"Durum", null, Table.ALIGN_LEFT);
		
		for (Object[] obj : objects) {
			Object newItemId = lastChangesTable.addItem();
			Item row1 = lastChangesTable.getItem(newItemId);
			row1.getItemProperty("CustomerId").setValue(obj[0]);
			row1.getItemProperty("Desc").setValue(obj[1]);
		}
			
		
		/*
		List<Map<String, Object>> rows = query.toArray();
	    List<Item> items = new ArrayList<Item>();
	    for (Map<String, Object> row : query) {
	    	  Item tbItem = lastChangesTable.addItem(row);
		      HashMap<String, Object> newRow = new HashMap<String, Object>();
		      System.out.println(newRow);
	    }
	    panelLayout.addComponent(lastChangesTable);
	    */
		
		final ThemeResource export = new ThemeResource("../images/table-excel.png");
		final Button excelExportButton = new Button();
		excelExportButton.setIcon(export);
		excelExportButton.setStyleName(BaseTheme.BUTTON_LINK);

		excelExportButton.addListener(new ClickListener() {
			private static final long serialVersionUID = -73954695086117200L;
			private ExcelExport excelExport;

			public void buttonClick(final ClickEvent event) {
				excelExport = new ExcelExport(lastChangesTable);
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
		
		panelLayout.addComponent(excelExportButton);
		panelLayout.addComponent(lastChangesTable);
	}

}