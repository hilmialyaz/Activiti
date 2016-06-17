
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
 *         &lt;element name="GetCreditCardOrderResult" type="{/CustomerInfo/Service/v1}GetCreditCardOrderResponseModel" minOccurs="0"/>
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
    "getCreditCardOrderResult"
})
@XmlRootElement(name = "GetCreditCardOrderResponse")
public class GetCreditCardOrderResponse {

    @XmlElementRef(name = "GetCreditCardOrderResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<GetCreditCardOrderResponseModel> getCreditCardOrderResult;

    /**
     * Gets the value of the getCreditCardOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetCreditCardOrderResponseModel }{@code >}
     *     
     */
    public JAXBElement<GetCreditCardOrderResponseModel> getGetCreditCardOrderResult() {
        return getCreditCardOrderResult;
    }

    /**
     * Sets the value of the getCreditCardOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetCreditCardOrderResponseModel }{@code >}
     *     
     */
    public void setGetCreditCardOrderResult(JAXBElement<GetCreditCardOrderResponseModel> value) {
        this.getCreditCardOrderResult = ((JAXBElement<GetCreditCardOrderResponseModel> ) value);
    }

}
