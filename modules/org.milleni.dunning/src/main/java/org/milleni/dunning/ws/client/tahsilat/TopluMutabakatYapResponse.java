
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
 *         &lt;element name="TopluMutabakatYapResult" type="{http://milleni.com/online_tahsilat}TopluMutabakatRakamlari" minOccurs="0"/>
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
    "topluMutabakatYapResult"
})
@XmlRootElement(name = "TopluMutabakatYapResponse")
public class TopluMutabakatYapResponse {

    @XmlElement(name = "TopluMutabakatYapResult")
    protected TopluMutabakatRakamlari topluMutabakatYapResult;

    /**
     * Gets the value of the topluMutabakatYapResult property.
     * 
     * @return
     *     possible object is
     *     {@link TopluMutabakatRakamlari }
     *     
     */
    public TopluMutabakatRakamlari getTopluMutabakatYapResult() {
        return topluMutabakatYapResult;
    }

    /**
     * Sets the value of the topluMutabakatYapResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopluMutabakatRakamlari }
     *     
     */
    public void setTopluMutabakatYapResult(TopluMutabakatRakamlari value) {
        this.topluMutabakatYapResult = value;
    }

}
