
package org.milleni.dunning.ws.client.freezexdsl;

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
 * generated in the org.milleni.dunning.ws.client.freezexdsl package. 
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

    private final static QName _BaseFaultSIID_QNAME = new QName("http://milleni.com/technical/Fault", "SIID");
    private final static QName _BaseFaultActor_QNAME = new QName("http://milleni.com/technical/Fault", "Actor");
    private final static QName _BaseFaultDetail_QNAME = new QName("http://milleni.com/technical/Fault", "Detail");
    private final static QName _BaseFaultDescription_QNAME = new QName("http://milleni.com/technical/Fault", "Description");
    private final static QName _BaseFaultSource_QNAME = new QName("http://milleni.com/technical/Fault", "Source");
    private final static QName _BaseFaultParameters_QNAME = new QName("http://milleni.com/technical/Fault", "Parameters");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _SystemFault_QNAME = new QName("http://milleni.com/technical/Fault", "SystemFault");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _DunningUnfreezeCustomerXDSLRequest_QNAME = new QName("/FreezeDunning/Service/v1", "DunningUnfreezeCustomerXDSLRequest");
    private final static QName _BaseFault_QNAME = new QName("http://milleni.com/technical/Fault", "BaseFault");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _BusinessFault_QNAME = new QName("http://milleni.com/technical/Fault", "BusinessFault");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _DunningUnfreezeCustomerXDSLResponse_QNAME = new QName("/FreezeDunning/Service/v1", "DunningUnfreezeCustomerXDSLResponse");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _DunningFreezeCustomerXDSLResponse_QNAME = new QName("/FreezeDunning/Service/v1", "DunningFreezeCustomerXDSLResponse");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _DunningFreezeCustomerXDSLRequest_QNAME = new QName("/FreezeDunning/Service/v1", "DunningFreezeCustomerXDSLRequest");
    private final static QName _DunningFreezeXDSLRequest_QNAME = new QName("/FreezeDunning/Service/v1", "request");
    private final static QName _DunningFreezeXDSLResponseDunningFreezeXDSLResult_QNAME = new QName("/FreezeDunning/Service/v1", "DunningFreezeXDSLResult");
    private final static QName _DunningUnfreezeXDSLResponseDunningUnfreezeXDSLResult_QNAME = new QName("/FreezeDunning/Service/v1", "DunningUnfreezeXDSLResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.milleni.dunning.ws.client.freezexdsl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BaseFault }
     * 
     */
    public BaseFault createBaseFault() {
        return new BaseFault();
    }

    /**
     * Create an instance of {@link DunningFreezeXDSL }
     * 
     */
    public DunningFreezeXDSL createDunningFreezeXDSL() {
        return new DunningFreezeXDSL();
    }

    /**
     * Create an instance of {@link DunningFreezeXDSLResponse }
     * 
     */
    public DunningFreezeXDSLResponse createDunningFreezeXDSLResponse() {
        return new DunningFreezeXDSLResponse();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link DunningUnfreezeCustomerXDSLRequest }
     * 
     */
    public DunningUnfreezeCustomerXDSLRequest createDunningUnfreezeCustomerXDSLRequest() {
        return new DunningUnfreezeCustomerXDSLRequest();
    }

    /**
     * Create an instance of {@link DunningUnfreezeXDSL }
     * 
     */
    public DunningUnfreezeXDSL createDunningUnfreezeXDSL() {
        return new DunningUnfreezeXDSL();
    }

    /**
     * Create an instance of {@link DunningFreezeCustomerXDSLResponse }
     * 
     */
    public DunningFreezeCustomerXDSLResponse createDunningFreezeCustomerXDSLResponse() {
        return new DunningFreezeCustomerXDSLResponse();
    }

    /**
     * Create an instance of {@link DunningFreezeCustomerXDSLRequest }
     * 
     */
    public DunningFreezeCustomerXDSLRequest createDunningFreezeCustomerXDSLRequest() {
        return new DunningFreezeCustomerXDSLRequest();
    }

    /**
     * Create an instance of {@link SystemFault }
     * 
     */
    public SystemFault createSystemFault() {
        return new SystemFault();
    }

    /**
     * Create an instance of {@link BusinessFault }
     * 
     */
    public BusinessFault createBusinessFault() {
        return new BusinessFault();
    }

    /**
     * Create an instance of {@link DunningUnfreezeXDSLResponse }
     * 
     */
    public DunningUnfreezeXDSLResponse createDunningUnfreezeXDSLResponse() {
        return new DunningUnfreezeXDSLResponse();
    }

    /**
     * Create an instance of {@link DunningUnfreezeCustomerXDSLResponse }
     * 
     */
    public DunningUnfreezeCustomerXDSLResponse createDunningUnfreezeCustomerXDSLResponse() {
        return new DunningUnfreezeCustomerXDSLResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DunningUnfreezeCustomerXDSLRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/FreezeDunning/Service/v1", name = "DunningUnfreezeCustomerXDSLRequest")
    public JAXBElement<DunningUnfreezeCustomerXDSLRequest> createDunningUnfreezeCustomerXDSLRequest(DunningUnfreezeCustomerXDSLRequest value) {
        return new JAXBElement<DunningUnfreezeCustomerXDSLRequest>(_DunningUnfreezeCustomerXDSLRequest_QNAME, DunningUnfreezeCustomerXDSLRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DunningUnfreezeCustomerXDSLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/FreezeDunning/Service/v1", name = "DunningUnfreezeCustomerXDSLResponse")
    public JAXBElement<DunningUnfreezeCustomerXDSLResponse> createDunningUnfreezeCustomerXDSLResponse(DunningUnfreezeCustomerXDSLResponse value) {
        return new JAXBElement<DunningUnfreezeCustomerXDSLResponse>(_DunningUnfreezeCustomerXDSLResponse_QNAME, DunningUnfreezeCustomerXDSLResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DunningFreezeCustomerXDSLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/FreezeDunning/Service/v1", name = "DunningFreezeCustomerXDSLResponse")
    public JAXBElement<DunningFreezeCustomerXDSLResponse> createDunningFreezeCustomerXDSLResponse(DunningFreezeCustomerXDSLResponse value) {
        return new JAXBElement<DunningFreezeCustomerXDSLResponse>(_DunningFreezeCustomerXDSLResponse_QNAME, DunningFreezeCustomerXDSLResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DunningFreezeCustomerXDSLRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/FreezeDunning/Service/v1", name = "DunningFreezeCustomerXDSLRequest")
    public JAXBElement<DunningFreezeCustomerXDSLRequest> createDunningFreezeCustomerXDSLRequest(DunningFreezeCustomerXDSLRequest value) {
        return new JAXBElement<DunningFreezeCustomerXDSLRequest>(_DunningFreezeCustomerXDSLRequest_QNAME, DunningFreezeCustomerXDSLRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DunningFreezeCustomerXDSLRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/FreezeDunning/Service/v1", name = "request", scope = DunningFreezeXDSL.class)
    public JAXBElement<DunningFreezeCustomerXDSLRequest> createDunningFreezeXDSLRequest(DunningFreezeCustomerXDSLRequest value) {
        return new JAXBElement<DunningFreezeCustomerXDSLRequest>(_DunningFreezeXDSLRequest_QNAME, DunningFreezeCustomerXDSLRequest.class, DunningFreezeXDSL.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DunningFreezeCustomerXDSLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/FreezeDunning/Service/v1", name = "DunningFreezeXDSLResult", scope = DunningFreezeXDSLResponse.class)
    public JAXBElement<DunningFreezeCustomerXDSLResponse> createDunningFreezeXDSLResponseDunningFreezeXDSLResult(DunningFreezeCustomerXDSLResponse value) {
        return new JAXBElement<DunningFreezeCustomerXDSLResponse>(_DunningFreezeXDSLResponseDunningFreezeXDSLResult_QNAME, DunningFreezeCustomerXDSLResponse.class, DunningFreezeXDSLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DunningUnfreezeCustomerXDSLRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/FreezeDunning/Service/v1", name = "request", scope = DunningUnfreezeXDSL.class)
    public JAXBElement<DunningUnfreezeCustomerXDSLRequest> createDunningUnfreezeXDSLRequest(DunningUnfreezeCustomerXDSLRequest value) {
        return new JAXBElement<DunningUnfreezeCustomerXDSLRequest>(_DunningFreezeXDSLRequest_QNAME, DunningUnfreezeCustomerXDSLRequest.class, DunningUnfreezeXDSL.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DunningUnfreezeCustomerXDSLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/FreezeDunning/Service/v1", name = "DunningUnfreezeXDSLResult", scope = DunningUnfreezeXDSLResponse.class)
    public JAXBElement<DunningUnfreezeCustomerXDSLResponse> createDunningUnfreezeXDSLResponseDunningUnfreezeXDSLResult(DunningUnfreezeCustomerXDSLResponse value) {
        return new JAXBElement<DunningUnfreezeCustomerXDSLResponse>(_DunningUnfreezeXDSLResponseDunningUnfreezeXDSLResult_QNAME, DunningUnfreezeCustomerXDSLResponse.class, DunningUnfreezeXDSLResponse.class, value);
    }

}
