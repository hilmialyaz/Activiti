
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
 *         &lt;element name="changeCustomerTTCRMStatusResult" type="{http://milleni.com.tr/CustomerStatusOperations/}ContractServiceResponse" minOccurs="0"/>
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
    "changeCustomerTTCRMStatusResult"
})
@XmlRootElement(name = "changeCustomerTTCRMStatusResponse")
public class ChangeCustomerTTCRMStatusResponse {

    protected ContractServiceResponse changeCustomerTTCRMStatusResult;

    /**
     * Gets the value of the changeCustomerTTCRMStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link ContractServiceResponse }
     *     
     */
    public ContractServiceResponse getChangeCustomerTTCRMStatusResult() {
        return changeCustomerTTCRMStatusResult;
    }

    /**
     * Sets the value of the changeCustomerTTCRMStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractServiceResponse }
     *     
     */
    public void setChangeCustomerTTCRMStatusResult(ContractServiceResponse value) {
        this.changeCustomerTTCRMStatusResult = value;
    }

}
