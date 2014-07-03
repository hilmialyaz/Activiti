
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
 *         &lt;element name="CancelAnnouce2Result" type="{http://tempuri.org/}ServiceResponse" minOccurs="0"/>
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
    "cancelAnnouce2Result"
})
@XmlRootElement(name = "CancelAnnouce2Response")
public class CancelAnnouce2Response {

    @XmlElement(name = "CancelAnnouce2Result")
    protected ServiceResponse cancelAnnouce2Result;

    /**
     * Gets the value of the cancelAnnouce2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceResponse }
     *     
     */
    public ServiceResponse getCancelAnnouce2Result() {
        return cancelAnnouce2Result;
    }

    /**
     * Sets the value of the cancelAnnouce2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceResponse }
     *     
     */
    public void setCancelAnnouce2Result(ServiceResponse value) {
        this.cancelAnnouce2Result = value;
    }

}
