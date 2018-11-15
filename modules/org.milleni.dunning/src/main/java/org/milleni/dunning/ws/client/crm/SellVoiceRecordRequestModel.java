
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellVoiceRecordRequestModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellVoiceRecordRequestModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BulutSantralProductOid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="CrmUserId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="VoiceRecordOfferId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellVoiceRecordRequestModel", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", propOrder = {
    "applicationName",
    "bulutSantralProductOid",
    "crmUserId",
    "voiceRecordOfferId"
})
public class SellVoiceRecordRequestModel {

    @XmlElementRef(name = "ApplicationName", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel", type = JAXBElement.class)
    protected JAXBElement<String> applicationName;
    @XmlElement(name = "BulutSantralProductOid")
    protected String bulutSantralProductOid;
    @XmlElement(name = "CrmUserId")
    protected String crmUserId;
    @XmlElement(name = "VoiceRecordOfferId")
    protected String voiceRecordOfferId;

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
     * Gets the value of the bulutSantralProductOid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulutSantralProductOid() {
        return bulutSantralProductOid;
    }

    /**
     * Sets the value of the bulutSantralProductOid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulutSantralProductOid(String value) {
        this.bulutSantralProductOid = value;
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
     * Gets the value of the voiceRecordOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceRecordOfferId() {
        return voiceRecordOfferId;
    }

    /**
     * Sets the value of the voiceRecordOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceRecordOfferId(String value) {
        this.voiceRecordOfferId = value;
    }

}
