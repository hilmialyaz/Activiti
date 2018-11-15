
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBulutSantralNumbersByBillingContractNoResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBulutSantralNumbersByBillingContractNoResponseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsDummyProduct" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Numbers" type="{/CustomerInfo/Service/v1}ArrayOfBulutSantralNumbers"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBulutSantralNumbersByBillingContractNoResponseModel", propOrder = {
    "isDummyProduct",
    "numbers"
})
public class GetBulutSantralNumbersByBillingContractNoResponseModel {

    @XmlElement(name = "IsDummyProduct")
    protected boolean isDummyProduct;
    @XmlElement(name = "Numbers", required = true, nillable = true)
    protected ArrayOfBulutSantralNumbers numbers;

    /**
     * Gets the value of the isDummyProduct property.
     * 
     */
    public boolean isIsDummyProduct() {
        return isDummyProduct;
    }

    /**
     * Sets the value of the isDummyProduct property.
     * 
     */
    public void setIsDummyProduct(boolean value) {
        this.isDummyProduct = value;
    }

    /**
     * Gets the value of the numbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBulutSantralNumbers }
     *     
     */
    public ArrayOfBulutSantralNumbers getNumbers() {
        return numbers;
    }

    /**
     * Sets the value of the numbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBulutSantralNumbers }
     *     
     */
    public void setNumbers(ArrayOfBulutSantralNumbers value) {
        this.numbers = value;
    }

}
