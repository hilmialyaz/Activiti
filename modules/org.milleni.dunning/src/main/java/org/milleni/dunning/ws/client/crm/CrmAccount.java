
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CrmAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrmAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BBKNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAddress" type="{http://milleni.com/Crm}CrmAddress" minOccurs="0"/>
 *         &lt;element name="BillingCustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contracts" type="{http://milleni.com/Crm}ArrayOfCrmContract" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid"/>
 *         &lt;element name="InstallmentAddress" type="{http://milleni.com/Crm}CrmAddress" minOccurs="0"/>
 *         &lt;element name="Pools" type="{http://milleni.com/Crm}ArrayOfCrmPool" minOccurs="0"/>
 *         &lt;element name="ReturnAccount" type="{http://milleni.com/Crm}CrmReturnAccount" minOccurs="0"/>
 *         &lt;element name="ShipmentAddress" type="{http://milleni.com/Crm}CrmAddress" minOccurs="0"/>
 *         &lt;element name="SoftInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SoftInvoiceEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StatusChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TTCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrmAccount", namespace = "http://milleni.com/Crm", propOrder = {
    "accountCode",
    "accountName",
    "bbkNumber",
    "billingAddress",
    "billingCustomerNumber",
    "contracts",
    "id",
    "installmentAddress",
    "pools",
    "returnAccount",
    "shipmentAddress",
    "softInvoice",
    "softInvoiceEmail",
    "status",
    "statusChangeDate",
    "ttCustomerNo",
    "validFrom",
    "validTo"
})
public class CrmAccount {

    @XmlElementRef(name = "AccountCode", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> accountCode;
    @XmlElementRef(name = "AccountName", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> accountName;
    @XmlElementRef(name = "BBKNumber", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> bbkNumber;
    @XmlElementRef(name = "BillingAddress", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<CrmAddress> billingAddress;
    @XmlElementRef(name = "BillingCustomerNumber", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> billingCustomerNumber;
    @XmlElementRef(name = "Contracts", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCrmContract> contracts;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElementRef(name = "InstallmentAddress", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<CrmAddress> installmentAddress;
    @XmlElementRef(name = "Pools", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCrmPool> pools;
    @XmlElementRef(name = "ReturnAccount", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<CrmReturnAccount> returnAccount;
    @XmlElementRef(name = "ShipmentAddress", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<CrmAddress> shipmentAddress;
    @XmlElement(name = "SoftInvoice")
    protected Boolean softInvoice;
    @XmlElementRef(name = "SoftInvoiceEmail", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> softInvoiceEmail;
    @XmlElement(name = "Status")
    protected Integer status;
    @XmlElementRef(name = "StatusChangeDate", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> statusChangeDate;
    @XmlElementRef(name = "TTCustomerNo", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> ttCustomerNo;
    @XmlElementRef(name = "ValidFrom", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> validFrom;
    @XmlElementRef(name = "ValidTo", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> validTo;

    /**
     * Gets the value of the accountCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountCode(JAXBElement<String> value) {
        this.accountCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountName(JAXBElement<String> value) {
        this.accountName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the bbkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBBKNumber() {
        return bbkNumber;
    }

    /**
     * Sets the value of the bbkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBBKNumber(JAXBElement<String> value) {
        this.bbkNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrmAddress }{@code >}
     *     
     */
    public JAXBElement<CrmAddress> getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrmAddress }{@code >}
     *     
     */
    public void setBillingAddress(JAXBElement<CrmAddress> value) {
        this.billingAddress = ((JAXBElement<CrmAddress> ) value);
    }

    /**
     * Gets the value of the billingCustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillingCustomerNumber() {
        return billingCustomerNumber;
    }

    /**
     * Sets the value of the billingCustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillingCustomerNumber(JAXBElement<String> value) {
        this.billingCustomerNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contracts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmContract }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCrmContract> getContracts() {
        return contracts;
    }

    /**
     * Sets the value of the contracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmContract }{@code >}
     *     
     */
    public void setContracts(JAXBElement<ArrayOfCrmContract> value) {
        this.contracts = ((JAXBElement<ArrayOfCrmContract> ) value);
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
     * Gets the value of the installmentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrmAddress }{@code >}
     *     
     */
    public JAXBElement<CrmAddress> getInstallmentAddress() {
        return installmentAddress;
    }

    /**
     * Sets the value of the installmentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrmAddress }{@code >}
     *     
     */
    public void setInstallmentAddress(JAXBElement<CrmAddress> value) {
        this.installmentAddress = ((JAXBElement<CrmAddress> ) value);
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
     * Gets the value of the returnAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrmReturnAccount }{@code >}
     *     
     */
    public JAXBElement<CrmReturnAccount> getReturnAccount() {
        return returnAccount;
    }

    /**
     * Sets the value of the returnAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrmReturnAccount }{@code >}
     *     
     */
    public void setReturnAccount(JAXBElement<CrmReturnAccount> value) {
        this.returnAccount = ((JAXBElement<CrmReturnAccount> ) value);
    }

    /**
     * Gets the value of the shipmentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrmAddress }{@code >}
     *     
     */
    public JAXBElement<CrmAddress> getShipmentAddress() {
        return shipmentAddress;
    }

    /**
     * Sets the value of the shipmentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrmAddress }{@code >}
     *     
     */
    public void setShipmentAddress(JAXBElement<CrmAddress> value) {
        this.shipmentAddress = ((JAXBElement<CrmAddress> ) value);
    }

    /**
     * Gets the value of the softInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoftInvoice() {
        return softInvoice;
    }

    /**
     * Sets the value of the softInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoftInvoice(Boolean value) {
        this.softInvoice = value;
    }

    /**
     * Gets the value of the softInvoiceEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSoftInvoiceEmail() {
        return softInvoiceEmail;
    }

    /**
     * Sets the value of the softInvoiceEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSoftInvoiceEmail(JAXBElement<String> value) {
        this.softInvoiceEmail = ((JAXBElement<String> ) value);
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
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStatusChangeDate() {
        return statusChangeDate;
    }

    /**
     * Sets the value of the statusChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStatusChangeDate(JAXBElement<XMLGregorianCalendar> value) {
        this.statusChangeDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the ttCustomerNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTTCustomerNo() {
        return ttCustomerNo;
    }

    /**
     * Sets the value of the ttCustomerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTTCustomerNo(JAXBElement<String> value) {
        this.ttCustomerNo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setValidFrom(JAXBElement<XMLGregorianCalendar> value) {
        this.validFrom = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setValidTo(JAXBElement<XMLGregorianCalendar> value) {
        this.validTo = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

}
