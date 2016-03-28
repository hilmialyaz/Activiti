
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
 *         &lt;element name="GetActivePersonResult" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel}GetActivePersonResponseModel" minOccurs="0"/>
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
    "getActivePersonResult"
})
@XmlRootElement(name = "GetActivePersonResponse", namespace = "http://tempuri.org/")
public class GetActivePersonResponse {

    @XmlElementRef(name = "GetActivePersonResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<GetActivePersonResponseModel> getActivePersonResult;

    /**
     * Gets the value of the getActivePersonResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetActivePersonResponseModel }{@code >}
     *     
     */
    public JAXBElement<GetActivePersonResponseModel> getGetActivePersonResult() {
        return getActivePersonResult;
    }

    /**
     * Sets the value of the getActivePersonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetActivePersonResponseModel }{@code >}
     *     
     */
    public void setGetActivePersonResult(JAXBElement<GetActivePersonResponseModel> value) {
        this.getActivePersonResult = ((JAXBElement<GetActivePersonResponseModel> ) value);
    }

}
