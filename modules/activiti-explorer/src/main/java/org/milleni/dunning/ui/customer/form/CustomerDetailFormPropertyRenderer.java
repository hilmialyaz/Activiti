package org.milleni.dunning.ui.customer.form;


import java.util.Date;
import java.util.List;

import org.activiti.engine.form.FormProperty;
import org.activiti.explorer.ExplorerApp;
import org.activiti.explorer.ui.form.AbstractFormPropertyRenderer;
import org.activiti.explorer.ui.mainlayout.ExplorerLayout;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.CustomerInvoices;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.util.DaoHelper;

import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Field;
import com.vaadin.ui.Form;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextArea;

public class CustomerDetailFormPropertyRenderer extends AbstractFormPropertyRenderer {

	public CustomerDetailFormPropertyRenderer() {
		super(CustomerDetailFormType.class);
	}

	@Override
	public Field getPropertyField(FormProperty formProperty) {
		
		if (formProperty.getValue() == null) {	   
		    return null;
		}
		Customer bean = DaoHelper.getInstance().getCustomerService().findOne(Long.parseLong(formProperty.getValue()));
		if(bean==null) return null;
		
		// Wrap it in a BeanItem
		//BeanItem<Customer> item = new BeanItem<Customer>(bean);
		        
		// Bind it to a component
		Form custForm = new Form();
		
		custForm.setReadOnly(true);
		//custForm.setItemDataSource(item);

		
		final Table custTable = new Table();
		custTable.setWidth(100,com.vaadin.terminal.Sizeable.UNITS_PERCENTAGE);
		custTable.setHeight(70, com.vaadin.terminal.Sizeable.UNITS_PIXELS);

		custTable.setEditable(false);
		custTable.setImmediate(true);
		custTable.setSelectable(true);
		custTable.setSortDisabled(false);

		//custTable.addContainerProperty("id", String.class, null, "Müşteri No", null, Table.ALIGN_LEFT);
		custTable.addContainerProperty("musteriAdi", String.class, null, "Müşteri Adı", null, Table.ALIGN_LEFT);
		custTable.addContainerProperty("hizmetTuru", String.class, null, "Müşteri Tipi", null, Table.ALIGN_LEFT);
		custTable.addContainerProperty("durum", String.class, null, "Durum", null, Table.ALIGN_LEFT);
		
		
		custTable.addItem(new Object[] {bean.getCustomerName(),bean.getCustomerType().getTypeName(),bean.getStatus()}, bean.getCustomerId());
		
		custTable.addListener(new Property.ValueChangeListener() {
			private static final long serialVersionUID = 1L;

			public void valueChange(ValueChangeEvent event) {
				Long rowCustomerId  = (Long) event.getProperty().getValue();
				if (rowCustomerId != null) {
		            ExplorerApp.get().getViewManager().showPopupWindow(new CustomerDetailPopupWindow(rowCustomerId));
				}
			}
		});
		
		
		//instancesTable.addContainerProperty("start activity id", String.class, null, "Hizmet Türü", null, Table.ALIGN_LEFT);
		//instancesTable.addContainerProperty("start time", String.class, null, "Toplam", null, Table.ALIGN_LEFT);
		/*
		TextArea textArea = new TextArea(getPropertyLabel(formProperty));
		textArea.setRequired(formProperty.isRequired());
		textArea.setEnabled(formProperty.isWritable());
		textArea.setRows(10);
		textArea.setColumns(50);
		textArea.setRequiredError(getMessage(Messages.FORM_FIELD_REQUIRED,
				getPropertyLabel(formProperty)));

		if (formProperty.getValue() != null) {
			textArea.setValue(formProperty.getValue());
		}

		return textArea;
		*/
		custForm.addField("custList", custTable);
		//custForm.addField("invList", invTable);
		return custForm;
		
	}

}