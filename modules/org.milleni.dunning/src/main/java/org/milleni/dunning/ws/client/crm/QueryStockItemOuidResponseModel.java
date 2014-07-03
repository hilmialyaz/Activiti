
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryStockItemOuidResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryStockItemOuidResponseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ouid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "QueryStockItemOuidResponseModel", propOrder = {
    "ouid",
    "stockItem"
})
public class QueryStockItemOuidResponseModel {

    @XmlElementRef(name = "Ouid", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> ouid;
    @XmlElementRef(name = "StockItem", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<StockItem> stockItem;

    /**
     * Gets the value of the ouid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOuid() {
        return ouid;
    }

    /**
     * Sets the value of the ouid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOuid(JAXBElement<String> value) {
        this.ouid = ((JAXBElement<String> ) value);
    }

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
