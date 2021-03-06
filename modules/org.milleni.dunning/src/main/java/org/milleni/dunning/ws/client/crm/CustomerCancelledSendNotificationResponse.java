
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
 *         &lt;element name="CustomerCancelledSendNotificationResult" type="{/CustomerInfo/Service/v1}GetNotificationServiceResponseModel" minOccurs="0"/>
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
    "customerCancelledSendNotificationResult"
})
@XmlRootElement(name = "CustomerCancelledSendNotificationResponse")
public class CustomerCancelledSendNotificationResponse {

    @XmlElementRef(name = "CustomerCancelledSendNotificationResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<GetNotificationServiceResponseModel> customerCancelledSendNotificationResult;

    /**
     * Gets the value of the customerCancelledSendNotificationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetNotificationServiceResponseModel }{@code >}
     *     
     */
    public JAXBElement<GetNotificationServiceResponseModel> getCustomerCancelledSendNotificationResult() {
        return customerCancelledSendNotificationResult;
    }

    /**
     * Sets the value of the customerCancelledSendNotificationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetNotificationServiceResponseModel }{@code >}
     *     
     */
    public void setCustomerCancelledSendNotificationResult(JAXBElement<GetNotificationServiceResponseModel> value) {
        this.customerCancelledSendNotificationResult = ((JAXBElement<GetNotificationServiceResponseModel> ) value);
    }

}
