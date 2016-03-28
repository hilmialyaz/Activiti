
package org.milleni.dunning.ws.client.tts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="CreatePersonResult" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel}CreatePersonResponseModel" minOccurs="0"/>
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
    "createPersonResult"
})
@XmlRootElement(name = "CreatePersonResponse", namespace = "http://tempuri.org/")
public class CreatePersonResponse {

    @XmlElementRef(name = "CreatePersonResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<CreatePersonResponseModel> createPersonResult;

    /**
     * Gets the value of the createPersonResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreatePersonResponseModel }{@code >}
     *     
     */
    public JAXBElement<CreatePersonResponseModel> getCreatePersonResult() {
        return createPersonResult;
    }

    /**
     * Sets the value of the createPersonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreatePersonResponseModel }{@code >}
     *     
     */
    public void setCreatePersonResult(JAXBElement<CreatePersonResponseModel> value) {
        this.createPersonResult = ((JAXBElement<CreatePersonResponseModel> ) value);
    }

}
