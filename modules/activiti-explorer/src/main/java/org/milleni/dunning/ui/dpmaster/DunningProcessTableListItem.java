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

import org.activiti.explorer.ExplorerApp;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.ui.customer.component.InvoiceDetailPopupWindow;
import org.milleni.dunning.ui.customer.form.ProcessDetailPopupWindow;
import org.springframework.util.StringUtils;

import com.vaadin.data.util.ObjectProperty;
import com.vaadin.data.util.PropertysetItem;
import com.vaadin.ui.Button;
import com.vaadin.ui.Table;
import com.vaadin.ui.Button.ClickEvent;

/**
 * @author Joram Barrez
 */
public class DunningProcessTableListItem extends PropertysetItem implements Comparable<DunningProcessTableListItem> {

	private static final long serialVersionUID = 1L;

	private DunningProcessMaster dnngProcessMaster = null;

	public DunningProcessTableListItem(DunningProcessMaster dnngPMaster) {
		this.dnngProcessMaster = dnngPMaster;
		Button detailsField = new Button(dnngPMaster.getBpmProcessId());
		detailsField.setData(dnngPMaster.getBpmProcessId());
		detailsField.addListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				String processId = (String) event.getButton().getData();
				ExplorerApp.get().getViewManager().showPopupWindow(new ProcessDetailPopupWindow(processId));
			}
		});
		addItemProperty("bpmProcessId", new ObjectProperty<Button>(detailsField, Button.class));
		addItemProperty("currentStep", new ObjectProperty<String>(dnngPMaster.getProcessLastStepId() != null ? dnngPMaster.getProcessLastStepId().getStepText() : "", String.class));
		addItemProperty("startDate", new ObjectProperty<Date>(dnngPMaster.getCreateDate(), Date.class));
		addItemProperty("status", new ObjectProperty<String>(dnngPMaster.getStatus().getStatusText(), String.class));
		addItemProperty("statusDesc", new ObjectProperty<String>(dnngPMaster.getStatusDesc(), String.class));
		addItemProperty("customerId", new ObjectProperty<String>(dnngPMaster.getCustomerId().getCustomerId(), String.class));
		addItemProperty("currentDebit", new ObjectProperty<String>(dnngPMaster.getCurrentDebit() != null ? dnngPMaster.getCurrentDebit() : "", String.class));
		
	}

	public int compareTo(DunningProcessTableListItem other) {
		String name = (String) getItemProperty("name").getValue();
		String otherName = (String) other.getItemProperty("name").getValue();

		int comparison = name.compareTo(otherName);
		if (comparison != 0) {
			return comparison;
		} else {
			String key = (String) getItemProperty("key").getValue();
			String otherKey = (String) other.getItemProperty("key").getValue();
			comparison = key.compareTo(otherKey);

			if (comparison != 0) {
				return comparison;
			} else {
				Integer version = (Integer) getItemProperty("version").getValue();
				Integer otherVersion = (Integer) other.getItemProperty("version").getValue();
				return version.compareTo(otherVersion);
			}
		}
	}

	public DunningProcessMaster getDnngProcessMaster() {
		return dnngProcessMaster;
	}

}