
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
 *         &lt;element name="oloThkAboneIptalResult" type="{http://milleni.com.tr/CustomerStatusOperations/}ServiceResponse" minOccurs="0"/>
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
    "oloThkAboneIptalResult"
})
@XmlRootElement(name = "oloThkAboneIptalResponse")
public class OloThkAboneIptalResponse {

    protected ServiceResponse oloThkAboneIptalResult;

    /**
     * Gets the value of the oloThkAboneIptalResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceResponse }
     *     
     */
    public ServiceResponse getOloThkAboneIptalResult() {
        return oloThkAboneIptalResult;
    }

    /**
     * Sets the value of the oloThkAboneIptalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceResponse }
     *     
     */
    public void setOloThkAboneIptalResult(ServiceResponse value) {
        this.oloThkAboneIptalResult = value;
    }

}
