
package org.milleni.dunning.ws.client.crm;

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
 *         &lt;element name="DeactivateStaticIpResult" type="{/CustomerInfo/Service/v1}DeactivateStaticIpResponseModel" minOccurs="0"/>
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
    "deactivateStaticIpResult"
})
@XmlRootElement(name = "DeactivateStaticIpResponse")
public class DeactivateStaticIpResponse {

    @XmlElementRef(name = "DeactivateStaticIpResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<DeactivateStaticIpResponseModel> deactivateStaticIpResult;

    /**
     * Gets the value of the deactivateStaticIpResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeactivateStaticIpResponseModel }{@code >}
     *     
     */
    public JAXBElement<DeactivateStaticIpResponseModel> getDeactivateStaticIpResult() {
        return deactivateStaticIpResult;
    }

    /**
     * Sets the value of the deactivateStaticIpResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeactivateStaticIpResponseModel }{@code >}
     *     
     */
    public void setDeactivateStaticIpResult(JAXBElement<DeactivateStaticIpResponseModel> value) {
        this.deactivateStaticIpResult = ((JAXBElement<DeactivateStaticIpResponseModel> ) value);
    }

}
