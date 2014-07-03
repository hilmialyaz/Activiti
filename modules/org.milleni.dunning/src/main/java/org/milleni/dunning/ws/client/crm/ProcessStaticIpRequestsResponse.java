
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
 *         &lt;element name="ProcessStaticIpRequestsResult" type="{/CustomerInfo/Service/v1}ProcessStaticIpRequestsResponseModel" minOccurs="0"/>
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
    "processStaticIpRequestsResult"
})
@XmlRootElement(name = "ProcessStaticIpRequestsResponse")
public class ProcessStaticIpRequestsResponse {

    @XmlElementRef(name = "ProcessStaticIpRequestsResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ProcessStaticIpRequestsResponseModel> processStaticIpRequestsResult;

    /**
     * Gets the value of the processStaticIpRequestsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProcessStaticIpRequestsResponseModel }{@code >}
     *     
     */
    public JAXBElement<ProcessStaticIpRequestsResponseModel> getProcessStaticIpRequestsResult() {
        return processStaticIpRequestsResult;
    }

    /**
     * Sets the value of the processStaticIpRequestsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProcessStaticIpRequestsResponseModel }{@code >}
     *     
     */
    public void setProcessStaticIpRequestsResult(JAXBElement<ProcessStaticIpRequestsResponseModel> value) {
        this.processStaticIpRequestsResult = ((JAXBElement<ProcessStaticIpRequestsResponseModel> ) value);
    }

}
