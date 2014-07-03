
package org.milleni.dunning.ws.client.sms;

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
@WebServiceClient(name = "smsgw", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://192.168.2.18/bizmonws/smsgw.asmx?wsdl")
public class Smsgw
    extends Service
{

    private final static URL SMSGW_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.milleni.dunning.ws.client.sms.Smsgw.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.milleni.dunning.ws.client.sms.Smsgw.class.getResource(".");
            url = new URL(baseUrl, "http://192.168.2.18/bizmonws/smsgw.asmx?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://192.168.2.18/bizmonws/smsgw.asmx?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        SMSGW_WSDL_LOCATION = url;
    }

    public Smsgw(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Smsgw() {
        super(SMSGW_WSDL_LOCATION, new QName("http://tempuri.org/", "smsgw"));
    }

    /**
     * 
     * @return
     *     returns SmsgwSoap
     */
    @WebEndpoint(name = "smsgwSoap")
    public SmsgwSoap getSmsgwSoap() {
        return super.getPort(new QName("http://tempuri.org/", "smsgwSoap"), SmsgwSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SmsgwSoap
     */
    @WebEndpoint(name = "smsgwSoap")
    public SmsgwSoap getSmsgwSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "smsgwSoap"), SmsgwSoap.class, features);
    }

}
