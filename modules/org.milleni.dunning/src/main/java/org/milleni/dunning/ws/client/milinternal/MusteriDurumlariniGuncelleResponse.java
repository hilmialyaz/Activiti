
package org.milleni.dunning.ws.client.milinternal;

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
 *         &lt;element name="MusteriDurumlariniGuncelleResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "musteriDurumlariniGuncelleResult"
})
@XmlRootElement(name = "MusteriDurumlariniGuncelleResponse")
public class MusteriDurumlariniGuncelleResponse {

    @XmlElement(name = "MusteriDurumlariniGuncelleResult")
    protected String musteriDurumlariniGuncelleResult;

    /**
     * Gets the value of the musteriDurumlariniGuncelleResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMusteriDurumlariniGuncelleResult() {
        return musteriDurumlariniGuncelleResult;
    }

    /**
     * Sets the value of the musteriDurumlariniGuncelleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMusteriDurumlariniGuncelleResult(String value) {
        this.musteriDurumlariniGuncelleResult = value;
    }

}
