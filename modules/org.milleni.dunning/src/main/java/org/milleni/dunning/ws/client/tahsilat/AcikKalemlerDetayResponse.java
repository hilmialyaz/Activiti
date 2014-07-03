
package org.milleni.dunning.ws.client.tahsilat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="AcikKalemlerDetayResult" type="{http://milleni.com/online_tahsilat}AcikKalemDetay" minOccurs="0"/>
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
    "acikKalemlerDetayResult"
})
@XmlRootElement(name = "AcikKalemlerDetayResponse")
public class AcikKalemlerDetayResponse {

    @XmlElement(name = "AcikKalemlerDetayResult")
    protected AcikKalemDetay acikKalemlerDetayResult;

    /**
     * Gets the value of the acikKalemlerDetayResult property.
     * 
     * @return
     *     possible object is
     *     {@link AcikKalemDetay }
     *     
     */
    public AcikKalemDetay getAcikKalemlerDetayResult() {
        return acikKalemlerDetayResult;
    }

    /**
     * Sets the value of the acikKalemlerDetayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcikKalemDetay }
     *     
     */
    public void setAcikKalemlerDetayResult(AcikKalemDetay value) {
        this.acikKalemlerDetayResult = value;
    }

}
