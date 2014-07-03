
package org.milleni.dunning.ws.client.milinternal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaturaDetayi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaturaDetayi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FaturaKalemleri" type="{http://milleni.com/internal}ArrayOfFaturaKalemi" minOccurs="0"/>
 *         &lt;element name="IslemSonucu" type="{http://milleni.com/internal}IslemSonucu" minOccurs="0"/>
 *         &lt;element name="AlacakToplami" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BorcToplami" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaturaDetayi", propOrder = {
    "faturaKalemleri",
    "islemSonucu",
    "alacakToplami",
    "borcToplami"
})
public class FaturaDetayi {

    @XmlElement(name = "FaturaKalemleri")
    protected ArrayOfFaturaKalemi faturaKalemleri;
    @XmlElement(name = "IslemSonucu")
    protected IslemSonucu islemSonucu;
    @XmlElement(name = "AlacakToplami")
    protected String alacakToplami;
    @XmlElement(name = "BorcToplami")
    protected String borcToplami;

    /**
     * Gets the value of the faturaKalemleri property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFaturaKalemi }
     *     
     */
    public ArrayOfFaturaKalemi getFaturaKalemleri() {
        return faturaKalemleri;
    }

    /**
     * Sets the value of the faturaKalemleri property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFaturaKalemi }
     *     
     */
    public void setFaturaKalemleri(ArrayOfFaturaKalemi value) {
        this.faturaKalemleri = value;
    }

    /**
     * Gets the value of the islemSonucu property.
     * 
     * @return
     *     possible object is
     *     {@link IslemSonucu }
     *     
     */
    public IslemSonucu getIslemSonucu() {
        return islemSonucu;
    }

    /**
     * Sets the value of the islemSonucu property.
     * 
     * @param value
     *     allowed object is
     *     {@link IslemSonucu }
     *     
     */
    public void setIslemSonucu(IslemSonucu value) {
        this.islemSonucu = value;
    }

    /**
     * Gets the value of the alacakToplami property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlacakToplami() {
        return alacakToplami;
    }

    /**
     * Sets the value of the alacakToplami property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlacakToplami(String value) {
        this.alacakToplami = value;
    }

    /**
     * Gets the value of the borcToplami property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorcToplami() {
        return borcToplami;
    }

    /**
     * Sets the value of the borcToplami property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorcToplami(String value) {
        this.borcToplami = value;
    }

}
