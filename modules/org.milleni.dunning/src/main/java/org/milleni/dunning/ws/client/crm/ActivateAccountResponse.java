
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
 *         &lt;element name="ActivateAccountResult" type="{/CustomerInfo/Service/v1}ActivateAccountResponseModel" minOccurs="0"/>
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
    "activateAccountResult"
})
@XmlRootElement(name = "ActivateAccountResponse")
public class ActivateAccountResponse {

    @XmlElementRef(name = "ActivateAccountResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ActivateAccountResponseModel> activateAccountResult;

    /**
     * Gets the value of the activateAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActivateAccountResponseModel }{@code >}
     *     
     */
    public JAXBElement<ActivateAccountResponseModel> getActivateAccountResult() {
        return activateAccountResult;
    }

    /**
     * Sets the value of the activateAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActivateAccountResponseModel }{@code >}
     *     
     */
    public void setActivateAccountResult(JAXBElement<ActivateAccountResponseModel> value) {
        this.activateAccountResult = ((JAXBElement<ActivateAccountResponseModel> ) value);
    }

}
