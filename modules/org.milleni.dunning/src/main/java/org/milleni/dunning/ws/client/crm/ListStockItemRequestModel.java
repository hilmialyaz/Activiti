
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListStockItemRequestModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListStockItemRequestModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fxo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Fxs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Stock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListStockItemRequestModel", propOrder = {
    "fxo",
    "fxs",
    "stock"
})
public class ListStockItemRequestModel {

    @XmlElementRef(name = "Fxo", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<Integer> fxo;
    @XmlElementRef(name = "Fxs", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<Integer> fxs;
    @XmlElementRef(name = "Stock", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> stock;

    /**
     * Gets the value of the fxo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFxo() {
        return fxo;
    }

    /**
     * Sets the value of the fxo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFxo(JAXBElement<Integer> value) {
        this.fxo = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the fxs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFxs() {
        return fxs;
    }

    /**
     * Sets the value of the fxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFxs(JAXBElement<Integer> value) {
        this.fxs = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the stock property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStock() {
        return stock;
    }

    /**
     * Sets the value of the stock property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStock(JAXBElement<String> value) {
        this.stock = ((JAXBElement<String> ) value);
    }

}
