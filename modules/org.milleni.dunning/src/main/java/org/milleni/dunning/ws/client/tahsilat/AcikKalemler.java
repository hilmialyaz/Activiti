
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
 *         &lt;element name="musteriNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "musteriNo"
})
@XmlRootElement(name = "AcikKalemler")
public class AcikKalemler {

    protected GuvenlikBilgisi guvenlikBilgisi;
    protected String musteriNo;

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

}
