
package org.milleni.dunning.ws.client.crmcontact;

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
 *         &lt;element name="UpdateContactInfoResult" type="{/CustomerInfo/Service/v1}UpdateContactResponseModel" minOccurs="0"/>
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
    "updateContactInfoResult"
})
@XmlRootElement(name = "UpdateContactInfoResponse")
public class UpdateContactInfoResponse {

    @XmlElementRef(name = "UpdateContactInfoResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<UpdateContactResponseModel> updateContactInfoResult;

    /**
     * Gets the value of the updateContactInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateContactResponseModel }{@code >}
     *     
     */
    public JAXBElement<UpdateContactResponseModel> getUpdateContactInfoResult() {
        return updateContactInfoResult;
    }

    /**
     * Sets the value of the updateContactInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateContactResponseModel }{@code >}
     *     
     */
    public void setUpdateContactInfoResult(JAXBElement<UpdateContactResponseModel> value) {
        this.updateContactInfoResult = ((JAXBElement<UpdateContactResponseModel> ) value);
    }

}
