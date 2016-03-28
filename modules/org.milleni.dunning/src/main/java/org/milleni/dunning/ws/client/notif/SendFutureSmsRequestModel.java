
package org.milleni.dunning.ws.client.notif;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SendFutureSmsRequestModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendFutureSmsRequestModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CustomerIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint"/>
 *         &lt;element name="FutureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Message" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"/>
 *         &lt;element name="Numbers" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"/>
 *         &lt;element name="Originator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendFutureSmsRequestModel", propOrder = {
    "applicationId",
    "customerIds",
    "futureDate",
    "message",
    "numbers",
    "originator"
})
public class SendFutureSmsRequestModel {

    @XmlElement(name = "ApplicationId")
    protected int applicationId;
    @XmlElement(name = "CustomerIds", required = true, nillable = true)
    protected ArrayOfint customerIds;
    @XmlElement(name = "FutureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar futureDate;
    @XmlElement(name = "Message", required = true, nillable = true)
    protected ArrayOfstring message;
    @XmlElement(name = "Numbers", required = true, nillable = true)
    protected ArrayOfstring numbers;
    @XmlElement(name = "Originator", required = true, nillable = true)
    protected String originator;

    /**
     * Gets the value of the applicationId property.
     * 
     */
    public int getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     */
    public void setApplicationId(int value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the customerIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getCustomerIds() {
        return customerIds;
    }

    /**
     * Sets the value of the customerIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setCustomerIds(ArrayOfint value) {
        this.customerIds = value;
    }

    /**
     * Gets the value of the futureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFutureDate() {
        return futureDate;
    }

    /**
     * Sets the value of the futureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFutureDate(XMLGregorianCalendar value) {
        this.futureDate = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setMessage(ArrayOfstring value) {
        this.message = value;
    }

    /**
     * Gets the value of the numbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getNumbers() {
        return numbers;
    }

    /**
     * Sets the value of the numbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setNumbers(ArrayOfstring value) {
        this.numbers = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginator(String value) {
        this.originator = value;
    }

}
