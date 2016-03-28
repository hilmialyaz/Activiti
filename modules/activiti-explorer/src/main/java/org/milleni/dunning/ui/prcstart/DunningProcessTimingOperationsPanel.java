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
import org.milleni.dunning.datamodel.dao.DunningProcessMasterRepository;
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

import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.data.util.BeanItemContainer;
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
import com.vaadin.ui.themes.Reindeer;

public class DunningProcessTimingOperationsPanel extends DetailPanel {

	
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
	
	private ComboBox policyCombo ;
	private ComboBox stepCombo ;
	DateField processDate;
	private LoggedInUser loggedInUser;
	protected RuntimeService runtimeService;

	ProcessSteps selectedProcessStep;
	ProcessSteps nextSelectedProcessStep;
	DunningPolicy selectedDunningPolicy;
	
	private DateField nextStepDateStart;
	private DateField executionDate;
	private DateField nextStepDateEnd;
	private Label lblEntityCount ;

	private ComboBox nextStepCombo;
	protected NotificationManager notificationManager;



	private ManagementService managementService;



	private String tableName="DUNNING_MANUAL_CHANGE";



	private Table lastChangesTable;

	
	public DunningProcessTimingOperationsPanel() {
		runtimeService = ProcessEngines.getDefaultProcessEngine().getRuntimeService();
		this.i18nManager = ExplorerApp.get().getI18nManager();
		loggedInUser=ExplorerApp.get().getLoggedInUser();
		this.notificationManager = ExplorerApp.get().getNotificationManager();
		this.managementService = ProcessEngines.getDefaultProcessEngine().getManagementService();
		init();
	}

	protected void init() {
		setSizeFull();
		addStyleName(Reindeer.PANEL_LIGHT);

		initPageTitle();
		initDatabaseSettingsDetails();
		addDunningProcessMaster();
	}

