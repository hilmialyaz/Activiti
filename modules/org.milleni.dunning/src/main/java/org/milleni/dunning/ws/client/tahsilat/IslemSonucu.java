
package org.milleni.dunning.ws.client.tahsilat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IslemSonucu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IslemSonucu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MusteriNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferansNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DurumKodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DurumAciklamasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MesajTipi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MesajKodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MesajAciklamasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IslemSonucu", propOrder = {
    "musteriNo",
    "referansNo",
    "durumKodu",
    "durumAciklamasi",
    "mesajTipi",
    "mesajKodu",
    "mesajAciklamasi"
})
public class IslemSonucu {

    @XmlElement(name = "MusteriNo")
    protected String musteriNo;
    @XmlElement(name = "ReferansNo")
    protected String referansNo;
    @XmlElement(name = "DurumKodu")
    protected String durumKodu;
    @XmlElement(name = "DurumAciklamasi")
    protected String durumAciklamasi;
    @XmlElement(name = "MesajTipi")
    protected String mesajTipi;
    @XmlElement(name = "MesajKodu")
    protected String mesajKodu;
    @XmlElement(name = "MesajAciklamasi")
    protected String mesajAciklamasi;

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
     * Gets the value of the durumKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurumKodu() {
        return durumKodu;
    }

    /**
     * Sets the value of the durumKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurumKodu(String value) {
        this.durumKodu = value;
    }

    /**
     * Gets the value of the durumAciklamasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurumAciklamasi() {
        return durumAciklamasi;
    }

    /**
     * Sets the value of the durumAciklamasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurumAciklamasi(String value) {
        this.durumAciklamasi = value;
    }

    /**
     * Gets the value of the mesajTipi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesajTipi() {
        return mesajTipi;
    }

    /**
     * Sets the value of the mesajTipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesajTipi(String value) {
        this.mesajTipi = value;
    }

    /**
     * Gets the value of the mesajKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesajKodu() {
        return mesajKodu;
    }

    /**
     * Sets the value of the mesajKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesajKodu(String value) {
        this.mesajKodu = value;
    }

    /**
     * Gets the value of the mesajAciklamasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesajAciklamasi() {
        return mesajAciklamasi;
    }

    /**
     * Sets the value of the mesajAciklamasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesajAciklamasi(String value) {
        this.mesajAciklamasi = value;
    }

}
