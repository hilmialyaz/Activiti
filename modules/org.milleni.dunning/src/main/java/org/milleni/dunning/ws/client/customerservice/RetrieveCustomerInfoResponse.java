
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
 *         &lt;element name="retrieveCustomerInfoResult" type="{http://milleni.com.tr/CustomerInfoService/}TeconCustomerInfoResponse" minOccurs="0"/>
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
    "retrieveCustomerInfoResult"
})
@XmlRootElement(name = "retrieveCustomerInfoResponse")
public class RetrieveCustomerInfoResponse {

    protected TeconCustomerInfoResponse retrieveCustomerInfoResult;

    /**
     * Gets the value of the retrieveCustomerInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link TeconCustomerInfoResponse }
     *     
     */
    public TeconCustomerInfoResponse getRetrieveCustomerInfoResult() {
        return retrieveCustomerInfoResult;
    }

    /**
     * Sets the value of the retrieveCustomerInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeconCustomerInfoResponse }
     *     
     */
    public void setRetrieveCustomerInfoResult(TeconCustomerInfoResponse value) {
        this.retrieveCustomerInfoResult = value;
    }

}
