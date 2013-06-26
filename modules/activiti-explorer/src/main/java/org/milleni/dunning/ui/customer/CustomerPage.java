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
import org.activiti.explorer.data.LazyLoadingContainer;
import org.activiti.explorer.data.LazyLoadingQuery;
import org.activiti.explorer.ui.AbstractPage;
import org.activiti.explorer.ui.AbstractTablePage;
import org.activiti.explorer.ui.custom.TaskListHeader;
import org.activiti.explorer.ui.custom.ToolBar;
import org.activiti.explorer.ui.mainlayout.ExplorerLayout;

import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.AbstractSelect;
import com.vaadin.ui.Component;
import com.vaadin.ui.Table;


/**
 * @author Joram Barrez
 */
public class CustomerPage extends AbstractPage {

  private static final long serialVersionUID = -5259331126409002997L;
  
  protected Table reportTable;
  protected LazyLoadingQuery reportListQuery;
  protected LazyLoadingContainer reportListContainer;
  
  //private CustomerService customerService;
  //@Autowired
  //private LoanRequestBean loanRequestBean;
  
  
  protected Table createList() {
	//customerService =  ProcessEngines.getDefaultProcessEngine().getCustomerService(); 
	//customerService.newUser("hebele");
    Table table = new Table();

    table.addStyleName(ExplorerLayout.STYLE_PROCESS_DEFINITION_LIST);
    //table.addGeneratedColumn("icon", new ThemeImageColumnGenerator(Images.REPORT_22));
    table.setColumnWidth("icon", 18);
    
    //table.addContainerProperty("name", String.class, null);
    table.setColumnHeaderMode(Table.COLUMN_HEADER_MODE_HIDDEN);
    
    // Set non-editable, selectable and full-size
    table.setEditable(false);
    table.setImmediate(true);
    table.setSelectable(true);
    table.setNullSelectionAllowed(false);
    table.setSortDisabled(true);
    table.setSizeFull();
    
    return table;
  }
  
 
  public void setDetailComponent(LazyLoadingQuery lazyLoadingQuery){
	  setDetailComponent(new CustomerListDetailPanel(lazyLoadingQuery));
  }

  protected ToolBar createMenuBar() {
    return new CustomerMenuBar();
  }


   
  @Override
  public Component getSearchComponent() {
    return new CustomerSearchPanel(this);
  }


@Override
protected AbstractSelect createSelectComponent() {
	// TODO Auto-generated method stub
	return null;
}


@Override
public void refreshSelectNext() {
	// TODO Auto-generated method stub
	
}


@Override
public void selectElement(int index) {
	// TODO Auto-generated method stub
	
} 
  
}
