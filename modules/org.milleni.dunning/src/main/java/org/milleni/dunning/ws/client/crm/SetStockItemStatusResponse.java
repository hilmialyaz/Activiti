
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
 *         &lt;element name="SetStockItemStatusResult" type="{/CustomerInfo/Service/v1}ChangeStockItemStatusResponseModel" minOccurs="0"/>
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
    "setStockItemStatusResult"
})
@XmlRootElement(name = "SetStockItemStatusResponse")
public class SetStockItemStatusResponse {

    @XmlElementRef(name = "SetStockItemStatusResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ChangeStockItemStatusResponseModel> setStockItemStatusResult;

    /**
     * Gets the value of the setStockItemStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChangeStockItemStatusResponseModel }{@code >}
     *     
     */
    public JAXBElement<ChangeStockItemStatusResponseModel> getSetStockItemStatusResult() {
        return setStockItemStatusResult;
    }

    /**
     * Sets the value of the setStockItemStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChangeStockItemStatusResponseModel }{@code >}
     *     
     */
    public void setSetStockItemStatusResult(JAXBElement<ChangeStockItemStatusResponseModel> value) {
        this.setStockItemStatusResult = ((JAXBElement<ChangeStockItemStatusResponseModel> ) value);
    }

}
