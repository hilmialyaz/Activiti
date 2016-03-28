
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrmContact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrmContact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Adddresses" type="{http://milleni.com/Crm}ArrayOfCrmAddress" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emails" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm}ArrayOfCrmEmail" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid"/>
 *         &lt;element name="IsPrimary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phones" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm}ArrayOfCrmPhone" minOccurs="0"/>
 *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebAddress" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm}ArrayOfCrmWebAddress" minOccurs="0"/>
 *         &lt;element name="WorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrmContact", namespace = "http://milleni.com/Crm", propOrder = {
    "adddresses",
    "email",
    "emails",
    "id",
    "isPrimary",
    "mobilePhone",
    "name",
    "phones",
    "surname",
    "webAddress",
    "workPhone"
})
public class CrmContact {

    @XmlElementRef(name = "Adddresses", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCrmAddress> adddresses;
    @XmlElementRef(name = "Email", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "Emails", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCrmEmail> emails;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "IsPrimary")
    protected Boolean isPrimary;
    @XmlElementRef(name = "MobilePhone", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> mobilePhone;
    @XmlElementRef(name = "Name", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Phones", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCrmPhone> phones;
    @XmlElementRef(name = "Surname", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> surname;
    @XmlElementRef(name = "WebAddress", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCrmWebAddress> webAddress;
    @XmlElementRef(name = "WorkPhone", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> workPhone;

    /**
     * Gets the value of the adddresses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmAddress }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCrmAddress> getAdddresses() {
        return adddresses;
    }

    /**
     * Sets the value of the adddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmAddress }{@code >}
     *     
     */
    public void setAdddresses(JAXBElement<ArrayOfCrmAddress> value) {
        this.adddresses = ((JAXBElement<ArrayOfCrmAddress> ) value);
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmEmail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCrmEmail> getEmails() {
        return emails;
    }

    /**
     * Sets the value of the emails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmEmail }{@code >}
     *     
     */
    public void setEmails(JAXBElement<ArrayOfCrmEmail> value) {
        this.emails = ((JAXBElement<ArrayOfCrmEmail> ) value);
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the isPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrimary() {
        return isPrimary;
    }

    /**
     * Sets the value of the isPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimary(Boolean value) {
        this.isPrimary = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobilePhone(JAXBElement<String> value) {
        this.mobilePhone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phones property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmPhone }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCrmPhone> getPhones() {
        return phones;
    }

    /**
     * Sets the value of the phones property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmPhone }{@code >}
     *     
     */
    public void setPhones(JAXBElement<ArrayOfCrmPhone> value) {
        this.phones = ((JAXBElement<ArrayOfCrmPhone> ) value);
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSurname(JAXBElement<String> value) {
        this.surname = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the webAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmWebAddress }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCrmWebAddress> getWebAddress() {
        return webAddress;
    }

    /**
     * Sets the value of the webAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmWebAddress }{@code >}
     *     
     */
    public void setWebAddress(JAXBElement<ArrayOfCrmWebAddress> value) {
        this.webAddress = ((JAXBElement<ArrayOfCrmWebAddress> ) value);
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkPhone(JAXBElement<String> value) {
        this.workPhone = ((JAXBElement<String> ) value);
    }

}
