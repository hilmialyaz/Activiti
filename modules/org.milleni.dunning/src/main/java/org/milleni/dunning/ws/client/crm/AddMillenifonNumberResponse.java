
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
 *         &lt;element name="AddMillenifonNumberResult" type="{/CustomerInfo/Service/v1}AddMillenifonNumberResponseModel" minOccurs="0"/>
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
    "addMillenifonNumberResult"
})
@XmlRootElement(name = "AddMillenifonNumberResponse")
public class AddMillenifonNumberResponse {

    @XmlElementRef(name = "AddMillenifonNumberResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<AddMillenifonNumberResponseModel> addMillenifonNumberResult;

    /**
     * Gets the value of the addMillenifonNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddMillenifonNumberResponseModel }{@code >}
     *     
     */
    public JAXBElement<AddMillenifonNumberResponseModel> getAddMillenifonNumberResult() {
        return addMillenifonNumberResult;
    }

    /**
     * Sets the value of the addMillenifonNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddMillenifonNumberResponseModel }{@code >}
     *     
     */
    public void setAddMillenifonNumberResult(JAXBElement<AddMillenifonNumberResponseModel> value) {
        this.addMillenifonNumberResult = ((JAXBElement<AddMillenifonNumberResponseModel> ) value);
    }

}
