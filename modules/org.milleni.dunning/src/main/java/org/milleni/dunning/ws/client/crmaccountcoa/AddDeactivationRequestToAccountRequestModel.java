
package org.milleni.dunning.ws.client.crmaccountcoa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddDeactivationRequestToAccountRequestModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddDeactivationRequestToAccountRequestModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillingCustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CrmUserId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="Document" type="{http://milleni.com/Bpm}DocumentInfo" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReasonId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SendSms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendToBilling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendToNetwork" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendToTT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDeactivationRequestToAccountRequestModel", propOrder = {
    "applicationName",
    "billingCustomerNumber",
    "crmUserId",
    "document",
    "reason",
    "reasonId",
    "sendSms",
    "sendToBilling",
    "sendToNetwork",
    "sendToTT"
})
public class AddDeactivationRequestToAccountRequestModel {

    @XmlElement(name = "ApplicationName", required = true, nillable = true)
    protected String applicationName;
    @XmlElement(name = "BillingCustomerNumber", required = true, nillable = true)
    protected String billingCustomerNumber;
    @XmlElement(name = "CrmUserId")
    protected String crmUserId;
    @XmlElementRef(name = "Document", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<DocumentInfo> document;
    @XmlElement(name = "Reason", required = true, nillable = true)
    protected String reason;
    @XmlElement(name = "ReasonId")
    protected long reasonId;
    @XmlElement(name = "SendSms")
    protected Boolean sendSms;
    @XmlElement(name = "SendToBilling")
    protected Boolean sendToBilling;
    @XmlElement(name = "SendToNetwork")
    protected Boolean sendToNetwork;
    @XmlElement(name = "SendToTT")
    protected Boolean sendToTT;

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
     * Gets the value of the billingCustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCustomerNumber() {
        return billingCustomerNumber;
    }

    /**
     * Sets the value of the billingCustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCustomerNumber(String value) {
        this.billingCustomerNumber = value;
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
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocumentInfo }{@code >}
     *     
     */
    public JAXBElement<DocumentInfo> getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocumentInfo }{@code >}
     *     
     */
    public void setDocument(JAXBElement<DocumentInfo> value) {
        this.document = ((JAXBElement<DocumentInfo> ) value);
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the reasonId property.
     * 
     */
    public long getReasonId() {
        return reasonId;
    }

    /**
     * Sets the value of the reasonId property.
     * 
     */
    public void setReasonId(long value) {
        this.reasonId = value;
    }

    /**
     * Gets the value of the sendSms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendSms() {
        return sendSms;
    }

    /**
     * Sets the value of the sendSms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendSms(Boolean value) {
        this.sendSms = value;
    }

    /**
     * Gets the value of the sendToBilling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendToBilling() {
        return sendToBilling;
    }

    /**
     * Sets the value of the sendToBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendToBilling(Boolean value) {
        this.sendToBilling = value;
    }

    /**
     * Gets the value of the sendToNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendToNetwork() {
        return sendToNetwork;
    }

    /**
     * Sets the value of the sendToNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendToNetwork(Boolean value) {
        this.sendToNetwork = value;
    }

    /**
     * Gets the value of the sendToTT property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendToTT() {
        return sendToTT;
    }

    /**
     * Sets the value of the sendToTT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendToTT(Boolean value) {
        this.sendToTT = value;
    }

}
