
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
 *         &lt;element name="tahsilatKalemleri" type="{http://milleni.com/online_tahsilat}ArrayOfTahsilatKalemi" minOccurs="0"/>
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
    "tahsilatKalemleri"
})
@XmlRootElement(name = "AkibetSorgula")
public class AkibetSorgula {

    protected GuvenlikBilgisi guvenlikBilgisi;
    protected ArrayOfTahsilatKalemi tahsilatKalemleri;

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
     * Gets the value of the tahsilatKalemleri property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTahsilatKalemi }
     *     
     */
    public ArrayOfTahsilatKalemi getTahsilatKalemleri() {
        return tahsilatKalemleri;
    }

    /**
     * Sets the value of the tahsilatKalemleri property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTahsilatKalemi }
     *     
     */
    public void setTahsilatKalemleri(ArrayOfTahsilatKalemi value) {
        this.tahsilatKalemleri = value;
    }

}
