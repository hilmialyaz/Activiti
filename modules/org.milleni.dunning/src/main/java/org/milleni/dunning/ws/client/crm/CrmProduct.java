
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CrmProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrmProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillingProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CatalogId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CatalogName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Documents" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm}ArrayOfCrmDocument" minOccurs="0"/>
 *         &lt;element name="ExchangeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HasStaticIpRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid"/>
 *         &lt;element name="InternetProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MProductType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Numbers" type="{http://milleni.com/Crm}ArrayOfCrmNumber" minOccurs="0"/>
 *         &lt;element name="PcOfferId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StaticIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StaticIpProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StatusReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SubModelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TTCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="XdslNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XdslPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XdslUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrmProduct", namespace = "http://milleni.com/Crm", propOrder = {
    "billingProductId",
    "brandName",
    "catalogId",
    "catalogName",
    "code",
    "description",
    "documents",
    "exchangeType",
    "hasStaticIpRequest",
    "id",
    "internetProfile",
    "mProductType",
    "macAddress",
    "modelName",
    "name",
    "numbers",
    "pcOfferId",
    "productType",
    "serialNumber",
    "staticIp",
    "staticIpProductId",
    "status",
    "statusReason",
    "subModelName",
    "ttCustomerId",
    "validFrom",
    "validTo",
    "xdslNumber",
    "xdslPassword",
    "xdslUsername"
})
public class CrmProduct {

