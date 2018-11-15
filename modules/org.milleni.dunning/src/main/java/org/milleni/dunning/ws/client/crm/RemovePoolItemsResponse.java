
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
 *         &lt;element name="RemovePoolItemsResult" type="{/CustomerInfo/Service/v1}RemovePoolItemsResponseModel" minOccurs="0"/>
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
    "removePoolItemsResult"
})
@XmlRootElement(name = "RemovePoolItemsResponse")
public class RemovePoolItemsResponse {

    @XmlElementRef(name = "RemovePoolItemsResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<RemovePoolItemsResponseModel> removePoolItemsResult;

    /**
     * Gets the value of the removePoolItemsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RemovePoolItemsResponseModel }{@code >}
     *     
     */
    public JAXBElement<RemovePoolItemsResponseModel> getRemovePoolItemsResult() {
        return removePoolItemsResult;
    }

    /**
     * Sets the value of the removePoolItemsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RemovePoolItemsResponseModel }{@code >}
     *     
     */
    public void setRemovePoolItemsResult(JAXBElement<RemovePoolItemsResponseModel> value) {
        this.removePoolItemsResult = ((JAXBElement<RemovePoolItemsResponseModel> ) value);
    }

}
