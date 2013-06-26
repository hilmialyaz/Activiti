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
package org.milleni.dunning.ui.customer.component;

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
public class InvoiceDetailPopupWindow extends Window {

	protected static final long serialVersionUID = -1754225937375971709L;

	protected static final String TITLE = "Müşteri Detayı";
	protected static final String DESCRIPTION = "";
	
	HorizontalLayout dunningProcessLayout; 
	protected Table duningProcessTable;
	
	private Long customerId;
	private Customer customer = null;
	protected I18nManager i18nManager;
	private InvoiceTableComponent invoiceTable;
	
	public InvoiceDetailPopupWindow(Long customerId) {
		this.customerId = customerId;
		customer = DaoHelper.getInstance().getCustomerService().findOne(customerId);
		this.i18nManager = ExplorerApp.get().getI18nManager();
		invoiceTable = new InvoiceTableComponent(customerId);
		setModal(true);
		setWidth("50%");
		center();
		setCaption("Faturalar");
		initUi();
	}

	protected void initUi() {
		VerticalLayout layout = new VerticalLayout();
		layout.setSpacing(true);
		addComponent(layout);
		
		layout.addComponent(invoiceTable);
	}
	
	
	
	

}
