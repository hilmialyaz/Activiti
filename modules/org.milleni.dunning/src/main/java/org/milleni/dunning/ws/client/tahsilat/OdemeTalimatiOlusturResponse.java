
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
 *         &lt;element name="OdemeTalimatiOlusturResult" type="{http://milleni.com/online_tahsilat}IslemSonucu" minOccurs="0"/>
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
    "odemeTalimatiOlusturResult"
})
@XmlRootElement(name = "OdemeTalimatiOlusturResponse")
public class OdemeTalimatiOlusturResponse {

    @XmlElement(name = "OdemeTalimatiOlusturResult")
    protected IslemSonucu odemeTalimatiOlusturResult;

    /**
     * Gets the value of the odemeTalimatiOlusturResult property.
     * 
     * @return
     *     possible object is
     *     {@link IslemSonucu }
     *     
     */
    public IslemSonucu getOdemeTalimatiOlusturResult() {
        return odemeTalimatiOlusturResult;
    }

    /**
     * Sets the value of the odemeTalimatiOlusturResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IslemSonucu }
     *     
     */
    public void setOdemeTalimatiOlusturResult(IslemSonucu value) {
        this.odemeTalimatiOlusturResult = value;
    }

}
