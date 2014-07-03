
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
 *         &lt;element name="ProcessSuspendedContractsResult" type="{/CustomerInfo/Service/v1}ProcessSuspendedContractsResponseModel" minOccurs="0"/>
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
    "processSuspendedContractsResult"
})
@XmlRootElement(name = "ProcessSuspendedContractsResponse")
public class ProcessSuspendedContractsResponse {

    @XmlElementRef(name = "ProcessSuspendedContractsResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ProcessSuspendedContractsResponseModel> processSuspendedContractsResult;

    /**
     * Gets the value of the processSuspendedContractsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProcessSuspendedContractsResponseModel }{@code >}
     *     
     */
    public JAXBElement<ProcessSuspendedContractsResponseModel> getProcessSuspendedContractsResult() {
        return processSuspendedContractsResult;
    }

    /**
     * Sets the value of the processSuspendedContractsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProcessSuspendedContractsResponseModel }{@code >}
     *     
     */
    public void setProcessSuspendedContractsResult(JAXBElement<ProcessSuspendedContractsResponseModel> value) {
        this.processSuspendedContractsResult = ((JAXBElement<ProcessSuspendedContractsResponseModel> ) value);
    }

}
