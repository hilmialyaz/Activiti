
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
 *         &lt;element name="SuspenddenAktifeGecmisMusterilerResult" type="{http://milleni.com/internal}ArrayOfMusteri" minOccurs="0"/>
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
    "suspenddenAktifeGecmisMusterilerResult"
})
@XmlRootElement(name = "SuspenddenAktifeGecmisMusterilerResponse")
public class SuspenddenAktifeGecmisMusterilerResponse {

    @XmlElement(name = "SuspenddenAktifeGecmisMusterilerResult")
    protected ArrayOfMusteri suspenddenAktifeGecmisMusterilerResult;

    /**
     * Gets the value of the suspenddenAktifeGecmisMusterilerResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMusteri }
     *     
     */
    public ArrayOfMusteri getSuspenddenAktifeGecmisMusterilerResult() {
        return suspenddenAktifeGecmisMusterilerResult;
    }

    /**
     * Sets the value of the suspenddenAktifeGecmisMusterilerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMusteri }
     *     
     */
    public void setSuspenddenAktifeGecmisMusterilerResult(ArrayOfMusteri value) {
        this.suspenddenAktifeGecmisMusterilerResult = value;
    }

}
