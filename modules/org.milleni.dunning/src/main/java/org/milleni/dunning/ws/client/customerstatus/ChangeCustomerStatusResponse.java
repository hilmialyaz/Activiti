
package org.milleni.dunning.ws.client.customerstatus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="changeCustomerStatusResult" type="{http://milleni.com.tr/CustomerStatusOperations/}ServiceResponse" minOccurs="0"/>
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
    "changeCustomerStatusResult"
})
@XmlRootElement(name = "changeCustomerStatusResponse")
public class ChangeCustomerStatusResponse {

    protected ServiceResponse changeCustomerStatusResult;

    /**
     * Gets the value of the changeCustomerStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceResponse }
     *     
     */
    public ServiceResponse getChangeCustomerStatusResult() {
        return changeCustomerStatusResult;
    }

    /**
     * Sets the value of the changeCustomerStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceResponse }
     *     
     */
    public void setChangeCustomerStatusResult(ServiceResponse value) {
        this.changeCustomerStatusResult = value;
    }

}
