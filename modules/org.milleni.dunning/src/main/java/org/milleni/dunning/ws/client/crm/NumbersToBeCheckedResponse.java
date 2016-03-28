
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
 *         &lt;element name="NumbersToBeCheckedResult" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel}NumbersToBeCheckedResponseModel" minOccurs="0"/>
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
    "numbersToBeCheckedResult"
})
@XmlRootElement(name = "NumbersToBeCheckedResponse")
public class NumbersToBeCheckedResponse {

    @XmlElementRef(name = "NumbersToBeCheckedResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<NumbersToBeCheckedResponseModel> numbersToBeCheckedResult;

    /**
     * Gets the value of the numbersToBeCheckedResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NumbersToBeCheckedResponseModel }{@code >}
     *     
     */
    public JAXBElement<NumbersToBeCheckedResponseModel> getNumbersToBeCheckedResult() {
        return numbersToBeCheckedResult;
    }

    /**
     * Sets the value of the numbersToBeCheckedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NumbersToBeCheckedResponseModel }{@code >}
     *     
     */
    public void setNumbersToBeCheckedResult(JAXBElement<NumbersToBeCheckedResponseModel> value) {
        this.numbersToBeCheckedResult = ((JAXBElement<NumbersToBeCheckedResponseModel> ) value);
    }

}
