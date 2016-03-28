
package org.milleni.dunning.ws.client.tts;

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
 * generated in the org.milleni.dunning.ws.client.tts package. 
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
    private final static QName _RequestChannelEnum_QNAME = new QName("http://milleni.com/TTS/TTS/Service/v1", "RequestChannelEnum");
    private final static QName _DeactivatePersonResponseModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "DeactivatePersonResponseModel");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _BaseFault_QNAME = new QName("http://milleni.com/technical/Fault", "BaseFault");
    private final static QName _GetActiveCallCentersRequestModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "GetActiveCallCentersRequestModel");
    private final static QName _BusinessFault_QNAME = new QName("http://milleni.com/technical/Fault", "BusinessFault");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _PersonGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "PersonGroup");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _GetActivePersonResponseModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "GetActivePersonResponseModel");
    private final static QName _CreatePersonResponseModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "CreatePersonResponseModel");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfCallCenter_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "ArrayOfCallCenter");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _CreatePersonRequestModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "CreatePersonRequestModel");
    private final static QName _GetActiveCallCentersResponseModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "GetActiveCallCentersResponseModel");
    private final static QName _SystemFault_QNAME = new QName("http://milleni.com/technical/Fault", "SystemFault");
    private final static QName _GetActivePersonRequestModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "GetActivePersonRequestModel");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _CreateTicklerResponseModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "CreateTicklerResponseModel");
    private final static QName _UpdatePersonRequestModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "UpdatePersonRequestModel");
    private final static QName _Person_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "Person");
    private final static QName _CallCenter_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "CallCenter");
    private final static QName _CreateTicklerRequestModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "CreateTicklerRequestModel");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _GetActivePersonGroupsRequestModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "GetActivePersonGroupsRequestModel");
    private final static QName _UpdatePersonResponseModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "UpdatePersonResponseModel");
    private final static QName _RequestPriorityEnum_QNAME = new QName("http://milleni.com/TTS/TTS/Service/v1", "RequestPriorityEnum");
    private final static QName _GetActivePersonGroupsResponseModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "GetActivePersonGroupsResponseModel");
    private final static QName _DeactivatePersonRequestModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "DeactivatePersonRequestModel");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _ArrayOfPersonGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "ArrayOfPersonGroup");
    private final static QName _ApproveNotificationEnum_QNAME = new QName("http://milleni.com/TTS/TTS/Service/v1", "ApproveNotificationEnum");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _RequestData_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "RequestData");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _RequestFeedBackEnum_QNAME = new QName("http://milleni.com/TTS/TTS/Service/v1", "RequestFeedBackEnum");
    private final static QName _GetActivePersonResponseGetActivePersonResult_QNAME = new QName("http://tempuri.org/", "GetActivePersonResult");
    private final static QName _GetActiveCallCentersResponseModelCallCenters_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "CallCenters");
    private final static QName _GetActivePersonGroupsRequest_QNAME = new QName("http://tempuri.org/", "request");
    private final static QName _BaseFaultSIID_QNAME = new QName("http://milleni.com/technical/Fault", "SIID");
    private final static QName _BaseFaultActor_QNAME = new QName("http://milleni.com/technical/Fault", "Actor");
    private final static QName _BaseFaultDetail_QNAME = new QName("http://milleni.com/technical/Fault", "Detail");
    private final static QName _BaseFaultDescription_QNAME = new QName("http://milleni.com/technical/Fault", "Description");
    private final static QName _BaseFaultSource_QNAME = new QName("http://milleni.com/technical/Fault", "Source");
    private final static QName _BaseFaultParameters_QNAME = new QName("http://milleni.com/technical/Fault", "Parameters");
    private final static QName _GetActivePersonGroupsResponseGetActivePersonGroupsResult_QNAME = new QName("http://tempuri.org/", "GetActivePersonGroupsResult");
    private final static QName _RequestDataRequestReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "RequestReason");
    private final static QName _RequestDataDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "Description");
    private final static QName _RequestDataState_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "State");
    private final static QName _RequestDataEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "Email");
    private final static QName _RequestDataSubject_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "Subject");
    private final static QName _RequestDataSubState_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "SubState");
    private final static QName _RequestDataMobile_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "Mobile");
    private final static QName _RequestDataContractNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "ContractNo");
    private final static QName _RequestDataCustomerName_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "CustomerName");
    private final static QName _RequestDataRequestType_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "RequestType");
    private final static QName _UpdatePersonResponseUpdatePersonResult_QNAME = new QName("http://tempuri.org/", "UpdatePersonResult");
    private final static QName _CallCenterName_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "Name");
    private final static QName _CreatePersonResponseCreatePersonResult_QNAME = new QName("http://tempuri.org/", "CreatePersonResult");
    private final static QName _CreateTicklerResponseCreateTicklerResult_QNAME = new QName("http://tempuri.org/", "CreateTicklerResult");
    private final static QName _GetActiveCallCentersResponseGetActiveCallCentersResult_QNAME = new QName("http://tempuri.org/", "GetActiveCallCentersResult");
    private final static QName _DeactivatePersonResponseDeactivatePersonResult_QNAME = new QName("http://tempuri.org/", "DeactivatePersonResult");
    private final static QName _PersonUserName_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "UserName");
    private final static QName _PersonPersonGroups_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", "PersonGroups");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.milleni.dunning.ws.client.tts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetActiveCallCentersResponseModel }
     * 
     */
    public GetActiveCallCentersResponseModel createGetActiveCallCentersResponseModel() {
        return new GetActiveCallCentersResponseModel();
    }

    /**
     * Create an instance of {@link BaseFault }
     * 
     */
    public BaseFault createBaseFault() {
        return new BaseFault();
    }

    /**
     * Create an instance of {@link RequestData }
     * 
     */
    public RequestData createRequestData() {
        return new RequestData();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link SystemFault }
     * 
     */
    public SystemFault createSystemFault() {
        return new SystemFault();
    }

    /**
     * Create an instance of {@link GetActivePersonRequestModel }
     * 
     */
    public GetActivePersonRequestModel createGetActivePersonRequestModel() {
        return new GetActivePersonRequestModel();
    }

    /**
     * Create an instance of {@link ArrayOfCallCenter }
     * 
     */
    public ArrayOfCallCenter createArrayOfCallCenter() {
        return new ArrayOfCallCenter();
    }

    /**
     * Create an instance of {@link BusinessFault }
     * 
     */
    public BusinessFault createBusinessFault() {
        return new BusinessFault();
    }

    /**
     * Create an instance of {@link CreateTicklerRequestModel }
     * 
     */
    public CreateTicklerRequestModel createCreateTicklerRequestModel() {
        return new CreateTicklerRequestModel();
    }

    /**
     * Create an instance of {@link CallCenter }
     * 
     */
    public CallCenter createCallCenter() {
        return new CallCenter();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link GetActivePersonGroupsRequestModel }
     * 
     */
    public GetActivePersonGroupsRequestModel createGetActivePersonGroupsRequestModel() {
        return new GetActivePersonGroupsRequestModel();
    }

    /**
     * Create an instance of {@link GetActiveCallCentersRequestModel }
     * 
     */
    public GetActiveCallCentersRequestModel createGetActiveCallCentersRequestModel() {
        return new GetActiveCallCentersRequestModel();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPersonGroup }
     * 
     */
    public ArrayOfPersonGroup createArrayOfPersonGroup() {
        return new ArrayOfPersonGroup();
    }

    /**
     * Create an instance of {@link DeactivatePersonResponse }
     * 
     */
    public DeactivatePersonResponse createDeactivatePersonResponse() {
        return new DeactivatePersonResponse();
    }

    /**
     * Create an instance of {@link PersonGroup }
     * 
     */
    public PersonGroup createPersonGroup() {
        return new PersonGroup();
    }

    /**
     * Create an instance of {@link GetActiveCallCenters }
     * 
     */
    public GetActiveCallCenters createGetActiveCallCenters() {
        return new GetActiveCallCenters();
    }

    /**
     * Create an instance of {@link CreateTicklerResponseModel }
     * 
     */
    public CreateTicklerResponseModel createCreateTicklerResponseModel() {
        return new CreateTicklerResponseModel();
    }

    /**
     * Create an instance of {@link CreateTickler }
     * 
     */
    public CreateTickler createCreateTickler() {
        return new CreateTickler();
    }

    /**
     * Create an instance of {@link UpdatePersonResponseModel }
     * 
     */
    public UpdatePersonResponseModel createUpdatePersonResponseModel() {
        return new UpdatePersonResponseModel();
    }

    /**
     * Create an instance of {@link GetActivePersonGroupsResponseModel }
     * 
     */
    public GetActivePersonGroupsResponseModel createGetActivePersonGroupsResponseModel() {
        return new GetActivePersonGroupsResponseModel();
    }

    /**
     * Create an instance of {@link GetActivePersonResponse }
     * 
     */
    public GetActivePersonResponse createGetActivePersonResponse() {
        return new GetActivePersonResponse();
    }

    /**
     * Create an instance of {@link GetActivePersonGroups }
     * 
     */
    public GetActivePersonGroups createGetActivePersonGroups() {
        return new GetActivePersonGroups();
    }

    /**
     * Create an instance of {@link GetActivePersonGroupsResponse }
     * 
     */
    public GetActivePersonGroupsResponse createGetActivePersonGroupsResponse() {
        return new GetActivePersonGroupsResponse();
    }

    /**
     * Create an instance of {@link CreatePersonResponseModel }
     * 
     */
    public CreatePersonResponseModel createCreatePersonResponseModel() {
        return new CreatePersonResponseModel();
    }

    /**
     * Create an instance of {@link UpdatePersonRequestModel }
     * 
     */
    public UpdatePersonRequestModel createUpdatePersonRequestModel() {
        return new UpdatePersonRequestModel();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link CreatePersonRequestModel }
     * 
     */
    public CreatePersonRequestModel createCreatePersonRequestModel() {
        return new CreatePersonRequestModel();
    }

    /**
     * Create an instance of {@link DeactivatePersonRequestModel }
     * 
     */
    public DeactivatePersonRequestModel createDeactivatePersonRequestModel() {
        return new DeactivatePersonRequestModel();
    }

    /**
     * Create an instance of {@link CreateTicklerResponse }
     * 
     */
    public CreateTicklerResponse createCreateTicklerResponse() {
        return new CreateTicklerResponse();
    }

    /**
     * Create an instance of {@link GetActiveCallCentersResponse }
     * 
     */
    public GetActiveCallCentersResponse createGetActiveCallCentersResponse() {
        return new GetActiveCallCentersResponse();
    }

    /**
     * Create an instance of {@link GetActivePersonResponseModel }
     * 
     */
    public GetActivePersonResponseModel createGetActivePersonResponseModel() {
        return new GetActivePersonResponseModel();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link DeactivatePersonResponseModel }
     * 
     */
    public DeactivatePersonResponseModel createDeactivatePersonResponseModel() {
        return new DeactivatePersonResponseModel();
    }

    /**
     * Create an instance of {@link DeactivatePerson }
     * 
     */
    public DeactivatePerson createDeactivatePerson() {
        return new DeactivatePerson();
    }

    /**
     * Create an instance of {@link GetActivePerson }
     * 
     */
    public GetActivePerson createGetActivePerson() {
        return new GetActivePerson();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestChannelEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/TTS/TTS/Service/v1", name = "RequestChannelEnum")
    public JAXBElement<RequestChannelEnum> createRequestChannelEnum(RequestChannelEnum value) {
        return new JAXBElement<RequestChannelEnum>(_RequestChannelEnum_QNAME, RequestChannelEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivatePersonResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "DeactivatePersonResponseModel")
    public JAXBElement<DeactivatePersonResponseModel> createDeactivatePersonResponseModel(DeactivatePersonResponseModel value) {
        return new JAXBElement<DeactivatePersonResponseModel>(_DeactivatePersonResponseModel_QNAME, DeactivatePersonResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/technical/Fault", name = "BaseFault")
    public JAXBElement<BaseFault> createBaseFault(BaseFault value) {
        return new JAXBElement<BaseFault>(_BaseFault_QNAME, BaseFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActiveCallCentersRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "GetActiveCallCentersRequestModel")
    public JAXBElement<GetActiveCallCentersRequestModel> createGetActiveCallCentersRequestModel(GetActiveCallCentersRequestModel value) {
        return new JAXBElement<GetActiveCallCentersRequestModel>(_GetActiveCallCentersRequestModel_QNAME, GetActiveCallCentersRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "PersonGroup")
    public JAXBElement<PersonGroup> createPersonGroup(PersonGroup value) {
        return new JAXBElement<PersonGroup>(_PersonGroup_QNAME, PersonGroup.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivePersonResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "GetActivePersonResponseModel")
    public JAXBElement<GetActivePersonResponseModel> createGetActivePersonResponseModel(GetActivePersonResponseModel value) {
        return new JAXBElement<GetActivePersonResponseModel>(_GetActivePersonResponseModel_QNAME, GetActivePersonResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "CreatePersonResponseModel")
    public JAXBElement<CreatePersonResponseModel> createCreatePersonResponseModel(CreatePersonResponseModel value) {
        return new JAXBElement<CreatePersonResponseModel>(_CreatePersonResponseModel_QNAME, CreatePersonResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCallCenter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "ArrayOfCallCenter")
    public JAXBElement<ArrayOfCallCenter> createArrayOfCallCenter(ArrayOfCallCenter value) {
        return new JAXBElement<ArrayOfCallCenter>(_ArrayOfCallCenter_QNAME, ArrayOfCallCenter.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "CreatePersonRequestModel")
    public JAXBElement<CreatePersonRequestModel> createCreatePersonRequestModel(CreatePersonRequestModel value) {
        return new JAXBElement<CreatePersonRequestModel>(_CreatePersonRequestModel_QNAME, CreatePersonRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActiveCallCentersResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "GetActiveCallCentersResponseModel")
    public JAXBElement<GetActiveCallCentersResponseModel> createGetActiveCallCentersResponseModel(GetActiveCallCentersResponseModel value) {
        return new JAXBElement<GetActiveCallCentersResponseModel>(_GetActiveCallCentersResponseModel_QNAME, GetActiveCallCentersResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivePersonRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "GetActivePersonRequestModel")
    public JAXBElement<GetActivePersonRequestModel> createGetActivePersonRequestModel(GetActivePersonRequestModel value) {
        return new JAXBElement<GetActivePersonRequestModel>(_GetActivePersonRequestModel_QNAME, GetActivePersonRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTicklerResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "CreateTicklerResponseModel")
    public JAXBElement<CreateTicklerResponseModel> createCreateTicklerResponseModel(CreateTicklerResponseModel value) {
        return new JAXBElement<CreateTicklerResponseModel>(_CreateTicklerResponseModel_QNAME, CreateTicklerResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "UpdatePersonRequestModel")
    public JAXBElement<UpdatePersonRequestModel> createUpdatePersonRequestModel(UpdatePersonRequestModel value) {
        return new JAXBElement<UpdatePersonRequestModel>(_UpdatePersonRequestModel_QNAME, UpdatePersonRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "Person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallCenter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "CallCenter")
    public JAXBElement<CallCenter> createCallCenter(CallCenter value) {
        return new JAXBElement<CallCenter>(_CallCenter_QNAME, CallCenter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTicklerRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "CreateTicklerRequestModel")
    public JAXBElement<CreateTicklerRequestModel> createCreateTicklerRequestModel(CreateTicklerRequestModel value) {
        return new JAXBElement<CreateTicklerRequestModel>(_CreateTicklerRequestModel_QNAME, CreateTicklerRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivePersonGroupsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "GetActivePersonGroupsRequestModel")
    public JAXBElement<GetActivePersonGroupsRequestModel> createGetActivePersonGroupsRequestModel(GetActivePersonGroupsRequestModel value) {
        return new JAXBElement<GetActivePersonGroupsRequestModel>(_GetActivePersonGroupsRequestModel_QNAME, GetActivePersonGroupsRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "UpdatePersonResponseModel")
    public JAXBElement<UpdatePersonResponseModel> createUpdatePersonResponseModel(UpdatePersonResponseModel value) {
        return new JAXBElement<UpdatePersonResponseModel>(_UpdatePersonResponseModel_QNAME, UpdatePersonResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestPriorityEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/TTS/TTS/Service/v1", name = "RequestPriorityEnum")
    public JAXBElement<RequestPriorityEnum> createRequestPriorityEnum(RequestPriorityEnum value) {
        return new JAXBElement<RequestPriorityEnum>(_RequestPriorityEnum_QNAME, RequestPriorityEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivePersonGroupsResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "GetActivePersonGroupsResponseModel")
    public JAXBElement<GetActivePersonGroupsResponseModel> createGetActivePersonGroupsResponseModel(GetActivePersonGroupsResponseModel value) {
        return new JAXBElement<GetActivePersonGroupsResponseModel>(_GetActivePersonGroupsResponseModel_QNAME, GetActivePersonGroupsResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivatePersonRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "DeactivatePersonRequestModel")
    public JAXBElement<DeactivatePersonRequestModel> createDeactivatePersonRequestModel(DeactivatePersonRequestModel value) {
        return new JAXBElement<DeactivatePersonRequestModel>(_DeactivatePersonRequestModel_QNAME, DeactivatePersonRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPersonGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "ArrayOfPersonGroup")
    public JAXBElement<ArrayOfPersonGroup> createArrayOfPersonGroup(ArrayOfPersonGroup value) {
        return new JAXBElement<ArrayOfPersonGroup>(_ArrayOfPersonGroup_QNAME, ArrayOfPersonGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApproveNotificationEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/TTS/TTS/Service/v1", name = "ApproveNotificationEnum")
    public JAXBElement<ApproveNotificationEnum> createApproveNotificationEnum(ApproveNotificationEnum value) {
        return new JAXBElement<ApproveNotificationEnum>(_ApproveNotificationEnum_QNAME, ApproveNotificationEnum.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "RequestData")
    public JAXBElement<RequestData> createRequestData(RequestData value) {
        return new JAXBElement<RequestData>(_RequestData_QNAME, RequestData.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestFeedBackEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/TTS/TTS/Service/v1", name = "RequestFeedBackEnum")
    public JAXBElement<RequestFeedBackEnum> createRequestFeedBackEnum(RequestFeedBackEnum value) {
        return new JAXBElement<RequestFeedBackEnum>(_RequestFeedBackEnum_QNAME, RequestFeedBackEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivePersonResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetActivePersonResult", scope = GetActivePersonResponse.class)
    public JAXBElement<GetActivePersonResponseModel> createGetActivePersonResponseGetActivePersonResult(GetActivePersonResponseModel value) {
        return new JAXBElement<GetActivePersonResponseModel>(_GetActivePersonResponseGetActivePersonResult_QNAME, GetActivePersonResponseModel.class, GetActivePersonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCallCenter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "CallCenters", scope = GetActiveCallCentersResponseModel.class)
    public JAXBElement<ArrayOfCallCenter> createGetActiveCallCentersResponseModelCallCenters(ArrayOfCallCenter value) {
        return new JAXBElement<ArrayOfCallCenter>(_GetActiveCallCentersResponseModelCallCenters_QNAME, ArrayOfCallCenter.class, GetActiveCallCentersResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivePersonGroupsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = GetActivePersonGroups.class)
    public JAXBElement<GetActivePersonGroupsRequestModel> createGetActivePersonGroupsRequest(GetActivePersonGroupsRequestModel value) {
        return new JAXBElement<GetActivePersonGroupsRequestModel>(_GetActivePersonGroupsRequest_QNAME, GetActivePersonGroupsRequestModel.class, GetActivePersonGroups.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivePersonGroupsResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetActivePersonGroupsResult", scope = GetActivePersonGroupsResponse.class)
    public JAXBElement<GetActivePersonGroupsResponseModel> createGetActivePersonGroupsResponseGetActivePersonGroupsResult(GetActivePersonGroupsResponseModel value) {
        return new JAXBElement<GetActivePersonGroupsResponseModel>(_GetActivePersonGroupsResponseGetActivePersonGroupsResult_QNAME, GetActivePersonGroupsResponseModel.class, GetActivePersonGroupsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "RequestReason", scope = RequestData.class)
    public JAXBElement<String> createRequestDataRequestReason(String value) {
        return new JAXBElement<String>(_RequestDataRequestReason_QNAME, String.class, RequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "Description", scope = RequestData.class)
    public JAXBElement<String> createRequestDataDescription(String value) {
        return new JAXBElement<String>(_RequestDataDescription_QNAME, String.class, RequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "State", scope = RequestData.class)
    public JAXBElement<String> createRequestDataState(String value) {
        return new JAXBElement<String>(_RequestDataState_QNAME, String.class, RequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "Email", scope = RequestData.class)
    public JAXBElement<String> createRequestDataEmail(String value) {
        return new JAXBElement<String>(_RequestDataEmail_QNAME, String.class, RequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "Subject", scope = RequestData.class)
    public JAXBElement<String> createRequestDataSubject(String value) {
        return new JAXBElement<String>(_RequestDataSubject_QNAME, String.class, RequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "SubState", scope = RequestData.class)
    public JAXBElement<String> createRequestDataSubState(String value) {
        return new JAXBElement<String>(_RequestDataSubState_QNAME, String.class, RequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "Mobile", scope = RequestData.class)
    public JAXBElement<String> createRequestDataMobile(String value) {
        return new JAXBElement<String>(_RequestDataMobile_QNAME, String.class, RequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "ContractNo", scope = RequestData.class)
    public JAXBElement<String> createRequestDataContractNo(String value) {
        return new JAXBElement<String>(_RequestDataContractNo_QNAME, String.class, RequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "CustomerName", scope = RequestData.class)
    public JAXBElement<String> createRequestDataCustomerName(String value) {
        return new JAXBElement<String>(_RequestDataCustomerName_QNAME, String.class, RequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "RequestType", scope = RequestData.class)
    public JAXBElement<String> createRequestDataRequestType(String value) {
        return new JAXBElement<String>(_RequestDataRequestType_QNAME, String.class, RequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "CallCenter", scope = RequestData.class)
    public JAXBElement<String> createRequestDataCallCenter(String value) {
        return new JAXBElement<String>(_CallCenter_QNAME, String.class, RequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = UpdatePerson.class)
    public JAXBElement<UpdatePersonRequestModel> createUpdatePersonRequest(UpdatePersonRequestModel value) {
        return new JAXBElement<UpdatePersonRequestModel>(_GetActivePersonGroupsRequest_QNAME, UpdatePersonRequestModel.class, UpdatePerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = CreatePerson.class)
    public JAXBElement<CreatePersonRequestModel> createCreatePersonRequest(CreatePersonRequestModel value) {
        return new JAXBElement<CreatePersonRequestModel>(_GetActivePersonGroupsRequest_QNAME, CreatePersonRequestModel.class, CreatePerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UpdatePersonResult", scope = UpdatePersonResponse.class)
    public JAXBElement<UpdatePersonResponseModel> createUpdatePersonResponseUpdatePersonResult(UpdatePersonResponseModel value) {
        return new JAXBElement<UpdatePersonResponseModel>(_UpdatePersonResponseUpdatePersonResult_QNAME, UpdatePersonResponseModel.class, UpdatePersonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "Name", scope = CallCenter.class)
    public JAXBElement<String> createCallCenterName(String value) {
        return new JAXBElement<String>(_CallCenterName_QNAME, String.class, CallCenter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CreatePersonResult", scope = CreatePersonResponse.class)
    public JAXBElement<CreatePersonResponseModel> createCreatePersonResponseCreatePersonResult(CreatePersonResponseModel value) {
        return new JAXBElement<CreatePersonResponseModel>(_CreatePersonResponseCreatePersonResult_QNAME, CreatePersonResponseModel.class, CreatePersonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTicklerResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CreateTicklerResult", scope = CreateTicklerResponse.class)
    public JAXBElement<CreateTicklerResponseModel> createCreateTicklerResponseCreateTicklerResult(CreateTicklerResponseModel value) {
        return new JAXBElement<CreateTicklerResponseModel>(_CreateTicklerResponseCreateTicklerResult_QNAME, CreateTicklerResponseModel.class, CreateTicklerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActiveCallCentersResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetActiveCallCentersResult", scope = GetActiveCallCentersResponse.class)
    public JAXBElement<GetActiveCallCentersResponseModel> createGetActiveCallCentersResponseGetActiveCallCentersResult(GetActiveCallCentersResponseModel value) {
        return new JAXBElement<GetActiveCallCentersResponseModel>(_GetActiveCallCentersResponseGetActiveCallCentersResult_QNAME, GetActiveCallCentersResponseModel.class, GetActiveCallCentersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "Person", scope = GetActivePersonResponseModel.class)
    public JAXBElement<Person> createGetActivePersonResponseModelPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, GetActivePersonResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivatePersonResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DeactivatePersonResult", scope = DeactivatePersonResponse.class)
    public JAXBElement<DeactivatePersonResponseModel> createDeactivatePersonResponseDeactivatePersonResult(DeactivatePersonResponseModel value) {
        return new JAXBElement<DeactivatePersonResponseModel>(_DeactivatePersonResponseDeactivatePersonResult_QNAME, DeactivatePersonResponseModel.class, DeactivatePersonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "Name", scope = PersonGroup.class)
    public JAXBElement<String> createPersonGroupName(String value) {
        return new JAXBElement<String>(_CallCenterName_QNAME, String.class, PersonGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "Name", scope = Person.class)
    public JAXBElement<String> createPersonName(String value) {
        return new JAXBElement<String>(_CallCenterName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "Email", scope = Person.class)
    public JAXBElement<String> createPersonEmail(String value) {
        return new JAXBElement<String>(_RequestDataEmail_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "UserName", scope = Person.class)
    public JAXBElement<String> createPersonUserName(String value) {
        return new JAXBElement<String>(_PersonUserName_QNAME, String.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPersonGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "PersonGroups", scope = Person.class)
    public JAXBElement<ArrayOfPersonGroup> createPersonPersonGroups(ArrayOfPersonGroup value) {
        return new JAXBElement<ArrayOfPersonGroup>(_PersonPersonGroups_QNAME, ArrayOfPersonGroup.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCallCenter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "CallCenters", scope = Person.class)
    public JAXBElement<ArrayOfCallCenter> createPersonCallCenters(ArrayOfCallCenter value) {
        return new JAXBElement<ArrayOfCallCenter>(_GetActiveCallCentersResponseModelCallCenters_QNAME, ArrayOfCallCenter.class, Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActiveCallCentersRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = GetActiveCallCenters.class)
    public JAXBElement<GetActiveCallCentersRequestModel> createGetActiveCallCentersRequest(GetActiveCallCentersRequestModel value) {
        return new JAXBElement<GetActiveCallCentersRequestModel>(_GetActivePersonGroupsRequest_QNAME, GetActiveCallCentersRequestModel.class, GetActiveCallCenters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivatePersonRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = DeactivatePerson.class)
    public JAXBElement<DeactivatePersonRequestModel> createDeactivatePersonRequest(DeactivatePersonRequestModel value) {
        return new JAXBElement<DeactivatePersonRequestModel>(_GetActivePersonGroupsRequest_QNAME, DeactivatePersonRequestModel.class, DeactivatePerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivePersonRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = GetActivePerson.class)
    public JAXBElement<GetActivePersonRequestModel> createGetActivePersonRequest(GetActivePersonRequestModel value) {
        return new JAXBElement<GetActivePersonRequestModel>(_GetActivePersonGroupsRequest_QNAME, GetActivePersonRequestModel.class, GetActivePerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTicklerRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = CreateTickler.class)
    public JAXBElement<CreateTicklerRequestModel> createCreateTicklerRequest(CreateTicklerRequestModel value) {
        return new JAXBElement<CreateTicklerRequestModel>(_GetActivePersonGroupsRequest_QNAME, CreateTicklerRequestModel.class, CreateTickler.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPersonGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", name = "PersonGroups", scope = GetActivePersonGroupsResponseModel.class)
    public JAXBElement<ArrayOfPersonGroup> createGetActivePersonGroupsResponseModelPersonGroups(ArrayOfPersonGroup value) {
        return new JAXBElement<ArrayOfPersonGroup>(_PersonPersonGroups_QNAME, ArrayOfPersonGroup.class, GetActivePersonGroupsResponseModel.class, value);
    }

}
