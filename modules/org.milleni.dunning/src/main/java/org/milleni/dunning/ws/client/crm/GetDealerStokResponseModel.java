
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDealerStokResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDealerStokResponseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StockItemList" type="{http://milleni.com/Crm}ArrayOfStockItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDealerStokResponseModel", propOrder = {
    "stockItemList"
})
public class GetDealerStokResponseModel {

    @XmlElementRef(name = "StockItemList", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ArrayOfStockItem> stockItemList;

    /**
     * Gets the value of the stockItemList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStockItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStockItem> getStockItemList() {
        return stockItemList;
    }

    /**
     * Sets the value of the stockItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStockItem }{@code >}
     *     
     */
    public void setStockItemList(JAXBElement<ArrayOfStockItem> value) {
        this.stockItemList = ((JAXBElement<ArrayOfStockItem> ) value);
    }

}
