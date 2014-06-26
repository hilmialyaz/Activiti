package org.milleni.dunning.ui.customer;

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


import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.activiti.engine.IdentityService;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.identity.Group;
import org.activiti.explorer.ExplorerApp;
import org.activiti.explorer.I18nManager;
import org.activiti.explorer.Messages;
import org.activiti.explorer.ViewManager;
import org.activiti.explorer.identity.LoggedInUser;
import org.activiti.explorer.ui.Images;
import org.activiti.explorer.ui.custom.ToolBar;
import org.activiti.explorer.ui.custom.ToolbarEntry;
import org.activiti.explorer.ui.custom.ToolbarEntry.ToolbarCommand;
import org.activiti.explorer.ui.custom.ToolbarPopupEntry;
import org.activiti.explorer.ui.task.data.ArchivedListQuery;
import org.activiti.explorer.ui.task.data.InboxListQuery;
import org.activiti.explorer.ui.task.data.InvolvedListQuery;
import org.activiti.explorer.ui.task.data.QueuedListQuery;
import org.activiti.explorer.ui.task.data.TasksListQuery;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

/**
 * The menu bar which is shown when 'Tasks' is selected in the main menu.
 * 
 * @author Joram Barrez
 * @author Frederik Heremans
 */
public class CustomerMenuBar extends ToolBar {
  
  private static final long serialVersionUID = 1L;
  
  public static final String ENTRY_CUSTOMERS = "customers";
  
  public static final String ENTRY_DUNNING_PROCESS = "dunningProcess";
  
  public static final String ENTRY_DUNNING_PROCESS_DETAIL = "dunningProcessDetail";
  
  public static final String ENTRY_DUNNING_PROCESS_START = "dunningProcessStart";
  
  protected transient IdentityService identityService;
  protected ViewManager viewManager;
  protected I18nManager i18nManager;
  
  public CustomerMenuBar() {
    this.viewManager = ExplorerApp.get().getViewManager();
    this.i18nManager = ExplorerApp.get().getI18nManager();
    initItems();
    initActions();
  }
  
  protected void initItems() {
    setWidth("100%");
    ToolbarEntry customerPageEntry = addToolbarEntry(ENTRY_CUSTOMERS, i18nManager.getMessage(Messages.MAIN_MENU_CUSTOMERS), new ToolbarCommand() {
      public void toolBarItemSelected() {
        viewManager.showCustomerPage();        
      }
    });
    if (!ExplorerApp.get().getLoggedInUser().isLimited()) {
    ToolbarEntry dunningProcessEntry = addToolbarEntry(ENTRY_DUNNING_PROCESS, i18nManager.getMessage(Messages.MAIN_MENU_DUNNING_PROCESS), new ToolbarCommand() {
        public void toolBarItemSelected() {
          viewManager.showDunningProcess();        
        }
      });
    
    }
    if (!ExplorerApp.get().getLoggedInUser().isLimited()) {
    ToolbarEntry dunningProcessDetailEntry = addToolbarEntry(ENTRY_DUNNING_PROCESS_DETAIL, i18nManager.getMessage(Messages.MAIN_MENU_DUNNING_PROCESS_DETAIL), new ToolbarCommand() {
        public void toolBarItemSelected() {
          viewManager.showDunningProcessDetail();       
        }
      });
    }
    
    if (!ExplorerApp.get().getLoggedInUser().isLimited()) {
    ToolbarEntry dunningProcessStart = addToolbarEntry(ENTRY_DUNNING_PROCESS_START, i18nManager.getMessage(Messages.MAIN_MENU_DUNNING_PROCESS_START), new ToolbarCommand() {
        public void toolBarItemSelected() {
          viewManager.showStartDunningProcess();       
        }
      });
    }
  }
  
  protected void initActions() {
	/*  
    Button newCaseButton = new Button();
    newCaseButton.setCaption(i18nManager.getMessage(Messages.TASK_NEW));
    newCaseButton.setIcon(Images.TASK_16);
    addButton(newCaseButton);
    
    newCaseButton.addListener(new ClickListener() {
      public void buttonClick(ClickEvent event) {
    	  System.out.println("test");
      }
    });
    */
    
  }
  
}
