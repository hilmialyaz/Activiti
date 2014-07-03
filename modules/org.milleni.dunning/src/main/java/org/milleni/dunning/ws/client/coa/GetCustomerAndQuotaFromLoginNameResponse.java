
package org.milleni.dunning.ws.client.coa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetCustomerAndQuotaFromLoginNameResult" type="{http://tempuri.org/}CustomerResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCustomerAndQuotaFromLoginNameResult"
})
@XmlRootElement(name = "GetCustomerAndQuotaFromLoginNameResponse")
public class GetCustomerAndQuotaFromLoginNameResponse {

    @XmlElement(name = "GetCustomerAndQuotaFromLoginNameResult")
    protected CustomerResponse getCustomerAndQuotaFromLoginNameResult;

    /**
     * Gets the value of the getCustomerAndQuotaFromLoginNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerResponse }
     *     
     */
    public CustomerResponse getGetCustomerAndQuotaFromLoginNameResult() {
        return getCustomerAndQuotaFromLoginNameResult;
    }

    /**
     * Sets the value of the getCustomerAndQuotaFromLoginNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerResponse }
     *     
     */
    public void setGetCustomerAndQuotaFromLoginNameResult(CustomerResponse value) {
        this.getCustomerAndQuotaFromLoginNameResult = value;
    }

}
