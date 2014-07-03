
package org.milleni.dunning.ws.client.tahsilat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guvenlikBilgisi" type="{http://milleni.com/online_tahsilat}GuvenlikBilgisi" minOccurs="0"/>
 *         &lt;element name="musteriNumarasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="islemKodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "guvenlikBilgisi",
    "musteriNumarasi",
    "islemKodu"
})
@XmlRootElement(name = "OdemeTalimatiOlustur")
public class OdemeTalimatiOlustur {

    protected GuvenlikBilgisi guvenlikBilgisi;
    protected String musteriNumarasi;
    protected String islemKodu;

    /**
     * Gets the value of the guvenlikBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link GuvenlikBilgisi }
     *     
     */
    public GuvenlikBilgisi getGuvenlikBilgisi() {
        return guvenlikBilgisi;
    }

    /**
     * Sets the value of the guvenlikBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuvenlikBilgisi }
     *     
     */
    public void setGuvenlikBilgisi(GuvenlikBilgisi value) {
        this.guvenlikBilgisi = value;
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
     * Gets the value of the islemKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIslemKodu() {
        return islemKodu;
    }

    /**
     * Sets the value of the islemKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIslemKodu(String value) {
        this.islemKodu = value;
    }

}
