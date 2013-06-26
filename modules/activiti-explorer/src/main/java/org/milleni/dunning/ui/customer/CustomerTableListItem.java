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
package org.milleni.dunning.ui.customer;

import org.activiti.explorer.ExplorerApp;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.ui.customer.component.InvoiceDetailPopupWindow;
import org.milleni.dunning.ui.customer.form.ProcessDetailPopupWindow;

import com.vaadin.data.util.ObjectProperty;
import com.vaadin.data.util.PropertysetItem;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

/**
 * @author Joram Barrez
 */
public  class CustomerTableListItem extends PropertysetItem implements Comparable<CustomerTableListItem> {
  
  private static final long serialVersionUID = 1L;
  
  public CustomerTableListItem(Customer customer) {
    addItemProperty("id", new ObjectProperty<Long>(customer.getCustomerId(), Long.class));
    addItemProperty("name", new ObjectProperty<String>(customer.getCustomerName(), String.class));
    addItemProperty("customerGroup", new ObjectProperty<String>(customer.getCustomerGroup()!=null ? customer.getCustomerGroup().getGroupName():"" ,String.class));
    addItemProperty("customerType", new ObjectProperty<String>(customer.getCustomerType()!=null ? customer.getCustomerType().getTypeName() :"" ,String.class));
    addItemProperty("status", new ObjectProperty<String>(customer.getStatus()  ,String.class));
    
    Button detailsField = new Button("Fatura");
	detailsField.setData(customer.getCustomerId());
	detailsField.addListener(new Button.ClickListener() {

		@Override
		public void buttonClick(ClickEvent event) {
			Long customerId = (Long) event.getButton().getData();
			ExplorerApp.get().getViewManager().showPopupWindow(new InvoiceDetailPopupWindow(customerId));
		}
	});
	addItemProperty("invoicePopup", new ObjectProperty<Button>(detailsField  ,Button.class));
  }
  
  public int compareTo(CustomerTableListItem other) {
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
  
}