
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
 *         &lt;element name="UpdateDealerStockStatusResult" type="{/CustomerInfo/Service/v1}UpdateDealerStokStatusResponseModel" minOccurs="0"/>
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
    "updateDealerStockStatusResult"
})
@XmlRootElement(name = "UpdateDealerStockStatusResponse")
public class UpdateDealerStockStatusResponse {

    @XmlElementRef(name = "UpdateDealerStockStatusResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<UpdateDealerStokStatusResponseModel> updateDealerStockStatusResult;

    /**
     * Gets the value of the updateDealerStockStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateDealerStokStatusResponseModel }{@code >}
     *     
     */
    public JAXBElement<UpdateDealerStokStatusResponseModel> getUpdateDealerStockStatusResult() {
        return updateDealerStockStatusResult;
    }

    /**
     * Sets the value of the updateDealerStockStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateDealerStokStatusResponseModel }{@code >}
     *     
     */
    public void setUpdateDealerStockStatusResult(JAXBElement<UpdateDealerStokStatusResponseModel> value) {
        this.updateDealerStockStatusResult = ((JAXBElement<UpdateDealerStokStatusResponseModel> ) value);
    }

}
