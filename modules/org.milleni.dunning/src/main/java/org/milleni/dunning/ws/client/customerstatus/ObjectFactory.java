
package org.milleni.dunning.ws.client.customerstatus;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.milleni.dunning.ws.client.customerstatus package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ContractServiceResponse_QNAME = new QName("http://milleni.com.tr/CustomerStatusOperations/", "ContractServiceResponse");
    private final static QName _ServiceResponse_QNAME = new QName("http://milleni.com.tr/CustomerStatusOperations/", "ServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.milleni.dunning.ws.client.customerstatus
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfContractStatus }
     * 
     */
    public ArrayOfContractStatus createArrayOfContractStatus() {
        return new ArrayOfContractStatus();
    }

    /**
     * Create an instance of {@link VoipChangeCustomerStatusResponse }
     * 
     */
    public VoipChangeCustomerStatusResponse createVoipChangeCustomerStatusResponse() {
        return new VoipChangeCustomerStatusResponse();
    }

    /**
     * Create an instance of {@link OloThkAboneIptal }
     * 
     */
    public OloThkAboneIptal createOloThkAboneIptal() {
        return new OloThkAboneIptal();
    }

    /**
     * Create an instance of {@link ChangeCrmCustomerStatusResponse }
     * 
     */
    public ChangeCrmCustomerStatusResponse createChangeCrmCustomerStatusResponse() {
        return new ChangeCrmCustomerStatusResponse();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link ChangeCustomerTTCRMStatus }
     * 
     */
    public ChangeCustomerTTCRMStatus createChangeCustomerTTCRMStatus() {
        return new ChangeCustomerTTCRMStatus();
    }

    /**
     * Create an instance of {@link ChangeCustomerTTCRMStatusResponse }
     * 
     */
    public ChangeCustomerTTCRMStatusResponse createChangeCustomerTTCRMStatusResponse() {
        return new ChangeCustomerTTCRMStatusResponse();
    }

    /**
     * Create an instance of {@link ContractServiceResponse }
     * 
     */
    public ContractServiceResponse createContractServiceResponse() {
        return new ContractServiceResponse();
    }

    /**
     * Create an instance of {@link VoipChangeCustomerStatus }
     * 
     */
    public VoipChangeCustomerStatus createVoipChangeCustomerStatus() {
        return new VoipChangeCustomerStatus();
    }

    /**
     * Create an instance of {@link ChangeCrmCustomerStatus }
     * 
     */
    public ChangeCrmCustomerStatus createChangeCrmCustomerStatus() {
        return new ChangeCrmCustomerStatus();
    }

    /**
     * Create an instance of {@link OloThkAboneIptalResponse }
     * 
     */
    public OloThkAboneIptalResponse createOloThkAboneIptalResponse() {
        return new OloThkAboneIptalResponse();
    }

    /**
     * Create an instance of {@link ContractStatus }
     * 
     */
    public ContractStatus createContractStatus() {
        return new ContractStatus();
    }

    /**
     * Create an instance of {@link ChangeCustomerStatus }
     * 
     */
    public ChangeCustomerStatus createChangeCustomerStatus() {
        return new ChangeCustomerStatus();
    }

    /**
     * Create an instance of {@link ChangeCustomerStatusResponse }
     * 
     */
    public ChangeCustomerStatusResponse createChangeCustomerStatusResponse() {
        return new ChangeCustomerStatusResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com.tr/CustomerStatusOperations/", name = "ContractServiceResponse")
    public JAXBElement<ContractServiceResponse> createContractServiceResponse(ContractServiceResponse value) {
        return new JAXBElement<ContractServiceResponse>(_ContractServiceResponse_QNAME, ContractServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com.tr/CustomerStatusOperations/", name = "ServiceResponse")
    public JAXBElement<ServiceResponse> createServiceResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_ServiceResponse_QNAME, ServiceResponse.class, null, value);
    }

}
