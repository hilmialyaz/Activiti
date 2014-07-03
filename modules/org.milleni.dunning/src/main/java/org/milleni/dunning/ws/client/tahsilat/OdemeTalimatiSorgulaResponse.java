
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
 *         &lt;element name="OdemeTalimatiSorgulaResult" type="{http://milleni.com/online_tahsilat}IslemSonucu" minOccurs="0"/>
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
    "odemeTalimatiSorgulaResult"
})
@XmlRootElement(name = "OdemeTalimatiSorgulaResponse")
public class OdemeTalimatiSorgulaResponse {

    @XmlElement(name = "OdemeTalimatiSorgulaResult")
    protected IslemSonucu odemeTalimatiSorgulaResult;

    /**
     * Gets the value of the odemeTalimatiSorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link IslemSonucu }
     *     
     */
    public IslemSonucu getOdemeTalimatiSorgulaResult() {
        return odemeTalimatiSorgulaResult;
    }

    /**
     * Sets the value of the odemeTalimatiSorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IslemSonucu }
     *     
     */
    public void setOdemeTalimatiSorgulaResult(IslemSonucu value) {
        this.odemeTalimatiSorgulaResult = value;
    }

}
