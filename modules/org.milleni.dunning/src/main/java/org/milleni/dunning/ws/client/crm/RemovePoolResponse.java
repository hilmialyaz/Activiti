
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
 *         &lt;element name="RemovePoolResult" type="{/CustomerInfo/Service/v1}RemovePoolResponseModel" minOccurs="0"/>
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
    "removePoolResult"
})
@XmlRootElement(name = "RemovePoolResponse")
public class RemovePoolResponse {

    @XmlElementRef(name = "RemovePoolResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<RemovePoolResponseModel> removePoolResult;

    /**
     * Gets the value of the removePoolResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RemovePoolResponseModel }{@code >}
     *     
     */
    public JAXBElement<RemovePoolResponseModel> getRemovePoolResult() {
        return removePoolResult;
    }

    /**
     * Sets the value of the removePoolResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RemovePoolResponseModel }{@code >}
     *     
     */
    public void setRemovePoolResult(JAXBElement<RemovePoolResponseModel> value) {
        this.removePoolResult = ((JAXBElement<RemovePoolResponseModel> ) value);
    }

}
