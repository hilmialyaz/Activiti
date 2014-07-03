
package org.milleni.dunning.ws.client.customerservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TeconCustomerInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeconCustomerInfoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://milleni.com.tr/CustomerInfoService/}ServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="customer" type="{http://milleni.com.tr/CustomerInfoService/}TeconCustomerInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeconCustomerInfoResponse", propOrder = {
    "customer"
})
public class TeconCustomerInfoResponse
    extends ServiceResponse
{

    protected TeconCustomerInfo customer;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link TeconCustomerInfo }
     *     
     */
    public TeconCustomerInfo getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeconCustomerInfo }
     *     
     */
    public void setCustomer(TeconCustomerInfo value) {
        this.customer = value;
    }

}