    @XmlElementRef(name = "BillingProductId", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> billingProductId;
    @XmlElementRef(name = "BrandName", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> brandName;
    @XmlElementRef(name = "CatalogId", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> catalogId;
    @XmlElementRef(name = "CatalogName", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> catalogName;
    @XmlElementRef(name = "Code", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> code;
    @XmlElementRef(name = "Description", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Documents", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCrmDocument> documents;
    @XmlElement(name = "ExchangeType")
    protected Integer exchangeType;
    @XmlElement(name = "HasStaticIpRequest")
    protected Boolean hasStaticIpRequest;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElementRef(name = "InternetProfile", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> internetProfile;
    @XmlElement(name = "MProductType")
    protected Integer mProductType;
    @XmlElementRef(name = "MacAddress", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> macAddress;
    @XmlElementRef(name = "ModelName", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> modelName;
    @XmlElementRef(name = "Name", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Numbers", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCrmNumber> numbers;
    @XmlElementRef(name = "PcOfferId", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> pcOfferId;
    @XmlElementRef(name = "ProductType", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> productType;
    @XmlElementRef(name = "SerialNumber", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> serialNumber;
    @XmlElementRef(name = "StaticIp", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> staticIp;
    @XmlElementRef(name = "StaticIpProductId", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> staticIpProductId;
    @XmlElement(name = "Status")
    protected Integer status;
    @XmlElement(name = "StatusReason")
    protected Integer statusReason;
    @XmlElementRef(name = "SubModelName", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> subModelName;
    @XmlElementRef(name = "TTCustomerId", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> ttCustomerId;
    @XmlElementRef(name = "ValidFrom", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> validFrom;
    @XmlElementRef(name = "ValidTo", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> validTo;
    @XmlElementRef(name = "XdslNumber", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> xdslNumber;
    @XmlElementRef(name = "XdslPassword", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> xdslPassword;
    @XmlElementRef(name = "XdslUsername", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> xdslUsername;

    /**
     * Gets the value of the billingProductId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillingProductId() {
        return billingProductId;
    }

    /**
     * Sets the value of the billingProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillingProductId(JAXBElement<String> value) {
        this.billingProductId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the brandName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrandName() {
        return brandName;
    }

    /**
     * Sets the value of the brandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrandName(JAXBElement<String> value) {
        this.brandName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the catalogId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCatalogId() {
        return catalogId;
    }

    /**
     * Sets the value of the catalogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCatalogId(JAXBElement<String> value) {
        this.catalogId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the catalogName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCatalogName() {
        return catalogName;
    }

    /**
     * Sets the value of the catalogName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCatalogName(JAXBElement<String> value) {
        this.catalogName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCode(JAXBElement<String> value) {
        this.code = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmDocument }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCrmDocument> getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmDocument }{@code >}
     *     
     */
    public void setDocuments(JAXBElement<ArrayOfCrmDocument> value) {
        this.documents = ((JAXBElement<ArrayOfCrmDocument> ) value);
    }

    /**
     * Gets the value of the exchangeType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExchangeType() {
        return exchangeType;
    }

    /**
     * Sets the value of the exchangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExchangeType(Integer value) {
        this.exchangeType = value;
    }

    /**
     * Gets the value of the hasStaticIpRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasStaticIpRequest() {
        return hasStaticIpRequest;
    }

    /**
     * Sets the value of the hasStaticIpRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasStaticIpRequest(Boolean value) {
        this.hasStaticIpRequest = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the internetProfile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInternetProfile() {
        return internetProfile;
    }

    /**
     * Sets the value of the internetProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInternetProfile(JAXBElement<String> value) {
        this.internetProfile = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mProductType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMProductType() {
        return mProductType;
    }

    /**
     * Sets the value of the mProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMProductType(Integer value) {
        this.mProductType = value;
    }

    /**
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMacAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMacAddress(JAXBElement<String> value) {
        this.macAddress = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModelName(JAXBElement<String> value) {
        this.modelName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numbers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmNumber }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCrmNumber> getNumbers() {
        return numbers;
    }

    /**
     * Sets the value of the numbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmNumber }{@code >}
     *     
     */
    public void setNumbers(JAXBElement<ArrayOfCrmNumber> value) {
        this.numbers = ((JAXBElement<ArrayOfCrmNumber> ) value);
    }

    /**
     * Gets the value of the pcOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcOfferId() {
        return pcOfferId;
    }

    /**
     * Sets the value of the pcOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcOfferId(JAXBElement<String> value) {
        this.pcOfferId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductType(JAXBElement<String> value) {
        this.productType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerialNumber(JAXBElement<String> value) {
        this.serialNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the staticIp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStaticIp() {
        return staticIp;
    }

    /**
     * Sets the value of the staticIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStaticIp(JAXBElement<String> value) {
        this.staticIp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the staticIpProductId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStaticIpProductId() {
        return staticIpProductId;
    }

    /**
     * Sets the value of the staticIpProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStaticIpProductId(JAXBElement<String> value) {
        this.staticIpProductId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusReason property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatusReason() {
        return statusReason;
    }

    /**
     * Sets the value of the statusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatusReason(Integer value) {
        this.statusReason = value;
    }

    /**
     * Gets the value of the subModelName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubModelName() {
        return subModelName;
    }

    /**
     * Sets the value of the subModelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubModelName(JAXBElement<String> value) {
        this.subModelName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ttCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTTCustomerId() {
        return ttCustomerId;
    }

    /**
     * Sets the value of the ttCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTTCustomerId(JAXBElement<String> value) {
        this.ttCustomerId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setValidFrom(JAXBElement<XMLGregorianCalendar> value) {
        this.validFrom = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setValidTo(JAXBElement<XMLGregorianCalendar> value) {
        this.validTo = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the xdslNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXdslNumber() {
        return xdslNumber;
    }

    /**
     * Sets the value of the xdslNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXdslNumber(JAXBElement<String> value) {
        this.xdslNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the xdslPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXdslPassword() {
        return xdslPassword;
    }

    /**
     * Sets the value of the xdslPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXdslPassword(JAXBElement<String> value) {
        this.xdslPassword = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the xdslUsername property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXdslUsername() {
        return xdslUsername;
    }

    /**
     * Sets the value of the xdslUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXdslUsername(JAXBElement<String> value) {
        this.xdslUsername = ((JAXBElement<String> ) value);
    }

}
