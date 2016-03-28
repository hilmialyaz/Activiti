
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryOpenOrdersForDevicesRequestModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryOpenOrdersForDevicesRequestModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StockItemSerialNos" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryOpenOrdersForDevicesRequestModel", propOrder = {
    "stockItemSerialNos"
})
public class QueryOpenOrdersForDevicesRequestModel {

    @XmlElementRef(name = "StockItemSerialNos", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> stockItemSerialNos;

    /**
     * Gets the value of the stockItemSerialNos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getStockItemSerialNos() {
        return stockItemSerialNos;
    }

    /**
     * Sets the value of the stockItemSerialNos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setStockItemSerialNos(JAXBElement<ArrayOfstring> value) {
        this.stockItemSerialNos = ((JAXBElement<ArrayOfstring> ) value);
    }

}
