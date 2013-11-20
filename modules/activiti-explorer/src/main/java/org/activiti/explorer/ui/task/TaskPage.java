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

package org.activiti.explorer.ui.task;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.activiti.engine.ProcessEngines;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.activiti.explorer.ExplorerApp;
import org.activiti.explorer.data.LazyLoadingContainer;
import org.activiti.explorer.data.LazyLoadingQuery;
import org.activiti.explorer.navigation.UriFragment;
import org.activiti.explorer.ui.AbstractTablePage;
import org.activiti.explorer.ui.Images;
import org.activiti.explorer.ui.custom.SelectUsersPopupWindow;
import org.activiti.explorer.ui.custom.TaskListHeader;
import org.activiti.explorer.ui.custom.ToolBar;
import org.activiti.explorer.ui.event.SubmitEvent;
import org.activiti.explorer.ui.event.SubmitEventListener;
import org.activiti.explorer.ui.mainlayout.ExplorerLayout;
import org.activiti.explorer.ui.util.ThemeImageColumnGenerator;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;

import com.vaadin.addon.tableexport.ExcelExport;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.Field;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.ColumnGenerator;
import com.vaadin.ui.Table.HeaderClickEvent;
import com.vaadin.ui.Table.HeaderClickListener;
import com.vaadin.ui.themes.BaseTheme;

/**
 * Abstract super class for all task pages (inbox, queued, archived, etc.),
 * Builds up the default UI: task list on the left, central panel and events on
 * the right.
 * 
 * @author Joram Barrez
 */
public abstract class TaskPage extends AbstractTablePage {

	private static final long serialVersionUID = 1L;

	protected transient TaskService taskService;

	protected String taskId;
	protected Table taskTable;
	protected LazyLoadingContainer taskListContainer;
	protected LazyLoadingQuery lazyLoadingQuery;
	protected TaskEventsPanel taskEventPanel;
	protected TaskPage taskPage;

	public TaskPage() {
		taskService = ProcessEngines.getDefaultProcessEngine().getTaskService();
		taskPage = this;
	}

	public TaskPage(String taskId) {
		this();
		this.taskId = taskId;
	}

	@Override
	protected void initUi() {
		super.initUi();
		if (taskId == null) {
			selectElement(0);
		} else {
			int index = taskListContainer.getIndexForObjectId(taskId);
			selectElement(index);
		}

		if (taskListContainer.size() == 0) {
			ExplorerApp.get().setCurrentUriFragment(getUriFragment(null));
		}
	}

	@Override
	protected ToolBar createMenuBar() {
		return new TaskMenuBar();
	}

	Map<Object, CheckBox> mapCheckBox = null;
	boolean checked = false;

	@Override
	protected Table createList() {
		taskTable = new Table();
		taskTable.addStyleName(ExplorerLayout.STYLE_TASK_LIST);
		taskTable.addStyleName(ExplorerLayout.STYLE_SCROLLABLE);

		// Listener to change right panel when clicked on a task
		taskTable.addListener(getListSelectionListener());

		this.lazyLoadingQuery = createLazyLoadingQuery();
		this.taskListContainer = new LazyLoadingContainer(lazyLoadingQuery, 30);
		taskTable.setContainerDataSource(taskListContainer);

		// Create column header
		taskTable.addGeneratedColumn("icon", new ThemeImageColumnGenerator(Images.TASK_22));
		taskTable.setColumnWidth("icon", 22);

		taskTable.addContainerProperty("name", String.class, null);
		// taskTable.setColumnHeaderMode(Table.COLUMN_HEADER_MODE_HIDDEN);

		mapCheckBox = new HashMap<Object, CheckBox>();

		taskTable.addGeneratedColumn("checkbox", new ColumnGenerator() {

			public Object generateCell(Table source, Object itemId, Object columnId) {
				Field field = new CheckBox();
				((AbstractComponent) field).setImmediate(true);
				mapCheckBox.put(itemId, (CheckBox) field);
				return field;
			}
		});

		HeaderClickListener headerClickListener = new HeaderClickListener() {

			@Override
			public void headerClick(HeaderClickEvent event) {
				// TODO Auto-generated method stub
				LinkedList<Integer> container = (LinkedList<Integer>) taskTable.getVisibleItemIds();
				System.out.println(container);
				for (Integer intIds : container) {

					CheckBox check = mapCheckBox.get(intIds);
					check.setValue(!checked);
					System.out.println(check);
				}
				checked = !checked;

			}
		};

		taskTable.addListener(headerClickListener);

		return taskTable;
	}

	protected ValueChangeListener getListSelectionListener() {
		return new Property.ValueChangeListener() {
			private static final long serialVersionUID = 1L;

			public void valueChange(ValueChangeEvent event) {
				Item item = taskTable.getItem(event.getProperty().getValue()); 

				if (item != null) {
					String id = (String) item.getItemProperty("id").getValue();
					setDetailComponent(createDetailComponent(id));

					UriFragment taskFragment = getUriFragment(id);
					ExplorerApp.get().setCurrentUriFragment(taskFragment);
				} else {
					// Nothing is selected
					setDetailComponent(null);
					ExplorerApp.get().setCurrentUriFragment(getUriFragment(null));
				}
			}
		};
	}

