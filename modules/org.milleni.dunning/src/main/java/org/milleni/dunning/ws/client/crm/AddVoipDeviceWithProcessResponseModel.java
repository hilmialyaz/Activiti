
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddVoipDeviceWithProcessResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddVoipDeviceWithProcessResponseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessOid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddVoipDeviceWithProcessResponseModel", propOrder = {
    "processOid"
})
public class AddVoipDeviceWithProcessResponseModel {

    @XmlElement(name = "ProcessOid")
    protected String processOid;

    /**
     * Gets the value of the processOid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessOid() {
        return processOid;
    }

    /**
     * Sets the value of the processOid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessOid(String value) {
        this.processOid = value;
    }

}
