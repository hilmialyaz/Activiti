
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
 *         &lt;element name="retrieveCustomerCdrResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "retrieveCustomerCdrResult"
})
@XmlRootElement(name = "retrieveCustomerCdrResponse")
public class RetrieveCustomerCdrResponse {

    protected boolean retrieveCustomerCdrResult;

    /**
     * Gets the value of the retrieveCustomerCdrResult property.
     * 
     */
    public boolean isRetrieveCustomerCdrResult() {
        return retrieveCustomerCdrResult;
    }

    /**
     * Sets the value of the retrieveCustomerCdrResult property.
     * 
     */
    public void setRetrieveCustomerCdrResult(boolean value) {
        this.retrieveCustomerCdrResult = value;
    }

}
