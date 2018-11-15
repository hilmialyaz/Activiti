
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
 *         &lt;element name="AddPoolItemsResult" type="{/CustomerInfo/Service/v1}AddPoolItemsResponseModel" minOccurs="0"/>
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
    "addPoolItemsResult"
})
@XmlRootElement(name = "AddPoolItemsResponse")
public class AddPoolItemsResponse {

    @XmlElementRef(name = "AddPoolItemsResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<AddPoolItemsResponseModel> addPoolItemsResult;

    /**
     * Gets the value of the addPoolItemsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddPoolItemsResponseModel }{@code >}
     *     
     */
    public JAXBElement<AddPoolItemsResponseModel> getAddPoolItemsResult() {
        return addPoolItemsResult;
    }

    /**
     * Sets the value of the addPoolItemsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddPoolItemsResponseModel }{@code >}
     *     
     */
    public void setAddPoolItemsResult(JAXBElement<AddPoolItemsResponseModel> value) {
        this.addPoolItemsResult = ((JAXBElement<AddPoolItemsResponseModel> ) value);
    }

}
