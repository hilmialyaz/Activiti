
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MigrateContractRequestModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MigrateContractRequestModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillingCustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Contract" type="{http://milleni.com/Crm}CrmContract"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MigrateContractRequestModel", propOrder = {
    "billingCustomerNumber",
    "contract"
})
public class MigrateContractRequestModel {

    @XmlElement(name = "BillingCustomerNumber", required = true, nillable = true)
    protected String billingCustomerNumber;
    @XmlElement(name = "Contract", required = true, nillable = true)
    protected CrmContract contract;

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
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link CrmContract }
     *     
     */
    public CrmContract getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrmContract }
     *     
     */
    public void setContract(CrmContract value) {
        this.contract = value;
    }

}
