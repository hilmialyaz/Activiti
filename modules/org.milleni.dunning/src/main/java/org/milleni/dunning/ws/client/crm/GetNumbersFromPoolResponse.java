
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
 *         &lt;element name="GetNumbersFromPoolResult" type="{/CustomerInfo/Service/v1}GetNumbersFromPoolResponseModel" minOccurs="0"/>
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
    "getNumbersFromPoolResult"
})
@XmlRootElement(name = "GetNumbersFromPoolResponse")
public class GetNumbersFromPoolResponse {

    @XmlElementRef(name = "GetNumbersFromPoolResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<GetNumbersFromPoolResponseModel> getNumbersFromPoolResult;

    /**
     * Gets the value of the getNumbersFromPoolResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetNumbersFromPoolResponseModel }{@code >}
     *     
     */
    public JAXBElement<GetNumbersFromPoolResponseModel> getGetNumbersFromPoolResult() {
        return getNumbersFromPoolResult;
    }

    /**
     * Sets the value of the getNumbersFromPoolResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetNumbersFromPoolResponseModel }{@code >}
     *     
     */
    public void setGetNumbersFromPoolResult(JAXBElement<GetNumbersFromPoolResponseModel> value) {
        this.getNumbersFromPoolResult = ((JAXBElement<GetNumbersFromPoolResponseModel> ) value);
    }

}
