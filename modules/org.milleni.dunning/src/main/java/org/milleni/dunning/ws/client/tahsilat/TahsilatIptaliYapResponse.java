
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
 *         &lt;element name="TahsilatIptaliYapResult" type="{http://milleni.com/online_tahsilat}ArrayOfIslemSonucu" minOccurs="0"/>
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
    "tahsilatIptaliYapResult"
})
@XmlRootElement(name = "TahsilatIptaliYapResponse")
public class TahsilatIptaliYapResponse {

    @XmlElement(name = "TahsilatIptaliYapResult")
    protected ArrayOfIslemSonucu tahsilatIptaliYapResult;

    /**
     * Gets the value of the tahsilatIptaliYapResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIslemSonucu }
     *     
     */
    public ArrayOfIslemSonucu getTahsilatIptaliYapResult() {
        return tahsilatIptaliYapResult;
    }

    /**
     * Sets the value of the tahsilatIptaliYapResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIslemSonucu }
     *     
     */
    public void setTahsilatIptaliYapResult(ArrayOfIslemSonucu value) {
        this.tahsilatIptaliYapResult = value;
    }

}
