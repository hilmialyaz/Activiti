
package org.milleni.dunning.ws.client.crm;

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
 *         &lt;element name="SellVoiceRecordResult" type="{/CustomerInfo/Service/v1}SellVoiceRecordResponseModel" minOccurs="0"/>
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
    "sellVoiceRecordResult"
})
@XmlRootElement(name = "SellVoiceRecordResponse")
public class SellVoiceRecordResponse {

    @XmlElementRef(name = "SellVoiceRecordResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<SellVoiceRecordResponseModel> sellVoiceRecordResult;

    /**
     * Gets the value of the sellVoiceRecordResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SellVoiceRecordResponseModel }{@code >}
     *     
     */
    public JAXBElement<SellVoiceRecordResponseModel> getSellVoiceRecordResult() {
        return sellVoiceRecordResult;
    }

    /**
     * Sets the value of the sellVoiceRecordResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SellVoiceRecordResponseModel }{@code >}
     *     
     */
    public void setSellVoiceRecordResult(JAXBElement<SellVoiceRecordResponseModel> value) {
        this.sellVoiceRecordResult = ((JAXBElement<SellVoiceRecordResponseModel> ) value);
    }

}
