
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
 *         &lt;element name="ReleaseNumbersOfVoipDeviceResult" type="{/CustomerInfo/Service/v1}ReleaseNumbersOfVoipDeviceResponseModel" minOccurs="0"/>
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
    "releaseNumbersOfVoipDeviceResult"
})
@XmlRootElement(name = "ReleaseNumbersOfVoipDeviceResponse")
public class ReleaseNumbersOfVoipDeviceResponse {

    @XmlElementRef(name = "ReleaseNumbersOfVoipDeviceResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ReleaseNumbersOfVoipDeviceResponseModel> releaseNumbersOfVoipDeviceResult;

    /**
     * Gets the value of the releaseNumbersOfVoipDeviceResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReleaseNumbersOfVoipDeviceResponseModel }{@code >}
     *     
     */
    public JAXBElement<ReleaseNumbersOfVoipDeviceResponseModel> getReleaseNumbersOfVoipDeviceResult() {
        return releaseNumbersOfVoipDeviceResult;
    }

    /**
     * Sets the value of the releaseNumbersOfVoipDeviceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReleaseNumbersOfVoipDeviceResponseModel }{@code >}
     *     
     */
    public void setReleaseNumbersOfVoipDeviceResult(JAXBElement<ReleaseNumbersOfVoipDeviceResponseModel> value) {
        this.releaseNumbersOfVoipDeviceResult = ((JAXBElement<ReleaseNumbersOfVoipDeviceResponseModel> ) value);
    }

}
