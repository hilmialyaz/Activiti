
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
 *         &lt;element name="DetayMutabakatResult" type="{http://milleni.com/online_tahsilat}ArrayOfMutabakatDetayKalemi" minOccurs="0"/>
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
    "detayMutabakatResult"
})
@XmlRootElement(name = "DetayMutabakatResponse")
public class DetayMutabakatResponse {

    @XmlElement(name = "DetayMutabakatResult")
    protected ArrayOfMutabakatDetayKalemi detayMutabakatResult;

    /**
     * Gets the value of the detayMutabakatResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMutabakatDetayKalemi }
     *     
     */
    public ArrayOfMutabakatDetayKalemi getDetayMutabakatResult() {
        return detayMutabakatResult;
    }

    /**
     * Sets the value of the detayMutabakatResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMutabakatDetayKalemi }
     *     
     */
    public void setDetayMutabakatResult(ArrayOfMutabakatDetayKalemi value) {
        this.detayMutabakatResult = value;
    }

}