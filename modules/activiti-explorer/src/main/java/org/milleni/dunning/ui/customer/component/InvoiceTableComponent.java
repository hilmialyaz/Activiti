package org.milleni.dunning.ui.customer.component;

import java.text.SimpleDateFormat;
import java.util.List;

import org.activiti.explorer.ExplorerApp;
import org.activiti.explorer.I18nManager;
import org.activiti.explorer.Messages;
import org.activiti.explorer.ui.Images;
import org.activiti.explorer.ui.custom.PrettyTimeLabel;
import org.activiti.explorer.ui.mainlayout.ExplorerLayout;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.util.Constants;
import org.milleni.dunning.datamodel.util.DaoHelper;

import com.vaadin.data.Item;
import com.vaadin.ui.Component;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.Table;

public class InvoiceTableComponent extends Table{

	List<CustomerInvoices> invoiceList;	
	protected I18nManager i18nManager;
	
	public InvoiceTableComponent(Long customerId){
		invoiceList = DaoHelper.getInstance().getCustomerService().listCustomerInvoices(customerId);
		this.i18nManager = ExplorerApp.get().getI18nManager();
		addInvoices(invoiceList);
	}
	
	
	
	protected void addInvoices(List<CustomerInvoices> invoiceList) {
		this.addStyleName(ExplorerLayout.STYLE_PROCESS_INSTANCE_TASK_LIST);
		this.setWidth(100, UNITS_PERCENTAGE);
		this.setHeight(250, UNITS_PIXELS);

		this.addContainerProperty("status", Component.class, null, i18nManager.getMessage(Constants.DUNNING_INVOICE_STATUS), null, Table.ALIGN_CENTER);
		this.setColumnWidth("status", 80);

		this.addContainerProperty("total", String.class, null, i18nManager.getMessage(Constants.DUNNING_INVOICE_AMOUNT), null, Table.ALIGN_LEFT);
		this.addContainerProperty("dueDate",String.class, null, i18nManager.getMessage(Constants.DUNNING_INVOICE_SOT), null, Table.ALIGN_LEFT);
		this.addContainerProperty("invoiceDate",String.class, null, i18nManager.getMessage(Constants.DUNNING_INVOICE_DATE), null, Table.ALIGN_LEFT);
		this.addContainerProperty("sapId",  String.class, null, i18nManager.getMessage(Constants.DUNNING_INVOICE_PAYMENT_ID), null, Table.ALIGN_LEFT);
		
		if (invoiceList.size() > 0) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			// Finished icon
			
			for (CustomerInvoices inv : invoiceList) {
				Item item = this.addItem(inv.getInvoiceId());
				Embedded embed = null;
				if ( Constants.PAID.equalsIgnoreCase(inv.getPaymentStatus())) {
					embed = new Embedded(null, Images.TASK_FINISHED_22);
					embed.setDescription(Constants.DUNNING_INVOICE_PAID);
					item.getItemProperty("status").setValue(embed);		
				} else {
					embed = new Embedded(null, Images.TASK_22);
					embed.setDescription(Constants.DUNNING_INVOICE_UNPAID);
					item.getItemProperty("status").setValue(embed);
				}

				item.getItemProperty("total").setValue(inv.getInvoiceAmount());
				try{
					item.getItemProperty("dueDate").setValue(simpleDateFormat.format(inv.getInvoiceDueDate()));
				}catch(Exception ex){};
				try{
					item.getItemProperty("invoiceDate").setValue(simpleDateFormat.format(inv.getInvoiceDate()));
				}catch(Exception ex){};
				item.getItemProperty("sapId").setValue(inv.getExtPaymentInvId());
			}

			this.setPageLength(this.size());
		} else {
		}
	}
}
