
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

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _UnavailableNumberPoolItemRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "UnavailableNumberPoolItemRequestModel");
    private final static QName _QueryStockItemOuidResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "QueryStockItemOuidResponseModel");
    private final static QName _CRMProvisionResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "CRMProvisionResponseModel");
    private final static QName _ArrayOfNumberPoolItem_QNAME = new QName("http://milleni.com/Crm", "ArrayOfNumberPoolItem");
    private final static QName _GetBulutSantralNumbersByBillingContractNoRequestModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", "GetBulutSantralNumbersByBillingContractNoRequestModel");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _UpdateDealerStokStatusRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "UpdateDealerStokStatusRequestModel");
    private final static QName _ContractedNumbersInfo_QNAME = new QName("http://milleni.com/Crm", "ContractedNumbersInfo");
    private final static QName _StockItemStatusType_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Contracts.CustomerInfoService.Type", "StockItemStatusType");
    private final static QName _ReleaseNumberPoolItemRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "ReleaseNumberPoolItemRequestModel");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _GetSaleAvailabilityRequestModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", "GetSaleAvailabilityRequestModel");
    private final static QName _SuspendCustomerContractResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "SuspendCustomerContractResponseModel");
    private final static QName _CrmAddress_QNAME = new QName("http://milleni.com/Crm", "CrmAddress");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfCrmAddress_QNAME = new QName("http://milleni.com/Crm", "ArrayOfCrmAddress");
    private final static QName _CrmContract_QNAME = new QName("http://milleni.com/Crm", "CrmContract");
    private final static QName _ActivateAccountResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "ActivateAccountResponseModel");
    private final static QName _AddNumbersToVoipDeviceRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "AddNumbersToVoipDeviceRequestModel");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _BaseResponseDto_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Contracts", "BaseResponseDto");
    private final static QName _RemovePoolResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "RemovePoolResponseModel");
    private final static QName _ReplaceStockInfoDeviceProductRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "ReplaceStockInfoDeviceProductRequestModel");
    private final static QName _ArrayOfBulutSantralNumbers_QNAME = new QName("/CustomerInfo/Service/v1", "ArrayOfBulutSantralNumbers");
    private final static QName _ReplaceStockInfoDeviceProductResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "ReplaceStockInfoDeviceProductResponseModel");
    private final static QName _ReplaceStockInfoInContractResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "ReplaceStockInfoInContractResponseModel");
    private final static QName _StockItemDeviceSubType_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm.Stock", "StockItemDeviceSubType");
    private final static QName _ArrayOfStockItem_QNAME = new QName("http://milleni.com/Crm", "ArrayOfStockItem");
    private final static QName _CrmContact_QNAME = new QName("http://milleni.com/Crm", "CrmContact");
    private final static QName _CancelProcessResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "CancelProcessResponseModel");
    private final static QName _ArrayOfCrmCustomerMessageType_QNAME = new QName("http://milleni.com/Crm", "ArrayOfCrmCustomerMessageType");
    private final static QName _ListStockItemResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "ListStockItemResponseModel");
    private final static QName _SystemFault_QNAME = new QName("http://milleni.com/technical/Fault", "SystemFault");
    private final static QName _CrmReturnAccount_QNAME = new QName("http://milleni.com/Crm", "CrmReturnAccount");
    private final static QName _ValidateContractDeactivationRequestModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", "ValidateContractDeactivationRequestModel");
    private final static QName _ArrayOfCrmAccount_QNAME = new QName("http://milleni.com/Crm", "ArrayOfCrmAccount");
    private final static QName _CrmPhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", "CrmPhone");
    private final static QName _AddPoolItemsRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "AddPoolItemsRequestModel");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _AddMillenifonNumberRequestModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", "AddMillenifonNumberRequestModel");
    private final static QName _ArrayOfContractedNumber_QNAME = new QName("http://milleni.com/Crm", "ArrayOfContractedNumber");
    private final static QName _StockItem_QNAME = new QName("http://milleni.com/Crm", "StockItem");
    private final static QName _GetCustomerStockItemsRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "GetCustomerStockItemsRequestModel");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _AddNumbersToContractResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "AddNumbersToContractResponseModel");
    private final static QName _ArrayOfCrmWebAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", "ArrayOfCrmWebAddress");
    private final static QName _AddVoipDeviceWithProcessRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "AddVoipDeviceWithProcessRequestModel");
    private final static QName _QueryStockItemResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "QueryStockItemResponseModel");
    private final static QName _QueryNumberPoolItemResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "QueryNumberPoolItemResponseModel");
    private final static QName _GetRemaingFreeUnitUsageByPhoneNumberResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "GetRemaingFreeUnitUsageByPhoneNumberResponseModel");
    private final static QName _RemovePoolItemsResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "RemovePoolItemsResponseModel");
    private final static QName _ValidateContractDeactivationResponseModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", "ValidateContractDeactivationResponseModel");
    private final static QName _AssignStockItemRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "AssignStockItemRequestModel");
    private final static QName _CrmAccount_QNAME = new QName("http://milleni.com/Crm", "CrmAccount");
    private final static QName _ArrayOfCrmPoolItem_QNAME = new QName("http://milleni.com/Crm", "ArrayOfCrmPoolItem");
    private final static QName _ReleaseNumbersOfVoipDeviceResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "ReleaseNumbersOfVoipDeviceResponseModel");
    private final static QName _AddMillenifonNumberResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "AddMillenifonNumberResponseModel");
    private final static QName _User_QNAME = new QName("http://milleni.com/Crm", "User");
    private final static QName _RemoveMillenifonNumberResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "RemoveMillenifonNumberResponseModel");
    private final static QName _GetBulutSantralNumbersByBillingContractNoResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "GetBulutSantralNumbersByBillingContractNoResponseModel");
    private final static QName _GetCustomerResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "GetCustomerResponseModel");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _StockItemOrderInfo_QNAME = new QName("http://milleni.com/Crm", "StockItemOrderInfo");
    private final static QName _RemoveMillenifonNumberRequestModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", "RemoveMillenifonNumberRequestModel");
    private final static QName _QueryCustomerStatusRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "QueryCustomerStatusRequestModel");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _UserRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "UserRequestModel");
    private final static QName _StockItemsResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "StockItemsResponseModel");
    private final static QName _QueryNumberPoolItemRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "QueryNumberPoolItemRequestModel");
    private final static QName _QueryOpenOrdersForDevicesRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "QueryOpenOrdersForDevicesRequestModel");
    private final static QName _RemoveVoipDeviceResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "RemoveVoipDeviceResponseModel");
    private final static QName _GetDealerStokResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "GetDealerStokResponseModel");
    private final static QName _ReplaceStockInfoInContractRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "ReplaceStockInfoInContractRequestModel");
    private final static QName _RemoveVoipDeviceRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "RemoveVoipDeviceRequestModel");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ProcessProcessRequestResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "ProcessProcessRequestResponseModel");
    private final static QName _ProcessProcessRequestRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "ProcessProcessRequestRequestModel");
    private final static QName _ActivateAccountRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "ActivateAccountRequestModel");
    private final static QName _CrmDocument_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", "CrmDocument");
    private final static QName _CrmWebAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", "CrmWebAddress");
    private final static QName _ArrayOfcheckNumber_QNAME = new QName("/CustomerInfo/Service/v1", "ArrayOfcheckNumber");
    private final static QName _DocumentInfo_QNAME = new QName("/CustomerInfo/Service/v1", "DocumentInfo");
    private final static QName _BlockNumberPoolItemRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "BlockNumberPoolItemRequestModel");
    private final static QName _Customer_QNAME = new QName("http://milleni.com/Crm", "Customer");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _ReserveStockItemRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "ReserveStockItemRequestModel");
    private final static QName _ArrayOfCrmProduct_QNAME = new QName("http://milleni.com/Crm", "ArrayOfCrmProduct");
    private final static QName _BaseFault_QNAME = new QName("http://milleni.com/technical/Fault", "BaseFault");
    private final static QName _ReserveNumberPoolItemRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "ReserveNumberPoolItemRequestModel");
    private final static QName _BusinessFault_QNAME = new QName("http://milleni.com/technical/Fault", "BusinessFault");
    private final static QName _ChangeStockItemStatusRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "ChangeStockItemStatusRequestModel");
    private final static QName _DummyJobResponse_QNAME = new QName("/CustomerInfo/Service/v1", "DummyJobResponse");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _AddNumbersToContractRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "AddNumbersToContractRequestModel");
    private final static QName _CrmPoolItem_QNAME = new QName("http://milleni.com/Crm", "CrmPoolItem");
    private final static QName _ReleaseStockItemRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "ReleaseStockItemRequestModel");
    private final static QName _GetRemaingFreeUnitUsageByPhoneNumberRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "GetRemaingFreeUnitUsageByPhoneNumberRequestModel");
    private final static QName _AddPoolItemsResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "AddPoolItemsResponseModel");
    private final static QName _QueryStockItemRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "QueryStockItemRequestModel");
    private final static QName _SellVoiceRecordResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "SellVoiceRecordResponseModel");
    private final static QName _QueryOpenOrdersForDevicesResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "QueryOpenOrdersForDevicesResponseModel");
    private final static QName _AddVoipDeviceWithProcessResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "AddVoipDeviceWithProcessResponseModel");
    private final static QName _UpdateDealerStokStatusResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "UpdateDealerStokStatusResponseModel");
    private final static QName _NumberPoolItem_QNAME = new QName("http://milleni.com/Crm", "NumberPoolItem");
    private final static QName _CRMProvisionRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "CRMProvisionRequestModel");
    private final static QName _ResultTypeEnum_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Enum", "ResultTypeEnum");
    private final static QName _ValidateContractActivationRequestModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", "ValidateContractActivationRequestModel");
    private final static QName _ArrayOfCrmPhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", "ArrayOfCrmPhone");
    private final static QName _ArrayOfguid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfguid");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _SellVoiceRecordRequestModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", "SellVoiceRecordRequestModel");
    private final static QName _BulutSantralVoipDevice_QNAME = new QName("/CustomerInfo/Service/v1", "BulutSantralVoipDevice");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _DiagnosticTypeEnum_QNAME = new QName("http://milleni.com/Common/Customer", "DiagnosticTypeEnum");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _CrmPool_QNAME = new QName("http://milleni.com/Crm", "CrmPool");
    private final static QName _ReleaseNumbersOfVoipDeviceRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "ReleaseNumbersOfVoipDeviceRequestModel");
    private final static QName _QueryCustomerRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "QueryCustomerRequestModel");
    private final static QName _ArrayOfCrmContact_QNAME = new QName("http://milleni.com/Crm", "ArrayOfCrmContact");
    private final static QName _DummyJobRequest_QNAME = new QName("/CustomerInfo/Service/v1", "DummyJobRequest");
    private final static QName _ArrayOfCrmEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", "ArrayOfCrmEmail");
    private final static QName _SexEnum_QNAME = new QName("http://milleni.com/Common/Customer", "SexEnum");
    private final static QName _SuspendAccountResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "SuspendAccountResponseModel");
    private final static QName _CrmEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", "CrmEmail");
    private final static QName _StockItemDeviceType_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm.Stock", "StockItemDeviceType");
    private final static QName _CheckNumber_QNAME = new QName("/CustomerInfo/Service/v1", "checkNumber");
    private final static QName _ArrayOfCrmPool_QNAME = new QName("http://milleni.com/Crm", "ArrayOfCrmPool");
    private final static QName _ArrayOfCrmContract_QNAME = new QName("http://milleni.com/Crm", "ArrayOfCrmContract");
    private final static QName _ActivateCustomerContractRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "ActivateCustomerContractRequestModel");
    private final static QName _GetCustomerRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "GetCustomerRequestModel");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _ListStockItemRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "ListStockItemRequestModel");
    private final static QName _SuspendAccountRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "SuspendAccountRequestModel");
    private final static QName _CustomerTypeEnum_QNAME = new QName("http://milleni.com/Common/Customer", "CustomerTypeEnum");
    private final static QName _BaseResponseModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model", "BaseResponseModel");
    private final static QName _CrmProduct_QNAME = new QName("http://milleni.com/Crm", "CrmProduct");
    private final static QName _CrmNumber_QNAME = new QName("http://milleni.com/Crm", "CrmNumber");
    private final static QName _BulutSantralNumbers_QNAME = new QName("/CustomerInfo/Service/v1", "BulutSantralNumbers");
    private final static QName _GetNumbersFromPoolRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "GetNumbersFromPoolRequestModel");
    private final static QName _ValidateContractActivationResponseModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", "ValidateContractActivationResponseModel");
    private final static QName _ValidateAccountDeactivationResponseModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", "ValidateAccountDeactivationResponseModel");
    private final static QName _QueryStockItemOuidRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "QueryStockItemOuidRequestModel");
    private final static QName _CancelProcessRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "CancelProcessRequestModel");
    private final static QName _CheckMillenifonGsmNumbersResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "CheckMillenifonGsmNumbersResponseModel");
    private final static QName _UserResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "UserResponseModel");
    private final static QName _AssignStockItemsRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "AssignStockItemsRequestModel");
    private final static QName _ValidateAccountDeactivationRequestModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", "ValidateAccountDeactivationRequestModel");
    private final static QName _ArrayOfCrmNumber_QNAME = new QName("http://milleni.com/Crm", "ArrayOfCrmNumber");
    private final static QName _NumberNetworkType_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Contracts.CustomerInfoService.Type", "NumberNetworkType");
    private final static QName _RemovePoolItemsRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "RemovePoolItemsRequestModel");
    private final static QName _QueryCustomerStatusResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "QueryCustomerStatusResponseModel");
    private final static QName _GetDealerStokRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "GetDealerStokRequestModel");
    private final static QName _GetSaleAvailabilityResponseModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", "GetSaleAvailabilityResponseModel");
    private final static QName _ArrayOfStockItemOrderInfo_QNAME = new QName("http://milleni.com/Crm", "ArrayOfStockItemOrderInfo");
    private final static QName _AddNumbersToVoipDeviceResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "AddNumbersToVoipDeviceResponseModel");
    private final static QName _ContractedNumber_QNAME = new QName("http://milleni.com/Crm", "ContractedNumber");
    private final static QName _AddStockItemToStockRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "AddStockItemToStockRequestModel");
    private final static QName _CrmCustomerMessageType_QNAME = new QName("http://milleni.com/Crm", "CrmCustomerMessageType");
    private final static QName _CustomerInfo_QNAME = new QName("http://milleni.com/Bpm", "CustomerInfo");
    private final static QName _ChangeNumberPoolItemStatusResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "ChangeNumberPoolItemStatusResponseModel");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ArrayOfCrmDocument_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", "ArrayOfCrmDocument");
    private final static QName _QueryCustomerResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "QueryCustomerResponseModel");
    private final static QName _CheckMillenifonGsmNumbersRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "CheckMillenifonGsmNumbersRequestModel");
    private final static QName _AssignNumberPoolItemRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "AssignNumberPoolItemRequestModel");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _SuspendCustomerContractRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "SuspendCustomerContractRequestModel");
    private final static QName _RemovePoolRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "RemovePoolRequestModel");
    private final static QName _GetNumbersFromPoolResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "GetNumbersFromPoolResponseModel");
    private final static QName _QueryStockItemByStateRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "QueryStockItemByStateRequestModel");
    private final static QName _FaultyStockItemsRequestModel_QNAME = new QName("/CustomerInfo/Service/v1", "FaultyStockItemsRequestModel");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ActivateCustomerContractResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "ActivateCustomerContractResponseModel");
    private final static QName _ChangeStockItemStatusResponseModel_QNAME = new QName("/CustomerInfo/Service/v1", "ChangeStockItemStatusResponseModel");
    private final static QName _CrmNumberNumber_QNAME = new QName("http://milleni.com/Crm", "Number");
    private final static QName _BlockNumberPoolItemResponseBlockNumberPoolItemResult_QNAME = new QName("/CustomerInfo/Service/v1", "BlockNumberPoolItemResult");
    private final static QName _QueryStockItemResponseModelStockItem_QNAME = new QName("/CustomerInfo/Service/v1", "StockItem");
    private final static QName _SuspendAccountRequest_QNAME = new QName("/CustomerInfo/Service/v1", "request");
    private final static QName _RemovePoolItemsResponseRemovePoolItemsResult_QNAME = new QName("/CustomerInfo/Service/v1", "RemovePoolItemsResult");
    private final static QName _RemoveMillenifonNumberResponseRemoveMillenifonNumberResult_QNAME = new QName("/CustomerInfo/Service/v1", "RemoveMillenifonNumberResult");
    private final static QName _QueryCustomerResponseQueryCustomerResult_QNAME = new QName("/CustomerInfo/Service/v1", "QueryCustomerResult");
    private final static QName _ValidateAccountDeactivationResponseModelValidationMessages_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", "ValidationMessages");
    private final static QName _SetStockItemStatusControlResponseSetStockItemStatusControlResult_QNAME = new QName("/CustomerInfo/Service/v1", "SetStockItemStatusControlResult");
    private final static QName _CancelProcessResponseCancelProcessResult_QNAME = new QName("/CustomerInfo/Service/v1", "CancelProcessResult");
    private final static QName _ProcessRetentionResponseProcessRetentionResult_QNAME = new QName("/CustomerInfo/Service/v1", "ProcessRetentionResult");
    private final static QName _CheckMillenifonGsmNumbersResponseCheckMillenifonGsmNumbersResult_QNAME = new QName("/CustomerInfo/Service/v1", "CheckMillenifonGsmNumbersResult");
    private final static QName _ReplaceStockInfoDeviceProductRequestModelOldSerialNo_QNAME = new QName("/CustomerInfo/Service/v1", "OldSerialNo");
    private final static QName _ReplaceStockInfoDeviceProductRequestModelNewSerialNo_QNAME = new QName("/CustomerInfo/Service/v1", "NewSerialNo");
    private final static QName _SuspendAccountResponseSuspendAccountResult_QNAME = new QName("/CustomerInfo/Service/v1", "SuspendAccountResult");
    private final static QName _UserResponseModelUser_QNAME = new QName("/CustomerInfo/Service/v1", "User");
    private final static QName _SellVoiceRecordResponseSellVoiceRecordResult_QNAME = new QName("/CustomerInfo/Service/v1", "SellVoiceRecordResult");
    private final static QName _AddVoipDeviceWithProcessResponseAddVoipDeviceWithProcessResult_QNAME = new QName("/CustomerInfo/Service/v1", "AddVoipDeviceWithProcessResult");
    private final static QName _CrmContactWorkPhone_QNAME = new QName("http://milleni.com/Crm", "WorkPhone");
    private final static QName _CrmContactEmails_QNAME = new QName("http://milleni.com/Crm", "Emails");
    private final static QName _CrmContactPhones_QNAME = new QName("http://milleni.com/Crm", "Phones");
    private final static QName _CrmContactName_QNAME = new QName("http://milleni.com/Crm", "Name");
    private final static QName _CrmContactAdddresses_QNAME = new QName("http://milleni.com/Crm", "Adddresses");
    private final static QName _CrmContactWebAddress_QNAME = new QName("http://milleni.com/Crm", "WebAddress");
    private final static QName _CrmContactEmail_QNAME = new QName("http://milleni.com/Crm", "Email");
    private final static QName _CrmContactSurname_QNAME = new QName("http://milleni.com/Crm", "Surname");
    private final static QName _CrmContactMobilePhone_QNAME = new QName("http://milleni.com/Crm", "MobilePhone");
    private final static QName _GetBulutSantralNumbersByBillingContractNoRequestModelBillingContractNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", "BillingContractNo");
    private final static QName _RemovePoolRequestModelApplication_QNAME = new QName("/CustomerInfo/Service/v1", "Application");
    private final static QName _RemovePoolRequestModelUserName_QNAME = new QName("/CustomerInfo/Service/v1", "UserName");
    private final static QName _GetNumbersFromPoolRequestModelRelatedIdentification_QNAME = new QName("/CustomerInfo/Service/v1", "RelatedIdentification");
    private final static QName _CrmCustomerMessageTypeDescription_QNAME = new QName("http://milleni.com/Crm", "Description");
    private final static QName _CrmCustomerMessageTypeCode_QNAME = new QName("http://milleni.com/Crm", "Code");
    private final static QName _CrmAddressShipmentCode_QNAME = new QName("http://milleni.com/Crm", "ShipmentCode");
    private final static QName _CrmAddressNeighborhoodCode_QNAME = new QName("http://milleni.com/Crm", "NeighborhoodCode");
    private final static QName _CrmAddressCityCode_QNAME = new QName("http://milleni.com/Crm", "CityCode");
    private final static QName _CrmAddressVillage_QNAME = new QName("http://milleni.com/Crm", "Village");
    private final static QName _CrmAddressIndependentParts_QNAME = new QName("http://milleni.com/Crm", "IndependentParts");
    private final static QName _CrmAddressShipment_QNAME = new QName("http://milleni.com/Crm", "Shipment");
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
    private final static QName _QueryNumberPoolItemResponseQueryNumberPoolItemResult_QNAME = new QName("/CustomerInfo/Service/v1", "QueryNumberPoolItemResult");
    private final static QName _CrmPhoneName_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", "Name");
    private final static QName _AssignNumberPoolItemResponseAssignNumberPoolItemResult_QNAME = new QName("/CustomerInfo/Service/v1", "AssignNumberPoolItemResult");
    private final static QName _ReplaceStockInfoInContractResponseModelMessage_QNAME = new QName("/CustomerInfo/Service/v1", "Message");
    private final static QName _ReplaceStockInfoDeviceProductResponseReplaceStockInfoDeviceProductResult_QNAME = new QName("/CustomerInfo/Service/v1", "ReplaceStockInfoDeviceProductResult");
    private final static QName _GetDealerStocksResponseGetDealerStocksResult_QNAME = new QName("/CustomerInfo/Service/v1", "GetDealerStocksResult");
    private final static QName _QueryCustomerStatusResponseQueryCustomerStatusResult_QNAME = new QName("/CustomerInfo/Service/v1", "QueryCustomerStatusResult");
    private final static QName _AddNumbersToVoipDeviceResponseAddNumbersToVoipDeviceResult_QNAME = new QName("/CustomerInfo/Service/v1", "AddNumbersToVoipDeviceResult");
    private final static QName _GetDealerStokResponseModelStockItemList_QNAME = new QName("/CustomerInfo/Service/v1", "StockItemList");
    private final static QName _QueryStockItemRequestModelSerialNumber_QNAME = new QName("/CustomerInfo/Service/v1", "SerialNumber");
    private final static QName _QueryNumberPoolItemResponseModelNumberPoolItem_QNAME = new QName("/CustomerInfo/Service/v1", "NumberPoolItem");
    private final static QName _ReleaseNumberPoolItemResponseReleaseNumberPoolItemResult_QNAME = new QName("/CustomerInfo/Service/v1", "ReleaseNumberPoolItemResult");
    private final static QName _CrmDocumentUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", "Url");
    private final static QName _CrmDocumentExtension_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", "Extension");
    private final static QName _CrmDocumentContent_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", "Content");
    private final static QName _CrmDocumentCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", "Code");
    private final static QName _BaseResponseModelResultMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Model", "ResultMessage");
    private final static QName _AssignStockItemRequestModelDescription_QNAME = new QName("/CustomerInfo/Service/v1", "Description");
    private final static QName _AssignStockItemRequestModelBillingContractNumber_QNAME = new QName("/CustomerInfo/Service/v1", "BillingContractNumber");
    private final static QName _AssignStockItemRequestModelUsername_QNAME = new QName("/CustomerInfo/Service/v1", "Username");
    private final static QName _AssignStockItemRequestModelIdentificationNumber_QNAME = new QName("/CustomerInfo/Service/v1", "IdentificationNumber");
    private final static QName _ActivateAccountResponseActivateAccountResult_QNAME = new QName("/CustomerInfo/Service/v1", "ActivateAccountResult");
    private final static QName _QueryStockItemOuidResponseQueryStockItemOuidResult_QNAME = new QName("/CustomerInfo/Service/v1", "QueryStockItemOuidResult");
    private final static QName _CustomerInfoNo_QNAME = new QName("http://milleni.com/Bpm", "No");
    private final static QName _ReplaceStockInfoInContractRequestModelReason_QNAME = new QName("/CustomerInfo/Service/v1", "Reason");
    private final static QName _GetCustomerResponseGetCustomerResult_QNAME = new QName("/CustomerInfo/Service/v1", "GetCustomerResult");
    private final static QName _AddNumbersToVoipDeviceRequestModelMac_QNAME = new QName("/CustomerInfo/Service/v1", "Mac");
    private final static QName _AddNumbersToVoipDeviceRequestModelPhoneNumbers_QNAME = new QName("/CustomerInfo/Service/v1", "PhoneNumbers");
    private final static QName _SetStockItemStatusResponseSetStockItemStatusResult_QNAME = new QName("/CustomerInfo/Service/v1", "SetStockItemStatusResult");
    private final static QName _CheckMillenifonGsmNumbersResponseModelNumbers_QNAME = new QName("/CustomerInfo/Service/v1", "Numbers");
    private final static QName _ListStockItemResponseListStockItemResult_QNAME = new QName("/CustomerInfo/Service/v1", "ListStockItemResult");
    private final static QName _QueryStockItemOuidResponseModelOuid_QNAME = new QName("/CustomerInfo/Service/v1", "Ouid");
    private final static QName _RemoveVoipDeviceResponseRemoveVoipDeviceResult_QNAME = new QName("/CustomerInfo/Service/v1", "RemoveVoipDeviceResult");
    private final static QName _CheckNumberGsmNo_QNAME = new QName("/CustomerInfo/Service/v1", "GsmNo");
    private final static QName _SetStockItemStatusBilledResponseSetStockItemStatusBilledResult_QNAME = new QName("/CustomerInfo/Service/v1", "SetStockItemStatusBilledResult");
    private final static QName _DeleteUserResponseDeleteUserResult_QNAME = new QName("/CustomerInfo/Service/v1", "DeleteUserResult");
    private final static QName _ReleaseStockItemResponseReleaseStockItemResult_QNAME = new QName("/CustomerInfo/Service/v1", "ReleaseStockItemResult");
    private final static QName _QueryOpenOrdersForDevicesResponseModelStockItemOrderInfos_QNAME = new QName("/CustomerInfo/Service/v1", "StockItemOrderInfos");
    private final static QName _ReserveNumberPoolItemRequestModelNumber_QNAME = new QName("/CustomerInfo/Service/v1", "Number");
    private final static QName _ReserveNumberPoolItemRequestModelOrderCode_QNAME = new QName("/CustomerInfo/Service/v1", "OrderCode");
    private final static QName _StockItemRelatedIdentification_QNAME = new QName("http://milleni.com/Crm", "RelatedIdentification");
    private final static QName _StockItemMACAddress_QNAME = new QName("http://milleni.com/Crm", "MACAddress");
    private final static QName _StockItemOfferName_QNAME = new QName("http://milleni.com/Crm", "OfferName");
    private final static QName _StockItemOrganization_QNAME = new QName("http://milleni.com/Crm", "Organization");
    private final static QName _StockItemOrganizationName_QNAME = new QName("http://milleni.com/Crm", "OrganizationName");
    private final static QName _StockItemOfferId_QNAME = new QName("http://milleni.com/Crm", "OfferId");
    private final static QName _StockItemFXSPort_QNAME = new QName("http://milleni.com/Crm", "FXSPort");
    private final static QName _StockItemSerialNumber_QNAME = new QName("http://milleni.com/Crm", "SerialNumber");
    private final static QName _StockItemFXOPort_QNAME = new QName("http://milleni.com/Crm", "FXOPort");
    private final static QName _StockItemModelName_QNAME = new QName("http://milleni.com/Crm", "ModelName");
    private final static QName _StockItemState_QNAME = new QName("http://milleni.com/Crm", "State");
    private final static QName _StockItemStockName_QNAME = new QName("http://milleni.com/Crm", "StockName");
    private final static QName _StockItemOuid_QNAME = new QName("http://milleni.com/Crm", "Ouid");
    private final static QName _StockItemBrandName_QNAME = new QName("http://milleni.com/Crm", "BrandName");
    private final static QName _ValidateContractActivationResponseValidateContractActivationResult_QNAME = new QName("/CustomerInfo/Service/v1", "ValidateContractActivationResult");
    private final static QName _FaultyStockItemsRequestModelSerialNumbers_QNAME = new QName("/CustomerInfo/Service/v1", "SerialNumbers");
    private final static QName _BulutSantralNumbersSipUserName_QNAME = new QName("/CustomerInfo/Service/v1", "SipUserName");
    private final static QName _BulutSantralNumbersPortaoneAccoutId_QNAME = new QName("/CustomerInfo/Service/v1", "PortaoneAccoutId");
    private final static QName _BulutSantralNumbersDevice_QNAME = new QName("/CustomerInfo/Service/v1", "Device");
    private final static QName _BulutSantralNumbersPortaoneNumberType_QNAME = new QName("/CustomerInfo/Service/v1", "PortaoneNumberType");
    private final static QName _BulutSantralNumbersSipPassword_QNAME = new QName("/CustomerInfo/Service/v1", "SipPassword");
    private final static QName _BulutSantralNumbersPortaoneCustomerId_QNAME = new QName("/CustomerInfo/Service/v1", "PortaoneCustomerId");
    private final static QName _BulutSantralNumbersPortaoneDevicePort_QNAME = new QName("/CustomerInfo/Service/v1", "PortaoneDevicePort");
    private final static QName _BulutSantralNumbersOperationType_QNAME = new QName("/CustomerInfo/Service/v1", "OperationType");
    private final static QName _BulutSantralNumbersCliNumber_QNAME = new QName("/CustomerInfo/Service/v1", "CliNumber");
    private final static QName _AddItemToStockReq_QNAME = new QName("/CustomerInfo/Service/v1", "req");
    private final static QName _RemovePoolItemsRequestModelPoolItemId_QNAME = new QName("/CustomerInfo/Service/v1", "PoolItemId");
    private final static QName _CrmPoolBillingId_QNAME = new QName("http://milleni.com/Crm", "BillingId");
    private final static QName _CrmPoolPoolItems_QNAME = new QName("http://milleni.com/Crm", "PoolItems");
    private final static QName _CrmAccountValidFrom_QNAME = new QName("http://milleni.com/Crm", "ValidFrom");
    private final static QName _CrmAccountReturnAccount_QNAME = new QName("http://milleni.com/Crm", "ReturnAccount");
    private final static QName _CrmAccountContracts_QNAME = new QName("http://milleni.com/Crm", "Contracts");
    private final static QName _CrmAccountBillingAddress_QNAME = new QName("http://milleni.com/Crm", "BillingAddress");
    private final static QName _CrmAccountPools_QNAME = new QName("http://milleni.com/Crm", "Pools");
    private final static QName _CrmAccountShipmentAddress_QNAME = new QName("http://milleni.com/Crm", "ShipmentAddress");
    private final static QName _CrmAccountBBKNumber_QNAME = new QName("http://milleni.com/Crm", "BBKNumber");
    private final static QName _CrmAccountInstallmentAddress_QNAME = new QName("http://milleni.com/Crm", "InstallmentAddress");
    private final static QName _CrmAccountBillingCustomerNumber_QNAME = new QName("http://milleni.com/Crm", "BillingCustomerNumber");
    private final static QName _CrmAccountValidTo_QNAME = new QName("http://milleni.com/Crm", "ValidTo");
    private final static QName _CrmAccountAccountName_QNAME = new QName("http://milleni.com/Crm", "AccountName");
    private final static QName _CrmAccountStatusChangeDate_QNAME = new QName("http://milleni.com/Crm", "StatusChangeDate");
    private final static QName _CrmAccountAccountCode_QNAME = new QName("http://milleni.com/Crm", "AccountCode");
    private final static QName _CrmAccountSoftInvoiceEmail_QNAME = new QName("http://milleni.com/Crm", "SoftInvoiceEmail");
    private final static QName _CrmAccountTTCustomerNo_QNAME = new QName("http://milleni.com/Crm", "TTCustomerNo");
    private final static QName _QueryCustomerRequestModelXdslNumber_QNAME = new QName("/CustomerInfo/Service/v1", "XdslNumber");
    private final static QName _QueryCustomerRequestModelCustomerOid_QNAME = new QName("/CustomerInfo/Service/v1", "CustomerOid");
    private final static QName _QueryCustomerRequestModelTelephoneNumber_QNAME = new QName("/CustomerInfo/Service/v1", "TelephoneNumber");
    private final static QName _QueryCustomerRequestModelTckn_QNAME = new QName("/CustomerInfo/Service/v1", "Tckn");
    private final static QName _QueryCustomerRequestModelMobilePhone_QNAME = new QName("/CustomerInfo/Service/v1", "MobilePhone");
    private final static QName _QueryCustomerRequestModelVkn_QNAME = new QName("/CustomerInfo/Service/v1", "Vkn");
    private final static QName _AddPoolItemsResponseAddPoolItemsResult_QNAME = new QName("/CustomerInfo/Service/v1", "AddPoolItemsResult");
    private final static QName _QueryStockItemOuidRequestModelMacAddress_QNAME = new QName("/CustomerInfo/Service/v1", "MacAddress");
    private final static QName _StockItemsResponseModelStockItems_QNAME = new QName("/CustomerInfo/Service/v1", "StockItems");
    private final static QName _ListStockItemRequestModelFxs_QNAME = new QName("/CustomerInfo/Service/v1", "Fxs");
    private final static QName _ListStockItemRequestModelStock_QNAME = new QName("/CustomerInfo/Service/v1", "Stock");
    private final static QName _ListStockItemRequestModelFxo_QNAME = new QName("/CustomerInfo/Service/v1", "Fxo");
    private final static QName _SuspendAccountRequestModelStatus_QNAME = new QName("/CustomerInfo/Service/v1", "Status");
    private final static QName _SuspendAccountRequestModelDunningProcessId_QNAME = new QName("/CustomerInfo/Service/v1", "DunningProcessId");
    private final static QName _SuspendAccountRequestModelStatusReasonDef_QNAME = new QName("/CustomerInfo/Service/v1", "StatusReasonDef");
    private final static QName _SuspendAccountRequestModelBillingCustomerId_QNAME = new QName("/CustomerInfo/Service/v1", "BillingCustomerId");
    private final static QName _GetCustomerByCustomerIdResponseGetCustomerByCustomerIdResult_QNAME = new QName("/CustomerInfo/Service/v1", "GetCustomerByCustomerIdResult");
    private final static QName _SetStockItemStatusOperationalTracingResponseSetStockItemStatusOperationalTracingResult_QNAME = new QName("/CustomerInfo/Service/v1", "SetStockItemStatusOperationalTracingResult");
    private final static QName _GetCustomerStockItemsRequestModelCustomerInfo_QNAME = new QName("/CustomerInfo/Service/v1", "CustomerInfo");
    private final static QName _QueryOpenOrdersForDevicesRequestModelStockItemSerialNos_QNAME = new QName("/CustomerInfo/Service/v1", "StockItemSerialNos");
    private final static QName _SetStockItemStatusAssignedSupportResponseSetStockItemStatusAssignedSupportResult_QNAME = new QName("/CustomerInfo/Service/v1", "SetStockItemStatusAssignedSupportResult");
    private final static QName _AssignNumberPoolItemRequestModelContractCode_QNAME = new QName("/CustomerInfo/Service/v1", "ContractCode");
    private final static QName _ContractedNumberActivationReasonDesc_QNAME = new QName("http://milleni.com/Crm", "ActivationReasonDesc");
    private final static QName _ContractedNumberNumberType_QNAME = new QName("http://milleni.com/Crm", "NumberType");
    private final static QName _ContractedNumberActivationReason_QNAME = new QName("http://milleni.com/Crm", "ActivationReason");
    private final static QName _CustomerWorkingArea_QNAME = new QName("http://milleni.com/Crm", "WorkingArea");
    private final static QName _CustomerAccounts_QNAME = new QName("http://milleni.com/Crm", "Accounts");
    private final static QName _CustomerSector_QNAME = new QName("http://milleni.com/Crm", "Sector");
    private final static QName _CustomerRegistrationNumber_QNAME = new QName("http://milleni.com/Crm", "RegistrationNumber");
    private final static QName _CustomerTckn_QNAME = new QName("http://milleni.com/Crm", "Tckn");
    private final static QName _CustomerFatherName_QNAME = new QName("http://milleni.com/Crm", "FatherName");
    private final static QName _CustomerNationality_QNAME = new QName("http://milleni.com/Crm", "Nationality");
    private final static QName _CustomerShortName_QNAME = new QName("http://milleni.com/Crm", "ShortName");
    private final static QName _CustomerFullName_QNAME = new QName("http://milleni.com/Crm", "FullName");
    private final static QName _CustomerSubSector_QNAME = new QName("http://milleni.com/Crm", "SubSector");
    private final static QName _CustomerContacts_QNAME = new QName("http://milleni.com/Crm", "Contacts");
    private final static QName _CustomerMotherMaidenName_QNAME = new QName("http://milleni.com/Crm", "MotherMaidenName");
    private final static QName _CustomerExemptionNumber_QNAME = new QName("http://milleni.com/Crm", "ExemptionNumber");
    private final static QName _CustomerPassportNo_QNAME = new QName("http://milleni.com/Crm", "PassportNo");
    private final static QName _GetNumbersFromPoolResponseGetNumbersFromPoolResult_QNAME = new QName("/CustomerInfo/Service/v1", "GetNumbersFromPoolResult");
    private final static QName _BaseFaultSIID_QNAME = new QName("http://milleni.com/technical/Fault", "SIID");
    private final static QName _BaseFaultActor_QNAME = new QName("http://milleni.com/technical/Fault", "Actor");
    private final static QName _BaseFaultDetail_QNAME = new QName("http://milleni.com/technical/Fault", "Detail");
    private final static QName _BaseFaultDescription_QNAME = new QName("http://milleni.com/technical/Fault", "Description");
    private final static QName _BaseFaultSource_QNAME = new QName("http://milleni.com/technical/Fault", "Source");
    private final static QName _BaseFaultParameters_QNAME = new QName("http://milleni.com/technical/Fault", "Parameters");
    private final static QName _AddUserResponseAddUserResult_QNAME = new QName("/CustomerInfo/Service/v1", "AddUserResult");
    private final static QName _UpdateDealerStockStatusResponseUpdateDealerStockStatusResult_QNAME = new QName("/CustomerInfo/Service/v1", "UpdateDealerStockStatusResult");
    private final static QName _AddNumbersToContractResponseAddNumbersToContractResult_QNAME = new QName("/CustomerInfo/Service/v1", "AddNumbersToContractResult");
    private final static QName _ChangeTitleCreateProductProcessId_QNAME = new QName("/CustomerInfo/Service/v1", "processId");
    private final static QName _RemovePoolResponseRemovePoolResult_QNAME = new QName("/CustomerInfo/Service/v1", "RemovePoolResult");
    private final static QName _QueryStockItemByStateResponseQueryStockItemByStateResult_QNAME = new QName("/CustomerInfo/Service/v1", "QueryStockItemByStateResult");
    private final static QName _SetStockItemStatusAssignedBilledResponseSetStockItemStatusAssignedBilledResult_QNAME = new QName("/CustomerInfo/Service/v1", "SetStockItemStatusAssignedBilledResult");
    private final static QName _AddMillenifonNumberRequestModelGsmNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", "GsmNumber");
    private final static QName _AddMillenifonNumberRequestModelApplicationName_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", "ApplicationName");
    private final static QName _BaseResponseDtoMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Contracts", "Message");
    private final static QName _GetSaleAvailabilityRequestModelIdentity_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", "Identity");
    private final static QName _QueryStockItemByStateRequestModelStates_QNAME = new QName("/CustomerInfo/Service/v1", "States");
    private final static QName _GetRemaingFreeUnitUsageByPhoneNumberResponseGetRemaingFreeUnitUsageByPhoneNumberResult_QNAME = new QName("/CustomerInfo/Service/v1", "GetRemaingFreeUnitUsageByPhoneNumberResult");
    private final static QName _StockItemOrderInfoStockItemSerialNo_QNAME = new QName("http://milleni.com/Crm", "StockItemSerialNo");
    private final static QName _StockItemOrderInfoOrderCode_QNAME = new QName("http://milleni.com/Crm", "OrderCode");
    private final static QName _SuspendCustomerContractResponseSuspendCustomerContractResult_QNAME = new QName("/CustomerInfo/Service/v1", "SuspendCustomerContractResult");
    private final static QName _ReserveStockItemResponseReserveStockItemResult_QNAME = new QName("/CustomerInfo/Service/v1", "ReserveStockItemResult");
    private final static QName _ReserveNumberPoolItemResponseReserveNumberPoolItemResult_QNAME = new QName("/CustomerInfo/Service/v1", "ReserveNumberPoolItemResult");
    private final static QName _UpdateDealerStokStatusResponseModelFaultedSerialNoList_QNAME = new QName("/CustomerInfo/Service/v1", "FaultedSerialNoList");
    private final static QName _UpdateDealerStokStatusResponseModelErrorMessage_QNAME = new QName("/CustomerInfo/Service/v1", "ErrorMessage");
    private final static QName _CrmContractProducts_QNAME = new QName("http://milleni.com/Crm", "Products");
    private final static QName _CrmContractMigrateInfo_QNAME = new QName("http://milleni.com/Crm", "MigrateInfo");
    private final static QName _CrmContractStatusReason_QNAME = new QName("http://milleni.com/Crm", "StatusReason");
    private final static QName _CrmContractContractCode_QNAME = new QName("http://milleni.com/Crm", "ContractCode");
    private final static QName _CrmContractSalesPersonIdentityId_QNAME = new QName("http://milleni.com/Crm", "SalesPersonIdentityId");
    private final static QName _CrmContractSalesPerson_QNAME = new QName("http://milleni.com/Crm", "SalesPerson");
    private final static QName _CrmContractPartnerCode_QNAME = new QName("http://milleni.com/Crm", "PartnerCode");
    private final static QName _CrmContractBillingContractNumber_QNAME = new QName("http://milleni.com/Crm", "BillingContractNumber");
    private final static QName _CrmContractSalesPersonOrganizationId_QNAME = new QName("http://milleni.com/Crm", "SalesPersonOrganizationId");
    private final static QName _CrmContractPartner_QNAME = new QName("http://milleni.com/Crm", "Partner");
    private final static QName _QueryCustomerResponseModelCustomer_QNAME = new QName("/CustomerInfo/Service/v1", "Customer");
    private final static QName _FaultyStockItemsResponseFaultyStockItemsResult_QNAME = new QName("/CustomerInfo/Service/v1", "FaultyStockItemsResult");
    private final static QName _AssignStockItemResponseAssignStockItemResult_QNAME = new QName("/CustomerInfo/Service/v1", "AssignStockItemResult");
    private final static QName _ContractedNumbersInfoBillingContractId_QNAME = new QName("http://milleni.com/Crm", "BillingContractId");
    private final static QName _ContractedNumbersInfoNumbers_QNAME = new QName("http://milleni.com/Crm", "Numbers");
    private final static QName _ContractedNumbersInfoNote_QNAME = new QName("http://milleni.com/Crm", "Note");
    private final static QName _ReplaceStockInfoInContractResponseReplaceStockInfoInContractResult_QNAME = new QName("/CustomerInfo/Service/v1", "ReplaceStockInfoInContractResult");
    private final static QName _ActivateCustomerContractResponseActivateCustomerContractResult_QNAME = new QName("/CustomerInfo/Service/v1", "ActivateCustomerContractResult");
    private final static QName _AddNumbersToContractRequestModelNumbersInfo_QNAME = new QName("/CustomerInfo/Service/v1", "NumbersInfo");
    private final static QName _GetSaleAvailabilityResponseGetSaleAvailabilityResult_QNAME = new QName("/CustomerInfo/Service/v1", "GetSaleAvailabilityResult");
    private final static QName _ActivateCustomerContractRequestModelBillingContractNo_QNAME = new QName("/CustomerInfo/Service/v1", "BillingContractNo");
    private final static QName _QueryStockItemResponseQueryStockItemResult_QNAME = new QName("/CustomerInfo/Service/v1", "QueryStockItemResult");
    private final static QName _QueryCustomerStatusResponseModelCrmCustomerMessageType_QNAME = new QName("/CustomerInfo/Service/v1", "CrmCustomerMessageType");
    private final static QName _ProcessRequestResponseProcessRequestResult_QNAME = new QName("/CustomerInfo/Service/v1", "ProcessRequestResult");
    private final static QName _ProvisionOrderItemToCRMResponseProvisionOrderItemToCRMResult_QNAME = new QName("/CustomerInfo/Service/v1", "ProvisionOrderItemToCRMResult");
    private final static QName _UserConfirmPassword_QNAME = new QName("http://milleni.com/Crm", "ConfirmPassword");
    private final static QName _UserPassword_QNAME = new QName("http://milleni.com/Crm", "Password");
    private final static QName _UserUserName_QNAME = new QName("http://milleni.com/Crm", "UserName");
    private final static QName _UserQueryLimit_QNAME = new QName("http://milleni.com/Crm", "QueryLimit");
    private final static QName _ValidateContractDeactivationResponseValidateContractDeactivationResult_QNAME = new QName("/CustomerInfo/Service/v1", "ValidateContractDeactivationResult");
    private final static QName _AddVoipDeviceWithProcessRequestModelDeviceSeriNo_QNAME = new QName("/CustomerInfo/Service/v1", "DeviceSeriNo");
    private final static QName _AddVoipDeviceWithProcessRequestModelDocument_QNAME = new QName("/CustomerInfo/Service/v1", "Document");
    private final static QName _GetBulutSantralNumbersByBillingContractNoResponseGetBulutSantralNumbersByBillingContractNoResult_QNAME = new QName("/CustomerInfo/Service/v1", "GetBulutSantralNumbersByBillingContractNoResult");
    private final static QName _CrmProductInternetProfile_QNAME = new QName("http://milleni.com/Crm", "InternetProfile");
    private final static QName _CrmProductXdslPassword_QNAME = new QName("http://milleni.com/Crm", "XdslPassword");
    private final static QName _CrmProductPcOfferId_QNAME = new QName("http://milleni.com/Crm", "PcOfferId");
    private final static QName _CrmProductBillingProductId_QNAME = new QName("http://milleni.com/Crm", "BillingProductId");
    private final static QName _CrmProductXdslUsername_QNAME = new QName("http://milleni.com/Crm", "XdslUsername");
    private final static QName _CrmProductSubModelName_QNAME = new QName("http://milleni.com/Crm", "SubModelName");
    private final static QName _CrmProductDocuments_QNAME = new QName("http://milleni.com/Crm", "Documents");
    private final static QName _CrmProductCatalogId_QNAME = new QName("http://milleni.com/Crm", "CatalogId");
    private final static QName _CrmProductXdslNumber_QNAME = new QName("http://milleni.com/Crm", "XdslNumber");
    private final static QName _CrmProductCatalogName_QNAME = new QName("http://milleni.com/Crm", "CatalogName");
    private final static QName _CrmProductMacAddress_QNAME = new QName("http://milleni.com/Crm", "MacAddress");
    private final static QName _CrmProductProductType_QNAME = new QName("http://milleni.com/Crm", "ProductType");
    private final static QName _CrmProductTTCustomerId_QNAME = new QName("http://milleni.com/Crm", "TTCustomerId");
    private final static QName _CrmProductStaticIpProductId_QNAME = new QName("http://milleni.com/Crm", "StaticIpProductId");
    private final static QName _CrmProductStaticIp_QNAME = new QName("http://milleni.com/Crm", "StaticIp");
    private final static QName _CRMProvisionRequestModelOrderRequestCode_QNAME = new QName("/CustomerInfo/Service/v1", "OrderRequestCode");
    private final static QName _CrmPoolItemAmount_QNAME = new QName("http://milleni.com/Crm", "Amount");
    private final static QName _CrmPoolItemAccount_QNAME = new QName("http://milleni.com/Crm", "Account");
    private final static QName _CrmPoolItemFreeUnitId_QNAME = new QName("http://milleni.com/Crm", "FreeUnitId");
    private final static QName _CrmPoolItemContract_QNAME = new QName("http://milleni.com/Crm", "Contract");
    private final static QName _ReleaseNumbersOfVoipDeviceResponseReleaseNumbersOfVoipDeviceResult_QNAME = new QName("/CustomerInfo/Service/v1", "ReleaseNumbersOfVoipDeviceResult");
    private final static QName _AddMillenifonNumberResponseAddMillenifonNumberResult_QNAME = new QName("/CustomerInfo/Service/v1", "AddMillenifonNumberResult");
    private final static QName _UnavailableNumberPoolItemResponseUnavailableNumberPoolItemResult_QNAME = new QName("/CustomerInfo/Service/v1", "UnavailableNumberPoolItemResult");
    private final static QName _GetDealerStokRequestModelOrganisation_QNAME = new QName("/CustomerInfo/Service/v1", "Organisation");
    private final static QName _BulutSantralVoipDeviceOfferId_QNAME = new QName("/CustomerInfo/Service/v1", "OfferId");
    private final static QName _BulutSantralVoipDeviceModelName_QNAME = new QName("/CustomerInfo/Service/v1", "ModelName");
    private final static QName _BulutSantralVoipDevicePortaoneKey_QNAME = new QName("/CustomerInfo/Service/v1", "PortaoneKey");
    private final static QName _BulutSantralVoipDeviceFxoPortCount_QNAME = new QName("/CustomerInfo/Service/v1", "FxoPortCount");
    private final static QName _BulutSantralVoipDeviceMACAdress_QNAME = new QName("/CustomerInfo/Service/v1", "MACAdress");
    private final static QName _BulutSantralVoipDeviceBrandName_QNAME = new QName("/CustomerInfo/Service/v1", "BrandName");
    private final static QName _BulutSantralVoipDeviceFxsPortCount_QNAME = new QName("/CustomerInfo/Service/v1", "FxsPortCount");
    private final static QName _AssignStockItemsResponseAssignStockItemsResult_QNAME = new QName("/CustomerInfo/Service/v1", "AssignStockItemsResult");
    private final static QName _NumberPoolItemCustomerType_QNAME = new QName("http://milleni.com/Crm", "CustomerType");
    private final static QName _UpdateDealerStokStatusRequestModelUpdateUserId_QNAME = new QName("/CustomerInfo/Service/v1", "UpdateUserId");
    private final static QName _UpdateDealerStokStatusRequestModelSerialNoList_QNAME = new QName("/CustomerInfo/Service/v1", "SerialNoList");
    private final static QName _UpdateDealerStokStatusRequestModelStockItemIdList_QNAME = new QName("/CustomerInfo/Service/v1", "StockItemIdList");
    private final static QName _DocumentInfoUrl_QNAME = new QName("/CustomerInfo/Service/v1", "Url");
    private final static QName _DocumentInfoCode_QNAME = new QName("/CustomerInfo/Service/v1", "Code");
    private final static QName _GetRemaingFreeUnitUsageByPhoneNumberRequestModelICustomer_QNAME = new QName("/CustomerInfo/Service/v1", "ICustomer");
    private final static QName _GetRemaingFreeUnitUsageByPhoneNumberRequestModelPhoneNumber_QNAME = new QName("/CustomerInfo/Service/v1", "PhoneNumber");
    private final static QName _ValidateAccountDeactivationResponseValidateAccountDeactivationResult_QNAME = new QName("/CustomerInfo/Service/v1", "ValidateAccountDeactivationResult");
    private final static QName _CrmReturnAccountIban_QNAME = new QName("http://milleni.com/Crm", "Iban");
    private final static QName _AddPoolItemsRequestModelPoolId_QNAME = new QName("/CustomerInfo/Service/v1", "PoolId");
    private final static QName _AddPoolItemsRequestModelContractIds_QNAME = new QName("/CustomerInfo/Service/v1", "ContractIds");
    private final static QName _GetCustomerStockItemsResponseGetCustomerStockItemsResult_QNAME = new QName("/CustomerInfo/Service/v1", "GetCustomerStockItemsResult");
    private final static QName _QueryOpenOrdersForDevicesResponseQueryOpenOrdersForDevicesResult_QNAME = new QName("/CustomerInfo/Service/v1", "QueryOpenOrdersForDevicesResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.milleni.dunning.ws.client.crm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrmNumber }
     * 
     */
    public CrmNumber createCrmNumber() {
        return new CrmNumber();
    }

    /**
     * Create an instance of {@link BlockNumberPoolItemResponse }
     * 
     */
    public BlockNumberPoolItemResponse createBlockNumberPoolItemResponse() {
        return new BlockNumberPoolItemResponse();
    }

    /**
     * Create an instance of {@link QueryStockItemResponseModel }
     * 
     */
    public QueryStockItemResponseModel createQueryStockItemResponseModel() {
        return new QueryStockItemResponseModel();
    }

    /**
     * Create an instance of {@link ArrayOfCrmDocument }
     * 
     */
    public ArrayOfCrmDocument createArrayOfCrmDocument() {
        return new ArrayOfCrmDocument();
    }

    /**
     * Create an instance of {@link SuspendAccount }
     * 
     */
    public SuspendAccount createSuspendAccount() {
        return new SuspendAccount();
    }

    /**
     * Create an instance of {@link RemovePoolItemsResponse }
     * 
     */
    public RemovePoolItemsResponse createRemovePoolItemsResponse() {
        return new RemovePoolItemsResponse();
    }

    /**
     * Create an instance of {@link RemoveMillenifonNumberResponse }
     * 
     */
    public RemoveMillenifonNumberResponse createRemoveMillenifonNumberResponse() {
        return new RemoveMillenifonNumberResponse();
    }

    /**
     * Create an instance of {@link QueryCustomerResponse }
     * 
     */
    public QueryCustomerResponse createQueryCustomerResponse() {
        return new QueryCustomerResponse();
    }

    /**
     * Create an instance of {@link ValidateContractDeactivationRequestModel }
     * 
     */
    public ValidateContractDeactivationRequestModel createValidateContractDeactivationRequestModel() {
        return new ValidateContractDeactivationRequestModel();
    }

    /**
     * Create an instance of {@link ReleaseNumbersOfVoipDeviceResponseModel }
     * 
     */
    public ReleaseNumbersOfVoipDeviceResponseModel createReleaseNumbersOfVoipDeviceResponseModel() {
        return new ReleaseNumbersOfVoipDeviceResponseModel();
    }

    /**
     * Create an instance of {@link ValidateAccountDeactivationResponseModel }
     * 
     */
    public ValidateAccountDeactivationResponseModel createValidateAccountDeactivationResponseModel() {
        return new ValidateAccountDeactivationResponseModel();
    }

    /**
     * Create an instance of {@link SetStockItemStatusControlResponse }
     * 
     */
    public SetStockItemStatusControlResponse createSetStockItemStatusControlResponse() {
        return new SetStockItemStatusControlResponse();
    }

    /**
     * Create an instance of {@link CancelProcessResponse }
     * 
     */
    public CancelProcessResponse createCancelProcessResponse() {
        return new CancelProcessResponse();
    }

    /**
     * Create an instance of {@link ListStockItem }
     * 
     */
    public ListStockItem createListStockItem() {
        return new ListStockItem();
    }

    /**
     * Create an instance of {@link ChangeStockItemStatusResponseModel }
     * 
     */
    public ChangeStockItemStatusResponseModel createChangeStockItemStatusResponseModel() {
        return new ChangeStockItemStatusResponseModel();
    }

    /**
     * Create an instance of {@link ProcessRetentionResponse }
     * 
     */
    public ProcessRetentionResponse createProcessRetentionResponse() {
        return new ProcessRetentionResponse();
    }

    /**
     * Create an instance of {@link ReplaceStockInfoDeviceProductRequestModel }
     * 
     */
    public ReplaceStockInfoDeviceProductRequestModel createReplaceStockInfoDeviceProductRequestModel() {
        return new ReplaceStockInfoDeviceProductRequestModel();
    }

    /**
     * Create an instance of {@link CheckMillenifonGsmNumbersResponse }
     * 
     */
    public CheckMillenifonGsmNumbersResponse createCheckMillenifonGsmNumbersResponse() {
        return new CheckMillenifonGsmNumbersResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCrmEmail }
     * 
     */
    public ArrayOfCrmEmail createArrayOfCrmEmail() {
        return new ArrayOfCrmEmail();
    }

    /**
     * Create an instance of {@link SuspendAccountResponse }
     * 
     */
    public SuspendAccountResponse createSuspendAccountResponse() {
        return new SuspendAccountResponse();
    }

    /**
     * Create an instance of {@link AddVoipDeviceWithProcessResponseModel }
     * 
     */
    public AddVoipDeviceWithProcessResponseModel createAddVoipDeviceWithProcessResponseModel() {
        return new AddVoipDeviceWithProcessResponseModel();
    }

    /**
     * Create an instance of {@link ArrayOfCrmWebAddress }
     * 
     */
    public ArrayOfCrmWebAddress createArrayOfCrmWebAddress() {
        return new ArrayOfCrmWebAddress();
    }

    /**
     * Create an instance of {@link UserResponseModel }
     * 
     */
    public UserResponseModel createUserResponseModel() {
        return new UserResponseModel();
    }

    /**
     * Create an instance of {@link ArrayOfCrmPool }
     * 
     */
    public ArrayOfCrmPool createArrayOfCrmPool() {
        return new ArrayOfCrmPool();
    }

    /**
     * Create an instance of {@link SellVoiceRecordResponse }
     * 
     */
    public SellVoiceRecordResponse createSellVoiceRecordResponse() {
        return new SellVoiceRecordResponse();
    }

    /**
     * Create an instance of {@link SetStockItemStatusBilled }
     * 
     */
    public SetStockItemStatusBilled createSetStockItemStatusBilled() {
        return new SetStockItemStatusBilled();
    }

    /**
     * Create an instance of {@link AddVoipDeviceWithProcessResponse }
     * 
     */
    public AddVoipDeviceWithProcessResponse createAddVoipDeviceWithProcessResponse() {
        return new AddVoipDeviceWithProcessResponse();
    }

    /**
     * Create an instance of {@link ReplaceStockInfoInContract }
     * 
     */
    public ReplaceStockInfoInContract createReplaceStockInfoInContract() {
        return new ReplaceStockInfoInContract();
    }

    /**
     * Create an instance of {@link DummyJobResponse }
     * 
     */
    public DummyJobResponse createDummyJobResponse() {
        return new DummyJobResponse();
    }

    /**
     * Create an instance of {@link CrmContact }
     * 
     */
    public CrmContact createCrmContact() {
        return new CrmContact();
    }

    /**
     * Create an instance of {@link GetBulutSantralNumbersByBillingContractNoRequestModel }
     * 
     */
    public GetBulutSantralNumbersByBillingContractNoRequestModel createGetBulutSantralNumbersByBillingContractNoRequestModel() {
        return new GetBulutSantralNumbersByBillingContractNoRequestModel();
    }

    /**
     * Create an instance of {@link RemovePoolRequestModel }
     * 
     */
    public RemovePoolRequestModel createRemovePoolRequestModel() {
        return new RemovePoolRequestModel();
    }

    /**
     * Create an instance of {@link ReleaseNumbersOfVoipDevice }
     * 
     */
    public ReleaseNumbersOfVoipDevice createReleaseNumbersOfVoipDevice() {
        return new ReleaseNumbersOfVoipDevice();
    }

    /**
     * Create an instance of {@link ChangeNumberPoolItemStatusResponseModel }
     * 
     */
    public ChangeNumberPoolItemStatusResponseModel createChangeNumberPoolItemStatusResponseModel() {
        return new ChangeNumberPoolItemStatusResponseModel();
    }

    /**
     * Create an instance of {@link ArrayOfCrmContract }
     * 
     */
    public ArrayOfCrmContract createArrayOfCrmContract() {
        return new ArrayOfCrmContract();
    }

    /**
     * Create an instance of {@link RemoveMillenifonNumber }
     * 
     */
    public RemoveMillenifonNumber createRemoveMillenifonNumber() {
        return new RemoveMillenifonNumber();
    }

    /**
     * Create an instance of {@link ValidateContractDeactivationResponseModel }
     * 
     */
    public ValidateContractDeactivationResponseModel createValidateContractDeactivationResponseModel() {
        return new ValidateContractDeactivationResponseModel();
    }

    /**
     * Create an instance of {@link UserRequestModel }
     * 
     */
    public UserRequestModel createUserRequestModel() {
        return new UserRequestModel();
    }

    /**
     * Create an instance of {@link ArrayOfCrmContact }
     * 
     */
    public ArrayOfCrmContact createArrayOfCrmContact() {
        return new ArrayOfCrmContact();
    }

    /**
     * Create an instance of {@link ReserveStockItem }
     * 
     */
    public ReserveStockItem createReserveStockItem() {
        return new ReserveStockItem();
    }

    /**
     * Create an instance of {@link GetNumbersFromPoolRequestModel }
     * 
     */
    public GetNumbersFromPoolRequestModel createGetNumbersFromPoolRequestModel() {
        return new GetNumbersFromPoolRequestModel();
    }

    /**
     * Create an instance of {@link CrmAddress }
     * 
     */
    public CrmAddress createCrmAddress() {
        return new CrmAddress();
    }

    /**
     * Create an instance of {@link CrmCustomerMessageType }
     * 
     */
    public CrmCustomerMessageType createCrmCustomerMessageType() {
        return new CrmCustomerMessageType();
    }

    /**
     * Create an instance of {@link QueryNumberPoolItemResponse }
     * 
     */
    public QueryNumberPoolItemResponse createQueryNumberPoolItemResponse() {
        return new QueryNumberPoolItemResponse();
    }

    /**
     * Create an instance of {@link CrmPhone }
     * 
     */
    public CrmPhone createCrmPhone() {
        return new CrmPhone();
    }

    /**
     * Create an instance of {@link AddPoolItems }
     * 
     */
    public AddPoolItems createAddPoolItems() {
        return new AddPoolItems();
    }

    /**
     * Create an instance of {@link ValidateContractActivationResponseModel }
     * 
     */
    public ValidateContractActivationResponseModel createValidateContractActivationResponseModel() {
        return new ValidateContractActivationResponseModel();
    }

    /**
     * Create an instance of {@link ArrayOfcheckNumber }
     * 
     */
    public ArrayOfcheckNumber createArrayOfcheckNumber() {
        return new ArrayOfcheckNumber();
    }

    /**
     * Create an instance of {@link SetStockItemStatusControl }
     * 
     */
    public SetStockItemStatusControl createSetStockItemStatusControl() {
        return new SetStockItemStatusControl();
    }

    /**
     * Create an instance of {@link ValidateAccountDeactivationRequestModel }
     * 
     */
    public ValidateAccountDeactivationRequestModel createValidateAccountDeactivationRequestModel() {
        return new ValidateAccountDeactivationRequestModel();
    }

    /**
     * Create an instance of {@link ProcessRequest }
     * 
     */
    public ProcessRequest createProcessRequest() {
        return new ProcessRequest();
    }

    /**
     * Create an instance of {@link AssignNumberPoolItemResponse }
     * 
     */
    public AssignNumberPoolItemResponse createAssignNumberPoolItemResponse() {
        return new AssignNumberPoolItemResponse();
    }

    /**
     * Create an instance of {@link ReplaceStockInfoInContractResponseModel }
     * 
     */
    public ReplaceStockInfoInContractResponseModel createReplaceStockInfoInContractResponseModel() {
        return new ReplaceStockInfoInContractResponseModel();
    }

    /**
     * Create an instance of {@link AddNumbersToVoipDeviceResponseModel }
     * 
     */
    public AddNumbersToVoipDeviceResponseModel createAddNumbersToVoipDeviceResponseModel() {
        return new AddNumbersToVoipDeviceResponseModel();
    }

    /**
     * Create an instance of {@link ReplaceStockInfoDeviceProductResponse }
     * 
     */
    public ReplaceStockInfoDeviceProductResponse createReplaceStockInfoDeviceProductResponse() {
        return new ReplaceStockInfoDeviceProductResponse();
    }

    /**
     * Create an instance of {@link SystemFault }
     * 
     */
    public SystemFault createSystemFault() {
        return new SystemFault();
    }

    /**
     * Create an instance of {@link GetDealerStocksResponse }
     * 
     */
    public GetDealerStocksResponse createGetDealerStocksResponse() {
        return new GetDealerStocksResponse();
    }

    /**
     * Create an instance of {@link AddPoolItemsResponseModel }
     * 
     */
    public AddPoolItemsResponseModel createAddPoolItemsResponseModel() {
        return new AddPoolItemsResponseModel();
    }

    /**
     * Create an instance of {@link GetSaleAvailability }
     * 
     */
    public GetSaleAvailability createGetSaleAvailability() {
        return new GetSaleAvailability();
    }

    /**
     * Create an instance of {@link QueryCustomerStatusResponse }
     * 
     */
    public QueryCustomerStatusResponse createQueryCustomerStatusResponse() {
        return new QueryCustomerStatusResponse();
    }

    /**
     * Create an instance of {@link GetCustomerByCustomerId }
     * 
     */
    public GetCustomerByCustomerId createGetCustomerByCustomerId() {
        return new GetCustomerByCustomerId();
    }

    /**
     * Create an instance of {@link AddNumbersToVoipDeviceResponse }
     * 
     */
    public AddNumbersToVoipDeviceResponse createAddNumbersToVoipDeviceResponse() {
        return new AddNumbersToVoipDeviceResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCrmAccount }
     * 
     */
    public ArrayOfCrmAccount createArrayOfCrmAccount() {
        return new ArrayOfCrmAccount();
    }

    /**
     * Create an instance of {@link GetDealerStokResponseModel }
     * 
     */
    public GetDealerStokResponseModel createGetDealerStokResponseModel() {
        return new GetDealerStokResponseModel();
    }

    /**
     * Create an instance of {@link QueryStockItemRequestModel }
     * 
     */
    public QueryStockItemRequestModel createQueryStockItemRequestModel() {
        return new QueryStockItemRequestModel();
    }

    /**
     * Create an instance of {@link QueryNumberPoolItemResponseModel }
     * 
     */
    public QueryNumberPoolItemResponseModel createQueryNumberPoolItemResponseModel() {
        return new QueryNumberPoolItemResponseModel();
    }

    /**
     * Create an instance of {@link ReleaseStockItem }
     * 
     */
    public ReleaseStockItem createReleaseStockItem() {
        return new ReleaseStockItem();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link ReleaseNumberPoolItemResponse }
     * 
     */
    public ReleaseNumberPoolItemResponse createReleaseNumberPoolItemResponse() {
        return new ReleaseNumberPoolItemResponse();
    }

    /**
     * Create an instance of {@link ReplaceStockInfoDeviceProduct }
     * 
     */
    public ReplaceStockInfoDeviceProduct createReplaceStockInfoDeviceProduct() {
        return new ReplaceStockInfoDeviceProduct();
    }

    /**
     * Create an instance of {@link CrmDocument }
     * 
     */
    public CrmDocument createCrmDocument() {
        return new CrmDocument();
    }

    /**
     * Create an instance of {@link BaseResponseModel }
     * 
     */
    public BaseResponseModel createBaseResponseModel() {
        return new BaseResponseModel();
    }

    /**
     * Create an instance of {@link AssignStockItemRequestModel }
     * 
     */
    public AssignStockItemRequestModel createAssignStockItemRequestModel() {
        return new AssignStockItemRequestModel();
    }

    /**
     * Create an instance of {@link ArrayOfStockItemOrderInfo }
     * 
     */
    public ArrayOfStockItemOrderInfo createArrayOfStockItemOrderInfo() {
        return new ArrayOfStockItemOrderInfo();
    }

    /**
     * Create an instance of {@link AddMillenifonNumber }
     * 
     */
    public AddMillenifonNumber createAddMillenifonNumber() {
        return new AddMillenifonNumber();
    }

    /**
     * Create an instance of {@link ActivateAccountResponse }
     * 
     */
    public ActivateAccountResponse createActivateAccountResponse() {
        return new ActivateAccountResponse();
    }

    /**
     * Create an instance of {@link ProcessProcessRequestResponseModel }
     * 
     */
    public ProcessProcessRequestResponseModel createProcessProcessRequestResponseModel() {
        return new ProcessProcessRequestResponseModel();
    }

    /**
     * Create an instance of {@link SetStockItemStatusAssignedSupport }
     * 
     */
    public SetStockItemStatusAssignedSupport createSetStockItemStatusAssignedSupport() {
        return new SetStockItemStatusAssignedSupport();
    }

    /**
     * Create an instance of {@link UnavailableNumberPoolItem }
     * 
     */
    public UnavailableNumberPoolItem createUnavailableNumberPoolItem() {
        return new UnavailableNumberPoolItem();
    }

    /**
     * Create an instance of {@link QueryStockItemOuidResponse }
     * 
     */
    public QueryStockItemOuidResponse createQueryStockItemOuidResponse() {
        return new QueryStockItemOuidResponse();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ReleaseStockItemRequestModel }
     * 
     */
    public ReleaseStockItemRequestModel createReleaseStockItemRequestModel() {
        return new ReleaseStockItemRequestModel();
    }

    /**
     * Create an instance of {@link RemovePoolResponseModel }
     * 
     */
    public RemovePoolResponseModel createRemovePoolResponseModel() {
        return new RemovePoolResponseModel();
    }

    /**
     * Create an instance of {@link CustomerInfo }
     * 
     */
    public CustomerInfo createCustomerInfo() {
        return new CustomerInfo();
    }

    /**
     * Create an instance of {@link ReplaceStockInfoInContractRequestModel }
     * 
     */
    public ReplaceStockInfoInContractRequestModel createReplaceStockInfoInContractRequestModel() {
        return new ReplaceStockInfoInContractRequestModel();
    }

    /**
     * Create an instance of {@link ProcessRetention }
     * 
     */
    public ProcessRetention createProcessRetention() {
        return new ProcessRetention();
    }

    /**
     * Create an instance of {@link AssignStockItems }
     * 
     */
    public AssignStockItems createAssignStockItems() {
        return new AssignStockItems();
    }

    /**
     * Create an instance of {@link SellVoiceRecordResponseModel }
     * 
     */
    public SellVoiceRecordResponseModel createSellVoiceRecordResponseModel() {
        return new SellVoiceRecordResponseModel();
    }

    /**
     * Create an instance of {@link GetCustomerResponse }
     * 
     */
    public GetCustomerResponse createGetCustomerResponse() {
        return new GetCustomerResponse();
    }

    /**
     * Create an instance of {@link AddNumbersToVoipDeviceRequestModel }
     * 
     */
    public AddNumbersToVoipDeviceRequestModel createAddNumbersToVoipDeviceRequestModel() {
        return new AddNumbersToVoipDeviceRequestModel();
    }

    /**
     * Create an instance of {@link SetStockItemStatusOperationalTracing }
     * 
     */
    public SetStockItemStatusOperationalTracing createSetStockItemStatusOperationalTracing() {
        return new SetStockItemStatusOperationalTracing();
    }

    /**
     * Create an instance of {@link BlockNumberPoolItem }
     * 
     */
    public BlockNumberPoolItem createBlockNumberPoolItem() {
        return new BlockNumberPoolItem();
    }

    /**
     * Create an instance of {@link AddNumbersToVoipDevice }
     * 
     */
    public AddNumbersToVoipDevice createAddNumbersToVoipDevice() {
        return new AddNumbersToVoipDevice();
    }

    /**
     * Create an instance of {@link AddItemToStockResponse }
     * 
     */
    public AddItemToStockResponse createAddItemToStockResponse() {
        return new AddItemToStockResponse();
    }

    /**
     * Create an instance of {@link SetStockItemStatusResponse }
     * 
     */
    public SetStockItemStatusResponse createSetStockItemStatusResponse() {
        return new SetStockItemStatusResponse();
    }

    /**
     * Create an instance of {@link CheckMillenifonGsmNumbersResponseModel }
     * 
     */
    public CheckMillenifonGsmNumbersResponseModel createCheckMillenifonGsmNumbersResponseModel() {
        return new CheckMillenifonGsmNumbersResponseModel();
    }

    /**
     * Create an instance of {@link ArrayOfCrmPhone }
     * 
     */
    public ArrayOfCrmPhone createArrayOfCrmPhone() {
        return new ArrayOfCrmPhone();
    }

    /**
     * Create an instance of {@link ListStockItemResponse }
     * 
     */
    public ListStockItemResponse createListStockItemResponse() {
        return new ListStockItemResponse();
    }

    /**
     * Create an instance of {@link QueryStockItemOuidResponseModel }
     * 
     */
    public QueryStockItemOuidResponseModel createQueryStockItemOuidResponseModel() {
        return new QueryStockItemOuidResponseModel();
    }

    /**
     * Create an instance of {@link ArrayOfStockItem }
     * 
     */
    public ArrayOfStockItem createArrayOfStockItem() {
        return new ArrayOfStockItem();
    }

    /**
     * Create an instance of {@link RemoveVoipDeviceResponse }
     * 
     */
    public RemoveVoipDeviceResponse createRemoveVoipDeviceResponse() {
        return new RemoveVoipDeviceResponse();
    }

    /**
     * Create an instance of {@link FaultyStockItems }
     * 
     */
    public FaultyStockItems createFaultyStockItems() {
        return new FaultyStockItems();
    }

    /**
     * Create an instance of {@link RemovePoolItemsResponseModel }
     * 
     */
    public RemovePoolItemsResponseModel createRemovePoolItemsResponseModel() {
        return new RemovePoolItemsResponseModel();
    }

    /**
     * Create an instance of {@link CheckNumber }
     * 
     */
    public CheckNumber createCheckNumber() {
        return new CheckNumber();
    }

    /**
     * Create an instance of {@link SetStockItemStatusBilledResponse }
     * 
     */
    public SetStockItemStatusBilledResponse createSetStockItemStatusBilledResponse() {
        return new SetStockItemStatusBilledResponse();
    }

    /**
     * Create an instance of {@link QueryNumberPoolItem }
     * 
     */
    public QueryNumberPoolItem createQueryNumberPoolItem() {
        return new QueryNumberPoolItem();
    }

    /**
     * Create an instance of {@link CancelProcessRequestModel }
     * 
     */
    public CancelProcessRequestModel createCancelProcessRequestModel() {
        return new CancelProcessRequestModel();
    }

    /**
     * Create an instance of {@link ReleaseStockItemResponse }
     * 
     */
    public ReleaseStockItemResponse createReleaseStockItemResponse() {
        return new ReleaseStockItemResponse();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link QueryOpenOrdersForDevices }
     * 
     */
    public QueryOpenOrdersForDevices createQueryOpenOrdersForDevices() {
        return new QueryOpenOrdersForDevices();
    }

    /**
     * Create an instance of {@link ReserveNumberPoolItem }
     * 
     */
    public ReserveNumberPoolItem createReserveNumberPoolItem() {
        return new ReserveNumberPoolItem();
    }

    /**
     * Create an instance of {@link QueryOpenOrdersForDevicesResponseModel }
     * 
     */
    public QueryOpenOrdersForDevicesResponseModel createQueryOpenOrdersForDevicesResponseModel() {
        return new QueryOpenOrdersForDevicesResponseModel();
    }

    /**
     * Create an instance of {@link ArrayOfCrmPoolItem }
     * 
     */
    public ArrayOfCrmPoolItem createArrayOfCrmPoolItem() {
        return new ArrayOfCrmPoolItem();
    }

    /**
     * Create an instance of {@link ReserveNumberPoolItemRequestModel }
     * 
     */
    public ReserveNumberPoolItemRequestModel createReserveNumberPoolItemRequestModel() {
        return new ReserveNumberPoolItemRequestModel();
    }

    /**
     * Create an instance of {@link StockItem }
     * 
     */
    public StockItem createStockItem() {
        return new StockItem();
    }

    /**
     * Create an instance of {@link ArrayOfBulutSantralNumbers }
     * 
     */
    public ArrayOfBulutSantralNumbers createArrayOfBulutSantralNumbers() {
        return new ArrayOfBulutSantralNumbers();
    }

    /**
     * Create an instance of {@link ValidateContractActivationResponse }
     * 
     */
    public ValidateContractActivationResponse createValidateContractActivationResponse() {
        return new ValidateContractActivationResponse();
    }

    /**
     * Create an instance of {@link BulutSantralNumbers }
     * 
     */
    public BulutSantralNumbers createBulutSantralNumbers() {
        return new BulutSantralNumbers();
    }

    /**
     * Create an instance of {@link FaultyStockItemsRequestModel }
     * 
     */
    public FaultyStockItemsRequestModel createFaultyStockItemsRequestModel() {
        return new FaultyStockItemsRequestModel();
    }

    /**
     * Create an instance of {@link RemoveVoipDevice }
     * 
     */
    public RemoveVoipDevice createRemoveVoipDevice() {
        return new RemoveVoipDevice();
    }

    /**
     * Create an instance of {@link GetNumbersFromPoolResponseModel }
     * 
     */
    public GetNumbersFromPoolResponseModel createGetNumbersFromPoolResponseModel() {
        return new GetNumbersFromPoolResponseModel();
    }

    /**
     * Create an instance of {@link AddItemToStock }
     * 
     */
    public AddItemToStock createAddItemToStock() {
        return new AddItemToStock();
    }

    /**
     * Create an instance of {@link RemovePoolItemsRequestModel }
     * 
     */
    public RemovePoolItemsRequestModel createRemovePoolItemsRequestModel() {
        return new RemovePoolItemsRequestModel();
    }

    /**
     * Create an instance of {@link CrmPool }
     * 
     */
    public CrmPool createCrmPool() {
        return new CrmPool();
    }

    /**
     * Create an instance of {@link ArrayOfCrmAddress }
     * 
     */
    public ArrayOfCrmAddress createArrayOfCrmAddress() {
        return new ArrayOfCrmAddress();
    }

    /**
     * Create an instance of {@link CrmAccount }
     * 
     */
    public CrmAccount createCrmAccount() {
        return new CrmAccount();
    }

    /**
     * Create an instance of {@link BusinessFault }
     * 
     */
    public BusinessFault createBusinessFault() {
        return new BusinessFault();
    }

    /**
     * Create an instance of {@link QueryCustomerRequestModel }
     * 
     */
    public QueryCustomerRequestModel createQueryCustomerRequestModel() {
        return new QueryCustomerRequestModel();
    }

    /**
     * Create an instance of {@link AddPoolItemsResponse }
     * 
     */
    public AddPoolItemsResponse createAddPoolItemsResponse() {
        return new AddPoolItemsResponse();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link QueryStockItemOuidRequestModel }
     * 
     */
    public QueryStockItemOuidRequestModel createQueryStockItemOuidRequestModel() {
        return new QueryStockItemOuidRequestModel();
    }

    /**
     * Create an instance of {@link RemovePool }
     * 
     */
    public RemovePool createRemovePool() {
        return new RemovePool();
    }

    /**
     * Create an instance of {@link ActivateAccount }
     * 
     */
    public ActivateAccount createActivateAccount() {
        return new ActivateAccount();
    }

    /**
     * Create an instance of {@link ProcessProcessRequestRequestModel }
     * 
     */
    public ProcessProcessRequestRequestModel createProcessProcessRequestRequestModel() {
        return new ProcessProcessRequestRequestModel();
    }

    /**
     * Create an instance of {@link StockItemsResponseModel }
     * 
     */
    public StockItemsResponseModel createStockItemsResponseModel() {
        return new StockItemsResponseModel();
    }

    /**
     * Create an instance of {@link ListStockItemRequestModel }
     * 
     */
    public ListStockItemRequestModel createListStockItemRequestModel() {
        return new ListStockItemRequestModel();
    }

    /**
     * Create an instance of {@link SuspendAccountRequestModel }
     * 
     */
    public SuspendAccountRequestModel createSuspendAccountRequestModel() {
        return new SuspendAccountRequestModel();
    }

    /**
     * Create an instance of {@link GetCustomerByCustomerIdResponse }
     * 
     */
    public GetCustomerByCustomerIdResponse createGetCustomerByCustomerIdResponse() {
        return new GetCustomerByCustomerIdResponse();
    }

    /**
     * Create an instance of {@link GetCustomer }
     * 
     */
    public GetCustomer createGetCustomer() {
        return new GetCustomer();
    }

    /**
     * Create an instance of {@link AssignStockItem }
     * 
     */
    public AssignStockItem createAssignStockItem() {
        return new AssignStockItem();
    }

    /**
     * Create an instance of {@link AssignStockItemsRequestModel }
     * 
     */
    public AssignStockItemsRequestModel createAssignStockItemsRequestModel() {
        return new AssignStockItemsRequestModel();
    }

    /**
     * Create an instance of {@link SetStockItemStatusOperationalTracingResponse }
     * 
     */
    public SetStockItemStatusOperationalTracingResponse createSetStockItemStatusOperationalTracingResponse() {
        return new SetStockItemStatusOperationalTracingResponse();
    }

    /**
     * Create an instance of {@link GetCustomerStockItemsRequestModel }
     * 
     */
    public GetCustomerStockItemsRequestModel createGetCustomerStockItemsRequestModel() {
        return new GetCustomerStockItemsRequestModel();
    }

    /**
     * Create an instance of {@link GetRemaingFreeUnitUsageByPhoneNumber }
     * 
     */
    public GetRemaingFreeUnitUsageByPhoneNumber createGetRemaingFreeUnitUsageByPhoneNumber() {
        return new GetRemaingFreeUnitUsageByPhoneNumber();
    }

    /**
     * Create an instance of {@link QueryOpenOrdersForDevicesRequestModel }
     * 
     */
    public QueryOpenOrdersForDevicesRequestModel createQueryOpenOrdersForDevicesRequestModel() {
        return new QueryOpenOrdersForDevicesRequestModel();
    }

    /**
     * Create an instance of {@link SuspendAccountResponseModel }
     * 
     */
    public SuspendAccountResponseModel createSuspendAccountResponseModel() {
        return new SuspendAccountResponseModel();
    }

    /**
     * Create an instance of {@link AddStockItemToStockRequestModel }
     * 
     */
    public AddStockItemToStockRequestModel createAddStockItemToStockRequestModel() {
        return new AddStockItemToStockRequestModel();
    }

    /**
     * Create an instance of {@link SetStockItemStatusAssignedSupportResponse }
     * 
     */
    public SetStockItemStatusAssignedSupportResponse createSetStockItemStatusAssignedSupportResponse() {
        return new SetStockItemStatusAssignedSupportResponse();
    }

    /**
     * Create an instance of {@link AssignNumberPoolItemRequestModel }
     * 
     */
    public AssignNumberPoolItemRequestModel createAssignNumberPoolItemRequestModel() {
        return new AssignNumberPoolItemRequestModel();
    }

    /**
     * Create an instance of {@link QueryCustomer }
     * 
     */
    public QueryCustomer createQueryCustomer() {
        return new QueryCustomer();
    }

    /**
     * Create an instance of {@link SetStockItemStatus }
     * 
     */
    public SetStockItemStatus createSetStockItemStatus() {
        return new SetStockItemStatus();
    }

    /**
     * Create an instance of {@link ContractedNumber }
     * 
     */
    public ContractedNumber createContractedNumber() {
        return new ContractedNumber();
    }

    /**
     * Create an instance of {@link GetCustomerStockItems }
     * 
     */
    public GetCustomerStockItems createGetCustomerStockItems() {
        return new GetCustomerStockItems();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link ValidateContractActivationRequestModel }
     * 
     */
    public ValidateContractActivationRequestModel createValidateContractActivationRequestModel() {
        return new ValidateContractActivationRequestModel();
    }

    /**
     * Create an instance of {@link GetNumbersFromPoolResponse }
     * 
     */
    public GetNumbersFromPoolResponse createGetNumbersFromPoolResponse() {
        return new GetNumbersFromPoolResponse();
    }

    /**
     * Create an instance of {@link RemoveVoipDeviceResponseModel }
     * 
     */
    public RemoveVoipDeviceResponseModel createRemoveVoipDeviceResponseModel() {
        return new RemoveVoipDeviceResponseModel();
    }

    /**
     * Create an instance of {@link BaseFault }
     * 
     */
    public BaseFault createBaseFault() {
        return new BaseFault();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link UpdateDealerStockStatusResponse }
     * 
     */
    public UpdateDealerStockStatusResponse createUpdateDealerStockStatusResponse() {
        return new UpdateDealerStockStatusResponse();
    }

    /**
     * Create an instance of {@link RemovePoolItems }
     * 
     */
    public RemovePoolItems createRemovePoolItems() {
        return new RemovePoolItems();
    }

    /**
     * Create an instance of {@link AddNumbersToContractResponse }
     * 
     */
    public AddNumbersToContractResponse createAddNumbersToContractResponse() {
        return new AddNumbersToContractResponse();
    }

    /**
     * Create an instance of {@link ChangeTitleCreateProduct }
     * 
     */
    public ChangeTitleCreateProduct createChangeTitleCreateProduct() {
        return new ChangeTitleCreateProduct();
    }

    /**
     * Create an instance of {@link UnavailableNumberPoolItemRequestModel }
     * 
     */
    public UnavailableNumberPoolItemRequestModel createUnavailableNumberPoolItemRequestModel() {
        return new UnavailableNumberPoolItemRequestModel();
    }

    /**
     * Create an instance of {@link ArrayOfguid }
     * 
     */
    public ArrayOfguid createArrayOfguid() {
        return new ArrayOfguid();
    }

    /**
     * Create an instance of {@link ActivateAccountOneWay }
     * 
     */
    public ActivateAccountOneWay createActivateAccountOneWay() {
        return new ActivateAccountOneWay();
    }

    /**
     * Create an instance of {@link ReserveStockItemRequestModel }
     * 
     */
    public ReserveStockItemRequestModel createReserveStockItemRequestModel() {
        return new ReserveStockItemRequestModel();
    }

    /**
     * Create an instance of {@link RemovePoolResponse }
     * 
     */
    public RemovePoolResponse createRemovePoolResponse() {
        return new RemovePoolResponse();
    }

    /**
     * Create an instance of {@link ValidateContractActivation }
     * 
     */
    public ValidateContractActivation createValidateContractActivation() {
        return new ValidateContractActivation();
    }

    /**
     * Create an instance of {@link BlockNumberPoolItemRequestModel }
     * 
     */
    public BlockNumberPoolItemRequestModel createBlockNumberPoolItemRequestModel() {
        return new BlockNumberPoolItemRequestModel();
    }

    /**
     * Create an instance of {@link QueryStockItemByStateResponse }
     * 
     */
    public QueryStockItemByStateResponse createQueryStockItemByStateResponse() {
        return new QueryStockItemByStateResponse();
    }

    /**
     * Create an instance of {@link SetStockItemStatusAssignedBilledResponse }
     * 
     */
    public SetStockItemStatusAssignedBilledResponse createSetStockItemStatusAssignedBilledResponse() {
        return new SetStockItemStatusAssignedBilledResponse();
    }

    /**
     * Create an instance of {@link AddMillenifonNumberRequestModel }
     * 
     */
    public AddMillenifonNumberRequestModel createAddMillenifonNumberRequestModel() {
        return new AddMillenifonNumberRequestModel();
    }

    /**
     * Create an instance of {@link BaseResponseDto }
     * 
     */
    public BaseResponseDto createBaseResponseDto() {
        return new BaseResponseDto();
    }

    /**
     * Create an instance of {@link GetSaleAvailabilityRequestModel }
     * 
     */
    public GetSaleAvailabilityRequestModel createGetSaleAvailabilityRequestModel() {
        return new GetSaleAvailabilityRequestModel();
    }

    /**
     * Create an instance of {@link GetBulutSantralNumbersByBillingContractNoResponseModel }
     * 
     */
    public GetBulutSantralNumbersByBillingContractNoResponseModel createGetBulutSantralNumbersByBillingContractNoResponseModel() {
        return new GetBulutSantralNumbersByBillingContractNoResponseModel();
    }

    /**
     * Create an instance of {@link QueryCustomerStatusRequestModel }
     * 
     */
    public QueryCustomerStatusRequestModel createQueryCustomerStatusRequestModel() {
        return new QueryCustomerStatusRequestModel();
    }

    /**
     * Create an instance of {@link ActivateAccountResponseModel }
     * 
     */
    public ActivateAccountResponseModel createActivateAccountResponseModel() {
        return new ActivateAccountResponseModel();
    }

    /**
     * Create an instance of {@link QueryStockItemByStateRequestModel }
     * 
     */
    public QueryStockItemByStateRequestModel createQueryStockItemByStateRequestModel() {
        return new QueryStockItemByStateRequestModel();
    }

    /**
     * Create an instance of {@link GetRemaingFreeUnitUsageByPhoneNumberResponse }
     * 
     */
    public GetRemaingFreeUnitUsageByPhoneNumberResponse createGetRemaingFreeUnitUsageByPhoneNumberResponse() {
        return new GetRemaingFreeUnitUsageByPhoneNumberResponse();
    }

    /**
     * Create an instance of {@link UpdateDealerStockStatus }
     * 
     */
    public UpdateDealerStockStatus createUpdateDealerStockStatus() {
        return new UpdateDealerStockStatus();
    }

    /**
     * Create an instance of {@link StockItemOrderInfo }
     * 
     */
    public StockItemOrderInfo createStockItemOrderInfo() {
        return new StockItemOrderInfo();
    }

    /**
     * Create an instance of {@link SuspendCustomerContractResponse }
     * 
     */
    public SuspendCustomerContractResponse createSuspendCustomerContractResponse() {
        return new SuspendCustomerContractResponse();
    }

    /**
     * Create an instance of {@link RemoveMillenifonNumberRequestModel }
     * 
     */
    public RemoveMillenifonNumberRequestModel createRemoveMillenifonNumberRequestModel() {
        return new RemoveMillenifonNumberRequestModel();
    }

    /**
     * Create an instance of {@link ReserveStockItemResponse }
     * 
     */
    public ReserveStockItemResponse createReserveStockItemResponse() {
        return new ReserveStockItemResponse();
    }

    /**
     * Create an instance of {@link AddVoipDeviceWithProcess }
     * 
     */
    public AddVoipDeviceWithProcess createAddVoipDeviceWithProcess() {
        return new AddVoipDeviceWithProcess();
    }

    /**
     * Create an instance of {@link ReserveNumberPoolItemResponse }
     * 
     */
    public ReserveNumberPoolItemResponse createReserveNumberPoolItemResponse() {
        return new ReserveNumberPoolItemResponse();
    }

    /**
     * Create an instance of {@link CheckMillenifonGsmNumbersRequestModel }
     * 
     */
    public CheckMillenifonGsmNumbersRequestModel createCheckMillenifonGsmNumbersRequestModel() {
        return new CheckMillenifonGsmNumbersRequestModel();
    }

    /**
     * Create an instance of {@link UpdateDealerStokStatusResponseModel }
     * 
     */
    public UpdateDealerStokStatusResponseModel createUpdateDealerStokStatusResponseModel() {
        return new UpdateDealerStokStatusResponseModel();
    }

    /**
     * Create an instance of {@link CrmContract }
     * 
     */
    public CrmContract createCrmContract() {
        return new CrmContract();
    }

    /**
     * Create an instance of {@link QueryCustomerResponseModel }
     * 
     */
    public QueryCustomerResponseModel createQueryCustomerResponseModel() {
        return new QueryCustomerResponseModel();
    }

    /**
     * Create an instance of {@link ActivateCustomerContract }
     * 
     */
    public ActivateCustomerContract createActivateCustomerContract() {
        return new ActivateCustomerContract();
    }

    /**
     * Create an instance of {@link FaultyStockItemsResponse }
     * 
     */
    public FaultyStockItemsResponse createFaultyStockItemsResponse() {
        return new FaultyStockItemsResponse();
    }

    /**
     * Create an instance of {@link GetSaleAvailabilityResponseModel }
     * 
     */
    public GetSaleAvailabilityResponseModel createGetSaleAvailabilityResponseModel() {
        return new GetSaleAvailabilityResponseModel();
    }

    /**
     * Create an instance of {@link AssignStockItemResponse }
     * 
     */
    public AssignStockItemResponse createAssignStockItemResponse() {
        return new AssignStockItemResponse();
    }

    /**
     * Create an instance of {@link RemoveVoipDeviceRequestModel }
     * 
     */
    public RemoveVoipDeviceRequestModel createRemoveVoipDeviceRequestModel() {
        return new RemoveVoipDeviceRequestModel();
    }

    /**
     * Create an instance of {@link ChangeStockItemStatusRequestModel }
     * 
     */
    public ChangeStockItemStatusRequestModel createChangeStockItemStatusRequestModel() {
        return new ChangeStockItemStatusRequestModel();
    }

    /**
     * Create an instance of {@link CRMProvisionResponseModel }
     * 
     */
    public CRMProvisionResponseModel createCRMProvisionResponseModel() {
        return new CRMProvisionResponseModel();
    }

    /**
     * Create an instance of {@link CrmDocumentUpdateAfterSetupResponse }
     * 
     */
    public CrmDocumentUpdateAfterSetupResponse createCrmDocumentUpdateAfterSetupResponse() {
        return new CrmDocumentUpdateAfterSetupResponse();
    }

    /**
     * Create an instance of {@link ContractedNumbersInfo }
     * 
     */
    public ContractedNumbersInfo createContractedNumbersInfo() {
        return new ContractedNumbersInfo();
    }

    /**
     * Create an instance of {@link ReplaceStockInfoInContractResponse }
     * 
     */
    public ReplaceStockInfoInContractResponse createReplaceStockInfoInContractResponse() {
        return new ReplaceStockInfoInContractResponse();
    }

    /**
     * Create an instance of {@link ActivateCustomerContractResponse }
     * 
     */
    public ActivateCustomerContractResponse createActivateCustomerContractResponse() {
        return new ActivateCustomerContractResponse();
    }

    /**
     * Create an instance of {@link GetSaleAvailabilityResponse }
     * 
     */
    public GetSaleAvailabilityResponse createGetSaleAvailabilityResponse() {
        return new GetSaleAvailabilityResponse();
    }

    /**
     * Create an instance of {@link AddNumbersToContractRequestModel }
     * 
     */
    public AddNumbersToContractRequestModel createAddNumbersToContractRequestModel() {
        return new AddNumbersToContractRequestModel();
    }

    /**
     * Create an instance of {@link QueryNumberPoolItemRequestModel }
     * 
     */
    public QueryNumberPoolItemRequestModel createQueryNumberPoolItemRequestModel() {
        return new QueryNumberPoolItemRequestModel();
    }

    /**
     * Create an instance of {@link ReleaseNumbersOfVoipDeviceRequestModel }
     * 
     */
    public ReleaseNumbersOfVoipDeviceRequestModel createReleaseNumbersOfVoipDeviceRequestModel() {
        return new ReleaseNumbersOfVoipDeviceRequestModel();
    }

    /**
     * Create an instance of {@link ActivateCustomerContractRequestModel }
     * 
     */
    public ActivateCustomerContractRequestModel createActivateCustomerContractRequestModel() {
        return new ActivateCustomerContractRequestModel();
    }

    /**
     * Create an instance of {@link QueryStockItemResponse }
     * 
     */
    public QueryStockItemResponse createQueryStockItemResponse() {
        return new QueryStockItemResponse();
    }

    /**
     * Create an instance of {@link QueryCustomerStatusResponseModel }
     * 
     */
    public QueryCustomerStatusResponseModel createQueryCustomerStatusResponseModel() {
        return new QueryCustomerStatusResponseModel();
    }

    /**
     * Create an instance of {@link ProcessRequestResponse }
     * 
     */
    public ProcessRequestResponse createProcessRequestResponse() {
        return new ProcessRequestResponse();
    }

    /**
     * Create an instance of {@link ListStockItemResponseModel }
     * 
     */
    public ListStockItemResponseModel createListStockItemResponseModel() {
        return new ListStockItemResponseModel();
    }

    /**
     * Create an instance of {@link GetCustomerResponseModel }
     * 
     */
    public GetCustomerResponseModel createGetCustomerResponseModel() {
        return new GetCustomerResponseModel();
    }

    /**
     * Create an instance of {@link GetDealerStocks }
     * 
     */
    public GetDealerStocks createGetDealerStocks() {
        return new GetDealerStocks();
    }

    /**
     * Create an instance of {@link GetCustomerRequestModel }
     * 
     */
    public GetCustomerRequestModel createGetCustomerRequestModel() {
        return new GetCustomerRequestModel();
    }

    /**
     * Create an instance of {@link SetStockItemStatusAssignedBilled }
     * 
     */
    public SetStockItemStatusAssignedBilled createSetStockItemStatusAssignedBilled() {
        return new SetStockItemStatusAssignedBilled();
    }

    /**
     * Create an instance of {@link QueryCustomerStatus }
     * 
     */
    public QueryCustomerStatus createQueryCustomerStatus() {
        return new QueryCustomerStatus();
    }

    /**
     * Create an instance of {@link ProvisionOrderItemToCRMResponse }
     * 
     */
    public ProvisionOrderItemToCRMResponse createProvisionOrderItemToCRMResponse() {
        return new ProvisionOrderItemToCRMResponse();
    }

    /**
     * Create an instance of {@link ReplaceStockInfoDeviceProductResponseModel }
     * 
     */
    public ReplaceStockInfoDeviceProductResponseModel createReplaceStockInfoDeviceProductResponseModel() {
        return new ReplaceStockInfoDeviceProductResponseModel();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link ValidateContractDeactivationResponse }
     * 
     */
    public ValidateContractDeactivationResponse createValidateContractDeactivationResponse() {
        return new ValidateContractDeactivationResponse();
    }

    /**
     * Create an instance of {@link AddVoipDeviceWithProcessRequestModel }
     * 
     */
    public AddVoipDeviceWithProcessRequestModel createAddVoipDeviceWithProcessRequestModel() {
        return new AddVoipDeviceWithProcessRequestModel();
    }

    /**
     * Create an instance of {@link GetBulutSantralNumbersByBillingContractNoResponse }
     * 
     */
    public GetBulutSantralNumbersByBillingContractNoResponse createGetBulutSantralNumbersByBillingContractNoResponse() {
        return new GetBulutSantralNumbersByBillingContractNoResponse();
    }

    /**
     * Create an instance of {@link CrmProduct }
     * 
     */
    public CrmProduct createCrmProduct() {
        return new CrmProduct();
    }

    /**
     * Create an instance of {@link CRMProvisionRequestModel }
     * 
     */
    public CRMProvisionRequestModel createCRMProvisionRequestModel() {
        return new CRMProvisionRequestModel();
    }

    /**
     * Create an instance of {@link ArrayOfCrmProduct }
     * 
     */
    public ArrayOfCrmProduct createArrayOfCrmProduct() {
        return new ArrayOfCrmProduct();
    }

    /**
     * Create an instance of {@link ActivateAccountRequestModel }
     * 
     */
    public ActivateAccountRequestModel createActivateAccountRequestModel() {
        return new ActivateAccountRequestModel();
    }

    /**
     * Create an instance of {@link ArrayOfContractedNumber }
     * 
     */
    public ArrayOfContractedNumber createArrayOfContractedNumber() {
        return new ArrayOfContractedNumber();
    }

    /**
     * Create an instance of {@link CrmPoolItem }
     * 
     */
    public CrmPoolItem createCrmPoolItem() {
        return new CrmPoolItem();
    }

    /**
     * Create an instance of {@link ReleaseNumbersOfVoipDeviceResponse }
     * 
     */
    public ReleaseNumbersOfVoipDeviceResponse createReleaseNumbersOfVoipDeviceResponse() {
        return new ReleaseNumbersOfVoipDeviceResponse();
    }

    /**
     * Create an instance of {@link AddMillenifonNumberResponse }
     * 
     */
    public AddMillenifonNumberResponse createAddMillenifonNumberResponse() {
        return new AddMillenifonNumberResponse();
    }

    /**
     * Create an instance of {@link ValidateContractDeactivation }
     * 
     */
    public ValidateContractDeactivation createValidateContractDeactivation() {
        return new ValidateContractDeactivation();
    }

    /**
     * Create an instance of {@link CancelProcess }
     * 
     */
    public CancelProcess createCancelProcess() {
        return new CancelProcess();
    }

    /**
     * Create an instance of {@link SuspendCustomerContract }
     * 
     */
    public SuspendCustomerContract createSuspendCustomerContract() {
        return new SuspendCustomerContract();
    }

    /**
     * Create an instance of {@link ProvisionOrderItemToCRM }
     * 
     */
    public ProvisionOrderItemToCRM createProvisionOrderItemToCRM() {
        return new ProvisionOrderItemToCRM();
    }

    /**
     * Create an instance of {@link ReleaseNumberPoolItemRequestModel }
     * 
     */
    public ReleaseNumberPoolItemRequestModel createReleaseNumberPoolItemRequestModel() {
        return new ReleaseNumberPoolItemRequestModel();
    }

    /**
     * Create an instance of {@link UnavailableNumberPoolItemResponse }
     * 
     */
    public UnavailableNumberPoolItemResponse createUnavailableNumberPoolItemResponse() {
        return new UnavailableNumberPoolItemResponse();
    }

    /**
     * Create an instance of {@link GetDealerStokRequestModel }
     * 
     */
    public GetDealerStokRequestModel createGetDealerStokRequestModel() {
        return new GetDealerStokRequestModel();
    }

    /**
     * Create an instance of {@link CrmWebAddress }
     * 
     */
    public CrmWebAddress createCrmWebAddress() {
        return new CrmWebAddress();
    }

    /**
     * Create an instance of {@link BulutSantralVoipDevice }
     * 
     */
    public BulutSantralVoipDevice createBulutSantralVoipDevice() {
        return new BulutSantralVoipDevice();
    }

    /**
     * Create an instance of {@link ArrayOfCrmNumber }
     * 
     */
    public ArrayOfCrmNumber createArrayOfCrmNumber() {
        return new ArrayOfCrmNumber();
    }

    /**
     * Create an instance of {@link AssignStockItemsResponse }
     * 
     */
    public AssignStockItemsResponse createAssignStockItemsResponse() {
        return new AssignStockItemsResponse();
    }

    /**
     * Create an instance of {@link ActivateCustomerContractResponseModel }
     * 
     */
    public ActivateCustomerContractResponseModel createActivateCustomerContractResponseModel() {
        return new ActivateCustomerContractResponseModel();
    }

    /**
     * Create an instance of {@link AddMillenifonNumberResponseModel }
     * 
     */
    public AddMillenifonNumberResponseModel createAddMillenifonNumberResponseModel() {
        return new AddMillenifonNumberResponseModel();
    }

    /**
     * Create an instance of {@link NumberPoolItem }
     * 
     */
    public NumberPoolItem createNumberPoolItem() {
        return new NumberPoolItem();
    }

    /**
     * Create an instance of {@link CheckMillenifonGsmNumbers }
     * 
     */
    public CheckMillenifonGsmNumbers createCheckMillenifonGsmNumbers() {
        return new CheckMillenifonGsmNumbers();
    }

    /**
     * Create an instance of {@link SuspendCustomerContractResponseModel }
     * 
     */
    public SuspendCustomerContractResponseModel createSuspendCustomerContractResponseModel() {
        return new SuspendCustomerContractResponseModel();
    }

    /**
     * Create an instance of {@link AddNumbersToContractResponseModel }
     * 
     */
    public AddNumbersToContractResponseModel createAddNumbersToContractResponseModel() {
        return new AddNumbersToContractResponseModel();
    }

    /**
     * Create an instance of {@link QueryStockItemOuid }
     * 
     */
    public QueryStockItemOuid createQueryStockItemOuid() {
        return new QueryStockItemOuid();
    }

    /**
     * Create an instance of {@link RemoveMillenifonNumberResponseModel }
     * 
     */
    public RemoveMillenifonNumberResponseModel createRemoveMillenifonNumberResponseModel() {
        return new RemoveMillenifonNumberResponseModel();
    }

    /**
     * Create an instance of {@link UpdateDealerStokStatusRequestModel }
     * 
     */
    public UpdateDealerStokStatusRequestModel createUpdateDealerStokStatusRequestModel() {
        return new UpdateDealerStokStatusRequestModel();
    }

    /**
     * Create an instance of {@link DocumentInfo }
     * 
     */
    public DocumentInfo createDocumentInfo() {
        return new DocumentInfo();
    }

    /**
     * Create an instance of {@link SuspendCustomerContractRequestModel }
     * 
     */
    public SuspendCustomerContractRequestModel createSuspendCustomerContractRequestModel() {
        return new SuspendCustomerContractRequestModel();
    }

    /**
     * Create an instance of {@link AssignNumberPoolItem }
     * 
     */
    public AssignNumberPoolItem createAssignNumberPoolItem() {
        return new AssignNumberPoolItem();
    }

    /**
     * Create an instance of {@link GetRemaingFreeUnitUsageByPhoneNumberResponseModel }
     * 
     */
    public GetRemaingFreeUnitUsageByPhoneNumberResponseModel createGetRemaingFreeUnitUsageByPhoneNumberResponseModel() {
        return new GetRemaingFreeUnitUsageByPhoneNumberResponseModel();
    }

    /**
     * Create an instance of {@link QueryStockItem }
     * 
     */
    public QueryStockItem createQueryStockItem() {
        return new QueryStockItem();
    }

    /**
     * Create an instance of {@link SellVoiceRecordRequestModel }
     * 
     */
    public SellVoiceRecordRequestModel createSellVoiceRecordRequestModel() {
        return new SellVoiceRecordRequestModel();
    }

    /**
     * Create an instance of {@link CancelProcessResponseModel }
     * 
     */
    public CancelProcessResponseModel createCancelProcessResponseModel() {
        return new CancelProcessResponseModel();
    }

    /**
     * Create an instance of {@link GetNumbersFromPool }
     * 
     */
    public GetNumbersFromPool createGetNumbersFromPool() {
        return new GetNumbersFromPool();
    }

    /**
     * Create an instance of {@link GetRemaingFreeUnitUsageByPhoneNumberRequestModel }
     * 
     */
    public GetRemaingFreeUnitUsageByPhoneNumberRequestModel createGetRemaingFreeUnitUsageByPhoneNumberRequestModel() {
        return new GetRemaingFreeUnitUsageByPhoneNumberRequestModel();
    }

    /**
     * Create an instance of {@link DummyJobRequest }
     * 
     */
    public DummyJobRequest createDummyJobRequest() {
        return new DummyJobRequest();
    }

    /**
     * Create an instance of {@link ValidateAccountDeactivationResponse }
     * 
     */
    public ValidateAccountDeactivationResponse createValidateAccountDeactivationResponse() {
        return new ValidateAccountDeactivationResponse();
    }

    /**
     * Create an instance of {@link CrmReturnAccount }
     * 
     */
    public CrmReturnAccount createCrmReturnAccount() {
        return new CrmReturnAccount();
    }

    /**
     * Create an instance of {@link SellVoiceRecord }
     * 
     */
    public SellVoiceRecord createSellVoiceRecord() {
        return new SellVoiceRecord();
    }

    /**
     * Create an instance of {@link AddPoolItemsRequestModel }
     * 
     */
    public AddPoolItemsRequestModel createAddPoolItemsRequestModel() {
        return new AddPoolItemsRequestModel();
    }

    /**
     * Create an instance of {@link GetCustomerStockItemsResponse }
     * 
     */
    public GetCustomerStockItemsResponse createGetCustomerStockItemsResponse() {
        return new GetCustomerStockItemsResponse();
    }

    /**
     * Create an instance of {@link ReleaseNumberPoolItem }
     * 
     */
    public ReleaseNumberPoolItem createReleaseNumberPoolItem() {
        return new ReleaseNumberPoolItem();
    }

    /**
     * Create an instance of {@link ArrayOfNumberPoolItem }
     * 
     */
    public ArrayOfNumberPoolItem createArrayOfNumberPoolItem() {
        return new ArrayOfNumberPoolItem();
    }

    /**
     * Create an instance of {@link ArrayOfCrmCustomerMessageType }
     * 
     */
    public ArrayOfCrmCustomerMessageType createArrayOfCrmCustomerMessageType() {
        return new ArrayOfCrmCustomerMessageType();
    }

    /**
     * Create an instance of {@link AddNumbersToContract }
     * 
     */
    public AddNumbersToContract createAddNumbersToContract() {
        return new AddNumbersToContract();
    }

    /**
     * Create an instance of {@link CrmDocumentUpdateAfterSetup }
     * 
     */
    public CrmDocumentUpdateAfterSetup createCrmDocumentUpdateAfterSetup() {
        return new CrmDocumentUpdateAfterSetup();
    }

    /**
     * Create an instance of {@link GetBulutSantralNumbersByBillingContractNo }
     * 
     */
    public GetBulutSantralNumbersByBillingContractNo createGetBulutSantralNumbersByBillingContractNo() {
        return new GetBulutSantralNumbersByBillingContractNo();
    }

    /**
     * Create an instance of {@link QueryOpenOrdersForDevicesResponse }
     * 
     */
    public QueryOpenOrdersForDevicesResponse createQueryOpenOrdersForDevicesResponse() {
        return new QueryOpenOrdersForDevicesResponse();
    }

    /**
     * Create an instance of {@link ChangeTitleCreateProductResponse }
     * 
     */
    public ChangeTitleCreateProductResponse createChangeTitleCreateProductResponse() {
        return new ChangeTitleCreateProductResponse();
    }

    /**
     * Create an instance of {@link ValidateAccountDeactivation }
     * 
     */
    public ValidateAccountDeactivation createValidateAccountDeactivation() {
        return new ValidateAccountDeactivation();
    }

    /**
     * Create an instance of {@link QueryStockItemByState }
     * 
     */
    public QueryStockItemByState createQueryStockItemByState() {
        return new QueryStockItemByState();
    }

    /**
     * Create an instance of {@link CrmEmail }
     * 
     */
    public CrmEmail createCrmEmail() {
        return new CrmEmail();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UnavailableNumberPoolItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UnavailableNumberPoolItemRequestModel")
    public JAXBElement<UnavailableNumberPoolItemRequestModel> createUnavailableNumberPoolItemRequestModel(UnavailableNumberPoolItemRequestModel value) {
        return new JAXBElement<UnavailableNumberPoolItemRequestModel>(_UnavailableNumberPoolItemRequestModel_QNAME, UnavailableNumberPoolItemRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBulutSantralNumbersByBillingContractNoRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", name = "GetBulutSantralNumbersByBillingContractNoRequestModel")
    public JAXBElement<GetBulutSantralNumbersByBillingContractNoRequestModel> createGetBulutSantralNumbersByBillingContractNoRequestModel(GetBulutSantralNumbersByBillingContractNoRequestModel value) {
        return new JAXBElement<GetBulutSantralNumbersByBillingContractNoRequestModel>(_GetBulutSantralNumbersByBillingContractNoRequestModel_QNAME, GetBulutSantralNumbersByBillingContractNoRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDealerStokStatusRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UpdateDealerStokStatusRequestModel")
    public JAXBElement<UpdateDealerStokStatusRequestModel> createUpdateDealerStokStatusRequestModel(UpdateDealerStokStatusRequestModel value) {
        return new JAXBElement<UpdateDealerStokStatusRequestModel>(_UpdateDealerStokStatusRequestModel_QNAME, UpdateDealerStokStatusRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link StockItemStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Contracts.CustomerInfoService.Type", name = "StockItemStatusType")
    public JAXBElement<StockItemStatusType> createStockItemStatusType(StockItemStatusType value) {
        return new JAXBElement<StockItemStatusType>(_StockItemStatusType_QNAME, StockItemStatusType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSaleAvailabilityRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", name = "GetSaleAvailabilityRequestModel")
    public JAXBElement<GetSaleAvailabilityRequestModel> createGetSaleAvailabilityRequestModel(GetSaleAvailabilityRequestModel value) {
        return new JAXBElement<GetSaleAvailabilityRequestModel>(_GetSaleAvailabilityRequestModel_QNAME, GetSaleAvailabilityRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNumbersToVoipDeviceRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddNumbersToVoipDeviceRequestModel")
    public JAXBElement<AddNumbersToVoipDeviceRequestModel> createAddNumbersToVoipDeviceRequestModel(AddNumbersToVoipDeviceRequestModel value) {
        return new JAXBElement<AddNumbersToVoipDeviceRequestModel>(_AddNumbersToVoipDeviceRequestModel_QNAME, AddNumbersToVoipDeviceRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponseDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Contracts", name = "BaseResponseDto")
    public JAXBElement<BaseResponseDto> createBaseResponseDto(BaseResponseDto value) {
        return new JAXBElement<BaseResponseDto>(_BaseResponseDto_QNAME, BaseResponseDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePoolResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "RemovePoolResponseModel")
    public JAXBElement<RemovePoolResponseModel> createRemovePoolResponseModel(RemovePoolResponseModel value) {
        return new JAXBElement<RemovePoolResponseModel>(_RemovePoolResponseModel_QNAME, RemovePoolResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplaceStockInfoDeviceProductRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ReplaceStockInfoDeviceProductRequestModel")
    public JAXBElement<ReplaceStockInfoDeviceProductRequestModel> createReplaceStockInfoDeviceProductRequestModel(ReplaceStockInfoDeviceProductRequestModel value) {
        return new JAXBElement<ReplaceStockInfoDeviceProductRequestModel>(_ReplaceStockInfoDeviceProductRequestModel_QNAME, ReplaceStockInfoDeviceProductRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBulutSantralNumbers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ArrayOfBulutSantralNumbers")
    public JAXBElement<ArrayOfBulutSantralNumbers> createArrayOfBulutSantralNumbers(ArrayOfBulutSantralNumbers value) {
        return new JAXBElement<ArrayOfBulutSantralNumbers>(_ArrayOfBulutSantralNumbers_QNAME, ArrayOfBulutSantralNumbers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplaceStockInfoDeviceProductResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ReplaceStockInfoDeviceProductResponseModel")
    public JAXBElement<ReplaceStockInfoDeviceProductResponseModel> createReplaceStockInfoDeviceProductResponseModel(ReplaceStockInfoDeviceProductResponseModel value) {
        return new JAXBElement<ReplaceStockInfoDeviceProductResponseModel>(_ReplaceStockInfoDeviceProductResponseModel_QNAME, ReplaceStockInfoDeviceProductResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplaceStockInfoInContractResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ReplaceStockInfoInContractResponseModel")
    public JAXBElement<ReplaceStockInfoInContractResponseModel> createReplaceStockInfoInContractResponseModel(ReplaceStockInfoInContractResponseModel value) {
        return new JAXBElement<ReplaceStockInfoInContractResponseModel>(_ReplaceStockInfoInContractResponseModel_QNAME, ReplaceStockInfoInContractResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockItemDeviceSubType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm.Stock", name = "StockItemDeviceSubType")
    public JAXBElement<StockItemDeviceSubType> createStockItemDeviceSubType(StockItemDeviceSubType value) {
        return new JAXBElement<StockItemDeviceSubType>(_StockItemDeviceSubType_QNAME, StockItemDeviceSubType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ArrayOfStockItem")
    public JAXBElement<ArrayOfStockItem> createArrayOfStockItem(ArrayOfStockItem value) {
        return new JAXBElement<ArrayOfStockItem>(_ArrayOfStockItem_QNAME, ArrayOfStockItem.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelProcessResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "CancelProcessResponseModel")
    public JAXBElement<CancelProcessResponseModel> createCancelProcessResponseModel(CancelProcessResponseModel value) {
        return new JAXBElement<CancelProcessResponseModel>(_CancelProcessResponseModel_QNAME, CancelProcessResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmCustomerMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ArrayOfCrmCustomerMessageType")
    public JAXBElement<ArrayOfCrmCustomerMessageType> createArrayOfCrmCustomerMessageType(ArrayOfCrmCustomerMessageType value) {
        return new JAXBElement<ArrayOfCrmCustomerMessageType>(_ArrayOfCrmCustomerMessageType_QNAME, ArrayOfCrmCustomerMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListStockItemResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ListStockItemResponseModel")
    public JAXBElement<ListStockItemResponseModel> createListStockItemResponseModel(ListStockItemResponseModel value) {
        return new JAXBElement<ListStockItemResponseModel>(_ListStockItemResponseModel_QNAME, ListStockItemResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateContractDeactivationRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", name = "ValidateContractDeactivationRequestModel")
    public JAXBElement<ValidateContractDeactivationRequestModel> createValidateContractDeactivationRequestModel(ValidateContractDeactivationRequestModel value) {
        return new JAXBElement<ValidateContractDeactivationRequestModel>(_ValidateContractDeactivationRequestModel_QNAME, ValidateContractDeactivationRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPoolItemsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddPoolItemsRequestModel")
    public JAXBElement<AddPoolItemsRequestModel> createAddPoolItemsRequestModel(AddPoolItemsRequestModel value) {
        return new JAXBElement<AddPoolItemsRequestModel>(_AddPoolItemsRequestModel_QNAME, AddPoolItemsRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMillenifonNumberRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", name = "AddMillenifonNumberRequestModel")
    public JAXBElement<AddMillenifonNumberRequestModel> createAddMillenifonNumberRequestModel(AddMillenifonNumberRequestModel value) {
        return new JAXBElement<AddMillenifonNumberRequestModel>(_AddMillenifonNumberRequestModel_QNAME, AddMillenifonNumberRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link StockItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "StockItem")
    public JAXBElement<StockItem> createStockItem(StockItem value) {
        return new JAXBElement<StockItem>(_StockItem_QNAME, StockItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerStockItemsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetCustomerStockItemsRequestModel")
    public JAXBElement<GetCustomerStockItemsRequestModel> createGetCustomerStockItemsRequestModel(GetCustomerStockItemsRequestModel value) {
        return new JAXBElement<GetCustomerStockItemsRequestModel>(_GetCustomerStockItemsRequestModel_QNAME, GetCustomerStockItemsRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmWebAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", name = "ArrayOfCrmWebAddress")
    public JAXBElement<ArrayOfCrmWebAddress> createArrayOfCrmWebAddress(ArrayOfCrmWebAddress value) {
        return new JAXBElement<ArrayOfCrmWebAddress>(_ArrayOfCrmWebAddress_QNAME, ArrayOfCrmWebAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddVoipDeviceWithProcessRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddVoipDeviceWithProcessRequestModel")
    public JAXBElement<AddVoipDeviceWithProcessRequestModel> createAddVoipDeviceWithProcessRequestModel(AddVoipDeviceWithProcessRequestModel value) {
        return new JAXBElement<AddVoipDeviceWithProcessRequestModel>(_AddVoipDeviceWithProcessRequestModel_QNAME, AddVoipDeviceWithProcessRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRemaingFreeUnitUsageByPhoneNumberResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetRemaingFreeUnitUsageByPhoneNumberResponseModel")
    public JAXBElement<GetRemaingFreeUnitUsageByPhoneNumberResponseModel> createGetRemaingFreeUnitUsageByPhoneNumberResponseModel(GetRemaingFreeUnitUsageByPhoneNumberResponseModel value) {
        return new JAXBElement<GetRemaingFreeUnitUsageByPhoneNumberResponseModel>(_GetRemaingFreeUnitUsageByPhoneNumberResponseModel_QNAME, GetRemaingFreeUnitUsageByPhoneNumberResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePoolItemsResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "RemovePoolItemsResponseModel")
    public JAXBElement<RemovePoolItemsResponseModel> createRemovePoolItemsResponseModel(RemovePoolItemsResponseModel value) {
        return new JAXBElement<RemovePoolItemsResponseModel>(_RemovePoolItemsResponseModel_QNAME, RemovePoolItemsResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateContractDeactivationResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", name = "ValidateContractDeactivationResponseModel")
    public JAXBElement<ValidateContractDeactivationResponseModel> createValidateContractDeactivationResponseModel(ValidateContractDeactivationResponseModel value) {
        return new JAXBElement<ValidateContractDeactivationResponseModel>(_ValidateContractDeactivationResponseModel_QNAME, ValidateContractDeactivationResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmPoolItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ArrayOfCrmPoolItem")
    public JAXBElement<ArrayOfCrmPoolItem> createArrayOfCrmPoolItem(ArrayOfCrmPoolItem value) {
        return new JAXBElement<ArrayOfCrmPoolItem>(_ArrayOfCrmPoolItem_QNAME, ArrayOfCrmPoolItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseNumbersOfVoipDeviceResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ReleaseNumbersOfVoipDeviceResponseModel")
    public JAXBElement<ReleaseNumbersOfVoipDeviceResponseModel> createReleaseNumbersOfVoipDeviceResponseModel(ReleaseNumbersOfVoipDeviceResponseModel value) {
        return new JAXBElement<ReleaseNumbersOfVoipDeviceResponseModel>(_ReleaseNumbersOfVoipDeviceResponseModel_QNAME, ReleaseNumbersOfVoipDeviceResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMillenifonNumberResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddMillenifonNumberResponseModel")
    public JAXBElement<AddMillenifonNumberResponseModel> createAddMillenifonNumberResponseModel(AddMillenifonNumberResponseModel value) {
        return new JAXBElement<AddMillenifonNumberResponseModel>(_AddMillenifonNumberResponseModel_QNAME, AddMillenifonNumberResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveMillenifonNumberResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "RemoveMillenifonNumberResponseModel")
    public JAXBElement<RemoveMillenifonNumberResponseModel> createRemoveMillenifonNumberResponseModel(RemoveMillenifonNumberResponseModel value) {
        return new JAXBElement<RemoveMillenifonNumberResponseModel>(_RemoveMillenifonNumberResponseModel_QNAME, RemoveMillenifonNumberResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBulutSantralNumbersByBillingContractNoResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetBulutSantralNumbersByBillingContractNoResponseModel")
    public JAXBElement<GetBulutSantralNumbersByBillingContractNoResponseModel> createGetBulutSantralNumbersByBillingContractNoResponseModel(GetBulutSantralNumbersByBillingContractNoResponseModel value) {
        return new JAXBElement<GetBulutSantralNumbersByBillingContractNoResponseModel>(_GetBulutSantralNumbersByBillingContractNoResponseModel_QNAME, GetBulutSantralNumbersByBillingContractNoResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link StockItemOrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "StockItemOrderInfo")
    public JAXBElement<StockItemOrderInfo> createStockItemOrderInfo(StockItemOrderInfo value) {
        return new JAXBElement<StockItemOrderInfo>(_StockItemOrderInfo_QNAME, StockItemOrderInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveMillenifonNumberRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", name = "RemoveMillenifonNumberRequestModel")
    public JAXBElement<RemoveMillenifonNumberRequestModel> createRemoveMillenifonNumberRequestModel(RemoveMillenifonNumberRequestModel value) {
        return new JAXBElement<RemoveMillenifonNumberRequestModel>(_RemoveMillenifonNumberRequestModel_QNAME, RemoveMillenifonNumberRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryCustomerStatusRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "QueryCustomerStatusRequestModel")
    public JAXBElement<QueryCustomerStatusRequestModel> createQueryCustomerStatusRequestModel(QueryCustomerStatusRequestModel value) {
        return new JAXBElement<QueryCustomerStatusRequestModel>(_QueryCustomerStatusRequestModel_QNAME, QueryCustomerStatusRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link StockItemsResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "StockItemsResponseModel")
    public JAXBElement<StockItemsResponseModel> createStockItemsResponseModel(StockItemsResponseModel value) {
        return new JAXBElement<StockItemsResponseModel>(_StockItemsResponseModel_QNAME, StockItemsResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryOpenOrdersForDevicesRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "QueryOpenOrdersForDevicesRequestModel")
    public JAXBElement<QueryOpenOrdersForDevicesRequestModel> createQueryOpenOrdersForDevicesRequestModel(QueryOpenOrdersForDevicesRequestModel value) {
        return new JAXBElement<QueryOpenOrdersForDevicesRequestModel>(_QueryOpenOrdersForDevicesRequestModel_QNAME, QueryOpenOrdersForDevicesRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveVoipDeviceResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "RemoveVoipDeviceResponseModel")
    public JAXBElement<RemoveVoipDeviceResponseModel> createRemoveVoipDeviceResponseModel(RemoveVoipDeviceResponseModel value) {
        return new JAXBElement<RemoveVoipDeviceResponseModel>(_RemoveVoipDeviceResponseModel_QNAME, RemoveVoipDeviceResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDealerStokResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetDealerStokResponseModel")
    public JAXBElement<GetDealerStokResponseModel> createGetDealerStokResponseModel(GetDealerStokResponseModel value) {
        return new JAXBElement<GetDealerStokResponseModel>(_GetDealerStokResponseModel_QNAME, GetDealerStokResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplaceStockInfoInContractRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ReplaceStockInfoInContractRequestModel")
    public JAXBElement<ReplaceStockInfoInContractRequestModel> createReplaceStockInfoInContractRequestModel(ReplaceStockInfoInContractRequestModel value) {
        return new JAXBElement<ReplaceStockInfoInContractRequestModel>(_ReplaceStockInfoInContractRequestModel_QNAME, ReplaceStockInfoInContractRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveVoipDeviceRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "RemoveVoipDeviceRequestModel")
    public JAXBElement<RemoveVoipDeviceRequestModel> createRemoveVoipDeviceRequestModel(RemoveVoipDeviceRequestModel value) {
        return new JAXBElement<RemoveVoipDeviceRequestModel>(_RemoveVoipDeviceRequestModel_QNAME, RemoveVoipDeviceRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessProcessRequestResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ProcessProcessRequestResponseModel")
    public JAXBElement<ProcessProcessRequestResponseModel> createProcessProcessRequestResponseModel(ProcessProcessRequestResponseModel value) {
        return new JAXBElement<ProcessProcessRequestResponseModel>(_ProcessProcessRequestResponseModel_QNAME, ProcessProcessRequestResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessProcessRequestRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ProcessProcessRequestRequestModel")
    public JAXBElement<ProcessProcessRequestRequestModel> createProcessProcessRequestRequestModel(ProcessProcessRequestRequestModel value) {
        return new JAXBElement<ProcessProcessRequestRequestModel>(_ProcessProcessRequestRequestModel_QNAME, ProcessProcessRequestRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmWebAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", name = "CrmWebAddress")
    public JAXBElement<CrmWebAddress> createCrmWebAddress(CrmWebAddress value) {
        return new JAXBElement<CrmWebAddress>(_CrmWebAddress_QNAME, CrmWebAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfcheckNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ArrayOfcheckNumber")
    public JAXBElement<ArrayOfcheckNumber> createArrayOfcheckNumber(ArrayOfcheckNumber value) {
        return new JAXBElement<ArrayOfcheckNumber>(_ArrayOfcheckNumber_QNAME, ArrayOfcheckNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "DocumentInfo")
    public JAXBElement<DocumentInfo> createDocumentInfo(DocumentInfo value) {
        return new JAXBElement<DocumentInfo>(_DocumentInfo_QNAME, DocumentInfo.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStockItemStatusRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ChangeStockItemStatusRequestModel")
    public JAXBElement<ChangeStockItemStatusRequestModel> createChangeStockItemStatusRequestModel(ChangeStockItemStatusRequestModel value) {
        return new JAXBElement<ChangeStockItemStatusRequestModel>(_ChangeStockItemStatusRequestModel_QNAME, ChangeStockItemStatusRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DummyJobResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "DummyJobResponse")
    public JAXBElement<DummyJobResponse> createDummyJobResponse(DummyJobResponse value) {
        return new JAXBElement<DummyJobResponse>(_DummyJobResponse_QNAME, DummyJobResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNumbersToContractRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddNumbersToContractRequestModel")
    public JAXBElement<AddNumbersToContractRequestModel> createAddNumbersToContractRequestModel(AddNumbersToContractRequestModel value) {
        return new JAXBElement<AddNumbersToContractRequestModel>(_AddNumbersToContractRequestModel_QNAME, AddNumbersToContractRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmPoolItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "CrmPoolItem")
    public JAXBElement<CrmPoolItem> createCrmPoolItem(CrmPoolItem value) {
        return new JAXBElement<CrmPoolItem>(_CrmPoolItem_QNAME, CrmPoolItem.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRemaingFreeUnitUsageByPhoneNumberRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetRemaingFreeUnitUsageByPhoneNumberRequestModel")
    public JAXBElement<GetRemaingFreeUnitUsageByPhoneNumberRequestModel> createGetRemaingFreeUnitUsageByPhoneNumberRequestModel(GetRemaingFreeUnitUsageByPhoneNumberRequestModel value) {
        return new JAXBElement<GetRemaingFreeUnitUsageByPhoneNumberRequestModel>(_GetRemaingFreeUnitUsageByPhoneNumberRequestModel_QNAME, GetRemaingFreeUnitUsageByPhoneNumberRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPoolItemsResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddPoolItemsResponseModel")
    public JAXBElement<AddPoolItemsResponseModel> createAddPoolItemsResponseModel(AddPoolItemsResponseModel value) {
        return new JAXBElement<AddPoolItemsResponseModel>(_AddPoolItemsResponseModel_QNAME, AddPoolItemsResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SellVoiceRecordResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SellVoiceRecordResponseModel")
    public JAXBElement<SellVoiceRecordResponseModel> createSellVoiceRecordResponseModel(SellVoiceRecordResponseModel value) {
        return new JAXBElement<SellVoiceRecordResponseModel>(_SellVoiceRecordResponseModel_QNAME, SellVoiceRecordResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryOpenOrdersForDevicesResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "QueryOpenOrdersForDevicesResponseModel")
    public JAXBElement<QueryOpenOrdersForDevicesResponseModel> createQueryOpenOrdersForDevicesResponseModel(QueryOpenOrdersForDevicesResponseModel value) {
        return new JAXBElement<QueryOpenOrdersForDevicesResponseModel>(_QueryOpenOrdersForDevicesResponseModel_QNAME, QueryOpenOrdersForDevicesResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddVoipDeviceWithProcessResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddVoipDeviceWithProcessResponseModel")
    public JAXBElement<AddVoipDeviceWithProcessResponseModel> createAddVoipDeviceWithProcessResponseModel(AddVoipDeviceWithProcessResponseModel value) {
        return new JAXBElement<AddVoipDeviceWithProcessResponseModel>(_AddVoipDeviceWithProcessResponseModel_QNAME, AddVoipDeviceWithProcessResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDealerStokStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UpdateDealerStokStatusResponseModel")
    public JAXBElement<UpdateDealerStokStatusResponseModel> createUpdateDealerStokStatusResponseModel(UpdateDealerStokStatusResponseModel value) {
        return new JAXBElement<UpdateDealerStokStatusResponseModel>(_UpdateDealerStokStatusResponseModel_QNAME, UpdateDealerStokStatusResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CRMProvisionRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "CRMProvisionRequestModel")
    public JAXBElement<CRMProvisionRequestModel> createCRMProvisionRequestModel(CRMProvisionRequestModel value) {
        return new JAXBElement<CRMProvisionRequestModel>(_CRMProvisionRequestModel_QNAME, CRMProvisionRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultTypeEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Enum", name = "ResultTypeEnum")
    public JAXBElement<ResultTypeEnum> createResultTypeEnum(ResultTypeEnum value) {
        return new JAXBElement<ResultTypeEnum>(_ResultTypeEnum_QNAME, ResultTypeEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateContractActivationRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", name = "ValidateContractActivationRequestModel")
    public JAXBElement<ValidateContractActivationRequestModel> createValidateContractActivationRequestModel(ValidateContractActivationRequestModel value) {
        return new JAXBElement<ValidateContractActivationRequestModel>(_ValidateContractActivationRequestModel_QNAME, ValidateContractActivationRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfguid")
    public JAXBElement<ArrayOfguid> createArrayOfguid(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_ArrayOfguid_QNAME, ArrayOfguid.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SellVoiceRecordRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", name = "SellVoiceRecordRequestModel")
    public JAXBElement<SellVoiceRecordRequestModel> createSellVoiceRecordRequestModel(SellVoiceRecordRequestModel value) {
        return new JAXBElement<SellVoiceRecordRequestModel>(_SellVoiceRecordRequestModel_QNAME, SellVoiceRecordRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulutSantralVoipDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "BulutSantralVoipDevice")
    public JAXBElement<BulutSantralVoipDevice> createBulutSantralVoipDevice(BulutSantralVoipDevice value) {
        return new JAXBElement<BulutSantralVoipDevice>(_BulutSantralVoipDevice_QNAME, BulutSantralVoipDevice.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagnosticTypeEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Customer", name = "DiagnosticTypeEnum")
    public JAXBElement<DiagnosticTypeEnum> createDiagnosticTypeEnum(DiagnosticTypeEnum value) {
        return new JAXBElement<DiagnosticTypeEnum>(_DiagnosticTypeEnum_QNAME, DiagnosticTypeEnum.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmPool }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "CrmPool")
    public JAXBElement<CrmPool> createCrmPool(CrmPool value) {
        return new JAXBElement<CrmPool>(_CrmPool_QNAME, CrmPool.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseNumbersOfVoipDeviceRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ReleaseNumbersOfVoipDeviceRequestModel")
    public JAXBElement<ReleaseNumbersOfVoipDeviceRequestModel> createReleaseNumbersOfVoipDeviceRequestModel(ReleaseNumbersOfVoipDeviceRequestModel value) {
        return new JAXBElement<ReleaseNumbersOfVoipDeviceRequestModel>(_ReleaseNumbersOfVoipDeviceRequestModel_QNAME, ReleaseNumbersOfVoipDeviceRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ArrayOfCrmContact")
    public JAXBElement<ArrayOfCrmContact> createArrayOfCrmContact(ArrayOfCrmContact value) {
        return new JAXBElement<ArrayOfCrmContact>(_ArrayOfCrmContact_QNAME, ArrayOfCrmContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DummyJobRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "DummyJobRequest")
    public JAXBElement<DummyJobRequest> createDummyJobRequest(DummyJobRequest value) {
        return new JAXBElement<DummyJobRequest>(_DummyJobRequest_QNAME, DummyJobRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SexEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Common/Customer", name = "SexEnum")
    public JAXBElement<SexEnum> createSexEnum(SexEnum value) {
        return new JAXBElement<SexEnum>(_SexEnum_QNAME, SexEnum.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", name = "CrmEmail")
    public JAXBElement<CrmEmail> createCrmEmail(CrmEmail value) {
        return new JAXBElement<CrmEmail>(_CrmEmail_QNAME, CrmEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockItemDeviceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm.Stock", name = "StockItemDeviceType")
    public JAXBElement<StockItemDeviceType> createStockItemDeviceType(StockItemDeviceType value) {
        return new JAXBElement<StockItemDeviceType>(_StockItemDeviceType_QNAME, StockItemDeviceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "checkNumber")
    public JAXBElement<CheckNumber> createCheckNumber(CheckNumber value) {
        return new JAXBElement<CheckNumber>(_CheckNumber_QNAME, CheckNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmPool }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ArrayOfCrmPool")
    public JAXBElement<ArrayOfCrmPool> createArrayOfCrmPool(ArrayOfCrmPool value) {
        return new JAXBElement<ArrayOfCrmPool>(_ArrayOfCrmPool_QNAME, ArrayOfCrmPool.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateCustomerContractRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ActivateCustomerContractRequestModel")
    public JAXBElement<ActivateCustomerContractRequestModel> createActivateCustomerContractRequestModel(ActivateCustomerContractRequestModel value) {
        return new JAXBElement<ActivateCustomerContractRequestModel>(_ActivateCustomerContractRequestModel_QNAME, ActivateCustomerContractRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListStockItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ListStockItemRequestModel")
    public JAXBElement<ListStockItemRequestModel> createListStockItemRequestModel(ListStockItemRequestModel value) {
        return new JAXBElement<ListStockItemRequestModel>(_ListStockItemRequestModel_QNAME, ListStockItemRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model", name = "BaseResponseModel")
    public JAXBElement<BaseResponseModel> createBaseResponseModel(BaseResponseModel value) {
        return new JAXBElement<BaseResponseModel>(_BaseResponseModel_QNAME, BaseResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BulutSantralNumbers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "BulutSantralNumbers")
    public JAXBElement<BulutSantralNumbers> createBulutSantralNumbers(BulutSantralNumbers value) {
        return new JAXBElement<BulutSantralNumbers>(_BulutSantralNumbers_QNAME, BulutSantralNumbers.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateContractActivationResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", name = "ValidateContractActivationResponseModel")
    public JAXBElement<ValidateContractActivationResponseModel> createValidateContractActivationResponseModel(ValidateContractActivationResponseModel value) {
        return new JAXBElement<ValidateContractActivationResponseModel>(_ValidateContractActivationResponseModel_QNAME, ValidateContractActivationResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateAccountDeactivationResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", name = "ValidateAccountDeactivationResponseModel")
    public JAXBElement<ValidateAccountDeactivationResponseModel> createValidateAccountDeactivationResponseModel(ValidateAccountDeactivationResponseModel value) {
        return new JAXBElement<ValidateAccountDeactivationResponseModel>(_ValidateAccountDeactivationResponseModel_QNAME, ValidateAccountDeactivationResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelProcessRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "CancelProcessRequestModel")
    public JAXBElement<CancelProcessRequestModel> createCancelProcessRequestModel(CancelProcessRequestModel value) {
        return new JAXBElement<CancelProcessRequestModel>(_CancelProcessRequestModel_QNAME, CancelProcessRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckMillenifonGsmNumbersResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "CheckMillenifonGsmNumbersResponseModel")
    public JAXBElement<CheckMillenifonGsmNumbersResponseModel> createCheckMillenifonGsmNumbersResponseModel(CheckMillenifonGsmNumbersResponseModel value) {
        return new JAXBElement<CheckMillenifonGsmNumbersResponseModel>(_CheckMillenifonGsmNumbersResponseModel_QNAME, CheckMillenifonGsmNumbersResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignStockItemsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AssignStockItemsRequestModel")
    public JAXBElement<AssignStockItemsRequestModel> createAssignStockItemsRequestModel(AssignStockItemsRequestModel value) {
        return new JAXBElement<AssignStockItemsRequestModel>(_AssignStockItemsRequestModel_QNAME, AssignStockItemsRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateAccountDeactivationRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", name = "ValidateAccountDeactivationRequestModel")
    public JAXBElement<ValidateAccountDeactivationRequestModel> createValidateAccountDeactivationRequestModel(ValidateAccountDeactivationRequestModel value) {
        return new JAXBElement<ValidateAccountDeactivationRequestModel>(_ValidateAccountDeactivationRequestModel_QNAME, ValidateAccountDeactivationRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberNetworkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Contracts.CustomerInfoService.Type", name = "NumberNetworkType")
    public JAXBElement<NumberNetworkType> createNumberNetworkType(NumberNetworkType value) {
        return new JAXBElement<NumberNetworkType>(_NumberNetworkType_QNAME, NumberNetworkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePoolItemsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "RemovePoolItemsRequestModel")
    public JAXBElement<RemovePoolItemsRequestModel> createRemovePoolItemsRequestModel(RemovePoolItemsRequestModel value) {
        return new JAXBElement<RemovePoolItemsRequestModel>(_RemovePoolItemsRequestModel_QNAME, RemovePoolItemsRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryCustomerStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "QueryCustomerStatusResponseModel")
    public JAXBElement<QueryCustomerStatusResponseModel> createQueryCustomerStatusResponseModel(QueryCustomerStatusResponseModel value) {
        return new JAXBElement<QueryCustomerStatusResponseModel>(_QueryCustomerStatusResponseModel_QNAME, QueryCustomerStatusResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDealerStokRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetDealerStokRequestModel")
    public JAXBElement<GetDealerStokRequestModel> createGetDealerStokRequestModel(GetDealerStokRequestModel value) {
        return new JAXBElement<GetDealerStokRequestModel>(_GetDealerStokRequestModel_QNAME, GetDealerStokRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSaleAvailabilityResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", name = "GetSaleAvailabilityResponseModel")
    public JAXBElement<GetSaleAvailabilityResponseModel> createGetSaleAvailabilityResponseModel(GetSaleAvailabilityResponseModel value) {
        return new JAXBElement<GetSaleAvailabilityResponseModel>(_GetSaleAvailabilityResponseModel_QNAME, GetSaleAvailabilityResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockItemOrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ArrayOfStockItemOrderInfo")
    public JAXBElement<ArrayOfStockItemOrderInfo> createArrayOfStockItemOrderInfo(ArrayOfStockItemOrderInfo value) {
        return new JAXBElement<ArrayOfStockItemOrderInfo>(_ArrayOfStockItemOrderInfo_QNAME, ArrayOfStockItemOrderInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNumbersToVoipDeviceResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddNumbersToVoipDeviceResponseModel")
    public JAXBElement<AddNumbersToVoipDeviceResponseModel> createAddNumbersToVoipDeviceResponseModel(AddNumbersToVoipDeviceResponseModel value) {
        return new JAXBElement<AddNumbersToVoipDeviceResponseModel>(_AddNumbersToVoipDeviceResponseModel_QNAME, AddNumbersToVoipDeviceResponseModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStockItemToStockRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddStockItemToStockRequestModel")
    public JAXBElement<AddStockItemToStockRequestModel> createAddStockItemToStockRequestModel(AddStockItemToStockRequestModel value) {
        return new JAXBElement<AddStockItemToStockRequestModel>(_AddStockItemToStockRequestModel_QNAME, AddStockItemToStockRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmCustomerMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "CrmCustomerMessageType")
    public JAXBElement<CrmCustomerMessageType> createCrmCustomerMessageType(CrmCustomerMessageType value) {
        return new JAXBElement<CrmCustomerMessageType>(_CrmCustomerMessageType_QNAME, CrmCustomerMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Bpm", name = "CustomerInfo")
    public JAXBElement<CustomerInfo> createCustomerInfo(CustomerInfo value) {
        return new JAXBElement<CustomerInfo>(_CustomerInfo_QNAME, CustomerInfo.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckMillenifonGsmNumbersRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "CheckMillenifonGsmNumbersRequestModel")
    public JAXBElement<CheckMillenifonGsmNumbersRequestModel> createCheckMillenifonGsmNumbersRequestModel(CheckMillenifonGsmNumbersRequestModel value) {
        return new JAXBElement<CheckMillenifonGsmNumbersRequestModel>(_CheckMillenifonGsmNumbersRequestModel_QNAME, CheckMillenifonGsmNumbersRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePoolRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "RemovePoolRequestModel")
    public JAXBElement<RemovePoolRequestModel> createRemovePoolRequestModel(RemovePoolRequestModel value) {
        return new JAXBElement<RemovePoolRequestModel>(_RemovePoolRequestModel_QNAME, RemovePoolRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStockItemByStateRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "QueryStockItemByStateRequestModel")
    public JAXBElement<QueryStockItemByStateRequestModel> createQueryStockItemByStateRequestModel(QueryStockItemByStateRequestModel value) {
        return new JAXBElement<QueryStockItemByStateRequestModel>(_QueryStockItemByStateRequestModel_QNAME, QueryStockItemByStateRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultyStockItemsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "FaultyStockItemsRequestModel")
    public JAXBElement<FaultyStockItemsRequestModel> createFaultyStockItemsRequestModel(FaultyStockItemsRequestModel value) {
        return new JAXBElement<FaultyStockItemsRequestModel>(_FaultyStockItemsRequestModel_QNAME, FaultyStockItemsRequestModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Number", scope = CrmNumber.class)
    public JAXBElement<String> createCrmNumberNumber(String value) {
        return new JAXBElement<String>(_CrmNumberNumber_QNAME, String.class, CrmNumber.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link StockItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "StockItem", scope = QueryStockItemResponseModel.class)
    public JAXBElement<StockItem> createQueryStockItemResponseModelStockItem(StockItem value) {
        return new JAXBElement<StockItem>(_QueryStockItemResponseModelStockItem_QNAME, StockItem.class, QueryStockItemResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuspendAccountRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = SuspendAccount.class)
    public JAXBElement<SuspendAccountRequestModel> createSuspendAccountRequest(SuspendAccountRequestModel value) {
        return new JAXBElement<SuspendAccountRequestModel>(_SuspendAccountRequest_QNAME, SuspendAccountRequestModel.class, SuspendAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePoolItemsResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "RemovePoolItemsResult", scope = RemovePoolItemsResponse.class)
    public JAXBElement<RemovePoolItemsResponseModel> createRemovePoolItemsResponseRemovePoolItemsResult(RemovePoolItemsResponseModel value) {
        return new JAXBElement<RemovePoolItemsResponseModel>(_RemovePoolItemsResponseRemovePoolItemsResult_QNAME, RemovePoolItemsResponseModel.class, RemovePoolItemsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveMillenifonNumberResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "RemoveMillenifonNumberResult", scope = RemoveMillenifonNumberResponse.class)
    public JAXBElement<RemoveMillenifonNumberResponseModel> createRemoveMillenifonNumberResponseRemoveMillenifonNumberResult(RemoveMillenifonNumberResponseModel value) {
        return new JAXBElement<RemoveMillenifonNumberResponseModel>(_RemoveMillenifonNumberResponseRemoveMillenifonNumberResult_QNAME, RemoveMillenifonNumberResponseModel.class, RemoveMillenifonNumberResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", name = "ValidationMessages", scope = ValidateAccountDeactivationResponseModel.class)
    public JAXBElement<ArrayOfstring> createValidateAccountDeactivationResponseModelValidationMessages(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ValidateAccountDeactivationResponseModelValidationMessages_QNAME, ArrayOfstring.class, ValidateAccountDeactivationResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStockItemStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SetStockItemStatusControlResult", scope = SetStockItemStatusControlResponse.class)
    public JAXBElement<ChangeStockItemStatusResponseModel> createSetStockItemStatusControlResponseSetStockItemStatusControlResult(ChangeStockItemStatusResponseModel value) {
        return new JAXBElement<ChangeStockItemStatusResponseModel>(_SetStockItemStatusControlResponseSetStockItemStatusControlResult_QNAME, ChangeStockItemStatusResponseModel.class, SetStockItemStatusControlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelProcessResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "CancelProcessResult", scope = CancelProcessResponse.class)
    public JAXBElement<CancelProcessResponseModel> createCancelProcessResponseCancelProcessResult(CancelProcessResponseModel value) {
        return new JAXBElement<CancelProcessResponseModel>(_CancelProcessResponseCancelProcessResult_QNAME, CancelProcessResponseModel.class, CancelProcessResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListStockItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ListStockItem.class)
    public JAXBElement<ListStockItemRequestModel> createListStockItemRequest(ListStockItemRequestModel value) {
        return new JAXBElement<ListStockItemRequestModel>(_SuspendAccountRequest_QNAME, ListStockItemRequestModel.class, ListStockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DummyJobResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ProcessRetentionResult", scope = ProcessRetentionResponse.class)
    public JAXBElement<DummyJobResponse> createProcessRetentionResponseProcessRetentionResult(DummyJobResponse value) {
        return new JAXBElement<DummyJobResponse>(_ProcessRetentionResponseProcessRetentionResult_QNAME, DummyJobResponse.class, ProcessRetentionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckMillenifonGsmNumbersResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "CheckMillenifonGsmNumbersResult", scope = CheckMillenifonGsmNumbersResponse.class)
    public JAXBElement<CheckMillenifonGsmNumbersResponseModel> createCheckMillenifonGsmNumbersResponseCheckMillenifonGsmNumbersResult(CheckMillenifonGsmNumbersResponseModel value) {
        return new JAXBElement<CheckMillenifonGsmNumbersResponseModel>(_CheckMillenifonGsmNumbersResponseCheckMillenifonGsmNumbersResult_QNAME, CheckMillenifonGsmNumbersResponseModel.class, CheckMillenifonGsmNumbersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "OldSerialNo", scope = ReplaceStockInfoDeviceProductRequestModel.class)
    public JAXBElement<String> createReplaceStockInfoDeviceProductRequestModelOldSerialNo(String value) {
        return new JAXBElement<String>(_ReplaceStockInfoDeviceProductRequestModelOldSerialNo_QNAME, String.class, ReplaceStockInfoDeviceProductRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "NewSerialNo", scope = ReplaceStockInfoDeviceProductRequestModel.class)
    public JAXBElement<String> createReplaceStockInfoDeviceProductRequestModelNewSerialNo(String value) {
        return new JAXBElement<String>(_ReplaceStockInfoDeviceProductRequestModelNewSerialNo_QNAME, String.class, ReplaceStockInfoDeviceProductRequestModel.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "User", scope = UserResponseModel.class)
    public JAXBElement<User> createUserResponseModelUser(User value) {
        return new JAXBElement<User>(_UserResponseModelUser_QNAME, User.class, UserResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStockItemStatusRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = SetStockItemStatusBilled.class)
    public JAXBElement<ChangeStockItemStatusRequestModel> createSetStockItemStatusBilledRequest(ChangeStockItemStatusRequestModel value) {
        return new JAXBElement<ChangeStockItemStatusRequestModel>(_SuspendAccountRequest_QNAME, ChangeStockItemStatusRequestModel.class, SetStockItemStatusBilled.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellVoiceRecordResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SellVoiceRecordResult", scope = SellVoiceRecordResponse.class)
    public JAXBElement<SellVoiceRecordResponseModel> createSellVoiceRecordResponseSellVoiceRecordResult(SellVoiceRecordResponseModel value) {
        return new JAXBElement<SellVoiceRecordResponseModel>(_SellVoiceRecordResponseSellVoiceRecordResult_QNAME, SellVoiceRecordResponseModel.class, SellVoiceRecordResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddVoipDeviceWithProcessResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddVoipDeviceWithProcessResult", scope = AddVoipDeviceWithProcessResponse.class)
    public JAXBElement<AddVoipDeviceWithProcessResponseModel> createAddVoipDeviceWithProcessResponseAddVoipDeviceWithProcessResult(AddVoipDeviceWithProcessResponseModel value) {
        return new JAXBElement<AddVoipDeviceWithProcessResponseModel>(_AddVoipDeviceWithProcessResponseAddVoipDeviceWithProcessResult_QNAME, AddVoipDeviceWithProcessResponseModel.class, AddVoipDeviceWithProcessResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplaceStockInfoInContractRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ReplaceStockInfoInContract.class)
    public JAXBElement<ReplaceStockInfoInContractRequestModel> createReplaceStockInfoInContractRequest(ReplaceStockInfoInContractRequestModel value) {
        return new JAXBElement<ReplaceStockInfoInContractRequestModel>(_SuspendAccountRequest_QNAME, ReplaceStockInfoInContractRequestModel.class, ReplaceStockInfoInContract.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmWebAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "WebAddress", scope = CrmContact.class)
    public JAXBElement<ArrayOfCrmWebAddress> createCrmContactWebAddress(ArrayOfCrmWebAddress value) {
        return new JAXBElement<ArrayOfCrmWebAddress>(_CrmContactWebAddress_QNAME, ArrayOfCrmWebAddress.class, CrmContact.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseNumbersOfVoipDeviceRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ReleaseNumbersOfVoipDevice.class)
    public JAXBElement<ReleaseNumbersOfVoipDeviceRequestModel> createReleaseNumbersOfVoipDeviceRequest(ReleaseNumbersOfVoipDeviceRequestModel value) {
        return new JAXBElement<ReleaseNumbersOfVoipDeviceRequestModel>(_SuspendAccountRequest_QNAME, ReleaseNumbersOfVoipDeviceRequestModel.class, ReleaseNumbersOfVoipDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", name = "BillingContractNo", scope = GetBulutSantralNumbersByBillingContractNoRequestModel.class)
    public JAXBElement<String> createGetBulutSantralNumbersByBillingContractNoRequestModelBillingContractNo(String value) {
        return new JAXBElement<String>(_GetBulutSantralNumbersByBillingContractNoRequestModelBillingContractNo_QNAME, String.class, GetBulutSantralNumbersByBillingContractNoRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Application", scope = RemovePoolRequestModel.class)
    public JAXBElement<String> createRemovePoolRequestModelApplication(String value) {
        return new JAXBElement<String>(_RemovePoolRequestModelApplication_QNAME, String.class, RemovePoolRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UserName", scope = RemovePoolRequestModel.class)
    public JAXBElement<String> createRemovePoolRequestModelUserName(String value) {
        return new JAXBElement<String>(_RemovePoolRequestModelUserName_QNAME, String.class, RemovePoolRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveMillenifonNumberRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = RemoveMillenifonNumber.class)
    public JAXBElement<RemoveMillenifonNumberRequestModel> createRemoveMillenifonNumberRequest(RemoveMillenifonNumberRequestModel value) {
        return new JAXBElement<RemoveMillenifonNumberRequestModel>(_SuspendAccountRequest_QNAME, RemoveMillenifonNumberRequestModel.class, RemoveMillenifonNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", name = "ValidationMessages", scope = ValidateContractDeactivationResponseModel.class)
    public JAXBElement<ArrayOfstring> createValidateContractDeactivationResponseModelValidationMessages(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ValidateAccountDeactivationResponseModelValidationMessages_QNAME, ArrayOfstring.class, ValidateContractDeactivationResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "User", scope = UserRequestModel.class)
    public JAXBElement<User> createUserRequestModelUser(User value) {
        return new JAXBElement<User>(_UserResponseModelUser_QNAME, User.class, UserRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveStockItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ReserveStockItem.class)
    public JAXBElement<ReserveStockItemRequestModel> createReserveStockItemRequest(ReserveStockItemRequestModel value) {
        return new JAXBElement<ReserveStockItemRequestModel>(_SuspendAccountRequest_QNAME, ReserveStockItemRequestModel.class, ReserveStockItem.class, value);
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
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Description", scope = CrmCustomerMessageType.class)
    public JAXBElement<String> createCrmCustomerMessageTypeDescription(String value) {
        return new JAXBElement<String>(_CrmCustomerMessageTypeDescription_QNAME, String.class, CrmCustomerMessageType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Code", scope = CrmCustomerMessageType.class)
    public JAXBElement<String> createCrmCustomerMessageTypeCode(String value) {
        return new JAXBElement<String>(_CrmCustomerMessageTypeCode_QNAME, String.class, CrmCustomerMessageType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ShipmentCode", scope = CrmAddress.class)
    public JAXBElement<String> createCrmAddressShipmentCode(String value) {
        return new JAXBElement<String>(_CrmAddressShipmentCode_QNAME, String.class, CrmAddress.class, value);
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
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Shipment", scope = CrmAddress.class)
    public JAXBElement<String> createCrmAddressShipment(String value) {
        return new JAXBElement<String>(_CrmAddressShipment_QNAME, String.class, CrmAddress.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryNumberPoolItemResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "QueryNumberPoolItemResult", scope = QueryNumberPoolItemResponse.class)
    public JAXBElement<QueryNumberPoolItemResponseModel> createQueryNumberPoolItemResponseQueryNumberPoolItemResult(QueryNumberPoolItemResponseModel value) {
        return new JAXBElement<QueryNumberPoolItemResponseModel>(_QueryNumberPoolItemResponseQueryNumberPoolItemResult_QNAME, QueryNumberPoolItemResponseModel.class, QueryNumberPoolItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", name = "Name", scope = CrmPhone.class)
    public JAXBElement<String> createCrmPhoneName(String value) {
        return new JAXBElement<String>(_CrmPhoneName_QNAME, String.class, CrmPhone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPoolItemsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = AddPoolItems.class)
    public JAXBElement<AddPoolItemsRequestModel> createAddPoolItemsRequest(AddPoolItemsRequestModel value) {
        return new JAXBElement<AddPoolItemsRequestModel>(_SuspendAccountRequest_QNAME, AddPoolItemsRequestModel.class, AddPoolItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", name = "ValidationMessages", scope = ValidateContractActivationResponseModel.class)
    public JAXBElement<ArrayOfstring> createValidateContractActivationResponseModelValidationMessages(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ValidateAccountDeactivationResponseModelValidationMessages_QNAME, ArrayOfstring.class, ValidateContractActivationResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStockItemStatusRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = SetStockItemStatusControl.class)
    public JAXBElement<ChangeStockItemStatusRequestModel> createSetStockItemStatusControlRequest(ChangeStockItemStatusRequestModel value) {
        return new JAXBElement<ChangeStockItemStatusRequestModel>(_SuspendAccountRequest_QNAME, ChangeStockItemStatusRequestModel.class, SetStockItemStatusControl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessProcessRequestRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ProcessRequest.class)
    public JAXBElement<ProcessProcessRequestRequestModel> createProcessRequestRequest(ProcessProcessRequestRequestModel value) {
        return new JAXBElement<ProcessProcessRequestRequestModel>(_SuspendAccountRequest_QNAME, ProcessProcessRequestRequestModel.class, ProcessRequest.class, value);
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
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Message", scope = ReplaceStockInfoInContractResponseModel.class)
    public JAXBElement<String> createReplaceStockInfoInContractResponseModelMessage(String value) {
        return new JAXBElement<String>(_ReplaceStockInfoInContractResponseModelMessage_QNAME, String.class, ReplaceStockInfoInContractResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplaceStockInfoDeviceProductResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ReplaceStockInfoDeviceProductResult", scope = ReplaceStockInfoDeviceProductResponse.class)
    public JAXBElement<ReplaceStockInfoDeviceProductResponseModel> createReplaceStockInfoDeviceProductResponseReplaceStockInfoDeviceProductResult(ReplaceStockInfoDeviceProductResponseModel value) {
        return new JAXBElement<ReplaceStockInfoDeviceProductResponseModel>(_ReplaceStockInfoDeviceProductResponseReplaceStockInfoDeviceProductResult_QNAME, ReplaceStockInfoDeviceProductResponseModel.class, ReplaceStockInfoDeviceProductResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDealerStokResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetDealerStocksResult", scope = GetDealerStocksResponse.class)
    public JAXBElement<GetDealerStokResponseModel> createGetDealerStocksResponseGetDealerStocksResult(GetDealerStokResponseModel value) {
        return new JAXBElement<GetDealerStokResponseModel>(_GetDealerStocksResponseGetDealerStocksResult_QNAME, GetDealerStokResponseModel.class, GetDealerStocksResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSaleAvailabilityRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = GetSaleAvailability.class)
    public JAXBElement<GetSaleAvailabilityRequestModel> createGetSaleAvailabilityRequest(GetSaleAvailabilityRequestModel value) {
        return new JAXBElement<GetSaleAvailabilityRequestModel>(_SuspendAccountRequest_QNAME, GetSaleAvailabilityRequestModel.class, GetSaleAvailability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryCustomerStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "QueryCustomerStatusResult", scope = QueryCustomerStatusResponse.class)
    public JAXBElement<QueryCustomerStatusResponseModel> createQueryCustomerStatusResponseQueryCustomerStatusResult(QueryCustomerStatusResponseModel value) {
        return new JAXBElement<QueryCustomerStatusResponseModel>(_QueryCustomerStatusResponseQueryCustomerStatusResult_QNAME, QueryCustomerStatusResponseModel.class, QueryCustomerStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = GetCustomerByCustomerId.class)
    public JAXBElement<GetCustomerRequestModel> createGetCustomerByCustomerIdRequest(GetCustomerRequestModel value) {
        return new JAXBElement<GetCustomerRequestModel>(_SuspendAccountRequest_QNAME, GetCustomerRequestModel.class, GetCustomerByCustomerId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNumbersToVoipDeviceResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddNumbersToVoipDeviceResult", scope = AddNumbersToVoipDeviceResponse.class)
    public JAXBElement<AddNumbersToVoipDeviceResponseModel> createAddNumbersToVoipDeviceResponseAddNumbersToVoipDeviceResult(AddNumbersToVoipDeviceResponseModel value) {
        return new JAXBElement<AddNumbersToVoipDeviceResponseModel>(_AddNumbersToVoipDeviceResponseAddNumbersToVoipDeviceResult_QNAME, AddNumbersToVoipDeviceResponseModel.class, AddNumbersToVoipDeviceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "StockItemList", scope = GetDealerStokResponseModel.class)
    public JAXBElement<ArrayOfStockItem> createGetDealerStokResponseModelStockItemList(ArrayOfStockItem value) {
        return new JAXBElement<ArrayOfStockItem>(_GetDealerStokResponseModelStockItemList_QNAME, ArrayOfStockItem.class, GetDealerStokResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SerialNumber", scope = QueryStockItemRequestModel.class)
    public JAXBElement<String> createQueryStockItemRequestModelSerialNumber(String value) {
        return new JAXBElement<String>(_QueryStockItemRequestModelSerialNumber_QNAME, String.class, QueryStockItemRequestModel.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseStockItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ReleaseStockItem.class)
    public JAXBElement<ReleaseStockItemRequestModel> createReleaseStockItemRequest(ReleaseStockItemRequestModel value) {
        return new JAXBElement<ReleaseStockItemRequestModel>(_SuspendAccountRequest_QNAME, ReleaseStockItemRequestModel.class, ReleaseStockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = AddUser.class)
    public JAXBElement<UserRequestModel> createAddUserRequest(UserRequestModel value) {
        return new JAXBElement<UserRequestModel>(_SuspendAccountRequest_QNAME, UserRequestModel.class, AddUser.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplaceStockInfoDeviceProductRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ReplaceStockInfoDeviceProduct.class)
    public JAXBElement<ReplaceStockInfoDeviceProductRequestModel> createReplaceStockInfoDeviceProductRequest(ReplaceStockInfoDeviceProductRequestModel value) {
        return new JAXBElement<ReplaceStockInfoDeviceProductRequestModel>(_SuspendAccountRequest_QNAME, ReplaceStockInfoDeviceProductRequestModel.class, ReplaceStockInfoDeviceProduct.class, value);
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
        return new JAXBElement<String>(_CrmPhoneName_QNAME, String.class, CrmDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", name = "Extension", scope = CrmDocument.class)
    public JAXBElement<String> createCrmDocumentExtension(String value) {
        return new JAXBElement<String>(_CrmDocumentExtension_QNAME, String.class, CrmDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", name = "Content", scope = CrmDocument.class)
    public JAXBElement<byte[]> createCrmDocumentContent(byte[] value) {
        return new JAXBElement<byte[]>(_CrmDocumentContent_QNAME, byte[].class, CrmDocument.class, ((byte[]) value));
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model", name = "ResultMessage", scope = BaseResponseModel.class)
    public JAXBElement<String> createBaseResponseModelResultMessage(String value) {
        return new JAXBElement<String>(_BaseResponseModelResultMessage_QNAME, String.class, BaseResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SerialNumber", scope = AssignStockItemRequestModel.class)
    public JAXBElement<String> createAssignStockItemRequestModelSerialNumber(String value) {
        return new JAXBElement<String>(_QueryStockItemRequestModelSerialNumber_QNAME, String.class, AssignStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Description", scope = AssignStockItemRequestModel.class)
    public JAXBElement<String> createAssignStockItemRequestModelDescription(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelDescription_QNAME, String.class, AssignStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "BillingContractNumber", scope = AssignStockItemRequestModel.class)
    public JAXBElement<String> createAssignStockItemRequestModelBillingContractNumber(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelBillingContractNumber_QNAME, String.class, AssignStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Username", scope = AssignStockItemRequestModel.class)
    public JAXBElement<String> createAssignStockItemRequestModelUsername(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelUsername_QNAME, String.class, AssignStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "IdentificationNumber", scope = AssignStockItemRequestModel.class)
    public JAXBElement<String> createAssignStockItemRequestModelIdentificationNumber(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelIdentificationNumber_QNAME, String.class, AssignStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMillenifonNumberRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = AddMillenifonNumber.class)
    public JAXBElement<AddMillenifonNumberRequestModel> createAddMillenifonNumberRequest(AddMillenifonNumberRequestModel value) {
        return new JAXBElement<AddMillenifonNumberRequestModel>(_SuspendAccountRequest_QNAME, AddMillenifonNumberRequestModel.class, AddMillenifonNumber.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UnavailableNumberPoolItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = UnavailableNumberPoolItem.class)
    public JAXBElement<UnavailableNumberPoolItemRequestModel> createUnavailableNumberPoolItemRequest(UnavailableNumberPoolItemRequestModel value) {
        return new JAXBElement<UnavailableNumberPoolItemRequestModel>(_SuspendAccountRequest_QNAME, UnavailableNumberPoolItemRequestModel.class, UnavailableNumberPoolItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStockItemStatusRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = SetStockItemStatusAssignedSupport.class)
    public JAXBElement<ChangeStockItemStatusRequestModel> createSetStockItemStatusAssignedSupportRequest(ChangeStockItemStatusRequestModel value) {
        return new JAXBElement<ChangeStockItemStatusRequestModel>(_SuspendAccountRequest_QNAME, ChangeStockItemStatusRequestModel.class, SetStockItemStatusAssignedSupport.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SerialNumber", scope = ReleaseStockItemRequestModel.class)
    public JAXBElement<String> createReleaseStockItemRequestModelSerialNumber(String value) {
        return new JAXBElement<String>(_QueryStockItemRequestModelSerialNumber_QNAME, String.class, ReleaseStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Description", scope = ReleaseStockItemRequestModel.class)
    public JAXBElement<String> createReleaseStockItemRequestModelDescription(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelDescription_QNAME, String.class, ReleaseStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Username", scope = ReleaseStockItemRequestModel.class)
    public JAXBElement<String> createReleaseStockItemRequestModelUsername(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelUsername_QNAME, String.class, ReleaseStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Bpm", name = "No", scope = CustomerInfo.class)
    public JAXBElement<String> createCustomerInfoNo(String value) {
        return new JAXBElement<String>(_CustomerInfoNo_QNAME, String.class, CustomerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "OldSerialNo", scope = ReplaceStockInfoInContractRequestModel.class)
    public JAXBElement<String> createReplaceStockInfoInContractRequestModelOldSerialNo(String value) {
        return new JAXBElement<String>(_ReplaceStockInfoDeviceProductRequestModelOldSerialNo_QNAME, String.class, ReplaceStockInfoInContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "NewSerialNo", scope = ReplaceStockInfoInContractRequestModel.class)
    public JAXBElement<String> createReplaceStockInfoInContractRequestModelNewSerialNo(String value) {
        return new JAXBElement<String>(_ReplaceStockInfoDeviceProductRequestModelNewSerialNo_QNAME, String.class, ReplaceStockInfoInContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Reason", scope = ReplaceStockInfoInContractRequestModel.class)
    public JAXBElement<String> createReplaceStockInfoInContractRequestModelReason(String value) {
        return new JAXBElement<String>(_ReplaceStockInfoInContractRequestModelReason_QNAME, String.class, ReplaceStockInfoInContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DummyJobRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ProcessRetention.class)
    public JAXBElement<DummyJobRequest> createProcessRetentionRequest(DummyJobRequest value) {
        return new JAXBElement<DummyJobRequest>(_SuspendAccountRequest_QNAME, DummyJobRequest.class, ProcessRetention.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignStockItemsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = AssignStockItems.class)
    public JAXBElement<AssignStockItemsRequestModel> createAssignStockItemsRequest(AssignStockItemsRequestModel value) {
        return new JAXBElement<AssignStockItemsRequestModel>(_SuspendAccountRequest_QNAME, AssignStockItemsRequestModel.class, AssignStockItems.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SerialNumber", scope = AddNumbersToVoipDeviceRequestModel.class)
    public JAXBElement<String> createAddNumbersToVoipDeviceRequestModelSerialNumber(String value) {
        return new JAXBElement<String>(_QueryStockItemRequestModelSerialNumber_QNAME, String.class, AddNumbersToVoipDeviceRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Mac", scope = AddNumbersToVoipDeviceRequestModel.class)
    public JAXBElement<String> createAddNumbersToVoipDeviceRequestModelMac(String value) {
        return new JAXBElement<String>(_AddNumbersToVoipDeviceRequestModelMac_QNAME, String.class, AddNumbersToVoipDeviceRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "PhoneNumbers", scope = AddNumbersToVoipDeviceRequestModel.class)
    public JAXBElement<ArrayOfstring> createAddNumbersToVoipDeviceRequestModelPhoneNumbers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_AddNumbersToVoipDeviceRequestModelPhoneNumbers_QNAME, ArrayOfstring.class, AddNumbersToVoipDeviceRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStockItemStatusRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = SetStockItemStatusOperationalTracing.class)
    public JAXBElement<ChangeStockItemStatusRequestModel> createSetStockItemStatusOperationalTracingRequest(ChangeStockItemStatusRequestModel value) {
        return new JAXBElement<ChangeStockItemStatusRequestModel>(_SuspendAccountRequest_QNAME, ChangeStockItemStatusRequestModel.class, SetStockItemStatusOperationalTracing.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockNumberPoolItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = BlockNumberPoolItem.class)
    public JAXBElement<BlockNumberPoolItemRequestModel> createBlockNumberPoolItemRequest(BlockNumberPoolItemRequestModel value) {
        return new JAXBElement<BlockNumberPoolItemRequestModel>(_SuspendAccountRequest_QNAME, BlockNumberPoolItemRequestModel.class, BlockNumberPoolItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNumbersToVoipDeviceRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = AddNumbersToVoipDevice.class)
    public JAXBElement<AddNumbersToVoipDeviceRequestModel> createAddNumbersToVoipDeviceRequest(AddNumbersToVoipDeviceRequestModel value) {
        return new JAXBElement<AddNumbersToVoipDeviceRequestModel>(_SuspendAccountRequest_QNAME, AddNumbersToVoipDeviceRequestModel.class, AddNumbersToVoipDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStockItemStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SetStockItemStatusResult", scope = SetStockItemStatusResponse.class)
    public JAXBElement<ChangeStockItemStatusResponseModel> createSetStockItemStatusResponseSetStockItemStatusResult(ChangeStockItemStatusResponseModel value) {
        return new JAXBElement<ChangeStockItemStatusResponseModel>(_SetStockItemStatusResponseSetStockItemStatusResult_QNAME, ChangeStockItemStatusResponseModel.class, SetStockItemStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfcheckNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Numbers", scope = CheckMillenifonGsmNumbersResponseModel.class)
    public JAXBElement<ArrayOfcheckNumber> createCheckMillenifonGsmNumbersResponseModelNumbers(ArrayOfcheckNumber value) {
        return new JAXBElement<ArrayOfcheckNumber>(_CheckMillenifonGsmNumbersResponseModelNumbers_QNAME, ArrayOfcheckNumber.class, CheckMillenifonGsmNumbersResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListStockItemResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ListStockItemResult", scope = ListStockItemResponse.class)
    public JAXBElement<ListStockItemResponseModel> createListStockItemResponseListStockItemResult(ListStockItemResponseModel value) {
        return new JAXBElement<ListStockItemResponseModel>(_ListStockItemResponseListStockItemResult_QNAME, ListStockItemResponseModel.class, ListStockItemResponse.class, value);
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
        return new JAXBElement<StockItem>(_QueryStockItemResponseModelStockItem_QNAME, StockItem.class, QueryStockItemOuidResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveVoipDeviceResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "RemoveVoipDeviceResult", scope = RemoveVoipDeviceResponse.class)
    public JAXBElement<RemoveVoipDeviceResponseModel> createRemoveVoipDeviceResponseRemoveVoipDeviceResult(RemoveVoipDeviceResponseModel value) {
        return new JAXBElement<RemoveVoipDeviceResponseModel>(_RemoveVoipDeviceResponseRemoveVoipDeviceResult_QNAME, RemoveVoipDeviceResponseModel.class, RemoveVoipDeviceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultyStockItemsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = FaultyStockItems.class)
    public JAXBElement<FaultyStockItemsRequestModel> createFaultyStockItemsRequest(FaultyStockItemsRequestModel value) {
        return new JAXBElement<FaultyStockItemsRequestModel>(_SuspendAccountRequest_QNAME, FaultyStockItemsRequestModel.class, FaultyStockItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GsmNo", scope = CheckNumber.class)
    public JAXBElement<String> createCheckNumberGsmNo(String value) {
        return new JAXBElement<String>(_CheckNumberGsmNo_QNAME, String.class, CheckNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStockItemStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SetStockItemStatusBilledResult", scope = SetStockItemStatusBilledResponse.class)
    public JAXBElement<ChangeStockItemStatusResponseModel> createSetStockItemStatusBilledResponseSetStockItemStatusBilledResult(ChangeStockItemStatusResponseModel value) {
        return new JAXBElement<ChangeStockItemStatusResponseModel>(_SetStockItemStatusBilledResponseSetStockItemStatusBilledResult_QNAME, ChangeStockItemStatusResponseModel.class, SetStockItemStatusBilledResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryNumberPoolItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = QueryNumberPoolItem.class)
    public JAXBElement<QueryNumberPoolItemRequestModel> createQueryNumberPoolItemRequest(QueryNumberPoolItemRequestModel value) {
        return new JAXBElement<QueryNumberPoolItemRequestModel>(_SuspendAccountRequest_QNAME, QueryNumberPoolItemRequestModel.class, QueryNumberPoolItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Description", scope = CancelProcessRequestModel.class)
    public JAXBElement<String> createCancelProcessRequestModelDescription(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelDescription_QNAME, String.class, CancelProcessRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveNumberPoolItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ReserveNumberPoolItem.class)
    public JAXBElement<ReserveNumberPoolItemRequestModel> createReserveNumberPoolItemRequest(ReserveNumberPoolItemRequestModel value) {
        return new JAXBElement<ReserveNumberPoolItemRequestModel>(_SuspendAccountRequest_QNAME, ReserveNumberPoolItemRequestModel.class, ReserveNumberPoolItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryOpenOrdersForDevicesRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = QueryOpenOrdersForDevices.class)
    public JAXBElement<QueryOpenOrdersForDevicesRequestModel> createQueryOpenOrdersForDevicesRequest(QueryOpenOrdersForDevicesRequestModel value) {
        return new JAXBElement<QueryOpenOrdersForDevicesRequestModel>(_SuspendAccountRequest_QNAME, QueryOpenOrdersForDevicesRequestModel.class, QueryOpenOrdersForDevices.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStockItemStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ReleaseStockItemResult", scope = ReleaseStockItemResponse.class)
    public JAXBElement<ChangeStockItemStatusResponseModel> createReleaseStockItemResponseReleaseStockItemResult(ChangeStockItemStatusResponseModel value) {
        return new JAXBElement<ChangeStockItemStatusResponseModel>(_ReleaseStockItemResponseReleaseStockItemResult_QNAME, ChangeStockItemStatusResponseModel.class, ReleaseStockItemResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockItemOrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "StockItemOrderInfos", scope = QueryOpenOrdersForDevicesResponseModel.class)
    public JAXBElement<ArrayOfStockItemOrderInfo> createQueryOpenOrdersForDevicesResponseModelStockItemOrderInfos(ArrayOfStockItemOrderInfo value) {
        return new JAXBElement<ArrayOfStockItemOrderInfo>(_QueryOpenOrdersForDevicesResponseModelStockItemOrderInfos_QNAME, ArrayOfStockItemOrderInfo.class, QueryOpenOrdersForDevicesResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Number", scope = ReserveNumberPoolItemRequestModel.class)
    public JAXBElement<String> createReserveNumberPoolItemRequestModelNumber(String value) {
        return new JAXBElement<String>(_ReserveNumberPoolItemRequestModelNumber_QNAME, String.class, ReserveNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Username", scope = ReserveNumberPoolItemRequestModel.class)
    public JAXBElement<String> createReserveNumberPoolItemRequestModelUsername(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelUsername_QNAME, String.class, ReserveNumberPoolItemRequestModel.class, value);
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
        return new JAXBElement<String>(_AssignStockItemRequestModelIdentificationNumber_QNAME, String.class, ReserveNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "RelatedIdentification", scope = StockItem.class)
    public JAXBElement<String> createStockItemRelatedIdentification(String value) {
        return new JAXBElement<String>(_StockItemRelatedIdentification_QNAME, String.class, StockItem.class, value);
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
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "OfferName", scope = StockItem.class)
    public JAXBElement<String> createStockItemOfferName(String value) {
        return new JAXBElement<String>(_StockItemOfferName_QNAME, String.class, StockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Organization", scope = StockItem.class)
    public JAXBElement<String> createStockItemOrganization(String value) {
        return new JAXBElement<String>(_StockItemOrganization_QNAME, String.class, StockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "OrganizationName", scope = StockItem.class)
    public JAXBElement<String> createStockItemOrganizationName(String value) {
        return new JAXBElement<String>(_StockItemOrganizationName_QNAME, String.class, StockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "OfferId", scope = StockItem.class)
    public JAXBElement<String> createStockItemOfferId(String value) {
        return new JAXBElement<String>(_StockItemOfferId_QNAME, String.class, StockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "FXSPort", scope = StockItem.class)
    public JAXBElement<String> createStockItemFXSPort(String value) {
        return new JAXBElement<String>(_StockItemFXSPort_QNAME, String.class, StockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "SerialNumber", scope = StockItem.class)
    public JAXBElement<String> createStockItemSerialNumber(String value) {
        return new JAXBElement<String>(_StockItemSerialNumber_QNAME, String.class, StockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "FXOPort", scope = StockItem.class)
    public JAXBElement<String> createStockItemFXOPort(String value) {
        return new JAXBElement<String>(_StockItemFXOPort_QNAME, String.class, StockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ModelName", scope = StockItem.class)
    public JAXBElement<String> createStockItemModelName(String value) {
        return new JAXBElement<String>(_StockItemModelName_QNAME, String.class, StockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "State", scope = StockItem.class)
    public JAXBElement<String> createStockItemState(String value) {
        return new JAXBElement<String>(_StockItemState_QNAME, String.class, StockItem.class, value);
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
        return new JAXBElement<String>(_StockItemBrandName_QNAME, String.class, StockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateContractActivationResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ValidateContractActivationResult", scope = ValidateContractActivationResponse.class)
    public JAXBElement<ValidateContractActivationResponseModel> createValidateContractActivationResponseValidateContractActivationResult(ValidateContractActivationResponseModel value) {
        return new JAXBElement<ValidateContractActivationResponseModel>(_ValidateContractActivationResponseValidateContractActivationResult_QNAME, ValidateContractActivationResponseModel.class, ValidateContractActivationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Username", scope = FaultyStockItemsRequestModel.class)
    public JAXBElement<String> createFaultyStockItemsRequestModelUsername(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelUsername_QNAME, String.class, FaultyStockItemsRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SerialNumbers", scope = FaultyStockItemsRequestModel.class)
    public JAXBElement<ArrayOfstring> createFaultyStockItemsRequestModelSerialNumbers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_FaultyStockItemsRequestModelSerialNumbers_QNAME, ArrayOfstring.class, FaultyStockItemsRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "IdentificationNumber", scope = FaultyStockItemsRequestModel.class)
    public JAXBElement<String> createFaultyStockItemsRequestModelIdentificationNumber(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelIdentificationNumber_QNAME, String.class, FaultyStockItemsRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveVoipDeviceRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = RemoveVoipDevice.class)
    public JAXBElement<RemoveVoipDeviceRequestModel> createRemoveVoipDeviceRequest(RemoveVoipDeviceRequestModel value) {
        return new JAXBElement<RemoveVoipDeviceRequestModel>(_SuspendAccountRequest_QNAME, RemoveVoipDeviceRequestModel.class, RemoveVoipDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SipUserName", scope = BulutSantralNumbers.class)
    public JAXBElement<String> createBulutSantralNumbersSipUserName(String value) {
        return new JAXBElement<String>(_BulutSantralNumbersSipUserName_QNAME, String.class, BulutSantralNumbers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "PortaoneAccoutId", scope = BulutSantralNumbers.class)
    public JAXBElement<String> createBulutSantralNumbersPortaoneAccoutId(String value) {
        return new JAXBElement<String>(_BulutSantralNumbersPortaoneAccoutId_QNAME, String.class, BulutSantralNumbers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulutSantralVoipDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Device", scope = BulutSantralNumbers.class)
    public JAXBElement<BulutSantralVoipDevice> createBulutSantralNumbersDevice(BulutSantralVoipDevice value) {
        return new JAXBElement<BulutSantralVoipDevice>(_BulutSantralNumbersDevice_QNAME, BulutSantralVoipDevice.class, BulutSantralNumbers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "PortaoneNumberType", scope = BulutSantralNumbers.class)
    public JAXBElement<String> createBulutSantralNumbersPortaoneNumberType(String value) {
        return new JAXBElement<String>(_BulutSantralNumbersPortaoneNumberType_QNAME, String.class, BulutSantralNumbers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SipPassword", scope = BulutSantralNumbers.class)
    public JAXBElement<String> createBulutSantralNumbersSipPassword(String value) {
        return new JAXBElement<String>(_BulutSantralNumbersSipPassword_QNAME, String.class, BulutSantralNumbers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "PortaoneCustomerId", scope = BulutSantralNumbers.class)
    public JAXBElement<String> createBulutSantralNumbersPortaoneCustomerId(String value) {
        return new JAXBElement<String>(_BulutSantralNumbersPortaoneCustomerId_QNAME, String.class, BulutSantralNumbers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "PortaoneDevicePort", scope = BulutSantralNumbers.class)
    public JAXBElement<String> createBulutSantralNumbersPortaoneDevicePort(String value) {
        return new JAXBElement<String>(_BulutSantralNumbersPortaoneDevicePort_QNAME, String.class, BulutSantralNumbers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "OperationType", scope = BulutSantralNumbers.class)
    public JAXBElement<String> createBulutSantralNumbersOperationType(String value) {
        return new JAXBElement<String>(_BulutSantralNumbersOperationType_QNAME, String.class, BulutSantralNumbers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "CliNumber", scope = BulutSantralNumbers.class)
    public JAXBElement<String> createBulutSantralNumbersCliNumber(String value) {
        return new JAXBElement<String>(_BulutSantralNumbersCliNumber_QNAME, String.class, BulutSantralNumbers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStockItemToStockRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "req", scope = AddItemToStock.class)
    public JAXBElement<AddStockItemToStockRequestModel> createAddItemToStockReq(AddStockItemToStockRequestModel value) {
        return new JAXBElement<AddStockItemToStockRequestModel>(_AddItemToStockReq_QNAME, AddStockItemToStockRequestModel.class, AddItemToStock.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNumberPoolItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Numbers", scope = GetNumbersFromPoolResponseModel.class)
    public JAXBElement<ArrayOfNumberPoolItem> createGetNumbersFromPoolResponseModelNumbers(ArrayOfNumberPoolItem value) {
        return new JAXBElement<ArrayOfNumberPoolItem>(_CheckMillenifonGsmNumbersResponseModelNumbers_QNAME, ArrayOfNumberPoolItem.class, GetNumbersFromPoolResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Application", scope = RemovePoolItemsRequestModel.class)
    public JAXBElement<String> createRemovePoolItemsRequestModelApplication(String value) {
        return new JAXBElement<String>(_RemovePoolRequestModelApplication_QNAME, String.class, RemovePoolItemsRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "PoolItemId", scope = RemovePoolItemsRequestModel.class)
    public JAXBElement<ArrayOfguid> createRemovePoolItemsRequestModelPoolItemId(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_RemovePoolItemsRequestModelPoolItemId_QNAME, ArrayOfguid.class, RemovePoolItemsRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UserName", scope = RemovePoolItemsRequestModel.class)
    public JAXBElement<String> createRemovePoolItemsRequestModelUserName(String value) {
        return new JAXBElement<String>(_RemovePoolRequestModelUserName_QNAME, String.class, RemovePoolItemsRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Name", scope = CrmPool.class)
    public JAXBElement<String> createCrmPoolName(String value) {
        return new JAXBElement<String>(_CrmContactName_QNAME, String.class, CrmPool.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "BillingId", scope = CrmPool.class)
    public JAXBElement<String> createCrmPoolBillingId(String value) {
        return new JAXBElement<String>(_CrmPoolBillingId_QNAME, String.class, CrmPool.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmPoolItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "PoolItems", scope = CrmPool.class)
    public JAXBElement<ArrayOfCrmPoolItem> createCrmPoolPoolItems(ArrayOfCrmPoolItem value) {
        return new JAXBElement<ArrayOfCrmPoolItem>(_CrmPoolPoolItems_QNAME, ArrayOfCrmPoolItem.class, CrmPool.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ValidFrom", scope = CrmAccount.class)
    public JAXBElement<XMLGregorianCalendar> createCrmAccountValidFrom(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CrmAccountValidFrom_QNAME, XMLGregorianCalendar.class, CrmAccount.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmPool }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Pools", scope = CrmAccount.class)
    public JAXBElement<ArrayOfCrmPool> createCrmAccountPools(ArrayOfCrmPool value) {
        return new JAXBElement<ArrayOfCrmPool>(_CrmAccountPools_QNAME, ArrayOfCrmPool.class, CrmAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ShipmentAddress", scope = CrmAccount.class)
    public JAXBElement<CrmAddress> createCrmAccountShipmentAddress(CrmAddress value) {
        return new JAXBElement<CrmAddress>(_CrmAccountShipmentAddress_QNAME, CrmAddress.class, CrmAccount.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "InstallmentAddress", scope = CrmAccount.class)
    public JAXBElement<CrmAddress> createCrmAccountInstallmentAddress(CrmAddress value) {
        return new JAXBElement<CrmAddress>(_CrmAccountInstallmentAddress_QNAME, CrmAddress.class, CrmAccount.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ValidTo", scope = CrmAccount.class)
    public JAXBElement<XMLGregorianCalendar> createCrmAccountValidTo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CrmAccountValidTo_QNAME, XMLGregorianCalendar.class, CrmAccount.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "StatusChangeDate", scope = CrmAccount.class)
    public JAXBElement<XMLGregorianCalendar> createCrmAccountStatusChangeDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CrmAccountStatusChangeDate_QNAME, XMLGregorianCalendar.class, CrmAccount.class, value);
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
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "SoftInvoiceEmail", scope = CrmAccount.class)
    public JAXBElement<String> createCrmAccountSoftInvoiceEmail(String value) {
        return new JAXBElement<String>(_CrmAccountSoftInvoiceEmail_QNAME, String.class, CrmAccount.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPoolItemsResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddPoolItemsResult", scope = AddPoolItemsResponse.class)
    public JAXBElement<AddPoolItemsResponseModel> createAddPoolItemsResponseAddPoolItemsResult(AddPoolItemsResponseModel value) {
        return new JAXBElement<AddPoolItemsResponseModel>(_AddPoolItemsResponseAddPoolItemsResult_QNAME, AddPoolItemsResponseModel.class, AddPoolItemsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = DeleteUser.class)
    public JAXBElement<UserRequestModel> createDeleteUserRequest(UserRequestModel value) {
        return new JAXBElement<UserRequestModel>(_SuspendAccountRequest_QNAME, UserRequestModel.class, DeleteUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SerialNumber", scope = QueryStockItemOuidRequestModel.class)
    public JAXBElement<String> createQueryStockItemOuidRequestModelSerialNumber(String value) {
        return new JAXBElement<String>(_QueryStockItemRequestModelSerialNumber_QNAME, String.class, QueryStockItemOuidRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "MacAddress", scope = QueryStockItemOuidRequestModel.class)
    public JAXBElement<String> createQueryStockItemOuidRequestModelMacAddress(String value) {
        return new JAXBElement<String>(_QueryStockItemOuidRequestModelMacAddress_QNAME, String.class, QueryStockItemOuidRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePoolRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = RemovePool.class)
    public JAXBElement<RemovePoolRequestModel> createRemovePoolRequest(RemovePoolRequestModel value) {
        return new JAXBElement<RemovePoolRequestModel>(_SuspendAccountRequest_QNAME, RemovePoolRequestModel.class, RemovePool.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateAccountRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ActivateAccount.class)
    public JAXBElement<ActivateAccountRequestModel> createActivateAccountRequest(ActivateAccountRequestModel value) {
        return new JAXBElement<ActivateAccountRequestModel>(_SuspendAccountRequest_QNAME, ActivateAccountRequestModel.class, ActivateAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "StockItems", scope = StockItemsResponseModel.class)
    public JAXBElement<ArrayOfStockItem> createStockItemsResponseModelStockItems(ArrayOfStockItem value) {
        return new JAXBElement<ArrayOfStockItem>(_StockItemsResponseModelStockItems_QNAME, ArrayOfStockItem.class, StockItemsResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Fxs", scope = ListStockItemRequestModel.class)
    public JAXBElement<Integer> createListStockItemRequestModelFxs(Integer value) {
        return new JAXBElement<Integer>(_ListStockItemRequestModelFxs_QNAME, Integer.class, ListStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Stock", scope = ListStockItemRequestModel.class)
    public JAXBElement<String> createListStockItemRequestModelStock(String value) {
        return new JAXBElement<String>(_ListStockItemRequestModelStock_QNAME, String.class, ListStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Fxo", scope = ListStockItemRequestModel.class)
    public JAXBElement<Integer> createListStockItemRequestModelFxo(Integer value) {
        return new JAXBElement<Integer>(_ListStockItemRequestModelFxo_QNAME, Integer.class, ListStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Status", scope = SuspendAccountRequestModel.class)
    public JAXBElement<String> createSuspendAccountRequestModelStatus(String value) {
        return new JAXBElement<String>(_SuspendAccountRequestModelStatus_QNAME, String.class, SuspendAccountRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "DunningProcessId", scope = SuspendAccountRequestModel.class)
    public JAXBElement<String> createSuspendAccountRequestModelDunningProcessId(String value) {
        return new JAXBElement<String>(_SuspendAccountRequestModelDunningProcessId_QNAME, String.class, SuspendAccountRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "StatusReasonDef", scope = SuspendAccountRequestModel.class)
    public JAXBElement<String> createSuspendAccountRequestModelStatusReasonDef(String value) {
        return new JAXBElement<String>(_SuspendAccountRequestModelStatusReasonDef_QNAME, String.class, SuspendAccountRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Application", scope = SuspendAccountRequestModel.class)
    public JAXBElement<String> createSuspendAccountRequestModelApplication(String value) {
        return new JAXBElement<String>(_RemovePoolRequestModelApplication_QNAME, String.class, SuspendAccountRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UserName", scope = SuspendAccountRequestModel.class)
    public JAXBElement<String> createSuspendAccountRequestModelUserName(String value) {
        return new JAXBElement<String>(_RemovePoolRequestModelUserName_QNAME, String.class, SuspendAccountRequestModel.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetCustomerByCustomerIdResult", scope = GetCustomerByCustomerIdResponse.class)
    public JAXBElement<GetCustomerResponseModel> createGetCustomerByCustomerIdResponseGetCustomerByCustomerIdResult(GetCustomerResponseModel value) {
        return new JAXBElement<GetCustomerResponseModel>(_GetCustomerByCustomerIdResponseGetCustomerByCustomerIdResult_QNAME, GetCustomerResponseModel.class, GetCustomerByCustomerIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = GetCustomer.class)
    public JAXBElement<GetCustomerRequestModel> createGetCustomerRequest(GetCustomerRequestModel value) {
        return new JAXBElement<GetCustomerRequestModel>(_SuspendAccountRequest_QNAME, GetCustomerRequestModel.class, GetCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignStockItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = AssignStockItem.class)
    public JAXBElement<AssignStockItemRequestModel> createAssignStockItemRequest(AssignStockItemRequestModel value) {
        return new JAXBElement<AssignStockItemRequestModel>(_SuspendAccountRequest_QNAME, AssignStockItemRequestModel.class, AssignStockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Username", scope = AssignStockItemsRequestModel.class)
    public JAXBElement<String> createAssignStockItemsRequestModelUsername(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelUsername_QNAME, String.class, AssignStockItemsRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SerialNumbers", scope = AssignStockItemsRequestModel.class)
    public JAXBElement<ArrayOfstring> createAssignStockItemsRequestModelSerialNumbers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_FaultyStockItemsRequestModelSerialNumbers_QNAME, ArrayOfstring.class, AssignStockItemsRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "IdentificationNumber", scope = AssignStockItemsRequestModel.class)
    public JAXBElement<String> createAssignStockItemsRequestModelIdentificationNumber(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelIdentificationNumber_QNAME, String.class, AssignStockItemsRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStockItemStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SetStockItemStatusOperationalTracingResult", scope = SetStockItemStatusOperationalTracingResponse.class)
    public JAXBElement<ChangeStockItemStatusResponseModel> createSetStockItemStatusOperationalTracingResponseSetStockItemStatusOperationalTracingResult(ChangeStockItemStatusResponseModel value) {
        return new JAXBElement<ChangeStockItemStatusResponseModel>(_SetStockItemStatusOperationalTracingResponseSetStockItemStatusOperationalTracingResult_QNAME, ChangeStockItemStatusResponseModel.class, SetStockItemStatusOperationalTracingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "CustomerInfo", scope = GetCustomerStockItemsRequestModel.class)
    public JAXBElement<CustomerInfo> createGetCustomerStockItemsRequestModelCustomerInfo(CustomerInfo value) {
        return new JAXBElement<CustomerInfo>(_GetCustomerStockItemsRequestModelCustomerInfo_QNAME, CustomerInfo.class, GetCustomerStockItemsRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRemaingFreeUnitUsageByPhoneNumberRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = GetRemaingFreeUnitUsageByPhoneNumber.class)
    public JAXBElement<GetRemaingFreeUnitUsageByPhoneNumberRequestModel> createGetRemaingFreeUnitUsageByPhoneNumberRequest(GetRemaingFreeUnitUsageByPhoneNumberRequestModel value) {
        return new JAXBElement<GetRemaingFreeUnitUsageByPhoneNumberRequestModel>(_SuspendAccountRequest_QNAME, GetRemaingFreeUnitUsageByPhoneNumberRequestModel.class, GetRemaingFreeUnitUsageByPhoneNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "StockItemSerialNos", scope = QueryOpenOrdersForDevicesRequestModel.class)
    public JAXBElement<ArrayOfstring> createQueryOpenOrdersForDevicesRequestModelStockItemSerialNos(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_QueryOpenOrdersForDevicesRequestModelStockItemSerialNos_QNAME, ArrayOfstring.class, QueryOpenOrdersForDevicesRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStockItemStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SetStockItemStatusAssignedSupportResult", scope = SetStockItemStatusAssignedSupportResponse.class)
    public JAXBElement<ChangeStockItemStatusResponseModel> createSetStockItemStatusAssignedSupportResponseSetStockItemStatusAssignedSupportResult(ChangeStockItemStatusResponseModel value) {
        return new JAXBElement<ChangeStockItemStatusResponseModel>(_SetStockItemStatusAssignedSupportResponseSetStockItemStatusAssignedSupportResult_QNAME, ChangeStockItemStatusResponseModel.class, SetStockItemStatusAssignedSupportResponse.class, value);
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
        return new JAXBElement<String>(_ReserveNumberPoolItemRequestModelNumber_QNAME, String.class, AssignNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Username", scope = AssignNumberPoolItemRequestModel.class)
    public JAXBElement<String> createAssignNumberPoolItemRequestModelUsername(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelUsername_QNAME, String.class, AssignNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "IdentificationNumber", scope = AssignNumberPoolItemRequestModel.class)
    public JAXBElement<String> createAssignNumberPoolItemRequestModelIdentificationNumber(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelIdentificationNumber_QNAME, String.class, AssignNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStockItemStatusRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = SetStockItemStatus.class)
    public JAXBElement<ChangeStockItemStatusRequestModel> createSetStockItemStatusRequest(ChangeStockItemStatusRequestModel value) {
        return new JAXBElement<ChangeStockItemStatusRequestModel>(_SuspendAccountRequest_QNAME, ChangeStockItemStatusRequestModel.class, SetStockItemStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryCustomerRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = QueryCustomer.class)
    public JAXBElement<QueryCustomerRequestModel> createQueryCustomerRequest(QueryCustomerRequestModel value) {
        return new JAXBElement<QueryCustomerRequestModel>(_SuspendAccountRequest_QNAME, QueryCustomerRequestModel.class, QueryCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ActivationReasonDesc", scope = ContractedNumber.class)
    public JAXBElement<String> createContractedNumberActivationReasonDesc(String value) {
        return new JAXBElement<String>(_ContractedNumberActivationReasonDesc_QNAME, String.class, ContractedNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Number", scope = ContractedNumber.class)
    public JAXBElement<String> createContractedNumberNumber(String value) {
        return new JAXBElement<String>(_CrmNumberNumber_QNAME, String.class, ContractedNumber.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ActivationReason", scope = ContractedNumber.class)
    public JAXBElement<Long> createContractedNumberActivationReason(Long value) {
        return new JAXBElement<Long>(_ContractedNumberActivationReason_QNAME, Long.class, ContractedNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerStockItemsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = GetCustomerStockItems.class)
    public JAXBElement<GetCustomerStockItemsRequestModel> createGetCustomerStockItemsRequest(GetCustomerStockItemsRequestModel value) {
        return new JAXBElement<GetCustomerStockItemsRequestModel>(_SuspendAccountRequest_QNAME, GetCustomerStockItemsRequestModel.class, GetCustomerStockItems.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmPool }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Pools", scope = Customer.class)
    public JAXBElement<ArrayOfCrmPool> createCustomerPools(ArrayOfCrmPool value) {
        return new JAXBElement<ArrayOfCrmPool>(_CrmAccountPools_QNAME, ArrayOfCrmPool.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "FatherName", scope = Customer.class)
    public JAXBElement<String> createCustomerFatherName(String value) {
        return new JAXBElement<String>(_CustomerFatherName_QNAME, String.class, Customer.class, value);
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
        return new JAXBElement<String>(_CrmCustomerMessageTypeCode_QNAME, String.class, Customer.class, value);
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
        return new JAXBElement<String>(_CustomerFullName_QNAME, String.class, Customer.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ExemptionNumber", scope = Customer.class)
    public JAXBElement<String> createCustomerExemptionNumber(String value) {
        return new JAXBElement<String>(_CustomerExemptionNumber_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "PassportNo", scope = Customer.class)
    public JAXBElement<String> createCustomerPassportNo(String value) {
        return new JAXBElement<String>(_CustomerPassportNo_QNAME, String.class, Customer.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UserResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddUserResult", scope = AddUserResponse.class)
    public JAXBElement<UserResponseModel> createAddUserResponseAddUserResult(UserResponseModel value) {
        return new JAXBElement<UserResponseModel>(_AddUserResponseAddUserResult_QNAME, UserResponseModel.class, AddUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePoolItemsRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = RemovePoolItems.class)
    public JAXBElement<RemovePoolItemsRequestModel> createRemovePoolItemsRequest(RemovePoolItemsRequestModel value) {
        return new JAXBElement<RemovePoolItemsRequestModel>(_SuspendAccountRequest_QNAME, RemovePoolItemsRequestModel.class, RemovePoolItems.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDealerStokStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UpdateDealerStockStatusResult", scope = UpdateDealerStockStatusResponse.class)
    public JAXBElement<UpdateDealerStokStatusResponseModel> createUpdateDealerStockStatusResponseUpdateDealerStockStatusResult(UpdateDealerStokStatusResponseModel value) {
        return new JAXBElement<UpdateDealerStokStatusResponseModel>(_UpdateDealerStockStatusResponseUpdateDealerStockStatusResult_QNAME, UpdateDealerStokStatusResponseModel.class, UpdateDealerStockStatusResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "processId", scope = ChangeTitleCreateProduct.class)
    public JAXBElement<String> createChangeTitleCreateProductProcessId(String value) {
        return new JAXBElement<String>(_ChangeTitleCreateProductProcessId_QNAME, String.class, ChangeTitleCreateProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Number", scope = UnavailableNumberPoolItemRequestModel.class)
    public JAXBElement<String> createUnavailableNumberPoolItemRequestModelNumber(String value) {
        return new JAXBElement<String>(_ReserveNumberPoolItemRequestModelNumber_QNAME, String.class, UnavailableNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Username", scope = UnavailableNumberPoolItemRequestModel.class)
    public JAXBElement<String> createUnavailableNumberPoolItemRequestModelUsername(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelUsername_QNAME, String.class, UnavailableNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateAccountRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ActivateAccountOneWay.class)
    public JAXBElement<ActivateAccountRequestModel> createActivateAccountOneWayRequest(ActivateAccountRequestModel value) {
        return new JAXBElement<ActivateAccountRequestModel>(_SuspendAccountRequest_QNAME, ActivateAccountRequestModel.class, ActivateAccountOneWay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SerialNumber", scope = ReserveStockItemRequestModel.class)
    public JAXBElement<String> createReserveStockItemRequestModelSerialNumber(String value) {
        return new JAXBElement<String>(_QueryStockItemRequestModelSerialNumber_QNAME, String.class, ReserveStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Description", scope = ReserveStockItemRequestModel.class)
    public JAXBElement<String> createReserveStockItemRequestModelDescription(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelDescription_QNAME, String.class, ReserveStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Username", scope = ReserveStockItemRequestModel.class)
    public JAXBElement<String> createReserveStockItemRequestModelUsername(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelUsername_QNAME, String.class, ReserveStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "IdentificationNumber", scope = ReserveStockItemRequestModel.class)
    public JAXBElement<String> createReserveStockItemRequestModelIdentificationNumber(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelIdentificationNumber_QNAME, String.class, ReserveStockItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePoolResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "RemovePoolResult", scope = RemovePoolResponse.class)
    public JAXBElement<RemovePoolResponseModel> createRemovePoolResponseRemovePoolResult(RemovePoolResponseModel value) {
        return new JAXBElement<RemovePoolResponseModel>(_RemovePoolResponseRemovePoolResult_QNAME, RemovePoolResponseModel.class, RemovePoolResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateContractActivationRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ValidateContractActivation.class)
    public JAXBElement<ValidateContractActivationRequestModel> createValidateContractActivationRequest(ValidateContractActivationRequestModel value) {
        return new JAXBElement<ValidateContractActivationRequestModel>(_SuspendAccountRequest_QNAME, ValidateContractActivationRequestModel.class, ValidateContractActivation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Number", scope = BlockNumberPoolItemRequestModel.class)
    public JAXBElement<String> createBlockNumberPoolItemRequestModelNumber(String value) {
        return new JAXBElement<String>(_ReserveNumberPoolItemRequestModelNumber_QNAME, String.class, BlockNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Username", scope = BlockNumberPoolItemRequestModel.class)
    public JAXBElement<String> createBlockNumberPoolItemRequestModelUsername(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelUsername_QNAME, String.class, BlockNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStockItemResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "QueryStockItemByStateResult", scope = QueryStockItemByStateResponse.class)
    public JAXBElement<QueryStockItemResponseModel> createQueryStockItemByStateResponseQueryStockItemByStateResult(QueryStockItemResponseModel value) {
        return new JAXBElement<QueryStockItemResponseModel>(_QueryStockItemByStateResponseQueryStockItemByStateResult_QNAME, QueryStockItemResponseModel.class, QueryStockItemByStateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStockItemStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SetStockItemStatusAssignedBilledResult", scope = SetStockItemStatusAssignedBilledResponse.class)
    public JAXBElement<ChangeStockItemStatusResponseModel> createSetStockItemStatusAssignedBilledResponseSetStockItemStatusAssignedBilledResult(ChangeStockItemStatusResponseModel value) {
        return new JAXBElement<ChangeStockItemStatusResponseModel>(_SetStockItemStatusAssignedBilledResponseSetStockItemStatusAssignedBilledResult_QNAME, ChangeStockItemStatusResponseModel.class, SetStockItemStatusAssignedBilledResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", name = "GsmNumber", scope = AddMillenifonNumberRequestModel.class)
    public JAXBElement<String> createAddMillenifonNumberRequestModelGsmNumber(String value) {
        return new JAXBElement<String>(_AddMillenifonNumberRequestModelGsmNumber_QNAME, String.class, AddMillenifonNumberRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", name = "ApplicationName", scope = AddMillenifonNumberRequestModel.class)
    public JAXBElement<String> createAddMillenifonNumberRequestModelApplicationName(String value) {
        return new JAXBElement<String>(_AddMillenifonNumberRequestModelApplicationName_QNAME, String.class, AddMillenifonNumberRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Contracts", name = "Message", scope = BaseResponseDto.class)
    public JAXBElement<String> createBaseResponseDtoMessage(String value) {
        return new JAXBElement<String>(_BaseResponseDtoMessage_QNAME, String.class, BaseResponseDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", name = "Identity", scope = GetSaleAvailabilityRequestModel.class)
    public JAXBElement<String> createGetSaleAvailabilityRequestModelIdentity(String value) {
        return new JAXBElement<String>(_GetSaleAvailabilityRequestModelIdentity_QNAME, String.class, GetSaleAvailabilityRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Tckn", scope = QueryCustomerStatusRequestModel.class)
    public JAXBElement<String> createQueryCustomerStatusRequestModelTckn(String value) {
        return new JAXBElement<String>(_QueryCustomerRequestModelTckn_QNAME, String.class, QueryCustomerStatusRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Vkn", scope = QueryCustomerStatusRequestModel.class)
    public JAXBElement<String> createQueryCustomerStatusRequestModelVkn(String value) {
        return new JAXBElement<String>(_QueryCustomerRequestModelVkn_QNAME, String.class, QueryCustomerStatusRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SerialNumber", scope = QueryStockItemByStateRequestModel.class)
    public JAXBElement<String> createQueryStockItemByStateRequestModelSerialNumber(String value) {
        return new JAXBElement<String>(_QueryStockItemRequestModelSerialNumber_QNAME, String.class, QueryStockItemByStateRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "States", scope = QueryStockItemByStateRequestModel.class)
    public JAXBElement<ArrayOfstring> createQueryStockItemByStateRequestModelStates(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_QueryStockItemByStateRequestModelStates_QNAME, ArrayOfstring.class, QueryStockItemByStateRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRemaingFreeUnitUsageByPhoneNumberResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetRemaingFreeUnitUsageByPhoneNumberResult", scope = GetRemaingFreeUnitUsageByPhoneNumberResponse.class)
    public JAXBElement<GetRemaingFreeUnitUsageByPhoneNumberResponseModel> createGetRemaingFreeUnitUsageByPhoneNumberResponseGetRemaingFreeUnitUsageByPhoneNumberResult(GetRemaingFreeUnitUsageByPhoneNumberResponseModel value) {
        return new JAXBElement<GetRemaingFreeUnitUsageByPhoneNumberResponseModel>(_GetRemaingFreeUnitUsageByPhoneNumberResponseGetRemaingFreeUnitUsageByPhoneNumberResult_QNAME, GetRemaingFreeUnitUsageByPhoneNumberResponseModel.class, GetRemaingFreeUnitUsageByPhoneNumberResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDealerStokStatusRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = UpdateDealerStockStatus.class)
    public JAXBElement<UpdateDealerStokStatusRequestModel> createUpdateDealerStockStatusRequest(UpdateDealerStokStatusRequestModel value) {
        return new JAXBElement<UpdateDealerStokStatusRequestModel>(_SuspendAccountRequest_QNAME, UpdateDealerStokStatusRequestModel.class, UpdateDealerStockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "StockItemSerialNo", scope = StockItemOrderInfo.class)
    public JAXBElement<String> createStockItemOrderInfoStockItemSerialNo(String value) {
        return new JAXBElement<String>(_StockItemOrderInfoStockItemSerialNo_QNAME, String.class, StockItemOrderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "OrderCode", scope = StockItemOrderInfo.class)
    public JAXBElement<String> createStockItemOrderInfoOrderCode(String value) {
        return new JAXBElement<String>(_StockItemOrderInfoOrderCode_QNAME, String.class, StockItemOrderInfo.class, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", name = "ApplicationName", scope = RemoveMillenifonNumberRequestModel.class)
    public JAXBElement<String> createRemoveMillenifonNumberRequestModelApplicationName(String value) {
        return new JAXBElement<String>(_AddMillenifonNumberRequestModelApplicationName_QNAME, String.class, RemoveMillenifonNumberRequestModel.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddVoipDeviceWithProcessRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "req", scope = AddVoipDeviceWithProcess.class)
    public JAXBElement<AddVoipDeviceWithProcessRequestModel> createAddVoipDeviceWithProcessReq(AddVoipDeviceWithProcessRequestModel value) {
        return new JAXBElement<AddVoipDeviceWithProcessRequestModel>(_AddItemToStockReq_QNAME, AddVoipDeviceWithProcessRequestModel.class, AddVoipDeviceWithProcess.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Numbers", scope = CheckMillenifonGsmNumbersRequestModel.class)
    public JAXBElement<ArrayOfstring> createCheckMillenifonGsmNumbersRequestModelNumbers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_CheckMillenifonGsmNumbersResponseModelNumbers_QNAME, ArrayOfstring.class, CheckMillenifonGsmNumbersRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "FaultedSerialNoList", scope = UpdateDealerStokStatusResponseModel.class)
    public JAXBElement<ArrayOfstring> createUpdateDealerStokStatusResponseModelFaultedSerialNoList(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_UpdateDealerStokStatusResponseModelFaultedSerialNoList_QNAME, ArrayOfstring.class, UpdateDealerStokStatusResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ErrorMessage", scope = UpdateDealerStokStatusResponseModel.class)
    public JAXBElement<String> createUpdateDealerStokStatusResponseModelErrorMessage(String value) {
        return new JAXBElement<String>(_UpdateDealerStokStatusResponseModelErrorMessage_QNAME, String.class, UpdateDealerStokStatusResponseModel.class, value);
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
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "SalesPersonIdentityId", scope = CrmContract.class)
    public JAXBElement<String> createCrmContractSalesPersonIdentityId(String value) {
        return new JAXBElement<String>(_CrmContractSalesPersonIdentityId_QNAME, String.class, CrmContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "SalesPerson", scope = CrmContract.class)
    public JAXBElement<String> createCrmContractSalesPerson(String value) {
        return new JAXBElement<String>(_CrmContractSalesPerson_QNAME, String.class, CrmContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "PartnerCode", scope = CrmContract.class)
    public JAXBElement<String> createCrmContractPartnerCode(String value) {
        return new JAXBElement<String>(_CrmContractPartnerCode_QNAME, String.class, CrmContract.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ValidTo", scope = CrmContract.class)
    public JAXBElement<XMLGregorianCalendar> createCrmContractValidTo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CrmAccountValidTo_QNAME, XMLGregorianCalendar.class, CrmContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "SalesPersonOrganizationId", scope = CrmContract.class)
    public JAXBElement<String> createCrmContractSalesPersonOrganizationId(String value) {
        return new JAXBElement<String>(_CrmContractSalesPersonOrganizationId_QNAME, String.class, CrmContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Partner", scope = CrmContract.class)
    public JAXBElement<String> createCrmContractPartner(String value) {
        return new JAXBElement<String>(_CrmContractPartner_QNAME, String.class, CrmContract.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateCustomerContractRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ActivateCustomerContract.class)
    public JAXBElement<ActivateCustomerContractRequestModel> createActivateCustomerContractRequest(ActivateCustomerContractRequestModel value) {
        return new JAXBElement<ActivateCustomerContractRequestModel>(_SuspendAccountRequest_QNAME, ActivateCustomerContractRequestModel.class, ActivateCustomerContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStockItemStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "FaultyStockItemsResult", scope = FaultyStockItemsResponse.class)
    public JAXBElement<ChangeStockItemStatusResponseModel> createFaultyStockItemsResponseFaultyStockItemsResult(ChangeStockItemStatusResponseModel value) {
        return new JAXBElement<ChangeStockItemStatusResponseModel>(_FaultyStockItemsResponseFaultyStockItemsResult_QNAME, ChangeStockItemStatusResponseModel.class, FaultyStockItemsResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SerialNumber", scope = RemoveVoipDeviceRequestModel.class)
    public JAXBElement<String> createRemoveVoipDeviceRequestModelSerialNumber(String value) {
        return new JAXBElement<String>(_QueryStockItemRequestModelSerialNumber_QNAME, String.class, RemoveVoipDeviceRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Mac", scope = RemoveVoipDeviceRequestModel.class)
    public JAXBElement<String> createRemoveVoipDeviceRequestModelMac(String value) {
        return new JAXBElement<String>(_AddNumbersToVoipDeviceRequestModelMac_QNAME, String.class, RemoveVoipDeviceRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SerialNumber", scope = ChangeStockItemStatusRequestModel.class)
    public JAXBElement<String> createChangeStockItemStatusRequestModelSerialNumber(String value) {
        return new JAXBElement<String>(_QueryStockItemRequestModelSerialNumber_QNAME, String.class, ChangeStockItemStatusRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Description", scope = ChangeStockItemStatusRequestModel.class)
    public JAXBElement<String> createChangeStockItemStatusRequestModelDescription(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelDescription_QNAME, String.class, ChangeStockItemStatusRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Username", scope = ChangeStockItemStatusRequestModel.class)
    public JAXBElement<String> createChangeStockItemStatusRequestModelUsername(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelUsername_QNAME, String.class, ChangeStockItemStatusRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "IdentificationNumber", scope = ChangeStockItemStatusRequestModel.class)
    public JAXBElement<String> createChangeStockItemStatusRequestModelIdentificationNumber(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelIdentificationNumber_QNAME, String.class, ChangeStockItemStatusRequestModel.class, value);
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
        return new JAXBElement<ArrayOfContractedNumber>(_ContractedNumbersInfoNumbers_QNAME, ArrayOfContractedNumber.class, ContractedNumbersInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Note", scope = ContractedNumbersInfo.class)
    public JAXBElement<String> createContractedNumbersInfoNote(String value) {
        return new JAXBElement<String>(_ContractedNumbersInfoNote_QNAME, String.class, ContractedNumbersInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplaceStockInfoInContractResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ReplaceStockInfoInContractResult", scope = ReplaceStockInfoInContractResponse.class)
    public JAXBElement<ReplaceStockInfoInContractResponseModel> createReplaceStockInfoInContractResponseReplaceStockInfoInContractResult(ReplaceStockInfoInContractResponseModel value) {
        return new JAXBElement<ReplaceStockInfoInContractResponseModel>(_ReplaceStockInfoInContractResponseReplaceStockInfoInContractResult_QNAME, ReplaceStockInfoInContractResponseModel.class, ReplaceStockInfoInContractResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractedNumbersInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "NumbersInfo", scope = AddNumbersToContractRequestModel.class)
    public JAXBElement<ContractedNumbersInfo> createAddNumbersToContractRequestModelNumbersInfo(ContractedNumbersInfo value) {
        return new JAXBElement<ContractedNumbersInfo>(_AddNumbersToContractRequestModelNumbersInfo_QNAME, ContractedNumbersInfo.class, AddNumbersToContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSaleAvailabilityResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetSaleAvailabilityResult", scope = GetSaleAvailabilityResponse.class)
    public JAXBElement<GetSaleAvailabilityResponseModel> createGetSaleAvailabilityResponseGetSaleAvailabilityResult(GetSaleAvailabilityResponseModel value) {
        return new JAXBElement<GetSaleAvailabilityResponseModel>(_GetSaleAvailabilityResponseGetSaleAvailabilityResult_QNAME, GetSaleAvailabilityResponseModel.class, GetSaleAvailabilityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Number", scope = QueryNumberPoolItemRequestModel.class)
    public JAXBElement<String> createQueryNumberPoolItemRequestModelNumber(String value) {
        return new JAXBElement<String>(_ReserveNumberPoolItemRequestModelNumber_QNAME, String.class, QueryNumberPoolItemRequestModel.class, value);
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
        return new JAXBElement<String>(_SuspendAccountRequestModelStatus_QNAME, String.class, ActivateCustomerContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "StatusReasonDef", scope = ActivateCustomerContractRequestModel.class)
    public JAXBElement<String> createActivateCustomerContractRequestModelStatusReasonDef(String value) {
        return new JAXBElement<String>(_SuspendAccountRequestModelStatusReasonDef_QNAME, String.class, ActivateCustomerContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Application", scope = ActivateCustomerContractRequestModel.class)
    public JAXBElement<String> createActivateCustomerContractRequestModelApplication(String value) {
        return new JAXBElement<String>(_RemovePoolRequestModelApplication_QNAME, String.class, ActivateCustomerContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UserName", scope = ActivateCustomerContractRequestModel.class)
    public JAXBElement<String> createActivateCustomerContractRequestModelUserName(String value) {
        return new JAXBElement<String>(_RemovePoolRequestModelUserName_QNAME, String.class, ActivateCustomerContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "BillingContractNo", scope = ActivateCustomerContractRequestModel.class)
    public JAXBElement<String> createActivateCustomerContractRequestModelBillingContractNo(String value) {
        return new JAXBElement<String>(_ActivateCustomerContractRequestModelBillingContractNo_QNAME, String.class, ActivateCustomerContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SerialNumber", scope = ReleaseNumbersOfVoipDeviceRequestModel.class)
    public JAXBElement<String> createReleaseNumbersOfVoipDeviceRequestModelSerialNumber(String value) {
        return new JAXBElement<String>(_QueryStockItemRequestModelSerialNumber_QNAME, String.class, ReleaseNumbersOfVoipDeviceRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Mac", scope = ReleaseNumbersOfVoipDeviceRequestModel.class)
    public JAXBElement<String> createReleaseNumbersOfVoipDeviceRequestModelMac(String value) {
        return new JAXBElement<String>(_AddNumbersToVoipDeviceRequestModelMac_QNAME, String.class, ReleaseNumbersOfVoipDeviceRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "PhoneNumbers", scope = ReleaseNumbersOfVoipDeviceRequestModel.class)
    public JAXBElement<ArrayOfstring> createReleaseNumbersOfVoipDeviceRequestModelPhoneNumbers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_AddNumbersToVoipDeviceRequestModelPhoneNumbers_QNAME, ArrayOfstring.class, ReleaseNumbersOfVoipDeviceRequestModel.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmCustomerMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "CrmCustomerMessageType", scope = QueryCustomerStatusResponseModel.class)
    public JAXBElement<ArrayOfCrmCustomerMessageType> createQueryCustomerStatusResponseModelCrmCustomerMessageType(ArrayOfCrmCustomerMessageType value) {
        return new JAXBElement<ArrayOfCrmCustomerMessageType>(_QueryCustomerStatusResponseModelCrmCustomerMessageType_QNAME, ArrayOfCrmCustomerMessageType.class, QueryCustomerStatusResponseModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessProcessRequestResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ProcessRequestResult", scope = ProcessRequestResponse.class)
    public JAXBElement<ProcessProcessRequestResponseModel> createProcessRequestResponseProcessRequestResult(ProcessProcessRequestResponseModel value) {
        return new JAXBElement<ProcessProcessRequestResponseModel>(_ProcessRequestResponseProcessRequestResult_QNAME, ProcessProcessRequestResponseModel.class, ProcessRequestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStockItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "StockItems", scope = ListStockItemResponseModel.class)
    public JAXBElement<ArrayOfStockItem> createListStockItemResponseModelStockItems(ArrayOfStockItem value) {
        return new JAXBElement<ArrayOfStockItem>(_StockItemsResponseModelStockItems_QNAME, ArrayOfStockItem.class, ListStockItemResponseModel.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDealerStokRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = GetDealerStocks.class)
    public JAXBElement<GetDealerStokRequestModel> createGetDealerStocksRequest(GetDealerStokRequestModel value) {
        return new JAXBElement<GetDealerStokRequestModel>(_SuspendAccountRequest_QNAME, GetDealerStokRequestModel.class, GetDealerStocks.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStockItemStatusRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = SetStockItemStatusAssignedBilled.class)
    public JAXBElement<ChangeStockItemStatusRequestModel> createSetStockItemStatusAssignedBilledRequest(ChangeStockItemStatusRequestModel value) {
        return new JAXBElement<ChangeStockItemStatusRequestModel>(_SuspendAccountRequest_QNAME, ChangeStockItemStatusRequestModel.class, SetStockItemStatusAssignedBilled.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryCustomerStatusRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = QueryCustomerStatus.class)
    public JAXBElement<QueryCustomerStatusRequestModel> createQueryCustomerStatusRequest(QueryCustomerStatusRequestModel value) {
        return new JAXBElement<QueryCustomerStatusRequestModel>(_SuspendAccountRequest_QNAME, QueryCustomerStatusRequestModel.class, QueryCustomerStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRMProvisionResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ProvisionOrderItemToCRMResult", scope = ProvisionOrderItemToCRMResponse.class)
    public JAXBElement<CRMProvisionResponseModel> createProvisionOrderItemToCRMResponseProvisionOrderItemToCRMResult(CRMProvisionResponseModel value) {
        return new JAXBElement<CRMProvisionResponseModel>(_ProvisionOrderItemToCRMResponseProvisionOrderItemToCRMResult_QNAME, CRMProvisionResponseModel.class, ProvisionOrderItemToCRMResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Message", scope = ReplaceStockInfoDeviceProductResponseModel.class)
    public JAXBElement<String> createReplaceStockInfoDeviceProductResponseModelMessage(String value) {
        return new JAXBElement<String>(_ReplaceStockInfoInContractResponseModelMessage_QNAME, String.class, ReplaceStockInfoDeviceProductResponseModel.class, value);
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
        return new JAXBElement<String>(_CustomerFullName_QNAME, String.class, User.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "QueryLimit", scope = User.class)
    public JAXBElement<Integer> createUserQueryLimit(Integer value) {
        return new JAXBElement<Integer>(_UserQueryLimit_QNAME, Integer.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateContractDeactivationResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ValidateContractDeactivationResult", scope = ValidateContractDeactivationResponse.class)
    public JAXBElement<ValidateContractDeactivationResponseModel> createValidateContractDeactivationResponseValidateContractDeactivationResult(ValidateContractDeactivationResponseModel value) {
        return new JAXBElement<ValidateContractDeactivationResponseModel>(_ValidateContractDeactivationResponseValidateContractDeactivationResult_QNAME, ValidateContractDeactivationResponseModel.class, ValidateContractDeactivationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "DeviceSeriNo", scope = AddVoipDeviceWithProcessRequestModel.class)
    public JAXBElement<String> createAddVoipDeviceWithProcessRequestModelDeviceSeriNo(String value) {
        return new JAXBElement<String>(_AddVoipDeviceWithProcessRequestModelDeviceSeriNo_QNAME, String.class, AddVoipDeviceWithProcessRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Document", scope = AddVoipDeviceWithProcessRequestModel.class)
    public JAXBElement<DocumentInfo> createAddVoipDeviceWithProcessRequestModelDocument(DocumentInfo value) {
        return new JAXBElement<DocumentInfo>(_AddVoipDeviceWithProcessRequestModelDocument_QNAME, DocumentInfo.class, AddVoipDeviceWithProcessRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Application", scope = AddVoipDeviceWithProcessRequestModel.class)
    public JAXBElement<String> createAddVoipDeviceWithProcessRequestModelApplication(String value) {
        return new JAXBElement<String>(_RemovePoolRequestModelApplication_QNAME, String.class, AddVoipDeviceWithProcessRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Numbers", scope = AddVoipDeviceWithProcessRequestModel.class)
    public JAXBElement<ArrayOfguid> createAddVoipDeviceWithProcessRequestModelNumbers(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_CheckMillenifonGsmNumbersResponseModelNumbers_QNAME, ArrayOfguid.class, AddVoipDeviceWithProcessRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBulutSantralNumbersByBillingContractNoResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetBulutSantralNumbersByBillingContractNoResult", scope = GetBulutSantralNumbersByBillingContractNoResponse.class)
    public JAXBElement<GetBulutSantralNumbersByBillingContractNoResponseModel> createGetBulutSantralNumbersByBillingContractNoResponseGetBulutSantralNumbersByBillingContractNoResult(GetBulutSantralNumbersByBillingContractNoResponseModel value) {
        return new JAXBElement<GetBulutSantralNumbersByBillingContractNoResponseModel>(_GetBulutSantralNumbersByBillingContractNoResponseGetBulutSantralNumbersByBillingContractNoResult_QNAME, GetBulutSantralNumbersByBillingContractNoResponseModel.class, GetBulutSantralNumbersByBillingContractNoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Description", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductDescription(String value) {
        return new JAXBElement<String>(_CrmCustomerMessageTypeDescription_QNAME, String.class, CrmProduct.class, value);
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
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Name", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductName(String value) {
        return new JAXBElement<String>(_CrmContactName_QNAME, String.class, CrmProduct.class, value);
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
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ModelName", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductModelName(String value) {
        return new JAXBElement<String>(_StockItemModelName_QNAME, String.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrmNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Numbers", scope = CrmProduct.class)
    public JAXBElement<ArrayOfCrmNumber> createCrmProductNumbers(ArrayOfCrmNumber value) {
        return new JAXBElement<ArrayOfCrmNumber>(_ContractedNumbersInfoNumbers_QNAME, ArrayOfCrmNumber.class, CrmProduct.class, value);
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
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "BrandName", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductBrandName(String value) {
        return new JAXBElement<String>(_StockItemBrandName_QNAME, String.class, CrmProduct.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ValidFrom", scope = CrmProduct.class)
    public JAXBElement<XMLGregorianCalendar> createCrmProductValidFrom(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CrmAccountValidFrom_QNAME, XMLGregorianCalendar.class, CrmProduct.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ShipmentAddress", scope = CrmProduct.class)
    public JAXBElement<CrmAddress> createCrmProductShipmentAddress(CrmAddress value) {
        return new JAXBElement<CrmAddress>(_CrmAccountShipmentAddress_QNAME, CrmAddress.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Code", scope = CrmProduct.class)
    public JAXBElement<String> createCrmProductCode(String value) {
        return new JAXBElement<String>(_CrmCustomerMessageTypeCode_QNAME, String.class, CrmProduct.class, value);
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
        return new JAXBElement<String>(_StockItemSerialNumber_QNAME, String.class, CrmProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "InstallmentAddress", scope = CrmProduct.class)
    public JAXBElement<CrmAddress> createCrmProductInstallmentAddress(CrmAddress value) {
        return new JAXBElement<CrmAddress>(_CrmAccountInstallmentAddress_QNAME, CrmAddress.class, CrmProduct.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "ValidTo", scope = CrmProduct.class)
    public JAXBElement<XMLGregorianCalendar> createCrmProductValidTo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CrmAccountValidTo_QNAME, XMLGregorianCalendar.class, CrmProduct.class, value);
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
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "OrderRequestCode", scope = CRMProvisionRequestModel.class)
    public JAXBElement<String> createCRMProvisionRequestModelOrderRequestCode(String value) {
        return new JAXBElement<String>(_CRMProvisionRequestModelOrderRequestCode_QNAME, String.class, CRMProvisionRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Status", scope = ActivateAccountRequestModel.class)
    public JAXBElement<String> createActivateAccountRequestModelStatus(String value) {
        return new JAXBElement<String>(_SuspendAccountRequestModelStatus_QNAME, String.class, ActivateAccountRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Document", scope = ActivateAccountRequestModel.class)
    public JAXBElement<DocumentInfo> createActivateAccountRequestModelDocument(DocumentInfo value) {
        return new JAXBElement<DocumentInfo>(_AddVoipDeviceWithProcessRequestModelDocument_QNAME, DocumentInfo.class, ActivateAccountRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "StatusReasonDef", scope = ActivateAccountRequestModel.class)
    public JAXBElement<String> createActivateAccountRequestModelStatusReasonDef(String value) {
        return new JAXBElement<String>(_SuspendAccountRequestModelStatusReasonDef_QNAME, String.class, ActivateAccountRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Application", scope = ActivateAccountRequestModel.class)
    public JAXBElement<String> createActivateAccountRequestModelApplication(String value) {
        return new JAXBElement<String>(_RemovePoolRequestModelApplication_QNAME, String.class, ActivateAccountRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UserName", scope = ActivateAccountRequestModel.class)
    public JAXBElement<String> createActivateAccountRequestModelUserName(String value) {
        return new JAXBElement<String>(_RemovePoolRequestModelUserName_QNAME, String.class, ActivateAccountRequestModel.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Amount", scope = CrmPoolItem.class)
    public JAXBElement<String> createCrmPoolItemAmount(String value) {
        return new JAXBElement<String>(_CrmPoolItemAmount_QNAME, String.class, CrmPoolItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "BillingId", scope = CrmPoolItem.class)
    public JAXBElement<String> createCrmPoolItemBillingId(String value) {
        return new JAXBElement<String>(_CrmPoolBillingId_QNAME, String.class, CrmPoolItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Account", scope = CrmPoolItem.class)
    public JAXBElement<CrmAccount> createCrmPoolItemAccount(CrmAccount value) {
        return new JAXBElement<CrmAccount>(_CrmPoolItemAccount_QNAME, CrmAccount.class, CrmPoolItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "FreeUnitId", scope = CrmPoolItem.class)
    public JAXBElement<String> createCrmPoolItemFreeUnitId(String value) {
        return new JAXBElement<String>(_CrmPoolItemFreeUnitId_QNAME, String.class, CrmPoolItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrmContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "Contract", scope = CrmPoolItem.class)
    public JAXBElement<CrmContract> createCrmPoolItemContract(CrmContract value) {
        return new JAXBElement<CrmContract>(_CrmPoolItemContract_QNAME, CrmContract.class, CrmPoolItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseNumbersOfVoipDeviceResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ReleaseNumbersOfVoipDeviceResult", scope = ReleaseNumbersOfVoipDeviceResponse.class)
    public JAXBElement<ReleaseNumbersOfVoipDeviceResponseModel> createReleaseNumbersOfVoipDeviceResponseReleaseNumbersOfVoipDeviceResult(ReleaseNumbersOfVoipDeviceResponseModel value) {
        return new JAXBElement<ReleaseNumbersOfVoipDeviceResponseModel>(_ReleaseNumbersOfVoipDeviceResponseReleaseNumbersOfVoipDeviceResult_QNAME, ReleaseNumbersOfVoipDeviceResponseModel.class, ReleaseNumbersOfVoipDeviceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMillenifonNumberResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AddMillenifonNumberResult", scope = AddMillenifonNumberResponse.class)
    public JAXBElement<AddMillenifonNumberResponseModel> createAddMillenifonNumberResponseAddMillenifonNumberResult(AddMillenifonNumberResponseModel value) {
        return new JAXBElement<AddMillenifonNumberResponseModel>(_AddMillenifonNumberResponseAddMillenifonNumberResult_QNAME, AddMillenifonNumberResponseModel.class, AddMillenifonNumberResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateContractDeactivationRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ValidateContractDeactivation.class)
    public JAXBElement<ValidateContractDeactivationRequestModel> createValidateContractDeactivationRequest(ValidateContractDeactivationRequestModel value) {
        return new JAXBElement<ValidateContractDeactivationRequestModel>(_SuspendAccountRequest_QNAME, ValidateContractDeactivationRequestModel.class, ValidateContractDeactivation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelProcessRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = CancelProcess.class)
    public JAXBElement<CancelProcessRequestModel> createCancelProcessRequest(CancelProcessRequestModel value) {
        return new JAXBElement<CancelProcessRequestModel>(_SuspendAccountRequest_QNAME, CancelProcessRequestModel.class, CancelProcess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuspendCustomerContractRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = SuspendCustomerContract.class)
    public JAXBElement<SuspendCustomerContractRequestModel> createSuspendCustomerContractRequest(SuspendCustomerContractRequestModel value) {
        return new JAXBElement<SuspendCustomerContractRequestModel>(_SuspendAccountRequest_QNAME, SuspendCustomerContractRequestModel.class, SuspendCustomerContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRMProvisionRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ProvisionOrderItemToCRM.class)
    public JAXBElement<CRMProvisionRequestModel> createProvisionOrderItemToCRMRequest(CRMProvisionRequestModel value) {
        return new JAXBElement<CRMProvisionRequestModel>(_SuspendAccountRequest_QNAME, CRMProvisionRequestModel.class, ProvisionOrderItemToCRM.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Number", scope = ReleaseNumberPoolItemRequestModel.class)
    public JAXBElement<String> createReleaseNumberPoolItemRequestModelNumber(String value) {
        return new JAXBElement<String>(_ReserveNumberPoolItemRequestModelNumber_QNAME, String.class, ReleaseNumberPoolItemRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Username", scope = ReleaseNumberPoolItemRequestModel.class)
    public JAXBElement<String> createReleaseNumberPoolItemRequestModelUsername(String value) {
        return new JAXBElement<String>(_AssignStockItemRequestModelUsername_QNAME, String.class, ReleaseNumberPoolItemRequestModel.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Organisation", scope = GetDealerStokRequestModel.class)
    public JAXBElement<String> createGetDealerStokRequestModelOrganisation(String value) {
        return new JAXBElement<String>(_GetDealerStokRequestModelOrganisation_QNAME, String.class, GetDealerStokRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", name = "Name", scope = CrmWebAddress.class)
    public JAXBElement<String> createCrmWebAddressName(String value) {
        return new JAXBElement<String>(_CrmPhoneName_QNAME, String.class, CrmWebAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SerialNumber", scope = BulutSantralVoipDevice.class)
    public JAXBElement<String> createBulutSantralVoipDeviceSerialNumber(String value) {
        return new JAXBElement<String>(_QueryStockItemRequestModelSerialNumber_QNAME, String.class, BulutSantralVoipDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "PortaoneAccoutId", scope = BulutSantralVoipDevice.class)
    public JAXBElement<String> createBulutSantralVoipDevicePortaoneAccoutId(String value) {
        return new JAXBElement<String>(_BulutSantralNumbersPortaoneAccoutId_QNAME, String.class, BulutSantralVoipDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "OfferId", scope = BulutSantralVoipDevice.class)
    public JAXBElement<String> createBulutSantralVoipDeviceOfferId(String value) {
        return new JAXBElement<String>(_BulutSantralVoipDeviceOfferId_QNAME, String.class, BulutSantralVoipDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ModelName", scope = BulutSantralVoipDevice.class)
    public JAXBElement<String> createBulutSantralVoipDeviceModelName(String value) {
        return new JAXBElement<String>(_BulutSantralVoipDeviceModelName_QNAME, String.class, BulutSantralVoipDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "PortaoneKey", scope = BulutSantralVoipDevice.class)
    public JAXBElement<String> createBulutSantralVoipDevicePortaoneKey(String value) {
        return new JAXBElement<String>(_BulutSantralVoipDevicePortaoneKey_QNAME, String.class, BulutSantralVoipDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "FxoPortCount", scope = BulutSantralVoipDevice.class)
    public JAXBElement<String> createBulutSantralVoipDeviceFxoPortCount(String value) {
        return new JAXBElement<String>(_BulutSantralVoipDeviceFxoPortCount_QNAME, String.class, BulutSantralVoipDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "MACAdress", scope = BulutSantralVoipDevice.class)
    public JAXBElement<String> createBulutSantralVoipDeviceMACAdress(String value) {
        return new JAXBElement<String>(_BulutSantralVoipDeviceMACAdress_QNAME, String.class, BulutSantralVoipDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "BrandName", scope = BulutSantralVoipDevice.class)
    public JAXBElement<String> createBulutSantralVoipDeviceBrandName(String value) {
        return new JAXBElement<String>(_BulutSantralVoipDeviceBrandName_QNAME, String.class, BulutSantralVoipDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "FxsPortCount", scope = BulutSantralVoipDevice.class)
    public JAXBElement<String> createBulutSantralVoipDeviceFxsPortCount(String value) {
        return new JAXBElement<String>(_BulutSantralVoipDeviceFxsPortCount_QNAME, String.class, BulutSantralVoipDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStockItemStatusResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "AssignStockItemsResult", scope = AssignStockItemsResponse.class)
    public JAXBElement<ChangeStockItemStatusResponseModel> createAssignStockItemsResponseAssignStockItemsResult(ChangeStockItemStatusResponseModel value) {
        return new JAXBElement<ChangeStockItemStatusResponseModel>(_AssignStockItemsResponseAssignStockItemsResult_QNAME, ChangeStockItemStatusResponseModel.class, AssignStockItemsResponse.class, value);
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
        return new JAXBElement<String>(_CrmNumberNumber_QNAME, String.class, NumberPoolItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckMillenifonGsmNumbersRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = CheckMillenifonGsmNumbers.class)
    public JAXBElement<CheckMillenifonGsmNumbersRequestModel> createCheckMillenifonGsmNumbersRequest(CheckMillenifonGsmNumbersRequestModel value) {
        return new JAXBElement<CheckMillenifonGsmNumbersRequestModel>(_SuspendAccountRequest_QNAME, CheckMillenifonGsmNumbersRequestModel.class, CheckMillenifonGsmNumbers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStockItemOuidRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = QueryStockItemOuid.class)
    public JAXBElement<QueryStockItemOuidRequestModel> createQueryStockItemOuidRequest(QueryStockItemOuidRequestModel value) {
        return new JAXBElement<QueryStockItemOuidRequestModel>(_SuspendAccountRequest_QNAME, QueryStockItemOuidRequestModel.class, QueryStockItemOuid.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UpdateUserId", scope = UpdateDealerStokStatusRequestModel.class)
    public JAXBElement<String> createUpdateDealerStokStatusRequestModelUpdateUserId(String value) {
        return new JAXBElement<String>(_UpdateDealerStokStatusRequestModelUpdateUserId_QNAME, String.class, UpdateDealerStokStatusRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "SerialNoList", scope = UpdateDealerStokStatusRequestModel.class)
    public JAXBElement<ArrayOfstring> createUpdateDealerStokStatusRequestModelSerialNoList(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_UpdateDealerStokStatusRequestModelSerialNoList_QNAME, ArrayOfstring.class, UpdateDealerStokStatusRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Organisation", scope = UpdateDealerStokStatusRequestModel.class)
    public JAXBElement<String> createUpdateDealerStokStatusRequestModelOrganisation(String value) {
        return new JAXBElement<String>(_GetDealerStokRequestModelOrganisation_QNAME, String.class, UpdateDealerStokStatusRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "StockItemIdList", scope = UpdateDealerStokStatusRequestModel.class)
    public JAXBElement<ArrayOfguid> createUpdateDealerStokStatusRequestModelStockItemIdList(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_UpdateDealerStokStatusRequestModelStockItemIdList_QNAME, ArrayOfguid.class, UpdateDealerStokStatusRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Url", scope = DocumentInfo.class)
    public JAXBElement<String> createDocumentInfoUrl(String value) {
        return new JAXBElement<String>(_DocumentInfoUrl_QNAME, String.class, DocumentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Code", scope = DocumentInfo.class)
    public JAXBElement<String> createDocumentInfoCode(String value) {
        return new JAXBElement<String>(_DocumentInfoCode_QNAME, String.class, DocumentInfo.class, value);
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
        return new JAXBElement<String>(_SuspendAccountRequestModelStatus_QNAME, String.class, SuspendCustomerContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "StatusReasonDef", scope = SuspendCustomerContractRequestModel.class)
    public JAXBElement<String> createSuspendCustomerContractRequestModelStatusReasonDef(String value) {
        return new JAXBElement<String>(_SuspendAccountRequestModelStatusReasonDef_QNAME, String.class, SuspendCustomerContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Application", scope = SuspendCustomerContractRequestModel.class)
    public JAXBElement<String> createSuspendCustomerContractRequestModelApplication(String value) {
        return new JAXBElement<String>(_RemovePoolRequestModelApplication_QNAME, String.class, SuspendCustomerContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UserName", scope = SuspendCustomerContractRequestModel.class)
    public JAXBElement<String> createSuspendCustomerContractRequestModelUserName(String value) {
        return new JAXBElement<String>(_RemovePoolRequestModelUserName_QNAME, String.class, SuspendCustomerContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "BillingContractNo", scope = SuspendCustomerContractRequestModel.class)
    public JAXBElement<String> createSuspendCustomerContractRequestModelBillingContractNo(String value) {
        return new JAXBElement<String>(_ActivateCustomerContractRequestModelBillingContractNo_QNAME, String.class, SuspendCustomerContractRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignNumberPoolItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = AssignNumberPoolItem.class)
    public JAXBElement<AssignNumberPoolItemRequestModel> createAssignNumberPoolItemRequest(AssignNumberPoolItemRequestModel value) {
        return new JAXBElement<AssignNumberPoolItemRequestModel>(_SuspendAccountRequest_QNAME, AssignNumberPoolItemRequestModel.class, AssignNumberPoolItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStockItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = QueryStockItem.class)
    public JAXBElement<QueryStockItemRequestModel> createQueryStockItemRequest(QueryStockItemRequestModel value) {
        return new JAXBElement<QueryStockItemRequestModel>(_SuspendAccountRequest_QNAME, QueryStockItemRequestModel.class, QueryStockItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", name = "ApplicationName", scope = SellVoiceRecordRequestModel.class)
    public JAXBElement<String> createSellVoiceRecordRequestModelApplicationName(String value) {
        return new JAXBElement<String>(_AddMillenifonNumberRequestModelApplicationName_QNAME, String.class, SellVoiceRecordRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumbersFromPoolRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = GetNumbersFromPool.class)
    public JAXBElement<GetNumbersFromPoolRequestModel> createGetNumbersFromPoolRequest(GetNumbersFromPoolRequestModel value) {
        return new JAXBElement<GetNumbersFromPoolRequestModel>(_SuspendAccountRequest_QNAME, GetNumbersFromPoolRequestModel.class, GetNumbersFromPool.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ICustomer", scope = GetRemaingFreeUnitUsageByPhoneNumberRequestModel.class)
    public JAXBElement<String> createGetRemaingFreeUnitUsageByPhoneNumberRequestModelICustomer(String value) {
        return new JAXBElement<String>(_GetRemaingFreeUnitUsageByPhoneNumberRequestModelICustomer_QNAME, String.class, GetRemaingFreeUnitUsageByPhoneNumberRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "PhoneNumber", scope = GetRemaingFreeUnitUsageByPhoneNumberRequestModel.class)
    public JAXBElement<String> createGetRemaingFreeUnitUsageByPhoneNumberRequestModelPhoneNumber(String value) {
        return new JAXBElement<String>(_GetRemaingFreeUnitUsageByPhoneNumberRequestModelPhoneNumber_QNAME, String.class, GetRemaingFreeUnitUsageByPhoneNumberRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateAccountDeactivationResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ValidateAccountDeactivationResult", scope = ValidateAccountDeactivationResponse.class)
    public JAXBElement<ValidateAccountDeactivationResponseModel> createValidateAccountDeactivationResponseValidateAccountDeactivationResult(ValidateAccountDeactivationResponseModel value) {
        return new JAXBElement<ValidateAccountDeactivationResponseModel>(_ValidateAccountDeactivationResponseValidateAccountDeactivationResult_QNAME, ValidateAccountDeactivationResponseModel.class, ValidateAccountDeactivationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://milleni.com/Crm", name = "FatherName", scope = CrmReturnAccount.class)
    public JAXBElement<String> createCrmReturnAccountFatherName(String value) {
        return new JAXBElement<String>(_CustomerFatherName_QNAME, String.class, CrmReturnAccount.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SellVoiceRecordRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = SellVoiceRecord.class)
    public JAXBElement<SellVoiceRecordRequestModel> createSellVoiceRecordRequest(SellVoiceRecordRequestModel value) {
        return new JAXBElement<SellVoiceRecordRequestModel>(_SuspendAccountRequest_QNAME, SellVoiceRecordRequestModel.class, SellVoiceRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "Application", scope = AddPoolItemsRequestModel.class)
    public JAXBElement<String> createAddPoolItemsRequestModelApplication(String value) {
        return new JAXBElement<String>(_RemovePoolRequestModelApplication_QNAME, String.class, AddPoolItemsRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "PoolId", scope = AddPoolItemsRequestModel.class)
    public JAXBElement<String> createAddPoolItemsRequestModelPoolId(String value) {
        return new JAXBElement<String>(_AddPoolItemsRequestModelPoolId_QNAME, String.class, AddPoolItemsRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "UserName", scope = AddPoolItemsRequestModel.class)
    public JAXBElement<String> createAddPoolItemsRequestModelUserName(String value) {
        return new JAXBElement<String>(_RemovePoolRequestModelUserName_QNAME, String.class, AddPoolItemsRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "ContractIds", scope = AddPoolItemsRequestModel.class)
    public JAXBElement<ArrayOfguid> createAddPoolItemsRequestModelContractIds(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_AddPoolItemsRequestModelContractIds_QNAME, ArrayOfguid.class, AddPoolItemsRequestModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseNumberPoolItemRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ReleaseNumberPoolItem.class)
    public JAXBElement<ReleaseNumberPoolItemRequestModel> createReleaseNumberPoolItemRequest(ReleaseNumberPoolItemRequestModel value) {
        return new JAXBElement<ReleaseNumberPoolItemRequestModel>(_SuspendAccountRequest_QNAME, ReleaseNumberPoolItemRequestModel.class, ReleaseNumberPoolItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockItemsResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "GetCustomerStockItemsResult", scope = GetCustomerStockItemsResponse.class)
    public JAXBElement<StockItemsResponseModel> createGetCustomerStockItemsResponseGetCustomerStockItemsResult(StockItemsResponseModel value) {
        return new JAXBElement<StockItemsResponseModel>(_GetCustomerStockItemsResponseGetCustomerStockItemsResult_QNAME, StockItemsResponseModel.class, GetCustomerStockItemsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNumbersToContractRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = AddNumbersToContract.class)
    public JAXBElement<AddNumbersToContractRequestModel> createAddNumbersToContractRequest(AddNumbersToContractRequestModel value) {
        return new JAXBElement<AddNumbersToContractRequestModel>(_SuspendAccountRequest_QNAME, AddNumbersToContractRequestModel.class, AddNumbersToContract.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRMProvisionRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = CrmDocumentUpdateAfterSetup.class)
    public JAXBElement<CRMProvisionRequestModel> createCrmDocumentUpdateAfterSetupRequest(CRMProvisionRequestModel value) {
        return new JAXBElement<CRMProvisionRequestModel>(_SuspendAccountRequest_QNAME, CRMProvisionRequestModel.class, CrmDocumentUpdateAfterSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBulutSantralNumbersByBillingContractNoRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = GetBulutSantralNumbersByBillingContractNo.class)
    public JAXBElement<GetBulutSantralNumbersByBillingContractNoRequestModel> createGetBulutSantralNumbersByBillingContractNoRequest(GetBulutSantralNumbersByBillingContractNoRequestModel value) {
        return new JAXBElement<GetBulutSantralNumbersByBillingContractNoRequestModel>(_SuspendAccountRequest_QNAME, GetBulutSantralNumbersByBillingContractNoRequestModel.class, GetBulutSantralNumbersByBillingContractNo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryOpenOrdersForDevicesResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "QueryOpenOrdersForDevicesResult", scope = QueryOpenOrdersForDevicesResponse.class)
    public JAXBElement<QueryOpenOrdersForDevicesResponseModel> createQueryOpenOrdersForDevicesResponseQueryOpenOrdersForDevicesResult(QueryOpenOrdersForDevicesResponseModel value) {
        return new JAXBElement<QueryOpenOrdersForDevicesResponseModel>(_QueryOpenOrdersForDevicesResponseQueryOpenOrdersForDevicesResult_QNAME, QueryOpenOrdersForDevicesResponseModel.class, QueryOpenOrdersForDevicesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateAccountDeactivationRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = ValidateAccountDeactivation.class)
    public JAXBElement<ValidateAccountDeactivationRequestModel> createValidateAccountDeactivationRequest(ValidateAccountDeactivationRequestModel value) {
        return new JAXBElement<ValidateAccountDeactivationRequestModel>(_SuspendAccountRequest_QNAME, ValidateAccountDeactivationRequestModel.class, ValidateAccountDeactivation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStockItemByStateRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/CustomerInfo/Service/v1", name = "request", scope = QueryStockItemByState.class)
    public JAXBElement<QueryStockItemByStateRequestModel> createQueryStockItemByStateRequest(QueryStockItemByStateRequestModel value) {
        return new JAXBElement<QueryStockItemByStateRequestModel>(_SuspendAccountRequest_QNAME, QueryStockItemByStateRequestModel.class, QueryStockItemByState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", name = "Name", scope = CrmEmail.class)
    public JAXBElement<String> createCrmEmailName(String value) {
        return new JAXBElement<String>(_CrmPhoneName_QNAME, String.class, CrmEmail.class, value);
    }

}
