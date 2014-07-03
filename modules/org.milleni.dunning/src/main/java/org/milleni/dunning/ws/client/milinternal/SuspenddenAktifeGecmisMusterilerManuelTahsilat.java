
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
 *         &lt;element name="sorgulamaBaslangicZamani" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sorgulamaBitisZamani" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sorgulamaBaslangicZamani",
    "sorgulamaBitisZamani"
})
@XmlRootElement(name = "SuspenddenAktifeGecmisMusterilerManuelTahsilat")
public class SuspenddenAktifeGecmisMusterilerManuelTahsilat {

    protected GuvenlikBilgisi guvenlikBilgisi;
    protected String sorgulamaBaslangicZamani;
    protected String sorgulamaBitisZamani;

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
     * Gets the value of the sorgulamaBaslangicZamani property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSorgulamaBaslangicZamani() {
        return sorgulamaBaslangicZamani;
    }

    /**
     * Sets the value of the sorgulamaBaslangicZamani property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSorgulamaBaslangicZamani(String value) {
        this.sorgulamaBaslangicZamani = value;
    }

    /**
     * Gets the value of the sorgulamaBitisZamani property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSorgulamaBitisZamani() {
        return sorgulamaBitisZamani;
    }

    /**
     * Sets the value of the sorgulamaBitisZamani property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSorgulamaBitisZamani(String value) {
        this.sorgulamaBitisZamani = value;
    }

}
