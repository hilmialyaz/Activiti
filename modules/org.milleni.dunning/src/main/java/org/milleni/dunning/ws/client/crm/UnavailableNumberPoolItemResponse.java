
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
 *         &lt;element name="UnavailableNumberPoolItemResult" type="{/CustomerInfo/Service/v1}ChangeNumberPoolItemStatusResponseModel" minOccurs="0"/>
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
    "unavailableNumberPoolItemResult"
})
@XmlRootElement(name = "UnavailableNumberPoolItemResponse")
public class UnavailableNumberPoolItemResponse {

    @XmlElementRef(name = "UnavailableNumberPoolItemResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ChangeNumberPoolItemStatusResponseModel> unavailableNumberPoolItemResult;

    /**
     * Gets the value of the unavailableNumberPoolItemResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChangeNumberPoolItemStatusResponseModel }{@code >}
     *     
     */
    public JAXBElement<ChangeNumberPoolItemStatusResponseModel> getUnavailableNumberPoolItemResult() {
        return unavailableNumberPoolItemResult;
    }

    /**
     * Sets the value of the unavailableNumberPoolItemResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChangeNumberPoolItemStatusResponseModel }{@code >}
     *     
     */
    public void setUnavailableNumberPoolItemResult(JAXBElement<ChangeNumberPoolItemStatusResponseModel> value) {
        this.unavailableNumberPoolItemResult = ((JAXBElement<ChangeNumberPoolItemStatusResponseModel> ) value);
    }

}
