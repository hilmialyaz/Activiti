
package org.milleni.dunning.ws.client.tahsilat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcikKalem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcikKalem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MusteriNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MusteriAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferansNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aciklama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaturaTarihi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SonOdemeTarihi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tutar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParaBirimi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcikKalem", propOrder = {
    "musteriNo",
    "musteriAdi",
    "referansNo",
    "aciklama",
    "faturaTarihi",
    "sonOdemeTarihi",
    "tutar",
    "paraBirimi"
})
public class AcikKalem {

    @XmlElement(name = "MusteriNo")
    protected String musteriNo;
    @XmlElement(name = "MusteriAdi")
    protected String musteriAdi;
    @XmlElement(name = "ReferansNo")
    protected String referansNo;
    @XmlElement(name = "Aciklama")
    protected String aciklama;
    @XmlElement(name = "FaturaTarihi")
    protected String faturaTarihi;
    @XmlElement(name = "SonOdemeTarihi")
    protected String sonOdemeTarihi;
    @XmlElement(name = "Tutar")
    protected String tutar;
    @XmlElement(name = "ParaBirimi")
    protected String paraBirimi;

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
     * Gets the value of the musteriAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMusteriAdi() {
        return musteriAdi;
    }

    /**
     * Sets the value of the musteriAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMusteriAdi(String value) {
        this.musteriAdi = value;
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
     * Gets the value of the aciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAciklama() {
        return aciklama;
    }

    /**
     * Sets the value of the aciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAciklama(String value) {
        this.aciklama = value;
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
     * Gets the value of the sonOdemeTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonOdemeTarihi() {
        return sonOdemeTarihi;
    }

    /**
     * Sets the value of the sonOdemeTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonOdemeTarihi(String value) {
        this.sonOdemeTarihi = value;
    }

    /**
     * Gets the value of the tutar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTutar() {
        return tutar;
    }

    /**
     * Sets the value of the tutar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTutar(String value) {
        this.tutar = value;
    }

    /**
     * Gets the value of the paraBirimi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParaBirimi() {
        return paraBirimi;
    }

    /**
     * Sets the value of the paraBirimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParaBirimi(String value) {
        this.paraBirimi = value;
    }

}
