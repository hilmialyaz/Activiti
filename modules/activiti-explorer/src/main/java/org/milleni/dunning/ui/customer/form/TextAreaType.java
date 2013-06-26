package org.milleni.dunning.ui.customer.form;

import org.activiti.engine.form.AbstractFormType;
import org.milleni.dunning.datamodel.model.Customer;

public class TextAreaType extends AbstractFormType {

	public static final String TYPE_NAME = "customtext";

	@Override
	public String getName() {
		return TYPE_NAME;
	}

	@Override
	public Object convertFormValueToModelValue(String propertyValue) {
		return propertyValue;
	}

	@Override
	public String convertModelValueToFormValue(Object modelValue) {
		if (modelValue == null) {
			return null;
		}
		return modelValue.toString();
	}

}
