
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplaceStockInfoDeviceProductRequestModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplaceStockInfoDeviceProductRequestModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillingProductId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NewSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplaceStockInfoDeviceProductRequestModel", propOrder = {
    "billingProductId",
    "newSerialNo",
    "oldSerialNo"
})
public class ReplaceStockInfoDeviceProductRequestModel {

    @XmlElement(name = "BillingProductId")
    protected Long billingProductId;
    @XmlElementRef(name = "NewSerialNo", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> newSerialNo;
    @XmlElementRef(name = "OldSerialNo", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> oldSerialNo;

    /**
     * Gets the value of the billingProductId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillingProductId() {
        return billingProductId;
    }

    /**
     * Sets the value of the billingProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillingProductId(Long value) {
        this.billingProductId = value;
    }

    /**
     * Gets the value of the newSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewSerialNo() {
        return newSerialNo;
    }

    /**
     * Sets the value of the newSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewSerialNo(JAXBElement<String> value) {
        this.newSerialNo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the oldSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOldSerialNo() {
        return oldSerialNo;
    }

    /**
     * Sets the value of the oldSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOldSerialNo(JAXBElement<String> value) {
        this.oldSerialNo = ((JAXBElement<String> ) value);
    }

}
