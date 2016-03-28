
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
 *         &lt;element name="SendIhtarAnnounceByBillingCustomerIdResult" type="{/CustomerInfo/Service/v1}SendAnnounceByBillingCustomerNoResponseModel" minOccurs="0"/>
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
    "sendIhtarAnnounceByBillingCustomerIdResult"
})
@XmlRootElement(name = "SendIhtarAnnounceByBillingCustomerIdResponse")
public class SendIhtarAnnounceByBillingCustomerIdResponse {

    @XmlElementRef(name = "SendIhtarAnnounceByBillingCustomerIdResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<SendAnnounceByBillingCustomerNoResponseModel> sendIhtarAnnounceByBillingCustomerIdResult;

    /**
     * Gets the value of the sendIhtarAnnounceByBillingCustomerIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SendAnnounceByBillingCustomerNoResponseModel }{@code >}
     *     
     */
    public JAXBElement<SendAnnounceByBillingCustomerNoResponseModel> getSendIhtarAnnounceByBillingCustomerIdResult() {
        return sendIhtarAnnounceByBillingCustomerIdResult;
    }

    /**
     * Sets the value of the sendIhtarAnnounceByBillingCustomerIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SendAnnounceByBillingCustomerNoResponseModel }{@code >}
     *     
     */
    public void setSendIhtarAnnounceByBillingCustomerIdResult(JAXBElement<SendAnnounceByBillingCustomerNoResponseModel> value) {
        this.sendIhtarAnnounceByBillingCustomerIdResult = ((JAXBElement<SendAnnounceByBillingCustomerNoResponseModel> ) value);
    }

}
