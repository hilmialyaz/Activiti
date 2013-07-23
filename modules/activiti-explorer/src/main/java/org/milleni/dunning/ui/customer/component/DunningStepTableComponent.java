package org.milleni.dunning.ui.customer.component;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.activiti.explorer.ExplorerApp;
import org.activiti.explorer.I18nManager;
import org.activiti.explorer.Messages;
import org.activiti.explorer.ui.Images;
import org.activiti.explorer.ui.custom.PrettyTimeLabel;
import org.activiti.explorer.ui.mainlayout.ExplorerLayout;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessDetailLogs;
import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.datamodel.util.DaoHelper;

import com.vaadin.data.Item;
import com.vaadin.ui.Component;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.Table;

public class DunningStepTableComponent extends Table{

	
	protected I18nManager i18nManager;

	private Collection<DunningProcessDetail> processDetails ;
	
	public DunningStepTableComponent(Collection<DunningProcessDetail> processDetails){
		this.processDetails = processDetails;
		this.i18nManager = ExplorerApp.get().getI18nManager();
		createProcessStepList(processDetails);
	}
	
	
	protected void createProcessStepList(Collection<DunningProcessDetail> processDetails) {

		this.addStyleName(ExplorerLayout.STYLE_PROCESS_DEFINITION_LIST);

		// Set non-editable, selectable and full-size
		this.setEditable(false);
		this.setImmediate(true);
		this.setSelectable(true);
		this.setNullSelectionAllowed(false);
		this.setSortDisabled(true);
		this.setSizeFull();

		this.addContainerProperty("finished", Component.class, null, "", null, Table.ALIGN_CENTER);
		this.setColumnWidth("finished", 22);
		this.addContainerProperty("name", String.class, null, i18nManager.getMessage(Constants.DUNNING_BPM_RPOCESS_ID), null, Table.ALIGN_LEFT);
		this.addContainerProperty("startDate", Date.class, null, i18nManager.getMessage(Constants.DUNNING_START_DATE), null, Table.ALIGN_LEFT);
		this.addContainerProperty("endDate", Date.class, null, i18nManager.getMessage(Constants.DUNNING_END_DATE), null, Table.ALIGN_LEFT);
		this.addContainerProperty("currentDebit", String.class, null, i18nManager.getMessage(Constants.DUNNING_CURRENT_DEBIT), null, Table.ALIGN_LEFT);
		//processStepTable.addContainerProperty("logkey", String.class, null, i18nManager.getMessage(Constants.DUNNING_BPM_RPOCESS_ID), null, Table.ALIGN_LEFT);
		//processStepTable.addContainerProperty("logvalue", String.class, null, i18nManager.getMessage(Constants.DUNNING_BPM_RPOCESS_ID), null, Table.ALIGN_LEFT);

		// processStepTable.setColumnHeaderMode(Table.COLUMN_HEADER_MODE_HIDDEN);
		
		

		for (DunningProcessDetail dunningProcessDetail : processDetails) {
			Item item = this.addItem(dunningProcessDetail);
			Embedded embed = null;
			if (dunningProcessDetail.getStatus()!=null && Constants.SUCCESS.equals(dunningProcessDetail.getStatus().getId())) {
				embed= new Embedded(null, Images.TASK_FINISHED_22);
				item.getItemProperty("finished").setValue(embed);
			} else {
				embed = new Embedded(null, Images.TASK_22);
				item.getItemProperty("finished").setValue(embed);
			}
			
			item.getItemProperty("name").setValue(dunningProcessDetail.getProcessStepId().getStepText());
			item.getItemProperty("startDate").setValue(dunningProcessDetail.getCreateDate());
			item.getItemProperty("endDate").setValue(dunningProcessDetail.getStatusDate());
			item.getItemProperty("currentDebit").setValue(String.valueOf(  dunningProcessDetail.getCurrentDebit()!=null ? dunningProcessDetail.getCurrentDebit() : ""));
			Collection<DunningProcessDetailLogs> logs = dunningProcessDetail.getDunningProcessDetailLogsCollection();
			
			
			String desc = "<h2>Task Logları</h2><ul>";
						
			for (DunningProcessDetailLogs dunningProcessDetailLogs : logs) {
				/*
				Item itemLog = processStepTable.addItem(dunningProcessDetailLogs);
				itemLog.getItemProperty("name").setValue("");
				itemLog.getItemProperty("logkey").setValue();
				itemLog.getItemProperty("logvalue").setValue();
				*/				
				desc  ="<li>"+ dunningProcessDetailLogs.getLogKey()+": "+dunningProcessDetailLogs.getLogText() +"</li>"; 
				    
			}
			desc += "</ul>";
			if(logs!=null  && logs.size()>0)
				embed.setDescription(desc);
		}
	}
}
