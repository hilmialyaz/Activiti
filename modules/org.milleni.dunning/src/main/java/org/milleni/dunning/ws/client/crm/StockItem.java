
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StockItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceSubType" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm.Stock}StockItemDeviceSubType" minOccurs="0"/>
 *         &lt;element name="DeviceType" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm.Stock}StockItemDeviceType" minOccurs="0"/>
 *         &lt;element name="FXOPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FXSPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="MACAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfferId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfferName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ouid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelatedIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StockName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockItem", namespace = "http://milleni.com/Crm", propOrder = {
    "brandName",
    "deviceSubType",
    "deviceType",
    "fxoPort",
    "fxsPort",
    "id",
    "macAddress",
    "modelName",
    "offerId",
    "offerName",
    "organization",
    "organizationName",
    "ouid",
    "relatedIdentification",
    "serialNumber",
    "state",
    "stockName"
})
public class StockItem {

    @XmlElementRef(name = "BrandName", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> brandName;
    @XmlElement(name = "DeviceSubType")
    protected StockItemDeviceSubType deviceSubType;
    @XmlElement(name = "DeviceType")
    protected StockItemDeviceType deviceType;
    @XmlElementRef(name = "FXOPort", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> fxoPort;
    @XmlElementRef(name = "FXSPort", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> fxsPort;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElementRef(name = "MACAddress", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> macAddress;
    @XmlElementRef(name = "ModelName", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> modelName;
    @XmlElementRef(name = "OfferId", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> offerId;
    @XmlElementRef(name = "OfferName", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> offerName;
    @XmlElementRef(name = "Organization", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> organization;
    @XmlElementRef(name = "OrganizationName", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> organizationName;
    @XmlElementRef(name = "Ouid", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> ouid;
    @XmlElementRef(name = "RelatedIdentification", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> relatedIdentification;
    @XmlElementRef(name = "SerialNumber", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> serialNumber;
    @XmlElementRef(name = "State", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "StockName", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> stockName;

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
     * Gets the value of the deviceSubType property.
     * 
     * @return
     *     possible object is
     *     {@link StockItemDeviceSubType }
     *     
     */
    public StockItemDeviceSubType getDeviceSubType() {
        return deviceSubType;
    }

    /**
     * Sets the value of the deviceSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockItemDeviceSubType }
     *     
     */
    public void setDeviceSubType(StockItemDeviceSubType value) {
        this.deviceSubType = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link StockItemDeviceType }
     *     
     */
    public StockItemDeviceType getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockItemDeviceType }
     *     
     */
    public void setDeviceType(StockItemDeviceType value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the fxoPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFXOPort() {
        return fxoPort;
    }

    /**
     * Sets the value of the fxoPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFXOPort(JAXBElement<String> value) {
        this.fxoPort = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fxsPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFXSPort() {
        return fxsPort;
    }

    /**
     * Sets the value of the fxsPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFXSPort(JAXBElement<String> value) {
        this.fxsPort = ((JAXBElement<String> ) value);
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
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMACAddress() {
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
    public void setMACAddress(JAXBElement<String> value) {
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
     * Gets the value of the offerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOfferId() {
        return offerId;
    }

    /**
     * Sets the value of the offerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOfferId(JAXBElement<String> value) {
        this.offerId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the offerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOfferName() {
        return offerName;
    }

    /**
     * Sets the value of the offerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOfferName(JAXBElement<String> value) {
        this.offerName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganization(JAXBElement<String> value) {
        this.organization = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationName(JAXBElement<String> value) {
        this.organizationName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ouid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOuid() {
        return ouid;
    }

    /**
     * Sets the value of the ouid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOuid(JAXBElement<String> value) {
        this.ouid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the relatedIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRelatedIdentification() {
        return relatedIdentification;
    }

    /**
     * Sets the value of the relatedIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRelatedIdentification(JAXBElement<String> value) {
        this.relatedIdentification = ((JAXBElement<String> ) value);
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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setState(JAXBElement<String> value) {
        this.state = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the stockName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStockName() {
        return stockName;
    }

    /**
     * Sets the value of the stockName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStockName(JAXBElement<String> value) {
        this.stockName = ((JAXBElement<String> ) value);
    }

}
