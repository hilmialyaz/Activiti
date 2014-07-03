
package org.milleni.dunning.ws.client.customerservice;

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
 *         &lt;element name="retrieveCustomerStatusResult" type="{http://milleni.com.tr/CustomerInfoService/}TeconCustomerInfoResponse" minOccurs="0"/>
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
    "retrieveCustomerStatusResult"
})
@XmlRootElement(name = "retrieveCustomerStatusResponse")
public class RetrieveCustomerStatusResponse {

    protected TeconCustomerInfoResponse retrieveCustomerStatusResult;

    /**
     * Gets the value of the retrieveCustomerStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link TeconCustomerInfoResponse }
     *     
     */
    public TeconCustomerInfoResponse getRetrieveCustomerStatusResult() {
        return retrieveCustomerStatusResult;
    }

    /**
     * Sets the value of the retrieveCustomerStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeconCustomerInfoResponse }
     *     
     */
    public void setRetrieveCustomerStatusResult(TeconCustomerInfoResponse value) {
        this.retrieveCustomerStatusResult = value;
    }

}
