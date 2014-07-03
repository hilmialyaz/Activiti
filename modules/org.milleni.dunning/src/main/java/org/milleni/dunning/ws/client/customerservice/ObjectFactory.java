
package org.milleni.dunning.ws.client.customerservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.milleni.dunning.ws.client.customerservice package. 
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

    private final static QName _Int_QNAME = new QName("http://milleni.com.tr/CustomerInfoService/", "int");
    private final static QName _TeconCustomerInfoResponse_QNAME = new QName("http://milleni.com.tr/CustomerInfoService/", "TeconCustomerInfoResponse");
    private final static QName _Boolean_QNAME = new QName("http://milleni.com.tr/CustomerInfoService/", "boolean");
    private final static QName _UsageResponse_QNAME = new QName("http://milleni.com.tr/CustomerInfoService/", "UsageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.milleni.dunning.ws.client.customerservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUsageResponse }
     * 
     */
    public GetUsageResponse createGetUsageResponse() {
        return new GetUsageResponse();
    }

    /**
     * Create an instance of {@link UsageResponse }
     * 
     */
    public UsageResponse createUsageResponse() {
        return new UsageResponse();
    }

    /**
     * Create an instance of {@link RetrieveCustomerTaksitCountResponse }
     * 
     */
    public RetrieveCustomerTaksitCountResponse createRetrieveCustomerTaksitCountResponse() {
        return new RetrieveCustomerTaksitCountResponse();
    }

    /**
     * Create an instance of {@link RetrieveCustomerStatusResponse }
     * 
     */
    public RetrieveCustomerStatusResponse createRetrieveCustomerStatusResponse() {
        return new RetrieveCustomerStatusResponse();
    }

    /**
     * Create an instance of {@link RetrieveCustomerCdrResponse }
     * 
     */
    public RetrieveCustomerCdrResponse createRetrieveCustomerCdrResponse() {
        return new RetrieveCustomerCdrResponse();
    }

    /**
     * Create an instance of {@link ArrayOfQuotaLoginNameResponse }
     * 
     */
    public ArrayOfQuotaLoginNameResponse createArrayOfQuotaLoginNameResponse() {
        return new ArrayOfQuotaLoginNameResponse();
    }

    /**
     * Create an instance of {@link RetrieveCustomerStatus }
     * 
     */
    public RetrieveCustomerStatus createRetrieveCustomerStatus() {
        return new RetrieveCustomerStatus();
    }

    /**
     * Create an instance of {@link RetrieveCustomerInfoResponse }
     * 
     */
    public RetrieveCustomerInfoResponse createRetrieveCustomerInfoResponse() {
        return new RetrieveCustomerInfoResponse();
    }

    /**
     * Create an instance of {@link GetUsage }
     * 
     */
    public GetUsage createGetUsage() {
        return new GetUsage();
    }

    /**
     * Create an instance of {@link TeconCustomerInfo }
     * 
     */
    public TeconCustomerInfo createTeconCustomerInfo() {
        return new TeconCustomerInfo();
    }

    /**
     * Create an instance of {@link QuotaLoginNameResponse }
     * 
     */
    public QuotaLoginNameResponse createQuotaLoginNameResponse() {
        return new QuotaLoginNameResponse();
    }

    /**
     * Create an instance of {@link RetrieveCustomerAgreementDocumentCount }
     * 
     */
    public RetrieveCustomerAgreementDocumentCount createRetrieveCustomerAgreementDocumentCount() {
        return new RetrieveCustomerAgreementDocumentCount();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link TeconCustomerInfoResponse }
     * 
     */
    public TeconCustomerInfoResponse createTeconCustomerInfoResponse() {
        return new TeconCustomerInfoResponse();
    }

    /**
     * Create an instance of {@link RetrieveCustomerTaksitCount }
     * 
     */
    public RetrieveCustomerTaksitCount createRetrieveCustomerTaksitCount() {
        return new RetrieveCustomerTaksitCount();
    }

    /**
     * Create an instance of {@link RetrieveCustomerInfo }
     * 
     */
    public RetrieveCustomerInfo createRetrieveCustomerInfo() {
        return new RetrieveCustomerInfo();
    }

    /**
     * Create an instance of {@link RetrieveCustomerAgreementDocumentCountResponse }
     * 
     */
    public RetrieveCustomerAgreementDocumentCountResponse createRetrieveCustomerAgreementDocumentCountResponse() {
        return new RetrieveCustomerAgreementDocumentCountResponse();
    }

    /**
     * Create an instance of {@link RetrieveCustomerCdr }
     * 
     */
    public RetrieveCustomerCdr createRetrieveCustomerCdr() {
        return new RetrieveCustomerCdr();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com.tr/CustomerInfoService/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TeconCustomerInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com.tr/CustomerInfoService/", name = "TeconCustomerInfoResponse")
    public JAXBElement<TeconCustomerInfoResponse> createTeconCustomerInfoResponse(TeconCustomerInfoResponse value) {
        return new JAXBElement<TeconCustomerInfoResponse>(_TeconCustomerInfoResponse_QNAME, TeconCustomerInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com.tr/CustomerInfoService/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com.tr/CustomerInfoService/", name = "UsageResponse")
    public JAXBElement<UsageResponse> createUsageResponse(UsageResponse value) {
        return new JAXBElement<UsageResponse>(_UsageResponse_QNAME, UsageResponse.class, null, value);
    }

}
