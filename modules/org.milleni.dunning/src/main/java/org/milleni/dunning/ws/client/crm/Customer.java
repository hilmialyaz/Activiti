
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Accounts" type="{http://milleni.com/Crm}ArrayOfCrmAccount" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contacts" type="{http://milleni.com/Crm}ArrayOfCrmContact" minOccurs="0"/>
 *         &lt;element name="CustomerType" type="{http://milleni.com/Common/Customer}CustomerTypeEnum" minOccurs="0"/>
 *         &lt;element name="ExemptionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid"/>
 *         &lt;element name="IsExempted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MotherMaidenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pools" type="{http://milleni.com/Crm}ArrayOfCrmPool" minOccurs="0"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sex" type="{http://milleni.com/Common/Customer}SexEnum" minOccurs="0"/>
 *         &lt;element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxOfficeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Tckn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkingArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", namespace = "http://milleni.com/Crm", propOrder = {
    "accounts",
    "birthDate",
    "code",
    "contacts",
    "customerType",
    "exemptionNumber",
    "fatherName",
    "fullName",
    "id",
    "isExempted",
    "motherMaidenName",
    "name",
    "nationality",
    "passportNo",
    "pools",
    "registrationNumber",
    "sector",
    "sex",
    "shortName",
    "subSector",
    "surname",
    "taxOfficeId",
    "tckn",
    "workingArea"
})
public class Customer {

    @XmlElementRef(name = "Accounts", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCrmAccount> accounts;
    @XmlElement(name = "BirthDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    @XmlElementRef(name = "Code", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> code;
    @XmlElementRef(name = "Contacts", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCrmContact> contacts;
    @XmlElement(name = "CustomerType")
    protected CustomerTypeEnum customerType;
    @XmlElementRef(name = "ExemptionNumber", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> exemptionNumber;
    @XmlElementRef(name = "FatherName", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> fatherName;
    @XmlElementRef(name = "FullName", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> fullName;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "IsExempted")
    protected Boolean isExempted;
    @XmlElementRef(name = "MotherMaidenName", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> motherMaidenName;
    @XmlElementRef(name = "Name", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Nationality", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> nationality;
    @XmlElementRef(name = "PassportNo", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> passportNo;
    @XmlElementRef(name = "Pools", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCrmPool> pools;
    @XmlElementRef(name = "RegistrationNumber", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> registrationNumber;
    @XmlElementRef(name = "Sector", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> sector;
    @XmlElement(name = "Sex")
    protected SexEnum sex;
    @XmlElementRef(name = "ShortName", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> shortName;
    @XmlElementRef(name = "SubSector", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> subSector;
    @XmlElementRef(name = "Surname", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> surname;
    @XmlElement(name = "TaxOfficeId")
    protected Integer taxOfficeId;
    @XmlElementRef(name = "Tckn", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> tckn;
    @XmlElementRef(name = "WorkingArea", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> workingArea;

    /**
     * Gets the value of the accounts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmAccount }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCrmAccount> getAccounts() {
        return accounts;
    }

    /**
     * Sets the value of the accounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmAccount }{@code >}
     *     
     */
    public void setAccounts(JAXBElement<ArrayOfCrmAccount> value) {
        this.accounts = ((JAXBElement<ArrayOfCrmAccount> ) value);
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCode(JAXBElement<String> value) {
        this.code = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmContact }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCrmContact> getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmContact }{@code >}
     *     
     */
    public void setContacts(JAXBElement<ArrayOfCrmContact> value) {
        this.contacts = ((JAXBElement<ArrayOfCrmContact> ) value);
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerTypeEnum }
     *     
     */
    public CustomerTypeEnum getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerTypeEnum }
     *     
     */
    public void setCustomerType(CustomerTypeEnum value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the exemptionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExemptionNumber() {
        return exemptionNumber;
    }

    /**
     * Sets the value of the exemptionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExemptionNumber(JAXBElement<String> value) {
        this.exemptionNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fatherName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFatherName() {
        return fatherName;
    }

    /**
     * Sets the value of the fatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFatherName(JAXBElement<String> value) {
        this.fatherName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFullName(JAXBElement<String> value) {
        this.fullName = ((JAXBElement<String> ) value);
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
     * Gets the value of the isExempted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExempted() {
        return isExempted;
    }

    /**
     * Sets the value of the isExempted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExempted(Boolean value) {
        this.isExempted = value;
    }

    /**
     * Gets the value of the motherMaidenName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMotherMaidenName() {
        return motherMaidenName;
    }

    /**
     * Sets the value of the motherMaidenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMotherMaidenName(JAXBElement<String> value) {
        this.motherMaidenName = ((JAXBElement<String> ) value);
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
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNationality(JAXBElement<String> value) {
        this.nationality = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the passportNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassportNo() {
        return passportNo;
    }

    /**
     * Sets the value of the passportNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassportNo(JAXBElement<String> value) {
        this.passportNo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pools property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmPool }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCrmPool> getPools() {
        return pools;
    }

    /**
     * Sets the value of the pools property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmPool }{@code >}
     *     
     */
    public void setPools(JAXBElement<ArrayOfCrmPool> value) {
        this.pools = ((JAXBElement<ArrayOfCrmPool> ) value);
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationNumber(JAXBElement<String> value) {
        this.registrationNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sector property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSector() {
        return sector;
    }

    /**
     * Sets the value of the sector property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSector(JAXBElement<String> value) {
        this.sector = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link SexEnum }
     *     
     */
    public SexEnum getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link SexEnum }
     *     
     */
    public void setSex(SexEnum value) {
        this.sex = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShortName(JAXBElement<String> value) {
        this.shortName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the subSector property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubSector() {
        return subSector;
    }

    /**
     * Sets the value of the subSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubSector(JAXBElement<String> value) {
        this.subSector = ((JAXBElement<String> ) value);
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
     * Gets the value of the taxOfficeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxOfficeId() {
        return taxOfficeId;
    }

    /**
     * Sets the value of the taxOfficeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxOfficeId(Integer value) {
        this.taxOfficeId = value;
    }

    /**
     * Gets the value of the tckn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTckn() {
        return tckn;
    }

    /**
     * Sets the value of the tckn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTckn(JAXBElement<String> value) {
        this.tckn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the workingArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkingArea() {
        return workingArea;
    }

    /**
     * Sets the value of the workingArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkingArea(JAXBElement<String> value) {
        this.workingArea = ((JAXBElement<String> ) value);
    }

}
