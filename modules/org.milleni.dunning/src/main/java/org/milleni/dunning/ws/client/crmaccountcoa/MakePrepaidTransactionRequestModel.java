
package org.milleni.dunning.ws.client.crmaccountcoa;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MakePrepaidTransactionRequestModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MakePrepaidTransactionRequestModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Application" type="{http://milleni.com/Payment}PosApplicationEnum" minOccurs="0"/>
 *         &lt;element name="BillingCustomerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreditCard" type="{http://milleni.com/Payment}CreditCard"/>
 *         &lt;element name="CrmUserId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="IpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PortaoneAccountId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MakePrepaidTransactionRequestModel", propOrder = {
    "amount",
    "application",
    "billingCustomerId",
    "creditCard",
    "crmUserId",
    "ipAddress",
    "portaoneAccountId"
})
public class MakePrepaidTransactionRequestModel {

    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "Application")
    protected PosApplicationEnum application;
    @XmlElement(name = "BillingCustomerId", required = true, nillable = true)
    protected String billingCustomerId;
    @XmlElement(name = "CreditCard", required = true, nillable = true)
    protected CreditCard creditCard;
    @XmlElement(name = "CrmUserId")
    protected String crmUserId;
    @XmlElementRef(name = "IpAddress", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> ipAddress;
    @XmlElement(name = "PortaoneAccountId")
    protected int portaoneAccountId;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link PosApplicationEnum }
     *     
     */
    public PosApplicationEnum getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosApplicationEnum }
     *     
     */
    public void setApplication(PosApplicationEnum value) {
        this.application = value;
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
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     */
    public void setCreditCard(CreditCard value) {
        this.creditCard = value;
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

    /**
     * Gets the value of the portaoneAccountId property.
     * 
     */
    public int getPortaoneAccountId() {
        return portaoneAccountId;
    }

    /**
     * Sets the value of the portaoneAccountId property.
     * 
     */
    public void setPortaoneAccountId(int value) {
        this.portaoneAccountId = value;
    }

}
