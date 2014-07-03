
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
 *         &lt;element name="QueryCustomerResult" type="{/CustomerInfo/Service/v1}QueryCustomerResponseModel" minOccurs="0"/>
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
    "queryCustomerResult"
})
@XmlRootElement(name = "QueryCustomerResponse")
public class QueryCustomerResponse {

    @XmlElementRef(name = "QueryCustomerResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<QueryCustomerResponseModel> queryCustomerResult;

    /**
     * Gets the value of the queryCustomerResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryCustomerResponseModel }{@code >}
     *     
     */
    public JAXBElement<QueryCustomerResponseModel> getQueryCustomerResult() {
        return queryCustomerResult;
    }

    /**
     * Sets the value of the queryCustomerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryCustomerResponseModel }{@code >}
     *     
     */
    public void setQueryCustomerResult(JAXBElement<QueryCustomerResponseModel> value) {
        this.queryCustomerResult = ((JAXBElement<QueryCustomerResponseModel> ) value);
    }

}
