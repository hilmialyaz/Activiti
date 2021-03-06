
package org.milleni.dunning.ws.client.tts;

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
@WebServiceClient(name = "TTSServiceV1", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://localhost:31287/TTSServiceV1.svc?singleWsdl")
public class TTSServiceV1
    extends Service
{

    private final static URL TTSSERVICEV1_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.milleni.dunning.ws.client.tts.TTSServiceV1 .class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.milleni.dunning.ws.client.tts.TTSServiceV1 .class.getResource(".");
            url = new URL(baseUrl, "http://localhost:31287/TTSServiceV1.svc?singleWsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:31287/TTSServiceV1.svc?singleWsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        TTSSERVICEV1_WSDL_LOCATION = url;
    }

    public TTSServiceV1(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TTSServiceV1() {
        super(TTSSERVICEV1_WSDL_LOCATION, new QName("http://tempuri.org/", "TTSServiceV1"));
    }

    /**
     * 
     * @return
     *     returns ITTSServiceV1
     */
    @WebEndpoint(name = "BasicHttpBinding_ITTSServiceV1")
    public ITTSServiceV1 getBasicHttpBindingITTSServiceV1() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_ITTSServiceV1"), ITTSServiceV1.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ITTSServiceV1
     */
    @WebEndpoint(name = "BasicHttpBinding_ITTSServiceV1")
    public ITTSServiceV1 getBasicHttpBindingITTSServiceV1(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_ITTSServiceV1"), ITTSServiceV1.class, features);
    }

}
