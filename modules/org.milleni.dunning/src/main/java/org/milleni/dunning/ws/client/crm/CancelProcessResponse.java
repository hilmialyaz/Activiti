
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
 *         &lt;element name="CancelProcessResult" type="{/CustomerInfo/Service/v1}CancelProcessResponseModel" minOccurs="0"/>
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
    "cancelProcessResult"
})
@XmlRootElement(name = "CancelProcessResponse")
public class CancelProcessResponse {

    @XmlElementRef(name = "CancelProcessResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<CancelProcessResponseModel> cancelProcessResult;

    /**
     * Gets the value of the cancelProcessResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CancelProcessResponseModel }{@code >}
     *     
     */
    public JAXBElement<CancelProcessResponseModel> getCancelProcessResult() {
        return cancelProcessResult;
    }

    /**
     * Sets the value of the cancelProcessResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CancelProcessResponseModel }{@code >}
     *     
     */
    public void setCancelProcessResult(JAXBElement<CancelProcessResponseModel> value) {
        this.cancelProcessResult = ((JAXBElement<CancelProcessResponseModel> ) value);
    }

}
