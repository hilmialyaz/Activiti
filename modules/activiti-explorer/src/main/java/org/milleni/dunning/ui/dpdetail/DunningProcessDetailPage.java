package org.milleni.dunning.ui.dpdetail;


import org.activiti.explorer.data.LazyLoadingContainer;
import org.activiti.explorer.data.LazyLoadingQuery;
import org.activiti.explorer.ui.AbstractPage;
import org.activiti.explorer.ui.custom.ToolBar;
import org.activiti.explorer.ui.mainlayout.ExplorerLayout;
import org.milleni.dunning.ui.customer.CustomerListDetailPanel;
import org.milleni.dunning.ui.customer.CustomerMenuBar;
import org.milleni.dunning.ui.customer.CustomerSearchPanel;

import com.vaadin.ui.AbstractSelect;
import com.vaadin.ui.Component;
import com.vaadin.ui.Table;


/**
 * @author Joram Barrez
 */
public class DunningProcessDetailPage extends AbstractPage {

  private static final long serialVersionUID = -5259331126409002997L;
  
  protected Table reportTable;
  protected LazyLoadingQuery reportListQuery;
  protected LazyLoadingContainer reportListContainer;
  
  DunningProcessDetailListDetailPanel detailPanel;
  
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
		 this.detailPanel =  new DunningProcessDetailListDetailPanel(lazyLoadingQuery);
	  setDetailComponent(this.detailPanel);
  }

  protected ToolBar createMenuBar() {
    return new CustomerMenuBar();
  }


   
  @Override
  public Component getSearchComponent() {
	  grid.setColumnExpandRatio(0, .30f);
      grid.setColumnExpandRatio(1, .70f);
    return new DunningProcessDetailSearchPanel(this);
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

public DunningProcessDetailListDetailPanel getDetailPanel(){
	return detailPanel;
}



  
}
