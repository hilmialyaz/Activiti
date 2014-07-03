
package org.milleni.dunning.ws.client.tahsilat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopluMutabakatRakamlari complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopluMutabakatRakamlari">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ToplamTahsilatAdedi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToplamTahsilatTutari" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToplamIptalAdedi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToplamIptalTutar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToplamNetAdet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToplamNetTutar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopluMutabakatRakamlari", propOrder = {
    "toplamTahsilatAdedi",
    "toplamTahsilatTutari",
    "toplamIptalAdedi",
    "toplamIptalTutar",
    "toplamNetAdet",
    "toplamNetTutar"
})
public class TopluMutabakatRakamlari {

    @XmlElement(name = "ToplamTahsilatAdedi")
    protected String toplamTahsilatAdedi;
    @XmlElement(name = "ToplamTahsilatTutari")
    protected String toplamTahsilatTutari;
    @XmlElement(name = "ToplamIptalAdedi")
    protected String toplamIptalAdedi;
    @XmlElement(name = "ToplamIptalTutar")
    protected String toplamIptalTutar;
    @XmlElement(name = "ToplamNetAdet")
    protected String toplamNetAdet;
    @XmlElement(name = "ToplamNetTutar")
    protected String toplamNetTutar;

    /**
     * Gets the value of the toplamTahsilatAdedi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToplamTahsilatAdedi() {
        return toplamTahsilatAdedi;
    }

    /**
     * Sets the value of the toplamTahsilatAdedi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToplamTahsilatAdedi(String value) {
        this.toplamTahsilatAdedi = value;
    }

    /**
     * Gets the value of the toplamTahsilatTutari property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToplamTahsilatTutari() {
        return toplamTahsilatTutari;
    }

    /**
     * Sets the value of the toplamTahsilatTutari property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToplamTahsilatTutari(String value) {
        this.toplamTahsilatTutari = value;
    }

    /**
     * Gets the value of the toplamIptalAdedi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToplamIptalAdedi() {
        return toplamIptalAdedi;
    }

    /**
     * Sets the value of the toplamIptalAdedi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToplamIptalAdedi(String value) {
        this.toplamIptalAdedi = value;
    }

    /**
     * Gets the value of the toplamIptalTutar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToplamIptalTutar() {
        return toplamIptalTutar;
    }

    /**
     * Sets the value of the toplamIptalTutar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToplamIptalTutar(String value) {
        this.toplamIptalTutar = value;
    }

    /**
     * Gets the value of the toplamNetAdet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToplamNetAdet() {
        return toplamNetAdet;
    }

    /**
     * Sets the value of the toplamNetAdet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToplamNetAdet(String value) {
        this.toplamNetAdet = value;
    }

    /**
     * Gets the value of the toplamNetTutar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToplamNetTutar() {
        return toplamNetTutar;
    }

    /**
     * Sets the value of the toplamNetTutar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToplamNetTutar(String value) {
        this.toplamNetTutar = value;
    }

}
