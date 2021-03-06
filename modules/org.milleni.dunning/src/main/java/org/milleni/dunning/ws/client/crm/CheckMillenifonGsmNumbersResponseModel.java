
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckMillenifonGsmNumbersResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckMillenifonGsmNumbersResponseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Numbers" type="{/CustomerInfo/Service/v1}ArrayOfcheckNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckMillenifonGsmNumbersResponseModel", propOrder = {
    "numbers"
})
public class CheckMillenifonGsmNumbersResponseModel {

    @XmlElementRef(name = "Numbers", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ArrayOfcheckNumber> numbers;

    /**
     * Gets the value of the numbers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfcheckNumber }{@code >}
     *     
     */
    public JAXBElement<ArrayOfcheckNumber> getNumbers() {
        return numbers;
    }

    /**
     * Sets the value of the numbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfcheckNumber }{@code >}
     *     
     */
    public void setNumbers(JAXBElement<ArrayOfcheckNumber> value) {
        this.numbers = ((JAXBElement<ArrayOfcheckNumber> ) value);
    }

}
