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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.IdentityService;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.activiti.explorer.ExplorerApp;
import org.activiti.explorer.I18nManager;
import org.activiti.explorer.identity.LoggedInUser;
import org.activiti.explorer.ui.Images;
import org.activiti.explorer.ui.custom.DetailPanel;
import org.activiti.explorer.ui.mainlayout.ExplorerLayout;
import org.milleni.dunning.datamodel.util.Constants;
import org.springframework.util.StringUtils;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.Reindeer;

public class CompleteFinansTaskPanel extends DetailPanel {

	private static final long serialVersionUID = 1L;

	protected transient IdentityService identityService;
	protected I18nManager i18nManager;

	protected ProcessEngineConfigurationImpl engineConfiguration;
	protected VerticalLayout panelLayout;
	protected HorizontalLayout detailLayout;
	protected TextArea textArea;
	protected TextArea textAreaFinansNot;
	
	
	protected CheckBox check = null;
	private ComboBox yasalOrTakipCombo ;
	private LoggedInUser loggedInUser;
	protected TaskService taskService;
	protected RuntimeService runtimeService;
	
	private static final String takipDisiBirak = "Takip Disi Birak";
	private static final String yasalTakip = "Yasal Takibe Al";
	
	public CompleteFinansTaskPanel() {
		taskService = ProcessEngines.getDefaultProcessEngine().getTaskService();
		runtimeService = ProcessEngines.getDefaultProcessEngine().getRuntimeService();
		this.i18nManager = ExplorerApp.get().getI18nManager();
		loggedInUser=ExplorerApp.get().getLoggedInUser();
		init();
	}

	protected void init() {
		setSizeFull();
		addStyleName(Reindeer.PANEL_LIGHT);

		initPageTitle();
		initDatabaseSettingsDetails();
	}

	protected void initPageTitle() {
		HorizontalLayout layout = new HorizontalLayout();
		layout.setWidth(100, UNITS_PERCENTAGE);
		layout.addStyleName(ExplorerLayout.STYLE_TITLE_BLOCK);
		layout.setSpacing(true);
		layout.setMargin(false, false, true, false);
		addDetailComponent(layout);

		Embedded databaseImage = new Embedded(null, Images.DATABASE_50);
		layout.addComponent(databaseImage);

		Label groupName = new Label("Finans Task Tamamla");
		groupName.setSizeUndefined();
		groupName.addStyleName(Reindeer.LABEL_H2);
		layout.addComponent(groupName);
		layout.setComponentAlignment(groupName, Alignment.MIDDLE_LEFT);
		layout.setExpandRatio(groupName, 1.0f);
		
		
	   yasalOrTakipCombo = new ComboBox("Yasal Surec Durumu");
	   yasalOrTakipCombo.addItem(yasalTakip);
	   yasalOrTakipCombo.addItem(takipDisiBirak);
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
		panelLayout = new VerticalLayout();
		panelLayout.setSpacing(true);
		detailLayout.setMargin(true, true, true, false);
		detailLayout.addComponent(panelLayout);

		// Database type

		textArea = new TextArea("");
		textArea.setRequired(true);
		textArea.setEnabled(true);
		textArea.setRows(10);
		textArea.setColumns(50);
		
		
		textAreaFinansNot = new TextArea("");
		textAreaFinansNot.setRequired(true);
		textAreaFinansNot.setEnabled(true);
		textAreaFinansNot.setRows(2);
		textAreaFinansNot.setColumns(50);
		textAreaFinansNot.setMaxLength(150);
		
		
		panelLayout.addComponent(yasalOrTakipCombo);
		Label lblFinansNot = new Label("Finans Notu");
		lblFinansNot.setSizeUndefined();
		lblFinansNot.addStyleName(Reindeer.LABEL_H2);
		panelLayout.addComponent(lblFinansNot);
		panelLayout.addComponent(textAreaFinansNot);
		
		
		Label lblCustomer = new Label("Musteriler");
		lblCustomer.setSizeUndefined();
		lblCustomer.addStyleName(Reindeer.LABEL_H2);
		panelLayout.addComponent(lblCustomer);
		panelLayout.addComponent(textArea);
		
		Button claimButton = new Button("Tasklari Tamamla");
		claimButton.setIcon(Images.EXECUTE);
		claimButton.addListener(new ClickListener() {
			private static final long serialVersionUID = 1L;

			public void buttonClick(ClickEvent event) {
				
				String customerIds = (String) textArea.getValue();
				boolean takipDisi = (yasalOrTakipCombo.getValue()!=null &&  takipDisiBirak.equals(yasalOrTakipCombo.getValue())) ? true : false;
				
				String finansNotu = textAreaFinansNot.getValue()!=null ? textAreaFinansNot.getValue().toString():null;
				
				String[] customerIdArray = customerIds.split("\n");
				List<Long> customerIdList = new ArrayList<Long>();
				for (String strCustomerId : customerIdArray) {
					strCustomerId = strCustomerId.trim();
					if (StringUtils.hasText(strCustomerId)) {
						customerIdList.add(Long.parseLong(strCustomerId));
					}
				}
				
				for (Long customerId : customerIdList) {
					Map<String,Object> variables = new HashMap<String, Object>();
					variables.put(Constants.customerId,customerId);
					if(loggedInUser!=null)
						variables.put(Constants.user, loggedInUser.getFullName());
					
					if(takipDisi)
						variables.put(Constants.taskStatusFinans, Constants.takipDisiBirak);
					
					
					if(StringUtils.hasText(finansNotu))
						variables.put("finansNotu", finansNotu);
					
					
					ProcessInstance instance = runtimeService.createProcessInstanceQuery().variableValueEquals("customerId", customerId).singleResult();
					Task task = taskService.createTaskQuery().taskDefinitionKeyLike("%taskYasal%").processInstanceId(instance.getProcessInstanceId()).singleResult(); 
					taskService.complete(task.getId(),variables);
				    //runtimeService.startProcessInstanceByKey(Constants.FL100_DunningProcessInitializer,variables);
				}
				textArea.setValue("");
			}
		});

		panelLayout.addComponent(claimButton);
		
	}

	

}
