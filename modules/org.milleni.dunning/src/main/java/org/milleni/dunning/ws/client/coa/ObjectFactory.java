
package org.milleni.dunning.ws.client.coa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.milleni.dunning.ws.client.coa package. 
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

    private final static QName _CustomerResponse_QNAME = new QName("http://tempuri.org/", "CustomerResponse");
    private final static QName _ServiceResponse_QNAME = new QName("http://tempuri.org/", "ServiceResponse");
    private final static QName _COAUpdateResponse_QNAME = new QName("http://tempuri.org/", "COAUpdateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.milleni.dunning.ws.client.coa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OfferCommitmentResumeRequestResponse }
     * 
     */
    public OfferCommitmentResumeRequestResponse createOfferCommitmentResumeRequestResponse() {
        return new OfferCommitmentResumeRequestResponse();
    }

    /**
     * Create an instance of {@link NetFaturaResumeRequest }
     * 
     */
    public NetFaturaResumeRequest createNetFaturaResumeRequest() {
        return new NetFaturaResumeRequest();
    }

    /**
     * Create an instance of {@link GetCustomerFromLoginName }
     * 
     */
    public GetCustomerFromLoginName createGetCustomerFromLoginName() {
        return new GetCustomerFromLoginName();
    }

    /**
     * Create an instance of {@link UpdateUserInfoResponse }
     * 
     */
    public UpdateUserInfoResponse createUpdateUserInfoResponse() {
        return new UpdateUserInfoResponse();
    }

    /**
     * Create an instance of {@link COAUpdateResponse }
     * 
     */
    public COAUpdateResponse createCOAUpdateResponse() {
        return new COAUpdateResponse();
    }

    /**
     * Create an instance of {@link GetCustomerAndQuotaFromLoginName }
     * 
     */
    public GetCustomerAndQuotaFromLoginName createGetCustomerAndQuotaFromLoginName() {
        return new GetCustomerAndQuotaFromLoginName();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link SendAnnounceCoa }
     * 
     */
    public SendAnnounceCoa createSendAnnounceCoa() {
        return new SendAnnounceCoa();
    }

    /**
     * Create an instance of {@link SendAnnounceContractResponse }
     * 
     */
    public SendAnnounceContractResponse createSendAnnounceContractResponse() {
        return new SendAnnounceContractResponse();
    }

    /**
     * Create an instance of {@link NetFaturaResumeRequestResponse }
     * 
     */
    public NetFaturaResumeRequestResponse createNetFaturaResumeRequestResponse() {
        return new NetFaturaResumeRequestResponse();
    }

    /**
     * Create an instance of {@link UpdateUserInfo }
     * 
     */
    public UpdateUserInfo createUpdateUserInfo() {
        return new UpdateUserInfo();
    }

    /**
     * Create an instance of {@link GetCustomerAndQuotaFromLoginNameResponse }
     * 
     */
    public GetCustomerAndQuotaFromLoginNameResponse createGetCustomerAndQuotaFromLoginNameResponse() {
        return new GetCustomerAndQuotaFromLoginNameResponse();
    }

    /**
     * Create an instance of {@link OfferCommitmentResumeRequest }
     * 
     */
    public OfferCommitmentResumeRequest createOfferCommitmentResumeRequest() {
        return new OfferCommitmentResumeRequest();
    }

    /**
     * Create an instance of {@link SendAnnounceContract }
     * 
     */
    public SendAnnounceContract createSendAnnounceContract() {
        return new SendAnnounceContract();
    }

    /**
     * Create an instance of {@link CustomerResponse }
     * 
     */
    public CustomerResponse createCustomerResponse() {
        return new CustomerResponse();
    }

    /**
     * Create an instance of {@link GetCustomerFromLoginNameResponse }
     * 
     */
    public GetCustomerFromLoginNameResponse createGetCustomerFromLoginNameResponse() {
        return new GetCustomerFromLoginNameResponse();
    }

    /**
     * Create an instance of {@link IsCustomerUpdateBeforeResponse }
     * 
     */
    public IsCustomerUpdateBeforeResponse createIsCustomerUpdateBeforeResponse() {
        return new IsCustomerUpdateBeforeResponse();
    }

    /**
     * Create an instance of {@link SendAnnounceCoaResponse }
     * 
     */
    public SendAnnounceCoaResponse createSendAnnounceCoaResponse() {
        return new SendAnnounceCoaResponse();
    }

    /**
     * Create an instance of {@link CancelAnnouceContract }
     * 
     */
    public CancelAnnouceContract createCancelAnnouceContract() {
        return new CancelAnnouceContract();
    }

    /**
     * Create an instance of {@link CancelAnnouceContractResponse }
     * 
     */
    public CancelAnnouceContractResponse createCancelAnnouceContractResponse() {
        return new CancelAnnouceContractResponse();
    }

    /**
     * Create an instance of {@link IsCustomerUpdateBefore }
     * 
     */
    public IsCustomerUpdateBefore createIsCustomerUpdateBefore() {
        return new IsCustomerUpdateBefore();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CustomerResponse")
    public JAXBElement<CustomerResponse> createCustomerResponse(CustomerResponse value) {
        return new JAXBElement<CustomerResponse>(_CustomerResponse_QNAME, CustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceResponse")
    public JAXBElement<ServiceResponse> createServiceResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_ServiceResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COAUpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "COAUpdateResponse")
    public JAXBElement<COAUpdateResponse> createCOAUpdateResponse(COAUpdateResponse value) {
        return new JAXBElement<COAUpdateResponse>(_COAUpdateResponse_QNAME, COAUpdateResponse.class, null, value);
    }

}
