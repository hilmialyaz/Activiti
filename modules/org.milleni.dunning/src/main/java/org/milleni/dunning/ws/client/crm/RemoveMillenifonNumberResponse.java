
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
 *         &lt;element name="RemoveMillenifonNumberResult" type="{/CustomerInfo/Service/v1}RemoveMillenifonNumberResponseModel" minOccurs="0"/>
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
    "removeMillenifonNumberResult"
})
@XmlRootElement(name = "RemoveMillenifonNumberResponse")
public class RemoveMillenifonNumberResponse {

    @XmlElementRef(name = "RemoveMillenifonNumberResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<RemoveMillenifonNumberResponseModel> removeMillenifonNumberResult;

    /**
     * Gets the value of the removeMillenifonNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RemoveMillenifonNumberResponseModel }{@code >}
     *     
     */
    public JAXBElement<RemoveMillenifonNumberResponseModel> getRemoveMillenifonNumberResult() {
        return removeMillenifonNumberResult;
    }

    /**
     * Sets the value of the removeMillenifonNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RemoveMillenifonNumberResponseModel }{@code >}
     *     
     */
    public void setRemoveMillenifonNumberResult(JAXBElement<RemoveMillenifonNumberResponseModel> value) {
        this.removeMillenifonNumberResult = ((JAXBElement<RemoveMillenifonNumberResponseModel> ) value);
    }

}
