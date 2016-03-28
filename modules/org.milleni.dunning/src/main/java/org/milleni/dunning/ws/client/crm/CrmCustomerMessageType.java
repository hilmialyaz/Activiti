
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrmCustomerMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrmCustomerMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiagnosticTypeEnum" type="{http://milleni.com/Common/Customer}DiagnosticTypeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrmCustomerMessageType", namespace = "http://milleni.com/Crm", propOrder = {
    "code",
    "description",
    "diagnosticTypeEnum"
})
public class CrmCustomerMessageType {

    @XmlElementRef(name = "Code", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> code;
    @XmlElementRef(name = "Description", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElement(name = "DiagnosticTypeEnum")
    protected DiagnosticTypeEnum diagnosticTypeEnum;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCode(JAXBElement<String> value) {
        this.code = ((JAXBElement<String> ) value);
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
     * Gets the value of the diagnosticTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticTypeEnum }
     *     
     */
    public DiagnosticTypeEnum getDiagnosticTypeEnum() {
        return diagnosticTypeEnum;
    }

    /**
     * Sets the value of the diagnosticTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticTypeEnum }
     *     
     */
    public void setDiagnosticTypeEnum(DiagnosticTypeEnum value) {
        this.diagnosticTypeEnum = value;
    }

}
