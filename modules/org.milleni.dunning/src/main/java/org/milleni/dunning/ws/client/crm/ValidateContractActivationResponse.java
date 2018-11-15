
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
 *         &lt;element name="ValidateContractActivationResult" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel}ValidateContractActivationResponseModel" minOccurs="0"/>
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
    "validateContractActivationResult"
})
@XmlRootElement(name = "ValidateContractActivationResponse")
public class ValidateContractActivationResponse {

    @XmlElementRef(name = "ValidateContractActivationResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ValidateContractActivationResponseModel> validateContractActivationResult;

    /**
     * Gets the value of the validateContractActivationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValidateContractActivationResponseModel }{@code >}
     *     
     */
    public JAXBElement<ValidateContractActivationResponseModel> getValidateContractActivationResult() {
        return validateContractActivationResult;
    }

    /**
     * Sets the value of the validateContractActivationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValidateContractActivationResponseModel }{@code >}
     *     
     */
    public void setValidateContractActivationResult(JAXBElement<ValidateContractActivationResponseModel> value) {
        this.validateContractActivationResult = ((JAXBElement<ValidateContractActivationResponseModel> ) value);
    }

}
