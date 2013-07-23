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

public class DunningStepLogTableComponent extends Table{

	
	protected I18nManager i18nManager;

	private Collection<DunningProcessDetailLogs> processDetailLogs ;
	
	public DunningStepLogTableComponent(Collection<DunningProcessDetailLogs> processDetailLogs){
		this.processDetailLogs = processDetailLogs;
		this.i18nManager = ExplorerApp.get().getI18nManager();
		createProcessStepList(processDetailLogs);
	}
	
	
	protected void createProcessStepList(Collection<DunningProcessDetailLogs> processDetails) {
		this.addStyleName(ExplorerLayout.STYLE_PROCESS_DEFINITION_LIST);
		this.setEditable(false);
		this.setImmediate(true);
		this.setSelectable(true);
		this.setNullSelectionAllowed(false);
		this.setSortDisabled(true);
		this.setSizeFull();

		this.addContainerProperty("key", String.class, null, i18nManager.getMessage(Constants.DUNNING_BPM_RPOCESS_ID), null, Table.ALIGN_LEFT);
		this.addContainerProperty("value", String.class, null, i18nManager.getMessage(Constants.DUNNING_CURRENT_DEBIT), null, Table.ALIGN_LEFT);

		for (DunningProcessDetailLogs dunningProcessDetailLog : processDetails) {
			Item item = this.addItem(dunningProcessDetailLog);
			item.getItemProperty("key").setValue(dunningProcessDetailLog.getLogKey()!=null ? dunningProcessDetailLog.getLogKey():"");
			item.getItemProperty("value").setValue(dunningProcessDetailLog.getLogText()!=null ? dunningProcessDetailLog.getLogText():"");
		}
	}
}
