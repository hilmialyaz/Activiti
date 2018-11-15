
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
 *         &lt;element name="GetBulutSantralNumbersByBillingContractNoResult" type="{/CustomerInfo/Service/v1}GetBulutSantralNumbersByBillingContractNoResponseModel" minOccurs="0"/>
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
    "getBulutSantralNumbersByBillingContractNoResult"
})
@XmlRootElement(name = "GetBulutSantralNumbersByBillingContractNoResponse")
public class GetBulutSantralNumbersByBillingContractNoResponse {

    @XmlElementRef(name = "GetBulutSantralNumbersByBillingContractNoResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<GetBulutSantralNumbersByBillingContractNoResponseModel> getBulutSantralNumbersByBillingContractNoResult;

    /**
     * Gets the value of the getBulutSantralNumbersByBillingContractNoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetBulutSantralNumbersByBillingContractNoResponseModel }{@code >}
     *     
     */
    public JAXBElement<GetBulutSantralNumbersByBillingContractNoResponseModel> getGetBulutSantralNumbersByBillingContractNoResult() {
        return getBulutSantralNumbersByBillingContractNoResult;
    }

    /**
     * Sets the value of the getBulutSantralNumbersByBillingContractNoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetBulutSantralNumbersByBillingContractNoResponseModel }{@code >}
     *     
     */
    public void setGetBulutSantralNumbersByBillingContractNoResult(JAXBElement<GetBulutSantralNumbersByBillingContractNoResponseModel> value) {
        this.getBulutSantralNumbersByBillingContractNoResult = ((JAXBElement<GetBulutSantralNumbersByBillingContractNoResponseModel> ) value);
    }

}