	protected void initPageTitle() {
		HorizontalLayout layout = createHorizontalLayout();
		addDetailComponent(layout);

		Embedded databaseImage = new Embedded(null, Images.DATABASE_50);
		layout.addComponent(databaseImage);

		Label groupName = new Label("Toplu Tarih Ve Adim Degistirme");
		groupName.setSizeUndefined();
		groupName.addStyleName(Reindeer.LABEL_H2);
		layout.addComponent(groupName);
		layout.setComponentAlignment(groupName, Alignment.MIDDLE_LEFT);
		layout.setExpandRatio(groupName, 1.0f);
		
		
		List<DunningPolicy> dunningPolicyList = new ArrayList<DunningPolicy>();
	    Iterable<DunningPolicy> dunningPolicies= DaoHelper.getInstance().getDunningPolicyRepository().findAll();
	    for (DunningPolicy dunningPolicy : dunningPolicies) {
	    	dunningPolicyList.add(dunningPolicy);
		}
	    BeanItemContainer<DunningPolicy> objects = new BeanItemContainer(DunningPolicy.class, dunningPolicyList);

	   
	   policyCombo = new ComboBox(i18nManager.getMessage(Constants.DUNNING_POLICY_TYPE), objects);
	   policyCombo.setItemCaptionPropertyId("policyName");
	   
	   stepCombo = new ComboBox(i18nManager.getMessage(Constants.DUNNING_NEXT_STEP));		        	   
	   stepCombo.setItemCaptionPropertyId("stepText");
	   
	   nextStepCombo = new ComboBox(i18nManager.getMessage(Constants.DUNNING_NEXT_STEP));		        	   
	   nextStepCombo.setItemCaptionPropertyId("stepText");
	   
     	nextStepDateStart  = new DateField(i18nManager.getMessage(Constants.DUNNING_NEXT_STEP_DATE_START));
     	executionDate  = new DateField(i18nManager.getMessage(Constants.DUNNING_NEXT_STEP_DATE_START));
     	nextStepDateEnd  = new DateField(i18nManager.getMessage(Constants.DUNNING_NEXT_STEP_DATE_END));
      	
      	
	   policyCombo.addListener(new ValueChangeListener() {
		   
		   

			@Override
	        public void valueChange(ValueChangeEvent event) {
	        	selectedDunningPolicy = (DunningPolicy) event.getProperty().getValue();
	        	List<ProcessSteps> processSteps =  DaoHelper.getInstance().getDunningPolicyRepository().retrieveDunningProcessSteps(selectedDunningPolicy.getPolicyId());		        	        	
	        	BeanItemContainer<ProcessSteps> objects = new BeanItemContainer(ProcessSteps.class, processSteps);
	        	stepCombo.setContainerDataSource(objects); 
	        	nextStepCombo.setContainerDataSource(objects);
	        }
		    
	      }); 
	   
	   stepCombo.addListener(new ValueChangeListener() {
		   
		    @Override
	        public void valueChange(ValueChangeEvent event) {
		    	selectedProcessStep = (ProcessSteps) event.getProperty().getValue();
	        }
		    
	      }); 
	    
	   
	   nextStepCombo.addListener(new ValueChangeListener() {
		   
		    @Override
	        public void valueChange(ValueChangeEvent event) {
		    	nextSelectedProcessStep = (ProcessSteps) event.getProperty().getValue();
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
		
		queryLayout.addComponent(policyCombo);
		queryLayout.addComponent(stepCombo);
		
		queryLayout.addComponent(nextStepDateStart);
		queryLayout.addComponent(nextStepDateEnd);
		
		
		Button claimButton = new Button("Başlat");
		
		final Button changeExecDate = new Button("Degistir.");
		
		lblEntityCount = new Label("Kayit Sayisi");
		lblEntityCount.addStyleName(ExplorerLayout.STYLE_H3);
		lblEntityCount.addStyleName(ExplorerLayout.STYLE_DETAIL_BLOCK);
		
		
		changeExecDate.setIcon(Images.EXECUTE);
		claimButton.setIcon(Images.EXECUTE);
		claimButton.addListener(new ClickListener() {
			private static final long serialVersionUID = 1L;

			public void buttonClick(ClickEvent event) {
				 int entityCount = DaoHelper.getInstance().getDunningProcessMasterRepository().listNextStepDunningProcessCount(selectedDunningPolicy.getPolicyId(),selectedProcessStep.getStepId(),(Date)nextStepDateStart.getValue(),(Date)nextStepDateEnd.getValue());
				 lblEntityCount.setValue(entityCount);
				 if(entityCount>0){
					 actionLayout.addComponent(nextStepCombo);
					 actionLayout.addComponent(executionDate);
					 actionLayout.addComponent(changeExecDate);
				 }else{
					 actionLayout.removeComponent(nextStepCombo);
					 actionLayout.removeComponent(executionDate);
					 actionLayout.removeComponent(changeExecDate);
				 }
			}
		});
		
		
		changeExecDate.addListener(new ClickListener() {
			private static final long serialVersionUID = 1L;

			public void buttonClick(ClickEvent event) {
				try{
					String userName = "username";
					if(loggedInUser!=null)
						userName= loggedInUser.getFullName();
					
					Integer count = 0;
					int xx= DaoHelper.getInstance().getDunningProcessMasterRepository().updateDunningProcessSteps(selectedDunningPolicy.getPolicyId(),selectedProcessStep.getStepId(),(Date)nextStepDateStart.getValue(),(Date)nextStepDateEnd.getValue(),(Date)executionDate.getValue(),nextSelectedProcessStep.getStepId(),count,userName);
					notificationManager.showInformationNotification(Messages.DUNNING_STEPCHANGE_SUCCESS,xx);
					//DaoHelper.getInstance().getDunningProcessMasterRepository().updateDunningProcessSteps();
					actionLayout.removeComponent(nextStepCombo);
					actionLayout.removeComponent(executionDate);
					actionLayout.removeComponent(changeExecDate);
				}catch(Exception ex){
					notificationManager.showErrorNotification("Hata",""+ex.getMessage());
				}
			}
		});
		queryLayout.addComponent(claimButton);
		
		queryLayout.addComponent(lblEntityCount);
		
	}

	

	
	
	protected void addDunningProcessMaster() {
		
		TablePageQuery query = managementService.createTablePageQuery().tableName(tableName).orderDesc("ChangeDate");
		
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
		
		lastChangesTable.addContainerProperty("ID", Integer.class, null, "ID", null, Table.ALIGN_LEFT);
		lastChangesTable.addContainerProperty("UserName", String.class, null, "Kullanici", null, Table.ALIGN_LEFT);		
		lastChangesTable.addContainerProperty("ChangeDate", Date.class, null,"Degisiklik Tarihi", null, Table.ALIGN_LEFT);
		lastChangesTable.addContainerProperty("DunningPolicy", String.class, null, "Dunning Sureci", null, Table.ALIGN_LEFT);
		lastChangesTable.addContainerProperty("DunningStep", String.class, null, "Dunning Adimi", null, Table.ALIGN_LEFT);
		lastChangesTable.addContainerProperty("NextStepId", String.class, null, "Degistirilen Adim", null, Table.ALIGN_LEFT);
		
		lastChangesTable.addContainerProperty("QueryStartDate", Date.class, null,"Degisiklik Araligi Baslangic", null, Table.ALIGN_LEFT);
		lastChangesTable.addContainerProperty("QueryEndDate", Date.class, null,"Degisiklik Araligi Bitis", null, Table.ALIGN_LEFT);
		lastChangesTable.addContainerProperty("NextStepDate", Date.class, null,"Degiştirilen Tarih", null, Table.ALIGN_LEFT);
		lastChangesTable.addContainerProperty("ChangedRecordCount", Integer.class, null,"Degisen Kayit Sayisi", null, Table.ALIGN_LEFT);
		
		Map<Long,String> dunningPolicyList = new HashMap<Long,String>();
		Map<Long,String>  stepList = new HashMap<Long,String>();
		
	    Iterable<DunningPolicy> dunningPolicies= DaoHelper.getInstance().getDunningPolicyRepository().findAll();
	    for (DunningPolicy dunningPolicy : dunningPolicies) {
	    	dunningPolicyList.put(dunningPolicy.getPolicyId(), dunningPolicy.getPolicyName());
	    	List<ProcessSteps> steps= DaoHelper.getInstance().getDunningPolicyRepository().retrieveDunningProcessSteps(dunningPolicy.getPolicyId());
	    	
	    	for (ProcessSteps processSteps : steps) {
	    		stepList.put(processSteps.getStepId(),processSteps.getStepText());
			}
		}
		
		List<Map<String, Object>> rows = query.listPage(0, 1000).getRows();
	    List<Item> items = new ArrayList<Item>();
	    for (Map<String, Object> row : rows) {
	    	  Item tbItem = lastChangesTable.addItem(row);
		      HashMap<String, Object> newRow = new HashMap<String, Object>();
		      for( Entry<String,Object> rowEntry : row.entrySet() ) {
		    	  String key = rowEntry.getKey();
		    	  
		    	  if(tbItem.getItemProperty(key)!=null)
		    		  if("DunningPolicy".equals(key)){
		    			  tbItem.getItemProperty(key).setValue(dunningPolicyList.get(((Integer)rowEntry.getValue()).longValue()));
		    		  }else if("DunningStep".equals(key)){
		    			  tbItem.getItemProperty(key).setValue(stepList.get(((Integer)rowEntry.getValue()).longValue()));
		    		  }else if("NextStepId".equals(key)){
		    			  tbItem.getItemProperty(key).setValue(stepList.get(((Integer)rowEntry.getValue()).longValue()));
		    		  }else{
		    			  tbItem.getItemProperty(key).setValue(rowEntry.getValue());
		    		  }
		      }
	    }
	    panelLayout.addComponent(lastChangesTable);
	}

}
