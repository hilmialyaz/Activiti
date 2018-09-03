
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
 *         &lt;element name="AddDeactivationRequestThenProcessResult" type="{/CustomerInfo/Service/v1}ProcessProcessRequestResponseModel" minOccurs="0"/>
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
    "addDeactivationRequestThenProcessResult"
})
@XmlRootElement(name = "AddDeactivationRequestThenProcessResponse")
public class AddDeactivationRequestThenProcessResponse {

    @XmlElementRef(name = "AddDeactivationRequestThenProcessResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ProcessProcessRequestResponseModel> addDeactivationRequestThenProcessResult;

    /**
     * Gets the value of the addDeactivationRequestThenProcessResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProcessProcessRequestResponseModel }{@code >}
     *     
     */
    public JAXBElement<ProcessProcessRequestResponseModel> getAddDeactivationRequestThenProcessResult() {
        return addDeactivationRequestThenProcessResult;
    }

    /**
     * Sets the value of the addDeactivationRequestThenProcessResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProcessProcessRequestResponseModel }{@code >}
     *     
     */
    public void setAddDeactivationRequestThenProcessResult(JAXBElement<ProcessProcessRequestResponseModel> value) {
        this.addDeactivationRequestThenProcessResult = ((JAXBElement<ProcessProcessRequestResponseModel> ) value);
    }

}
