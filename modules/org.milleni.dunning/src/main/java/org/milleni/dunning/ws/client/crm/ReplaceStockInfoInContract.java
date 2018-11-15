
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
 *         &lt;element name="request" type="{/CustomerInfo/Service/v1}ReplaceStockInfoInContractRequestModel" minOccurs="0"/>
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
    "request"
})
@XmlRootElement(name = "ReplaceStockInfoInContract")
public class ReplaceStockInfoInContract {

    @XmlElementRef(name = "request", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ReplaceStockInfoInContractRequestModel> request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReplaceStockInfoInContractRequestModel }{@code >}
     *     
     */
    public JAXBElement<ReplaceStockInfoInContractRequestModel> getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReplaceStockInfoInContractRequestModel }{@code >}
     *     
     */
    public void setRequest(JAXBElement<ReplaceStockInfoInContractRequestModel> value) {
        this.request = ((JAXBElement<ReplaceStockInfoInContractRequestModel> ) value);
    }

}
