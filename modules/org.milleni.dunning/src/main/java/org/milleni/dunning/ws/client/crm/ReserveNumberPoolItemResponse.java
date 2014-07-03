
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
 *         &lt;element name="ReserveNumberPoolItemResult" type="{/CustomerInfo/Service/v1}ChangeNumberPoolItemStatusResponseModel" minOccurs="0"/>
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
    "reserveNumberPoolItemResult"
})
@XmlRootElement(name = "ReserveNumberPoolItemResponse")
public class ReserveNumberPoolItemResponse {

    @XmlElementRef(name = "ReserveNumberPoolItemResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ChangeNumberPoolItemStatusResponseModel> reserveNumberPoolItemResult;

    /**
     * Gets the value of the reserveNumberPoolItemResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChangeNumberPoolItemStatusResponseModel }{@code >}
     *     
     */
    public JAXBElement<ChangeNumberPoolItemStatusResponseModel> getReserveNumberPoolItemResult() {
        return reserveNumberPoolItemResult;
    }

    /**
     * Sets the value of the reserveNumberPoolItemResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChangeNumberPoolItemStatusResponseModel }{@code >}
     *     
     */
    public void setReserveNumberPoolItemResult(JAXBElement<ChangeNumberPoolItemStatusResponseModel> value) {
        this.reserveNumberPoolItemResult = ((JAXBElement<ChangeNumberPoolItemStatusResponseModel> ) value);
    }

}
