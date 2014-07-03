
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
 *         &lt;element name="FaturaDetayiGoruntuleResult" type="{http://milleni.com/internal}FaturaDetayi" minOccurs="0"/>
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
    "faturaDetayiGoruntuleResult"
})
@XmlRootElement(name = "FaturaDetayiGoruntuleResponse")
public class FaturaDetayiGoruntuleResponse {

    @XmlElement(name = "FaturaDetayiGoruntuleResult")
    protected FaturaDetayi faturaDetayiGoruntuleResult;

    /**
     * Gets the value of the faturaDetayiGoruntuleResult property.
     * 
     * @return
     *     possible object is
     *     {@link FaturaDetayi }
     *     
     */
    public FaturaDetayi getFaturaDetayiGoruntuleResult() {
        return faturaDetayiGoruntuleResult;
    }

    /**
     * Sets the value of the faturaDetayiGoruntuleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaturaDetayi }
     *     
     */
    public void setFaturaDetayiGoruntuleResult(FaturaDetayi value) {
        this.faturaDetayiGoruntuleResult = value;
    }

}
