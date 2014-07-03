
package org.milleni.dunning.ws.client.milinternal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MusteriDurumu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MusteriDurumu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MusteriNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DurumKodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MusteriDurumu", propOrder = {
    "musteriNo",
    "durumKodu"
})
public class MusteriDurumu {

    @XmlElement(name = "MusteriNo")
    protected String musteriNo;
    @XmlElement(name = "DurumKodu")
    protected String durumKodu;

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
     * Gets the value of the durumKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurumKodu() {
        return durumKodu;
    }

    /**
     * Sets the value of the durumKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurumKodu(String value) {
        this.durumKodu = value;
    }

}
