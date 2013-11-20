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
import java.util.List;

import org.activiti.engine.IdentityService;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.explorer.ExplorerApp;
import org.activiti.explorer.I18nManager;
import org.activiti.explorer.Messages;
import org.activiti.explorer.identity.LoggedInUser;
import org.activiti.explorer.ui.Images;
import org.activiti.explorer.ui.custom.DetailPanel;
import org.activiti.explorer.ui.mainlayout.ExplorerLayout;
import org.milleni.dunning.datamodel.dao.DunningProcessMasterRepository;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.service.DunningProcessService;
import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.datamodel.util.DaoHelper;
import org.springframework.util.StringUtils;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.Reindeer;

public class BulkDunningProcessFinishPanel extends DetailPanel {

	private static final long serialVersionUID = 1L;

	protected transient IdentityService identityService;
	protected I18nManager i18nManager;

	protected ProcessEngineConfigurationImpl engineConfiguration;
	protected VerticalLayout panelLayout;
	protected HorizontalLayout detailLayout;
	protected TextArea textAreaReason;
	protected TextArea textArea;

	private LoggedInUser loggedInUser;
	protected RuntimeService runtimeService;

	public BulkDunningProcessFinishPanel() {
		runtimeService = ProcessEngines.getDefaultProcessEngine().getRuntimeService();
		this.i18nManager = ExplorerApp.get().getI18nManager();
		loggedInUser = ExplorerApp.get().getLoggedInUser();
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

		Label groupName = new Label(i18nManager.getMessage(Messages.MAIN_MENU_DUNNING_PROCESS_BITIR));
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

		// Database type
		Label reason = new Label("Dunning Surecini Bitirmek Icin Aciklama Giriniz.");
		panelLayout.addComponent(reason);

		textAreaReason = new TextArea("");
		textAreaReason.setRequired(true);
		textAreaReason.setEnabled(true);
		textAreaReason.setRows(2);
		textAreaReason.setColumns(50);
		textAreaReason.setMaxLength(150);
		panelLayout.addComponent(textAreaReason);

		textArea = new TextArea("");
		textArea.setRequired(true);
		textArea.setEnabled(true);
		textArea.setRows(10);
		textArea.setColumns(50);
		panelLayout.addComponent(textArea);

		Button claimButton = new Button("Dunning Sureci Sonlandır");
		claimButton.setIcon(Images.EXECUTE);
		claimButton.addListener(new ClickListener() {
			private static final long serialVersionUID = 1L;

			public void buttonClick(ClickEvent event) {
				String customerIds = (String) textArea.getValue();
				String reason = loggedInUser.getFullName() + " " + (String) textAreaReason.getValue();
				String[] customerIdArray = customerIds.split("\n");
				List<Long> customerIdList = new ArrayList<Long>();

				DunningProcessMasterRepository dpmRepository = DaoHelper.getInstance().getDunningProcessMasterRepository();
				DunningProcessService dpmService = DaoHelper.getInstance().getDunningProcessService();

				for (String strCustomerId : customerIdArray) {
					strCustomerId = strCustomerId.trim();
					if (StringUtils.hasText(strCustomerId)) {
						try {
							customerIdList.add(Long.parseLong(strCustomerId));
						} catch (Exception ex) {
							throw new RuntimeException(strCustomerId + " musteri no yanlis formatta " + ex.getMessage());
						}
					}
				}

				for (Long customerId : customerIdList) {
					List<DunningProcessMaster> dpmList = dpmRepository.findDunningProcessMastersByStatus(customerId, Constants.RUNNING);
					if (dpmList != null && dpmList.size()>0) {

						if (dpmList.size() > 1)
							throw new RuntimeException(customerId + " musterinin birden fazla dunning sureci var. Kontrol ediniz.");

						DunningProcessMaster dpm = dpmList.get(0);
						String processInctanceId = dpm.getBpmProcessId();
						try {
							runtimeService.deleteProcessInstance(processInctanceId, null);
							dpm.setStatus(dpmRepository.getProcessStatus(Constants.MANUAL_FINISHED));
							dpm.setStatusDesc(reason);
							dpmService.saveDunningProcessMaster(dpm);
							List<ProcessInstance> processInstances = runtimeService.createProcessInstanceQuery().processDefinitionKey(Constants.FL95_SuspendToActive).variableValueEquals("customerId", customerId).list();
							if(processInstances!=null  && processInstances.size()>0) {
								for (ProcessInstance processInstance : processInstances) {
									runtimeService.deleteProcessInstance(processInstance.getId(), null);
								}
							}
						} catch (Exception ex) {
							throw new RuntimeException(customerId + " musterinin processi silinirken hata olustu." + ex.getMessage());
						}
					}
				}

				textArea.setValue("");
			}
		});

		panelLayout.addComponent(claimButton);
	}

}
