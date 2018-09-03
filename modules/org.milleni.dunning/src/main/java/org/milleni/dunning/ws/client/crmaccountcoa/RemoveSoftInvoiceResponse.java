
package org.milleni.dunning.ws.client.crmaccountcoa;

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
 *         &lt;element name="RemoveSoftInvoiceResult" type="{/CustomerInfo/Service/v1}RemoveSoftInvoiceResponseModel" minOccurs="0"/>
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
    "removeSoftInvoiceResult"
})
@XmlRootElement(name = "RemoveSoftInvoiceResponse")
public class RemoveSoftInvoiceResponse {

    @XmlElementRef(name = "RemoveSoftInvoiceResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<RemoveSoftInvoiceResponseModel> removeSoftInvoiceResult;

    /**
     * Gets the value of the removeSoftInvoiceResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RemoveSoftInvoiceResponseModel }{@code >}
     *     
     */
    public JAXBElement<RemoveSoftInvoiceResponseModel> getRemoveSoftInvoiceResult() {
        return removeSoftInvoiceResult;
    }

    /**
     * Sets the value of the removeSoftInvoiceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RemoveSoftInvoiceResponseModel }{@code >}
     *     
     */
    public void setRemoveSoftInvoiceResult(JAXBElement<RemoveSoftInvoiceResponseModel> value) {
        this.removeSoftInvoiceResult = ((JAXBElement<RemoveSoftInvoiceResponseModel> ) value);
    }

}
