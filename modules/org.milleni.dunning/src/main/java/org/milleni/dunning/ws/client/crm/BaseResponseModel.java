
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseResponseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ResultMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultType" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Enum}ResultTypeEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseResponseModel", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model", propOrder = {
    "resultCode",
    "resultMessage",
    "resultType"
})
@XmlSeeAlso({
    ProcessProcessRequestResponseModel.class,
    CancelProcessResponseModel.class,
    GetRemaingFreeUnitUsageByPhoneNumberResponseModel.class
})
public class BaseResponseModel {

    @XmlElement(name = "ResultCode")
    protected int resultCode;
    @XmlElementRef(name = "ResultMessage", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model", type = JAXBElement.class)
    protected JAXBElement<String> resultMessage;
    @XmlElement(name = "ResultType", required = true)
    protected ResultTypeEnum resultType;

    /**
     * Gets the value of the resultCode property.
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the resultMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResultMessage() {
        return resultMessage;
    }

    /**
     * Sets the value of the resultMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResultMessage(JAXBElement<String> value) {
        this.resultMessage = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the resultType property.
     * 
     * @return
     *     possible object is
     *     {@link ResultTypeEnum }
     *     
     */
    public ResultTypeEnum getResultType() {
        return resultType;
    }

    /**
     * Sets the value of the resultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultTypeEnum }
     *     
     */
    public void setResultType(ResultTypeEnum value) {
        this.resultType = value;
    }

}
