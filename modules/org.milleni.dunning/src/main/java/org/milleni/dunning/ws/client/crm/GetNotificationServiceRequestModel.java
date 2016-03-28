
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetNotificationServiceRequestModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetNotificationServiceRequestModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AboneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CancelledDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsCorporate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsIndividual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsSendMessageSucceed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SendMessagePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="To" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="XDSLNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNotificationServiceRequestModel", propOrder = {
    "aboneNumber",
    "cancelledDate",
    "customerName",
    "customerSurname",
    "isCorporate",
    "isIndividual",
    "isSendMessageSucceed",
    "phoneNumber",
    "productType",
    "sendMessagePhoneNumber",
    "to",
    "xdslNo"
})
public class GetNotificationServiceRequestModel {

    @XmlElement(name = "AboneNumber", required = true, nillable = true)
    protected String aboneNumber;
    @XmlElement(name = "CancelledDate", required = true, nillable = true)
    protected String cancelledDate;
    @XmlElement(name = "CustomerName", required = true, nillable = true)
    protected String customerName;
    @XmlElement(name = "CustomerSurname", required = true, nillable = true)
    protected String customerSurname;
    @XmlElement(name = "IsCorporate")
    protected boolean isCorporate;
    @XmlElement(name = "IsIndividual")
    protected boolean isIndividual;
    @XmlElement(name = "IsSendMessageSucceed")
    protected boolean isSendMessageSucceed;
    @XmlElement(name = "PhoneNumber", required = true, nillable = true)
    protected String phoneNumber;
    @XmlElement(name = "ProductType", required = true, nillable = true)
    protected String productType;
    @XmlElement(name = "SendMessagePhoneNumber", required = true, nillable = true)
    protected String sendMessagePhoneNumber;
    @XmlElement(name = "To", required = true, nillable = true)
    protected String to;
    @XmlElement(name = "XDSLNo", required = true, nillable = true)
    protected String xdslNo;

    /**
     * Gets the value of the aboneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAboneNumber() {
        return aboneNumber;
    }

    /**
     * Sets the value of the aboneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAboneNumber(String value) {
        this.aboneNumber = value;
    }

    /**
     * Gets the value of the cancelledDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelledDate() {
        return cancelledDate;
    }

    /**
     * Sets the value of the cancelledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelledDate(String value) {
        this.cancelledDate = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the customerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSurname() {
        return customerSurname;
    }

    /**
     * Sets the value of the customerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSurname(String value) {
        this.customerSurname = value;
    }

    /**
     * Gets the value of the isCorporate property.
     * 
     */
    public boolean isIsCorporate() {
        return isCorporate;
    }

    /**
     * Sets the value of the isCorporate property.
     * 
     */
    public void setIsCorporate(boolean value) {
        this.isCorporate = value;
    }

    /**
     * Gets the value of the isIndividual property.
     * 
     */
    public boolean isIsIndividual() {
        return isIndividual;
    }

    /**
     * Sets the value of the isIndividual property.
     * 
     */
    public void setIsIndividual(boolean value) {
        this.isIndividual = value;
    }

    /**
     * Gets the value of the isSendMessageSucceed property.
     * 
     */
    public boolean isIsSendMessageSucceed() {
        return isSendMessageSucceed;
    }

    /**
     * Sets the value of the isSendMessageSucceed property.
     * 
     */
    public void setIsSendMessageSucceed(boolean value) {
        this.isSendMessageSucceed = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the sendMessagePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendMessagePhoneNumber() {
        return sendMessagePhoneNumber;
    }

    /**
     * Sets the value of the sendMessagePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendMessagePhoneNumber(String value) {
        this.sendMessagePhoneNumber = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the xdslNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXDSLNo() {
        return xdslNo;
    }

    /**
     * Sets the value of the xdslNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXDSLNo(String value) {
        this.xdslNo = value;
    }

}
