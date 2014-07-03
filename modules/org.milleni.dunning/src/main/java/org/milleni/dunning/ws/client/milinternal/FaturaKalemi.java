
package org.milleni.dunning.ws.client.milinternal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaturaKalemi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaturaKalemi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndirimDurumu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaksitSayisi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaksitDurum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Statu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeconBelgeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SapBelgeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MusteriNumarasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Yil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BorcAlacak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tutar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Banka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DenkBelgeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DenkTarihi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaturaKalemi", propOrder = {
    "indirimDurumu",
    "taksitSayisi",
    "taksitDurum",
    "statu",
    "teconBelgeNo",
    "sapBelgeNo",
    "musteriNumarasi",
    "yil",
    "ay",
    "borcAlacak",
    "tutar",
    "sot",
    "banka",
    "denkBelgeNo",
    "denkTarihi"
})
public class FaturaKalemi {

    @XmlElement(name = "IndirimDurumu")
    protected String indirimDurumu;
    @XmlElement(name = "TaksitSayisi")
    protected String taksitSayisi;
    @XmlElement(name = "TaksitDurum")
    protected String taksitDurum;
    @XmlElement(name = "Statu")
    protected String statu;
    @XmlElement(name = "TeconBelgeNo")
    protected String teconBelgeNo;
    @XmlElement(name = "SapBelgeNo")
    protected String sapBelgeNo;
    @XmlElement(name = "MusteriNumarasi")
    protected String musteriNumarasi;
    @XmlElement(name = "Yil")
    protected String yil;
    @XmlElement(name = "Ay")
    protected String ay;
    @XmlElement(name = "BorcAlacak")
    protected String borcAlacak;
    @XmlElement(name = "Tutar")
    protected String tutar;
    @XmlElement(name = "Sot")
    protected String sot;
    @XmlElement(name = "Banka")
    protected String banka;
    @XmlElement(name = "DenkBelgeNo")
    protected String denkBelgeNo;
    @XmlElement(name = "DenkTarihi")
    protected String denkTarihi;

    /**
     * Gets the value of the indirimDurumu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirimDurumu() {
        return indirimDurumu;
    }

    /**
     * Sets the value of the indirimDurumu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirimDurumu(String value) {
        this.indirimDurumu = value;
    }

    /**
     * Gets the value of the taksitSayisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaksitSayisi() {
        return taksitSayisi;
    }

    /**
     * Sets the value of the taksitSayisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaksitSayisi(String value) {
        this.taksitSayisi = value;
    }

    /**
     * Gets the value of the taksitDurum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaksitDurum() {
        return taksitDurum;
    }

    /**
     * Sets the value of the taksitDurum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaksitDurum(String value) {
        this.taksitDurum = value;
    }

    /**
     * Gets the value of the statu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatu() {
        return statu;
    }

    /**
     * Sets the value of the statu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatu(String value) {
        this.statu = value;
    }

    /**
     * Gets the value of the teconBelgeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeconBelgeNo() {
        return teconBelgeNo;
    }

    /**
     * Sets the value of the teconBelgeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeconBelgeNo(String value) {
        this.teconBelgeNo = value;
    }

    /**
     * Gets the value of the sapBelgeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSapBelgeNo() {
        return sapBelgeNo;
    }

    /**
     * Sets the value of the sapBelgeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSapBelgeNo(String value) {
        this.sapBelgeNo = value;
    }

    /**
     * Gets the value of the musteriNumarasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMusteriNumarasi() {
        return musteriNumarasi;
    }

    /**
     * Sets the value of the musteriNumarasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMusteriNumarasi(String value) {
        this.musteriNumarasi = value;
    }

    /**
     * Gets the value of the yil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYil() {
        return yil;
    }

    /**
     * Sets the value of the yil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYil(String value) {
        this.yil = value;
    }

    /**
     * Gets the value of the ay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAy() {
        return ay;
    }

    /**
     * Sets the value of the ay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAy(String value) {
        this.ay = value;
    }

    /**
     * Gets the value of the borcAlacak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorcAlacak() {
        return borcAlacak;
    }

    /**
     * Sets the value of the borcAlacak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorcAlacak(String value) {
        this.borcAlacak = value;
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
     * Gets the value of the sot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSot() {
        return sot;
    }

    /**
     * Sets the value of the sot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSot(String value) {
        this.sot = value;
    }

    /**
     * Gets the value of the banka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanka() {
        return banka;
    }

    /**
     * Sets the value of the banka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanka(String value) {
        this.banka = value;
    }

    /**
     * Gets the value of the denkBelgeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenkBelgeNo() {
        return denkBelgeNo;
    }

    /**
     * Sets the value of the denkBelgeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenkBelgeNo(String value) {
        this.denkBelgeNo = value;
    }

    /**
     * Gets the value of the denkTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenkTarihi() {
        return denkTarihi;
    }

    /**
     * Sets the value of the denkTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenkTarihi(String value) {
        this.denkTarihi = value;
    }

}
