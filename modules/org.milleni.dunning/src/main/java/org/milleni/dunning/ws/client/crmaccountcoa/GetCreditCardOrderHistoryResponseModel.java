
package org.milleni.dunning.ws.client.crmaccountcoa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCreditCardOrderHistoryResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCreditCardOrderHistoryResponseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditCardOrders" type="{http://milleni.com/Payment}ArrayOfCreditCardOrder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCreditCardOrderHistoryResponseModel", propOrder = {
    "creditCardOrders"
})
public class GetCreditCardOrderHistoryResponseModel {

    @XmlElementRef(name = "CreditCardOrders", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCreditCardOrder> creditCardOrders;

    /**
     * Gets the value of the creditCardOrders property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCreditCardOrder }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCreditCardOrder> getCreditCardOrders() {
        return creditCardOrders;
    }

    /**
     * Sets the value of the creditCardOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCreditCardOrder }{@code >}
     *     
     */
    public void setCreditCardOrders(JAXBElement<ArrayOfCreditCardOrder> value) {
        this.creditCardOrders = ((JAXBElement<ArrayOfCreditCardOrder> ) value);
    }

}
