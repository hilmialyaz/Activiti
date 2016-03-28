package org.milleni.dunning.datamodel.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.activiti.engine.RuntimeService;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.rule.InvoicePaymentRuleService;
import org.milleni.dunning.datamodel.service.CustomerService;
import org.milleni.dunning.datamodel.service.DunningProcessService;
import org.milleni.dunning.datamodel.util.DaoHelper;
import org.springframework.beans.factory.annotation.Autowired;


@WebService
public class InvoicePaymentOperationsWsImpl implements InvoicePaymentOperationsWs {

	@Autowired
	protected transient RuntimeService runtimeService;
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	InvoicePaymentRuleService invoicePaymentRuleService; 
	
	@Autowired
	DunningProcessService dunningProcessService;
	
	
	@Override
	@WebMethod
	public InvoicePaymentResponse  paymentReceived(long customerId){
		InvoicePaymentResponse response = new InvoicePaymentResponse();
		response.setStatus(Status.NOT_ACTIVATED);
		
		Customer customer = customerService.findOne(customerId);		
		
		if(customer==null){
			response.setResponseCode(ResponseCode.BussinessError);
			response.setResponseDesc("Musteri dunningde bulunamadi.");
			return response;
		}
				
		boolean customerHasUnpaidBill;
		try {
			customerHasUnpaidBill = invoicePaymentRuleService.customerHasUnpaidBillInLimit(customerId, true);
		
			if(!customerHasUnpaidBill){
				try{
					dunningProcessService.activateIfSuspend(customerId);
					response.setStatus(Status.ACTIVATED);
				}catch(Exception ex){}
				DaoHelper.getInstance().getProcessSignalService().signalCustomerProcessIfPaymentReceived(customerId);
			}else{
				response.setStatus(Status.NOT_ACTIVATED);
			}
		} catch (Exception e) {
			response.setResponseCode(ResponseCode.SystemError);
			response.setResponseDesc(e.getMessage());
			return response;					
		}
		response.setResponseCode(ResponseCode.Success);
		return response;
	}


}