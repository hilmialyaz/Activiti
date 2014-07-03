
package org.milleni.dunning.ws.client.milinternal;

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
 *         &lt;element name="guvenlikBilgisi" type="{http://milleni.com/internal}GuvenlikBilgisi" minOccurs="0"/>
 *         &lt;element name="musteriNumarasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sorgumaZamani" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sorgumaZamani"
})
@XmlRootElement(name = "FaturaDetayiGoruntule")
public class FaturaDetayiGoruntule {

    protected GuvenlikBilgisi guvenlikBilgisi;
    protected String musteriNumarasi;
    protected String sorgumaZamani;

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
     * Gets the value of the sorgumaZamani property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSorgumaZamani() {
        return sorgumaZamani;
    }

    /**
     * Sets the value of the sorgumaZamani property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSorgumaZamani(String value) {
        this.sorgumaZamani = value;
    }

}
