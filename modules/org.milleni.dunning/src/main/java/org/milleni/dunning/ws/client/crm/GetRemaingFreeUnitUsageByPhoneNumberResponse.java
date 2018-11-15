
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
 *         &lt;element name="GetRemaingFreeUnitUsageByPhoneNumberResult" type="{/CustomerInfo/Service/v1}GetRemaingFreeUnitUsageByPhoneNumberResponseModel" minOccurs="0"/>
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
    "getRemaingFreeUnitUsageByPhoneNumberResult"
})
@XmlRootElement(name = "GetRemaingFreeUnitUsageByPhoneNumberResponse")
public class GetRemaingFreeUnitUsageByPhoneNumberResponse {

    @XmlElementRef(name = "GetRemaingFreeUnitUsageByPhoneNumberResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<GetRemaingFreeUnitUsageByPhoneNumberResponseModel> getRemaingFreeUnitUsageByPhoneNumberResult;

    /**
     * Gets the value of the getRemaingFreeUnitUsageByPhoneNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetRemaingFreeUnitUsageByPhoneNumberResponseModel }{@code >}
     *     
     */
    public JAXBElement<GetRemaingFreeUnitUsageByPhoneNumberResponseModel> getGetRemaingFreeUnitUsageByPhoneNumberResult() {
        return getRemaingFreeUnitUsageByPhoneNumberResult;
    }

    /**
     * Sets the value of the getRemaingFreeUnitUsageByPhoneNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetRemaingFreeUnitUsageByPhoneNumberResponseModel }{@code >}
     *     
     */
    public void setGetRemaingFreeUnitUsageByPhoneNumberResult(JAXBElement<GetRemaingFreeUnitUsageByPhoneNumberResponseModel> value) {
        this.getRemaingFreeUnitUsageByPhoneNumberResult = ((JAXBElement<GetRemaingFreeUnitUsageByPhoneNumberResponseModel> ) value);
    }

}
