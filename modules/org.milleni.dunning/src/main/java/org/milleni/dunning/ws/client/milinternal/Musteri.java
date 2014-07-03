
package org.milleni.dunning.ws.client.milinternal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Musteri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Musteri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MusteriNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MusteriAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuncellenmeZamani" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Musteri", propOrder = {
    "musteriNo",
    "musteriAdi",
    "guncellenmeZamani"
})
public class Musteri {

    @XmlElement(name = "MusteriNo")
    protected String musteriNo;
    @XmlElement(name = "MusteriAdi")
    protected String musteriAdi;
    @XmlElement(name = "GuncellenmeZamani")
    protected String guncellenmeZamani;

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
     * Gets the value of the musteriAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMusteriAdi() {
        return musteriAdi;
    }

    /**
     * Sets the value of the musteriAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMusteriAdi(String value) {
        this.musteriAdi = value;
    }

    /**
     * Gets the value of the guncellenmeZamani property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuncellenmeZamani() {
        return guncellenmeZamani;
    }

    /**
     * Sets the value of the guncellenmeZamani property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuncellenmeZamani(String value) {
        this.guncellenmeZamani = value;
    }

}
