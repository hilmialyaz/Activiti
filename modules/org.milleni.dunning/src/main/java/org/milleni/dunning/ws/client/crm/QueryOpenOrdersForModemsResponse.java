
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
 *         &lt;element name="QueryOpenOrdersForModemsResult" type="{/CustomerInfo/Service/v1}QueryOpenOrdersForDevicesResponseModel" minOccurs="0"/>
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
    "queryOpenOrdersForModemsResult"
})
@XmlRootElement(name = "QueryOpenOrdersForModemsResponse")
public class QueryOpenOrdersForModemsResponse {

    @XmlElementRef(name = "QueryOpenOrdersForModemsResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<QueryOpenOrdersForDevicesResponseModel> queryOpenOrdersForModemsResult;

    /**
     * Gets the value of the queryOpenOrdersForModemsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryOpenOrdersForDevicesResponseModel }{@code >}
     *     
     */
    public JAXBElement<QueryOpenOrdersForDevicesResponseModel> getQueryOpenOrdersForModemsResult() {
        return queryOpenOrdersForModemsResult;
    }

    /**
     * Sets the value of the queryOpenOrdersForModemsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryOpenOrdersForDevicesResponseModel }{@code >}
     *     
     */
    public void setQueryOpenOrdersForModemsResult(JAXBElement<QueryOpenOrdersForDevicesResponseModel> value) {
        this.queryOpenOrdersForModemsResult = ((JAXBElement<QueryOpenOrdersForDevicesResponseModel> ) value);
    }

}
