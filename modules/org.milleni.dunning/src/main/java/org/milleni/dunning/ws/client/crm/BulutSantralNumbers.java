
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BulutSantralNumbers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BulutSantralNumbers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CallRestriction" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CliNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Device" type="{/CustomerInfo/Service/v1}BulutSantralVoipDevice" minOccurs="0"/>
 *         &lt;element name="HasMillenifon" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPilot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NetworkType" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.Contracts.CustomerInfoService.Type}NumberNetworkType" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PortaoneAccoutId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PortaoneCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PortaoneDevicePort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PortaoneNumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SipPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SipUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VoiceRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BulutSantralNumbers", propOrder = {
    "callRestriction",
    "cliNumber",
    "device",
    "hasMillenifon",
    "isPilot",
    "networkType",
    "number",
    "operationType",
    "portaoneAccoutId",
    "portaoneCustomerId",
    "portaoneDevicePort",
    "portaoneNumberType",
    "sipPassword",
    "sipUserName",
    "voiceRecord"
})
public class BulutSantralNumbers {

    @XmlElement(name = "CallRestriction")
    protected Integer callRestriction;
    @XmlElementRef(name = "CliNumber", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> cliNumber;
    @XmlElementRef(name = "Device", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<BulutSantralVoipDevice> device;
    @XmlElement(name = "HasMillenifon")
    protected Boolean hasMillenifon;
    @XmlElement(name = "IsPilot")
    protected Boolean isPilot;
    @XmlElement(name = "NetworkType")
    protected NumberNetworkType networkType;
    @XmlElement(name = "Number", required = true, nillable = true)
    protected String number;
    @XmlElementRef(name = "OperationType", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> operationType;
    @XmlElementRef(name = "PortaoneAccoutId", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> portaoneAccoutId;
    @XmlElementRef(name = "PortaoneCustomerId", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> portaoneCustomerId;
    @XmlElementRef(name = "PortaoneDevicePort", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> portaoneDevicePort;
    @XmlElementRef(name = "PortaoneNumberType", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> portaoneNumberType;
    @XmlElementRef(name = "SipPassword", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> sipPassword;
    @XmlElementRef(name = "SipUserName", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<String> sipUserName;
    @XmlElement(name = "VoiceRecord")
    protected Boolean voiceRecord;

    /**
     * Gets the value of the callRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCallRestriction() {
        return callRestriction;
    }

    /**
     * Sets the value of the callRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCallRestriction(Integer value) {
        this.callRestriction = value;
    }

    /**
     * Gets the value of the cliNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCliNumber() {
        return cliNumber;
    }

    /**
     * Sets the value of the cliNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCliNumber(JAXBElement<String> value) {
        this.cliNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BulutSantralVoipDevice }{@code >}
     *     
     */
    public JAXBElement<BulutSantralVoipDevice> getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BulutSantralVoipDevice }{@code >}
     *     
     */
    public void setDevice(JAXBElement<BulutSantralVoipDevice> value) {
        this.device = ((JAXBElement<BulutSantralVoipDevice> ) value);
    }

    /**
     * Gets the value of the hasMillenifon property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMillenifon() {
        return hasMillenifon;
    }

    /**
     * Sets the value of the hasMillenifon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMillenifon(Boolean value) {
        this.hasMillenifon = value;
    }

    /**
     * Gets the value of the isPilot property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPilot() {
        return isPilot;
    }

    /**
     * Sets the value of the isPilot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPilot(Boolean value) {
        this.isPilot = value;
    }

    /**
     * Gets the value of the networkType property.
     * 
     * @return
     *     possible object is
     *     {@link NumberNetworkType }
     *     
     */
    public NumberNetworkType getNetworkType() {
        return networkType;
    }

    /**
     * Sets the value of the networkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberNetworkType }
     *     
     */
    public void setNetworkType(NumberNetworkType value) {
        this.networkType = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperationType(JAXBElement<String> value) {
        this.operationType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the portaoneAccoutId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPortaoneAccoutId() {
        return portaoneAccoutId;
    }

    /**
     * Sets the value of the portaoneAccoutId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPortaoneAccoutId(JAXBElement<String> value) {
        this.portaoneAccoutId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the portaoneCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPortaoneCustomerId() {
        return portaoneCustomerId;
    }

    /**
     * Sets the value of the portaoneCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPortaoneCustomerId(JAXBElement<String> value) {
        this.portaoneCustomerId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the portaoneDevicePort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPortaoneDevicePort() {
        return portaoneDevicePort;
    }

    /**
     * Sets the value of the portaoneDevicePort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPortaoneDevicePort(JAXBElement<String> value) {
        this.portaoneDevicePort = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the portaoneNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPortaoneNumberType() {
        return portaoneNumberType;
    }

    /**
     * Sets the value of the portaoneNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPortaoneNumberType(JAXBElement<String> value) {
        this.portaoneNumberType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sipPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSipPassword() {
        return sipPassword;
    }

    /**
     * Sets the value of the sipPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSipPassword(JAXBElement<String> value) {
        this.sipPassword = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sipUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSipUserName() {
        return sipUserName;
    }

    /**
     * Sets the value of the sipUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSipUserName(JAXBElement<String> value) {
        this.sipUserName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the voiceRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoiceRecord() {
        return voiceRecord;
    }

    /**
     * Sets the value of the voiceRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoiceRecord(Boolean value) {
        this.voiceRecord = value;
    }

}
