
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TariffChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ChangeReason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NewProduct" type="{/CustomerInfo/Service/v1}CatalogProduct"/>
 *         &lt;element name="OldProduct" type="{/CustomerInfo/Service/v1}CatalogProduct"/>
 *         &lt;element name="ProductValidationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffChange", propOrder = {
    "changeDate",
    "changeReason",
    "newProduct",
    "oldProduct",
    "productValidationDate"
})
public class TariffChange {

    @XmlElement(name = "ChangeDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changeDate;
    @XmlElement(name = "ChangeReason", required = true, nillable = true)
    protected String changeReason;
    @XmlElement(name = "NewProduct", required = true, nillable = true)
    protected CatalogProduct newProduct;
    @XmlElement(name = "OldProduct", required = true, nillable = true)
    protected CatalogProduct oldProduct;
    @XmlElement(name = "ProductValidationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar productValidationDate;

    /**
     * Gets the value of the changeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangeDate() {
        return changeDate;
    }

    /**
     * Sets the value of the changeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangeDate(XMLGregorianCalendar value) {
        this.changeDate = value;
    }

    /**
     * Gets the value of the changeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeReason() {
        return changeReason;
    }

    /**
     * Sets the value of the changeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeReason(String value) {
        this.changeReason = value;
    }

    /**
     * Gets the value of the newProduct property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogProduct }
     *     
     */
    public CatalogProduct getNewProduct() {
        return newProduct;
    }

    /**
     * Sets the value of the newProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogProduct }
     *     
     */
    public void setNewProduct(CatalogProduct value) {
        this.newProduct = value;
    }

    /**
     * Gets the value of the oldProduct property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogProduct }
     *     
     */
    public CatalogProduct getOldProduct() {
        return oldProduct;
    }

    /**
     * Sets the value of the oldProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogProduct }
     *     
     */
    public void setOldProduct(CatalogProduct value) {
        this.oldProduct = value;
    }

    /**
     * Gets the value of the productValidationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProductValidationDate() {
        return productValidationDate;
    }

    /**
     * Sets the value of the productValidationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProductValidationDate(XMLGregorianCalendar value) {
        this.productValidationDate = value;
    }

}
