
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryNumberPoolItemResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryNumberPoolItemResponseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberPoolItem" type="{http://milleni.com/Crm}NumberPoolItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryNumberPoolItemResponseModel", propOrder = {
    "numberPoolItem"
})
public class QueryNumberPoolItemResponseModel {

    @XmlElementRef(name = "NumberPoolItem", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<NumberPoolItem> numberPoolItem;

    /**
     * Gets the value of the numberPoolItem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NumberPoolItem }{@code >}
     *     
     */
    public JAXBElement<NumberPoolItem> getNumberPoolItem() {
        return numberPoolItem;
    }

    /**
     * Sets the value of the numberPoolItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NumberPoolItem }{@code >}
     *     
     */
    public void setNumberPoolItem(JAXBElement<NumberPoolItem> value) {
        this.numberPoolItem = ((JAXBElement<NumberPoolItem> ) value);
    }

}
