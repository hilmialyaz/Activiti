
package org.milleni.dunning.ws.client.crm;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "BusinessFault", targetNamespace = "http://milleni.com/technical/Fault")
public class CustomerInfoServiceV1ProcessStaticIpRequestsBusinessFaultFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private BusinessFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public CustomerInfoServiceV1ProcessStaticIpRequestsBusinessFaultFaultFaultMessage(String message, BusinessFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public CustomerInfoServiceV1ProcessStaticIpRequestsBusinessFaultFaultFaultMessage(String message, BusinessFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.milleni.dunning.ws.client.crm.BusinessFault
     */
    public BusinessFault getFaultInfo() {
        return faultInfo;
    }

}
