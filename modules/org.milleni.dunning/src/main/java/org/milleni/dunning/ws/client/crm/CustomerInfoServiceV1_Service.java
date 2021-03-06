
package org.milleni.dunning.ws.client.crm;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "CustomerInfoServiceV1", targetNamespace = "/CustomerInfo/Service/v1", wsdlLocation = "http://192.168.2.88:8230/CustomerInfoService/CustomerInfoServiceV1.svc?singleWsdl")
public class CustomerInfoServiceV1_Service
    extends Service
{

    private final static URL CUSTOMERINFOSERVICEV1_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.milleni.dunning.ws.client.crm.CustomerInfoServiceV1_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.milleni.dunning.ws.client.crm.CustomerInfoServiceV1_Service.class.getResource(".");
            url = new URL(baseUrl, "http://192.168.2.88:8230/CustomerInfoService/CustomerInfoServiceV1.svc?singleWsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://192.168.2.88:8230/CustomerInfoService/CustomerInfoServiceV1.svc?singleWsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        CUSTOMERINFOSERVICEV1_WSDL_LOCATION = url;
    }

    public CustomerInfoServiceV1_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerInfoServiceV1_Service() {
        super(CUSTOMERINFOSERVICEV1_WSDL_LOCATION, new QName("/CustomerInfo/Service/v1", "CustomerInfoServiceV1"));
    }

    /**
     * 
     * @return
     *     returns CustomerInfoServiceV1
     */
    @WebEndpoint(name = "BasicHttpBinding_CustomerInfoServiceV1")
    public CustomerInfoServiceV1 getBasicHttpBindingCustomerInfoServiceV1() {
        return super.getPort(new QName("/CustomerInfo/Service/v1", "BasicHttpBinding_CustomerInfoServiceV1"), CustomerInfoServiceV1.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerInfoServiceV1
     */
    @WebEndpoint(name = "BasicHttpBinding_CustomerInfoServiceV1")
    public CustomerInfoServiceV1 getBasicHttpBindingCustomerInfoServiceV1(WebServiceFeature... features) {
        return super.getPort(new QName("/CustomerInfo/Service/v1", "BasicHttpBinding_CustomerInfoServiceV1"), CustomerInfoServiceV1.class, features);
    }

}
