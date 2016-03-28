
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeactivateAccountRequestModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeactivateAccountRequestModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Application" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Document" type="{http://milleni.com/Bpm}DocumentInfo" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusReasonDef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusReasonID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="WillBeSentToTT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeactivateAccountRequestModel", propOrder = {
    "application",
    "billingCustomerId",
    "document",
    "status",
    "statusReasonDef",
    "statusReasonID",
    "willBeSentToTT"
})
public class DeactivateAccountRequestModel {

    @XmlElementRef(name = "Application", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> application;
    @XmlElementRef(name = "BillingCustomerId", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> billingCustomerId;
    @XmlElementRef(name = "Document", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<DocumentInfo> document;
    @XmlElementRef(name = "Status", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "StatusReasonDef", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> statusReasonDef;
    @XmlElement(name = "StatusReasonID")
    protected Long statusReasonID;
    @XmlElement(name = "WillBeSentToTT")
    protected Boolean willBeSentToTT;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplication(JAXBElement<String> value) {
        this.application = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the billingCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillingCustomerId() {
        return billingCustomerId;
    }

    /**
     * Sets the value of the billingCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillingCustomerId(JAXBElement<String> value) {
        this.billingCustomerId = ((JAXBElement<String> ) value);
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the statusReasonDef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusReasonDef() {
        return statusReasonDef;
    }

    /**
     * Sets the value of the statusReasonDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusReasonDef(JAXBElement<String> value) {
        this.statusReasonDef = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the statusReasonID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStatusReasonID() {
        return statusReasonID;
    }

    /**
     * Sets the value of the statusReasonID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStatusReasonID(Long value) {
        this.statusReasonID = value;
    }

    /**
     * Gets the value of the willBeSentToTT property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWillBeSentToTT() {
        return willBeSentToTT;
    }

    /**
     * Sets the value of the willBeSentToTT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWillBeSentToTT(Boolean value) {
        this.willBeSentToTT = value;
    }

}
