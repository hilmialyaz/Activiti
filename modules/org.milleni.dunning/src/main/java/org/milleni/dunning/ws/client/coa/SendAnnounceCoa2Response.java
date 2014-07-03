
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
 *         &lt;element name="SendAnnounceCoa2Result" type="{http://tempuri.org/}ServiceResponse" minOccurs="0"/>
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
    "sendAnnounceCoa2Result"
})
@XmlRootElement(name = "SendAnnounceCoa2Response")
public class SendAnnounceCoa2Response {

    @XmlElement(name = "SendAnnounceCoa2Result")
    protected ServiceResponse sendAnnounceCoa2Result;

    /**
     * Gets the value of the sendAnnounceCoa2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceResponse }
     *     
     */
    public ServiceResponse getSendAnnounceCoa2Result() {
        return sendAnnounceCoa2Result;
    }

    /**
     * Sets the value of the sendAnnounceCoa2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceResponse }
     *     
     */
    public void setSendAnnounceCoa2Result(ServiceResponse value) {
        this.sendAnnounceCoa2Result = value;
    }

}
