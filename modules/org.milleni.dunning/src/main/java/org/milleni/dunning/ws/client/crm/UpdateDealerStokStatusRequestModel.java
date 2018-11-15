
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateDealerStokStatusRequestModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateDealerStokStatusRequestModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentStatus" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.Contracts.CustomerInfoService.Type}StockItemStatusType" minOccurs="0"/>
 *         &lt;element name="Organisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerialNoList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.Contracts.CustomerInfoService.Type}StockItemStatusType" minOccurs="0"/>
 *         &lt;element name="StockItemIdList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="UpdateUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateDealerStokStatusRequestModel", propOrder = {
    "currentStatus",
    "organisation",
    "serialNoList",
    "status",
    "stockItemIdList",
    "updateUserId"
})
public class UpdateDealerStokStatusRequestModel {

    @XmlElement(name = "CurrentStatus")
    protected StockItemStatusType currentStatus;
    @XmlElementRef(name = "Organisation", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> organisation;
    @XmlElementRef(name = "SerialNoList", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> serialNoList;
    @XmlElement(name = "Status")
    protected StockItemStatusType status;
    @XmlElementRef(name = "StockItemIdList", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ArrayOfguid> stockItemIdList;
    @XmlElementRef(name = "UpdateUserId", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> updateUserId;

    /**
     * Gets the value of the currentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StockItemStatusType }
     *     
     */
    public StockItemStatusType getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Sets the value of the currentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockItemStatusType }
     *     
     */
    public void setCurrentStatus(StockItemStatusType value) {
        this.currentStatus = value;
    }

    /**
     * Gets the value of the organisation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganisation() {
        return organisation;
    }

    /**
     * Sets the value of the organisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganisation(JAXBElement<String> value) {
        this.organisation = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the serialNoList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getSerialNoList() {
        return serialNoList;
    }

    /**
     * Sets the value of the serialNoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setSerialNoList(JAXBElement<ArrayOfstring> value) {
        this.serialNoList = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StockItemStatusType }
     *     
     */
    public StockItemStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockItemStatusType }
     *     
     */
    public void setStatus(StockItemStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the stockItemIdList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     *     
     */
    public JAXBElement<ArrayOfguid> getStockItemIdList() {
        return stockItemIdList;
    }

    /**
     * Sets the value of the stockItemIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     *     
     */
    public void setStockItemIdList(JAXBElement<ArrayOfguid> value) {
        this.stockItemIdList = ((JAXBElement<ArrayOfguid> ) value);
    }

    /**
     * Gets the value of the updateUserId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUpdateUserId() {
        return updateUserId;
    }

    /**
     * Sets the value of the updateUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUpdateUserId(JAXBElement<String> value) {
        this.updateUserId = ((JAXBElement<String> ) value);
    }

}
