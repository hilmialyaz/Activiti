
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractedNumbersInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractedNumbersInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillingContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Numbers" type="{http://milleni.com/Crm}ArrayOfContractedNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractedNumbersInfo", namespace = "http://milleni.com/Crm", propOrder = {
    "billingContractId",
    "note",
    "numbers"
})
public class ContractedNumbersInfo {

    @XmlElementRef(name = "BillingContractId", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> billingContractId;
    @XmlElementRef(name = "Note", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> note;
    @XmlElementRef(name = "Numbers", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<ArrayOfContractedNumber> numbers;

    /**
     * Gets the value of the billingContractId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillingContractId() {
        return billingContractId;
    }

    /**
     * Sets the value of the billingContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillingContractId(JAXBElement<String> value) {
        this.billingContractId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNote(JAXBElement<String> value) {
        this.note = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numbers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfContractedNumber }{@code >}
     *     
     */
    public JAXBElement<ArrayOfContractedNumber> getNumbers() {
        return numbers;
    }

    /**
     * Sets the value of the numbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfContractedNumber }{@code >}
     *     
     */
    public void setNumbers(JAXBElement<ArrayOfContractedNumber> value) {
        this.numbers = ((JAXBElement<ArrayOfContractedNumber> ) value);
    }

}
