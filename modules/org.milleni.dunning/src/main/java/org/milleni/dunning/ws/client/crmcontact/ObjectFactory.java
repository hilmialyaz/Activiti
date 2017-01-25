
package org.milleni.dunning.ws.client.crmcontact;

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
 * generated in the org.milleni.dunning.ws.client.crmcontact package. 
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

    private final static QName _SendSmsByBillingCustomerNoResponseSendSmsByBillingCustomerNoResult_QNAME = new QName("/CustomerInfo/Service/v1", "SendSmsByBillingCustomerNoResult");
    private final static QName _SystemFault_QNAME = new QName("http://milleni.com/technical/Fault", "SystemFault");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _BaseFault_QNAME = new QName("http://milleni.com/technical/Fault", "BaseFault");
    private final static QName _SendSmsByBillingCustomerNoResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "SendSmsByBillingCustomerNoResponseModel");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _BusinessFault_QNAME = new QName("http://milleni.com/technical/Fault", "BusinessFault");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _UpdateContactResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "UpdateContactResponseModel");
    private final static QName _UpdateContactError_QNAME = new QName("/CustomerInfo/Service/v1", "UpdateContactError");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _SendDunningSmsRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "SendDunningSmsRequestModel");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _ApproveNotificationEnum_QNAME = new QName("/CustomerInfo/Service/v1", "ApproveNotificationEnum");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _SendSmsByBillingCustomerNoRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "SendSmsByBillingCustomerNoRequestModel");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _SmsSenderApplication_QNAME = new QName("http://milleni.com/Common/Notification", "SmsSenderApplication");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UpdateContactRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "UpdateContactRequestModel");
    private final static QName _UpdateContactInfoResponseUpdateContactInfoResult_QNAME = new QName("/CustomerInfo/Service/v1", "UpdateContactInfoResult");
    private final static QName _UpdateContactInfoRequest_QNAME = new QName("/CustomerInfo/Service/v1", "request");
    private final static QName _SendDunningSmsRequestModelBillingCustomerNo_QNAME = new QName("/CustomerInfo/Service/v1", "BillingCustomerNo");
    private final static QName _SendDunningSmsRequestModelSmsCode_QNAME = new QName("/CustomerInfo/Service/v1", "SmsCode");
    private final static QName _SendDunningSmsRequestModelDebit_QNAME = new QName("/CustomerInfo/Service/v1", "Debit");
    private final static QName _UpdateContactRequestModelName_QNAME = new QName("/CustomerInfo/Service/v1", "Name");
    private final static QName _UpdateContactRequestModelWorkPhone_QNAME = new QName("/CustomerInfo/Service/v1", "WorkPhone");
    private final static QName _UpdateContactRequestModelEmail_QNAME = new QName("/CustomerInfo/Service/v1", "Email");
    private final static QName _UpdateContactRequestModelWebAddress_QNAME = new QName("/CustomerInfo/Service/v1", "WebAddress");
    private final static QName _UpdateContactRequestModelFax_QNAME = new QName("/CustomerInfo/Service/v1", "Fax");
    private final static QName _UpdateContactRequestModelIpAddress_QNAME = new QName("/CustomerInfo/Service/v1", "IpAddress");
    private final static QName _UpdateContactRequestModelSurname_QNAME = new QName("/CustomerInfo/Service/v1", "Surname");
    private final static QName _UpdateContactRequestModelMobilePhone_QNAME = new QName("/CustomerInfo/Service/v1", "MobilePhone");
    private final static QName _UpdateContactRequestModelTitle_QNAME = new QName("/CustomerInfo/Service/v1", "Title");
    private final static QName _BaseFaultSIID_QNAME = new QName("http://milleni.com/technical/Fault", "SIID");
    private final static QName _BaseFaultActor_QNAME = new QName("http://milleni.com/technical/Fault", "Actor");
    private final static QName _BaseFaultDetail_QNAME = new QName("http://milleni.com/technical/Fault", "Detail");
    private final static QName _BaseFaultDescription_QNAME = new QName("http://milleni.com/technical/Fault", "Description");
    private final static QName _BaseFaultSource_QNAME = new QName("http://milleni.com/technical/Fault", "Source");
    private final static QName _BaseFaultParameters_QNAME = new QName("http://milleni.com/technical/Fault", "Parameters");
    private final static QName _SendSmsByBillingCustomerNoRequestModelSmsText_QNAME = new QName("/CustomerInfo/Service/v1", "SmsText");
    private final static QName _SendSmsByBillingCustomerNoRequestModelOriginator_QNAME = new QName("/CustomerInfo/Service/v1", "Originator");
    private final static QName _UpdateContactResponseModelErrorMessage_QNAME = new QName("/CustomerInfo/Service/v1", "ErrorMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.milleni.dunning.ws.client.crmcontact
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateContactInfo }
     * 
     */
    public UpdateContactInfo createUpdateContactInfo() {
        return new UpdateContactInfo();
    }

    /**
     * Create an instance of {@link BusinessFault }
     * 
     */
    public BusinessFault createBusinessFault() {
        return new BusinessFault();
    }

    /**
     * Create an instance of {@link SendDunningSmsResponse }
     * 
     */
    public SendDunningSmsResponse createSendDunningSmsResponse() {
        return new SendDunningSmsResponse();
    }

    /**
     * Create an instance of {@link UpdateContactRequestModel }
     * 
     */
    public UpdateContactRequestModel createUpdateContactRequestModel() {
        return new UpdateContactRequestModel();
    }

    /**
     * Create an instance of {@link SendSmsByBillingCustomerNoResponseModel }
     * 
     */
    public SendSmsByBillingCustomerNoResponseModel createSendSmsByBillingCustomerNoResponseModel() {
        return new SendSmsByBillingCustomerNoResponseModel();
    }

    /**
     * Create an instance of {@link BaseFault }
     * 
     */
    public BaseFault createBaseFault() {
        return new BaseFault();
    }

    /**
     * Create an instance of {@link SendSmsByBillingCustomerNoRequestModel }
     * 
     */
    public SendSmsByBillingCustomerNoRequestModel createSendSmsByBillingCustomerNoRequestModel() {
        return new SendSmsByBillingCustomerNoRequestModel();
    }

    /**
     * Create an instance of {@link SendDunningSms }
     * 
     */
    public SendDunningSms createSendDunningSms() {
        return new SendDunningSms();
    }

    /**
     * Create an instance of {@link SendSmsByBillingCustomerNoResponse }
     * 
     */
    public SendSmsByBillingCustomerNoResponse createSendSmsByBillingCustomerNoResponse() {
        return new SendSmsByBillingCustomerNoResponse();
    }

    /**
     * Create an instance of {@link UpdateContactInfoResponse }
     * 
     */
    public UpdateContactInfoResponse createUpdateContactInfoResponse() {
        return new UpdateContactInfoResponse();
    }

    /**
     * Create an instance of {@link SystemFault }
     * 
     */
    public SystemFault createSystemFault() {
        return new SystemFault();
    }

    /**
     * Create an instance of {@link SendDunningSmsRequestModel }
     * 
     */
    public SendDunningSmsRequestModel createSendDunningSmsRequestModel() {
        return new SendDunningSmsRequestModel();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link UpdateContactResponseModel }
     * 
     */
    public UpdateContactResponseModel createUpdateContactResponseModel() {
        return new UpdateContactResponseModel();
    }

    /**
     * Create an instance of {@link SendSmsByBillingCustomerNo }
     * 
     */
    public SendSmsByBillingCustomerNo createSendSmsByBillingCustomerNo() {
        return new SendSmsByBillingCustomerNo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSmsByBillingCustomerNoResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SendSmsByBillingCustomerNoResult", scope = SendSmsByBillingCustomerNoResponse.class)
    public JAXBElement<SendSmsByBillingCustomerNoResponseModel> createSendSmsByBillingCustomerNoResponseSendSmsByBillingCustomerNoResult(SendSmsByBillingCustomerNoResponseModel value) {
        return new JAXBElement<SendSmsByBillingCustomerNoResponseModel>(_SendSmsByBillingCustomerNoResponseSendSmsByBillingCustomerNoResult_QNAME, SendSmsByBillingCustomerNoResponseModel.class, SendSmsByBillingCustomerNoResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSmsByBillingCustomerNoResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SendSmsByBillingCustomerNoResponseModel")
    public JAXBElement<SendSmsByBillingCustomerNoResponseModel> createSendSmsByBillingCustomerNoResponseModel(SendSmsByBillingCustomerNoResponseModel value) {
        return new JAXBElement<SendSmsByBillingCustomerNoResponseModel>(_SendSmsByBillingCustomerNoResponseModel_QNAME, SendSmsByBillingCustomerNoResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateContactResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UpdateContactResponseModel")
    public JAXBElement<UpdateContactResponseModel> createUpdateContactResponseModel(UpdateContactResponseModel value) {
        return new JAXBElement<UpdateContactResponseModel>(_UpdateContactResponseModel_QNAME, UpdateContactResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDunningSmsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SendDunningSmsRequestModel")
    public JAXBElement<SendDunningSmsRequestModel> createSendDunningSmsRequestModel(SendDunningSmsRequestModel value) {
        return new JAXBElement<SendDunningSmsRequestModel>(_SendDunningSmsRequestModel_QNAME, SendDunningSmsRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSmsByBillingCustomerNoRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SendSmsByBillingCustomerNoRequestModel")
    public JAXBElement<SendSmsByBillingCustomerNoRequestModel> createSendSmsByBillingCustomerNoRequestModel(SendSmsByBillingCustomerNoRequestModel value) {
        return new JAXBElement<SendSmsByBillingCustomerNoRequestModel>(_SendSmsByBillingCustomerNoRequestModel_QNAME, SendSmsByBillingCustomerNoRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SmsSenderApplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification", name = "SmsSenderApplication")
    public JAXBElement<SmsSenderApplication> createSmsSenderApplication(SmsSenderApplication value) {
        return new JAXBElement<SmsSenderApplication>(_SmsSenderApplication_QNAME, SmsSenderApplication.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateContactRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UpdateContactRequestModel")
    public JAXBElement<UpdateContactRequestModel> createUpdateContactRequestModel(UpdateContactRequestModel value) {
        return new JAXBElement<UpdateContactRequestModel>(_UpdateContactRequestModel_QNAME, UpdateContactRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateContactResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UpdateContactInfoResult", scope = UpdateContactInfoResponse.class)
    public JAXBElement<UpdateContactResponseModel> createUpdateContactInfoResponseUpdateContactInfoResult(UpdateContactResponseModel value) {
        return new JAXBElement<UpdateContactResponseModel>(_UpdateContactInfoResponseUpdateContactInfoResult_QNAME, UpdateContactResponseModel.class, UpdateContactInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateContactRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = UpdateContactInfo.class)
    public JAXBElement<UpdateContactRequestModel> createUpdateContactInfoRequest(UpdateContactRequestModel value) {
        return new JAXBElement<UpdateContactRequestModel>(_UpdateContactInfoRequest_QNAME, UpdateContactRequestModel.class, UpdateContactInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "BillingCustomerNo", scope = SendDunningSmsRequestModel.class)
    public JAXBElement<String> createSendDunningSmsRequestModelBillingCustomerNo(String value) {
        return new JAXBElement<String>(_SendDunningSmsRequestModelBillingCustomerNo_QNAME, String.class, SendDunningSmsRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SmsCode", scope = SendDunningSmsRequestModel.class)
    public JAXBElement<String> createSendDunningSmsRequestModelSmsCode(String value) {
        return new JAXBElement<String>(_SendDunningSmsRequestModelSmsCode_QNAME, String.class, SendDunningSmsRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Debit", scope = SendDunningSmsRequestModel.class)
    public JAXBElement<String> createSendDunningSmsRequestModelDebit(String value) {
        return new JAXBElement<String>(_SendDunningSmsRequestModelDebit_QNAME, String.class, SendDunningSmsRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Name", scope = UpdateContactRequestModel.class)
    public JAXBElement<String> createUpdateContactRequestModelName(String value) {
        return new JAXBElement<String>(_UpdateContactRequestModelName_QNAME, String.class, UpdateContactRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "WorkPhone", scope = UpdateContactRequestModel.class)
    public JAXBElement<String> createUpdateContactRequestModelWorkPhone(String value) {
        return new JAXBElement<String>(_UpdateContactRequestModelWorkPhone_QNAME, String.class, UpdateContactRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Email", scope = UpdateContactRequestModel.class)
    public JAXBElement<String> createUpdateContactRequestModelEmail(String value) {
        return new JAXBElement<String>(_UpdateContactRequestModelEmail_QNAME, String.class, UpdateContactRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "WebAddress", scope = UpdateContactRequestModel.class)
    public JAXBElement<String> createUpdateContactRequestModelWebAddress(String value) {
        return new JAXBElement<String>(_UpdateContactRequestModelWebAddress_QNAME, String.class, UpdateContactRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Fax", scope = UpdateContactRequestModel.class)
    public JAXBElement<String> createUpdateContactRequestModelFax(String value) {
        return new JAXBElement<String>(_UpdateContactRequestModelFax_QNAME, String.class, UpdateContactRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "IpAddress", scope = UpdateContactRequestModel.class)
    public JAXBElement<String> createUpdateContactRequestModelIpAddress(String value) {
        return new JAXBElement<String>(_UpdateContactRequestModelIpAddress_QNAME, String.class, UpdateContactRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Surname", scope = UpdateContactRequestModel.class)
    public JAXBElement<String> createUpdateContactRequestModelSurname(String value) {
        return new JAXBElement<String>(_UpdateContactRequestModelSurname_QNAME, String.class, UpdateContactRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "MobilePhone", scope = UpdateContactRequestModel.class)
    public JAXBElement<String> createUpdateContactRequestModelMobilePhone(String value) {
        return new JAXBElement<String>(_UpdateContactRequestModelMobilePhone_QNAME, String.class, UpdateContactRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Title", scope = UpdateContactRequestModel.class)
    public JAXBElement<String> createUpdateContactRequestModelTitle(String value) {
        return new JAXBElement<String>(_UpdateContactRequestModelTitle_QNAME, String.class, UpdateContactRequestModel.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SmsText", scope = SendSmsByBillingCustomerNoRequestModel.class)
    public JAXBElement<String> createSendSmsByBillingCustomerNoRequestModelSmsText(String value) {
        return new JAXBElement<String>(_SendSmsByBillingCustomerNoRequestModelSmsText_QNAME, String.class, SendSmsByBillingCustomerNoRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Originator", scope = SendSmsByBillingCustomerNoRequestModel.class)
    public JAXBElement<String> createSendSmsByBillingCustomerNoRequestModelOriginator(String value) {
        return new JAXBElement<String>(_SendSmsByBillingCustomerNoRequestModelOriginator_QNAME, String.class, SendSmsByBillingCustomerNoRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "BillingCustomerNo", scope = SendSmsByBillingCustomerNoRequestModel.class)
    public JAXBElement<String> createSendSmsByBillingCustomerNoRequestModelBillingCustomerNo(String value) {
        return new JAXBElement<String>(_SendDunningSmsRequestModelBillingCustomerNo_QNAME, String.class, SendSmsByBillingCustomerNoRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ErrorMessage", scope = UpdateContactResponseModel.class)
    public JAXBElement<String> createUpdateContactResponseModelErrorMessage(String value) {
        return new JAXBElement<String>(_UpdateContactResponseModelErrorMessage_QNAME, String.class, UpdateContactResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSmsByBillingCustomerNoRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = SendSmsByBillingCustomerNo.class)
    public JAXBElement<SendSmsByBillingCustomerNoRequestModel> createSendSmsByBillingCustomerNoRequest(SendSmsByBillingCustomerNoRequestModel value) {
        return new JAXBElement<SendSmsByBillingCustomerNoRequestModel>(_UpdateContactInfoRequest_QNAME, SendSmsByBillingCustomerNoRequestModel.class, SendSmsByBillingCustomerNo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDunningSmsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = SendDunningSms.class)
    public JAXBElement<SendDunningSmsRequestModel> createSendDunningSmsRequest(SendDunningSmsRequestModel value) {
        return new JAXBElement<SendDunningSmsRequestModel>(_UpdateContactInfoRequest_QNAME, SendDunningSmsRequestModel.class, SendDunningSms.class, value);
    }

}
