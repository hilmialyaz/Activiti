
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddMillenifonNumberRequestModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMillenifonNumberRequestModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BulutNumberOid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="CrmUserId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="GsmNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MillenifonOfferId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMillenifonNumberRequestModel", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", propOrder = {
    "applicationName",
    "bulutNumberOid",
    "crmUserId",
    "gsmNumber",
    "millenifonOfferId"
})
public class AddMillenifonNumberRequestModel {

    @XmlElementRef(name = "ApplicationName", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", type = JAXBElement.class)
    protected JAXBElement<String> applicationName;
    @XmlElement(name = "BulutNumberOid")
    protected String bulutNumberOid;
    @XmlElement(name = "CrmUserId")
    protected String crmUserId;
    @XmlElementRef(name = "GsmNumber", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", type = JAXBElement.class)
    protected JAXBElement<String> gsmNumber;
    @XmlElement(name = "MillenifonOfferId")
    protected String millenifonOfferId;

    /**
     * Gets the value of the applicationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the value of the applicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicationName(JAXBElement<String> value) {
        this.applicationName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bulutNumberOid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulutNumberOid() {
        return bulutNumberOid;
    }

    /**
     * Sets the value of the bulutNumberOid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulutNumberOid(String value) {
        this.bulutNumberOid = value;
    }

    /**
     * Gets the value of the crmUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmUserId() {
        return crmUserId;
    }

    /**
     * Sets the value of the crmUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmUserId(String value) {
        this.crmUserId = value;
    }

    /**
     * Gets the value of the gsmNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGsmNumber() {
        return gsmNumber;
    }

    /**
     * Sets the value of the gsmNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGsmNumber(JAXBElement<String> value) {
        this.gsmNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the millenifonOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMillenifonOfferId() {
        return millenifonOfferId;
    }

    /**
     * Sets the value of the millenifonOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMillenifonOfferId(String value) {
        this.millenifonOfferId = value;
    }

}
