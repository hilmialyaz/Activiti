
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetNumbersFromPoolResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetNumbersFromPoolResponseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Numbers" type="{http://milleni.com/Crm}ArrayOfNumberPoolItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNumbersFromPoolResponseModel", propOrder = {
    "numbers"
})
public class GetNumbersFromPoolResponseModel {

    @XmlElementRef(name = "Numbers", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ArrayOfNumberPoolItem> numbers;

    /**
     * Gets the value of the numbers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNumberPoolItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNumberPoolItem> getNumbers() {
        return numbers;
    }

    /**
     * Sets the value of the numbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNumberPoolItem }{@code >}
     *     
     */
    public void setNumbers(JAXBElement<ArrayOfNumberPoolItem> value) {
        this.numbers = ((JAXBElement<ArrayOfNumberPoolItem> ) value);
    }

}
