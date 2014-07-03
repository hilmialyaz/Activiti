
package org.milleni.dunning.ws.client.callcenter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="callCenterInformResult" type="{http://milleni.com.tr/CallCenterNotificationOperations}ServiceResponse" minOccurs="0"/>
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
    "callCenterInformResult"
})
@XmlRootElement(name = "callCenterInformResponse")
public class CallCenterInformResponse {

    protected ServiceResponse callCenterInformResult;

    /**
     * Gets the value of the callCenterInformResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceResponse }
     *     
     */
    public ServiceResponse getCallCenterInformResult() {
        return callCenterInformResult;
    }

    /**
     * Sets the value of the callCenterInformResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceResponse }
     *     
     */
    public void setCallCenterInformResult(ServiceResponse value) {
        this.callCenterInformResult = value;
    }

}
