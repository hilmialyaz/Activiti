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

import org.activiti.engine.IdentityService;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.explorer.ExplorerApp;
import org.activiti.explorer.I18nManager;
import org.activiti.explorer.Messages;
import org.activiti.explorer.ui.Images;
import org.activiti.explorer.ui.custom.DetailPanel;
import org.activiti.explorer.ui.mainlayout.ExplorerLayout;
import org.milleni.dunning.datamodel.util.Constants;
import org.springframework.util.StringUtils;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.Reindeer;

public class BulkDunningProcessStartPanel extends DetailPanel {

	private static final long serialVersionUID = 1L;

	protected transient IdentityService identityService;
	protected I18nManager i18nManager;

	protected ProcessEngineConfigurationImpl engineConfiguration;
	protected VerticalLayout panelLayout;
	protected HorizontalLayout detailLayout;
	protected TextArea textArea;
	DateField processDate;
	
	protected RuntimeService runtimeService;

	public BulkDunningProcessStartPanel() {
		runtimeService = ProcessEngines.getDefaultProcessEngine().getRuntimeService();
		this.i18nManager = ExplorerApp.get().getI18nManager();
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

		Label groupName = new Label(i18nManager.getMessage(Messages.MAIN_MENU_DUNNING_PROCESS_BASLAT));
		groupName.setSizeUndefined();
		groupName.addStyleName(Reindeer.LABEL_H2);
		layout.addComponent(groupName);
		layout.setComponentAlignment(groupName, Alignment.MIDDLE_LEFT);
		layout.setExpandRatio(groupName, 1.0f);
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

		processDate= new DateField("Süreç Başlama Zamanı");
		panelLayout.addComponent(processDate);
		// Database type

		textArea = new TextArea("");
		textArea.setRequired(true);
		textArea.setEnabled(true);
		textArea.setRows(10);
		textArea.setColumns(50);
		panelLayout.addComponent(textArea);

		Button claimButton = new Button("Başlat");
		claimButton.setIcon(Images.EXECUTE);
		claimButton.addListener(new ClickListener() {
			private static final long serialVersionUID = 1L;

			public void buttonClick(ClickEvent event) {
				String customerIds = (String) textArea.getValue();
				Date processDateValue = (Date) processDate.getValue();
				
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
					if(processDateValue!=null)
						variables.put(Constants.processStartDate,processDateValue);
				    runtimeService.startProcessInstanceByKey(Constants.FL100_DunningProcessInitializer,variables);
				}
				textArea.setValue("");
			}
		});

		panelLayout.addComponent(claimButton);
	}

	

}
