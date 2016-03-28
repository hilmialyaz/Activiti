
package org.milleni.dunning.ws.client.tts;

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
 *         &lt;element name="DeactivatePersonResult" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel}DeactivatePersonResponseModel" minOccurs="0"/>
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
    "deactivatePersonResult"
})
@XmlRootElement(name = "DeactivatePersonResponse", namespace = "http://tempuri.org/")
public class DeactivatePersonResponse {

    @XmlElementRef(name = "DeactivatePersonResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<DeactivatePersonResponseModel> deactivatePersonResult;

    /**
     * Gets the value of the deactivatePersonResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeactivatePersonResponseModel }{@code >}
     *     
     */
    public JAXBElement<DeactivatePersonResponseModel> getDeactivatePersonResult() {
        return deactivatePersonResult;
    }

    /**
     * Sets the value of the deactivatePersonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeactivatePersonResponseModel }{@code >}
     *     
     */
    public void setDeactivatePersonResult(JAXBElement<DeactivatePersonResponseModel> value) {
        this.deactivatePersonResult = ((JAXBElement<DeactivatePersonResponseModel> ) value);
    }

}
