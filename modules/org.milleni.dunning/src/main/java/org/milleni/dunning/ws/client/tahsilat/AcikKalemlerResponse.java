
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
 *         &lt;element name="AcikKalemlerResult" type="{http://milleni.com/online_tahsilat}ArrayOfAcikKalem" minOccurs="0"/>
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
    "acikKalemlerResult"
})
@XmlRootElement(name = "AcikKalemlerResponse")
public class AcikKalemlerResponse {

    @XmlElement(name = "AcikKalemlerResult")
    protected ArrayOfAcikKalem acikKalemlerResult;

    /**
     * Gets the value of the acikKalemlerResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAcikKalem }
     *     
     */
    public ArrayOfAcikKalem getAcikKalemlerResult() {
        return acikKalemlerResult;
    }

    /**
     * Sets the value of the acikKalemlerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAcikKalem }
     *     
     */
    public void setAcikKalemlerResult(ArrayOfAcikKalem value) {
        this.acikKalemlerResult = value;
    }

}
