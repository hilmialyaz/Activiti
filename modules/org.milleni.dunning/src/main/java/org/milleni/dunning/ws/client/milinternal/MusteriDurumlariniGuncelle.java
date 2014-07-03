
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
 *         &lt;element name="musteriDurumlari" type="{http://milleni.com/internal}ArrayOfMusteriDurumu" minOccurs="0"/>
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
    "musteriDurumlari"
})
@XmlRootElement(name = "MusteriDurumlariniGuncelle")
public class MusteriDurumlariniGuncelle {

    protected GuvenlikBilgisi guvenlikBilgisi;
    protected ArrayOfMusteriDurumu musteriDurumlari;

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
     * Gets the value of the musteriDurumlari property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMusteriDurumu }
     *     
     */
    public ArrayOfMusteriDurumu getMusteriDurumlari() {
        return musteriDurumlari;
    }

    /**
     * Sets the value of the musteriDurumlari property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMusteriDurumu }
     *     
     */
    public void setMusteriDurumlari(ArrayOfMusteriDurumu value) {
        this.musteriDurumlari = value;
    }

}
