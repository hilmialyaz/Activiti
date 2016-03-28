
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryOpenOrdersForDevicesResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryOpenOrdersForDevicesResponseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StockItemOrderInfos" type="{http://milleni.com/Crm}ArrayOfStockItemOrderInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryOpenOrdersForDevicesResponseModel", propOrder = {
    "stockItemOrderInfos"
})
public class QueryOpenOrdersForDevicesResponseModel {

    @XmlElementRef(name = "StockItemOrderInfos", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ArrayOfStockItemOrderInfo> stockItemOrderInfos;

    /**
     * Gets the value of the stockItemOrderInfos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStockItemOrderInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStockItemOrderInfo> getStockItemOrderInfos() {
        return stockItemOrderInfos;
    }

    /**
     * Sets the value of the stockItemOrderInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStockItemOrderInfo }{@code >}
     *     
     */
    public void setStockItemOrderInfos(JAXBElement<ArrayOfStockItemOrderInfo> value) {
        this.stockItemOrderInfos = ((JAXBElement<ArrayOfStockItemOrderInfo> ) value);
    }

}
