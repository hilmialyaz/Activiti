
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryCustomerStatusResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCustomerStatusResponseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CrmCustomerMessageType" type="{http://milleni.com/Crm}ArrayOfCrmCustomerMessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCustomerStatusResponseModel", propOrder = {
    "crmCustomerMessageType"
})
public class QueryCustomerStatusResponseModel {

    @XmlElementRef(name = "CrmCustomerMessageType", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCrmCustomerMessageType> crmCustomerMessageType;

    /**
     * Gets the value of the crmCustomerMessageType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmCustomerMessageType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCrmCustomerMessageType> getCrmCustomerMessageType() {
        return crmCustomerMessageType;
    }

    /**
     * Sets the value of the crmCustomerMessageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCrmCustomerMessageType }{@code >}
     *     
     */
    public void setCrmCustomerMessageType(JAXBElement<ArrayOfCrmCustomerMessageType> value) {
        this.crmCustomerMessageType = ((JAXBElement<ArrayOfCrmCustomerMessageType> ) value);
    }

}
