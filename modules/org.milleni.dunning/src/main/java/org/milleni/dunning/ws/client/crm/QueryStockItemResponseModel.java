
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryStockItemResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryStockItemResponseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StockItem" type="{http://milleni.com/Crm}StockItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryStockItemResponseModel", propOrder = {
    "stockItem"
})
public class QueryStockItemResponseModel {

    @XmlElementRef(name = "StockItem", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<StockItem> stockItem;

    /**
     * Gets the value of the stockItem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StockItem }{@code >}
     *     
     */
    public JAXBElement<StockItem> getStockItem() {
        return stockItem;
    }

    /**
     * Sets the value of the stockItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StockItem }{@code >}
     *     
     */
    public void setStockItem(JAXBElement<StockItem> value) {
        this.stockItem = ((JAXBElement<StockItem> ) value);
    }

}
