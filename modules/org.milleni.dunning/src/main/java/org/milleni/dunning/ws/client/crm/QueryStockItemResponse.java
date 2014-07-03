
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryStockItemResult" type="{/CustomerInfo/Service/v1}QueryStockItemResponseModel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "queryStockItemResult"
})
@XmlRootElement(name = "QueryStockItemResponse")
public class QueryStockItemResponse {

    @XmlElementRef(name = "QueryStockItemResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<QueryStockItemResponseModel> queryStockItemResult;

    /**
     * Gets the value of the queryStockItemResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryStockItemResponseModel }{@code >}
     *     
     */
    public JAXBElement<QueryStockItemResponseModel> getQueryStockItemResult() {
        return queryStockItemResult;
    }

    /**
     * Sets the value of the queryStockItemResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryStockItemResponseModel }{@code >}
     *     
     */
    public void setQueryStockItemResult(JAXBElement<QueryStockItemResponseModel> value) {
        this.queryStockItemResult = ((JAXBElement<QueryStockItemResponseModel> ) value);
    }

}
