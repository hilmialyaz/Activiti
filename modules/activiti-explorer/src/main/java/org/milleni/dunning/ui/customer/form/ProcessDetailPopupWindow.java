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

import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.explorer.ExplorerApp;
import org.activiti.explorer.I18nManager;
import org.activiti.explorer.Messages;
import org.activiti.explorer.ui.Images;
import org.activiti.explorer.ui.custom.PrettyTimeLabel;
import org.activiti.explorer.ui.mainlayout.ExplorerLayout;
import org.activiti.explorer.ui.management.processinstance.ProcessInstanceDetailPanel;
import org.activiti.explorer.ui.management.processinstance.ProcessInstancePage;
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
public class ProcessDetailPopupWindow extends Window {

	protected static final long serialVersionUID = -1754225937375971709L;

	protected static final String TITLE = "Süreç Detayı";
	protected static final String DESCRIPTION = "";

	private String processId = null ;
	protected transient RuntimeService runtimeService;
	 protected ProcessInstance processInstance;
	
	public ProcessDetailPopupWindow(String processId) {
		this.processId = processId;
		this.runtimeService = ProcessEngines.getDefaultProcessEngine().getRuntimeService();
		setModal(true);
		setWidth("90%");
		center();
		setCaption(TITLE);
		initUi();
	}

	protected void initUi() {
		processInstance = runtimeService.createProcessInstanceQuery().processInstanceId(processId).singleResult();
		if(processInstance!=null)
			addComponent( new CustomProcessInstanceDetailPanel(processId));
		else
			addComponent(new CustomCompletedInstancesPanel(processId));
	}

}
