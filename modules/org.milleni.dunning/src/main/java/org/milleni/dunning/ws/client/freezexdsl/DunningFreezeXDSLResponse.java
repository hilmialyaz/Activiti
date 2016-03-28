
package org.milleni.dunning.ws.client.freezexdsl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="DunningFreezeXDSLResult" type="{/FreezeDunning/Service/v1}DunningFreezeCustomerXDSLResponse" minOccurs="0"/>
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
    "dunningFreezeXDSLResult"
})
@XmlRootElement(name = "DunningFreezeXDSLResponse")
public class DunningFreezeXDSLResponse {

    @XmlElementRef(name = "DunningFreezeXDSLResult", namespace = "/FreezeDunning/Service/v1", type = JAXBElement.class)
    protected JAXBElement<DunningFreezeCustomerXDSLResponse> dunningFreezeXDSLResult;

    /**
     * Gets the value of the dunningFreezeXDSLResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DunningFreezeCustomerXDSLResponse }{@code >}
     *     
     */
    public JAXBElement<DunningFreezeCustomerXDSLResponse> getDunningFreezeXDSLResult() {
        return dunningFreezeXDSLResult;
    }

    /**
     * Sets the value of the dunningFreezeXDSLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DunningFreezeCustomerXDSLResponse }{@code >}
     *     
     */
    public void setDunningFreezeXDSLResult(JAXBElement<DunningFreezeCustomerXDSLResponse> value) {
        this.dunningFreezeXDSLResult = ((JAXBElement<DunningFreezeCustomerXDSLResponse> ) value);
    }

}
