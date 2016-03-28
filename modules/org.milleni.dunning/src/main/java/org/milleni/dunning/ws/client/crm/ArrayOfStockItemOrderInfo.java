
package org.milleni.dunning.ws.client.crm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStockItemOrderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStockItemOrderInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StockItemOrderInfo" type="{http://milleni.com/Crm}StockItemOrderInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStockItemOrderInfo", namespace = "http://milleni.com/Crm", propOrder = {
    "stockItemOrderInfo"
})
public class ArrayOfStockItemOrderInfo {

    @XmlElement(name = "StockItemOrderInfo", nillable = true)
    protected List<StockItemOrderInfo> stockItemOrderInfo;

    /**
     * Gets the value of the stockItemOrderInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stockItemOrderInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStockItemOrderInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StockItemOrderInfo }
     * 
     * 
     */
    public List<StockItemOrderInfo> getStockItemOrderInfo() {
        if (stockItemOrderInfo == null) {
            stockItemOrderInfo = new ArrayList<StockItemOrderInfo>();
        }
        return this.stockItemOrderInfo;
    }

}
