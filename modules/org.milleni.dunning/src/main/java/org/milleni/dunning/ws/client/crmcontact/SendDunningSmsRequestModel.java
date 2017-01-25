
package org.milleni.dunning.ws.client.crmcontact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendDunningSmsRequestModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendDunningSmsRequestModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillingCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Debit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmsSenderApplication" type="{http://milleni.com/Common/Notification}SmsSenderApplication" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendDunningSmsRequestModel", propOrder = {
    "billingCustomerNo",
    "debit",
    "smsCode",
    "smsSenderApplication"
})
public class SendDunningSmsRequestModel {

    @XmlElementRef(name = "BillingCustomerNo", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> billingCustomerNo;
    @XmlElementRef(name = "Debit", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> debit;
    @XmlElementRef(name = "SmsCode", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> smsCode;
    @XmlElement(name = "SmsSenderApplication")
    protected SmsSenderApplication smsSenderApplication;

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
     * Gets the value of the debit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDebit() {
        return debit;
    }

    /**
     * Sets the value of the debit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDebit(JAXBElement<String> value) {
        this.debit = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the smsCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSmsCode() {
        return smsCode;
    }

    /**
     * Sets the value of the smsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSmsCode(JAXBElement<String> value) {
        this.smsCode = ((JAXBElement<String> ) value);
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

}
