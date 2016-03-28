
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
 *         &lt;element name="GetContractTariffChangesResult" type="{/CustomerInfo/Service/v1}GetContractTariffChangesResponseModel" minOccurs="0"/>
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
    "getContractTariffChangesResult"
})
@XmlRootElement(name = "GetContractTariffChangesResponse")
public class GetContractTariffChangesResponse {

    @XmlElementRef(name = "GetContractTariffChangesResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<GetContractTariffChangesResponseModel> getContractTariffChangesResult;

    /**
     * Gets the value of the getContractTariffChangesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetContractTariffChangesResponseModel }{@code >}
     *     
     */
    public JAXBElement<GetContractTariffChangesResponseModel> getGetContractTariffChangesResult() {
        return getContractTariffChangesResult;
    }

    /**
     * Sets the value of the getContractTariffChangesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetContractTariffChangesResponseModel }{@code >}
     *     
     */
    public void setGetContractTariffChangesResult(JAXBElement<GetContractTariffChangesResponseModel> value) {
        this.getContractTariffChangesResult = ((JAXBElement<GetContractTariffChangesResponseModel> ) value);
    }

}
