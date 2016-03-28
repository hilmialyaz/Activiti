
package org.milleni.dunning.ws.client.notif;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendEmailRequestModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendEmailRequestModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Application" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttachmentByteList" type="{http://milleni.com/Common/Notification/CommonNotification/Service/v1}ArrayOfAttachmentByte" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Bccs" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Ccs" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="From" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SmtpInfo" type="{http://milleni.com/Common/Notification/CommonNotification/Service/v1}SmtpInfo" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Tos" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendEmailRequestModel", propOrder = {
    "application",
    "attachmentByteList",
    "attachments",
    "bccs",
    "ccs",
    "displayName",
    "from",
    "message",
    "smtpInfo",
    "subject",
    "tos"
})
public class SendEmailRequestModel {

    @XmlElement(name = "Application", required = true, nillable = true)
    protected String application;
    @XmlElementRef(name = "AttachmentByteList", namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAttachmentByte> attachmentByteList;
    @XmlElementRef(name = "Attachments", namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> attachments;
    @XmlElementRef(name = "Bccs", namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> bccs;
    @XmlElementRef(name = "Ccs", namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> ccs;
    @XmlElementRef(name = "DisplayName", namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> displayName;
    @XmlElement(name = "From", required = true, nillable = true)
    protected String from;
    @XmlElement(name = "Message", required = true, nillable = true)
    protected String message;
    @XmlElementRef(name = "SmtpInfo", namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", type = JAXBElement.class)
    protected JAXBElement<SmtpInfo> smtpInfo;
    @XmlElement(name = "Subject", required = true, nillable = true)
    protected String subject;
    @XmlElement(name = "Tos", required = true, nillable = true)
    protected ArrayOfstring tos;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Gets the value of the attachmentByteList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAttachmentByte }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAttachmentByte> getAttachmentByteList() {
        return attachmentByteList;
    }

    /**
     * Sets the value of the attachmentByteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAttachmentByte }{@code >}
     *     
     */
    public void setAttachmentByteList(JAXBElement<ArrayOfAttachmentByte> value) {
        this.attachmentByteList = ((JAXBElement<ArrayOfAttachmentByte> ) value);
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setAttachments(JAXBElement<ArrayOfstring> value) {
        this.attachments = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the bccs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getBccs() {
        return bccs;
    }

    /**
     * Sets the value of the bccs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setBccs(JAXBElement<ArrayOfstring> value) {
        this.bccs = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the ccs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getCcs() {
        return ccs;
    }

    /**
     * Sets the value of the ccs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setCcs(JAXBElement<ArrayOfstring> value) {
        this.ccs = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayName(JAXBElement<String> value) {
        this.displayName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the smtpInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SmtpInfo }{@code >}
     *     
     */
    public JAXBElement<SmtpInfo> getSmtpInfo() {
        return smtpInfo;
    }

    /**
     * Sets the value of the smtpInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SmtpInfo }{@code >}
     *     
     */
    public void setSmtpInfo(JAXBElement<SmtpInfo> value) {
        this.smtpInfo = ((JAXBElement<SmtpInfo> ) value);
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the tos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getTos() {
        return tos;
    }

    /**
     * Sets the value of the tos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setTos(ArrayOfstring value) {
        this.tos = value;
    }

}
