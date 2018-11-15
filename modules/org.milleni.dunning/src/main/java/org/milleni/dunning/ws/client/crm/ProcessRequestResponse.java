
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
 *         &lt;element name="ProcessRequestResult" type="{/CustomerInfo/Service/v1}ProcessProcessRequestResponseModel" minOccurs="0"/>
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
    "processRequestResult"
})
@XmlRootElement(name = "ProcessRequestResponse")
public class ProcessRequestResponse {

    @XmlElementRef(name = "ProcessRequestResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ProcessProcessRequestResponseModel> processRequestResult;

    /**
     * Gets the value of the processRequestResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProcessProcessRequestResponseModel }{@code >}
     *     
     */
    public JAXBElement<ProcessProcessRequestResponseModel> getProcessRequestResult() {
        return processRequestResult;
    }

    /**
     * Sets the value of the processRequestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProcessProcessRequestResponseModel }{@code >}
     *     
     */
    public void setProcessRequestResult(JAXBElement<ProcessProcessRequestResponseModel> value) {
        this.processRequestResult = ((JAXBElement<ProcessProcessRequestResponseModel> ) value);
    }

}
