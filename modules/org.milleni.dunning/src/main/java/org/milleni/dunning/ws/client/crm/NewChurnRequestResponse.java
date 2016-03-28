
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
 *         &lt;element name="NewChurnRequestResult" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel}NewChurnRequestResponseModel" minOccurs="0"/>
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
    "newChurnRequestResult"
})
@XmlRootElement(name = "NewChurnRequestResponse")
public class NewChurnRequestResponse {

    @XmlElementRef(name = "NewChurnRequestResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<NewChurnRequestResponseModel> newChurnRequestResult;

    /**
     * Gets the value of the newChurnRequestResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NewChurnRequestResponseModel }{@code >}
     *     
     */
    public JAXBElement<NewChurnRequestResponseModel> getNewChurnRequestResult() {
        return newChurnRequestResult;
    }

    /**
     * Sets the value of the newChurnRequestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NewChurnRequestResponseModel }{@code >}
     *     
     */
    public void setNewChurnRequestResult(JAXBElement<NewChurnRequestResponseModel> value) {
        this.newChurnRequestResult = ((JAXBElement<NewChurnRequestResponseModel> ) value);
    }

}
