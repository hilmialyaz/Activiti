
package org.milleni.dunning.ws.client.tts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CallCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Channel" type="{http://milleni.com/TTS/TTS/Service/v1}RequestChannelEnum" minOccurs="0"/>
 *         &lt;element name="ContractNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedBack" type="{http://milleni.com/TTS/TTS/Service/v1}RequestFeedBackEnum" minOccurs="0"/>
 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://milleni.com/TTS/TTS/Service/v1}RequestPriorityEnum" minOccurs="0"/>
 *         &lt;element name="RequestKind" type="{http://milleni.com/TTS/TTS/Service/v1}ApproveNotificationEnum" minOccurs="0"/>
 *         &lt;element name="RequestReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestData", propOrder = {
    "callCenter",
    "channel",
    "contractNo",
    "customerId",
    "customerName",
    "description",
    "email",
    "feedBack",
    "mobile",
    "priority",
    "requestKind",
    "requestReason",
    "requestType",
    "state",
    "subState",
    "subject"
})
public class RequestData {

    @XmlElementRef(name = "CallCenter", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", type = JAXBElement.class)
    protected JAXBElement<String> callCenter;
    @XmlElement(name = "Channel")
    protected RequestChannelEnum channel;
    @XmlElementRef(name = "ContractNo", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", type = JAXBElement.class)
    protected JAXBElement<String> contractNo;
    @XmlElement(name = "CustomerId")
    protected Integer customerId;
    @XmlElementRef(name = "CustomerName", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", type = JAXBElement.class)
    protected JAXBElement<String> customerName;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Email", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", type = JAXBElement.class)
    protected JAXBElement<String> email;
    @XmlElement(name = "FeedBack")
    protected RequestFeedBackEnum feedBack;
    @XmlElementRef(name = "Mobile", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", type = JAXBElement.class)
    protected JAXBElement<String> mobile;
    @XmlElement(name = "Priority")
    protected RequestPriorityEnum priority;
    @XmlElement(name = "RequestKind")
    protected ApproveNotificationEnum requestKind;
    @XmlElementRef(name = "RequestReason", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", type = JAXBElement.class)
    protected JAXBElement<String> requestReason;
    @XmlElementRef(name = "RequestType", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", type = JAXBElement.class)
    protected JAXBElement<String> requestType;
    @XmlElementRef(name = "State", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", type = JAXBElement.class)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "SubState", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", type = JAXBElement.class)
    protected JAXBElement<String> subState;
    @XmlElementRef(name = "Subject", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.TTS.TTSService.ServiceModel", type = JAXBElement.class)
    protected JAXBElement<String> subject;

    /**
     * Gets the value of the callCenter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallCenter() {
        return callCenter;
    }

    /**
     * Sets the value of the callCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallCenter(JAXBElement<String> value) {
        this.callCenter = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link RequestChannelEnum }
     *     
     */
    public RequestChannelEnum getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestChannelEnum }
     *     
     */
    public void setChannel(RequestChannelEnum value) {
        this.channel = value;
    }

    /**
     * Gets the value of the contractNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractNo() {
        return contractNo;
    }

    /**
     * Sets the value of the contractNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractNo(JAXBElement<String> value) {
        this.contractNo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerId(Integer value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerName(JAXBElement<String> value) {
        this.customerName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the feedBack property.
     * 
     * @return
     *     possible object is
     *     {@link RequestFeedBackEnum }
     *     
     */
    public RequestFeedBackEnum getFeedBack() {
        return feedBack;
    }

    /**
     * Sets the value of the feedBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestFeedBackEnum }
     *     
     */
    public void setFeedBack(RequestFeedBackEnum value) {
        this.feedBack = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobile(JAXBElement<String> value) {
        this.mobile = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link RequestPriorityEnum }
     *     
     */
    public RequestPriorityEnum getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestPriorityEnum }
     *     
     */
    public void setPriority(RequestPriorityEnum value) {
        this.priority = value;
    }

    /**
     * Gets the value of the requestKind property.
     * 
     * @return
     *     possible object is
     *     {@link ApproveNotificationEnum }
     *     
     */
    public ApproveNotificationEnum getRequestKind() {
        return requestKind;
    }

    /**
     * Sets the value of the requestKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproveNotificationEnum }
     *     
     */
    public void setRequestKind(ApproveNotificationEnum value) {
        this.requestKind = value;
    }

    /**
     * Gets the value of the requestReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestReason() {
        return requestReason;
    }

    /**
     * Sets the value of the requestReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestReason(JAXBElement<String> value) {
        this.requestReason = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestType(JAXBElement<String> value) {
        this.requestType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setState(JAXBElement<String> value) {
        this.state = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the subState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubState() {
        return subState;
    }

    /**
     * Sets the value of the subState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubState(JAXBElement<String> value) {
        this.subState = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubject(JAXBElement<String> value) {
        this.subject = ((JAXBElement<String> ) value);
    }

}
