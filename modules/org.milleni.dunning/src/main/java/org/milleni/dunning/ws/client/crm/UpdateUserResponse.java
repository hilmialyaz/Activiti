
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
 *         &lt;element name="UpdateUserResult" type="{/CustomerInfo/Service/v1}UserResponseModel" minOccurs="0"/>
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
    "updateUserResult"
})
@XmlRootElement(name = "UpdateUserResponse")
public class UpdateUserResponse {

    @XmlElementRef(name = "UpdateUserResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<UserResponseModel> updateUserResult;

    /**
     * Gets the value of the updateUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserResponseModel }{@code >}
     *     
     */
    public JAXBElement<UserResponseModel> getUpdateUserResult() {
        return updateUserResult;
    }

    /**
     * Sets the value of the updateUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserResponseModel }{@code >}
     *     
     */
    public void setUpdateUserResult(JAXBElement<UserResponseModel> value) {
        this.updateUserResult = ((JAXBElement<UserResponseModel> ) value);
    }

}
