
package org.milleni.dunning.ws.client.notif;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSmsLogResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSmsLogResponseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SmsLogs" type="{http://milleni.com/Common/Notification/CommonNotification/Service/v1}ArrayOfSmsLogModel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSmsLogResponseModel", propOrder = {
    "smsLogs"
})
public class GetSmsLogResponseModel {

    @XmlElementRef(name = "SmsLogs", namespace = "http://milleni.com/Common/Notification/CommonNotification/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ArrayOfSmsLogModel> smsLogs;

    /**
     * Gets the value of the smsLogs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSmsLogModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSmsLogModel> getSmsLogs() {
        return smsLogs;
    }

    /**
     * Sets the value of the smsLogs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSmsLogModel }{@code >}
     *     
     */
    public void setSmsLogs(JAXBElement<ArrayOfSmsLogModel> value) {
        this.smsLogs = ((JAXBElement<ArrayOfSmsLogModel> ) value);
    }

}
