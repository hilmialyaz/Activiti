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

public class TextAreaRenderer extends AbstractFormPropertyRenderer {

	public TextAreaRenderer() {
		super(TextAreaType.class);
	}

	@Override
	public Field getPropertyField(FormProperty formProperty) {
	
		TextArea textArea = new TextArea(getPropertyLabel(formProperty));
		
		textArea.setRequired(formProperty.isRequired());
		textArea.setEnabled(formProperty.isWritable());
		textArea.setSizeFull();
		textArea.setRows(10);
		//textArea.setColumns(50);
		textArea.setWordwrap(false);
		
		if(formProperty.getValue()!=null) textArea.setValue(formProperty.getValue());
		/*
		if (formProperty.getValue() != null) {
			textArea.setValue(formProperty.getValue());
		}
		*/
		return textArea;
	}

}