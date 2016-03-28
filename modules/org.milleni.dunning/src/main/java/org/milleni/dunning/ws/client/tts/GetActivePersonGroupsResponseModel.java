
package org.milleni.dunning.ws.client.tts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetActivePersonGroupsResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetActivePersonGroupsResponseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonGroups" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel}ArrayOfPersonGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetActivePersonGroupsResponseModel", propOrder = {
    "personGroups"
})
public class GetActivePersonGroupsResponseModel {

    @XmlElementRef(name = "PersonGroups", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPersonGroup> personGroups;

    /**
     * Gets the value of the personGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPersonGroup }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPersonGroup> getPersonGroups() {
        return personGroups;
    }

    /**
     * Sets the value of the personGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPersonGroup }{@code >}
     *     
     */
    public void setPersonGroups(JAXBElement<ArrayOfPersonGroup> value) {
        this.personGroups = ((JAXBElement<ArrayOfPersonGroup> ) value);
    }

}
