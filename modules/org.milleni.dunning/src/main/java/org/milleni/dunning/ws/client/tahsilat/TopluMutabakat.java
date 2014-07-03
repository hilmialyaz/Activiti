
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
 *         &lt;element name="baslangicTarihi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bitisTarihi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "baslangicTarihi",
    "bitisTarihi"
})
@XmlRootElement(name = "TopluMutabakat")
public class TopluMutabakat {

    protected GuvenlikBilgisi guvenlikBilgisi;
    protected String baslangicTarihi;
    protected String bitisTarihi;

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
     * Gets the value of the baslangicTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaslangicTarihi() {
        return baslangicTarihi;
    }

    /**
     * Sets the value of the baslangicTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaslangicTarihi(String value) {
        this.baslangicTarihi = value;
    }

    /**
     * Gets the value of the bitisTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBitisTarihi() {
        return bitisTarihi;
    }

    /**
     * Sets the value of the bitisTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBitisTarihi(String value) {
        this.bitisTarihi = value;
    }

}
