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
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface InvoicePaymentOperationsWs {

    @WebMethod
    String doSomeWork(String work);
    
    
    
} 