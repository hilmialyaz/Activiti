
package org.milleni.dunning.ws.client.freezexdsl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DunningFreezeCustomerXDSLRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DunningFreezeCustomerXDSLRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillingCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DunningFreezeCustomerXDSLRequest", propOrder = {
    "billingCustomerNo"
})
public class DunningFreezeCustomerXDSLRequest {

    @XmlElement(name = "BillingCustomerNo", required = true, nillable = true)
    protected String billingCustomerNo;

    /**
     * Gets the value of the billingCustomerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCustomerNo() {
        return billingCustomerNo;
    }

    /**
     * Sets the value of the billingCustomerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCustomerNo(String value) {
        this.billingCustomerNo = value;
    }

}
