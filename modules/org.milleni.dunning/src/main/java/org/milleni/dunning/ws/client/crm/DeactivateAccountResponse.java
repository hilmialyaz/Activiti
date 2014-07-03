
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
 *         &lt;element name="DeactivateAccountResult" type="{/CustomerInfo/Service/v1}DeactivateAccountResponseModel" minOccurs="0"/>
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
    "deactivateAccountResult"
})
@XmlRootElement(name = "DeactivateAccountResponse")
public class DeactivateAccountResponse {

    @XmlElementRef(name = "DeactivateAccountResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<DeactivateAccountResponseModel> deactivateAccountResult;

    /**
     * Gets the value of the deactivateAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeactivateAccountResponseModel }{@code >}
     *     
     */
    public JAXBElement<DeactivateAccountResponseModel> getDeactivateAccountResult() {
        return deactivateAccountResult;
    }

    /**
     * Sets the value of the deactivateAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeactivateAccountResponseModel }{@code >}
     *     
     */
    public void setDeactivateAccountResult(JAXBElement<DeactivateAccountResponseModel> value) {
        this.deactivateAccountResult = ((JAXBElement<DeactivateAccountResponseModel> ) value);
    }

}
