
package org.milleni.dunning.ws.client.coa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="loginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updateIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offerType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="preAppealId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "customerId",
    "loginName",
    "updateIp",
    "offerType",
    "preAppealId"
})
@XmlRootElement(name = "OfferCommitmentResumeRequest")
public class OfferCommitmentResumeRequest {

    protected int customerId;
    protected String loginName;
    protected String updateIp;
    protected int offerType;
    protected int preAppealId;

    /**
     * Gets the value of the customerId property.
     * 
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     */
    public void setCustomerId(int value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginName(String value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the updateIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateIp() {
        return updateIp;
    }

    /**
     * Sets the value of the updateIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateIp(String value) {
        this.updateIp = value;
    }

    /**
     * Gets the value of the offerType property.
     * 
     */
    public int getOfferType() {
        return offerType;
    }

    /**
     * Sets the value of the offerType property.
     * 
     */
    public void setOfferType(int value) {
        this.offerType = value;
    }

    /**
     * Gets the value of the preAppealId property.
     * 
     */
    public int getPreAppealId() {
        return preAppealId;
    }

    /**
     * Sets the value of the preAppealId property.
     * 
     */
    public void setPreAppealId(int value) {
        this.preAppealId = value;
    }

}