	protected Component createDetailComponent(String id) {
		Task task = taskService.createTaskQuery().taskId(id).singleResult();
		Component detailComponent = new TaskDetailPanel(task, TaskPage.this);
		if(taskEventPanel!=null) taskEventPanel.setTaskId(task.getId());
		return detailComponent;
	}

	@Override
	protected Component getEventComponent() {
		return getTaskEventPanel();
	}

	public TaskEventsPanel getTaskEventPanel() {
		if (taskEventPanel == null) {
			taskEventPanel = new TaskEventsPanel();
		}
		return taskEventPanel;
	}

	@Override
	public Component getSearchComponent() {
		TaskListHeader header = new TaskListHeader();
        
		Button claimButton = new Button("Taskı Al");
		Button assignButton = new Button("Taskı Gönder");
		
		assignButton.setIcon(Images.EXECUTE);
		claimButton.setIcon(Images.EXECUTE);
		claimButton.addListener(new ClickListener() {

			private static final long serialVersionUID = 1L;

			public void buttonClick(ClickEvent event) {
				try {

					// TODO Auto-generated method stub
					LinkedList<Integer> container = (LinkedList<Integer>) taskTable.getVisibleItemIds();
					System.out.println(container);
					boolean isChecked = false;
					for (Integer intIds : container) {
						CheckBox check = mapCheckBox.get(intIds);
						if ((Boolean) check.getValue()) {
							isChecked = true;
							String taskId = (String) taskTable.getContainerProperty(intIds, "id").getValue();
							System.out.println(intIds + " taskid " + taskId);
							taskService.claim(taskId, ExplorerApp.get().getLoggedInUser().getId());
						}
						// String id = (String)
						// item.getItemProperty("id").getValue();

					}
					if (isChecked)
						taskPage.refreshSelectNext();

				} catch (Exception ae) {
					String errorMessage = ae.getMessage() + (ae.getCause() != null ? " (" + ae.getCause().getClass().getName() + ")" : "");
				}
			}
		});


		
		assignButton.addListener(new ClickListener() {

			private static final long serialVersionUID = 1L;

			public void buttonClick(ClickEvent event) {				
				final SelectUsersPopupWindow involvePeoplePopupWindow = new SelectUsersPopupWindow("Reassign", false);
				ExplorerApp.get().getViewManager().showPopupWindow(involvePeoplePopupWindow);
				involvePeoplePopupWindow.addListener(new SubmitEventListener() {
					protected void submitted(SubmitEvent event) {

						LinkedList<Integer> container = (LinkedList<Integer>) taskTable.getVisibleItemIds();
						String selectedUser = involvePeoplePopupWindow.getSelectedUserId();
						
						boolean isChecked = false;
						for (Integer intIds : container) {
							CheckBox check = mapCheckBox.get(intIds);
							if ((Boolean) check.getValue()) {
								isChecked = true;
								String taskId = (String) taskTable.getContainerProperty(intIds, "id").getValue();
								System.out.println(intIds + " taskid " + taskId);
								taskService.setAssignee(taskId, selectedUser);						
							}

						}
						if (isChecked)
							taskPage.refreshSelectNext();
					}

					protected void cancelled(SubmitEvent event) {
					}
				});
			}
		});

		final ThemeResource export = new ThemeResource("../images/table-excel.png");
		final Button excelExportButton = new Button();
		excelExportButton.setIcon(export);
		excelExportButton.setStyleName(BaseTheme.BUTTON_LINK);

		excelExportButton.addListener(new ClickListener() {
			private static final long serialVersionUID = -73954695086117200L;
			private ExcelExport excelExport;

			public void buttonClick(final ClickEvent event) {
				excelExport = new ExcelExport(taskTable);

				excelExport.excludeCollapsedColumns();
				excelExport.setDisplayTotals(false);
				excelExport.setRowHeaders(true);
				CellStyle cs = excelExport.getTitleStyle();
				cs.setFillBackgroundColor(HSSFColor.GREY_25_PERCENT.index);
				excelExport.setTitleStyle(cs);
				excelExport.setDoubleDataFormat("0.00");
				excelExport.setExcelFormatOfProperty("konto", "0");
				excelExport.export();
			}
		});
		
		if(!(this instanceof InboxPage || this instanceof TasksPage) ){
			header.getButtonlayout().addComponent(claimButton);
			header.getButtonlayout().setComponentAlignment(claimButton, Alignment.TOP_LEFT);
		}

		
		header.getButtonlayout().addComponent(assignButton);
		header.getButtonlayout().setComponentAlignment(assignButton, Alignment.TOP_LEFT);
		header.getButtonlayout().addComponent(excelExportButton);
		header.getButtonlayout().setComponentAlignment(excelExportButton, Alignment.TOP_LEFT);
		
		return header;
	}

	@Override
	public void refreshSelectNext() {

		// Selects new element in the table
		super.refreshSelectNext();

		// Update the counts in the header
		addMenuBar();
	}

	protected abstract LazyLoadingQuery createLazyLoadingQuery();

	protected abstract UriFragment getUriFragment(String taskId);

}
