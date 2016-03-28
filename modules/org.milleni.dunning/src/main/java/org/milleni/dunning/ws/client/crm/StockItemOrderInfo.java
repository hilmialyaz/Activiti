
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StockItemOrderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockItemOrderInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StockItemSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockItemOrderInfo", namespace = "http://milleni.com/Crm", propOrder = {
    "orderCode",
    "stockItemSerialNo"
})
public class StockItemOrderInfo {

    @XmlElementRef(name = "OrderCode", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> orderCode;
    @XmlElementRef(name = "StockItemSerialNo", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> stockItemSerialNo;

    /**
     * Gets the value of the orderCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderCode() {
        return orderCode;
    }

    /**
     * Sets the value of the orderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderCode(JAXBElement<String> value) {
        this.orderCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the stockItemSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStockItemSerialNo() {
        return stockItemSerialNo;
    }

    /**
     * Sets the value of the stockItemSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStockItemSerialNo(JAXBElement<String> value) {
        this.stockItemSerialNo = ((JAXBElement<String> ) value);
    }

}
