
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
 *         &lt;element name="GetCustomerFromLoginNameResult" type="{http://tempuri.org/}CustomerResponse" minOccurs="0"/>
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
    "getCustomerFromLoginNameResult"
})
@XmlRootElement(name = "GetCustomerFromLoginNameResponse")
public class GetCustomerFromLoginNameResponse {

    @XmlElement(name = "GetCustomerFromLoginNameResult")
    protected CustomerResponse getCustomerFromLoginNameResult;

    /**
     * Gets the value of the getCustomerFromLoginNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerResponse }
     *     
     */
    public CustomerResponse getGetCustomerFromLoginNameResult() {
        return getCustomerFromLoginNameResult;
    }

    /**
     * Sets the value of the getCustomerFromLoginNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerResponse }
     *     
     */
    public void setGetCustomerFromLoginNameResult(CustomerResponse value) {
        this.getCustomerFromLoginNameResult = value;
    }

}
