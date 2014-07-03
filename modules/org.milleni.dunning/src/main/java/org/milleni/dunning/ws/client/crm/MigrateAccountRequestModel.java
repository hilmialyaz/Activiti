
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MigrateAccountRequestModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MigrateAccountRequestModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Account" type="{http://milleni.com/Crm}CrmAccount"/>
 *         &lt;element name="CustomerType" type="{http://milleni.com/Common/Customer}CustomerTypeEnum"/>
 *         &lt;element name="TcTaxNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MigrateAccountRequestModel", propOrder = {
    "account",
    "customerType",
    "tcTaxNumber"
})
public class MigrateAccountRequestModel {

    @XmlElement(name = "Account", required = true, nillable = true)
    protected CrmAccount account;
    @XmlElement(name = "CustomerType", required = true)
    protected CustomerTypeEnum customerType;
    @XmlElement(name = "TcTaxNumber", required = true, nillable = true)
    protected String tcTaxNumber;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link CrmAccount }
     *     
     */
    public CrmAccount getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrmAccount }
     *     
     */
    public void setAccount(CrmAccount value) {
        this.account = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerTypeEnum }
     *     
     */
    public CustomerTypeEnum getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerTypeEnum }
     *     
     */
    public void setCustomerType(CustomerTypeEnum value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the tcTaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcTaxNumber() {
        return tcTaxNumber;
    }

    /**
     * Sets the value of the tcTaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcTaxNumber(String value) {
        this.tcTaxNumber = value;
    }

}
