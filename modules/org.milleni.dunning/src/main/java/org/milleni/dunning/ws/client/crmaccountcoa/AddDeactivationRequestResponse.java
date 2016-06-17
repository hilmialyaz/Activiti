
package org.milleni.dunning.ws.client.crmaccountcoa;

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
 *         &lt;element name="AddDeactivationRequestResult" type="{/CustomerInfo/Service/v1}AddDeactivationRequestResponseModel" minOccurs="0"/>
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
    "addDeactivationRequestResult"
})
@XmlRootElement(name = "AddDeactivationRequestResponse")
public class AddDeactivationRequestResponse {

    @XmlElementRef(name = "AddDeactivationRequestResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<AddDeactivationRequestResponseModel> addDeactivationRequestResult;

    /**
     * Gets the value of the addDeactivationRequestResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddDeactivationRequestResponseModel }{@code >}
     *     
     */
    public JAXBElement<AddDeactivationRequestResponseModel> getAddDeactivationRequestResult() {
        return addDeactivationRequestResult;
    }

    /**
     * Sets the value of the addDeactivationRequestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddDeactivationRequestResponseModel }{@code >}
     *     
     */
    public void setAddDeactivationRequestResult(JAXBElement<AddDeactivationRequestResponseModel> value) {
        this.addDeactivationRequestResult = ((JAXBElement<AddDeactivationRequestResponseModel> ) value);
    }

}
