
package org.milleni.dunning.ws.client.crmcontact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendSmsByBillingCustomerNoRequestModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendSmsByBillingCustomerNoRequestModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillingCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Originator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmsSenderApplication" type="{http://milleni.com/Common/Notification}SmsSenderApplication" minOccurs="0"/>
 *         &lt;element name="SmsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendSmsByBillingCustomerNoRequestModel", propOrder = {
    "billingCustomerNo",
    "originator",
    "smsSenderApplication",
    "smsText"
})
public class SendSmsByBillingCustomerNoRequestModel {

    @XmlElementRef(name = "BillingCustomerNo", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> billingCustomerNo;
    @XmlElementRef(name = "Originator", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> originator;
    @XmlElement(name = "SmsSenderApplication")
    protected SmsSenderApplication smsSenderApplication;
    @XmlElementRef(name = "SmsText", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> smsText;

    /**
     * Gets the value of the billingCustomerNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillingCustomerNo() {
        return billingCustomerNo;
    }

    /**
     * Sets the value of the billingCustomerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillingCustomerNo(JAXBElement<String> value) {
        this.billingCustomerNo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginator(JAXBElement<String> value) {
        this.originator = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the smsSenderApplication property.
     * 
     * @return
     *     possible object is
     *     {@link SmsSenderApplication }
     *     
     */
    public SmsSenderApplication getSmsSenderApplication() {
        return smsSenderApplication;
    }

    /**
     * Sets the value of the smsSenderApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsSenderApplication }
     *     
     */
    public void setSmsSenderApplication(SmsSenderApplication value) {
        this.smsSenderApplication = value;
    }

    /**
     * Gets the value of the smsText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSmsText() {
        return smsText;
    }

    /**
     * Sets the value of the smsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSmsText(JAXBElement<String> value) {
        this.smsText = ((JAXBElement<String> ) value);
    }

}
