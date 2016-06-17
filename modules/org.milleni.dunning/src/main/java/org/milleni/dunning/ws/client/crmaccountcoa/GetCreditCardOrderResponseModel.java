
package org.milleni.dunning.ws.client.crmaccountcoa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCreditCardOrderResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCreditCardOrderResponseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditCardOrder" type="{http://milleni.com/Payment}CreditCardOrder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCreditCardOrderResponseModel", propOrder = {
    "creditCardOrder"
})
public class GetCreditCardOrderResponseModel {

    @XmlElementRef(name = "CreditCardOrder", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<CreditCardOrder> creditCardOrder;

    /**
     * Gets the value of the creditCardOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreditCardOrder }{@code >}
     *     
     */
    public JAXBElement<CreditCardOrder> getCreditCardOrder() {
        return creditCardOrder;
    }

    /**
     * Sets the value of the creditCardOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreditCardOrder }{@code >}
     *     
     */
    public void setCreditCardOrder(JAXBElement<CreditCardOrder> value) {
        this.creditCardOrder = ((JAXBElement<CreditCardOrder> ) value);
    }

}
