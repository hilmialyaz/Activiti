
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
 *         &lt;element name="AddSoftInvoiceResult" type="{/CustomerInfo/Service/v1}AddSoftInvoiceResponseModel" minOccurs="0"/>
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
    "addSoftInvoiceResult"
})
@XmlRootElement(name = "AddSoftInvoiceResponse")
public class AddSoftInvoiceResponse {

    @XmlElementRef(name = "AddSoftInvoiceResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<AddSoftInvoiceResponseModel> addSoftInvoiceResult;

    /**
     * Gets the value of the addSoftInvoiceResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddSoftInvoiceResponseModel }{@code >}
     *     
     */
    public JAXBElement<AddSoftInvoiceResponseModel> getAddSoftInvoiceResult() {
        return addSoftInvoiceResult;
    }

    /**
     * Sets the value of the addSoftInvoiceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddSoftInvoiceResponseModel }{@code >}
     *     
     */
    public void setAddSoftInvoiceResult(JAXBElement<AddSoftInvoiceResponseModel> value) {
        this.addSoftInvoiceResult = ((JAXBElement<AddSoftInvoiceResponseModel> ) value);
    }

}
