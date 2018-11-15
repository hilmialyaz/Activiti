
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrmPoolItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrmPoolItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Account" type="{http://milleni.com/Crm}CrmAccount" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contract" type="{http://milleni.com/Crm}CrmContract" minOccurs="0"/>
 *         &lt;element name="FreeUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrmPoolItem", namespace = "http://milleni.com/Crm", propOrder = {
    "account",
    "amount",
    "billingId",
    "contract",
    "freeUnitId"
})
public class CrmPoolItem {

    @XmlElementRef(name = "Account", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<CrmAccount> account;
    @XmlElementRef(name = "Amount", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> amount;
    @XmlElementRef(name = "BillingId", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> billingId;
    @XmlElementRef(name = "Contract", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<CrmContract> contract;
    @XmlElementRef(name = "FreeUnitId", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> freeUnitId;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrmAccount }{@code >}
     *     
     */
    public JAXBElement<CrmAccount> getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrmAccount }{@code >}
     *     
     */
    public void setAccount(JAXBElement<CrmAccount> value) {
        this.account = ((JAXBElement<CrmAccount> ) value);
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAmount(JAXBElement<String> value) {
        this.amount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the billingId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillingId() {
        return billingId;
    }

    /**
     * Sets the value of the billingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillingId(JAXBElement<String> value) {
        this.billingId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrmContract }{@code >}
     *     
     */
    public JAXBElement<CrmContract> getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrmContract }{@code >}
     *     
     */
    public void setContract(JAXBElement<CrmContract> value) {
        this.contract = ((JAXBElement<CrmContract> ) value);
    }

    /**
     * Gets the value of the freeUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFreeUnitId() {
        return freeUnitId;
    }

    /**
     * Sets the value of the freeUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFreeUnitId(JAXBElement<String> value) {
        this.freeUnitId = ((JAXBElement<String> ) value);
    }

}
