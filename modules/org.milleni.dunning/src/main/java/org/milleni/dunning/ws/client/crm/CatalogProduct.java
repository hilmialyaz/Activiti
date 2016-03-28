
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Catalog" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CommitmentPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Offer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OfferId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogProduct", propOrder = {
    "catalog",
    "commitmentPeriod",
    "offer",
    "offerId"
})
public class CatalogProduct {

    @XmlElement(name = "Catalog", required = true, nillable = true)
    protected String catalog;
    @XmlElement(name = "CommitmentPeriod")
    protected int commitmentPeriod;
    @XmlElement(name = "Offer", required = true, nillable = true)
    protected String offer;
    @XmlElement(name = "OfferId", required = true, nillable = true)
    protected String offerId;

    /**
     * Gets the value of the catalog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalog() {
        return catalog;
    }

    /**
     * Sets the value of the catalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalog(String value) {
        this.catalog = value;
    }

    /**
     * Gets the value of the commitmentPeriod property.
     * 
     */
    public int getCommitmentPeriod() {
        return commitmentPeriod;
    }

    /**
     * Sets the value of the commitmentPeriod property.
     * 
     */
    public void setCommitmentPeriod(int value) {
        this.commitmentPeriod = value;
    }

    /**
     * Gets the value of the offer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffer() {
        return offer;
    }

    /**
     * Sets the value of the offer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffer(String value) {
        this.offer = value;
    }

    /**
     * Gets the value of the offerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferId() {
        return offerId;
    }

    /**
     * Sets the value of the offerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferId(String value) {
        this.offerId = value;
    }

}
