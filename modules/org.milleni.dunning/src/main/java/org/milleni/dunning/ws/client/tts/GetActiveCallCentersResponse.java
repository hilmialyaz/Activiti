
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
 *         &lt;element name="GetActiveCallCentersResult" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel}GetActiveCallCentersResponseModel" minOccurs="0"/>
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
    "getActiveCallCentersResult"
})
@XmlRootElement(name = "GetActiveCallCentersResponse", namespace = "http://tempuri.org/")
public class GetActiveCallCentersResponse {

    @XmlElementRef(name = "GetActiveCallCentersResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<GetActiveCallCentersResponseModel> getActiveCallCentersResult;

    /**
     * Gets the value of the getActiveCallCentersResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetActiveCallCentersResponseModel }{@code >}
     *     
     */
    public JAXBElement<GetActiveCallCentersResponseModel> getGetActiveCallCentersResult() {
        return getActiveCallCentersResult;
    }

    /**
     * Sets the value of the getActiveCallCentersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetActiveCallCentersResponseModel }{@code >}
     *     
     */
    public void setGetActiveCallCentersResult(JAXBElement<GetActiveCallCentersResponseModel> value) {
        this.getActiveCallCentersResult = ((JAXBElement<GetActiveCallCentersResponseModel> ) value);
    }

}
