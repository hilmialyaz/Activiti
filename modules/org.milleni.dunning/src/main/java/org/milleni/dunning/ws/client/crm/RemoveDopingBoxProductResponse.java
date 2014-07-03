
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
 *         &lt;element name="RemoveDopingBoxProductResult" type="{/CustomerInfo/Service/v1}RemoveDopingBoxProductResponseModel" minOccurs="0"/>
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
    "removeDopingBoxProductResult"
})
@XmlRootElement(name = "RemoveDopingBoxProductResponse")
public class RemoveDopingBoxProductResponse {

    @XmlElementRef(name = "RemoveDopingBoxProductResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<RemoveDopingBoxProductResponseModel> removeDopingBoxProductResult;

    /**
     * Gets the value of the removeDopingBoxProductResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RemoveDopingBoxProductResponseModel }{@code >}
     *     
     */
    public JAXBElement<RemoveDopingBoxProductResponseModel> getRemoveDopingBoxProductResult() {
        return removeDopingBoxProductResult;
    }

    /**
     * Sets the value of the removeDopingBoxProductResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RemoveDopingBoxProductResponseModel }{@code >}
     *     
     */
    public void setRemoveDopingBoxProductResult(JAXBElement<RemoveDopingBoxProductResponseModel> value) {
        this.removeDopingBoxProductResult = ((JAXBElement<RemoveDopingBoxProductResponseModel> ) value);
    }

}
