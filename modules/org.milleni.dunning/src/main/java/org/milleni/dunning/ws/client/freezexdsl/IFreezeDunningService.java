
package org.milleni.dunning.ws.client.freezexdsl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "IFreezeDunningService", targetNamespace = "/FreezeDunning/Service/v1")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IFreezeDunningService {


    /**
     * 
     * @param request
     * @return
     *     returns org.milleni.dunning.ws.client.freezexdsl.DunningFreezeCustomerXDSLResponse
     * @throws IFreezeDunningServiceDunningFreezeXDSLSystemFaultFaultFaultMessage
     * @throws IFreezeDunningServiceDunningFreezeXDSLBusinessFaultFaultFaultMessage
     */
    @WebMethod(operationName = "DunningFreezeXDSL", action = "/FreezeDunning/Service/v1/IFreezeDunningService/DunningFreezeXDSL")
    @WebResult(name = "DunningFreezeXDSLResult", targetNamespace = "/FreezeDunning/Service/v1")
    @RequestWrapper(localName = "DunningFreezeXDSL", targetNamespace = "/FreezeDunning/Service/v1", className = "org.milleni.dunning.ws.client.freezexdsl.DunningFreezeXDSL")
    @ResponseWrapper(localName = "DunningFreezeXDSLResponse", targetNamespace = "/FreezeDunning/Service/v1", className = "org.milleni.dunning.ws.client.freezexdsl.DunningFreezeXDSLResponse")
    public DunningFreezeCustomerXDSLResponse dunningFreezeXDSL(
        @WebParam(name = "request", targetNamespace = "/FreezeDunning/Service/v1")
        DunningFreezeCustomerXDSLRequest request)
        throws IFreezeDunningServiceDunningFreezeXDSLBusinessFaultFaultFaultMessage, IFreezeDunningServiceDunningFreezeXDSLSystemFaultFaultFaultMessage
    ;

    /**
     * 
     * @param request
     * @return
     *     returns org.milleni.dunning.ws.client.freezexdsl.DunningUnfreezeCustomerXDSLResponse
     * @throws IFreezeDunningServiceDunningUnfreezeXDSLBusinessFaultFaultFaultMessage
     * @throws IFreezeDunningServiceDunningUnfreezeXDSLSystemFaultFaultFaultMessage
     */
    @WebMethod(operationName = "DunningUnfreezeXDSL", action = "/FreezeDunning/Service/v1/IFreezeDunningService/DunningUnfreezeXDSL")
    @WebResult(name = "DunningUnfreezeXDSLResult", targetNamespace = "/FreezeDunning/Service/v1")
    @RequestWrapper(localName = "DunningUnfreezeXDSL", targetNamespace = "/FreezeDunning/Service/v1", className = "org.milleni.dunning.ws.client.freezexdsl.DunningUnfreezeXDSL")
    @ResponseWrapper(localName = "DunningUnfreezeXDSLResponse", targetNamespace = "/FreezeDunning/Service/v1", className = "org.milleni.dunning.ws.client.freezexdsl.DunningUnfreezeXDSLResponse")
    public DunningUnfreezeCustomerXDSLResponse dunningUnfreezeXDSL(
        @WebParam(name = "request", targetNamespace = "/FreezeDunning/Service/v1")
        DunningUnfreezeCustomerXDSLRequest request)
        throws IFreezeDunningServiceDunningUnfreezeXDSLBusinessFaultFaultFaultMessage, IFreezeDunningServiceDunningUnfreezeXDSLSystemFaultFaultFaultMessage
    ;

}