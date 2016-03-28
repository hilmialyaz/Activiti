
package org.milleni.dunning.ws.client.notif;

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
 * generated in the org.milleni.dunning.ws.client.notif package. 
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

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _SystemFault_QNAME = new QName("http://milleni.com/technical/Fault", "SystemFault");
    private final static QName _SendEmailResponseModel_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "SendEmailResponseModel");
    private final static QName _SendSmsRequestModel_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "SendSmsRequestModel");
    private final static QName _SendFutureSmsRequestModel_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "SendFutureSmsRequestModel");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _SendFutureSmsResponseModel_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "SendFutureSmsResponseModel");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _BaseFault_QNAME = new QName("http://milleni.com/technical/Fault", "BaseFault");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _BusinessFault_QNAME = new QName("http://milleni.com/technical/Fault", "BusinessFault");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _SendSmsResponseModel_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "SendSmsResponseModel");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _SendImediateSmsToCustomerRequestModel_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "SendImediateSmsToCustomerRequestModel");
    private final static QName _ArrayOfSmsLogModel_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "ArrayOfSmsLogModel");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _SmsLogModel_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "SmsLogModel");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfAttachmentByte_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "ArrayOfAttachmentByte");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _SmsSenderApplication_QNAME = new QName("http://milleni.com/Common/Notification", "SmsSenderApplication");
    private final static QName _SendImediateSmsToCustomerResponseModel_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "SendImediateSmsToCustomerResponseModel");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _GetSmsLogResponseModel_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "GetSmsLogResponseModel");
    private final static QName _SmtpInfo_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "SmtpInfo");
    private final static QName _GetSmsLogRequestModel_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "GetSmsLogRequestModel");
    private final static QName _AttachmentByte_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "AttachmentByte");
    private final static QName _SendEmailRequestModel_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "SendEmailRequestModel");
    private final static QName _SmsLogModelContent_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "Content");
    private final static QName _SmsLogModelStatus_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "Status");
    private final static QName _SmsLogModelStatusDate_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "StatusDate");
    private final static QName _SmsLogModelNumber_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "Number");
    private final static QName _SmsLogModelApplication_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "Application");
    private final static QName _SendFutureSmsResponseSendFutureSmsResult_QNAME = new QName("http://tempuri.org/", "SendFutureSmsResult");
    private final static QName _SendEmailResponseSendEmailResult_QNAME = new QName("http://tempuri.org/", "SendEmailResult");
    private final static QName _SendImediateSmsToCustomerRequestModelMessageEncyrpted_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "MessageEncyrpted");
    private final static QName _SendEmailRequest_QNAME = new QName("http://tempuri.org/", "request");
    private final static QName _SmtpInfoServer_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "Server");
    private final static QName _SmtpInfoUser_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "User");
    private final static QName _SmtpInfoPassword_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "Password");
    private final static QName _SendSmsResponseSendSmsResult_QNAME = new QName("http://tempuri.org/", "SendSmsResult");
    private final static QName _SendImediateSmsToCustomerResponseSendImediateSmsToCustomerResult_QNAME = new QName("http://tempuri.org/", "SendImediateSmsToCustomerResult");
    private final static QName _GetSmsLogResponseGetSmsLogResult_QNAME = new QName("http://tempuri.org/", "GetSmsLogResult");
    private final static QName _AttachmentByteFileName_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "FileName");
    private final static QName _AttachmentByteFileType_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "FileType");
    private final static QName _AttachmentByteFile_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "File");
    private final static QName _SendEmailRequestModelAttachmentByteList_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "AttachmentByteList");
    private final static QName _SendEmailRequestModelAttachments_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "Attachments");
    private final static QName _SendEmailRequestModelDisplayName_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "DisplayName");
    private final static QName _SendEmailRequestModelBccs_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "Bccs");
    private final static QName _SendEmailRequestModelCcs_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "Ccs");
    private final static QName _GetSmsLogResponseModelSmsLogs_QNAME = new QName("http://milleni.com/Common/Notification/CommonNotification/Service/v1", "SmsLogs");
    private final static QName _BaseFaultSIID_QNAME = new QName("http://milleni.com/technical/Fault", "SIID");
    private final static QName _BaseFaultActor_QNAME = new QName("http://milleni.com/technical/Fault", "Actor");
    private final static QName _BaseFaultDetail_QNAME = new QName("http://milleni.com/technical/Fault", "Detail");
    private final static QName _BaseFaultDescription_QNAME = new QName("http://milleni.com/technical/Fault", "Description");
    private final static QName _BaseFaultSource_QNAME = new QName("http://milleni.com/technical/Fault", "Source");
    private final static QName _BaseFaultParameters_QNAME = new QName("http://milleni.com/technical/Fault", "Parameters");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.milleni.dunning.ws.client.notif
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
     * Create an instance of {@link SendFutureSmsResponse }
     * 
     */
    public SendFutureSmsResponse createSendFutureSmsResponse() {
        return new SendFutureSmsResponse();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link AttachmentByte }
     * 
     */
    public AttachmentByte createAttachmentByte() {
        return new AttachmentByte();
    }

    /**
     * Create an instance of {@link SendImediateSmsToCustomerResponseModel }
     * 
     */
    public SendImediateSmsToCustomerResponseModel createSendImediateSmsToCustomerResponseModel() {
        return new SendImediateSmsToCustomerResponseModel();
    }

    /**
     * Create an instance of {@link GetSmsLogResponseModel }
     * 
     */
    public GetSmsLogResponseModel createGetSmsLogResponseModel() {
        return new GetSmsLogResponseModel();
    }

    /**
     * Create an instance of {@link SystemFault }
     * 
     */
    public SystemFault createSystemFault() {
        return new SystemFault();
    }

    /**
     * Create an instance of {@link GetSmsLog }
     * 
     */
    public GetSmsLog createGetSmsLog() {
        return new GetSmsLog();
    }

    /**
     * Create an instance of {@link SendImediateSmsToCustomer }
     * 
     */
    public SendImediateSmsToCustomer createSendImediateSmsToCustomer() {
        return new SendImediateSmsToCustomer();
    }

    /**
     * Create an instance of {@link SendSms }
     * 
     */
    public SendSms createSendSms() {
        return new SendSms();
    }

    /**
     * Create an instance of {@link SendFutureSmsResponseModel }
     * 
     */
    public SendFutureSmsResponseModel createSendFutureSmsResponseModel() {
        return new SendFutureSmsResponseModel();
    }

    /**
     * Create an instance of {@link ArrayOfSmsLogModel }
     * 
     */
    public ArrayOfSmsLogModel createArrayOfSmsLogModel() {
        return new ArrayOfSmsLogModel();
    }

    /**
     * Create an instance of {@link SmsLogModel }
     * 
     */
    public SmsLogModel createSmsLogModel() {
        return new SmsLogModel();
    }

    /**
     * Create an instance of {@link SendImediateSmsToCustomerRequestModel }
     * 
     */
    public SendImediateSmsToCustomerRequestModel createSendImediateSmsToCustomerRequestModel() {
        return new SendImediateSmsToCustomerRequestModel();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link SendSmsRequestModel }
     * 
     */
    public SendSmsRequestModel createSendSmsRequestModel() {
        return new SendSmsRequestModel();
    }

    /**
     * Create an instance of {@link SendEmail }
     * 
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link GetSmsLogRequestModel }
     * 
     */
    public GetSmsLogRequestModel createGetSmsLogRequestModel() {
        return new GetSmsLogRequestModel();
    }

    /**
     * Create an instance of {@link SmtpInfo }
     * 
     */
    public SmtpInfo createSmtpInfo() {
        return new SmtpInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAttachmentByte }
     * 
     */
    public ArrayOfAttachmentByte createArrayOfAttachmentByte() {
        return new ArrayOfAttachmentByte();
    }

    /**
     * Create an instance of {@link SendSmsResponse }
     * 
     */
    public SendSmsResponse createSendSmsResponse() {
        return new SendSmsResponse();
    }

    /**
     * Create an instance of {@link SendImediateSmsToCustomerResponse }
     * 
     */
    public SendImediateSmsToCustomerResponse createSendImediateSmsToCustomerResponse() {
        return new SendImediateSmsToCustomerResponse();
    }

    /**
     * Create an instance of {@link GetSmsLogResponse }
     * 
     */
    public GetSmsLogResponse createGetSmsLogResponse() {
        return new GetSmsLogResponse();
    }

    /**
     * Create an instance of {@link SendSmsResponseModel }
     * 
     */
    public SendSmsResponseModel createSendSmsResponseModel() {
        return new SendSmsResponseModel();
    }

    /**
     * Create an instance of {@link SendFutureSmsRequestModel }
     * 
     */
    public SendFutureSmsRequestModel createSendFutureSmsRequestModel() {
        return new SendFutureSmsRequestModel();
    }

    /**
     * Create an instance of {@link SendEmailRequestModel }
     * 
     */
    public SendEmailRequestModel createSendEmailRequestModel() {
        return new SendEmailRequestModel();
    }

    /**
     * Create an instance of {@link SendEmailResponseModel }
     * 
     */
    public SendEmailResponseModel createSendEmailResponseModel() {
        return new SendEmailResponseModel();
    }

    /**
     * Create an instance of {@link BaseFault }
     * 
     */
    public BaseFault createBaseFault() {
        return new BaseFault();
    }

    /**
     * Create an instance of {@link SendFutureSms }
     * 
     */
    public SendFutureSms createSendFutureSms() {
        return new SendFutureSms();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/technical/Fault", name = "SystemFault")
    public JAXBElement<SystemFault> createSystemFault(SystemFault value) {
        return new JAXBElement<SystemFault>(_SystemFault_QNAME, SystemFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "SendEmailResponseModel")
    public JAXBElement<SendEmailResponseModel> createSendEmailResponseModel(SendEmailResponseModel value) {
        return new JAXBElement<SendEmailResponseModel>(_SendEmailResponseModel_QNAME, SendEmailResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSmsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "SendSmsRequestModel")
    public JAXBElement<SendSmsRequestModel> createSendSmsRequestModel(SendSmsRequestModel value) {
        return new JAXBElement<SendSmsRequestModel>(_SendSmsRequestModel_QNAME, SendSmsRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendFutureSmsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "SendFutureSmsRequestModel")
    public JAXBElement<SendFutureSmsRequestModel> createSendFutureSmsRequestModel(SendFutureSmsRequestModel value) {
        return new JAXBElement<SendFutureSmsRequestModel>(_SendFutureSmsRequestModel_QNAME, SendFutureSmsRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SendFutureSmsResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "SendFutureSmsResponseModel")
    public JAXBElement<SendFutureSmsResponseModel> createSendFutureSmsResponseModel(SendFutureSmsResponseModel value) {
        return new JAXBElement<SendFutureSmsResponseModel>(_SendFutureSmsResponseModel_QNAME, SendFutureSmsResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSmsResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "SendSmsResponseModel")
    public JAXBElement<SendSmsResponseModel> createSendSmsResponseModel(SendSmsResponseModel value) {
        return new JAXBElement<SendSmsResponseModel>(_SendSmsResponseModel_QNAME, SendSmsResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImediateSmsToCustomerRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "SendImediateSmsToCustomerRequestModel")
    public JAXBElement<SendImediateSmsToCustomerRequestModel> createSendImediateSmsToCustomerRequestModel(SendImediateSmsToCustomerRequestModel value) {
        return new JAXBElement<SendImediateSmsToCustomerRequestModel>(_SendImediateSmsToCustomerRequestModel_QNAME, SendImediateSmsToCustomerRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSmsLogModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "ArrayOfSmsLogModel")
    public JAXBElement<ArrayOfSmsLogModel> createArrayOfSmsLogModel(ArrayOfSmsLogModel value) {
        return new JAXBElement<ArrayOfSmsLogModel>(_ArrayOfSmsLogModel_QNAME, ArrayOfSmsLogModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SmsLogModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "SmsLogModel")
    public JAXBElement<SmsLogModel> createSmsLogModel(SmsLogModel value) {
        return new JAXBElement<SmsLogModel>(_SmsLogModel_QNAME, SmsLogModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachmentByte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "ArrayOfAttachmentByte")
    public JAXBElement<ArrayOfAttachmentByte> createArrayOfAttachmentByte(ArrayOfAttachmentByte value) {
        return new JAXBElement<ArrayOfAttachmentByte>(_ArrayOfAttachmentByte_QNAME, ArrayOfAttachmentByte.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfint")
    public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImediateSmsToCustomerResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "SendImediateSmsToCustomerResponseModel")
    public JAXBElement<SendImediateSmsToCustomerResponseModel> createSendImediateSmsToCustomerResponseModel(SendImediateSmsToCustomerResponseModel value) {
        return new JAXBElement<SendImediateSmsToCustomerResponseModel>(_SendImediateSmsToCustomerResponseModel_QNAME, SendImediateSmsToCustomerResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmsLogResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "GetSmsLogResponseModel")
    public JAXBElement<GetSmsLogResponseModel> createGetSmsLogResponseModel(GetSmsLogResponseModel value) {
        return new JAXBElement<GetSmsLogResponseModel>(_GetSmsLogResponseModel_QNAME, GetSmsLogResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmtpInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "SmtpInfo")
    public JAXBElement<SmtpInfo> createSmtpInfo(SmtpInfo value) {
        return new JAXBElement<SmtpInfo>(_SmtpInfo_QNAME, SmtpInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmsLogRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "GetSmsLogRequestModel")
    public JAXBElement<GetSmsLogRequestModel> createGetSmsLogRequestModel(GetSmsLogRequestModel value) {
        return new JAXBElement<GetSmsLogRequestModel>(_GetSmsLogRequestModel_QNAME, GetSmsLogRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentByte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "AttachmentByte")
    public JAXBElement<AttachmentByte> createAttachmentByte(AttachmentByte value) {
        return new JAXBElement<AttachmentByte>(_AttachmentByte_QNAME, AttachmentByte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "SendEmailRequestModel")
    public JAXBElement<SendEmailRequestModel> createSendEmailRequestModel(SendEmailRequestModel value) {
        return new JAXBElement<SendEmailRequestModel>(_SendEmailRequestModel_QNAME, SendEmailRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "Content", scope = SmsLogModel.class)
    public JAXBElement<String> createSmsLogModelContent(String value) {
        return new JAXBElement<String>(_SmsLogModelContent_QNAME, String.class, SmsLogModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "Status", scope = SmsLogModel.class)
    public JAXBElement<String> createSmsLogModelStatus(String value) {
        return new JAXBElement<String>(_SmsLogModelStatus_QNAME, String.class, SmsLogModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "StatusDate", scope = SmsLogModel.class)
    public JAXBElement<XMLGregorianCalendar> createSmsLogModelStatusDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SmsLogModelStatusDate_QNAME, XMLGregorianCalendar.class, SmsLogModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "Number", scope = SmsLogModel.class)
    public JAXBElement<String> createSmsLogModelNumber(String value) {
        return new JAXBElement<String>(_SmsLogModelNumber_QNAME, String.class, SmsLogModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "Application", scope = SmsLogModel.class)
    public JAXBElement<String> createSmsLogModelApplication(String value) {
        return new JAXBElement<String>(_SmsLogModelApplication_QNAME, String.class, SmsLogModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendFutureSmsResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SendFutureSmsResult", scope = SendFutureSmsResponse.class)
    public JAXBElement<SendFutureSmsResponseModel> createSendFutureSmsResponseSendFutureSmsResult(SendFutureSmsResponseModel value) {
        return new JAXBElement<SendFutureSmsResponseModel>(_SendFutureSmsResponseSendFutureSmsResult_QNAME, SendFutureSmsResponseModel.class, SendFutureSmsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SendEmailResult", scope = SendEmailResponse.class)
    public JAXBElement<SendEmailResponseModel> createSendEmailResponseSendEmailResult(SendEmailResponseModel value) {
        return new JAXBElement<SendEmailResponseModel>(_SendEmailResponseSendEmailResult_QNAME, SendEmailResponseModel.class, SendEmailResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "MessageEncyrpted", scope = SendImediateSmsToCustomerRequestModel.class)
    public JAXBElement<String> createSendImediateSmsToCustomerRequestModelMessageEncyrpted(String value) {
        return new JAXBElement<String>(_SendImediateSmsToCustomerRequestModelMessageEncyrpted_QNAME, String.class, SendImediateSmsToCustomerRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = SendEmail.class)
    public JAXBElement<SendEmailRequestModel> createSendEmailRequest(SendEmailRequestModel value) {
        return new JAXBElement<SendEmailRequestModel>(_SendEmailRequest_QNAME, SendEmailRequestModel.class, SendEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "Server", scope = SmtpInfo.class)
    public JAXBElement<String> createSmtpInfoServer(String value) {
        return new JAXBElement<String>(_SmtpInfoServer_QNAME, String.class, SmtpInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "User", scope = SmtpInfo.class)
    public JAXBElement<String> createSmtpInfoUser(String value) {
        return new JAXBElement<String>(_SmtpInfoUser_QNAME, String.class, SmtpInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "Password", scope = SmtpInfo.class)
    public JAXBElement<String> createSmtpInfoPassword(String value) {
        return new JAXBElement<String>(_SmtpInfoPassword_QNAME, String.class, SmtpInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "Number", scope = GetSmsLogRequestModel.class)
    public JAXBElement<String> createGetSmsLogRequestModelNumber(String value) {
        return new JAXBElement<String>(_SmsLogModelNumber_QNAME, String.class, GetSmsLogRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSmsResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SendSmsResult", scope = SendSmsResponse.class)
    public JAXBElement<SendSmsResponseModel> createSendSmsResponseSendSmsResult(SendSmsResponseModel value) {
        return new JAXBElement<SendSmsResponseModel>(_SendSmsResponseSendSmsResult_QNAME, SendSmsResponseModel.class, SendSmsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImediateSmsToCustomerResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SendImediateSmsToCustomerResult", scope = SendImediateSmsToCustomerResponse.class)
    public JAXBElement<SendImediateSmsToCustomerResponseModel> createSendImediateSmsToCustomerResponseSendImediateSmsToCustomerResult(SendImediateSmsToCustomerResponseModel value) {
        return new JAXBElement<SendImediateSmsToCustomerResponseModel>(_SendImediateSmsToCustomerResponseSendImediateSmsToCustomerResult_QNAME, SendImediateSmsToCustomerResponseModel.class, SendImediateSmsToCustomerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmsLogResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetSmsLogResult", scope = GetSmsLogResponse.class)
    public JAXBElement<GetSmsLogResponseModel> createGetSmsLogResponseGetSmsLogResult(GetSmsLogResponseModel value) {
        return new JAXBElement<GetSmsLogResponseModel>(_GetSmsLogResponseGetSmsLogResult_QNAME, GetSmsLogResponseModel.class, GetSmsLogResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "FileName", scope = AttachmentByte.class)
    public JAXBElement<String> createAttachmentByteFileName(String value) {
        return new JAXBElement<String>(_AttachmentByteFileName_QNAME, String.class, AttachmentByte.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "FileType", scope = AttachmentByte.class)
    public JAXBElement<String> createAttachmentByteFileType(String value) {
        return new JAXBElement<String>(_AttachmentByteFileType_QNAME, String.class, AttachmentByte.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "File", scope = AttachmentByte.class)
    public JAXBElement<byte[]> createAttachmentByteFile(byte[] value) {
        return new JAXBElement<byte[]>(_AttachmentByteFile_QNAME, byte[].class, AttachmentByte.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachmentByte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "AttachmentByteList", scope = SendEmailRequestModel.class)
    public JAXBElement<ArrayOfAttachmentByte> createSendEmailRequestModelAttachmentByteList(ArrayOfAttachmentByte value) {
        return new JAXBElement<ArrayOfAttachmentByte>(_SendEmailRequestModelAttachmentByteList_QNAME, ArrayOfAttachmentByte.class, SendEmailRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "Attachments", scope = SendEmailRequestModel.class)
    public JAXBElement<ArrayOfstring> createSendEmailRequestModelAttachments(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_SendEmailRequestModelAttachments_QNAME, ArrayOfstring.class, SendEmailRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "DisplayName", scope = SendEmailRequestModel.class)
    public JAXBElement<String> createSendEmailRequestModelDisplayName(String value) {
        return new JAXBElement<String>(_SendEmailRequestModelDisplayName_QNAME, String.class, SendEmailRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "Bccs", scope = SendEmailRequestModel.class)
    public JAXBElement<ArrayOfstring> createSendEmailRequestModelBccs(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_SendEmailRequestModelBccs_QNAME, ArrayOfstring.class, SendEmailRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "Ccs", scope = SendEmailRequestModel.class)
    public JAXBElement<ArrayOfstring> createSendEmailRequestModelCcs(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_SendEmailRequestModelCcs_QNAME, ArrayOfstring.class, SendEmailRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmtpInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "SmtpInfo", scope = SendEmailRequestModel.class)
    public JAXBElement<SmtpInfo> createSendEmailRequestModelSmtpInfo(SmtpInfo value) {
        return new JAXBElement<SmtpInfo>(_SmtpInfo_QNAME, SmtpInfo.class, SendEmailRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSmsLogModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", name = "SmsLogs", scope = GetSmsLogResponseModel.class)
    public JAXBElement<ArrayOfSmsLogModel> createGetSmsLogResponseModelSmsLogs(ArrayOfSmsLogModel value) {
        return new JAXBElement<ArrayOfSmsLogModel>(_GetSmsLogResponseModelSmsLogs_QNAME, ArrayOfSmsLogModel.class, GetSmsLogResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmsLogRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = GetSmsLog.class)
    public JAXBElement<GetSmsLogRequestModel> createGetSmsLogRequest(GetSmsLogRequestModel value) {
        return new JAXBElement<GetSmsLogRequestModel>(_SendEmailRequest_QNAME, GetSmsLogRequestModel.class, GetSmsLog.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImediateSmsToCustomerRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = SendImediateSmsToCustomer.class)
    public JAXBElement<SendImediateSmsToCustomerRequestModel> createSendImediateSmsToCustomerRequest(SendImediateSmsToCustomerRequestModel value) {
        return new JAXBElement<SendImediateSmsToCustomerRequestModel>(_SendEmailRequest_QNAME, SendImediateSmsToCustomerRequestModel.class, SendImediateSmsToCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendFutureSmsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = SendFutureSms.class)
    public JAXBElement<SendFutureSmsRequestModel> createSendFutureSmsRequest(SendFutureSmsRequestModel value) {
        return new JAXBElement<SendFutureSmsRequestModel>(_SendEmailRequest_QNAME, SendFutureSmsRequestModel.class, SendFutureSms.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSmsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = SendSms.class)
    public JAXBElement<SendSmsRequestModel> createSendSmsRequest(SendSmsRequestModel value) {
        return new JAXBElement<SendSmsRequestModel>(_SendEmailRequest_QNAME, SendSmsRequestModel.class, SendSms.class, value);
    }

}
