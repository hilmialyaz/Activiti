
package org.milleni.dunning.ws.client.tts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetActiveCallCentersResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetActiveCallCentersResponseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CallCenters" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel}ArrayOfCallCenter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetActiveCallCentersResponseModel", propOrder = {
    "callCenters"
})
public class GetActiveCallCentersResponseModel {

    @XmlElementRef(name = "CallCenters", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCallCenter> callCenters;

    /**
     * Gets the value of the callCenters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCallCenter }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCallCenter> getCallCenters() {
        return callCenters;
    }

    /**
     * Sets the value of the callCenters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCallCenter }{@code >}
     *     
     */
    public void setCallCenters(JAXBElement<ArrayOfCallCenter> value) {
        this.callCenters = ((JAXBElement<ArrayOfCallCenter> ) value);
    }

}
