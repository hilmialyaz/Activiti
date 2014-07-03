
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
 *         &lt;element name="ActivateCustomerContractResult" type="{/CustomerInfo/Service/v1}ActivateCustomerContractResponseModel" minOccurs="0"/>
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
    "activateCustomerContractResult"
})
@XmlRootElement(name = "ActivateCustomerContractResponse")
public class ActivateCustomerContractResponse {

    @XmlElementRef(name = "ActivateCustomerContractResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ActivateCustomerContractResponseModel> activateCustomerContractResult;

    /**
     * Gets the value of the activateCustomerContractResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActivateCustomerContractResponseModel }{@code >}
     *     
     */
    public JAXBElement<ActivateCustomerContractResponseModel> getActivateCustomerContractResult() {
        return activateCustomerContractResult;
    }

    /**
     * Sets the value of the activateCustomerContractResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActivateCustomerContractResponseModel }{@code >}
     *     
     */
    public void setActivateCustomerContractResult(JAXBElement<ActivateCustomerContractResponseModel> value) {
        this.activateCustomerContractResult = ((JAXBElement<ActivateCustomerContractResponseModel> ) value);
    }

}
