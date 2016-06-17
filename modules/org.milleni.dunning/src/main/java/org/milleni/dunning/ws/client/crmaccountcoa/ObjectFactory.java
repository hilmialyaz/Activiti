
package org.milleni.dunning.ws.client.crmaccountcoa;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.milleni.dunning.ws.client.crmaccountcoa package. 
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

    private final static QName _SystemFault_QNAME = new QName("http://milleni.com/technical/Fault", "SystemFault");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _UpdateContactInfoResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "UpdateContactInfoResponseModel");
    private final static QName _RemoveSoftInvoiceRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "RemoveSoftInvoiceRequestModel");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _AddCreditCardOrderRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "AddCreditCardOrderRequestModel");
    private final static QName _ArrayOfCreditCardOrder_QNAME = new QName("http://milleni.com/Payment", "ArrayOfCreditCardOrder");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _BaseFault_QNAME = new QName("http://milleni.com/technical/Fault", "BaseFault");
    private final static QName _GetCreditCardOrderHistoryRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "GetCreditCardOrderHistoryRequestModel");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _BusinessFault_QNAME = new QName("http://milleni.com/technical/Fault", "BusinessFault");
    private final static QName _GetCreditCardOrderRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "GetCreditCardOrderRequestModel");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _CreditCardOrderStatusEnum_QNAME = new QName("http://milleni.com/Payment", "CreditCardOrderStatusEnum");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _AddSoftInvoiceRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "AddSoftInvoiceRequestModel");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DocumentInfo_QNAME = new QName("http://milleni.com/Bpm", "DocumentInfo");
    private final static QName _UpdateContactError_QNAME = new QName("/CustomerInfo/Service/v1", "UpdateContactError");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _CreditCardOrder_QNAME = new QName("http://milleni.com/Payment", "CreditCardOrder");
    private final static QName _SendAnnounceByBillingCustomerNoRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "SendAnnounceByBillingCustomerNoRequestModel");
    private final static QName _GetCreditCardOrderResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "GetCreditCardOrderResponseModel");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _ApproveNotificationEnum_QNAME = new QName("/CustomerInfo/Service/v1", "ApproveNotificationEnum");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _CreditCard_QNAME = new QName("http://milleni.com/Payment", "CreditCard");
    private final static QName _ChangeBillingAddressRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "ChangeBillingAddressRequestModel");
    private final static QName _UpdateContactInfoRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "UpdateContactInfoRequestModel");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _GetCreditCardOrderHistoryResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "GetCreditCardOrderHistoryResponseModel");
    private final static QName _RemoveCreditCardOrderRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "RemoveCreditCardOrderRequestModel");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _SendAnnounceByBillingCustomerNoResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "SendAnnounceByBillingCustomerNoResponseModel");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _AddDeactivationRequestResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "AddDeactivationRequestResponseModel");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _AddDeactivationRequestToAccountRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "AddDeactivationRequestToAccountRequestModel");
    private final static QName _GetCreditCardOrderHistoryResponseModelCreditCardOrders_QNAME = new QName("/CustomerInfo/Service/v1", "CreditCardOrders");
    private final static QName _GetCreditCardOrderRequest_QNAME = new QName("/CustomerInfo/Service/v1", "request");
    private final static QName _AddDeactivationRequestResponseAddDeactivationRequestResult_QNAME = new QName("/CustomerInfo/Service/v1", "AddDeactivationRequestResult");
    private final static QName _UpdateContactInfoResponseUpdateContactInfoResult_QNAME = new QName("/CustomerInfo/Service/v1", "UpdateContactInfoResult");
    private final static QName _SendIhtarAnnounceByBillingCustomerIdReq_QNAME = new QName("/CustomerInfo/Service/v1", "req");
    private final static QName _BaseFaultSIID_QNAME = new QName("http://milleni.com/technical/Fault", "SIID");
    private final static QName _BaseFaultActor_QNAME = new QName("http://milleni.com/technical/Fault", "Actor");
    private final static QName _BaseFaultDetail_QNAME = new QName("http://milleni.com/technical/Fault", "Detail");
    private final static QName _BaseFaultDescription_QNAME = new QName("http://milleni.com/technical/Fault", "Description");
    private final static QName _BaseFaultSource_QNAME = new QName("http://milleni.com/technical/Fault", "Source");
    private final static QName _BaseFaultParameters_QNAME = new QName("http://milleni.com/technical/Fault", "Parameters");
    private final static QName _GetCreditCardOrderResponseGetCreditCardOrderResult_QNAME = new QName("/CustomerInfo/Service/v1", "GetCreditCardOrderResult");
    private final static QName _CreditCardFullName_QNAME = new QName("http://milleni.com/Payment", "FullName");
    private final static QName _SendAnnounceByBillingCustomerNoRequestModelBillingCustomerNo_QNAME = new QName("/CustomerInfo/Service/v1", "BillingCustomerNo");
    private final static QName _UpdateContactInfoRequestModelEmail_QNAME = new QName("/CustomerInfo/Service/v1", "Email");
    private final static QName _UpdateContactInfoRequestModelMobilePhone_QNAME = new QName("/CustomerInfo/Service/v1", "MobilePhone");
    private final static QName _SendIhtarAnnounceByBillingCustomerIdResponseSendIhtarAnnounceByBillingCustomerIdResult_QNAME = new QName("/CustomerInfo/Service/v1", "SendIhtarAnnounceByBillingCustomerIdResult");
    private final static QName _UpdateContactInfoResponseModelErrorMessage_QNAME = new QName("/CustomerInfo/Service/v1", "ErrorMessage");
    private final static QName _CreditCardOrderApplication_QNAME = new QName("http://milleni.com/Payment", "Application");
    private final static QName _DocumentInfoCode_QNAME = new QName("http://milleni.com/Bpm", "Code");
    private final static QName _DocumentInfoUrl_QNAME = new QName("http://milleni.com/Bpm", "Url");
    private final static QName _AddDeactivationRequestToAccountRequestModelDocument_QNAME = new QName("/CustomerInfo/Service/v1", "Document");
    private final static QName _GetCreditCardOrderHistoryResponseGetCreditCardOrderHistoryResult_QNAME = new QName("/CustomerInfo/Service/v1", "GetCreditCardOrderHistoryResult");
    private final static QName _GetCreditCardOrderResponseModelCreditCardOrder_QNAME = new QName("/CustomerInfo/Service/v1", "CreditCardOrder");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.milleni.dunning.ws.client.crmaccountcoa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BusinessFault }
     * 
     */
    public BusinessFault createBusinessFault() {
        return new BusinessFault();
    }

    /**
     * Create an instance of {@link GetCreditCardOrderHistoryResponseModel }
     * 
     */
    public GetCreditCardOrderHistoryResponseModel createGetCreditCardOrderHistoryResponseModel() {
        return new GetCreditCardOrderHistoryResponseModel();
    }

    /**
     * Create an instance of {@link GetCreditCardOrder }
     * 
     */
    public GetCreditCardOrder createGetCreditCardOrder() {
        return new GetCreditCardOrder();
    }

    /**
     * Create an instance of {@link AddDeactivationRequestResponse }
     * 
     */
    public AddDeactivationRequestResponse createAddDeactivationRequestResponse() {
        return new AddDeactivationRequestResponse();
    }

    /**
     * Create an instance of {@link UpdateContactInfoResponse }
     * 
     */
    public UpdateContactInfoResponse createUpdateContactInfoResponse() {
        return new UpdateContactInfoResponse();
    }

    /**
     * Create an instance of {@link BaseFault }
     * 
     */
    public BaseFault createBaseFault() {
        return new BaseFault();
    }

    /**
     * Create an instance of {@link SendIhtarAnnounceByBillingCustomerId }
     * 
     */
    public SendIhtarAnnounceByBillingCustomerId createSendIhtarAnnounceByBillingCustomerId() {
        return new SendIhtarAnnounceByBillingCustomerId();
    }

    /**
     * Create an instance of {@link AddDeactivationRequestResponseModel }
     * 
     */
    public AddDeactivationRequestResponseModel createAddDeactivationRequestResponseModel() {
        return new AddDeactivationRequestResponseModel();
    }

    /**
     * Create an instance of {@link RemoveSoftInvoiceResponse }
     * 
     */
    public RemoveSoftInvoiceResponse createRemoveSoftInvoiceResponse() {
        return new RemoveSoftInvoiceResponse();
    }

    /**
     * Create an instance of {@link SystemFault }
     * 
     */
    public SystemFault createSystemFault() {
        return new SystemFault();
    }

    /**
     * Create an instance of {@link AddSoftInvoice }
     * 
     */
    public AddSoftInvoice createAddSoftInvoice() {
        return new AddSoftInvoice();
    }

    /**
     * Create an instance of {@link GetCreditCardOrderResponse }
     * 
     */
    public GetCreditCardOrderResponse createGetCreditCardOrderResponse() {
        return new GetCreditCardOrderResponse();
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link SendAnnounceByBillingCustomerNoRequestModel }
     * 
     */
    public SendAnnounceByBillingCustomerNoRequestModel createSendAnnounceByBillingCustomerNoRequestModel() {
        return new SendAnnounceByBillingCustomerNoRequestModel();
    }

    /**
     * Create an instance of {@link AddSoftInvoiceResponse }
     * 
     */
    public AddSoftInvoiceResponse createAddSoftInvoiceResponse() {
        return new AddSoftInvoiceResponse();
    }

    /**
     * Create an instance of {@link UpdateContactInfoRequestModel }
     * 
     */
    public UpdateContactInfoRequestModel createUpdateContactInfoRequestModel() {
        return new UpdateContactInfoRequestModel();
    }

    /**
     * Create an instance of {@link ChangeBillingAddressResponse }
     * 
     */
    public ChangeBillingAddressResponse createChangeBillingAddressResponse() {
        return new ChangeBillingAddressResponse();
    }

    /**
     * Create an instance of {@link SendIhtarAnnounceByBillingCustomerIdResponse }
     * 
     */
    public SendIhtarAnnounceByBillingCustomerIdResponse createSendIhtarAnnounceByBillingCustomerIdResponse() {
        return new SendIhtarAnnounceByBillingCustomerIdResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCreditCardOrder }
     * 
     */
    public ArrayOfCreditCardOrder createArrayOfCreditCardOrder() {
        return new ArrayOfCreditCardOrder();
    }

    /**
     * Create an instance of {@link RemoveSoftInvoice }
     * 
     */
    public RemoveSoftInvoice createRemoveSoftInvoice() {
        return new RemoveSoftInvoice();
    }

    /**
     * Create an instance of {@link GetCreditCardOrderRequestModel }
     * 
     */
    public GetCreditCardOrderRequestModel createGetCreditCardOrderRequestModel() {
        return new GetCreditCardOrderRequestModel();
    }

    /**
     * Create an instance of {@link UpdateContactInfoResponseModel }
     * 
     */
    public UpdateContactInfoResponseModel createUpdateContactInfoResponseModel() {
        return new UpdateContactInfoResponseModel();
    }

    /**
     * Create an instance of {@link RemoveCreditCardOrder }
     * 
     */
    public RemoveCreditCardOrder createRemoveCreditCardOrder() {
        return new RemoveCreditCardOrder();
    }

    /**
     * Create an instance of {@link AddCreditCardOrderResponse }
     * 
     */
    public AddCreditCardOrderResponse createAddCreditCardOrderResponse() {
        return new AddCreditCardOrderResponse();
    }

    /**
     * Create an instance of {@link RemoveCreditCardOrderRequestModel }
     * 
     */
    public RemoveCreditCardOrderRequestModel createRemoveCreditCardOrderRequestModel() {
        return new RemoveCreditCardOrderRequestModel();
    }

    /**
     * Create an instance of {@link AddCreditCardOrder }
     * 
     */
    public AddCreditCardOrder createAddCreditCardOrder() {
        return new AddCreditCardOrder();
    }

    /**
     * Create an instance of {@link CreditCardOrder }
     * 
     */
    public CreditCardOrder createCreditCardOrder() {
        return new CreditCardOrder();
    }

    /**
     * Create an instance of {@link DocumentInfo }
     * 
     */
    public DocumentInfo createDocumentInfo() {
        return new DocumentInfo();
    }

    /**
     * Create an instance of {@link GetCreditCardOrderHistory }
     * 
     */
    public GetCreditCardOrderHistory createGetCreditCardOrderHistory() {
        return new GetCreditCardOrderHistory();
    }

    /**
     * Create an instance of {@link AddDeactivationRequestToAccountRequestModel }
     * 
     */
    public AddDeactivationRequestToAccountRequestModel createAddDeactivationRequestToAccountRequestModel() {
        return new AddDeactivationRequestToAccountRequestModel();
    }

    /**
     * Create an instance of {@link AddCreditCardOrderRequestModel }
     * 
     */
    public AddCreditCardOrderRequestModel createAddCreditCardOrderRequestModel() {
        return new AddCreditCardOrderRequestModel();
    }

    /**
     * Create an instance of {@link UpdateContactInfo }
     * 
     */
    public UpdateContactInfo createUpdateContactInfo() {
        return new UpdateContactInfo();
    }

    /**
     * Create an instance of {@link GetCreditCardOrderHistoryRequestModel }
     * 
     */
    public GetCreditCardOrderHistoryRequestModel createGetCreditCardOrderHistoryRequestModel() {
        return new GetCreditCardOrderHistoryRequestModel();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link GetCreditCardOrderHistoryResponse }
     * 
     */
    public GetCreditCardOrderHistoryResponse createGetCreditCardOrderHistoryResponse() {
        return new GetCreditCardOrderHistoryResponse();
    }

    /**
     * Create an instance of {@link ChangeBillingAddress }
     * 
     */
    public ChangeBillingAddress createChangeBillingAddress() {
        return new ChangeBillingAddress();
    }

    /**
     * Create an instance of {@link GetCreditCardOrderResponseModel }
     * 
     */
    public GetCreditCardOrderResponseModel createGetCreditCardOrderResponseModel() {
        return new GetCreditCardOrderResponseModel();
    }

    /**
     * Create an instance of {@link RemoveCreditCardOrderResponse }
     * 
     */
    public RemoveCreditCardOrderResponse createRemoveCreditCardOrderResponse() {
        return new RemoveCreditCardOrderResponse();
    }

    /**
     * Create an instance of {@link ChangeBillingAddressRequestModel }
     * 
     */
    public ChangeBillingAddressRequestModel createChangeBillingAddressRequestModel() {
        return new ChangeBillingAddressRequestModel();
    }

    /**
     * Create an instance of {@link AddSoftInvoiceRequestModel }
     * 
     */
    public AddSoftInvoiceRequestModel createAddSoftInvoiceRequestModel() {
        return new AddSoftInvoiceRequestModel();
    }

    /**
     * Create an instance of {@link RemoveSoftInvoiceRequestModel }
     * 
     */
    public RemoveSoftInvoiceRequestModel createRemoveSoftInvoiceRequestModel() {
        return new RemoveSoftInvoiceRequestModel();
    }

    /**
     * Create an instance of {@link AddDeactivationRequest }
     * 
     */
    public AddDeactivationRequest createAddDeactivationRequest() {
        return new AddDeactivationRequest();
    }

    /**
     * Create an instance of {@link SendAnnounceByBillingCustomerNoResponseModel }
     * 
     */
    public SendAnnounceByBillingCustomerNoResponseModel createSendAnnounceByBillingCustomerNoResponseModel() {
        return new SendAnnounceByBillingCustomerNoResponseModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/technical/Fault", name = "SystemFault")
    public JAXBElement<SystemFault> createSystemFault(SystemFault value) {
        return new JAXBElement<SystemFault>(_SystemFault_QNAME, SystemFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateContactInfoResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UpdateContactInfoResponseModel")
    public JAXBElement<UpdateContactInfoResponseModel> createUpdateContactInfoResponseModel(UpdateContactInfoResponseModel value) {
        return new JAXBElement<UpdateContactInfoResponseModel>(_UpdateContactInfoResponseModel_QNAME, UpdateContactInfoResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSoftInvoiceRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "RemoveSoftInvoiceRequestModel")
    public JAXBElement<RemoveSoftInvoiceRequestModel> createRemoveSoftInvoiceRequestModel(RemoveSoftInvoiceRequestModel value) {
        return new JAXBElement<RemoveSoftInvoiceRequestModel>(_RemoveSoftInvoiceRequestModel_QNAME, RemoveSoftInvoiceRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCreditCardOrderRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddCreditCardOrderRequestModel")
    public JAXBElement<AddCreditCardOrderRequestModel> createAddCreditCardOrderRequestModel(AddCreditCardOrderRequestModel value) {
        return new JAXBElement<AddCreditCardOrderRequestModel>(_AddCreditCardOrderRequestModel_QNAME, AddCreditCardOrderRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCreditCardOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Payment", name = "ArrayOfCreditCardOrder")
    public JAXBElement<ArrayOfCreditCardOrder> createArrayOfCreditCardOrder(ArrayOfCreditCardOrder value) {
        return new JAXBElement<ArrayOfCreditCardOrder>(_ArrayOfCreditCardOrder_QNAME, ArrayOfCreditCardOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/technical/Fault", name = "BaseFault")
    public JAXBElement<BaseFault> createBaseFault(BaseFault value) {
        return new JAXBElement<BaseFault>(_BaseFault_QNAME, BaseFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCreditCardOrderHistoryRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetCreditCardOrderHistoryRequestModel")
    public JAXBElement<GetCreditCardOrderHistoryRequestModel> createGetCreditCardOrderHistoryRequestModel(GetCreditCardOrderHistoryRequestModel value) {
        return new JAXBElement<GetCreditCardOrderHistoryRequestModel>(_GetCreditCardOrderHistoryRequestModel_QNAME, GetCreditCardOrderHistoryRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/technical/Fault", name = "BusinessFault")
    public JAXBElement<BusinessFault> createBusinessFault(BusinessFault value) {
        return new JAXBElement<BusinessFault>(_BusinessFault_QNAME, BusinessFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCreditCardOrderRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetCreditCardOrderRequestModel")
    public JAXBElement<GetCreditCardOrderRequestModel> createGetCreditCardOrderRequestModel(GetCreditCardOrderRequestModel value) {
        return new JAXBElement<GetCreditCardOrderRequestModel>(_GetCreditCardOrderRequestModel_QNAME, GetCreditCardOrderRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCardOrderStatusEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Payment", name = "CreditCardOrderStatusEnum")
    public JAXBElement<CreditCardOrderStatusEnum> createCreditCardOrderStatusEnum(CreditCardOrderStatusEnum value) {
        return new JAXBElement<CreditCardOrderStatusEnum>(_CreditCardOrderStatusEnum_QNAME, CreditCardOrderStatusEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSoftInvoiceRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddSoftInvoiceRequestModel")
    public JAXBElement<AddSoftInvoiceRequestModel> createAddSoftInvoiceRequestModel(AddSoftInvoiceRequestModel value) {
        return new JAXBElement<AddSoftInvoiceRequestModel>(_AddSoftInvoiceRequestModel_QNAME, AddSoftInvoiceRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Bpm", name = "DocumentInfo")
    public JAXBElement<DocumentInfo> createDocumentInfo(DocumentInfo value) {
        return new JAXBElement<DocumentInfo>(_DocumentInfo_QNAME, DocumentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateContactError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UpdateContactError")
    public JAXBElement<UpdateContactError> createUpdateContactError(UpdateContactError value) {
        return new JAXBElement<UpdateContactError>(_UpdateContactError_QNAME, UpdateContactError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCardOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Payment", name = "CreditCardOrder")
    public JAXBElement<CreditCardOrder> createCreditCardOrder(CreditCardOrder value) {
        return new JAXBElement<CreditCardOrder>(_CreditCardOrder_QNAME, CreditCardOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAnnounceByBillingCustomerNoRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SendAnnounceByBillingCustomerNoRequestModel")
    public JAXBElement<SendAnnounceByBillingCustomerNoRequestModel> createSendAnnounceByBillingCustomerNoRequestModel(SendAnnounceByBillingCustomerNoRequestModel value) {
        return new JAXBElement<SendAnnounceByBillingCustomerNoRequestModel>(_SendAnnounceByBillingCustomerNoRequestModel_QNAME, SendAnnounceByBillingCustomerNoRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCreditCardOrderResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetCreditCardOrderResponseModel")
    public JAXBElement<GetCreditCardOrderResponseModel> createGetCreditCardOrderResponseModel(GetCreditCardOrderResponseModel value) {
        return new JAXBElement<GetCreditCardOrderResponseModel>(_GetCreditCardOrderResponseModel_QNAME, GetCreditCardOrderResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApproveNotificationEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ApproveNotificationEnum")
    public JAXBElement<ApproveNotificationEnum> createApproveNotificationEnum(ApproveNotificationEnum value) {
        return new JAXBElement<ApproveNotificationEnum>(_ApproveNotificationEnum_QNAME, ApproveNotificationEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Payment", name = "CreditCard")
    public JAXBElement<CreditCard> createCreditCard(CreditCard value) {
        return new JAXBElement<CreditCard>(_CreditCard_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeBillingAddressRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ChangeBillingAddressRequestModel")
    public JAXBElement<ChangeBillingAddressRequestModel> createChangeBillingAddressRequestModel(ChangeBillingAddressRequestModel value) {
        return new JAXBElement<ChangeBillingAddressRequestModel>(_ChangeBillingAddressRequestModel_QNAME, ChangeBillingAddressRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateContactInfoRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UpdateContactInfoRequestModel")
    public JAXBElement<UpdateContactInfoRequestModel> createUpdateContactInfoRequestModel(UpdateContactInfoRequestModel value) {
        return new JAXBElement<UpdateContactInfoRequestModel>(_UpdateContactInfoRequestModel_QNAME, UpdateContactInfoRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCreditCardOrderHistoryResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetCreditCardOrderHistoryResponseModel")
    public JAXBElement<GetCreditCardOrderHistoryResponseModel> createGetCreditCardOrderHistoryResponseModel(GetCreditCardOrderHistoryResponseModel value) {
        return new JAXBElement<GetCreditCardOrderHistoryResponseModel>(_GetCreditCardOrderHistoryResponseModel_QNAME, GetCreditCardOrderHistoryResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCreditCardOrderRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "RemoveCreditCardOrderRequestModel")
    public JAXBElement<RemoveCreditCardOrderRequestModel> createRemoveCreditCardOrderRequestModel(RemoveCreditCardOrderRequestModel value) {
        return new JAXBElement<RemoveCreditCardOrderRequestModel>(_RemoveCreditCardOrderRequestModel_QNAME, RemoveCreditCardOrderRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAnnounceByBillingCustomerNoResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SendAnnounceByBillingCustomerNoResponseModel")
    public JAXBElement<SendAnnounceByBillingCustomerNoResponseModel> createSendAnnounceByBillingCustomerNoResponseModel(SendAnnounceByBillingCustomerNoResponseModel value) {
        return new JAXBElement<SendAnnounceByBillingCustomerNoResponseModel>(_SendAnnounceByBillingCustomerNoResponseModel_QNAME, SendAnnounceByBillingCustomerNoResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDeactivationRequestResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddDeactivationRequestResponseModel")
    public JAXBElement<AddDeactivationRequestResponseModel> createAddDeactivationRequestResponseModel(AddDeactivationRequestResponseModel value) {
        return new JAXBElement<AddDeactivationRequestResponseModel>(_AddDeactivationRequestResponseModel_QNAME, AddDeactivationRequestResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDeactivationRequestToAccountRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddDeactivationRequestToAccountRequestModel")
    public JAXBElement<AddDeactivationRequestToAccountRequestModel> createAddDeactivationRequestToAccountRequestModel(AddDeactivationRequestToAccountRequestModel value) {
        return new JAXBElement<AddDeactivationRequestToAccountRequestModel>(_AddDeactivationRequestToAccountRequestModel_QNAME, AddDeactivationRequestToAccountRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCreditCardOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "CreditCardOrders", scope = GetCreditCardOrderHistoryResponseModel.class)
    public JAXBElement<ArrayOfCreditCardOrder> createGetCreditCardOrderHistoryResponseModelCreditCardOrders(ArrayOfCreditCardOrder value) {
        return new JAXBElement<ArrayOfCreditCardOrder>(_GetCreditCardOrderHistoryResponseModelCreditCardOrders_QNAME, ArrayOfCreditCardOrder.class, GetCreditCardOrderHistoryResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCreditCardOrderRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = GetCreditCardOrder.class)
    public JAXBElement<GetCreditCardOrderRequestModel> createGetCreditCardOrderRequest(GetCreditCardOrderRequestModel value) {
        return new JAXBElement<GetCreditCardOrderRequestModel>(_GetCreditCardOrderRequest_QNAME, GetCreditCardOrderRequestModel.class, GetCreditCardOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDeactivationRequestResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddDeactivationRequestResult", scope = AddDeactivationRequestResponse.class)
    public JAXBElement<AddDeactivationRequestResponseModel> createAddDeactivationRequestResponseAddDeactivationRequestResult(AddDeactivationRequestResponseModel value) {
        return new JAXBElement<AddDeactivationRequestResponseModel>(_AddDeactivationRequestResponseAddDeactivationRequestResult_QNAME, AddDeactivationRequestResponseModel.class, AddDeactivationRequestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateContactInfoResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UpdateContactInfoResult", scope = UpdateContactInfoResponse.class)
    public JAXBElement<UpdateContactInfoResponseModel> createUpdateContactInfoResponseUpdateContactInfoResult(UpdateContactInfoResponseModel value) {
        return new JAXBElement<UpdateContactInfoResponseModel>(_UpdateContactInfoResponseUpdateContactInfoResult_QNAME, UpdateContactInfoResponseModel.class, UpdateContactInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAnnounceByBillingCustomerNoRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "req", scope = SendIhtarAnnounceByBillingCustomerId.class)
    public JAXBElement<SendAnnounceByBillingCustomerNoRequestModel> createSendIhtarAnnounceByBillingCustomerIdReq(SendAnnounceByBillingCustomerNoRequestModel value) {
        return new JAXBElement<SendAnnounceByBillingCustomerNoRequestModel>(_SendIhtarAnnounceByBillingCustomerIdReq_QNAME, SendAnnounceByBillingCustomerNoRequestModel.class, SendIhtarAnnounceByBillingCustomerId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/technical/Fault", name = "SIID", scope = BaseFault.class)
    public JAXBElement<String> createBaseFaultSIID(String value) {
        return new JAXBElement<String>(_BaseFaultSIID_QNAME, String.class, BaseFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/technical/Fault", name = "Actor", scope = BaseFault.class)
    public JAXBElement<String> createBaseFaultActor(String value) {
        return new JAXBElement<String>(_BaseFaultActor_QNAME, String.class, BaseFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/technical/Fault", name = "Detail", scope = BaseFault.class)
    public JAXBElement<String> createBaseFaultDetail(String value) {
        return new JAXBElement<String>(_BaseFaultDetail_QNAME, String.class, BaseFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/technical/Fault", name = "Description", scope = BaseFault.class)
    public JAXBElement<String> createBaseFaultDescription(String value) {
        return new JAXBElement<String>(_BaseFaultDescription_QNAME, String.class, BaseFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/technical/Fault", name = "Source", scope = BaseFault.class)
    public JAXBElement<String> createBaseFaultSource(String value) {
        return new JAXBElement<String>(_BaseFaultSource_QNAME, String.class, BaseFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/technical/Fault", name = "Parameters", scope = BaseFault.class)
    public JAXBElement<ArrayOfstring> createBaseFaultParameters(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_BaseFaultParameters_QNAME, ArrayOfstring.class, BaseFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSoftInvoiceRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = AddSoftInvoice.class)
    public JAXBElement<AddSoftInvoiceRequestModel> createAddSoftInvoiceRequest(AddSoftInvoiceRequestModel value) {
        return new JAXBElement<AddSoftInvoiceRequestModel>(_GetCreditCardOrderRequest_QNAME, AddSoftInvoiceRequestModel.class, AddSoftInvoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCreditCardOrderResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetCreditCardOrderResult", scope = GetCreditCardOrderResponse.class)
    public JAXBElement<GetCreditCardOrderResponseModel> createGetCreditCardOrderResponseGetCreditCardOrderResult(GetCreditCardOrderResponseModel value) {
        return new JAXBElement<GetCreditCardOrderResponseModel>(_GetCreditCardOrderResponseGetCreditCardOrderResult_QNAME, GetCreditCardOrderResponseModel.class, GetCreditCardOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Payment", name = "FullName", scope = CreditCard.class)
    public JAXBElement<String> createCreditCardFullName(String value) {
        return new JAXBElement<String>(_CreditCardFullName_QNAME, String.class, CreditCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "BillingCustomerNo", scope = SendAnnounceByBillingCustomerNoRequestModel.class)
    public JAXBElement<String> createSendAnnounceByBillingCustomerNoRequestModelBillingCustomerNo(String value) {
        return new JAXBElement<String>(_SendAnnounceByBillingCustomerNoRequestModelBillingCustomerNo_QNAME, String.class, SendAnnounceByBillingCustomerNoRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Email", scope = UpdateContactInfoRequestModel.class)
    public JAXBElement<String> createUpdateContactInfoRequestModelEmail(String value) {
        return new JAXBElement<String>(_UpdateContactInfoRequestModelEmail_QNAME, String.class, UpdateContactInfoRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "MobilePhone", scope = UpdateContactInfoRequestModel.class)
    public JAXBElement<String> createUpdateContactInfoRequestModelMobilePhone(String value) {
        return new JAXBElement<String>(_UpdateContactInfoRequestModelMobilePhone_QNAME, String.class, UpdateContactInfoRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAnnounceByBillingCustomerNoResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SendIhtarAnnounceByBillingCustomerIdResult", scope = SendIhtarAnnounceByBillingCustomerIdResponse.class)
    public JAXBElement<SendAnnounceByBillingCustomerNoResponseModel> createSendIhtarAnnounceByBillingCustomerIdResponseSendIhtarAnnounceByBillingCustomerIdResult(SendAnnounceByBillingCustomerNoResponseModel value) {
        return new JAXBElement<SendAnnounceByBillingCustomerNoResponseModel>(_SendIhtarAnnounceByBillingCustomerIdResponseSendIhtarAnnounceByBillingCustomerIdResult_QNAME, SendAnnounceByBillingCustomerNoResponseModel.class, SendIhtarAnnounceByBillingCustomerIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSoftInvoiceRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = RemoveSoftInvoice.class)
    public JAXBElement<RemoveSoftInvoiceRequestModel> createRemoveSoftInvoiceRequest(RemoveSoftInvoiceRequestModel value) {
        return new JAXBElement<RemoveSoftInvoiceRequestModel>(_GetCreditCardOrderRequest_QNAME, RemoveSoftInvoiceRequestModel.class, RemoveSoftInvoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ErrorMessage", scope = UpdateContactInfoResponseModel.class)
    public JAXBElement<String> createUpdateContactInfoResponseModelErrorMessage(String value) {
        return new JAXBElement<String>(_UpdateContactInfoResponseModelErrorMessage_QNAME, String.class, UpdateContactInfoResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCreditCardOrderRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = RemoveCreditCardOrder.class)
    public JAXBElement<RemoveCreditCardOrderRequestModel> createRemoveCreditCardOrderRequest(RemoveCreditCardOrderRequestModel value) {
        return new JAXBElement<RemoveCreditCardOrderRequestModel>(_GetCreditCardOrderRequest_QNAME, RemoveCreditCardOrderRequestModel.class, RemoveCreditCardOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCreditCardOrderRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = AddCreditCardOrder.class)
    public JAXBElement<AddCreditCardOrderRequestModel> createAddCreditCardOrderRequest(AddCreditCardOrderRequestModel value) {
        return new JAXBElement<AddCreditCardOrderRequestModel>(_GetCreditCardOrderRequest_QNAME, AddCreditCardOrderRequestModel.class, AddCreditCardOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Payment", name = "Application", scope = CreditCardOrder.class)
    public JAXBElement<String> createCreditCardOrderApplication(String value) {
        return new JAXBElement<String>(_CreditCardOrderApplication_QNAME, String.class, CreditCardOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Payment", name = "CreditCard", scope = CreditCardOrder.class)
    public JAXBElement<CreditCard> createCreditCardOrderCreditCard(CreditCard value) {
        return new JAXBElement<CreditCard>(_CreditCard_QNAME, CreditCard.class, CreditCardOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCreditCardOrderHistoryRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = GetCreditCardOrderHistory.class)
    public JAXBElement<GetCreditCardOrderHistoryRequestModel> createGetCreditCardOrderHistoryRequest(GetCreditCardOrderHistoryRequestModel value) {
        return new JAXBElement<GetCreditCardOrderHistoryRequestModel>(_GetCreditCardOrderRequest_QNAME, GetCreditCardOrderHistoryRequestModel.class, GetCreditCardOrderHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Bpm", name = "Code", scope = DocumentInfo.class)
    public JAXBElement<String> createDocumentInfoCode(String value) {
        return new JAXBElement<String>(_DocumentInfoCode_QNAME, String.class, DocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Bpm", name = "Url", scope = DocumentInfo.class)
    public JAXBElement<String> createDocumentInfoUrl(String value) {
        return new JAXBElement<String>(_DocumentInfoUrl_QNAME, String.class, DocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Document", scope = AddDeactivationRequestToAccountRequestModel.class)
    public JAXBElement<DocumentInfo> createAddDeactivationRequestToAccountRequestModelDocument(DocumentInfo value) {
        return new JAXBElement<DocumentInfo>(_AddDeactivationRequestToAccountRequestModelDocument_QNAME, DocumentInfo.class, AddDeactivationRequestToAccountRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateContactInfoRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = UpdateContactInfo.class)
    public JAXBElement<UpdateContactInfoRequestModel> createUpdateContactInfoRequest(UpdateContactInfoRequestModel value) {
        return new JAXBElement<UpdateContactInfoRequestModel>(_GetCreditCardOrderRequest_QNAME, UpdateContactInfoRequestModel.class, UpdateContactInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCreditCardOrderHistoryResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetCreditCardOrderHistoryResult", scope = GetCreditCardOrderHistoryResponse.class)
    public JAXBElement<GetCreditCardOrderHistoryResponseModel> createGetCreditCardOrderHistoryResponseGetCreditCardOrderHistoryResult(GetCreditCardOrderHistoryResponseModel value) {
        return new JAXBElement<GetCreditCardOrderHistoryResponseModel>(_GetCreditCardOrderHistoryResponseGetCreditCardOrderHistoryResult_QNAME, GetCreditCardOrderHistoryResponseModel.class, GetCreditCardOrderHistoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeBillingAddressRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ChangeBillingAddress.class)
    public JAXBElement<ChangeBillingAddressRequestModel> createChangeBillingAddressRequest(ChangeBillingAddressRequestModel value) {
        return new JAXBElement<ChangeBillingAddressRequestModel>(_GetCreditCardOrderRequest_QNAME, ChangeBillingAddressRequestModel.class, ChangeBillingAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCardOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "CreditCardOrder", scope = GetCreditCardOrderResponseModel.class)
    public JAXBElement<CreditCardOrder> createGetCreditCardOrderResponseModelCreditCardOrder(CreditCardOrder value) {
        return new JAXBElement<CreditCardOrder>(_GetCreditCardOrderResponseModelCreditCardOrder_QNAME, CreditCardOrder.class, GetCreditCardOrderResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Email", scope = AddSoftInvoiceRequestModel.class)
    public JAXBElement<String> createAddSoftInvoiceRequestModelEmail(String value) {
        return new JAXBElement<String>(_UpdateContactInfoRequestModelEmail_QNAME, String.class, AddSoftInvoiceRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDeactivationRequestToAccountRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = AddDeactivationRequest.class)
    public JAXBElement<AddDeactivationRequestToAccountRequestModel> createAddDeactivationRequestRequest(AddDeactivationRequestToAccountRequestModel value) {
        return new JAXBElement<AddDeactivationRequestToAccountRequestModel>(_GetCreditCardOrderRequest_QNAME, AddDeactivationRequestToAccountRequestModel.class, AddDeactivationRequest.class, value);
    }

}
