
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
 *         &lt;element name="ReplaceStockInfoDeviceProductResult" type="{/CustomerInfo/Service/v1}ReplaceStockInfoDeviceProductResponseModel" minOccurs="0"/>
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
    "replaceStockInfoDeviceProductResult"
})
@XmlRootElement(name = "ReplaceStockInfoDeviceProductResponse")
public class ReplaceStockInfoDeviceProductResponse {

    @XmlElementRef(name = "ReplaceStockInfoDeviceProductResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ReplaceStockInfoDeviceProductResponseModel> replaceStockInfoDeviceProductResult;

    /**
     * Gets the value of the replaceStockInfoDeviceProductResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReplaceStockInfoDeviceProductResponseModel }{@code >}
     *     
     */
    public JAXBElement<ReplaceStockInfoDeviceProductResponseModel> getReplaceStockInfoDeviceProductResult() {
        return replaceStockInfoDeviceProductResult;
    }

    /**
     * Sets the value of the replaceStockInfoDeviceProductResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReplaceStockInfoDeviceProductResponseModel }{@code >}
     *     
     */
    public void setReplaceStockInfoDeviceProductResult(JAXBElement<ReplaceStockInfoDeviceProductResponseModel> value) {
        this.replaceStockInfoDeviceProductResult = ((JAXBElement<ReplaceStockInfoDeviceProductResponseModel> ) value);
    }

}
