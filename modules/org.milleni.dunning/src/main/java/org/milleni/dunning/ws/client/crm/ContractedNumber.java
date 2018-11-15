
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractedNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractedNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivationReason" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ActivationReasonDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasFax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsAddPhoneBook" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractedNumber", namespace = "http://milleni.com/Crm", propOrder = {
    "activationReason",
    "activationReasonDesc",
    "hasFax",
    "isAddPhoneBook",
    "number",
    "numberType"
})
public class ContractedNumber {

    @XmlElementRef(name = "ActivationReason", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<Long> activationReason;
    @XmlElementRef(name = "ActivationReasonDesc", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> activationReasonDesc;
    @XmlElement(name = "HasFax")
    protected Boolean hasFax;
    @XmlElement(name = "IsAddPhoneBook")
    protected Boolean isAddPhoneBook;
    @XmlElementRef(name = "Number", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> number;
    @XmlElementRef(name = "NumberType", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> numberType;

    /**
     * Gets the value of the activationReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getActivationReason() {
        return activationReason;
    }

    /**
     * Sets the value of the activationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setActivationReason(JAXBElement<Long> value) {
        this.activationReason = ((JAXBElement<Long> ) value);
    }

    /**
     * Gets the value of the activationReasonDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActivationReasonDesc() {
        return activationReasonDesc;
    }

    /**
     * Sets the value of the activationReasonDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActivationReasonDesc(JAXBElement<String> value) {
        this.activationReasonDesc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hasFax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasFax() {
        return hasFax;
    }

    /**
     * Sets the value of the hasFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasFax(Boolean value) {
        this.hasFax = value;
    }

    /**
     * Gets the value of the isAddPhoneBook property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAddPhoneBook() {
        return isAddPhoneBook;
    }

    /**
     * Sets the value of the isAddPhoneBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAddPhoneBook(Boolean value) {
        this.isAddPhoneBook = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumber(JAXBElement<String> value) {
        this.number = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numberType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumberType() {
        return numberType;
    }

    /**
     * Sets the value of the numberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumberType(JAXBElement<String> value) {
        this.numberType = ((JAXBElement<String> ) value);
    }

}
