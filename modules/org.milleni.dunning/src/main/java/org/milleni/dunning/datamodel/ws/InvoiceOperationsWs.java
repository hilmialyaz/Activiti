package org.milleni.dunning.datamodel.ws;

import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author juancavallotti
 */
@WebService
@SOAPBinding
public interface InvoiceOperationsWs {

    @WebMethod
    public InvoicePaymentResponse  paymentReceived(long customerId);
    
    
    
} 