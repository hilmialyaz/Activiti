
package org.milleni.dunning.ws.client.crmaccountcoa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveCreditCardOrderRequestModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveCreditCardOrderRequestModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillingCustomerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CrmUserId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="IpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveCreditCardOrderRequestModel", propOrder = {
    "applicationName",
    "billingCustomerId",
    "crmUserId",
    "ipAddress"
})
public class RemoveCreditCardOrderRequestModel {

    @XmlElement(name = "ApplicationName", required = true, nillable = true)
    protected String applicationName;
    @XmlElement(name = "BillingCustomerId", required = true, nillable = true)
    protected String billingCustomerId;
    @XmlElement(name = "CrmUserId")
    protected String crmUserId;
    @XmlElementRef(name = "IpAddress", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> ipAddress;

    /**
     * Gets the value of the applicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the value of the applicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationName(String value) {
        this.applicationName = value;
    }

    /**
     * Gets the value of the billingCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCustomerId() {
        return billingCustomerId;
    }

    /**
     * Sets the value of the billingCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCustomerId(String value) {
        this.billingCustomerId = value;
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
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIpAddress(JAXBElement<String> value) {
        this.ipAddress = ((JAXBElement<String> ) value);
    }

}
