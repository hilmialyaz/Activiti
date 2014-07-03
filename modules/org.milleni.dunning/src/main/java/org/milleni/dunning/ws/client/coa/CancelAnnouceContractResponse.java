
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
 *         &lt;element name="CancelAnnouceContractResult" type="{http://tempuri.org/}ServiceResponse" minOccurs="0"/>
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
    "cancelAnnouceContractResult"
})
@XmlRootElement(name = "CancelAnnouceContractResponse")
public class CancelAnnouceContractResponse {

    @XmlElement(name = "CancelAnnouceContractResult")
    protected ServiceResponse cancelAnnouceContractResult;

    /**
     * Gets the value of the cancelAnnouceContractResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceResponse }
     *     
     */
    public ServiceResponse getCancelAnnouceContractResult() {
        return cancelAnnouceContractResult;
    }

    /**
     * Sets the value of the cancelAnnouceContractResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceResponse }
     *     
     */
    public void setCancelAnnouceContractResult(ServiceResponse value) {
        this.cancelAnnouceContractResult = value;
    }

}
