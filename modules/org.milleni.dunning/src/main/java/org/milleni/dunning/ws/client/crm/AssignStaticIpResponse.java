
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
 *         &lt;element name="AssignStaticIpResult" type="{/CustomerInfo/Service/v1}AssignStaticIpResponseModel" minOccurs="0"/>
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
    "assignStaticIpResult"
})
@XmlRootElement(name = "AssignStaticIpResponse")
public class AssignStaticIpResponse {

    @XmlElementRef(name = "AssignStaticIpResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<AssignStaticIpResponseModel> assignStaticIpResult;

    /**
     * Gets the value of the assignStaticIpResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AssignStaticIpResponseModel }{@code >}
     *     
     */
    public JAXBElement<AssignStaticIpResponseModel> getAssignStaticIpResult() {
        return assignStaticIpResult;
    }

    /**
     * Sets the value of the assignStaticIpResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AssignStaticIpResponseModel }{@code >}
     *     
     */
    public void setAssignStaticIpResult(JAXBElement<AssignStaticIpResponseModel> value) {
        this.assignStaticIpResult = ((JAXBElement<AssignStaticIpResponseModel> ) value);
    }

}
