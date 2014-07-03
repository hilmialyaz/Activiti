
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
 *         &lt;element name="TopluMutabakatResult" type="{http://milleni.com/online_tahsilat}TopluMutabakatRakamlari" minOccurs="0"/>
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
    "topluMutabakatResult"
})
@XmlRootElement(name = "TopluMutabakatResponse")
public class TopluMutabakatResponse {

    @XmlElement(name = "TopluMutabakatResult")
    protected TopluMutabakatRakamlari topluMutabakatResult;

    /**
     * Gets the value of the topluMutabakatResult property.
     * 
     * @return
     *     possible object is
     *     {@link TopluMutabakatRakamlari }
     *     
     */
    public TopluMutabakatRakamlari getTopluMutabakatResult() {
        return topluMutabakatResult;
    }

    /**
     * Sets the value of the topluMutabakatResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopluMutabakatRakamlari }
     *     
     */
    public void setTopluMutabakatResult(TopluMutabakatRakamlari value) {
        this.topluMutabakatResult = value;
    }

}
