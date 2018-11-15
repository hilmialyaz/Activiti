
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
 *         &lt;element name="req" type="{/CustomerInfo/Service/v1}AddStockItemToStockRequestModel" minOccurs="0"/>
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
    "req"
})
@XmlRootElement(name = "AddItemToStock")
public class AddItemToStock {

    @XmlElementRef(name = "req", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<AddStockItemToStockRequestModel> req;

    /**
     * Gets the value of the req property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddStockItemToStockRequestModel }{@code >}
     *     
     */
    public JAXBElement<AddStockItemToStockRequestModel> getReq() {
        return req;
    }

    /**
     * Sets the value of the req property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddStockItemToStockRequestModel }{@code >}
     *     
     */
    public void setReq(JAXBElement<AddStockItemToStockRequestModel> value) {
        this.req = ((JAXBElement<AddStockItemToStockRequestModel> ) value);
    }

}
