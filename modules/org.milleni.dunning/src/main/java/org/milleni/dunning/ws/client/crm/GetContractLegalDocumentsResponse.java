
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
 *         &lt;element name="GetContractLegalDocumentsResult" type="{/CustomerInfo/Service/v1}GetContractDocumentsResponseModel" minOccurs="0"/>
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
    "getContractLegalDocumentsResult"
})
@XmlRootElement(name = "GetContractLegalDocumentsResponse")
public class GetContractLegalDocumentsResponse {

    @XmlElementRef(name = "GetContractLegalDocumentsResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<GetContractDocumentsResponseModel> getContractLegalDocumentsResult;

    /**
     * Gets the value of the getContractLegalDocumentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetContractDocumentsResponseModel }{@code >}
     *     
     */
    public JAXBElement<GetContractDocumentsResponseModel> getGetContractLegalDocumentsResult() {
        return getContractLegalDocumentsResult;
    }

    /**
     * Sets the value of the getContractLegalDocumentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetContractDocumentsResponseModel }{@code >}
     *     
     */
    public void setGetContractLegalDocumentsResult(JAXBElement<GetContractDocumentsResponseModel> value) {
        this.getContractLegalDocumentsResult = ((JAXBElement<GetContractDocumentsResponseModel> ) value);
    }

}
