
package org.milleni.dunning.ws.client.crmcontact;

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
 *         &lt;element name="SendSmsByBillingCustomerNoResult" type="{/CustomerInfo/Service/v1}SendSmsByBillingCustomerNoResponseModel" minOccurs="0"/>
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
    "sendSmsByBillingCustomerNoResult"
})
@XmlRootElement(name = "SendSmsByBillingCustomerNoResponse")
public class SendSmsByBillingCustomerNoResponse {

    @XmlElementRef(name = "SendSmsByBillingCustomerNoResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<SendSmsByBillingCustomerNoResponseModel> sendSmsByBillingCustomerNoResult;

    /**
     * Gets the value of the sendSmsByBillingCustomerNoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SendSmsByBillingCustomerNoResponseModel }{@code >}
     *     
     */
    public JAXBElement<SendSmsByBillingCustomerNoResponseModel> getSendSmsByBillingCustomerNoResult() {
        return sendSmsByBillingCustomerNoResult;
    }

    /**
     * Sets the value of the sendSmsByBillingCustomerNoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SendSmsByBillingCustomerNoResponseModel }{@code >}
     *     
     */
    public void setSendSmsByBillingCustomerNoResult(JAXBElement<SendSmsByBillingCustomerNoResponseModel> value) {
        this.sendSmsByBillingCustomerNoResult = ((JAXBElement<SendSmsByBillingCustomerNoResponseModel> ) value);
    }

}
