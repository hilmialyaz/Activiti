
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
 *         &lt;element name="RemoveCreditCardOrderResult" type="{/CustomerInfo/Service/v1}RemoveCreditCardOrderResponseModel" minOccurs="0"/>
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
    "removeCreditCardOrderResult"
})
@XmlRootElement(name = "RemoveCreditCardOrderResponse")
public class RemoveCreditCardOrderResponse {

    @XmlElementRef(name = "RemoveCreditCardOrderResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<RemoveCreditCardOrderResponseModel> removeCreditCardOrderResult;

    /**
     * Gets the value of the removeCreditCardOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RemoveCreditCardOrderResponseModel }{@code >}
     *     
     */
    public JAXBElement<RemoveCreditCardOrderResponseModel> getRemoveCreditCardOrderResult() {
        return removeCreditCardOrderResult;
    }

    /**
     * Sets the value of the removeCreditCardOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RemoveCreditCardOrderResponseModel }{@code >}
     *     
     */
    public void setRemoveCreditCardOrderResult(JAXBElement<RemoveCreditCardOrderResponseModel> value) {
        this.removeCreditCardOrderResult = ((JAXBElement<RemoveCreditCardOrderResponseModel> ) value);
    }

}
