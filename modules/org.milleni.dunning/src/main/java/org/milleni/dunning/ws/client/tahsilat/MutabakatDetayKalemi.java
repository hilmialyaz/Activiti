
package org.milleni.dunning.ws.client.tahsilat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MutabakatDetayKalemi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MutabakatDetayKalemi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TahsilatTarihi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TahsilatZamani" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TahsilatBelgeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IptalYapildi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IptalTarihi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IptalZamani" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IptalBelgeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MutabakatYapildi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MusteriNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "MutabakatDetayKalemi", propOrder = {
    "tahsilatTarihi",
    "tahsilatZamani",
    "tahsilatBelgeNo",
    "iptalYapildi",
    "iptalTarihi",
    "iptalZamani",
    "iptalBelgeNo",
    "mutabakatYapildi",
    "musteriNo",
    "referansNo",
    "aciklama",
    "faturaTarihi",
    "sonOdemeTarihi",
    "tutar",
    "paraBirimi"
})
public class MutabakatDetayKalemi {

    @XmlElement(name = "TahsilatTarihi")
    protected String tahsilatTarihi;
    @XmlElement(name = "TahsilatZamani")
    protected String tahsilatZamani;
    @XmlElement(name = "TahsilatBelgeNo")
    protected String tahsilatBelgeNo;
    @XmlElement(name = "IptalYapildi")
    protected String iptalYapildi;
    @XmlElement(name = "IptalTarihi")
    protected String iptalTarihi;
    @XmlElement(name = "IptalZamani")
    protected String iptalZamani;
    @XmlElement(name = "IptalBelgeNo")
    protected String iptalBelgeNo;
    @XmlElement(name = "MutabakatYapildi")
    protected String mutabakatYapildi;
    @XmlElement(name = "MusteriNo")
    protected String musteriNo;
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

    /**
     * Gets the value of the tahsilatZamani property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTahsilatZamani() {
        return tahsilatZamani;
    }

    /**
     * Sets the value of the tahsilatZamani property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTahsilatZamani(String value) {
        this.tahsilatZamani = value;
    }

    /**
     * Gets the value of the tahsilatBelgeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTahsilatBelgeNo() {
        return tahsilatBelgeNo;
    }

    /**
     * Sets the value of the tahsilatBelgeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTahsilatBelgeNo(String value) {
        this.tahsilatBelgeNo = value;
    }

    /**
     * Gets the value of the iptalYapildi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIptalYapildi() {
        return iptalYapildi;
    }

    /**
     * Sets the value of the iptalYapildi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIptalYapildi(String value) {
        this.iptalYapildi = value;
    }

    /**
     * Gets the value of the iptalTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIptalTarihi() {
        return iptalTarihi;
    }

    /**
     * Sets the value of the iptalTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIptalTarihi(String value) {
        this.iptalTarihi = value;
    }

    /**
     * Gets the value of the iptalZamani property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIptalZamani() {
        return iptalZamani;
    }

    /**
     * Sets the value of the iptalZamani property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIptalZamani(String value) {
        this.iptalZamani = value;
    }

    /**
     * Gets the value of the iptalBelgeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIptalBelgeNo() {
        return iptalBelgeNo;
    }

    /**
     * Sets the value of the iptalBelgeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIptalBelgeNo(String value) {
        this.iptalBelgeNo = value;
    }

    /**
     * Gets the value of the mutabakatYapildi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMutabakatYapildi() {
        return mutabakatYapildi;
    }

    /**
     * Sets the value of the mutabakatYapildi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMutabakatYapildi(String value) {
        this.mutabakatYapildi = value;
    }

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
