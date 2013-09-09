package org.milleni.dunning.ui.prcstart;

import org.activiti.explorer.ExplorerApp;
import org.activiti.explorer.I18nManager;
import org.activiti.explorer.Messages;
import org.activiti.explorer.data.LazyLoadingContainer;
import org.activiti.explorer.data.LazyLoadingQuery;
import org.activiti.explorer.navigation.ReportNavigator;
import org.activiti.explorer.navigation.UriFragment;
import org.activiti.explorer.ui.AbstractTablePage;
import org.activiti.explorer.ui.Images;
import org.activiti.explorer.ui.custom.ToolBar;
import org.activiti.explorer.ui.management.admin.AdminCompletedInstancesPanel;
import org.activiti.explorer.ui.management.admin.AdminDatabaseSettingsPanel;
import org.activiti.explorer.ui.management.admin.AdminRunningInstancesPanel;
import org.activiti.explorer.ui.management.admin.AdministrationNavigator;
import org.activiti.explorer.ui.util.ThemeImageColumnGenerator;
import org.milleni.dunning.ui.customer.CustomerMenuBar;

import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.Table;

/**
 * @author Joram Barrez
 */
public class DunningProcessOperations extends AbstractTablePage {

	private static final long serialVersionUID = 1L;

	protected I18nManager i18nManager;
	protected String managementId;
	protected Table menuTable;

	public DunningProcessOperations() {
		ExplorerApp.get().setCurrentUriFragment(new UriFragment(AdministrationNavigator.MANAGEMENT_URI_PART));
		this.i18nManager = ExplorerApp.get().getI18nManager();
	}

	@Override
	protected void initUi() {
		super.initUi();
		int index = 0;
		if (managementId != null) {
			index = Integer.valueOf(managementId);
		}
		menuTable.select(index);
		menuTable.setCurrentPageFirstItemId(index);
	}

	protected Table createList() {
		menuTable = new Table();

		menuTable.setEditable(false);
		menuTable.setImmediate(true);
		menuTable.setSelectable(true);
		menuTable.setNullSelectionAllowed(false);
		menuTable.setSortDisabled(true);
		menuTable.setSizeFull();

		// Column headers
		menuTable.addContainerProperty("name", String.class, null);
		menuTable.setColumnHeaderMode(Table.COLUMN_HEADER_MODE_HIDDEN);

		menuTable.addItem(new String[] { i18nManager.getMessage(Messages.MAIN_MENU_DUNNING_PROCESS_BASLAT) }, 0);
		//menuTable.addItem(new String[] { i18nManager.getMessage(Messages.ADMIN_MENU_COMPLETED) }, 1);
		//menuTable.addItem(new String[] { i18nManager.getMessage(Messages.ADMIN_MENU_DATABASE) }, 2);

		// Listener to change right panel when clicked on a user
		menuTable.addListener(new Property.ValueChangeListener() {
			private static final long serialVersionUID = 1L;

			public void valueChange(ValueChangeEvent event) {
				Item item = menuTable.getItem(event.getProperty().getValue()); 
				if (item != null) {

					if ("0".equals(event.getProperty().getValue().toString())) {
						setDetailComponent(new BulkDunningProcessStartPanel());
					} else if ("1".equals(event.getProperty().getValue().toString())) {
						setDetailComponent(new AdminCompletedInstancesPanel());
					} else if ("2".equals(event.getProperty().getValue().toString())) {
						setDetailComponent(new AdminDatabaseSettingsPanel());
					}

					// Update URL
					ExplorerApp.get().setCurrentUriFragment(new UriFragment(AdministrationNavigator.MANAGEMENT_URI_PART, event.getProperty().getValue().toString()));
				} else {
					// Nothing is selected
					setDetailComponent(null);
					ExplorerApp.get().setCurrentUriFragment(new UriFragment(AdministrationNavigator.MANAGEMENT_URI_PART, managementId));
				}
			}
		});

		return menuTable;
	}

	protected ToolBar createMenuBar() {
		return new CustomerMenuBar();
	}

}
