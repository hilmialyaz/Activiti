
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddStockItemToStockRequestModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddStockItemToStockRequestModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StockItem" type="{http://milleni.com/Crm}StockItem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddStockItemToStockRequestModel", propOrder = {
    "stockItem"
})
public class AddStockItemToStockRequestModel {

    @XmlElement(name = "StockItem", required = true, nillable = true)
    protected StockItem stockItem;

    /**
     * Gets the value of the stockItem property.
     * 
     * @return
     *     possible object is
     *     {@link StockItem }
     *     
     */
    public StockItem getStockItem() {
        return stockItem;
    }

    /**
     * Sets the value of the stockItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockItem }
     *     
     */
    public void setStockItem(StockItem value) {
        this.stockItem = value;
    }

}
