
package org.milleni.dunning.ws.client.notif;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendImediateSmsToCustomerRequestModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendImediateSmsToCustomerRequestModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Application" type="{http://milleni.com/Common/Notification}SmsSenderApplication"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MessageEncyrpted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendImediateSmsToCustomerRequestModel", propOrder = {
    "application",
    "customerId",
    "message",
    "messageEncyrpted",
    "mobile",
    "sender"
})
public class SendImediateSmsToCustomerRequestModel {

    @XmlElement(name = "Application", required = true)
    protected SmsSenderApplication application;
    @XmlElement(name = "CustomerId")
    protected int customerId;
    @XmlElement(name = "Message", required = true, nillable = true)
    protected String message;
    @XmlElementRef(name = "MessageEncyrpted", namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> messageEncyrpted;
    @XmlElement(name = "Mobile", required = true, nillable = true)
    protected String mobile;
    @XmlElement(name = "Sender", required = true, nillable = true)
    protected String sender;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link SmsSenderApplication }
     *     
     */
    public SmsSenderApplication getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsSenderApplication }
     *     
     */
    public void setApplication(SmsSenderApplication value) {
        this.application = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     */
    public void setCustomerId(int value) {
        this.customerId = value;
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
     * Gets the value of the messageEncyrpted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessageEncyrpted() {
        return messageEncyrpted;
    }

    /**
     * Sets the value of the messageEncyrpted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessageEncyrpted(JAXBElement<String> value) {
        this.messageEncyrpted = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

}
