
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
 *         &lt;element name="GetSmsLogResult" type="{http://milleni.com/Common/Notification/CommonNotification/Service/v1}GetSmsLogResponseModel" minOccurs="0"/>
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
    "getSmsLogResult"
})
@XmlRootElement(name = "GetSmsLogResponse", namespace = "http://tempuri.org/")
public class GetSmsLogResponse {

    @XmlElementRef(name = "GetSmsLogResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<GetSmsLogResponseModel> getSmsLogResult;

    /**
     * Gets the value of the getSmsLogResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetSmsLogResponseModel }{@code >}
     *     
     */
    public JAXBElement<GetSmsLogResponseModel> getGetSmsLogResult() {
        return getSmsLogResult;
    }

    /**
     * Sets the value of the getSmsLogResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetSmsLogResponseModel }{@code >}
     *     
     */
    public void setGetSmsLogResult(JAXBElement<GetSmsLogResponseModel> value) {
        this.getSmsLogResult = ((JAXBElement<GetSmsLogResponseModel> ) value);
    }

}
