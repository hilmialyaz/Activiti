
package org.milleni.dunning.ws.client.tahsilat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcikKalemDetay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcikKalemDetay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcikKalemler" type="{http://milleni.com/online_tahsilat}ArrayOfAcikKalem" minOccurs="0"/>
 *         &lt;element name="IslemSonucu" type="{http://milleni.com/online_tahsilat}IslemSonucu" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcikKalemDetay", propOrder = {
    "acikKalemler",
    "islemSonucu"
})
public class AcikKalemDetay {

    @XmlElement(name = "AcikKalemler")
    protected ArrayOfAcikKalem acikKalemler;
    @XmlElement(name = "IslemSonucu")
    protected IslemSonucu islemSonucu;

    /**
     * Gets the value of the acikKalemler property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAcikKalem }
     *     
     */
    public ArrayOfAcikKalem getAcikKalemler() {
        return acikKalemler;
    }

    /**
     * Sets the value of the acikKalemler property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAcikKalem }
     *     
     */
    public void setAcikKalemler(ArrayOfAcikKalem value) {
        this.acikKalemler = value;
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

}
