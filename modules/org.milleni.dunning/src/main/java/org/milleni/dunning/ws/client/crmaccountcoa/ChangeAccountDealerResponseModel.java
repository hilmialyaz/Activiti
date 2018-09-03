
package org.milleni.dunning.ws.client.crmaccountcoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeAccountDealerResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeAccountDealerResponseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillingResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeAccountDealerResponseModel", propOrder = {
    "billingResult"
})
public class ChangeAccountDealerResponseModel {

    @XmlElement(name = "BillingResult")
    protected boolean billingResult;

    /**
     * Gets the value of the billingResult property.
     * 
     */
    public boolean isBillingResult() {
        return billingResult;
    }

    /**
     * Sets the value of the billingResult property.
     * 
     */
    public void setBillingResult(boolean value) {
        this.billingResult = value;
    }

}
