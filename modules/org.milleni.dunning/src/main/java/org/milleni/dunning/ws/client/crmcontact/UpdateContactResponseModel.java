
package org.milleni.dunning.ws.client.crmcontact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateContactResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateContactResponseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UpdateContactEror" type="{/CustomerInfo/Service/v1}UpdateContactError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateContactResponseModel", propOrder = {
    "errorMessage",
    "result",
    "updateContactEror"
})
public class UpdateContactResponseModel {

    @XmlElementRef(name = "ErrorMessage", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> errorMessage;
    @XmlElement(name = "Result")
    protected boolean result;
    @XmlElement(name = "UpdateContactEror")
    protected UpdateContactError updateContactEror;

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorMessage(JAXBElement<String> value) {
        this.errorMessage = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the result property.
     * 
     */
    public boolean isResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     */
    public void setResult(boolean value) {
        this.result = value;
    }

    /**
     * Gets the value of the updateContactEror property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateContactError }
     *     
     */
    public UpdateContactError getUpdateContactEror() {
        return updateContactEror;
    }

    /**
     * Sets the value of the updateContactEror property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateContactError }
     *     
     */
    public void setUpdateContactEror(UpdateContactError value) {
        this.updateContactEror = value;
    }

}
