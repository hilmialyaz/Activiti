
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
 *         &lt;element name="SetStockItemStatusAssignedSupportResult" type="{/CustomerInfo/Service/v1}ChangeStockItemStatusResponseModel" minOccurs="0"/>
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
    "setStockItemStatusAssignedSupportResult"
})
@XmlRootElement(name = "SetStockItemStatusAssignedSupportResponse")
public class SetStockItemStatusAssignedSupportResponse {

    @XmlElementRef(name = "SetStockItemStatusAssignedSupportResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ChangeStockItemStatusResponseModel> setStockItemStatusAssignedSupportResult;

    /**
     * Gets the value of the setStockItemStatusAssignedSupportResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChangeStockItemStatusResponseModel }{@code >}
     *     
     */
    public JAXBElement<ChangeStockItemStatusResponseModel> getSetStockItemStatusAssignedSupportResult() {
        return setStockItemStatusAssignedSupportResult;
    }

    /**
     * Sets the value of the setStockItemStatusAssignedSupportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChangeStockItemStatusResponseModel }{@code >}
     *     
     */
    public void setSetStockItemStatusAssignedSupportResult(JAXBElement<ChangeStockItemStatusResponseModel> value) {
        this.setStockItemStatusAssignedSupportResult = ((JAXBElement<ChangeStockItemStatusResponseModel> ) value);
    }

}
