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
package org.milleni.dunning.ui.dpdetail;

import java.util.Date;

import org.activiti.explorer.ExplorerApp;
import org.activiti.explorer.ui.Images;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.ui.customer.component.InvoiceDetailPopupWindow;
import org.milleni.dunning.ui.customer.form.ProcessDetailPopupWindow;
import org.springframework.util.StringUtils;

import com.vaadin.data.util.ObjectProperty;
import com.vaadin.data.util.PropertysetItem;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.Table;
import com.vaadin.ui.Button.ClickEvent;

/**
 * @author Joram Barrez
 */
public class DunningProcessDetailTableListItem extends PropertysetItem implements Comparable<DunningProcessDetailTableListItem> {

	private static final long serialVersionUID = 1L;

	private DunningProcessDetail dpDetail = null;

	public DunningProcessDetailTableListItem(DunningProcessDetail dpDetail) {
		this.dpDetail = dpDetail;
		Button detailsField = new Button(dpDetail.getProcessId().getBpmProcessId());
		detailsField.setData(dpDetail.getProcessId().getBpmProcessId());
		detailsField.addListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				String processId = (String) event.getButton().getData();
				ExplorerApp.get().getViewManager().showPopupWindow(new ProcessDetailPopupWindow(processId));
			}
		});
		
		Embedded embed = null;
		if (dpDetail.getStatus()!=null  && Constants.SUCCESS.equals(dpDetail.getStatus().getId())) {
			embed= new Embedded(null, Images.TASK_FINISHED_22);
		} else {
			embed = new Embedded(null, Images.TASK_22);
		}
		
		String customerName = "";
		String customerStatus = "";
		String masterStatus ="";
		String startDebit ="";
		String currentDebit ="";
		Date dunningInvoiceDate = null;
		Date dunningInvoiceDueDate = null;
		
		DunningProcessMaster dpm = dpDetail.getProcessId();
		if(dpm!=null){
			Customer customer = dpm.getCustomerId();
			if(customer!=null){
				customerName = customer.getCustomerName();
				customerStatus = customer.getStatus();				
			}
			masterStatus = dpm.getStatus()!=null ? dpm.getStatus().getStatusText() : "";
			startDebit =   dpm.getCurrentDebit() != null ? dpm.getCurrentDebit().toString() : "";
			currentDebit =  customer.getCurrentDebit()!=null ?  customer.getCurrentDebit().toString() :""; 
			dunningInvoiceDate = dpm.getDunningInvoiceId() != null ?  dpm.getDunningInvoiceId().getInvoiceDate() : null;
			dunningInvoiceDueDate = dpm.getDunningInvoiceId() != null ?  dpm.getDunningInvoiceId().getInvoiceDueDate() : null;
		}
		
		
		addItemProperty("finished", new ObjectProperty<Embedded>(embed, Embedded.class));
		addItemProperty("name", new ObjectProperty<String>(dpDetail.getProcessStepId() != null ? dpDetail.getProcessStepId().getStepText() : "", String.class));
		addItemProperty("startDate", new ObjectProperty<Date>(dpDetail.getCreateDate(), Date.class));
		addItemProperty("endDate", new ObjectProperty<Date>(dpDetail.getStatusDate(), Date.class));
		addItemProperty("status",  new ObjectProperty<String>(dpDetail.getStatus()!=null ? dpDetail.getStatus().getStatusText():"" , String.class));
		addItemProperty("customerId",  new ObjectProperty<String>((dpDetail.getProcessId()!=null && dpDetail.getProcessId().getCustomerId()!=null) ? dpDetail.getProcessId().getCustomerId().getCustomerId():"" , String.class));
		addItemProperty("startDebit", new ObjectProperty<String>(startDebit, String.class));
		
		addItemProperty("customerName", new ObjectProperty<String>(customerName, String.class));
		addItemProperty("customerStatus", new ObjectProperty<String>(customerStatus, String.class));
		addItemProperty("masterStatus", new ObjectProperty<String>(masterStatus, String.class));
		addItemProperty("dunningInvoiceDate", new ObjectProperty<Date>(dunningInvoiceDate, Date.class));
		addItemProperty("dunningInvoiceDueDate", new ObjectProperty<Date>(dunningInvoiceDueDate, Date.class));
		addItemProperty("currentDebit", new ObjectProperty<String>(currentDebit, String.class));
		
		
		
	}

	public int compareTo(DunningProcessDetailTableListItem other) {
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

	public DunningProcessDetail getDpDetail() {
		return dpDetail;
	}

	

}