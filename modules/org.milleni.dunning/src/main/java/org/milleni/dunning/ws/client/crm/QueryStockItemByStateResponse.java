
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
 *         &lt;element name="QueryStockItemByStateResult" type="{/CustomerInfo/Service/v1}QueryStockItemResponseModel" minOccurs="0"/>
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
    "queryStockItemByStateResult"
})
@XmlRootElement(name = "QueryStockItemByStateResponse")
public class QueryStockItemByStateResponse {

    @XmlElementRef(name = "QueryStockItemByStateResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<QueryStockItemResponseModel> queryStockItemByStateResult;

    /**
     * Gets the value of the queryStockItemByStateResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryStockItemResponseModel }{@code >}
     *     
     */
    public JAXBElement<QueryStockItemResponseModel> getQueryStockItemByStateResult() {
        return queryStockItemByStateResult;
    }

    /**
     * Sets the value of the queryStockItemByStateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryStockItemResponseModel }{@code >}
     *     
     */
    public void setQueryStockItemByStateResult(JAXBElement<QueryStockItemResponseModel> value) {
        this.queryStockItemByStateResult = ((JAXBElement<QueryStockItemResponseModel> ) value);
    }

}
