package org.milleni.dunning.ui.customer.form;

import org.activiti.engine.form.AbstractFormType;
import org.milleni.dunning.datamodel.model.Customer;

public class CustomerDetailFormType extends AbstractFormType {

	public static final String TYPE_NAME = "customerform";

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
		System.out.println(modelValue);
		
		if (modelValue == null) {
			return null;
		}
		return ((Long)modelValue).toString();
	}

}
