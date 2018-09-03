
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
 *         &lt;element name="AddCreditCardOrderResult" type="{/CustomerInfo/Service/v1}AddCreditCardOrderResponseModel" minOccurs="0"/>
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
    "addCreditCardOrderResult"
})
@XmlRootElement(name = "AddCreditCardOrderResponse")
public class AddCreditCardOrderResponse {

    @XmlElementRef(name = "AddCreditCardOrderResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<AddCreditCardOrderResponseModel> addCreditCardOrderResult;

    /**
     * Gets the value of the addCreditCardOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddCreditCardOrderResponseModel }{@code >}
     *     
     */
    public JAXBElement<AddCreditCardOrderResponseModel> getAddCreditCardOrderResult() {
        return addCreditCardOrderResult;
    }

    /**
     * Sets the value of the addCreditCardOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddCreditCardOrderResponseModel }{@code >}
     *     
     */
    public void setAddCreditCardOrderResult(JAXBElement<AddCreditCardOrderResponseModel> value) {
        this.addCreditCardOrderResult = ((JAXBElement<AddCreditCardOrderResponseModel> ) value);
    }

}
