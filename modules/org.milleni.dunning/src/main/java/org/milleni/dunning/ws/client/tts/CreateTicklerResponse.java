
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
 *         &lt;element name="CreateTicklerResult" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel}CreateTicklerResponseModel" minOccurs="0"/>
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
    "createTicklerResult"
})
@XmlRootElement(name = "CreateTicklerResponse", namespace = "http://tempuri.org/")
public class CreateTicklerResponse {

    @XmlElementRef(name = "CreateTicklerResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<CreateTicklerResponseModel> createTicklerResult;

    /**
     * Gets the value of the createTicklerResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreateTicklerResponseModel }{@code >}
     *     
     */
    public JAXBElement<CreateTicklerResponseModel> getCreateTicklerResult() {
        return createTicklerResult;
    }

    /**
     * Sets the value of the createTicklerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreateTicklerResponseModel }{@code >}
     *     
     */
    public void setCreateTicklerResult(JAXBElement<CreateTicklerResponseModel> value) {
        this.createTicklerResult = ((JAXBElement<CreateTicklerResponseModel> ) value);
    }

}
