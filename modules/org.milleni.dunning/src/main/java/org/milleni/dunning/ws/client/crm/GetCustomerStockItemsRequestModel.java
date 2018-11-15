
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomerStockItemsRequestModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerStockItemsRequestModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerInfo" type="{http://milleni.com/Bpm}CustomerInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerStockItemsRequestModel", propOrder = {
    "customerInfo"
})
public class GetCustomerStockItemsRequestModel {

    @XmlElementRef(name = "CustomerInfo", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<CustomerInfo> customerInfo;

    /**
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomerInfo }{@code >}
     *     
     */
    public JAXBElement<CustomerInfo> getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomerInfo }{@code >}
     *     
     */
    public void setCustomerInfo(JAXBElement<CustomerInfo> value) {
        this.customerInfo = ((JAXBElement<CustomerInfo> ) value);
    }

}
