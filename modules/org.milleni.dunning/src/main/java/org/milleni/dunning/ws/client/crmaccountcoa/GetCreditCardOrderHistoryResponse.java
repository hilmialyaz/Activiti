
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
 *         &lt;element name="GetCreditCardOrderHistoryResult" type="{/CustomerInfo/Service/v1}GetCreditCardOrderHistoryResponseModel" minOccurs="0"/>
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
    "getCreditCardOrderHistoryResult"
})
@XmlRootElement(name = "GetCreditCardOrderHistoryResponse")
public class GetCreditCardOrderHistoryResponse {

    @XmlElementRef(name = "GetCreditCardOrderHistoryResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<GetCreditCardOrderHistoryResponseModel> getCreditCardOrderHistoryResult;

    /**
     * Gets the value of the getCreditCardOrderHistoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetCreditCardOrderHistoryResponseModel }{@code >}
     *     
     */
    public JAXBElement<GetCreditCardOrderHistoryResponseModel> getGetCreditCardOrderHistoryResult() {
        return getCreditCardOrderHistoryResult;
    }

    /**
     * Sets the value of the getCreditCardOrderHistoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetCreditCardOrderHistoryResponseModel }{@code >}
     *     
     */
    public void setGetCreditCardOrderHistoryResult(JAXBElement<GetCreditCardOrderHistoryResponseModel> value) {
        this.getCreditCardOrderHistoryResult = ((JAXBElement<GetCreditCardOrderHistoryResponseModel> ) value);
    }

}
