
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
 * <p>Java class for CrmContract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrmContract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillingContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommitmentStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ContractCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid"/>
 *         &lt;element name="MainProductType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MigrateInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Partner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartnerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Products" type="{http://milleni.com/Crm}ArrayOfCrmProduct" minOccurs="0"/>
 *         &lt;element name="SalesPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesPersonIdentityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StatusChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="StatusReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrmContract", namespace = "http://milleni.com/Crm", propOrder = {
    "billingContractNumber",
    "commitmentStatus",
    "contractCode",
    "contractDate",
    "id",
    "mainProductType",
    "migrateInfo",
    "partner",
    "partnerCode",
    "products",
    "salesPerson",
    "salesPersonIdentityId",
    "status",
    "statusChangeDate",
    "statusReason"
})
public class CrmContract {

    @XmlElementRef(name = "BillingContractNumber", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> billingContractNumber;
    @XmlElement(name = "CommitmentStatus")
    protected Integer commitmentStatus;
    @XmlElementRef(name = "ContractCode", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> contractCode;
    @XmlElement(name = "ContractDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contractDate;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "MainProductType")
    protected Integer mainProductType;
    @XmlElementRef(name = "MigrateInfo", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> migrateInfo;
    @XmlElementRef(name = "Partner", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> partner;
    @XmlElementRef(name = "PartnerCode", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> partnerCode;
    @XmlElementRef(name = "Products", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCrmProduct> products;
    @XmlElementRef(name = "SalesPerson", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> salesPerson;
    @XmlElementRef(name = "SalesPersonIdentityId", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> salesPersonIdentityId;
    @XmlElement(name = "Status")
    protected Integer status;
    @XmlElement(name = "StatusChangeDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusChangeDate;
    @XmlElementRef(name = "StatusReason", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> statusReason;

    /**
     * Gets the value of the billingContractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillingContractNumber() {
        return billingContractNumber;
    }

    /**
     * Sets the value of the billingContractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillingContractNumber(JAXBElement<String> value) {
        this.billingContractNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the commitmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommitmentStatus() {
        return commitmentStatus;
    }

    /**
     * Sets the value of the commitmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommitmentStatus(Integer value) {
        this.commitmentStatus = value;
    }

    /**
     * Gets the value of the contractCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractCode() {
        return contractCode;
    }

    /**
     * Sets the value of the contractCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractCode(JAXBElement<String> value) {
        this.contractCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contractDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractDate() {
        return contractDate;
    }

    /**
     * Sets the value of the contractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractDate(XMLGregorianCalendar value) {
        this.contractDate = value;
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
     * Gets the value of the mainProductType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMainProductType() {
        return mainProductType;
    }

    /**
     * Sets the value of the mainProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMainProductType(Integer value) {
        this.mainProductType = value;
    }

    /**
     * Gets the value of the migrateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMigrateInfo() {
        return migrateInfo;
    }

    /**
     * Sets the value of the migrateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMigrateInfo(JAXBElement<String> value) {
        this.migrateInfo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartner() {
        return partner;
    }

    /**
     * Sets the value of the partner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartner(JAXBElement<String> value) {
        this.partner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the partnerCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartnerCode() {
        return partnerCode;
    }

    /**
     * Sets the value of the partnerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartnerCode(JAXBElement<String> value) {
        this.partnerCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmProduct }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCrmProduct> getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmProduct }{@code >}
     *     
     */
    public void setProducts(JAXBElement<ArrayOfCrmProduct> value) {
        this.products = ((JAXBElement<ArrayOfCrmProduct> ) value);
    }

    /**
     * Gets the value of the salesPerson property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesPerson() {
        return salesPerson;
    }

    /**
     * Sets the value of the salesPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesPerson(JAXBElement<String> value) {
        this.salesPerson = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the salesPersonIdentityId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesPersonIdentityId() {
        return salesPersonIdentityId;
    }

    /**
     * Sets the value of the salesPersonIdentityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesPersonIdentityId(JAXBElement<String> value) {
        this.salesPersonIdentityId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusChangeDate() {
        return statusChangeDate;
    }

    /**
     * Sets the value of the statusChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusChangeDate(XMLGregorianCalendar value) {
        this.statusChangeDate = value;
    }

    /**
     * Gets the value of the statusReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusReason() {
        return statusReason;
    }

    /**
     * Sets the value of the statusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusReason(JAXBElement<String> value) {
        this.statusReason = ((JAXBElement<String> ) value);
    }

}
