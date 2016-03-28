
package org.milleni.dunning.ws.client.notif;

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
 *         &lt;element name="SendFutureSmsResult" type="{http://milleni.com/Common/Notification/CommonNotification/Service/v1}SendFutureSmsResponseModel" minOccurs="0"/>
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
    "sendFutureSmsResult"
})
@XmlRootElement(name = "SendFutureSmsResponse", namespace = "http://tempuri.org/")
public class SendFutureSmsResponse {

    @XmlElementRef(name = "SendFutureSmsResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<SendFutureSmsResponseModel> sendFutureSmsResult;

    /**
     * Gets the value of the sendFutureSmsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SendFutureSmsResponseModel }{@code >}
     *     
     */
    public JAXBElement<SendFutureSmsResponseModel> getSendFutureSmsResult() {
        return sendFutureSmsResult;
    }

    /**
     * Sets the value of the sendFutureSmsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SendFutureSmsResponseModel }{@code >}
     *     
     */
    public void setSendFutureSmsResult(JAXBElement<SendFutureSmsResponseModel> value) {
        this.sendFutureSmsResult = ((JAXBElement<SendFutureSmsResponseModel> ) value);
    }

}
