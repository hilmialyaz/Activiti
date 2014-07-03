
package org.milleni.dunning.ws.client.customerservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotaLoginNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotaLoginNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ContractId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QuotaGb" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DownloadByte" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DownloadGB" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="RemainingQuotaGB" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="UploadByte" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotaLoginNameResponse", propOrder = {
    "loginName",
    "customerId",
    "contractId",
    "quotaGb",
    "downloadByte",
    "downloadGB",
    "remainingQuotaGB",
    "uploadByte"
})
public class QuotaLoginNameResponse {

    @XmlElement(name = "LoginName")
    protected String loginName;
    @XmlElement(name = "CustomerId")
    protected long customerId;
    @XmlElement(name = "ContractId")
    protected long contractId;
    @XmlElement(name = "QuotaGb")
    protected double quotaGb;
    @XmlElement(name = "DownloadByte")
    protected double downloadByte;
    @XmlElement(name = "DownloadGB")
    protected double downloadGB;
    @XmlElement(name = "RemainingQuotaGB")
    protected double remainingQuotaGB;
    @XmlElement(name = "UploadByte")
    protected double uploadByte;

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
     * Gets the value of the customerId property.
     * 
     */
    public long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     */
    public void setCustomerId(long value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     */
    public long getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     */
    public void setContractId(long value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the quotaGb property.
     * 
     */
    public double getQuotaGb() {
        return quotaGb;
    }

    /**
     * Sets the value of the quotaGb property.
     * 
     */
    public void setQuotaGb(double value) {
        this.quotaGb = value;
    }

    /**
     * Gets the value of the downloadByte property.
     * 
     */
    public double getDownloadByte() {
        return downloadByte;
    }

    /**
     * Sets the value of the downloadByte property.
     * 
     */
    public void setDownloadByte(double value) {
        this.downloadByte = value;
    }

    /**
     * Gets the value of the downloadGB property.
     * 
     */
    public double getDownloadGB() {
        return downloadGB;
    }

    /**
     * Sets the value of the downloadGB property.
     * 
     */
    public void setDownloadGB(double value) {
        this.downloadGB = value;
    }

    /**
     * Gets the value of the remainingQuotaGB property.
     * 
     */
    public double getRemainingQuotaGB() {
        return remainingQuotaGB;
    }

    /**
     * Sets the value of the remainingQuotaGB property.
     * 
     */
    public void setRemainingQuotaGB(double value) {
        this.remainingQuotaGB = value;
    }

    /**
     * Gets the value of the uploadByte property.
     * 
     */
    public double getUploadByte() {
        return uploadByte;
    }

    /**
     * Sets the value of the uploadByte property.
     * 
     */
    public void setUploadByte(double value) {
        this.uploadByte = value;
    }

}
