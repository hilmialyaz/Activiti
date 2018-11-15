
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
 *         &lt;element name="AddNumbersToVoipDeviceResult" type="{/CustomerInfo/Service/v1}AddNumbersToVoipDeviceResponseModel" minOccurs="0"/>
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
    "addNumbersToVoipDeviceResult"
})
@XmlRootElement(name = "AddNumbersToVoipDeviceResponse")
public class AddNumbersToVoipDeviceResponse {

    @XmlElementRef(name = "AddNumbersToVoipDeviceResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<AddNumbersToVoipDeviceResponseModel> addNumbersToVoipDeviceResult;

    /**
     * Gets the value of the addNumbersToVoipDeviceResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddNumbersToVoipDeviceResponseModel }{@code >}
     *     
     */
    public JAXBElement<AddNumbersToVoipDeviceResponseModel> getAddNumbersToVoipDeviceResult() {
        return addNumbersToVoipDeviceResult;
    }

    /**
     * Sets the value of the addNumbersToVoipDeviceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddNumbersToVoipDeviceResponseModel }{@code >}
     *     
     */
    public void setAddNumbersToVoipDeviceResult(JAXBElement<AddNumbersToVoipDeviceResponseModel> value) {
        this.addNumbersToVoipDeviceResult = ((JAXBElement<AddNumbersToVoipDeviceResponseModel> ) value);
    }

}
