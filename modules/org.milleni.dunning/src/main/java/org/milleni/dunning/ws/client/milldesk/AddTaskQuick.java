
package org.milleni.dunning.ws.client.milldesk;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sNeden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sTalepKonusu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sAltDurum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "customerID",
    "sNeden",
    "sTalepKonusu",
    "sAltDurum",
    "sStatus",
    "sMessage"
})
@XmlRootElement(name = "Add_Task_Quick")
public class AddTaskQuick {

    @XmlElement(name = "CustomerID")
    protected int customerID;
    protected String sNeden;
    protected String sTalepKonusu;
    protected String sAltDurum;
    protected String sStatus;
    protected String sMessage;

    /**
     * Gets the value of the customerID property.
     * 
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     */
    public void setCustomerID(int value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the sNeden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNeden() {
        return sNeden;
    }

    /**
     * Sets the value of the sNeden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNeden(String value) {
        this.sNeden = value;
    }

    /**
     * Gets the value of the sTalepKonusu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTalepKonusu() {
        return sTalepKonusu;
    }

    /**
     * Sets the value of the sTalepKonusu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTalepKonusu(String value) {
        this.sTalepKonusu = value;
    }

    /**
     * Gets the value of the sAltDurum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAltDurum() {
        return sAltDurum;
    }

    /**
     * Sets the value of the sAltDurum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAltDurum(String value) {
        this.sAltDurum = value;
    }

    /**
     * Gets the value of the sStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSStatus() {
        return sStatus;
    }

    /**
     * Sets the value of the sStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSStatus(String value) {
        this.sStatus = value;
    }

    /**
     * Gets the value of the sMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMessage() {
        return sMessage;
    }

    /**
     * Sets the value of the sMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMessage(String value) {
        this.sMessage = value;
    }

}
