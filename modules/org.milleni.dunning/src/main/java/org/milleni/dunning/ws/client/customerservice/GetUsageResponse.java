
package org.milleni.dunning.ws.client.customerservice;

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
 *         &lt;element name="GetUsageResult" type="{http://milleni.com.tr/CustomerInfoService/}UsageResponse" minOccurs="0"/>
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
    "getUsageResult"
})
@XmlRootElement(name = "GetUsageResponse")
public class GetUsageResponse {

    @XmlElement(name = "GetUsageResult")
    protected UsageResponse getUsageResult;

    /**
     * Gets the value of the getUsageResult property.
     * 
     * @return
     *     possible object is
     *     {@link UsageResponse }
     *     
     */
    public UsageResponse getGetUsageResult() {
        return getUsageResult;
    }

    /**
     * Sets the value of the getUsageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageResponse }
     *     
     */
    public void setGetUsageResult(UsageResponse value) {
        this.getUsageResult = value;
    }

}
