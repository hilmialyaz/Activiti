
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
 *         &lt;element name="ValidateAccountDeactivationResult" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel}ValidateAccountDeactivationResponseModel" minOccurs="0"/>
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
    "validateAccountDeactivationResult"
})
@XmlRootElement(name = "ValidateAccountDeactivationResponse")
public class ValidateAccountDeactivationResponse {

    @XmlElementRef(name = "ValidateAccountDeactivationResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ValidateAccountDeactivationResponseModel> validateAccountDeactivationResult;

    /**
     * Gets the value of the validateAccountDeactivationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValidateAccountDeactivationResponseModel }{@code >}
     *     
     */
    public JAXBElement<ValidateAccountDeactivationResponseModel> getValidateAccountDeactivationResult() {
        return validateAccountDeactivationResult;
    }

    /**
     * Sets the value of the validateAccountDeactivationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValidateAccountDeactivationResponseModel }{@code >}
     *     
     */
    public void setValidateAccountDeactivationResult(JAXBElement<ValidateAccountDeactivationResponseModel> value) {
        this.validateAccountDeactivationResult = ((JAXBElement<ValidateAccountDeactivationResponseModel> ) value);
    }

}
