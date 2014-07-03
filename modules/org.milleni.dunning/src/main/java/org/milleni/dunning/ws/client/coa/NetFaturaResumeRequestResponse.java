
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
 *         &lt;element name="NetFaturaResumeRequestResult" type="{http://tempuri.org/}ServiceResponse" minOccurs="0"/>
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
    "netFaturaResumeRequestResult"
})
@XmlRootElement(name = "NetFaturaResumeRequestResponse")
public class NetFaturaResumeRequestResponse {

    @XmlElement(name = "NetFaturaResumeRequestResult")
    protected ServiceResponse netFaturaResumeRequestResult;

    /**
     * Gets the value of the netFaturaResumeRequestResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceResponse }
     *     
     */
    public ServiceResponse getNetFaturaResumeRequestResult() {
        return netFaturaResumeRequestResult;
    }

    /**
     * Sets the value of the netFaturaResumeRequestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceResponse }
     *     
     */
    public void setNetFaturaResumeRequestResult(ServiceResponse value) {
        this.netFaturaResumeRequestResult = value;
    }

}
