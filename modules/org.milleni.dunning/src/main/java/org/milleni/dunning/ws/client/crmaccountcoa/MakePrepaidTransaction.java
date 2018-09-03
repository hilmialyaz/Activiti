
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
 *         &lt;element name="request" type="{/CustomerInfo/Service/v1}MakePrepaidTransactionRequestModel" minOccurs="0"/>
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
@XmlRootElement(name = "MakePrepaidTransaction")
public class MakePrepaidTransaction {

    @XmlElementRef(name = "request", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<MakePrepaidTransactionRequestModel> request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MakePrepaidTransactionRequestModel }{@code >}
     *     
     */
    public JAXBElement<MakePrepaidTransactionRequestModel> getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MakePrepaidTransactionRequestModel }{@code >}
     *     
     */
    public void setRequest(JAXBElement<MakePrepaidTransactionRequestModel> value) {
        this.request = ((JAXBElement<MakePrepaidTransactionRequestModel> ) value);
    }

}
