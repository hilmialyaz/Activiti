
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddNumbersToContractRequestModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddNumbersToContractRequestModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumbersInfo" type="{http://milleni.com/Crm}ContractedNumbersInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddNumbersToContractRequestModel", propOrder = {
    "numbersInfo"
})
public class AddNumbersToContractRequestModel {

    @XmlElementRef(name = "NumbersInfo", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ContractedNumbersInfo> numbersInfo;

    /**
     * Gets the value of the numbersInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContractedNumbersInfo }{@code >}
     *     
     */
    public JAXBElement<ContractedNumbersInfo> getNumbersInfo() {
        return numbersInfo;
    }

    /**
     * Sets the value of the numbersInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContractedNumbersInfo }{@code >}
     *     
     */
    public void setNumbersInfo(JAXBElement<ContractedNumbersInfo> value) {
        this.numbersInfo = ((JAXBElement<ContractedNumbersInfo> ) value);
    }

}
