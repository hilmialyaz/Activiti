
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
 *         &lt;element name="QueryCustomerStatusResult" type="{/CustomerInfo/Service/v1}QueryCustomerStatusResponseModel" minOccurs="0"/>
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
    "queryCustomerStatusResult"
})
@XmlRootElement(name = "QueryCustomerStatusResponse")
public class QueryCustomerStatusResponse {

    @XmlElementRef(name = "QueryCustomerStatusResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<QueryCustomerStatusResponseModel> queryCustomerStatusResult;

    /**
     * Gets the value of the queryCustomerStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryCustomerStatusResponseModel }{@code >}
     *     
     */
    public JAXBElement<QueryCustomerStatusResponseModel> getQueryCustomerStatusResult() {
        return queryCustomerStatusResult;
    }

    /**
     * Sets the value of the queryCustomerStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryCustomerStatusResponseModel }{@code >}
     *     
     */
    public void setQueryCustomerStatusResult(JAXBElement<QueryCustomerStatusResponseModel> value) {
        this.queryCustomerStatusResult = ((JAXBElement<QueryCustomerStatusResponseModel> ) value);
    }

}
