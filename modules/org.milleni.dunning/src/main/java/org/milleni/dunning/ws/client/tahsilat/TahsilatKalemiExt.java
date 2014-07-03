
package org.milleni.dunning.ws.client.tahsilat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TahsilatKalemiExt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TahsilatKalemiExt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MusteriNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferansNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaturaTarihi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TahsilatTarihi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TahsilatKalemiExt", propOrder = {
    "musteriNo",
    "referansNo",
    "faturaTarihi",
    "tahsilatTarihi"
})
public class TahsilatKalemiExt {

    @XmlElement(name = "MusteriNo")
    protected String musteriNo;
    @XmlElement(name = "ReferansNo")
    protected String referansNo;
    @XmlElement(name = "FaturaTarihi")
    protected String faturaTarihi;
    @XmlElement(name = "TahsilatTarihi")
    protected String tahsilatTarihi;

    /**
     * Gets the value of the musteriNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMusteriNo() {
        return musteriNo;
    }

    /**
     * Sets the value of the musteriNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMusteriNo(String value) {
        this.musteriNo = value;
    }

    /**
     * Gets the value of the referansNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferansNo() {
        return referansNo;
    }

    /**
     * Sets the value of the referansNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferansNo(String value) {
        this.referansNo = value;
    }

    /**
     * Gets the value of the faturaTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaturaTarihi() {
        return faturaTarihi;
    }

    /**
     * Sets the value of the faturaTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaturaTarihi(String value) {
        this.faturaTarihi = value;
    }

    /**
     * Gets the value of the tahsilatTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTahsilatTarihi() {
        return tahsilatTarihi;
    }

    /**
     * Sets the value of the tahsilatTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTahsilatTarihi(String value) {
        this.tahsilatTarihi = value;
    }

}
