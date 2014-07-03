
package org.milleni.dunning.ws.client.crm;

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
 * generated in the org.milleni.dunning.ws.client.crm package. 
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

    private final static QName _AssignNumberPoolItemRequestModelContractCode_QNAME = new QName("/CustomerInfo/Service/v1", "ContractCode");
    private final static QName _AssignNumberPoolItemRequestModelNumber_QNAME = new QName("/CustomerInfo/Service/v1", "Number");
    private final static QName _AssignNumberPoolItemRequestModelUsername_QNAME = new QName("/CustomerInfo/Service/v1", "Username");
    private final static QName _AssignNumberPoolItemRequestModelIdentificationNumber_QNAME = new QName("/CustomerInfo/Service/v1", "IdentificationNumber");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _QueryStockItemOuidResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "QueryStockItemOuidResponseModel");
    private final static QName _UnavailableNumberPoolItemRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "UnavailableNumberPoolItemRequestModel");
    private final static QName _CRMProvisionResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "CRMProvisionResponseModel");
    private final static QName _ArrayOfNumberPoolItem_QNAME = new QName("http://milleni.com/Crm", "ArrayOfNumberPoolItem");
    private final static QName _RemoveNumbersFromContractResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "RemoveNumbersFromContractResponseModel");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _ContractedNumbersInfo_QNAME = new QName("http://milleni.com/Crm", "ContractedNumbersInfo");
    private final static QName _ReleaseNumberPoolItemRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "ReleaseNumberPoolItemRequestModel");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _RemoveDopingBoxProductRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "RemoveDopingBoxProductRequestModel");
    private final static QName _DeactivateAccountResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "DeactivateAccountResponseModel");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _SuspendCustomerContractResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "SuspendCustomerContractResponseModel");
    private final static QName _CrmAddress_QNAME = new QName("http://milleni.com/Crm", "CrmAddress");
    private final static QName _ArrayOfCrmAddress_QNAME = new QName("http://milleni.com/Crm", "ArrayOfCrmAddress");
    private final static QName _CrmContract_QNAME = new QName("http://milleni.com/Crm", "CrmContract");
    private final static QName _ActivateAccountResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "ActivateAccountResponseModel");
    private final static QName _ProcessChurnContractsResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "ProcessChurnContractsResponseModel");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _ProcessStaticIpRequestsResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "ProcessStaticIpRequestsResponseModel");
    private final static QName _ProcessSuspendedContractsRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "ProcessSuspendedContractsRequestModel");
    private final static QName _CrmContact_QNAME = new QName("http://milleni.com/Crm", "CrmContact");
    private final static QName _GetPartnerRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "GetPartnerRequestModel");
    private final static QName _SystemFault_QNAME = new QName("http://milleni.com/technical/Fault", "SystemFault");
    private final static QName _CrmReturnAccount_QNAME = new QName("http://milleni.com/Crm", "CrmReturnAccount");
    private final static QName _ArrayOfCrmAccount_QNAME = new QName("http://milleni.com/Crm", "ArrayOfCrmAccount");
    private final static QName _CrmPhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", "CrmPhone");
    private final static QName _GetPartnerResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "GetPartnerResponseModel");
    private final static QName _GetAccountPartyCodeResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "GetAccountPartyCodeResponseModel");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ArrayOfContractedNumber_QNAME = new QName("http://milleni.com/Crm", "ArrayOfContractedNumber");
    private final static QName _MigrateContractResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "MigrateContractResponseModel");
    private final static QName _StockItem_QNAME = new QName("http://milleni.com/Crm", "StockItem");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _AddNumbersToContractResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "AddNumbersToContractResponseModel");
    private final static QName _QueryStockItemResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "QueryStockItemResponseModel");
    private final static QName _QueryNumberPoolItemResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "QueryNumberPoolItemResponseModel");
    private final static QName _AssignStockItemRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "AssignStockItemRequestModel");
    private final static QName _CrmAccount_QNAME = new QName("http://milleni.com/Crm", "CrmAccount");
    private final static QName _ProcessChurnContractsRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "ProcessChurnContractsRequestModel");
    private final static QName _RemoveDopingBoxProductResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "RemoveDopingBoxProductResponseModel");
    private final static QName _User_QNAME = new QName("http://milleni.com/Crm", "User");
    private final static QName _GetCustomerResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "GetCustomerResponseModel");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _MigrateContractRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "MigrateContractRequestModel");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _UserRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "UserRequestModel");
    private final static QName _QueryNumberPoolItemRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "QueryNumberPoolItemRequestModel");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ActivateAccountRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "ActivateAccountRequestModel");
    private final static QName _CrmDocument_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", "CrmDocument");
    private final static QName _DeactivateCustomerContractRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "DeactivateCustomerContractRequestModel");
    private final static QName _BlockNumberPoolItemRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "BlockNumberPoolItemRequestModel");
    private final static QName _Customer_QNAME = new QName("http://milleni.com/Crm", "Customer");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _ReserveStockItemRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "ReserveStockItemRequestModel");
    private final static QName _ArrayOfCrmProduct_QNAME = new QName("http://milleni.com/Crm", "ArrayOfCrmProduct");
    private final static QName _BaseFault_QNAME = new QName("http://milleni.com/technical/Fault", "BaseFault");
    private final static QName _ReserveNumberPoolItemRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "ReserveNumberPoolItemRequestModel");
    private final static QName _BusinessFault_QNAME = new QName("http://milleni.com/technical/Fault", "BusinessFault");
    private final static QName _AddNumbersToContractRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "AddNumbersToContractRequestModel");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _RemoveNumbersFromContractRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "RemoveNumbersFromContractRequestModel");
    private final static QName _ReleaseStockItemRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "ReleaseStockItemRequestModel");
    private final static QName _QueryStockItemRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "QueryStockItemRequestModel");
    private final static QName _CRMProvisionRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "CRMProvisionRequestModel");
    private final static QName _NumberPoolItem_QNAME = new QName("http://milleni.com/Crm", "NumberPoolItem");
    private final static QName _ArrayOfCrmPhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", "ArrayOfCrmPhone");
    private final static QName _ProcessStaticIpRequestsRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "ProcessStaticIpRequestsRequestModel");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _DeactivateCustomerContractResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "DeactivateCustomerContractResponseModel");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QueryCustomerRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "QueryCustomerRequestModel");
    private final static QName _GetAccountPartyCodeRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "GetAccountPartyCodeRequestModel");
    private final static QName _ArrayOfCrmContact_QNAME = new QName("http://milleni.com/Crm", "ArrayOfCrmContact");
    private final static QName _ArrayOfCrmEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", "ArrayOfCrmEmail");
    private final static QName _MigrateAccountRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "MigrateAccountRequestModel");
    private final static QName _SuspendAccountResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "SuspendAccountResponseModel");
    private final static QName _SexEnum_QNAME = new QName("http://milleni.com/Common/Customer", "SexEnum");
    private final static QName _CrmEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", "CrmEmail");
    private final static QName _ActivateCustomerContractRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "ActivateCustomerContractRequestModel");
    private final static QName _ArrayOfCrmContract_QNAME = new QName("http://milleni.com/Crm", "ArrayOfCrmContract");
    private final static QName _MigratePartyResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "MigratePartyResponseModel");
    private final static QName _Partner_QNAME = new QName("http://milleni.com/Crm", "Partner");
    private final static QName _GetCustomerRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "GetCustomerRequestModel");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _SuspendAccountRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "SuspendAccountRequestModel");
    private final static QName _CustomerTypeEnum_QNAME = new QName("http://milleni.com/Common/Customer", "CustomerTypeEnum");
    private final static QName _CrmProduct_QNAME = new QName("http://milleni.com/Crm", "CrmProduct");
    private final static QName _CrmNumber_QNAME = new QName("http://milleni.com/Crm", "CrmNumber");
    private final static QName _GetNumbersFromPoolRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "GetNumbersFromPoolRequestModel");
    private final static QName _QueryStockItemOuidRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "QueryStockItemOuidRequestModel");
    private final static QName _MigrateAccountResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "MigrateAccountResponseModel");
    private final static QName _ProcessSuspendedContractsResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "ProcessSuspendedContractsResponseModel");
    private final static QName _UserResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "UserResponseModel");
    private final static QName _ArrayOfCrmNumber_QNAME = new QName("http://milleni.com/Crm", "ArrayOfCrmNumber");
    private final static QName _ContractedNumber_QNAME = new QName("http://milleni.com/Crm", "ContractedNumber");
    private final static QName _MigratePartyRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "MigratePartyRequestModel");
    private final static QName _ChangeNumberPoolItemStatusResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "ChangeNumberPoolItemStatusResponseModel");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ArrayOfCrmDocument_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", "ArrayOfCrmDocument");
    private final static QName _QueryCustomerResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "QueryCustomerResponseModel");
    private final static QName _DeactivateAccountRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "DeactivateAccountRequestModel");
    private final static QName _AssignNumberPoolItemRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "AssignNumberPoolItemRequestModel");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _SuspendCustomerContractRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "SuspendCustomerContractRequestModel");
    private final static QName _GetNumbersFromPoolResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "GetNumbersFromPoolResponseModel");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ActivateCustomerContractResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "ActivateCustomerContractResponseModel");
    private final static QName _ChangeStockItemStatusResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "ChangeStockItemStatusResponseModel");
    private final static QName _DeleteUserResponseDeleteUserResult_QNAME = new QName("/CustomerInfo/Service/v1", "DeleteUserResult");
    private final static QName _SuspendCustomerContractResponseSuspendCustomerContractResult_QNAME = new QName("/CustomerInfo/Service/v1", "SuspendCustomerContractResult");
    private final static QName _SuspendCustomerContractRequest_QNAME = new QName("/CustomerInfo/Service/v1", "request");
    private final static QName _CrmContactWorkPhone_QNAME = new QName("http://milleni.com/Crm", "WorkPhone");
    private final static QName _CrmContactEmails_QNAME = new QName("http://milleni.com/Crm", "Emails");
    private final static QName _CrmContactPhones_QNAME = new QName("http://milleni.com/Crm", "Phones");
    private final static QName _CrmContactName_QNAME = new QName("http://milleni.com/Crm", "Name");
    private final static QName _CrmContactAdddresses_QNAME = new QName("http://milleni.com/Crm", "Adddresses");
    private final static QName _CrmContactEmail_QNAME = new QName("http://milleni.com/Crm", "Email");
    private final static QName _CrmContactSurname_QNAME = new QName("http://milleni.com/Crm", "Surname");
    private final static QName _CrmContactMobilePhone_QNAME = new QName("http://milleni.com/Crm", "MobilePhone");
    private final static QName _QueryCustomerResponseQueryCustomerResult_QNAME = new QName("/CustomerInfo/Service/v1", "QueryCustomerResult");
    private final static QName _QueryNumberPoolItemResponseQueryNumberPoolItemResult_QNAME = new QName("/CustomerInfo/Service/v1", "QueryNumberPoolItemResult");
    private final static QName _GetAccountPartyCodeResponseGetAccountPartyCodeResult_QNAME = new QName("/CustomerInfo/Service/v1", "GetAccountPartyCodeResult");
    private final static QName _QueryCustomerResponseModelCustomer_QNAME = new QName("/CustomerInfo/Service/v1", "Customer");
    private final static QName _CrmReturnAccountFatherName_QNAME = new QName("http://milleni.com/Crm", "FatherName");
    private final static QName _CrmReturnAccountIban_QNAME = new QName("http://milleni.com/Crm", "Iban");
    private final static QName _CrmAddressNeighborhoodCode_QNAME = new QName("http://milleni.com/Crm", "NeighborhoodCode");
    private final static QName _CrmAddressCityCode_QNAME = new QName("http://milleni.com/Crm", "CityCode");
    private final static QName _CrmAddressVillage_QNAME = new QName("http://milleni.com/Crm", "Village");
    private final static QName _CrmAddressIndependentParts_QNAME = new QName("http://milleni.com/Crm", "IndependentParts");
    private final static QName _CrmAddressCity_QNAME = new QName("http://milleni.com/Crm", "City");
    private final static QName _CrmAddressCounty_QNAME = new QName("http://milleni.com/Crm", "County");
    private final static QName _CrmAddressNeighborhood_QNAME = new QName("http://milleni.com/Crm", "Neighborhood");
    private final static QName _CrmAddressVillageCode_QNAME = new QName("http://milleni.com/Crm", "VillageCode");
    private final static QName _CrmAddressCountyCode_QNAME = new QName("http://milleni.com/Crm", "CountyCode");
    private final static QName _CrmAddressDistrict_QNAME = new QName("http://milleni.com/Crm", "District");
    private final static QName _CrmAddressBuildingCode_QNAME = new QName("http://milleni.com/Crm", "BuildingCode");
    private final static QName _CrmAddressBuildingName_QNAME = new QName("http://milleni.com/Crm", "BuildingName");
    private final static QName _CrmAddressBuildingNumber_QNAME = new QName("http://milleni.com/Crm", "BuildingNumber");
    private final static QName _CrmAddressIndependentPartsCode_QNAME = new QName("http://milleni.com/Crm", "IndependentPartsCode");
    private final static QName _CrmAddressDistrictCode_QNAME = new QName("http://milleni.com/Crm", "DistrictCode");
    private final static QName _QueryStockItemOuidResponseQueryStockItemOuidResult_QNAME = new QName("/CustomerInfo/Service/v1", "QueryStockItemOuidResult");
    private final static QName _SuspendAccountResponseSuspendAccountResult_QNAME = new QName("/CustomerInfo/Service/v1", "SuspendAccountResult");
    private final static QName _ReleaseStockItemResponseReleaseStockItemResult_QNAME = new QName("/CustomerInfo/Service/v1", "ReleaseStockItemResult");
    private final static QName _UserConfirmPassword_QNAME = new QName("http://milleni.com/Crm", "ConfirmPassword");
    private final static QName _UserPassword_QNAME = new QName("http://milleni.com/Crm", "Password");
    private final static QName _UserFullName_QNAME = new QName("http://milleni.com/Crm", "FullName");
    private final static QName _UserUserName_QNAME = new QName("http://milleni.com/Crm", "UserName");
    private final static QName _AssignStockItemResponseAssignStockItemResult_QNAME = new QName("/CustomerInfo/Service/v1", "AssignStockItemResult");
    private final static QName _MigratePartyResponseMigratePartyResult_QNAME = new QName("/CustomerInfo/Service/v1", "MigratePartyResult");
    private final static QName _GetNumbersFromPoolResponseModelNumbers_QNAME = new QName("/CustomerInfo/Service/v1", "Numbers");
    private final static QName _GetPartnerResponseGetPartnerResult_QNAME = new QName("/CustomerInfo/Service/v1", "GetPartnerResult");
    private final static QName _DeactivateCustomerContractResponseDeactivateCustomerContractResult_QNAME = new QName("/CustomerInfo/Service/v1", "DeactivateCustomerContractResult");
    private final static QName _ReserveStockItemResponseReserveStockItemResult_QNAME = new QName("/CustomerInfo/Service/v1", "ReserveStockItemResult");
    private final static QName _CrmContractProducts_QNAME = new QName("http://milleni.com/Crm", "Products");
    private final static QName _CrmContractMigrateInfo_QNAME = new QName("http://milleni.com/Crm", "MigrateInfo");
    private final static QName _CrmContractStatusReason_QNAME = new QName("http://milleni.com/Crm", "StatusReason");
    private final static QName _CrmContractContractCode_QNAME = new QName("http://milleni.com/Crm", "ContractCode");
    private final static QName _CrmContractBillingContractNumber_QNAME = new QName("http://milleni.com/Crm", "BillingContractNumber");
    private final static QName _GetPartnerResponseModelPartner_QNAME = new QName("/CustomerInfo/Service/v1", "Partner");
    private final static QName _GetNumbersFromPoolRequestModelRelatedIdentification_QNAME = new QName("/CustomerInfo/Service/v1", "RelatedIdentification");
    private final static QName _DeactivateCustomerContractRequestModelStatus_QNAME = new QName("/CustomerInfo/Service/v1", "Status");
    private final static QName _DeactivateCustomerContractRequestModelStatusReasonDef_QNAME = new QName("/CustomerInfo/Service/v1", "StatusReasonDef");
    private final static QName _DeactivateCustomerContractRequestModelApplication_QNAME = new QName("/CustomerInfo/Service/v1", "Application");
    private final static QName _UserRequestModelUser_QNAME = new QName("/CustomerInfo/Service/v1", "User");
    private final static QName _MigratePartyResponseModelCode_QNAME = new QName("/CustomerInfo/Service/v1", "Code");
    private final static QName _AssignStockItemRequestModelSerialNumber_QNAME = new QName("/CustomerInfo/Service/v1", "SerialNumber");
    private final static QName _QueryNumberPoolItemResponseModelNumberPoolItem_QNAME = new QName("/CustomerInfo/Service/v1", "NumberPoolItem");
    private final static QName _CRMProvisionRequestModelOrderRequestCode_QNAME = new QName("/CustomerInfo/Service/v1", "OrderRequestCode");
    private final static QName _NumberPoolItemCustomerType_QNAME = new QName("http://milleni.com/Crm", "CustomerType");
    private final static QName _NumberPoolItemNumber_QNAME = new QName("http://milleni.com/Crm", "Number");
    private final static QName _AssignNumberPoolItemResponseAssignNumberPoolItemResult_QNAME = new QName("/CustomerInfo/Service/v1", "AssignNumberPoolItemResult");
    private final static QName _CrmDocumentUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", "Url");
    private final static QName _CrmDocumentName_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", "Name");
    private final static QName _CrmDocumentCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", "Code");
    private final static QName _UnavailableNumberPoolItemResponseUnavailableNumberPoolItemResult_QNAME = new QName("/CustomerInfo/Service/v1", "UnavailableNumberPoolItemResult");
    private final static QName _UpdateUserResponseUpdateUserResult_QNAME = new QName("/CustomerInfo/Service/v1", "UpdateUserResult");
    private final static QName _RemoveDopingBoxProductResponseRemoveDopingBoxProductResult_QNAME = new QName("/CustomerInfo/Service/v1", "RemoveDopingBoxProductResult");
    private final static QName _AddNumbersToContractRequestModelNumbersInfo_QNAME = new QName("/CustomerInfo/Service/v1", "NumbersInfo");
    private final static QName _ReleaseNumberPoolItemResponseReleaseNumberPoolItemResult_QNAME = new QName("/CustomerInfo/Service/v1", "ReleaseNumberPoolItemResult");
    private final static QName _AddUserResponseAddUserResult_QNAME = new QName("/CustomerInfo/Service/v1", "AddUserResult");
    private final static QName _MigrateAccountResponseMigrateAccountResult_QNAME = new QName("/CustomerInfo/Service/v1", "MigrateAccountResult");
    private final static QName _BaseFaultSIID_QNAME = new QName("http://milleni.com/technical/Fault", "SIID");
    private final static QName _BaseFaultActor_QNAME = new QName("http://milleni.com/technical/Fault", "Actor");
    private final static QName _BaseFaultDetail_QNAME = new QName("http://milleni.com/technical/Fault", "Detail");
    private final static QName _BaseFaultDescription_QNAME = new QName("http://milleni.com/technical/Fault", "Description");
    private final static QName _BaseFaultSource_QNAME = new QName("http://milleni.com/technical/Fault", "Source");
    private final static QName _BaseFaultParameters_QNAME = new QName("http://milleni.com/technical/Fault", "Parameters");
    private final static QName _ReserveNumberPoolItemRequestModelOrderCode_QNAME = new QName("/CustomerInfo/Service/v1", "OrderCode");
    private final static QName _CrmAccountReturnAccount_QNAME = new QName("http://milleni.com/Crm", "ReturnAccount");
    private final static QName _CrmAccountBillingCustomerNumber_QNAME = new QName("http://milleni.com/Crm", "BillingCustomerNumber");
    private final static QName _CrmAccountContracts_QNAME = new QName("http://milleni.com/Crm", "Contracts");
    private final static QName _CrmAccountBillingAddress_QNAME = new QName("http://milleni.com/Crm", "BillingAddress");
    private final static QName _CrmAccountAccountName_QNAME = new QName("http://milleni.com/Crm", "AccountName");
    private final static QName _CrmAccountBBKNumber_QNAME = new QName("http://milleni.com/Crm", "BBKNumber");
    private final static QName _CrmAccountAccountCode_QNAME = new QName("http://milleni.com/Crm", "AccountCode");
    private final static QName _CrmAccountTTCustomerNo_QNAME = new QName("http://milleni.com/Crm", "TTCustomerNo");
    private final static QName _CrmAccountSoftInvoiceEmail_QNAME = new QName("http://milleni.com/Crm", "SoftInvoiceEmail");
    private final static QName _BlockNumberPoolItemResponseBlockNumberPoolItemResult_QNAME = new QName("/CustomerInfo/Service/v1", "BlockNumberPoolItemResult");
    private final static QName _CrmProductValidFrom_QNAME = new QName("http://milleni.com/Crm", "ValidFrom");
    private final static QName _CrmProductCatalogId_QNAME = new QName("http://milleni.com/Crm", "CatalogId");
    private final static QName _CrmProductDescription_QNAME = new QName("http://milleni.com/Crm", "Description");
    private final static QName _CrmProductInternetProfile_QNAME = new QName("http://milleni.com/Crm", "InternetProfile");
    private final static QName _CrmProductXdslNumber_QNAME = new QName("http://milleni.com/Crm", "XdslNumber");
    private final static QName _CrmProductCatalogName_QNAME = new QName("http://milleni.com/Crm", "CatalogName");
    private final static QName _CrmProductXdslPassword_QNAME = new QName("http://milleni.com/Crm", "XdslPassword");
    private final static QName _CrmProductPcOfferId_QNAME = new QName("http://milleni.com/Crm", "PcOfferId");
    private final static QName _CrmProductCode_QNAME = new QName("http://milleni.com/Crm", "Code");
    private final static QName _CrmProductMacAddress_QNAME = new QName("http://milleni.com/Crm", "MacAddress");
    private final static QName _CrmProductSerialNumber_QNAME = new QName("http://milleni.com/Crm", "SerialNumber");
    private final static QName _CrmProductBillingProductId_QNAME = new QName("http://milleni.com/Crm", "BillingProductId");
    private final static QName _CrmProductXdslUsername_QNAME = new QName("http://milleni.com/Crm", "XdslUsername");
    private final static QName _CrmProductSubModelName_QNAME = new QName("http://milleni.com/Crm", "SubModelName");
    private final static QName _CrmProductProductType_QNAME = new QName("http://milleni.com/Crm", "ProductType");
    private final static QName _CrmProductModelName_QNAME = new QName("http://milleni.com/Crm", "ModelName");
    private final static QName _CrmProductTTCustomerId_QNAME = new QName("http://milleni.com/Crm", "TTCustomerId");
    private final static QName _CrmProductStaticIpProductId_QNAME = new QName("http://milleni.com/Crm", "StaticIpProductId");
    private final static QName _CrmProductNumbers_QNAME = new QName("http://milleni.com/Crm", "Numbers");
    private final static QName _CrmProductValidTo_QNAME = new QName("http://milleni.com/Crm", "ValidTo");
    private final static QName _CrmProductDocuments_QNAME = new QName("http://milleni.com/Crm", "Documents");
    private final static QName _CrmProductStaticIp_QNAME = new QName("http://milleni.com/Crm", "StaticIp");
    private final static QName _CrmProductBrandName_QNAME = new QName("http://milleni.com/Crm", "BrandName");
    private final static QName _StockItemMACAddress_QNAME = new QName("http://milleni.com/Crm", "MACAddress");
    private final static QName _StockItemStockName_QNAME = new QName("http://milleni.com/Crm", "StockName");
    private final static QName _StockItemOuid_QNAME = new QName("http://milleni.com/Crm", "Ouid");
    private final static QName _QueryStockItemResponseQueryStockItemResult_QNAME = new QName("/CustomerInfo/Service/v1", "QueryStockItemResult");
    private final static QName _RemoveDopingBoxProductRequestModelExternalId_QNAME = new QName("/CustomerInfo/Service/v1", "ExternalId");
    private final static QName _ActivateAccountResponseActivateAccountResult_QNAME = new QName("/CustomerInfo/Service/v1", "ActivateAccountResult");
    private final static QName _DeactivateAccountResponseDeactivateAccountResult_QNAME = new QName("/CustomerInfo/Service/v1", "DeactivateAccountResult");
    private final static QName _CustomerWorkingArea_QNAME = new QName("http://milleni.com/Crm", "WorkingArea");
    private final static QName _CustomerAccounts_QNAME = new QName("http://milleni.com/Crm", "Accounts");
    private final static QName _CustomerSector_QNAME = new QName("http://milleni.com/Crm", "Sector");
    private final static QName _CustomerRegistrationNumber_QNAME = new QName("http://milleni.com/Crm", "RegistrationNumber");
    private final static QName _CustomerTckn_QNAME = new QName("http://milleni.com/Crm", "Tckn");
    private final static QName _CustomerNationality_QNAME = new QName("http://milleni.com/Crm", "Nationality");
    private final static QName _CustomerShortName_QNAME = new QName("http://milleni.com/Crm", "ShortName");
    private final static QName _CustomerSubSector_QNAME = new QName("http://milleni.com/Crm", "SubSector");
    private final static QName _CustomerContacts_QNAME = new QName("http://milleni.com/Crm", "Contacts");
    private final static QName _CustomerMotherMaidenName_QNAME = new QName("http://milleni.com/Crm", "MotherMaidenName");
    private final static QName _GetNumbersFromPoolResponseGetNumbersFromPoolResult_QNAME = new QName("/CustomerInfo/Service/v1", "GetNumbersFromPoolResult");
    private final static QName _ReserveNumberPoolItemResponseReserveNumberPoolItemResult_QNAME = new QName("/CustomerInfo/Service/v1", "ReserveNumberPoolItemResult");
    private final static QName _QueryStockItemOuidResponseModelOuid_QNAME = new QName("/CustomerInfo/Service/v1", "Ouid");
    private final static QName _QueryStockItemOuidResponseModelStockItem_QNAME = new QName("/CustomerInfo/Service/v1", "StockItem");
    private final static QName _SuspendAccountRequestModelBillingCustomerId_QNAME = new QName("/CustomerInfo/Service/v1", "BillingCustomerId");
    private final static QName _ProcessStaticIpRequestsResponseProcessStaticIpRequestsResult_QNAME = new QName("/CustomerInfo/Service/v1", "ProcessStaticIpRequestsResult");
    private final static QName _GetCustomerResponseGetCustomerResult_QNAME = new QName("/CustomerInfo/Service/v1", "GetCustomerResult");
    private final static QName _ContractedNumberNumberType_QNAME = new QName("http://milleni.com/Crm", "NumberType");
    private final static QName _GetAccountPartyCodeResponseModelPartyCode_QNAME = new QName("/CustomerInfo/Service/v1", "PartyCode");
    private final static QName _GetAccountPartyCodeResponseModelErrorMessage_QNAME = new QName("/CustomerInfo/Service/v1", "ErrorMessage");
    private final static QName _ActivateCustomerContractResponseActivateCustomerContractResult_QNAME = new QName("/CustomerInfo/Service/v1", "ActivateCustomerContractResult");
    private final static QName _ProcessSuspendedContractsResponseProcessSuspendedContractsResult_QNAME = new QName("/CustomerInfo/Service/v1", "ProcessSuspendedContractsResult");
    private final static QName _ProcessChurnContractsResponseProcessChurnContractsResult_QNAME = new QName("/CustomerInfo/Service/v1", "ProcessChurnContractsResult");
    private final static QName _GetCustomerByCustomerIdResponseGetCustomerByCustomerIdResult_QNAME = new QName("/CustomerInfo/Service/v1", "GetCustomerByCustomerIdResult");
    private final static QName _MigrateContractResponseMigrateContractResult_QNAME = new QName("/CustomerInfo/Service/v1", "MigrateContractResult");
    private final static QName _QueryCustomerRequestModelXdslNumber_QNAME = new QName("/CustomerInfo/Service/v1", "XdslNumber");
    private final static QName _QueryCustomerRequestModelCustomerOid_QNAME = new QName("/CustomerInfo/Service/v1", "CustomerOid");
    private final static QName _QueryCustomerRequestModelTelephoneNumber_QNAME = new QName("/CustomerInfo/Service/v1", "TelephoneNumber");
    private final static QName _QueryCustomerRequestModelTckn_QNAME = new QName("/CustomerInfo/Service/v1", "Tckn");
    private final static QName _QueryCustomerRequestModelMobilePhone_QNAME = new QName("/CustomerInfo/Service/v1", "MobilePhone");
    private final static QName _QueryCustomerRequestModelVkn_QNAME = new QName("/CustomerInfo/Service/v1", "Vkn");
    private final static QName _RemoveNumbersFromContractResponseRemoveNumbersFromContractResult_QNAME = new QName("/CustomerInfo/Service/v1", "RemoveNumbersFromContractResult");
    private final static QName _AddNumbersToContractResponseAddNumbersToContractResult_QNAME = new QName("/CustomerInfo/Service/v1", "AddNumbersToContractResult");
    private final static QName _ContractedNumbersInfoBillingContractId_QNAME = new QName("http://milleni.com/Crm", "BillingContractId");
    private final static QName _ProvisionOrderToCRMResponseProvisionOrderToCRMResult_QNAME = new QName("/CustomerInfo/Service/v1", "ProvisionOrderToCRMResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.milleni.dunning.ws.client.crm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AssignNumberPoolItemRequestModel }
     * 
     */
    public AssignNumberPoolItemRequestModel createAssignNumberPoolItemRequestModel() {
        return new AssignNumberPoolItemRequestModel();
    }

    /**
     * Create an instance of {@link ArrayOfContractedNumber }
     * 
     */
    public ArrayOfContractedNumber createArrayOfContractedNumber() {
        return new ArrayOfContractedNumber();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link SuspendCustomerContractResponse }
     * 
     */
    public SuspendCustomerContractResponse createSuspendCustomerContractResponse() {
        return new SuspendCustomerContractResponse();
    }

    /**
     * Create an instance of {@link ReleaseNumberPoolItemRequestModel }
     * 
     */
    public ReleaseNumberPoolItemRequestModel createReleaseNumberPoolItemRequestModel() {
        return new ReleaseNumberPoolItemRequestModel();
    }

    /**
     * Create an instance of {@link CrmContact }
     * 
     */
    public CrmContact createCrmContact() {
        return new CrmContact();
    }

    /**
     * Create an instance of {@link SuspendCustomerContract }
     * 
     */
    public SuspendCustomerContract createSuspendCustomerContract() {
        return new SuspendCustomerContract();
    }

    /**
     * Create an instance of {@link QueryCustomer }
     * 
     */
    public QueryCustomer createQueryCustomer() {
        return new QueryCustomer();
    }

    /**
     * Create an instance of {@link ProcessSuspendedContractsResponseModel }
     * 
     */
    public ProcessSuspendedContractsResponseModel createProcessSuspendedContractsResponseModel() {
        return new ProcessSuspendedContractsResponseModel();
    }

    /**
     * Create an instance of {@link QueryCustomerResponse }
     * 
     */
    public QueryCustomerResponse createQueryCustomerResponse() {
        return new QueryCustomerResponse();
    }

    /**
     * Create an instance of {@link MigrateAccountRequestModel }
     * 
     */
    public MigrateAccountRequestModel createMigrateAccountRequestModel() {
        return new MigrateAccountRequestModel();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ReleaseStockItem }
     * 
     */
    public ReleaseStockItem createReleaseStockItem() {
        return new ReleaseStockItem();
    }

    /**
     * Create an instance of {@link QueryNumberPoolItemResponse }
     * 
     */
    public QueryNumberPoolItemResponse createQueryNumberPoolItemResponse() {
        return new QueryNumberPoolItemResponse();
    }

    /**
     * Create an instance of {@link GetAccountPartyCodeResponse }
     * 
     */
    public GetAccountPartyCodeResponse createGetAccountPartyCodeResponse() {
        return new GetAccountPartyCodeResponse();
    }

    /**
     * Create an instance of {@link ActivateAccount }
     * 
     */
    public ActivateAccount createActivateAccount() {
        return new ActivateAccount();
    }

    /**
     * Create an instance of {@link QueryCustomerResponseModel }
     * 
     */
    public QueryCustomerResponseModel createQueryCustomerResponseModel() {
        return new QueryCustomerResponseModel();
    }

    /**
     * Create an instance of {@link CrmReturnAccount }
     * 
     */
    public CrmReturnAccount createCrmReturnAccount() {
        return new CrmReturnAccount();
    }

    /**
     * Create an instance of {@link ActivateAccountResponseModel }
     * 
     */
    public ActivateAccountResponseModel createActivateAccountResponseModel() {
        return new ActivateAccountResponseModel();
    }

    /**
     * Create an instance of {@link CrmAddress }
     * 
     */
    public CrmAddress createCrmAddress() {
        return new CrmAddress();
    }

    /**
     * Create an instance of {@link SuspendAccountResponse }
     * 
     */
    public SuspendAccountResponse createSuspendAccountResponse() {
        return new SuspendAccountResponse();
    }

    /**
     * Create an instance of {@link QueryStockItemOuidResponse }
     * 
     */
    public QueryStockItemOuidResponse createQueryStockItemOuidResponse() {
        return new QueryStockItemOuidResponse();
    }

    /**
     * Create an instance of {@link ReleaseStockItemResponse }
     * 
     */
    public ReleaseStockItemResponse createReleaseStockItemResponse() {
        return new ReleaseStockItemResponse();
    }

    /**
     * Create an instance of {@link ChangeStockItemStatusResponseModel }
     * 
     */
    public ChangeStockItemStatusResponseModel createChangeStockItemStatusResponseModel() {
        return new ChangeStockItemStatusResponseModel();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link MigratePartyResponse }
     * 
     */
    public MigratePartyResponse createMigratePartyResponse() {
        return new MigratePartyResponse();
    }

    /**
     * Create an instance of {@link AssignStockItemResponse }
     * 
     */
    public AssignStockItemResponse createAssignStockItemResponse() {
        return new AssignStockItemResponse();
    }

    /**
     * Create an instance of {@link ReserveStockItem }
     * 
     */
    public ReserveStockItem createReserveStockItem() {
        return new ReserveStockItem();
    }

    /**
     * Create an instance of {@link GetPartnerResponse }
     * 
     */
    public GetPartnerResponse createGetPartnerResponse() {
        return new GetPartnerResponse();
    }

    /**
     * Create an instance of {@link GetNumbersFromPoolResponseModel }
     * 
     */
    public GetNumbersFromPoolResponseModel createGetNumbersFromPoolResponseModel() {
        return new GetNumbersFromPoolResponseModel();
    }

    /**
     * Create an instance of {@link ArrayOfCrmAccount }
     * 
     */
    public ArrayOfCrmAccount createArrayOfCrmAccount() {
        return new ArrayOfCrmAccount();
    }

    /**
     * Create an instance of {@link DeactivateCustomerContractResponse }
     * 
     */
    public DeactivateCustomerContractResponse createDeactivateCustomerContractResponse() {
        return new DeactivateCustomerContractResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCrmDocument }
     * 
     */
    public ArrayOfCrmDocument createArrayOfCrmDocument() {
        return new ArrayOfCrmDocument();
    }

    /**
     * Create an instance of {@link ReserveStockItemResponse }
     * 
     */
    public ReserveStockItemResponse createReserveStockItemResponse() {
        return new ReserveStockItemResponse();
    }

    /**
     * Create an instance of {@link ProcessStaticIpRequestsResponseModel }
     * 
     */
    public ProcessStaticIpRequestsResponseModel createProcessStaticIpRequestsResponseModel() {
        return new ProcessStaticIpRequestsResponseModel();
    }

    /**
     * Create an instance of {@link AddNumbersToContract }
     * 
     */
    public AddNumbersToContract createAddNumbersToContract() {
        return new AddNumbersToContract();
    }

    /**
     * Create an instance of {@link ProvisionOrderToCRM }
     * 
     */
    public ProvisionOrderToCRM createProvisionOrderToCRM() {
        return new ProvisionOrderToCRM();
    }

    /**
     * Create an instance of {@link BlockNumberPoolItemRequestModel }
     * 
     */
    public BlockNumberPoolItemRequestModel createBlockNumberPoolItemRequestModel() {
        return new BlockNumberPoolItemRequestModel();
    }

    /**
     * Create an instance of {@link CrmContract }
     * 
     */
    public CrmContract createCrmContract() {
        return new CrmContract();
    }

    /**
     * Create an instance of {@link GetPartnerResponseModel }
     * 
     */
    public GetPartnerResponseModel createGetPartnerResponseModel() {
        return new GetPartnerResponseModel();
    }

    /**
     * Create an instance of {@link SuspendAccount }
     * 
     */
    public SuspendAccount createSuspendAccount() {
        return new SuspendAccount();
    }

    /**
     * Create an instance of {@link ArrayOfCrmNumber }
     * 
     */
    public ArrayOfCrmNumber createArrayOfCrmNumber() {
        return new ArrayOfCrmNumber();
    }

    /**
     * Create an instance of {@link GetNumbersFromPoolRequestModel }
     * 
     */
    public GetNumbersFromPoolRequestModel createGetNumbersFromPoolRequestModel() {
        return new GetNumbersFromPoolRequestModel();
    }

    /**
     * Create an instance of {@link GetNumbersFromPool }
     * 
     */
    public GetNumbersFromPool createGetNumbersFromPool() {
        return new GetNumbersFromPool();
    }

    /**
     * Create an instance of {@link DeactivateCustomerContractRequestModel }
     * 
     */
    public DeactivateCustomerContractRequestModel createDeactivateCustomerContractRequestModel() {
        return new DeactivateCustomerContractRequestModel();
    }

    /**
     * Create an instance of {@link ActivateCustomerContractRequestModel }
     * 
     */
    public ActivateCustomerContractRequestModel createActivateCustomerContractRequestModel() {
        return new ActivateCustomerContractRequestModel();
    }

    /**
     * Create an instance of {@link UserRequestModel }
     * 
     */
    public UserRequestModel createUserRequestModel() {
        return new UserRequestModel();
    }

    /**
     * Create an instance of {@link GetAccountPartyCodeRequestModel }
     * 
     */
    public GetAccountPartyCodeRequestModel createGetAccountPartyCodeRequestModel() {
        return new GetAccountPartyCodeRequestModel();
    }

    /**
     * Create an instance of {@link AssignStockItemRequestModel }
     * 
     */
    public AssignStockItemRequestModel createAssignStockItemRequestModel() {
        return new AssignStockItemRequestModel();
    }

    /**
     * Create an instance of {@link MigratePartyResponseModel }
     * 
     */
    public MigratePartyResponseModel createMigratePartyResponseModel() {
        return new MigratePartyResponseModel();
    }

    /**
     * Create an instance of {@link QueryNumberPoolItemResponseModel }
     * 
     */
    public QueryNumberPoolItemResponseModel createQueryNumberPoolItemResponseModel() {
        return new QueryNumberPoolItemResponseModel();
    }

    /**
     * Create an instance of {@link QueryStockItemOuid }
     * 
     */
    public QueryStockItemOuid createQueryStockItemOuid() {
        return new QueryStockItemOuid();
    }

    /**
     * Create an instance of {@link NumberPoolItem }
     * 
     */
    public NumberPoolItem createNumberPoolItem() {
        return new NumberPoolItem();
    }

    /**
     * Create an instance of {@link CRMProvisionRequestModel }
     * 
     */
    public CRMProvisionRequestModel createCRMProvisionRequestModel() {
        return new CRMProvisionRequestModel();
    }

    /**
     * Create an instance of {@link AssignNumberPoolItemResponse }
     * 
     */
    public AssignNumberPoolItemResponse createAssignNumberPoolItemResponse() {
        return new AssignNumberPoolItemResponse();
    }

    /**
     * Create an instance of {@link ReserveStockItemRequestModel }
     * 
     */
    public ReserveStockItemRequestModel createReserveStockItemRequestModel() {
        return new ReserveStockItemRequestModel();
    }

    /**
     * Create an instance of {@link ProcessSuspendedContractsRequestModel }
     * 
     */
    public ProcessSuspendedContractsRequestModel createProcessSuspendedContractsRequestModel() {
        return new ProcessSuspendedContractsRequestModel();
    }

    /**
     * Create an instance of {@link QueryStockItemRequestModel }
     * 
     */
    public QueryStockItemRequestModel createQueryStockItemRequestModel() {
        return new QueryStockItemRequestModel();
    }

    /**
     * Create an instance of {@link CrmDocument }
     * 
     */
    public CrmDocument createCrmDocument() {
        return new CrmDocument();
    }

    /**
     * Create an instance of {@link BusinessFault }
     * 
     */
    public BusinessFault createBusinessFault() {
        return new BusinessFault();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link UnavailableNumberPoolItemResponse }
     * 
     */
    public UnavailableNumberPoolItemResponse createUnavailableNumberPoolItemResponse() {
        return new UnavailableNumberPoolItemResponse();
    }

    /**
     * Create an instance of {@link MigrateAccount }
     * 
     */
    public MigrateAccount createMigrateAccount() {
        return new MigrateAccount();
    }

    /**
     * Create an instance of {@link RemoveDopingBoxProductResponse }
     * 
     */
    public RemoveDopingBoxProductResponse createRemoveDopingBoxProductResponse() {
        return new RemoveDopingBoxProductResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCrmEmail }
     * 
     */
    public ArrayOfCrmEmail createArrayOfCrmEmail() {
        return new ArrayOfCrmEmail();
    }

    /**
     * Create an instance of {@link ArrayOfCrmProduct }
     * 
     */
    public ArrayOfCrmProduct createArrayOfCrmProduct() {
        return new ArrayOfCrmProduct();
    }

    /**
     * Create an instance of {@link ActivateCustomerContract }
     * 
     */
    public ActivateCustomerContract createActivateCustomerContract() {
        return new ActivateCustomerContract();
    }

    /**
     * Create an instance of {@link AddNumbersToContractRequestModel }
     * 
     */
    public AddNumbersToContractRequestModel createAddNumbersToContractRequestModel() {
        return new AddNumbersToContractRequestModel();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link ProcessSuspendedContracts }
     * 
     */
    public ProcessSuspendedContracts createProcessSuspendedContracts() {
        return new ProcessSuspendedContracts();
    }

    /**
     * Create an instance of {@link SystemFault }
     * 
     */
    public SystemFault createSystemFault() {
        return new SystemFault();
    }

    /**
     * Create an instance of {@link ReleaseNumberPoolItemResponse }
     * 
     */
    public ReleaseNumberPoolItemResponse createReleaseNumberPoolItemResponse() {
        return new ReleaseNumberPoolItemResponse();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link MigrateAccountResponse }
     * 
     */
    public MigrateAccountResponse createMigrateAccountResponse() {
        return new MigrateAccountResponse();
    }

    /**
     * Create an instance of {@link BaseFault }
     * 
     */
    public BaseFault createBaseFault() {
        return new BaseFault();
    }

    /**
     * Create an instance of {@link ReserveNumberPoolItemRequestModel }
     * 
     */
    public ReserveNumberPoolItemRequestModel createReserveNumberPoolItemRequestModel() {
        return new ReserveNumberPoolItemRequestModel();
    }

    /**
     * Create an instance of {@link CrmAccount }
     * 
     */
    public CrmAccount createCrmAccount() {
        return new CrmAccount();
    }

    /**
     * Create an instance of {@link BlockNumberPoolItemResponse }
     * 
     */
    public BlockNumberPoolItemResponse createBlockNumberPoolItemResponse() {
        return new BlockNumberPoolItemResponse();
    }

    /**
     * Create an instance of {@link CrmProduct }
     * 
     */
    public CrmProduct createCrmProduct() {
        return new CrmProduct();
    }

    /**
     * Create an instance of {@link GetPartner }
     * 
     */
    public GetPartner createGetPartner() {
        return new GetPartner();
    }

    /**
     * Create an instance of {@link StockItem }
     * 
     */
    public StockItem createStockItem() {
        return new StockItem();
    }

    /**
     * Create an instance of {@link MigrateContract }
     * 
     */
    public MigrateContract createMigrateContract() {
        return new MigrateContract();
    }

    /**
     * Create an instance of {@link QueryStockItemResponse }
     * 
     */
    public QueryStockItemResponse createQueryStockItemResponse() {
        return new QueryStockItemResponse();
    }

    /**
     * Create an instance of {@link RemoveDopingBoxProductRequestModel }
     * 
     */
    public RemoveDopingBoxProductRequestModel createRemoveDopingBoxProductRequestModel() {
        return new RemoveDopingBoxProductRequestModel();
    }

    /**
     * Create an instance of {@link CRMProvisionResponseModel }
     * 
     */
    public CRMProvisionResponseModel createCRMProvisionResponseModel() {
        return new CRMProvisionResponseModel();
    }

    /**
     * Create an instance of {@link ActivateAccountResponse }
     * 
     */
    public ActivateAccountResponse createActivateAccountResponse() {
        return new ActivateAccountResponse();
    }

    /**
     * Create an instance of {@link MigrateContractRequestModel }
     * 
     */
    public MigrateContractRequestModel createMigrateContractRequestModel() {
        return new MigrateContractRequestModel();
    }

    /**
     * Create an instance of {@link ArrayOfCrmContract }
     * 
     */
    public ArrayOfCrmContract createArrayOfCrmContract() {
        return new ArrayOfCrmContract();
    }

    /**
     * Create an instance of {@link DeactivateAccountResponse }
     * 
     */
    public DeactivateAccountResponse createDeactivateAccountResponse() {
        return new DeactivateAccountResponse();
    }

    /**
     * Create an instance of {@link CrmNumber }
     * 
     */
    public CrmNumber createCrmNumber() {
        return new CrmNumber();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link ChangeNumberPoolItemStatusResponseModel }
     * 
     */
    public ChangeNumberPoolItemStatusResponseModel createChangeNumberPoolItemStatusResponseModel() {
        return new ChangeNumberPoolItemStatusResponseModel();
    }

    /**
     * Create an instance of {@link DeactivateCustomerContract }
     * 
     */
    public DeactivateCustomerContract createDeactivateCustomerContract() {
        return new DeactivateCustomerContract();
    }

    /**
     * Create an instance of {@link Partner }
     * 
     */
    public Partner createPartner() {
        return new Partner();
    }

    /**
     * Create an instance of {@link GetNumbersFromPoolResponse }
     * 
     */
    public GetNumbersFromPoolResponse createGetNumbersFromPoolResponse() {
        return new GetNumbersFromPoolResponse();
    }

    /**
     * Create an instance of {@link AssignStockItem }
     * 
     */
    public AssignStockItem createAssignStockItem() {
        return new AssignStockItem();
    }

    /**
     * Create an instance of {@link ProcessChurnContractsRequestModel }
     * 
     */
    public ProcessChurnContractsRequestModel createProcessChurnContractsRequestModel() {
        return new ProcessChurnContractsRequestModel();
    }

    /**
     * Create an instance of {@link ReserveNumberPoolItemResponse }
     * 
     */
    public ReserveNumberPoolItemResponse createReserveNumberPoolItemResponse() {
        return new ReserveNumberPoolItemResponse();
    }

    /**
     * Create an instance of {@link QueryStockItem }
     * 
     */
    public QueryStockItem createQueryStockItem() {
        return new QueryStockItem();
    }

    /**
     * Create an instance of {@link QueryStockItemOuidResponseModel }
     * 
     */
    public QueryStockItemOuidResponseModel createQueryStockItemOuidResponseModel() {
        return new QueryStockItemOuidResponseModel();
    }

    /**
     * Create an instance of {@link SuspendAccountRequestModel }
     * 
     */
    public SuspendAccountRequestModel createSuspendAccountRequestModel() {
        return new SuspendAccountRequestModel();
    }

    /**
     * Create an instance of {@link UserResponseModel }
     * 
     */
    public UserResponseModel createUserResponseModel() {
        return new UserResponseModel();
    }

    /**
     * Create an instance of {@link GetAccountPartyCode }
     * 
     */
    public GetAccountPartyCode createGetAccountPartyCode() {
        return new GetAccountPartyCode();
    }

    /**
     * Create an instance of {@link QueryStockItemOuidRequestModel }
     * 
     */
    public QueryStockItemOuidRequestModel createQueryStockItemOuidRequestModel() {
        return new QueryStockItemOuidRequestModel();
    }

    /**
     * Create an instance of {@link ArrayOfCrmContact }
     * 
     */
    public ArrayOfCrmContact createArrayOfCrmContact() {
        return new ArrayOfCrmContact();
    }

    /**
     * Create an instance of {@link AddNumbersToContractResponseModel }
     * 
     */
    public AddNumbersToContractResponseModel createAddNumbersToContractResponseModel() {
        return new AddNumbersToContractResponseModel();
    }

    /**
     * Create an instance of {@link ActivateCustomerContractResponseModel }
     * 
     */
    public ActivateCustomerContractResponseModel createActivateCustomerContractResponseModel() {
        return new ActivateCustomerContractResponseModel();
    }

    /**
     * Create an instance of {@link ProcessStaticIpRequests }
     * 
     */
    public ProcessStaticIpRequests createProcessStaticIpRequests() {
        return new ProcessStaticIpRequests();
    }

    /**
     * Create an instance of {@link SuspendCustomerContractResponseModel }
     * 
     */
    public SuspendCustomerContractResponseModel createSuspendCustomerContractResponseModel() {
        return new SuspendCustomerContractResponseModel();
    }

    /**
     * Create an instance of {@link RemoveNumbersFromContractResponseModel }
     * 
     */
    public RemoveNumbersFromContractResponseModel createRemoveNumbersFromContractResponseModel() {
        return new RemoveNumbersFromContractResponseModel();
    }

    /**
     * Create an instance of {@link ProcessStaticIpRequestsResponse }
     * 
     */
    public ProcessStaticIpRequestsResponse createProcessStaticIpRequestsResponse() {
        return new ProcessStaticIpRequestsResponse();
    }

    /**
     * Create an instance of {@link GetCustomerResponse }
     * 
     */
    public GetCustomerResponse createGetCustomerResponse() {
        return new GetCustomerResponse();
    }

    /**
     * Create an instance of {@link BlockNumberPoolItem }
     * 
     */
    public BlockNumberPoolItem createBlockNumberPoolItem() {
        return new BlockNumberPoolItem();
    }

    /**
     * Create an instance of {@link GetPartnerRequestModel }
     * 
     */
    public GetPartnerRequestModel createGetPartnerRequestModel() {
        return new GetPartnerRequestModel();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link CrmPhone }
     * 
     */
    public CrmPhone createCrmPhone() {
        return new CrmPhone();
    }

    /**
     * Create an instance of {@link ContractedNumber }
     * 
     */
    public ContractedNumber createContractedNumber() {
        return new ContractedNumber();
    }

    /**
     * Create an instance of {@link CrmEmail }
     * 
     */
    public CrmEmail createCrmEmail() {
        return new CrmEmail();
    }

    /**
     * Create an instance of {@link DeactivateAccountRequestModel }
     * 
     */
    public DeactivateAccountRequestModel createDeactivateAccountRequestModel() {
        return new DeactivateAccountRequestModel();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link GetAccountPartyCodeResponseModel }
     * 
     */
    public GetAccountPartyCodeResponseModel createGetAccountPartyCodeResponseModel() {
        return new GetAccountPartyCodeResponseModel();
    }

    /**
     * Create an instance of {@link MigrateContractResponseModel }
     * 
     */
    public MigrateContractResponseModel createMigrateContractResponseModel() {
        return new MigrateContractResponseModel();
    }

    /**
     * Create an instance of {@link ProcessChurnContractsResponseModel }
     * 
     */
    public ProcessChurnContractsResponseModel createProcessChurnContractsResponseModel() {
        return new ProcessChurnContractsResponseModel();
    }

    /**
     * Create an instance of {@link DeactivateAccountResponseModel }
     * 
     */
    public DeactivateAccountResponseModel createDeactivateAccountResponseModel() {
        return new DeactivateAccountResponseModel();
    }

    /**
     * Create an instance of {@link MigratePartyRequestModel }
     * 
     */
    public MigratePartyRequestModel createMigratePartyRequestModel() {
        return new MigratePartyRequestModel();
    }

    /**
     * Create an instance of {@link ActivateCustomerContractResponse }
     * 
     */
    public ActivateCustomerContractResponse createActivateCustomerContractResponse() {
        return new ActivateCustomerContractResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCrmPhone }
     * 
     */
    public ArrayOfCrmPhone createArrayOfCrmPhone() {
        return new ArrayOfCrmPhone();
    }

    /**
     * Create an instance of {@link GetCustomerByCustomerId }
     * 
     */
    public GetCustomerByCustomerId createGetCustomerByCustomerId() {
        return new GetCustomerByCustomerId();
    }

    /**
     * Create an instance of {@link MigrateAccountResponseModel }
     * 
     */
    public MigrateAccountResponseModel createMigrateAccountResponseModel() {
        return new MigrateAccountResponseModel();
    }

    /**
     * Create an instance of {@link GetCustomerRequestModel }
     * 
     */
    public GetCustomerRequestModel createGetCustomerRequestModel() {
        return new GetCustomerRequestModel();
    }

    /**
     * Create an instance of {@link QueryNumberPoolItem }
     * 
     */
    public QueryNumberPoolItem createQueryNumberPoolItem() {
        return new QueryNumberPoolItem();
    }

    /**
     * Create an instance of {@link ProcessSuspendedContractsResponse }
     * 
     */
    public ProcessSuspendedContractsResponse createProcessSuspendedContractsResponse() {
        return new ProcessSuspendedContractsResponse();
    }

    /**
     * Create an instance of {@link UnavailableNumberPoolItemRequestModel }
     * 
     */
    public UnavailableNumberPoolItemRequestModel createUnavailableNumberPoolItemRequestModel() {
        return new UnavailableNumberPoolItemRequestModel();
    }

    /**
     * Create an instance of {@link UnavailableNumberPoolItem }
     * 
     */
    public UnavailableNumberPoolItem createUnavailableNumberPoolItem() {
        return new UnavailableNumberPoolItem();
    }

    /**
     * Create an instance of {@link GetCustomer }
     * 
     */
    public GetCustomer createGetCustomer() {
        return new GetCustomer();
    }

    /**
     * Create an instance of {@link QueryStockItemResponseModel }
     * 
     */
    public QueryStockItemResponseModel createQueryStockItemResponseModel() {
        return new QueryStockItemResponseModel();
    }

    /**
     * Create an instance of {@link SuspendCustomerContractRequestModel }
     * 
     */
    public SuspendCustomerContractRequestModel createSuspendCustomerContractRequestModel() {
        return new SuspendCustomerContractRequestModel();
    }

    /**
     * Create an instance of {@link ActivateAccountRequestModel }
     * 
     */
    public ActivateAccountRequestModel createActivateAccountRequestModel() {
        return new ActivateAccountRequestModel();
    }

    /**
     * Create an instance of {@link ArrayOfCrmAddress }
     * 
     */
    public ArrayOfCrmAddress createArrayOfCrmAddress() {
        return new ArrayOfCrmAddress();
    }

    /**
     * Create an instance of {@link RemoveNumbersFromContractRequestModel }
     * 
     */
    public RemoveNumbersFromContractRequestModel createRemoveNumbersFromContractRequestModel() {
        return new RemoveNumbersFromContractRequestModel();
    }

    /**
     * Create an instance of {@link ProcessChurnContractsResponse }
     * 
     */
    public ProcessChurnContractsResponse createProcessChurnContractsResponse() {
        return new ProcessChurnContractsResponse();
    }

    /**
     * Create an instance of {@link MigrateContractResponse }
     * 
     */
    public MigrateContractResponse createMigrateContractResponse() {
        return new MigrateContractResponse();
    }

    /**
     * Create an instance of {@link GetCustomerByCustomerIdResponse }
     * 
     */
    public GetCustomerByCustomerIdResponse createGetCustomerByCustomerIdResponse() {
        return new GetCustomerByCustomerIdResponse();
    }

    /**
     * Create an instance of {@link RemoveDopingBoxProductResponseModel }
     * 
     */
    public RemoveDopingBoxProductResponseModel createRemoveDopingBoxProductResponseModel() {
        return new RemoveDopingBoxProductResponseModel();
    }

    /**
     * Create an instance of {@link SuspendAccountResponseModel }
     * 
     */
    public SuspendAccountResponseModel createSuspendAccountResponseModel() {
        return new SuspendAccountResponseModel();
    }

    /**
     * Create an instance of {@link RemoveNumbersFromContractResponse }
     * 
     */
    public RemoveNumbersFromContractResponse createRemoveNumbersFromContractResponse() {
        return new RemoveNumbersFromContractResponse();
    }

    /**
     * Create an instance of {@link QueryCustomerRequestModel }
     * 
     */
    public QueryCustomerRequestModel createQueryCustomerRequestModel() {
        return new QueryCustomerRequestModel();
    }

    /**
     * Create an instance of {@link ReleaseStockItemRequestModel }
     * 
     */
    public ReleaseStockItemRequestModel createReleaseStockItemRequestModel() {
        return new ReleaseStockItemRequestModel();
    }

    /**
     * Create an instance of {@link QueryNumberPoolItemRequestModel }
     * 
     */
    public QueryNumberPoolItemRequestModel createQueryNumberPoolItemRequestModel() {
        return new QueryNumberPoolItemRequestModel();
    }

    /**
     * Create an instance of {@link ArrayOfNumberPoolItem }
     * 
     */
    public ArrayOfNumberPoolItem createArrayOfNumberPoolItem() {
        return new ArrayOfNumberPoolItem();
    }

    /**
     * Create an instance of {@link DeactivateCustomerContractResponseModel }
     * 
     */
    public DeactivateCustomerContractResponseModel createDeactivateCustomerContractResponseModel() {
        return new DeactivateCustomerContractResponseModel();
    }

    /**
     * Create an instance of {@link RemoveNumbersFromContract }
     * 
     */
    public RemoveNumbersFromContract createRemoveNumbersFromContract() {
        return new RemoveNumbersFromContract();
    }

    /**
     * Create an instance of {@link MigrateParty }
     * 
     */
    public MigrateParty createMigrateParty() {
        return new MigrateParty();
    }

    /**
     * Create an instance of {@link ReserveNumberPoolItem }
     * 
     */
    public ReserveNumberPoolItem createReserveNumberPoolItem() {
        return new ReserveNumberPoolItem();
    }

    /**
     * Create an instance of {@link AddNumbersToContractResponse }
     * 
     */
    public AddNumbersToContractResponse createAddNumbersToContractResponse() {
        return new AddNumbersToContractResponse();
    }

    /**
     * Create an instance of {@link ProcessChurnContracts }
     * 
     */
    public ProcessChurnContracts createProcessChurnContracts() {
        return new ProcessChurnContracts();
    }

    /**
     * Create an instance of {@link RemoveDopingBoxProduct }
     * 
     */
    public RemoveDopingBoxProduct createRemoveDopingBoxProduct() {
        return new RemoveDopingBoxProduct();
    }

    /**
     * Create an instance of {@link ReleaseNumberPoolItem }
     * 
     */
    public ReleaseNumberPoolItem createReleaseNumberPoolItem() {
        return new ReleaseNumberPoolItem();
    }

    /**
     * Create an instance of {@link GetCustomerResponseModel }
     * 
     */
    public GetCustomerResponseModel createGetCustomerResponseModel() {
        return new GetCustomerResponseModel();
    }

    /**
     * Create an instance of {@link ContractedNumbersInfo }
     * 
     */
    public ContractedNumbersInfo createContractedNumbersInfo() {
        return new ContractedNumbersInfo();
    }

    /**
     * Create an instance of {@link DeactivateAccount }
     * 
     */
    public DeactivateAccount createDeactivateAccount() {
        return new DeactivateAccount();
    }

    /**
     * Create an instance of {@link ProcessStaticIpRequestsRequestModel }
     * 
     */
    public ProcessStaticIpRequestsRequestModel createProcessStaticIpRequestsRequestModel() {
        return new ProcessStaticIpRequestsRequestModel();
    }

    /**
     * Create an instance of {@link ProvisionOrderToCRMResponse }
     * 
     */
    public ProvisionOrderToCRMResponse createProvisionOrderToCRMResponse() {
        return new ProvisionOrderToCRMResponse();
    }

    /**
     * Create an instance of {@link AssignNumberPoolItem }
     * 
     */
    public AssignNumberPoolItem createAssignNumberPoolItem() {
        return new AssignNumberPoolItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ContractCode", scope = AssignNumberPoolItemRequestModel.class)
    public JAXBElement<String> createAssignNumberPoolItemRequestModelContractCode(String value) {
        return new JAXBElement<String>(_AssignNumberPoolItemRequestModelContractCode_QNAME, String.class, AssignNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Number", scope = AssignNumberPoolItemRequestModel.class)
    public JAXBElement<String> createAssignNumberPoolItemRequestModelNumber(String value) {
        return new JAXBElement<String>(_AssignNumberPoolItemRequestModelNumber_QNAME, String.class, AssignNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Username", scope = AssignNumberPoolItemRequestModel.class)
    public JAXBElement<String> createAssignNumberPoolItemRequestModelUsername(String value) {
        return new JAXBElement<String>(_AssignNumberPoolItemRequestModelUsername_QNAME, String.class, AssignNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "IdentificationNumber", scope = AssignNumberPoolItemRequestModel.class)
    public JAXBElement<String> createAssignNumberPoolItemRequestModelIdentificationNumber(String value) {
        return new JAXBElement<String>(_AssignNumberPoolItemRequestModelIdentificationNumber_QNAME, String.class, AssignNumberPoolItemRequestModel.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStockItemOuidResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "QueryStockItemOuidResponseModel")
    public JAXBElement<QueryStockItemOuidResponseModel> createQueryStockItemOuidResponseModel(QueryStockItemOuidResponseModel value) {
        return new JAXBElement<QueryStockItemOuidResponseModel>(_QueryStockItemOuidResponseModel_QNAME, QueryStockItemOuidResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnavailableNumberPoolItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UnavailableNumberPoolItemRequestModel")
    public JAXBElement<UnavailableNumberPoolItemRequestModel> createUnavailableNumberPoolItemRequestModel(UnavailableNumberPoolItemRequestModel value) {
        return new JAXBElement<UnavailableNumberPoolItemRequestModel>(_UnavailableNumberPoolItemRequestModel_QNAME, UnavailableNumberPoolItemRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRMProvisionResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "CRMProvisionResponseModel")
    public JAXBElement<CRMProvisionResponseModel> createCRMProvisionResponseModel(CRMProvisionResponseModel value) {
        return new JAXBElement<CRMProvisionResponseModel>(_CRMProvisionResponseModel_QNAME, CRMProvisionResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNumberPoolItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ArrayOfNumberPoolItem")
    public JAXBElement<ArrayOfNumberPoolItem> createArrayOfNumberPoolItem(ArrayOfNumberPoolItem value) {
        return new JAXBElement<ArrayOfNumberPoolItem>(_ArrayOfNumberPoolItem_QNAME, ArrayOfNumberPoolItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveNumbersFromContractResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "RemoveNumbersFromContractResponseModel")
    public JAXBElement<RemoveNumbersFromContractResponseModel> createRemoveNumbersFromContractResponseModel(RemoveNumbersFromContractResponseModel value) {
        return new JAXBElement<RemoveNumbersFromContractResponseModel>(_RemoveNumbersFromContractResponseModel_QNAME, RemoveNumbersFromContractResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractedNumbersInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ContractedNumbersInfo")
    public JAXBElement<ContractedNumbersInfo> createContractedNumbersInfo(ContractedNumbersInfo value) {
        return new JAXBElement<ContractedNumbersInfo>(_ContractedNumbersInfo_QNAME, ContractedNumbersInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseNumberPoolItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ReleaseNumberPoolItemRequestModel")
    public JAXBElement<ReleaseNumberPoolItemRequestModel> createReleaseNumberPoolItemRequestModel(ReleaseNumberPoolItemRequestModel value) {
        return new JAXBElement<ReleaseNumberPoolItemRequestModel>(_ReleaseNumberPoolItemRequestModel_QNAME, ReleaseNumberPoolItemRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveDopingBoxProductRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "RemoveDopingBoxProductRequestModel")
    public JAXBElement<RemoveDopingBoxProductRequestModel> createRemoveDopingBoxProductRequestModel(RemoveDopingBoxProductRequestModel value) {
        return new JAXBElement<RemoveDopingBoxProductRequestModel>(_RemoveDopingBoxProductRequestModel_QNAME, RemoveDopingBoxProductRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateAccountResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "DeactivateAccountResponseModel")
    public JAXBElement<DeactivateAccountResponseModel> createDeactivateAccountResponseModel(DeactivateAccountResponseModel value) {
        return new JAXBElement<DeactivateAccountResponseModel>(_DeactivateAccountResponseModel_QNAME, DeactivateAccountResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SuspendCustomerContractResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SuspendCustomerContractResponseModel")
    public JAXBElement<SuspendCustomerContractResponseModel> createSuspendCustomerContractResponseModel(SuspendCustomerContractResponseModel value) {
        return new JAXBElement<SuspendCustomerContractResponseModel>(_SuspendCustomerContractResponseModel_QNAME, SuspendCustomerContractResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "CrmAddress")
    public JAXBElement<CrmAddress> createCrmAddress(CrmAddress value) {
        return new JAXBElement<CrmAddress>(_CrmAddress_QNAME, CrmAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ArrayOfCrmAddress")
    public JAXBElement<ArrayOfCrmAddress> createArrayOfCrmAddress(ArrayOfCrmAddress value) {
        return new JAXBElement<ArrayOfCrmAddress>(_ArrayOfCrmAddress_QNAME, ArrayOfCrmAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "CrmContract")
    public JAXBElement<CrmContract> createCrmContract(CrmContract value) {
        return new JAXBElement<CrmContract>(_CrmContract_QNAME, CrmContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateAccountResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ActivateAccountResponseModel")
    public JAXBElement<ActivateAccountResponseModel> createActivateAccountResponseModel(ActivateAccountResponseModel value) {
        return new JAXBElement<ActivateAccountResponseModel>(_ActivateAccountResponseModel_QNAME, ActivateAccountResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessChurnContractsResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ProcessChurnContractsResponseModel")
    public JAXBElement<ProcessChurnContractsResponseModel> createProcessChurnContractsResponseModel(ProcessChurnContractsResponseModel value) {
        return new JAXBElement<ProcessChurnContractsResponseModel>(_ProcessChurnContractsResponseModel_QNAME, ProcessChurnContractsResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessStaticIpRequestsResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ProcessStaticIpRequestsResponseModel")
    public JAXBElement<ProcessStaticIpRequestsResponseModel> createProcessStaticIpRequestsResponseModel(ProcessStaticIpRequestsResponseModel value) {
        return new JAXBElement<ProcessStaticIpRequestsResponseModel>(_ProcessStaticIpRequestsResponseModel_QNAME, ProcessStaticIpRequestsResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessSuspendedContractsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ProcessSuspendedContractsRequestModel")
    public JAXBElement<ProcessSuspendedContractsRequestModel> createProcessSuspendedContractsRequestModel(ProcessSuspendedContractsRequestModel value) {
        return new JAXBElement<ProcessSuspendedContractsRequestModel>(_ProcessSuspendedContractsRequestModel_QNAME, ProcessSuspendedContractsRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "CrmContact")
    public JAXBElement<CrmContact> createCrmContact(CrmContact value) {
        return new JAXBElement<CrmContact>(_CrmContact_QNAME, CrmContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPartnerRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetPartnerRequestModel")
    public JAXBElement<GetPartnerRequestModel> createGetPartnerRequestModel(GetPartnerRequestModel value) {
        return new JAXBElement<GetPartnerRequestModel>(_GetPartnerRequestModel_QNAME, GetPartnerRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmReturnAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "CrmReturnAccount")
    public JAXBElement<CrmReturnAccount> createCrmReturnAccount(CrmReturnAccount value) {
        return new JAXBElement<CrmReturnAccount>(_CrmReturnAccount_QNAME, CrmReturnAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ArrayOfCrmAccount")
    public JAXBElement<ArrayOfCrmAccount> createArrayOfCrmAccount(ArrayOfCrmAccount value) {
        return new JAXBElement<ArrayOfCrmAccount>(_ArrayOfCrmAccount_QNAME, ArrayOfCrmAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmPhone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", name = "CrmPhone")
    public JAXBElement<CrmPhone> createCrmPhone(CrmPhone value) {
        return new JAXBElement<CrmPhone>(_CrmPhone_QNAME, CrmPhone.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPartnerResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetPartnerResponseModel")
    public JAXBElement<GetPartnerResponseModel> createGetPartnerResponseModel(GetPartnerResponseModel value) {
        return new JAXBElement<GetPartnerResponseModel>(_GetPartnerResponseModel_QNAME, GetPartnerResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountPartyCodeResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetAccountPartyCodeResponseModel")
    public JAXBElement<GetAccountPartyCodeResponseModel> createGetAccountPartyCodeResponseModel(GetAccountPartyCodeResponseModel value) {
        return new JAXBElement<GetAccountPartyCodeResponseModel>(_GetAccountPartyCodeResponseModel_QNAME, GetAccountPartyCodeResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContractedNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ArrayOfContractedNumber")
    public JAXBElement<ArrayOfContractedNumber> createArrayOfContractedNumber(ArrayOfContractedNumber value) {
        return new JAXBElement<ArrayOfContractedNumber>(_ArrayOfContractedNumber_QNAME, ArrayOfContractedNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigrateContractResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "MigrateContractResponseModel")
    public JAXBElement<MigrateContractResponseModel> createMigrateContractResponseModel(MigrateContractResponseModel value) {
        return new JAXBElement<MigrateContractResponseModel>(_MigrateContractResponseModel_QNAME, MigrateContractResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "StockItem")
    public JAXBElement<StockItem> createStockItem(StockItem value) {
        return new JAXBElement<StockItem>(_StockItem_QNAME, StockItem.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNumbersToContractResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddNumbersToContractResponseModel")
    public JAXBElement<AddNumbersToContractResponseModel> createAddNumbersToContractResponseModel(AddNumbersToContractResponseModel value) {
        return new JAXBElement<AddNumbersToContractResponseModel>(_AddNumbersToContractResponseModel_QNAME, AddNumbersToContractResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStockItemResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "QueryStockItemResponseModel")
    public JAXBElement<QueryStockItemResponseModel> createQueryStockItemResponseModel(QueryStockItemResponseModel value) {
        return new JAXBElement<QueryStockItemResponseModel>(_QueryStockItemResponseModel_QNAME, QueryStockItemResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryNumberPoolItemResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "QueryNumberPoolItemResponseModel")
    public JAXBElement<QueryNumberPoolItemResponseModel> createQueryNumberPoolItemResponseModel(QueryNumberPoolItemResponseModel value) {
        return new JAXBElement<QueryNumberPoolItemResponseModel>(_QueryNumberPoolItemResponseModel_QNAME, QueryNumberPoolItemResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignStockItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AssignStockItemRequestModel")
    public JAXBElement<AssignStockItemRequestModel> createAssignStockItemRequestModel(AssignStockItemRequestModel value) {
        return new JAXBElement<AssignStockItemRequestModel>(_AssignStockItemRequestModel_QNAME, AssignStockItemRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "CrmAccount")
    public JAXBElement<CrmAccount> createCrmAccount(CrmAccount value) {
        return new JAXBElement<CrmAccount>(_CrmAccount_QNAME, CrmAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessChurnContractsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ProcessChurnContractsRequestModel")
    public JAXBElement<ProcessChurnContractsRequestModel> createProcessChurnContractsRequestModel(ProcessChurnContractsRequestModel value) {
        return new JAXBElement<ProcessChurnContractsRequestModel>(_ProcessChurnContractsRequestModel_QNAME, ProcessChurnContractsRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveDopingBoxProductResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "RemoveDopingBoxProductResponseModel")
    public JAXBElement<RemoveDopingBoxProductResponseModel> createRemoveDopingBoxProductResponseModel(RemoveDopingBoxProductResponseModel value) {
        return new JAXBElement<RemoveDopingBoxProductResponseModel>(_RemoveDopingBoxProductResponseModel_QNAME, RemoveDopingBoxProductResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "User")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetCustomerResponseModel")
    public JAXBElement<GetCustomerResponseModel> createGetCustomerResponseModel(GetCustomerResponseModel value) {
        return new JAXBElement<GetCustomerResponseModel>(_GetCustomerResponseModel_QNAME, GetCustomerResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MigrateContractRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "MigrateContractRequestModel")
    public JAXBElement<MigrateContractRequestModel> createMigrateContractRequestModel(MigrateContractRequestModel value) {
        return new JAXBElement<MigrateContractRequestModel>(_MigrateContractRequestModel_QNAME, MigrateContractRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UserRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UserRequestModel")
    public JAXBElement<UserRequestModel> createUserRequestModel(UserRequestModel value) {
        return new JAXBElement<UserRequestModel>(_UserRequestModel_QNAME, UserRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryNumberPoolItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "QueryNumberPoolItemRequestModel")
    public JAXBElement<QueryNumberPoolItemRequestModel> createQueryNumberPoolItemRequestModel(QueryNumberPoolItemRequestModel value) {
        return new JAXBElement<QueryNumberPoolItemRequestModel>(_QueryNumberPoolItemRequestModel_QNAME, QueryNumberPoolItemRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateAccountRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ActivateAccountRequestModel")
    public JAXBElement<ActivateAccountRequestModel> createActivateAccountRequestModel(ActivateAccountRequestModel value) {
        return new JAXBElement<ActivateAccountRequestModel>(_ActivateAccountRequestModel_QNAME, ActivateAccountRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", name = "CrmDocument")
    public JAXBElement<CrmDocument> createCrmDocument(CrmDocument value) {
        return new JAXBElement<CrmDocument>(_CrmDocument_QNAME, CrmDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateCustomerContractRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "DeactivateCustomerContractRequestModel")
    public JAXBElement<DeactivateCustomerContractRequestModel> createDeactivateCustomerContractRequestModel(DeactivateCustomerContractRequestModel value) {
        return new JAXBElement<DeactivateCustomerContractRequestModel>(_DeactivateCustomerContractRequestModel_QNAME, DeactivateCustomerContractRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockNumberPoolItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "BlockNumberPoolItemRequestModel")
    public JAXBElement<BlockNumberPoolItemRequestModel> createBlockNumberPoolItemRequestModel(BlockNumberPoolItemRequestModel value) {
        return new JAXBElement<BlockNumberPoolItemRequestModel>(_BlockNumberPoolItemRequestModel_QNAME, BlockNumberPoolItemRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Customer")
    public JAXBElement<Customer> createCustomer(Customer value) {
        return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveStockItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ReserveStockItemRequestModel")
    public JAXBElement<ReserveStockItemRequestModel> createReserveStockItemRequestModel(ReserveStockItemRequestModel value) {
        return new JAXBElement<ReserveStockItemRequestModel>(_ReserveStockItemRequestModel_QNAME, ReserveStockItemRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ArrayOfCrmProduct")
    public JAXBElement<ArrayOfCrmProduct> createArrayOfCrmProduct(ArrayOfCrmProduct value) {
        return new JAXBElement<ArrayOfCrmProduct>(_ArrayOfCrmProduct_QNAME, ArrayOfCrmProduct.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveNumberPoolItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ReserveNumberPoolItemRequestModel")
    public JAXBElement<ReserveNumberPoolItemRequestModel> createReserveNumberPoolItemRequestModel(ReserveNumberPoolItemRequestModel value) {
        return new JAXBElement<ReserveNumberPoolItemRequestModel>(_ReserveNumberPoolItemRequestModel_QNAME, ReserveNumberPoolItemRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNumbersToContractRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddNumbersToContractRequestModel")
    public JAXBElement<AddNumbersToContractRequestModel> createAddNumbersToContractRequestModel(AddNumbersToContractRequestModel value) {
        return new JAXBElement<AddNumbersToContractRequestModel>(_AddNumbersToContractRequestModel_QNAME, AddNumbersToContractRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveNumbersFromContractRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "RemoveNumbersFromContractRequestModel")
    public JAXBElement<RemoveNumbersFromContractRequestModel> createRemoveNumbersFromContractRequestModel(RemoveNumbersFromContractRequestModel value) {
        return new JAXBElement<RemoveNumbersFromContractRequestModel>(_RemoveNumbersFromContractRequestModel_QNAME, RemoveNumbersFromContractRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseStockItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ReleaseStockItemRequestModel")
    public JAXBElement<ReleaseStockItemRequestModel> createReleaseStockItemRequestModel(ReleaseStockItemRequestModel value) {
        return new JAXBElement<ReleaseStockItemRequestModel>(_ReleaseStockItemRequestModel_QNAME, ReleaseStockItemRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStockItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "QueryStockItemRequestModel")
    public JAXBElement<QueryStockItemRequestModel> createQueryStockItemRequestModel(QueryStockItemRequestModel value) {
        return new JAXBElement<QueryStockItemRequestModel>(_QueryStockItemRequestModel_QNAME, QueryStockItemRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRMProvisionRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "CRMProvisionRequestModel")
    public JAXBElement<CRMProvisionRequestModel> createCRMProvisionRequestModel(CRMProvisionRequestModel value) {
        return new JAXBElement<CRMProvisionRequestModel>(_CRMProvisionRequestModel_QNAME, CRMProvisionRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberPoolItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "NumberPoolItem")
    public JAXBElement<NumberPoolItem> createNumberPoolItem(NumberPoolItem value) {
        return new JAXBElement<NumberPoolItem>(_NumberPoolItem_QNAME, NumberPoolItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmPhone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", name = "ArrayOfCrmPhone")
    public JAXBElement<ArrayOfCrmPhone> createArrayOfCrmPhone(ArrayOfCrmPhone value) {
        return new JAXBElement<ArrayOfCrmPhone>(_ArrayOfCrmPhone_QNAME, ArrayOfCrmPhone.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessStaticIpRequestsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ProcessStaticIpRequestsRequestModel")
    public JAXBElement<ProcessStaticIpRequestsRequestModel> createProcessStaticIpRequestsRequestModel(ProcessStaticIpRequestsRequestModel value) {
        return new JAXBElement<ProcessStaticIpRequestsRequestModel>(_ProcessStaticIpRequestsRequestModel_QNAME, ProcessStaticIpRequestsRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateCustomerContractResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "DeactivateCustomerContractResponseModel")
    public JAXBElement<DeactivateCustomerContractResponseModel> createDeactivateCustomerContractResponseModel(DeactivateCustomerContractResponseModel value) {
        return new JAXBElement<DeactivateCustomerContractResponseModel>(_DeactivateCustomerContractResponseModel_QNAME, DeactivateCustomerContractResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryCustomerRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "QueryCustomerRequestModel")
    public JAXBElement<QueryCustomerRequestModel> createQueryCustomerRequestModel(QueryCustomerRequestModel value) {
        return new JAXBElement<QueryCustomerRequestModel>(_QueryCustomerRequestModel_QNAME, QueryCustomerRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountPartyCodeRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetAccountPartyCodeRequestModel")
    public JAXBElement<GetAccountPartyCodeRequestModel> createGetAccountPartyCodeRequestModel(GetAccountPartyCodeRequestModel value) {
        return new JAXBElement<GetAccountPartyCodeRequestModel>(_GetAccountPartyCodeRequestModel_QNAME, GetAccountPartyCodeRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ArrayOfCrmContact")
    public JAXBElement<ArrayOfCrmContact> createArrayOfCrmContact(ArrayOfCrmContact value) {
        return new JAXBElement<ArrayOfCrmContact>(_ArrayOfCrmContact_QNAME, ArrayOfCrmContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", name = "ArrayOfCrmEmail")
    public JAXBElement<ArrayOfCrmEmail> createArrayOfCrmEmail(ArrayOfCrmEmail value) {
        return new JAXBElement<ArrayOfCrmEmail>(_ArrayOfCrmEmail_QNAME, ArrayOfCrmEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigrateAccountRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "MigrateAccountRequestModel")
    public JAXBElement<MigrateAccountRequestModel> createMigrateAccountRequestModel(MigrateAccountRequestModel value) {
        return new JAXBElement<MigrateAccountRequestModel>(_MigrateAccountRequestModel_QNAME, MigrateAccountRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuspendAccountResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SuspendAccountResponseModel")
    public JAXBElement<SuspendAccountResponseModel> createSuspendAccountResponseModel(SuspendAccountResponseModel value) {
        return new JAXBElement<SuspendAccountResponseModel>(_SuspendAccountResponseModel_QNAME, SuspendAccountResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SexEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Customer", name = "SexEnum")
    public JAXBElement<SexEnum> createSexEnum(SexEnum value) {
        return new JAXBElement<SexEnum>(_SexEnum_QNAME, SexEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", name = "CrmEmail")
    public JAXBElement<CrmEmail> createCrmEmail(CrmEmail value) {
        return new JAXBElement<CrmEmail>(_CrmEmail_QNAME, CrmEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateCustomerContractRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ActivateCustomerContractRequestModel")
    public JAXBElement<ActivateCustomerContractRequestModel> createActivateCustomerContractRequestModel(ActivateCustomerContractRequestModel value) {
        return new JAXBElement<ActivateCustomerContractRequestModel>(_ActivateCustomerContractRequestModel_QNAME, ActivateCustomerContractRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ArrayOfCrmContract")
    public JAXBElement<ArrayOfCrmContract> createArrayOfCrmContract(ArrayOfCrmContract value) {
        return new JAXBElement<ArrayOfCrmContract>(_ArrayOfCrmContract_QNAME, ArrayOfCrmContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigratePartyResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "MigratePartyResponseModel")
    public JAXBElement<MigratePartyResponseModel> createMigratePartyResponseModel(MigratePartyResponseModel value) {
        return new JAXBElement<MigratePartyResponseModel>(_MigratePartyResponseModel_QNAME, MigratePartyResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Partner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Partner")
    public JAXBElement<Partner> createPartner(Partner value) {
        return new JAXBElement<Partner>(_Partner_QNAME, Partner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetCustomerRequestModel")
    public JAXBElement<GetCustomerRequestModel> createGetCustomerRequestModel(GetCustomerRequestModel value) {
        return new JAXBElement<GetCustomerRequestModel>(_GetCustomerRequestModel_QNAME, GetCustomerRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SuspendAccountRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SuspendAccountRequestModel")
    public JAXBElement<SuspendAccountRequestModel> createSuspendAccountRequestModel(SuspendAccountRequestModel value) {
        return new JAXBElement<SuspendAccountRequestModel>(_SuspendAccountRequestModel_QNAME, SuspendAccountRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerTypeEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Customer", name = "CustomerTypeEnum")
    public JAXBElement<CustomerTypeEnum> createCustomerTypeEnum(CustomerTypeEnum value) {
        return new JAXBElement<CustomerTypeEnum>(_CustomerTypeEnum_QNAME, CustomerTypeEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "CrmProduct")
    public JAXBElement<CrmProduct> createCrmProduct(CrmProduct value) {
        return new JAXBElement<CrmProduct>(_CrmProduct_QNAME, CrmProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "CrmNumber")
    public JAXBElement<CrmNumber> createCrmNumber(CrmNumber value) {
        return new JAXBElement<CrmNumber>(_CrmNumber_QNAME, CrmNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumbersFromPoolRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetNumbersFromPoolRequestModel")
    public JAXBElement<GetNumbersFromPoolRequestModel> createGetNumbersFromPoolRequestModel(GetNumbersFromPoolRequestModel value) {
        return new JAXBElement<GetNumbersFromPoolRequestModel>(_GetNumbersFromPoolRequestModel_QNAME, GetNumbersFromPoolRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStockItemOuidRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "QueryStockItemOuidRequestModel")
    public JAXBElement<QueryStockItemOuidRequestModel> createQueryStockItemOuidRequestModel(QueryStockItemOuidRequestModel value) {
        return new JAXBElement<QueryStockItemOuidRequestModel>(_QueryStockItemOuidRequestModel_QNAME, QueryStockItemOuidRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigrateAccountResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "MigrateAccountResponseModel")
    public JAXBElement<MigrateAccountResponseModel> createMigrateAccountResponseModel(MigrateAccountResponseModel value) {
        return new JAXBElement<MigrateAccountResponseModel>(_MigrateAccountResponseModel_QNAME, MigrateAccountResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessSuspendedContractsResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ProcessSuspendedContractsResponseModel")
    public JAXBElement<ProcessSuspendedContractsResponseModel> createProcessSuspendedContractsResponseModel(ProcessSuspendedContractsResponseModel value) {
        return new JAXBElement<ProcessSuspendedContractsResponseModel>(_ProcessSuspendedContractsResponseModel_QNAME, ProcessSuspendedContractsResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UserResponseModel")
    public JAXBElement<UserResponseModel> createUserResponseModel(UserResponseModel value) {
        return new JAXBElement<UserResponseModel>(_UserResponseModel_QNAME, UserResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ArrayOfCrmNumber")
    public JAXBElement<ArrayOfCrmNumber> createArrayOfCrmNumber(ArrayOfCrmNumber value) {
        return new JAXBElement<ArrayOfCrmNumber>(_ArrayOfCrmNumber_QNAME, ArrayOfCrmNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractedNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ContractedNumber")
    public JAXBElement<ContractedNumber> createContractedNumber(ContractedNumber value) {
        return new JAXBElement<ContractedNumber>(_ContractedNumber_QNAME, ContractedNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigratePartyRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "MigratePartyRequestModel")
    public JAXBElement<MigratePartyRequestModel> createMigratePartyRequestModel(MigratePartyRequestModel value) {
        return new JAXBElement<MigratePartyRequestModel>(_MigratePartyRequestModel_QNAME, MigratePartyRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeNumberPoolItemStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ChangeNumberPoolItemStatusResponseModel")
    public JAXBElement<ChangeNumberPoolItemStatusResponseModel> createChangeNumberPoolItemStatusResponseModel(ChangeNumberPoolItemStatusResponseModel value) {
        return new JAXBElement<ChangeNumberPoolItemStatusResponseModel>(_ChangeNumberPoolItemStatusResponseModel_QNAME, ChangeNumberPoolItemStatusResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", name = "ArrayOfCrmDocument")
    public JAXBElement<ArrayOfCrmDocument> createArrayOfCrmDocument(ArrayOfCrmDocument value) {
        return new JAXBElement<ArrayOfCrmDocument>(_ArrayOfCrmDocument_QNAME, ArrayOfCrmDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryCustomerResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "QueryCustomerResponseModel")
    public JAXBElement<QueryCustomerResponseModel> createQueryCustomerResponseModel(QueryCustomerResponseModel value) {
        return new JAXBElement<QueryCustomerResponseModel>(_QueryCustomerResponseModel_QNAME, QueryCustomerResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateAccountRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "DeactivateAccountRequestModel")
    public JAXBElement<DeactivateAccountRequestModel> createDeactivateAccountRequestModel(DeactivateAccountRequestModel value) {
        return new JAXBElement<DeactivateAccountRequestModel>(_DeactivateAccountRequestModel_QNAME, DeactivateAccountRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignNumberPoolItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AssignNumberPoolItemRequestModel")
    public JAXBElement<AssignNumberPoolItemRequestModel> createAssignNumberPoolItemRequestModel(AssignNumberPoolItemRequestModel value) {
        return new JAXBElement<AssignNumberPoolItemRequestModel>(_AssignNumberPoolItemRequestModel_QNAME, AssignNumberPoolItemRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SuspendCustomerContractRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SuspendCustomerContractRequestModel")
    public JAXBElement<SuspendCustomerContractRequestModel> createSuspendCustomerContractRequestModel(SuspendCustomerContractRequestModel value) {
        return new JAXBElement<SuspendCustomerContractRequestModel>(_SuspendCustomerContractRequestModel_QNAME, SuspendCustomerContractRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumbersFromPoolResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetNumbersFromPoolResponseModel")
    public JAXBElement<GetNumbersFromPoolResponseModel> createGetNumbersFromPoolResponseModel(GetNumbersFromPoolResponseModel value) {
        return new JAXBElement<GetNumbersFromPoolResponseModel>(_GetNumbersFromPoolResponseModel_QNAME, GetNumbersFromPoolResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateCustomerContractResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ActivateCustomerContractResponseModel")
    public JAXBElement<ActivateCustomerContractResponseModel> createActivateCustomerContractResponseModel(ActivateCustomerContractResponseModel value) {
        return new JAXBElement<ActivateCustomerContractResponseModel>(_ActivateCustomerContractResponseModel_QNAME, ActivateCustomerContractResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStockItemStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ChangeStockItemStatusResponseModel")
    public JAXBElement<ChangeStockItemStatusResponseModel> createChangeStockItemStatusResponseModel(ChangeStockItemStatusResponseModel value) {
        return new JAXBElement<ChangeStockItemStatusResponseModel>(_ChangeStockItemStatusResponseModel_QNAME, ChangeStockItemStatusResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "DeleteUserResult", scope = DeleteUserResponse.class)
    public JAXBElement<UserResponseModel> createDeleteUserResponseDeleteUserResult(UserResponseModel value) {
        return new JAXBElement<UserResponseModel>(_DeleteUserResponseDeleteUserResult_QNAME, UserResponseModel.class, DeleteUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuspendCustomerContractResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SuspendCustomerContractResult", scope = SuspendCustomerContractResponse.class)
    public JAXBElement<SuspendCustomerContractResponseModel> createSuspendCustomerContractResponseSuspendCustomerContractResult(SuspendCustomerContractResponseModel value) {
        return new JAXBElement<SuspendCustomerContractResponseModel>(_SuspendCustomerContractResponseSuspendCustomerContractResult_QNAME, SuspendCustomerContractResponseModel.class, SuspendCustomerContractResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Number", scope = ReleaseNumberPoolItemRequestModel.class)
    public JAXBElement<String> createReleaseNumberPoolItemRequestModelNumber(String value) {
        return new JAXBElement<String>(_AssignNumberPoolItemRequestModelNumber_QNAME, String.class, ReleaseNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Username", scope = ReleaseNumberPoolItemRequestModel.class)
    public JAXBElement<String> createReleaseNumberPoolItemRequestModelUsername(String value) {
        return new JAXBElement<String>(_AssignNumberPoolItemRequestModelUsername_QNAME, String.class, ReleaseNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuspendCustomerContractRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = SuspendCustomerContract.class)
    public JAXBElement<SuspendCustomerContractRequestModel> createSuspendCustomerContractRequest(SuspendCustomerContractRequestModel value) {
        return new JAXBElement<SuspendCustomerContractRequestModel>(_SuspendCustomerContractRequest_QNAME, SuspendCustomerContractRequestModel.class, SuspendCustomerContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "WorkPhone", scope = CrmContact.class)
    public JAXBElement<String> createCrmContactWorkPhone(String value) {
        return new JAXBElement<String>(_CrmContactWorkPhone_QNAME, String.class, CrmContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Emails", scope = CrmContact.class)
    public JAXBElement<ArrayOfCrmEmail> createCrmContactEmails(ArrayOfCrmEmail value) {
        return new JAXBElement<ArrayOfCrmEmail>(_CrmContactEmails_QNAME, ArrayOfCrmEmail.class, CrmContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmPhone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Phones", scope = CrmContact.class)
    public JAXBElement<ArrayOfCrmPhone> createCrmContactPhones(ArrayOfCrmPhone value) {
        return new JAXBElement<ArrayOfCrmPhone>(_CrmContactPhones_QNAME, ArrayOfCrmPhone.class, CrmContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Name", scope = CrmContact.class)
    public JAXBElement<String> createCrmContactName(String value) {
        return new JAXBElement<String>(_CrmContactName_QNAME, String.class, CrmContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Adddresses", scope = CrmContact.class)
    public JAXBElement<ArrayOfCrmAddress> createCrmContactAdddresses(ArrayOfCrmAddress value) {
        return new JAXBElement<ArrayOfCrmAddress>(_CrmContactAdddresses_QNAME, ArrayOfCrmAddress.class, CrmContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Email", scope = CrmContact.class)
    public JAXBElement<String> createCrmContactEmail(String value) {
        return new JAXBElement<String>(_CrmContactEmail_QNAME, String.class, CrmContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Surname", scope = CrmContact.class)
    public JAXBElement<String> createCrmContactSurname(String value) {
        return new JAXBElement<String>(_CrmContactSurname_QNAME, String.class, CrmContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "MobilePhone", scope = CrmContact.class)
    public JAXBElement<String> createCrmContactMobilePhone(String value) {
        return new JAXBElement<String>(_CrmContactMobilePhone_QNAME, String.class, CrmContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryCustomerRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = QueryCustomer.class)
    public JAXBElement<QueryCustomerRequestModel> createQueryCustomerRequest(QueryCustomerRequestModel value) {
        return new JAXBElement<QueryCustomerRequestModel>(_SuspendCustomerContractRequest_QNAME, QueryCustomerRequestModel.class, QueryCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryCustomerResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "QueryCustomerResult", scope = QueryCustomerResponse.class)
    public JAXBElement<QueryCustomerResponseModel> createQueryCustomerResponseQueryCustomerResult(QueryCustomerResponseModel value) {
        return new JAXBElement<QueryCustomerResponseModel>(_QueryCustomerResponseQueryCustomerResult_QNAME, QueryCustomerResponseModel.class, QueryCustomerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseStockItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ReleaseStockItem.class)
    public JAXBElement<ReleaseStockItemRequestModel> createReleaseStockItemRequest(ReleaseStockItemRequestModel value) {
        return new JAXBElement<ReleaseStockItemRequestModel>(_SuspendCustomerContractRequest_QNAME, ReleaseStockItemRequestModel.class, ReleaseStockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryNumberPoolItemResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "QueryNumberPoolItemResult", scope = QueryNumberPoolItemResponse.class)
    public JAXBElement<QueryNumberPoolItemResponseModel> createQueryNumberPoolItemResponseQueryNumberPoolItemResult(QueryNumberPoolItemResponseModel value) {
        return new JAXBElement<QueryNumberPoolItemResponseModel>(_QueryNumberPoolItemResponseQueryNumberPoolItemResult_QNAME, QueryNumberPoolItemResponseModel.class, QueryNumberPoolItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateAccountRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ActivateAccount.class)
    public JAXBElement<ActivateAccountRequestModel> createActivateAccountRequest(ActivateAccountRequestModel value) {
        return new JAXBElement<ActivateAccountRequestModel>(_SuspendCustomerContractRequest_QNAME, ActivateAccountRequestModel.class, ActivateAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountPartyCodeResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetAccountPartyCodeResult", scope = GetAccountPartyCodeResponse.class)
    public JAXBElement<GetAccountPartyCodeResponseModel> createGetAccountPartyCodeResponseGetAccountPartyCodeResult(GetAccountPartyCodeResponseModel value) {
        return new JAXBElement<GetAccountPartyCodeResponseModel>(_GetAccountPartyCodeResponseGetAccountPartyCodeResult_QNAME, GetAccountPartyCodeResponseModel.class, GetAccountPartyCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Customer", scope = QueryCustomerResponseModel.class)
    public JAXBElement<Customer> createQueryCustomerResponseModelCustomer(Customer value) {
        return new JAXBElement<Customer>(_QueryCustomerResponseModelCustomer_QNAME, Customer.class, QueryCustomerResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "FatherName", scope = CrmReturnAccount.class)
    public JAXBElement<String> createCrmReturnAccountFatherName(String value) {
        return new JAXBElement<String>(_CrmReturnAccountFatherName_QNAME, String.class, CrmReturnAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "MobilePhone", scope = CrmReturnAccount.class)
    public JAXBElement<String> createCrmReturnAccountMobilePhone(String value) {
        return new JAXBElement<String>(_CrmContactMobilePhone_QNAME, String.class, CrmReturnAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Iban", scope = CrmReturnAccount.class)
    public JAXBElement<String> createCrmReturnAccountIban(String value) {
        return new JAXBElement<String>(_CrmReturnAccountIban_QNAME, String.class, CrmReturnAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "NeighborhoodCode", scope = CrmAddress.class)
    public JAXBElement<String> createCrmAddressNeighborhoodCode(String value) {
        return new JAXBElement<String>(_CrmAddressNeighborhoodCode_QNAME, String.class, CrmAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "CityCode", scope = CrmAddress.class)
    public JAXBElement<String> createCrmAddressCityCode(String value) {
        return new JAXBElement<String>(_CrmAddressCityCode_QNAME, String.class, CrmAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Village", scope = CrmAddress.class)
    public JAXBElement<String> createCrmAddressVillage(String value) {
        return new JAXBElement<String>(_CrmAddressVillage_QNAME, String.class, CrmAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "IndependentParts", scope = CrmAddress.class)
    public JAXBElement<String> createCrmAddressIndependentParts(String value) {
        return new JAXBElement<String>(_CrmAddressIndependentParts_QNAME, String.class, CrmAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "City", scope = CrmAddress.class)
    public JAXBElement<String> createCrmAddressCity(String value) {
        return new JAXBElement<String>(_CrmAddressCity_QNAME, String.class, CrmAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "County", scope = CrmAddress.class)
    public JAXBElement<String> createCrmAddressCounty(String value) {
        return new JAXBElement<String>(_CrmAddressCounty_QNAME, String.class, CrmAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Neighborhood", scope = CrmAddress.class)
    public JAXBElement<String> createCrmAddressNeighborhood(String value) {
        return new JAXBElement<String>(_CrmAddressNeighborhood_QNAME, String.class, CrmAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Name", scope = CrmAddress.class)
    public JAXBElement<String> createCrmAddressName(String value) {
        return new JAXBElement<String>(_CrmContactName_QNAME, String.class, CrmAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "VillageCode", scope = CrmAddress.class)
    public JAXBElement<String> createCrmAddressVillageCode(String value) {
        return new JAXBElement<String>(_CrmAddressVillageCode_QNAME, String.class, CrmAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "CountyCode", scope = CrmAddress.class)
    public JAXBElement<String> createCrmAddressCountyCode(String value) {
        return new JAXBElement<String>(_CrmAddressCountyCode_QNAME, String.class, CrmAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "District", scope = CrmAddress.class)
    public JAXBElement<String> createCrmAddressDistrict(String value) {
        return new JAXBElement<String>(_CrmAddressDistrict_QNAME, String.class, CrmAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "BuildingCode", scope = CrmAddress.class)
    public JAXBElement<String> createCrmAddressBuildingCode(String value) {
        return new JAXBElement<String>(_CrmAddressBuildingCode_QNAME, String.class, CrmAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "BuildingName", scope = CrmAddress.class)
    public JAXBElement<String> createCrmAddressBuildingName(String value) {
        return new JAXBElement<String>(_CrmAddressBuildingName_QNAME, String.class, CrmAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "BuildingNumber", scope = CrmAddress.class)
    public JAXBElement<String> createCrmAddressBuildingNumber(String value) {
        return new JAXBElement<String>(_CrmAddressBuildingNumber_QNAME, String.class, CrmAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "IndependentPartsCode", scope = CrmAddress.class)
    public JAXBElement<String> createCrmAddressIndependentPartsCode(String value) {
        return new JAXBElement<String>(_CrmAddressIndependentPartsCode_QNAME, String.class, CrmAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "DistrictCode", scope = CrmAddress.class)
    public JAXBElement<String> createCrmAddressDistrictCode(String value) {
        return new JAXBElement<String>(_CrmAddressDistrictCode_QNAME, String.class, CrmAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStockItemOuidResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "QueryStockItemOuidResult", scope = QueryStockItemOuidResponse.class)
    public JAXBElement<QueryStockItemOuidResponseModel> createQueryStockItemOuidResponseQueryStockItemOuidResult(QueryStockItemOuidResponseModel value) {
        return new JAXBElement<QueryStockItemOuidResponseModel>(_QueryStockItemOuidResponseQueryStockItemOuidResult_QNAME, QueryStockItemOuidResponseModel.class, QueryStockItemOuidResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuspendAccountResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SuspendAccountResult", scope = SuspendAccountResponse.class)
    public JAXBElement<SuspendAccountResponseModel> createSuspendAccountResponseSuspendAccountResult(SuspendAccountResponseModel value) {
        return new JAXBElement<SuspendAccountResponseModel>(_SuspendAccountResponseSuspendAccountResult_QNAME, SuspendAccountResponseModel.class, SuspendAccountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStockItemStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ReleaseStockItemResult", scope = ReleaseStockItemResponse.class)
    public JAXBElement<ChangeStockItemStatusResponseModel> createReleaseStockItemResponseReleaseStockItemResult(ChangeStockItemStatusResponseModel value) {
        return new JAXBElement<ChangeStockItemStatusResponseModel>(_ReleaseStockItemResponseReleaseStockItemResult_QNAME, ChangeStockItemStatusResponseModel.class, ReleaseStockItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ConfirmPassword", scope = User.class)
    public JAXBElement<String> createUserConfirmPassword(String value) {
        return new JAXBElement<String>(_UserConfirmPassword_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Password", scope = User.class)
    public JAXBElement<String> createUserPassword(String value) {
        return new JAXBElement<String>(_UserPassword_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "FullName", scope = User.class)
    public JAXBElement<String> createUserFullName(String value) {
        return new JAXBElement<String>(_UserFullName_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Email", scope = User.class)
    public JAXBElement<String> createUserEmail(String value) {
        return new JAXBElement<String>(_CrmContactEmail_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "UserName", scope = User.class)
    public JAXBElement<String> createUserUserName(String value) {
        return new JAXBElement<String>(_UserUserName_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStockItemStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AssignStockItemResult", scope = AssignStockItemResponse.class)
    public JAXBElement<ChangeStockItemStatusResponseModel> createAssignStockItemResponseAssignStockItemResult(ChangeStockItemStatusResponseModel value) {
        return new JAXBElement<ChangeStockItemStatusResponseModel>(_AssignStockItemResponseAssignStockItemResult_QNAME, ChangeStockItemStatusResponseModel.class, AssignStockItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigratePartyResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "MigratePartyResult", scope = MigratePartyResponse.class)
    public JAXBElement<MigratePartyResponseModel> createMigratePartyResponseMigratePartyResult(MigratePartyResponseModel value) {
        return new JAXBElement<MigratePartyResponseModel>(_MigratePartyResponseMigratePartyResult_QNAME, MigratePartyResponseModel.class, MigratePartyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveStockItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ReserveStockItem.class)
    public JAXBElement<ReserveStockItemRequestModel> createReserveStockItemRequest(ReserveStockItemRequestModel value) {
        return new JAXBElement<ReserveStockItemRequestModel>(_SuspendCustomerContractRequest_QNAME, ReserveStockItemRequestModel.class, ReserveStockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNumberPoolItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Numbers", scope = GetNumbersFromPoolResponseModel.class)
    public JAXBElement<ArrayOfNumberPoolItem> createGetNumbersFromPoolResponseModelNumbers(ArrayOfNumberPoolItem value) {
        return new JAXBElement<ArrayOfNumberPoolItem>(_GetNumbersFromPoolResponseModelNumbers_QNAME, ArrayOfNumberPoolItem.class, GetNumbersFromPoolResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPartnerResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetPartnerResult", scope = GetPartnerResponse.class)
    public JAXBElement<GetPartnerResponseModel> createGetPartnerResponseGetPartnerResult(GetPartnerResponseModel value) {
        return new JAXBElement<GetPartnerResponseModel>(_GetPartnerResponseGetPartnerResult_QNAME, GetPartnerResponseModel.class, GetPartnerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateCustomerContractResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "DeactivateCustomerContractResult", scope = DeactivateCustomerContractResponse.class)
    public JAXBElement<DeactivateCustomerContractResponseModel> createDeactivateCustomerContractResponseDeactivateCustomerContractResult(DeactivateCustomerContractResponseModel value) {
        return new JAXBElement<DeactivateCustomerContractResponseModel>(_DeactivateCustomerContractResponseDeactivateCustomerContractResult_QNAME, DeactivateCustomerContractResponseModel.class, DeactivateCustomerContractResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStockItemStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ReserveStockItemResult", scope = ReserveStockItemResponse.class)
    public JAXBElement<ChangeStockItemStatusResponseModel> createReserveStockItemResponseReserveStockItemResult(ChangeStockItemStatusResponseModel value) {
        return new JAXBElement<ChangeStockItemStatusResponseModel>(_ReserveStockItemResponseReserveStockItemResult_QNAME, ChangeStockItemStatusResponseModel.class, ReserveStockItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNumbersToContractRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = AddNumbersToContract.class)
    public JAXBElement<AddNumbersToContractRequestModel> createAddNumbersToContractRequest(AddNumbersToContractRequestModel value) {
        return new JAXBElement<AddNumbersToContractRequestModel>(_SuspendCustomerContractRequest_QNAME, AddNumbersToContractRequestModel.class, AddNumbersToContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRMProvisionRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ProvisionOrderToCRM.class)
    public JAXBElement<CRMProvisionRequestModel> createProvisionOrderToCRMRequest(CRMProvisionRequestModel value) {
        return new JAXBElement<CRMProvisionRequestModel>(_SuspendCustomerContractRequest_QNAME, CRMProvisionRequestModel.class, ProvisionOrderToCRM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Number", scope = BlockNumberPoolItemRequestModel.class)
    public JAXBElement<String> createBlockNumberPoolItemRequestModelNumber(String value) {
        return new JAXBElement<String>(_AssignNumberPoolItemRequestModelNumber_QNAME, String.class, BlockNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Username", scope = BlockNumberPoolItemRequestModel.class)
    public JAXBElement<String> createBlockNumberPoolItemRequestModelUsername(String value) {
        return new JAXBElement<String>(_AssignNumberPoolItemRequestModelUsername_QNAME, String.class, BlockNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Products", scope = CrmContract.class)
    public JAXBElement<ArrayOfCrmProduct> createCrmContractProducts(ArrayOfCrmProduct value) {
        return new JAXBElement<ArrayOfCrmProduct>(_CrmContractProducts_QNAME, ArrayOfCrmProduct.class, CrmContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "MigrateInfo", scope = CrmContract.class)
    public JAXBElement<String> createCrmContractMigrateInfo(String value) {
        return new JAXBElement<String>(_CrmContractMigrateInfo_QNAME, String.class, CrmContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "StatusReason", scope = CrmContract.class)
    public JAXBElement<String> createCrmContractStatusReason(String value) {
        return new JAXBElement<String>(_CrmContractStatusReason_QNAME, String.class, CrmContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ContractCode", scope = CrmContract.class)
    public JAXBElement<String> createCrmContractContractCode(String value) {
        return new JAXBElement<String>(_CrmContractContractCode_QNAME, String.class, CrmContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "BillingContractNumber", scope = CrmContract.class)
    public JAXBElement<String> createCrmContractBillingContractNumber(String value) {
        return new JAXBElement<String>(_CrmContractBillingContractNumber_QNAME, String.class, CrmContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Partner", scope = CrmContract.class)
    public JAXBElement<String> createCrmContractPartner(String value) {
        return new JAXBElement<String>(_Partner_QNAME, String.class, CrmContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Partner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Partner", scope = GetPartnerResponseModel.class)
    public JAXBElement<Partner> createGetPartnerResponseModelPartner(Partner value) {
        return new JAXBElement<Partner>(_GetPartnerResponseModelPartner_QNAME, Partner.class, GetPartnerResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuspendAccountRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = SuspendAccount.class)
    public JAXBElement<SuspendAccountRequestModel> createSuspendAccountRequest(SuspendAccountRequestModel value) {
        return new JAXBElement<SuspendAccountRequestModel>(_SuspendCustomerContractRequest_QNAME, SuspendAccountRequestModel.class, SuspendAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "RelatedIdentification", scope = GetNumbersFromPoolRequestModel.class)
    public JAXBElement<String> createGetNumbersFromPoolRequestModelRelatedIdentification(String value) {
        return new JAXBElement<String>(_GetNumbersFromPoolRequestModelRelatedIdentification_QNAME, String.class, GetNumbersFromPoolRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ContractCode", scope = DeactivateCustomerContractRequestModel.class)
    public JAXBElement<String> createDeactivateCustomerContractRequestModelContractCode(String value) {
        return new JAXBElement<String>(_AssignNumberPoolItemRequestModelContractCode_QNAME, String.class, DeactivateCustomerContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Status", scope = DeactivateCustomerContractRequestModel.class)
    public JAXBElement<String> createDeactivateCustomerContractRequestModelStatus(String value) {
        return new JAXBElement<String>(_DeactivateCustomerContractRequestModelStatus_QNAME, String.class, DeactivateCustomerContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "StatusReasonDef", scope = DeactivateCustomerContractRequestModel.class)
    public JAXBElement<String> createDeactivateCustomerContractRequestModelStatusReasonDef(String value) {
        return new JAXBElement<String>(_DeactivateCustomerContractRequestModelStatusReasonDef_QNAME, String.class, DeactivateCustomerContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Application", scope = DeactivateCustomerContractRequestModel.class)
    public JAXBElement<String> createDeactivateCustomerContractRequestModelApplication(String value) {
        return new JAXBElement<String>(_DeactivateCustomerContractRequestModelApplication_QNAME, String.class, DeactivateCustomerContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumbersFromPoolRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = GetNumbersFromPool.class)
    public JAXBElement<GetNumbersFromPoolRequestModel> createGetNumbersFromPoolRequest(GetNumbersFromPoolRequestModel value) {
        return new JAXBElement<GetNumbersFromPoolRequestModel>(_SuspendCustomerContractRequest_QNAME, GetNumbersFromPoolRequestModel.class, GetNumbersFromPool.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ContractCode", scope = ActivateCustomerContractRequestModel.class)
    public JAXBElement<String> createActivateCustomerContractRequestModelContractCode(String value) {
        return new JAXBElement<String>(_AssignNumberPoolItemRequestModelContractCode_QNAME, String.class, ActivateCustomerContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Status", scope = ActivateCustomerContractRequestModel.class)
    public JAXBElement<String> createActivateCustomerContractRequestModelStatus(String value) {
        return new JAXBElement<String>(_DeactivateCustomerContractRequestModelStatus_QNAME, String.class, ActivateCustomerContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "StatusReasonDef", scope = ActivateCustomerContractRequestModel.class)
    public JAXBElement<String> createActivateCustomerContractRequestModelStatusReasonDef(String value) {
        return new JAXBElement<String>(_DeactivateCustomerContractRequestModelStatusReasonDef_QNAME, String.class, ActivateCustomerContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Application", scope = ActivateCustomerContractRequestModel.class)
    public JAXBElement<String> createActivateCustomerContractRequestModelApplication(String value) {
        return new JAXBElement<String>(_DeactivateCustomerContractRequestModelApplication_QNAME, String.class, ActivateCustomerContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "User", scope = UserRequestModel.class)
    public JAXBElement<User> createUserRequestModelUser(User value) {
        return new JAXBElement<User>(_UserRequestModelUser_QNAME, User.class, UserRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Code", scope = MigratePartyResponseModel.class)
    public JAXBElement<String> createMigratePartyResponseModelCode(String value) {
        return new JAXBElement<String>(_MigratePartyResponseModelCode_QNAME, String.class, MigratePartyResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SerialNumber", scope = AssignStockItemRequestModel.class)
    public JAXBElement<String> createAssignStockItemRequestModelSerialNumber(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelSerialNumber_QNAME, String.class, AssignStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Username", scope = AssignStockItemRequestModel.class)
    public JAXBElement<String> createAssignStockItemRequestModelUsername(String value) {
        return new JAXBElement<String>(_AssignNumberPoolItemRequestModelUsername_QNAME, String.class, AssignStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "IdentificationNumber", scope = AssignStockItemRequestModel.class)
    public JAXBElement<String> createAssignStockItemRequestModelIdentificationNumber(String value) {
        return new JAXBElement<String>(_AssignNumberPoolItemRequestModelIdentificationNumber_QNAME, String.class, AssignStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStockItemOuidRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = QueryStockItemOuid.class)
    public JAXBElement<QueryStockItemOuidRequestModel> createQueryStockItemOuidRequest(QueryStockItemOuidRequestModel value) {
        return new JAXBElement<QueryStockItemOuidRequestModel>(_SuspendCustomerContractRequest_QNAME, QueryStockItemOuidRequestModel.class, QueryStockItemOuid.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberPoolItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "NumberPoolItem", scope = QueryNumberPoolItemResponseModel.class)
    public JAXBElement<NumberPoolItem> createQueryNumberPoolItemResponseModelNumberPoolItem(NumberPoolItem value) {
        return new JAXBElement<NumberPoolItem>(_QueryNumberPoolItemResponseModelNumberPoolItem_QNAME, NumberPoolItem.class, QueryNumberPoolItemResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "OrderRequestCode", scope = CRMProvisionRequestModel.class)
    public JAXBElement<String> createCRMProvisionRequestModelOrderRequestCode(String value) {
        return new JAXBElement<String>(_CRMProvisionRequestModelOrderRequestCode_QNAME, String.class, CRMProvisionRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "CustomerType", scope = NumberPoolItem.class)
    public JAXBElement<String> createNumberPoolItemCustomerType(String value) {
        return new JAXBElement<String>(_NumberPoolItemCustomerType_QNAME, String.class, NumberPoolItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Number", scope = NumberPoolItem.class)
    public JAXBElement<String> createNumberPoolItemNumber(String value) {
        return new JAXBElement<String>(_NumberPoolItemNumber_QNAME, String.class, NumberPoolItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeNumberPoolItemStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AssignNumberPoolItemResult", scope = AssignNumberPoolItemResponse.class)
    public JAXBElement<ChangeNumberPoolItemStatusResponseModel> createAssignNumberPoolItemResponseAssignNumberPoolItemResult(ChangeNumberPoolItemStatusResponseModel value) {
        return new JAXBElement<ChangeNumberPoolItemStatusResponseModel>(_AssignNumberPoolItemResponseAssignNumberPoolItemResult_QNAME, ChangeNumberPoolItemStatusResponseModel.class, AssignNumberPoolItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SerialNumber", scope = ReserveStockItemRequestModel.class)
    public JAXBElement<String> createReserveStockItemRequestModelSerialNumber(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelSerialNumber_QNAME, String.class, ReserveStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Username", scope = ReserveStockItemRequestModel.class)
    public JAXBElement<String> createReserveStockItemRequestModelUsername(String value) {
        return new JAXBElement<String>(_AssignNumberPoolItemRequestModelUsername_QNAME, String.class, ReserveStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "IdentificationNumber", scope = ReserveStockItemRequestModel.class)
    public JAXBElement<String> createReserveStockItemRequestModelIdentificationNumber(String value) {
        return new JAXBElement<String>(_AssignNumberPoolItemRequestModelIdentificationNumber_QNAME, String.class, ReserveStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SerialNumber", scope = QueryStockItemRequestModel.class)
    public JAXBElement<String> createQueryStockItemRequestModelSerialNumber(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelSerialNumber_QNAME, String.class, QueryStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", name = "Url", scope = CrmDocument.class)
    public JAXBElement<String> createCrmDocumentUrl(String value) {
        return new JAXBElement<String>(_CrmDocumentUrl_QNAME, String.class, CrmDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", name = "Name", scope = CrmDocument.class)
    public JAXBElement<String> createCrmDocumentName(String value) {
        return new JAXBElement<String>(_CrmDocumentName_QNAME, String.class, CrmDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", name = "Code", scope = CrmDocument.class)
    public JAXBElement<String> createCrmDocumentCode(String value) {
        return new JAXBElement<String>(_CrmDocumentCode_QNAME, String.class, CrmDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeNumberPoolItemStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UnavailableNumberPoolItemResult", scope = UnavailableNumberPoolItemResponse.class)
    public JAXBElement<ChangeNumberPoolItemStatusResponseModel> createUnavailableNumberPoolItemResponseUnavailableNumberPoolItemResult(ChangeNumberPoolItemStatusResponseModel value) {
        return new JAXBElement<ChangeNumberPoolItemStatusResponseModel>(_UnavailableNumberPoolItemResponseUnavailableNumberPoolItemResult_QNAME, ChangeNumberPoolItemStatusResponseModel.class, UnavailableNumberPoolItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UpdateUserResult", scope = UpdateUserResponse.class)
    public JAXBElement<UserResponseModel> createUpdateUserResponseUpdateUserResult(UserResponseModel value) {
        return new JAXBElement<UserResponseModel>(_UpdateUserResponseUpdateUserResult_QNAME, UserResponseModel.class, UpdateUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigrateAccountRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = MigrateAccount.class)
    public JAXBElement<MigrateAccountRequestModel> createMigrateAccountRequest(MigrateAccountRequestModel value) {
        return new JAXBElement<MigrateAccountRequestModel>(_SuspendCustomerContractRequest_QNAME, MigrateAccountRequestModel.class, MigrateAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveDopingBoxProductResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "RemoveDopingBoxProductResult", scope = RemoveDopingBoxProductResponse.class)
    public JAXBElement<RemoveDopingBoxProductResponseModel> createRemoveDopingBoxProductResponseRemoveDopingBoxProductResult(RemoveDopingBoxProductResponseModel value) {
        return new JAXBElement<RemoveDopingBoxProductResponseModel>(_RemoveDopingBoxProductResponseRemoveDopingBoxProductResult_QNAME, RemoveDopingBoxProductResponseModel.class, RemoveDopingBoxProductResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateCustomerContractRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ActivateCustomerContract.class)
    public JAXBElement<ActivateCustomerContractRequestModel> createActivateCustomerContractRequest(ActivateCustomerContractRequestModel value) {
        return new JAXBElement<ActivateCustomerContractRequestModel>(_SuspendCustomerContractRequest_QNAME, ActivateCustomerContractRequestModel.class, ActivateCustomerContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractedNumbersInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "NumbersInfo", scope = AddNumbersToContractRequestModel.class)
    public JAXBElement<ContractedNumbersInfo> createAddNumbersToContractRequestModelNumbersInfo(ContractedNumbersInfo value) {
        return new JAXBElement<ContractedNumbersInfo>(_AddNumbersToContractRequestModelNumbersInfo_QNAME, ContractedNumbersInfo.class, AddNumbersToContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = AddUser.class)
    public JAXBElement<UserRequestModel> createAddUserRequest(UserRequestModel value) {
        return new JAXBElement<UserRequestModel>(_SuspendCustomerContractRequest_QNAME, UserRequestModel.class, AddUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessSuspendedContractsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ProcessSuspendedContracts.class)
    public JAXBElement<ProcessSuspendedContractsRequestModel> createProcessSuspendedContractsRequest(ProcessSuspendedContractsRequestModel value) {
        return new JAXBElement<ProcessSuspendedContractsRequestModel>(_SuspendCustomerContractRequest_QNAME, ProcessSuspendedContractsRequestModel.class, ProcessSuspendedContracts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeNumberPoolItemStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ReleaseNumberPoolItemResult", scope = ReleaseNumberPoolItemResponse.class)
    public JAXBElement<ChangeNumberPoolItemStatusResponseModel> createReleaseNumberPoolItemResponseReleaseNumberPoolItemResult(ChangeNumberPoolItemStatusResponseModel value) {
        return new JAXBElement<ChangeNumberPoolItemStatusResponseModel>(_ReleaseNumberPoolItemResponseReleaseNumberPoolItemResult_QNAME, ChangeNumberPoolItemStatusResponseModel.class, ReleaseNumberPoolItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddUserResult", scope = AddUserResponse.class)
    public JAXBElement<UserResponseModel> createAddUserResponseAddUserResult(UserResponseModel value) {
        return new JAXBElement<UserResponseModel>(_AddUserResponseAddUserResult_QNAME, UserResponseModel.class, AddUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigrateAccountResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "MigrateAccountResult", scope = MigrateAccountResponse.class)
    public JAXBElement<MigrateAccountResponseModel> createMigrateAccountResponseMigrateAccountResult(MigrateAccountResponseModel value) {
        return new JAXBElement<MigrateAccountResponseModel>(_MigrateAccountResponseMigrateAccountResult_QNAME, MigrateAccountResponseModel.class, MigrateAccountResponse.class, value);
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
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Number", scope = ReserveNumberPoolItemRequestModel.class)
    public JAXBElement<String> createReserveNumberPoolItemRequestModelNumber(String value) {
        return new JAXBElement<String>(_AssignNumberPoolItemRequestModelNumber_QNAME, String.class, ReserveNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Username", scope = ReserveNumberPoolItemRequestModel.class)
    public JAXBElement<String> createReserveNumberPoolItemRequestModelUsername(String value) {
        return new JAXBElement<String>(_AssignNumberPoolItemRequestModelUsername_QNAME, String.class, ReserveNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "OrderCode", scope = ReserveNumberPoolItemRequestModel.class)
    public JAXBElement<String> createReserveNumberPoolItemRequestModelOrderCode(String value) {
        return new JAXBElement<String>(_ReserveNumberPoolItemRequestModelOrderCode_QNAME, String.class, ReserveNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "IdentificationNumber", scope = ReserveNumberPoolItemRequestModel.class)
    public JAXBElement<String> createReserveNumberPoolItemRequestModelIdentificationNumber(String value) {
        return new JAXBElement<String>(_AssignNumberPoolItemRequestModelIdentificationNumber_QNAME, String.class, ReserveNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmReturnAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ReturnAccount", scope = CrmAccount.class)
    public JAXBElement<CrmReturnAccount> createCrmAccountReturnAccount(CrmReturnAccount value) {
        return new JAXBElement<CrmReturnAccount>(_CrmAccountReturnAccount_QNAME, CrmReturnAccount.class, CrmAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "BillingCustomerNumber", scope = CrmAccount.class)
    public JAXBElement<String> createCrmAccountBillingCustomerNumber(String value) {
        return new JAXBElement<String>(_CrmAccountBillingCustomerNumber_QNAME, String.class, CrmAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Contracts", scope = CrmAccount.class)
    public JAXBElement<ArrayOfCrmContract> createCrmAccountContracts(ArrayOfCrmContract value) {
        return new JAXBElement<ArrayOfCrmContract>(_CrmAccountContracts_QNAME, ArrayOfCrmContract.class, CrmAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "BillingAddress", scope = CrmAccount.class)
    public JAXBElement<CrmAddress> createCrmAccountBillingAddress(CrmAddress value) {
        return new JAXBElement<CrmAddress>(_CrmAccountBillingAddress_QNAME, CrmAddress.class, CrmAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "AccountName", scope = CrmAccount.class)
    public JAXBElement<String> createCrmAccountAccountName(String value) {
        return new JAXBElement<String>(_CrmAccountAccountName_QNAME, String.class, CrmAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "BBKNumber", scope = CrmAccount.class)
    public JAXBElement<String> createCrmAccountBBKNumber(String value) {
        return new JAXBElement<String>(_CrmAccountBBKNumber_QNAME, String.class, CrmAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "AccountCode", scope = CrmAccount.class)
    public JAXBElement<String> createCrmAccountAccountCode(String value) {
        return new JAXBElement<String>(_CrmAccountAccountCode_QNAME, String.class, CrmAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "TTCustomerNo", scope = CrmAccount.class)
    public JAXBElement<String> createCrmAccountTTCustomerNo(String value) {
        return new JAXBElement<String>(_CrmAccountTTCustomerNo_QNAME, String.class, CrmAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "SoftInvoiceEmail", scope = CrmAccount.class)
    public JAXBElement<String> createCrmAccountSoftInvoiceEmail(String value) {
        return new JAXBElement<String>(_CrmAccountSoftInvoiceEmail_QNAME, String.class, CrmAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeNumberPoolItemStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "BlockNumberPoolItemResult", scope = BlockNumberPoolItemResponse.class)
    public JAXBElement<ChangeNumberPoolItemStatusResponseModel> createBlockNumberPoolItemResponseBlockNumberPoolItemResult(ChangeNumberPoolItemStatusResponseModel value) {
        return new JAXBElement<ChangeNumberPoolItemStatusResponseModel>(_BlockNumberPoolItemResponseBlockNumberPoolItemResult_QNAME, ChangeNumberPoolItemStatusResponseModel.class, BlockNumberPoolItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ValidFrom", scope = CrmProduct.class)
    public JAXBElement<XMLGregorianCalendar> createCrmProductValidFrom(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CrmProductValidFrom_QNAME, XMLGregorianCalendar.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "CatalogId", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductCatalogId(String value) {
        return new JAXBElement<String>(_CrmProductCatalogId_QNAME, String.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Description", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductDescription(String value) {
        return new JAXBElement<String>(_CrmProductDescription_QNAME, String.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "InternetProfile", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductInternetProfile(String value) {
        return new JAXBElement<String>(_CrmProductInternetProfile_QNAME, String.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "XdslNumber", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductXdslNumber(String value) {
        return new JAXBElement<String>(_CrmProductXdslNumber_QNAME, String.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "CatalogName", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductCatalogName(String value) {
        return new JAXBElement<String>(_CrmProductCatalogName_QNAME, String.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "XdslPassword", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductXdslPassword(String value) {
        return new JAXBElement<String>(_CrmProductXdslPassword_QNAME, String.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "PcOfferId", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductPcOfferId(String value) {
        return new JAXBElement<String>(_CrmProductPcOfferId_QNAME, String.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Code", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductCode(String value) {
        return new JAXBElement<String>(_CrmProductCode_QNAME, String.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "MacAddress", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductMacAddress(String value) {
        return new JAXBElement<String>(_CrmProductMacAddress_QNAME, String.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "SerialNumber", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductSerialNumber(String value) {
        return new JAXBElement<String>(_CrmProductSerialNumber_QNAME, String.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "BillingProductId", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductBillingProductId(String value) {
        return new JAXBElement<String>(_CrmProductBillingProductId_QNAME, String.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Name", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductName(String value) {
        return new JAXBElement<String>(_CrmContactName_QNAME, String.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "XdslUsername", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductXdslUsername(String value) {
        return new JAXBElement<String>(_CrmProductXdslUsername_QNAME, String.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "SubModelName", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductSubModelName(String value) {
        return new JAXBElement<String>(_CrmProductSubModelName_QNAME, String.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ProductType", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductProductType(String value) {
        return new JAXBElement<String>(_CrmProductProductType_QNAME, String.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ModelName", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductModelName(String value) {
        return new JAXBElement<String>(_CrmProductModelName_QNAME, String.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "TTCustomerId", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductTTCustomerId(String value) {
        return new JAXBElement<String>(_CrmProductTTCustomerId_QNAME, String.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "StaticIpProductId", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductStaticIpProductId(String value) {
        return new JAXBElement<String>(_CrmProductStaticIpProductId_QNAME, String.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Numbers", scope = CrmProduct.class)
    public JAXBElement<ArrayOfCrmNumber> createCrmProductNumbers(ArrayOfCrmNumber value) {
        return new JAXBElement<ArrayOfCrmNumber>(_CrmProductNumbers_QNAME, ArrayOfCrmNumber.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ValidTo", scope = CrmProduct.class)
    public JAXBElement<XMLGregorianCalendar> createCrmProductValidTo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CrmProductValidTo_QNAME, XMLGregorianCalendar.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Documents", scope = CrmProduct.class)
    public JAXBElement<ArrayOfCrmDocument> createCrmProductDocuments(ArrayOfCrmDocument value) {
        return new JAXBElement<ArrayOfCrmDocument>(_CrmProductDocuments_QNAME, ArrayOfCrmDocument.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "StaticIp", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductStaticIp(String value) {
        return new JAXBElement<String>(_CrmProductStaticIp_QNAME, String.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "BrandName", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductBrandName(String value) {
        return new JAXBElement<String>(_CrmProductBrandName_QNAME, String.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPartnerRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = GetPartner.class)
    public JAXBElement<GetPartnerRequestModel> createGetPartnerRequest(GetPartnerRequestModel value) {
        return new JAXBElement<GetPartnerRequestModel>(_SuspendCustomerContractRequest_QNAME, GetPartnerRequestModel.class, GetPartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigrateContractRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = MigrateContract.class)
    public JAXBElement<MigrateContractRequestModel> createMigrateContractRequest(MigrateContractRequestModel value) {
        return new JAXBElement<MigrateContractRequestModel>(_SuspendCustomerContractRequest_QNAME, MigrateContractRequestModel.class, MigrateContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "SerialNumber", scope = StockItem.class)
    public JAXBElement<String> createStockItemSerialNumber(String value) {
        return new JAXBElement<String>(_CrmProductSerialNumber_QNAME, String.class, StockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ModelName", scope = StockItem.class)
    public JAXBElement<String> createStockItemModelName(String value) {
        return new JAXBElement<String>(_CrmProductModelName_QNAME, String.class, StockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "MACAddress", scope = StockItem.class)
    public JAXBElement<String> createStockItemMACAddress(String value) {
        return new JAXBElement<String>(_StockItemMACAddress_QNAME, String.class, StockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "StockName", scope = StockItem.class)
    public JAXBElement<String> createStockItemStockName(String value) {
        return new JAXBElement<String>(_StockItemStockName_QNAME, String.class, StockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Ouid", scope = StockItem.class)
    public JAXBElement<String> createStockItemOuid(String value) {
        return new JAXBElement<String>(_StockItemOuid_QNAME, String.class, StockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "BrandName", scope = StockItem.class)
    public JAXBElement<String> createStockItemBrandName(String value) {
        return new JAXBElement<String>(_CrmProductBrandName_QNAME, String.class, StockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStockItemResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "QueryStockItemResult", scope = QueryStockItemResponse.class)
    public JAXBElement<QueryStockItemResponseModel> createQueryStockItemResponseQueryStockItemResult(QueryStockItemResponseModel value) {
        return new JAXBElement<QueryStockItemResponseModel>(_QueryStockItemResponseQueryStockItemResult_QNAME, QueryStockItemResponseModel.class, QueryStockItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SerialNumber", scope = RemoveDopingBoxProductRequestModel.class)
    public JAXBElement<String> createRemoveDopingBoxProductRequestModelSerialNumber(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelSerialNumber_QNAME, String.class, RemoveDopingBoxProductRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ExternalId", scope = RemoveDopingBoxProductRequestModel.class)
    public JAXBElement<String> createRemoveDopingBoxProductRequestModelExternalId(String value) {
        return new JAXBElement<String>(_RemoveDopingBoxProductRequestModelExternalId_QNAME, String.class, RemoveDopingBoxProductRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateAccountResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ActivateAccountResult", scope = ActivateAccountResponse.class)
    public JAXBElement<ActivateAccountResponseModel> createActivateAccountResponseActivateAccountResult(ActivateAccountResponseModel value) {
        return new JAXBElement<ActivateAccountResponseModel>(_ActivateAccountResponseActivateAccountResult_QNAME, ActivateAccountResponseModel.class, ActivateAccountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateAccountResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "DeactivateAccountResult", scope = DeactivateAccountResponse.class)
    public JAXBElement<DeactivateAccountResponseModel> createDeactivateAccountResponseDeactivateAccountResult(DeactivateAccountResponseModel value) {
        return new JAXBElement<DeactivateAccountResponseModel>(_DeactivateAccountResponseDeactivateAccountResult_QNAME, DeactivateAccountResponseModel.class, DeactivateAccountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Number", scope = CrmNumber.class)
    public JAXBElement<String> createCrmNumberNumber(String value) {
        return new JAXBElement<String>(_NumberPoolItemNumber_QNAME, String.class, CrmNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "WorkingArea", scope = Customer.class)
    public JAXBElement<String> createCustomerWorkingArea(String value) {
        return new JAXBElement<String>(_CustomerWorkingArea_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Accounts", scope = Customer.class)
    public JAXBElement<ArrayOfCrmAccount> createCustomerAccounts(ArrayOfCrmAccount value) {
        return new JAXBElement<ArrayOfCrmAccount>(_CustomerAccounts_QNAME, ArrayOfCrmAccount.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Sector", scope = Customer.class)
    public JAXBElement<String> createCustomerSector(String value) {
        return new JAXBElement<String>(_CustomerSector_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "RegistrationNumber", scope = Customer.class)
    public JAXBElement<String> createCustomerRegistrationNumber(String value) {
        return new JAXBElement<String>(_CustomerRegistrationNumber_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Tckn", scope = Customer.class)
    public JAXBElement<String> createCustomerTckn(String value) {
        return new JAXBElement<String>(_CustomerTckn_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "FatherName", scope = Customer.class)
    public JAXBElement<String> createCustomerFatherName(String value) {
        return new JAXBElement<String>(_CrmReturnAccountFatherName_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Nationality", scope = Customer.class)
    public JAXBElement<String> createCustomerNationality(String value) {
        return new JAXBElement<String>(_CustomerNationality_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Code", scope = Customer.class)
    public JAXBElement<String> createCustomerCode(String value) {
        return new JAXBElement<String>(_CrmProductCode_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Name", scope = Customer.class)
    public JAXBElement<String> createCustomerName(String value) {
        return new JAXBElement<String>(_CrmContactName_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ShortName", scope = Customer.class)
    public JAXBElement<String> createCustomerShortName(String value) {
        return new JAXBElement<String>(_CustomerShortName_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "FullName", scope = Customer.class)
    public JAXBElement<String> createCustomerFullName(String value) {
        return new JAXBElement<String>(_UserFullName_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Surname", scope = Customer.class)
    public JAXBElement<String> createCustomerSurname(String value) {
        return new JAXBElement<String>(_CrmContactSurname_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "SubSector", scope = Customer.class)
    public JAXBElement<String> createCustomerSubSector(String value) {
        return new JAXBElement<String>(_CustomerSubSector_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Contacts", scope = Customer.class)
    public JAXBElement<ArrayOfCrmContact> createCustomerContacts(ArrayOfCrmContact value) {
        return new JAXBElement<ArrayOfCrmContact>(_CustomerContacts_QNAME, ArrayOfCrmContact.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "MotherMaidenName", scope = Customer.class)
    public JAXBElement<String> createCustomerMotherMaidenName(String value) {
        return new JAXBElement<String>(_CustomerMotherMaidenName_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateCustomerContractRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = DeactivateCustomerContract.class)
    public JAXBElement<DeactivateCustomerContractRequestModel> createDeactivateCustomerContractRequest(DeactivateCustomerContractRequestModel value) {
        return new JAXBElement<DeactivateCustomerContractRequestModel>(_SuspendCustomerContractRequest_QNAME, DeactivateCustomerContractRequestModel.class, DeactivateCustomerContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Name", scope = Partner.class)
    public JAXBElement<String> createPartnerName(String value) {
        return new JAXBElement<String>(_CrmContactName_QNAME, String.class, Partner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumbersFromPoolResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetNumbersFromPoolResult", scope = GetNumbersFromPoolResponse.class)
    public JAXBElement<GetNumbersFromPoolResponseModel> createGetNumbersFromPoolResponseGetNumbersFromPoolResult(GetNumbersFromPoolResponseModel value) {
        return new JAXBElement<GetNumbersFromPoolResponseModel>(_GetNumbersFromPoolResponseGetNumbersFromPoolResult_QNAME, GetNumbersFromPoolResponseModel.class, GetNumbersFromPoolResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignStockItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = AssignStockItem.class)
    public JAXBElement<AssignStockItemRequestModel> createAssignStockItemRequest(AssignStockItemRequestModel value) {
        return new JAXBElement<AssignStockItemRequestModel>(_SuspendCustomerContractRequest_QNAME, AssignStockItemRequestModel.class, AssignStockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeNumberPoolItemStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ReserveNumberPoolItemResult", scope = ReserveNumberPoolItemResponse.class)
    public JAXBElement<ChangeNumberPoolItemStatusResponseModel> createReserveNumberPoolItemResponseReserveNumberPoolItemResult(ChangeNumberPoolItemStatusResponseModel value) {
        return new JAXBElement<ChangeNumberPoolItemStatusResponseModel>(_ReserveNumberPoolItemResponseReserveNumberPoolItemResult_QNAME, ChangeNumberPoolItemStatusResponseModel.class, ReserveNumberPoolItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStockItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = QueryStockItem.class)
    public JAXBElement<QueryStockItemRequestModel> createQueryStockItemRequest(QueryStockItemRequestModel value) {
        return new JAXBElement<QueryStockItemRequestModel>(_SuspendCustomerContractRequest_QNAME, QueryStockItemRequestModel.class, QueryStockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Ouid", scope = QueryStockItemOuidResponseModel.class)
    public JAXBElement<String> createQueryStockItemOuidResponseModelOuid(String value) {
        return new JAXBElement<String>(_QueryStockItemOuidResponseModelOuid_QNAME, String.class, QueryStockItemOuidResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "StockItem", scope = QueryStockItemOuidResponseModel.class)
    public JAXBElement<StockItem> createQueryStockItemOuidResponseModelStockItem(StockItem value) {
        return new JAXBElement<StockItem>(_QueryStockItemOuidResponseModelStockItem_QNAME, StockItem.class, QueryStockItemOuidResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Status", scope = SuspendAccountRequestModel.class)
    public JAXBElement<String> createSuspendAccountRequestModelStatus(String value) {
        return new JAXBElement<String>(_DeactivateCustomerContractRequestModelStatus_QNAME, String.class, SuspendAccountRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "StatusReasonDef", scope = SuspendAccountRequestModel.class)
    public JAXBElement<String> createSuspendAccountRequestModelStatusReasonDef(String value) {
        return new JAXBElement<String>(_DeactivateCustomerContractRequestModelStatusReasonDef_QNAME, String.class, SuspendAccountRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Application", scope = SuspendAccountRequestModel.class)
    public JAXBElement<String> createSuspendAccountRequestModelApplication(String value) {
        return new JAXBElement<String>(_DeactivateCustomerContractRequestModelApplication_QNAME, String.class, SuspendAccountRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "BillingCustomerId", scope = SuspendAccountRequestModel.class)
    public JAXBElement<String> createSuspendAccountRequestModelBillingCustomerId(String value) {
        return new JAXBElement<String>(_SuspendAccountRequestModelBillingCustomerId_QNAME, String.class, SuspendAccountRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "User", scope = UserResponseModel.class)
    public JAXBElement<User> createUserResponseModelUser(User value) {
        return new JAXBElement<User>(_UserRequestModelUser_QNAME, User.class, UserResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountPartyCodeRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = GetAccountPartyCode.class)
    public JAXBElement<GetAccountPartyCodeRequestModel> createGetAccountPartyCodeRequest(GetAccountPartyCodeRequestModel value) {
        return new JAXBElement<GetAccountPartyCodeRequestModel>(_SuspendCustomerContractRequest_QNAME, GetAccountPartyCodeRequestModel.class, GetAccountPartyCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SerialNumber", scope = QueryStockItemOuidRequestModel.class)
    public JAXBElement<String> createQueryStockItemOuidRequestModelSerialNumber(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelSerialNumber_QNAME, String.class, QueryStockItemOuidRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessStaticIpRequestsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ProcessStaticIpRequests.class)
    public JAXBElement<ProcessStaticIpRequestsRequestModel> createProcessStaticIpRequestsRequest(ProcessStaticIpRequestsRequestModel value) {
        return new JAXBElement<ProcessStaticIpRequestsRequestModel>(_SuspendCustomerContractRequest_QNAME, ProcessStaticIpRequestsRequestModel.class, ProcessStaticIpRequests.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessStaticIpRequestsResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ProcessStaticIpRequestsResult", scope = ProcessStaticIpRequestsResponse.class)
    public JAXBElement<ProcessStaticIpRequestsResponseModel> createProcessStaticIpRequestsResponseProcessStaticIpRequestsResult(ProcessStaticIpRequestsResponseModel value) {
        return new JAXBElement<ProcessStaticIpRequestsResponseModel>(_ProcessStaticIpRequestsResponseProcessStaticIpRequestsResult_QNAME, ProcessStaticIpRequestsResponseModel.class, ProcessStaticIpRequestsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetCustomerResult", scope = GetCustomerResponse.class)
    public JAXBElement<GetCustomerResponseModel> createGetCustomerResponseGetCustomerResult(GetCustomerResponseModel value) {
        return new JAXBElement<GetCustomerResponseModel>(_GetCustomerResponseGetCustomerResult_QNAME, GetCustomerResponseModel.class, GetCustomerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "User", scope = GetPartnerRequestModel.class)
    public JAXBElement<User> createGetPartnerRequestModelUser(User value) {
        return new JAXBElement<User>(_UserRequestModelUser_QNAME, User.class, GetPartnerRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockNumberPoolItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = BlockNumberPoolItem.class)
    public JAXBElement<BlockNumberPoolItemRequestModel> createBlockNumberPoolItemRequest(BlockNumberPoolItemRequestModel value) {
        return new JAXBElement<BlockNumberPoolItemRequestModel>(_SuspendCustomerContractRequest_QNAME, BlockNumberPoolItemRequestModel.class, BlockNumberPoolItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = DeleteUser.class)
    public JAXBElement<UserRequestModel> createDeleteUserRequest(UserRequestModel value) {
        return new JAXBElement<UserRequestModel>(_SuspendCustomerContractRequest_QNAME, UserRequestModel.class, DeleteUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", name = "Name", scope = CrmPhone.class)
    public JAXBElement<String> createCrmPhoneName(String value) {
        return new JAXBElement<String>(_CrmDocumentName_QNAME, String.class, CrmPhone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Number", scope = ContractedNumber.class)
    public JAXBElement<String> createContractedNumberNumber(String value) {
        return new JAXBElement<String>(_NumberPoolItemNumber_QNAME, String.class, ContractedNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "NumberType", scope = ContractedNumber.class)
    public JAXBElement<String> createContractedNumberNumberType(String value) {
        return new JAXBElement<String>(_ContractedNumberNumberType_QNAME, String.class, ContractedNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", name = "Name", scope = CrmEmail.class)
    public JAXBElement<String> createCrmEmailName(String value) {
        return new JAXBElement<String>(_CrmDocumentName_QNAME, String.class, CrmEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Status", scope = DeactivateAccountRequestModel.class)
    public JAXBElement<String> createDeactivateAccountRequestModelStatus(String value) {
        return new JAXBElement<String>(_DeactivateCustomerContractRequestModelStatus_QNAME, String.class, DeactivateAccountRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "StatusReasonDef", scope = DeactivateAccountRequestModel.class)
    public JAXBElement<String> createDeactivateAccountRequestModelStatusReasonDef(String value) {
        return new JAXBElement<String>(_DeactivateCustomerContractRequestModelStatusReasonDef_QNAME, String.class, DeactivateAccountRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Application", scope = DeactivateAccountRequestModel.class)
    public JAXBElement<String> createDeactivateAccountRequestModelApplication(String value) {
        return new JAXBElement<String>(_DeactivateCustomerContractRequestModelApplication_QNAME, String.class, DeactivateAccountRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "BillingCustomerId", scope = DeactivateAccountRequestModel.class)
    public JAXBElement<String> createDeactivateAccountRequestModelBillingCustomerId(String value) {
        return new JAXBElement<String>(_SuspendAccountRequestModelBillingCustomerId_QNAME, String.class, DeactivateAccountRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = UpdateUser.class)
    public JAXBElement<UserRequestModel> createUpdateUserRequest(UserRequestModel value) {
        return new JAXBElement<UserRequestModel>(_SuspendCustomerContractRequest_QNAME, UserRequestModel.class, UpdateUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "PartyCode", scope = GetAccountPartyCodeResponseModel.class)
    public JAXBElement<String> createGetAccountPartyCodeResponseModelPartyCode(String value) {
        return new JAXBElement<String>(_GetAccountPartyCodeResponseModelPartyCode_QNAME, String.class, GetAccountPartyCodeResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ErrorMessage", scope = GetAccountPartyCodeResponseModel.class)
    public JAXBElement<String> createGetAccountPartyCodeResponseModelErrorMessage(String value) {
        return new JAXBElement<String>(_GetAccountPartyCodeResponseModelErrorMessage_QNAME, String.class, GetAccountPartyCodeResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Code", scope = MigrateContractResponseModel.class)
    public JAXBElement<String> createMigrateContractResponseModelCode(String value) {
        return new JAXBElement<String>(_MigratePartyResponseModelCode_QNAME, String.class, MigrateContractResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Customer", scope = MigratePartyRequestModel.class)
    public JAXBElement<Customer> createMigratePartyRequestModelCustomer(Customer value) {
        return new JAXBElement<Customer>(_QueryCustomerResponseModelCustomer_QNAME, Customer.class, MigratePartyRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateCustomerContractResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ActivateCustomerContractResult", scope = ActivateCustomerContractResponse.class)
    public JAXBElement<ActivateCustomerContractResponseModel> createActivateCustomerContractResponseActivateCustomerContractResult(ActivateCustomerContractResponseModel value) {
        return new JAXBElement<ActivateCustomerContractResponseModel>(_ActivateCustomerContractResponseActivateCustomerContractResult_QNAME, ActivateCustomerContractResponseModel.class, ActivateCustomerContractResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Code", scope = MigrateAccountResponseModel.class)
    public JAXBElement<String> createMigrateAccountResponseModelCode(String value) {
        return new JAXBElement<String>(_MigratePartyResponseModelCode_QNAME, String.class, MigrateAccountResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = GetCustomerByCustomerId.class)
    public JAXBElement<GetCustomerRequestModel> createGetCustomerByCustomerIdRequest(GetCustomerRequestModel value) {
        return new JAXBElement<GetCustomerRequestModel>(_SuspendCustomerContractRequest_QNAME, GetCustomerRequestModel.class, GetCustomerByCustomerId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Number", scope = UnavailableNumberPoolItemRequestModel.class)
    public JAXBElement<String> createUnavailableNumberPoolItemRequestModelNumber(String value) {
        return new JAXBElement<String>(_AssignNumberPoolItemRequestModelNumber_QNAME, String.class, UnavailableNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Username", scope = UnavailableNumberPoolItemRequestModel.class)
    public JAXBElement<String> createUnavailableNumberPoolItemRequestModelUsername(String value) {
        return new JAXBElement<String>(_AssignNumberPoolItemRequestModelUsername_QNAME, String.class, UnavailableNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessSuspendedContractsResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ProcessSuspendedContractsResult", scope = ProcessSuspendedContractsResponse.class)
    public JAXBElement<ProcessSuspendedContractsResponseModel> createProcessSuspendedContractsResponseProcessSuspendedContractsResult(ProcessSuspendedContractsResponseModel value) {
        return new JAXBElement<ProcessSuspendedContractsResponseModel>(_ProcessSuspendedContractsResponseProcessSuspendedContractsResult_QNAME, ProcessSuspendedContractsResponseModel.class, ProcessSuspendedContractsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryNumberPoolItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = QueryNumberPoolItem.class)
    public JAXBElement<QueryNumberPoolItemRequestModel> createQueryNumberPoolItemRequest(QueryNumberPoolItemRequestModel value) {
        return new JAXBElement<QueryNumberPoolItemRequestModel>(_SuspendCustomerContractRequest_QNAME, QueryNumberPoolItemRequestModel.class, QueryNumberPoolItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnavailableNumberPoolItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = UnavailableNumberPoolItem.class)
    public JAXBElement<UnavailableNumberPoolItemRequestModel> createUnavailableNumberPoolItemRequest(UnavailableNumberPoolItemRequestModel value) {
        return new JAXBElement<UnavailableNumberPoolItemRequestModel>(_SuspendCustomerContractRequest_QNAME, UnavailableNumberPoolItemRequestModel.class, UnavailableNumberPoolItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = GetCustomer.class)
    public JAXBElement<GetCustomerRequestModel> createGetCustomerRequest(GetCustomerRequestModel value) {
        return new JAXBElement<GetCustomerRequestModel>(_SuspendCustomerContractRequest_QNAME, GetCustomerRequestModel.class, GetCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "StockItem", scope = QueryStockItemResponseModel.class)
    public JAXBElement<StockItem> createQueryStockItemResponseModelStockItem(StockItem value) {
        return new JAXBElement<StockItem>(_QueryStockItemOuidResponseModelStockItem_QNAME, StockItem.class, QueryStockItemResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ContractCode", scope = SuspendCustomerContractRequestModel.class)
    public JAXBElement<String> createSuspendCustomerContractRequestModelContractCode(String value) {
        return new JAXBElement<String>(_AssignNumberPoolItemRequestModelContractCode_QNAME, String.class, SuspendCustomerContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Status", scope = SuspendCustomerContractRequestModel.class)
    public JAXBElement<String> createSuspendCustomerContractRequestModelStatus(String value) {
        return new JAXBElement<String>(_DeactivateCustomerContractRequestModelStatus_QNAME, String.class, SuspendCustomerContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "StatusReasonDef", scope = SuspendCustomerContractRequestModel.class)
    public JAXBElement<String> createSuspendCustomerContractRequestModelStatusReasonDef(String value) {
        return new JAXBElement<String>(_DeactivateCustomerContractRequestModelStatusReasonDef_QNAME, String.class, SuspendCustomerContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Application", scope = SuspendCustomerContractRequestModel.class)
    public JAXBElement<String> createSuspendCustomerContractRequestModelApplication(String value) {
        return new JAXBElement<String>(_DeactivateCustomerContractRequestModelApplication_QNAME, String.class, SuspendCustomerContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Status", scope = ActivateAccountRequestModel.class)
    public JAXBElement<String> createActivateAccountRequestModelStatus(String value) {
        return new JAXBElement<String>(_DeactivateCustomerContractRequestModelStatus_QNAME, String.class, ActivateAccountRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "StatusReasonDef", scope = ActivateAccountRequestModel.class)
    public JAXBElement<String> createActivateAccountRequestModelStatusReasonDef(String value) {
        return new JAXBElement<String>(_DeactivateCustomerContractRequestModelStatusReasonDef_QNAME, String.class, ActivateAccountRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Application", scope = ActivateAccountRequestModel.class)
    public JAXBElement<String> createActivateAccountRequestModelApplication(String value) {
        return new JAXBElement<String>(_DeactivateCustomerContractRequestModelApplication_QNAME, String.class, ActivateAccountRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "BillingCustomerId", scope = ActivateAccountRequestModel.class)
    public JAXBElement<String> createActivateAccountRequestModelBillingCustomerId(String value) {
        return new JAXBElement<String>(_SuspendAccountRequestModelBillingCustomerId_QNAME, String.class, ActivateAccountRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractedNumbersInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "NumbersInfo", scope = RemoveNumbersFromContractRequestModel.class)
    public JAXBElement<ContractedNumbersInfo> createRemoveNumbersFromContractRequestModelNumbersInfo(ContractedNumbersInfo value) {
        return new JAXBElement<ContractedNumbersInfo>(_AddNumbersToContractRequestModelNumbersInfo_QNAME, ContractedNumbersInfo.class, RemoveNumbersFromContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessChurnContractsResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ProcessChurnContractsResult", scope = ProcessChurnContractsResponse.class)
    public JAXBElement<ProcessChurnContractsResponseModel> createProcessChurnContractsResponseProcessChurnContractsResult(ProcessChurnContractsResponseModel value) {
        return new JAXBElement<ProcessChurnContractsResponseModel>(_ProcessChurnContractsResponseProcessChurnContractsResult_QNAME, ProcessChurnContractsResponseModel.class, ProcessChurnContractsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetCustomerByCustomerIdResult", scope = GetCustomerByCustomerIdResponse.class)
    public JAXBElement<GetCustomerResponseModel> createGetCustomerByCustomerIdResponseGetCustomerByCustomerIdResult(GetCustomerResponseModel value) {
        return new JAXBElement<GetCustomerResponseModel>(_GetCustomerByCustomerIdResponseGetCustomerByCustomerIdResult_QNAME, GetCustomerResponseModel.class, GetCustomerByCustomerIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigrateContractResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "MigrateContractResult", scope = MigrateContractResponse.class)
    public JAXBElement<MigrateContractResponseModel> createMigrateContractResponseMigrateContractResult(MigrateContractResponseModel value) {
        return new JAXBElement<MigrateContractResponseModel>(_MigrateContractResponseMigrateContractResult_QNAME, MigrateContractResponseModel.class, MigrateContractResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "XdslNumber", scope = QueryCustomerRequestModel.class)
    public JAXBElement<String> createQueryCustomerRequestModelXdslNumber(String value) {
        return new JAXBElement<String>(_QueryCustomerRequestModelXdslNumber_QNAME, String.class, QueryCustomerRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "CustomerOid", scope = QueryCustomerRequestModel.class)
    public JAXBElement<String> createQueryCustomerRequestModelCustomerOid(String value) {
        return new JAXBElement<String>(_QueryCustomerRequestModelCustomerOid_QNAME, String.class, QueryCustomerRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "TelephoneNumber", scope = QueryCustomerRequestModel.class)
    public JAXBElement<String> createQueryCustomerRequestModelTelephoneNumber(String value) {
        return new JAXBElement<String>(_QueryCustomerRequestModelTelephoneNumber_QNAME, String.class, QueryCustomerRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Tckn", scope = QueryCustomerRequestModel.class)
    public JAXBElement<String> createQueryCustomerRequestModelTckn(String value) {
        return new JAXBElement<String>(_QueryCustomerRequestModelTckn_QNAME, String.class, QueryCustomerRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "MobilePhone", scope = QueryCustomerRequestModel.class)
    public JAXBElement<String> createQueryCustomerRequestModelMobilePhone(String value) {
        return new JAXBElement<String>(_QueryCustomerRequestModelMobilePhone_QNAME, String.class, QueryCustomerRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Vkn", scope = QueryCustomerRequestModel.class)
    public JAXBElement<String> createQueryCustomerRequestModelVkn(String value) {
        return new JAXBElement<String>(_QueryCustomerRequestModelVkn_QNAME, String.class, QueryCustomerRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveNumbersFromContractResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "RemoveNumbersFromContractResult", scope = RemoveNumbersFromContractResponse.class)
    public JAXBElement<RemoveNumbersFromContractResponseModel> createRemoveNumbersFromContractResponseRemoveNumbersFromContractResult(RemoveNumbersFromContractResponseModel value) {
        return new JAXBElement<RemoveNumbersFromContractResponseModel>(_RemoveNumbersFromContractResponseRemoveNumbersFromContractResult_QNAME, RemoveNumbersFromContractResponseModel.class, RemoveNumbersFromContractResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SerialNumber", scope = ReleaseStockItemRequestModel.class)
    public JAXBElement<String> createReleaseStockItemRequestModelSerialNumber(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelSerialNumber_QNAME, String.class, ReleaseStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Username", scope = ReleaseStockItemRequestModel.class)
    public JAXBElement<String> createReleaseStockItemRequestModelUsername(String value) {
        return new JAXBElement<String>(_AssignNumberPoolItemRequestModelUsername_QNAME, String.class, ReleaseStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Number", scope = QueryNumberPoolItemRequestModel.class)
    public JAXBElement<String> createQueryNumberPoolItemRequestModelNumber(String value) {
        return new JAXBElement<String>(_AssignNumberPoolItemRequestModelNumber_QNAME, String.class, QueryNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveNumbersFromContractRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = RemoveNumbersFromContract.class)
    public JAXBElement<RemoveNumbersFromContractRequestModel> createRemoveNumbersFromContractRequest(RemoveNumbersFromContractRequestModel value) {
        return new JAXBElement<RemoveNumbersFromContractRequestModel>(_SuspendCustomerContractRequest_QNAME, RemoveNumbersFromContractRequestModel.class, RemoveNumbersFromContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigratePartyRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = MigrateParty.class)
    public JAXBElement<MigratePartyRequestModel> createMigratePartyRequest(MigratePartyRequestModel value) {
        return new JAXBElement<MigratePartyRequestModel>(_SuspendCustomerContractRequest_QNAME, MigratePartyRequestModel.class, MigrateParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveNumberPoolItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ReserveNumberPoolItem.class)
    public JAXBElement<ReserveNumberPoolItemRequestModel> createReserveNumberPoolItemRequest(ReserveNumberPoolItemRequestModel value) {
        return new JAXBElement<ReserveNumberPoolItemRequestModel>(_SuspendCustomerContractRequest_QNAME, ReserveNumberPoolItemRequestModel.class, ReserveNumberPoolItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNumbersToContractResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddNumbersToContractResult", scope = AddNumbersToContractResponse.class)
    public JAXBElement<AddNumbersToContractResponseModel> createAddNumbersToContractResponseAddNumbersToContractResult(AddNumbersToContractResponseModel value) {
        return new JAXBElement<AddNumbersToContractResponseModel>(_AddNumbersToContractResponseAddNumbersToContractResult_QNAME, AddNumbersToContractResponseModel.class, AddNumbersToContractResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessChurnContractsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ProcessChurnContracts.class)
    public JAXBElement<ProcessChurnContractsRequestModel> createProcessChurnContractsRequest(ProcessChurnContractsRequestModel value) {
        return new JAXBElement<ProcessChurnContractsRequestModel>(_SuspendCustomerContractRequest_QNAME, ProcessChurnContractsRequestModel.class, ProcessChurnContracts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveDopingBoxProductRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = RemoveDopingBoxProduct.class)
    public JAXBElement<RemoveDopingBoxProductRequestModel> createRemoveDopingBoxProductRequest(RemoveDopingBoxProductRequestModel value) {
        return new JAXBElement<RemoveDopingBoxProductRequestModel>(_SuspendCustomerContractRequest_QNAME, RemoveDopingBoxProductRequestModel.class, RemoveDopingBoxProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseNumberPoolItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ReleaseNumberPoolItem.class)
    public JAXBElement<ReleaseNumberPoolItemRequestModel> createReleaseNumberPoolItemRequest(ReleaseNumberPoolItemRequestModel value) {
        return new JAXBElement<ReleaseNumberPoolItemRequestModel>(_SuspendCustomerContractRequest_QNAME, ReleaseNumberPoolItemRequestModel.class, ReleaseNumberPoolItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Customer", scope = GetCustomerResponseModel.class)
    public JAXBElement<Customer> createGetCustomerResponseModelCustomer(Customer value) {
        return new JAXBElement<Customer>(_QueryCustomerResponseModelCustomer_QNAME, Customer.class, GetCustomerResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "BillingContractId", scope = ContractedNumbersInfo.class)
    public JAXBElement<String> createContractedNumbersInfoBillingContractId(String value) {
        return new JAXBElement<String>(_ContractedNumbersInfoBillingContractId_QNAME, String.class, ContractedNumbersInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContractedNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Numbers", scope = ContractedNumbersInfo.class)
    public JAXBElement<ArrayOfContractedNumber> createContractedNumbersInfoNumbers(ArrayOfContractedNumber value) {
        return new JAXBElement<ArrayOfContractedNumber>(_CrmProductNumbers_QNAME, ArrayOfContractedNumber.class, ContractedNumbersInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateAccountRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = DeactivateAccount.class)
    public JAXBElement<DeactivateAccountRequestModel> createDeactivateAccountRequest(DeactivateAccountRequestModel value) {
        return new JAXBElement<DeactivateAccountRequestModel>(_SuspendCustomerContractRequest_QNAME, DeactivateAccountRequestModel.class, DeactivateAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRMProvisionResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ProvisionOrderToCRMResult", scope = ProvisionOrderToCRMResponse.class)
    public JAXBElement<CRMProvisionResponseModel> createProvisionOrderToCRMResponseProvisionOrderToCRMResult(CRMProvisionResponseModel value) {
        return new JAXBElement<CRMProvisionResponseModel>(_ProvisionOrderToCRMResponseProvisionOrderToCRMResult_QNAME, CRMProvisionResponseModel.class, ProvisionOrderToCRMResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignNumberPoolItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = AssignNumberPoolItem.class)
    public JAXBElement<AssignNumberPoolItemRequestModel> createAssignNumberPoolItemRequest(AssignNumberPoolItemRequestModel value) {
        return new JAXBElement<AssignNumberPoolItemRequestModel>(_SuspendCustomerContractRequest_QNAME, AssignNumberPoolItemRequestModel.class, AssignNumberPoolItem.class, value);
    }

}
