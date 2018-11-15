
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrmPool complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrmPool">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PoolItems" type="{http://milleni.com/Crm}ArrayOfCrmPoolItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrmPool", namespace = "http://milleni.com/Crm", propOrder = {
    "billingId",
    "name",
    "poolItems"
})
public class CrmPool {

    @XmlElementRef(name = "BillingId", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> billingId;
    @XmlElementRef(name = "Name", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "PoolItems", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCrmPoolItem> poolItems;

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
     * Gets the value of the poolItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmPoolItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCrmPoolItem> getPoolItems() {
        return poolItems;
    }

    /**
     * Sets the value of the poolItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmPoolItem }{@code >}
     *     
     */
    public void setPoolItems(JAXBElement<ArrayOfCrmPoolItem> value) {
        this.poolItems = ((JAXBElement<ArrayOfCrmPoolItem> ) value);
    }

}
