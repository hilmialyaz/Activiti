
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
 *         &lt;element name="QueryStockItemOuidResult" type="{/CustomerInfo/Service/v1}QueryStockItemOuidResponseModel" minOccurs="0"/>
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
    "queryStockItemOuidResult"
})
@XmlRootElement(name = "QueryStockItemOuidResponse")
public class QueryStockItemOuidResponse {

    @XmlElementRef(name = "QueryStockItemOuidResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<QueryStockItemOuidResponseModel> queryStockItemOuidResult;

    /**
     * Gets the value of the queryStockItemOuidResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryStockItemOuidResponseModel }{@code >}
     *     
     */
    public JAXBElement<QueryStockItemOuidResponseModel> getQueryStockItemOuidResult() {
        return queryStockItemOuidResult;
    }

    /**
     * Sets the value of the queryStockItemOuidResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryStockItemOuidResponseModel }{@code >}
     *     
     */
    public void setQueryStockItemOuidResult(JAXBElement<QueryStockItemOuidResponseModel> value) {
        this.queryStockItemOuidResult = ((JAXBElement<QueryStockItemOuidResponseModel> ) value);
    }

}
