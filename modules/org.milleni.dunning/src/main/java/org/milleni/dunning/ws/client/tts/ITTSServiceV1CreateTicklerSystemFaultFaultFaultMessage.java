
package org.milleni.dunning.ws.client.tts;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "SystemFault", targetNamespace = "http://milleni.com/technical/Fault")
public class ITTSServiceV1CreateTicklerSystemFaultFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SystemFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public ITTSServiceV1CreateTicklerSystemFaultFaultFaultMessage(String message, SystemFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ITTSServiceV1CreateTicklerSystemFaultFaultFaultMessage(String message, SystemFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.milleni.dunning.ws.client.tts.SystemFault
     */
    public SystemFault getFaultInfo() {
        return faultInfo;
    }

}
