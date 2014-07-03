
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPartnerResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPartnerResponseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Partner" type="{http://milleni.com/Crm}Partner" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPartnerResponseModel", propOrder = {
    "partner"
})
public class GetPartnerResponseModel {

    @XmlElementRef(name = "Partner", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<Partner> partner;

    /**
     * Gets the value of the partner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Partner }{@code >}
     *     
     */
    public JAXBElement<Partner> getPartner() {
        return partner;
    }

    /**
     * Sets the value of the partner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Partner }{@code >}
     *     
     */
    public void setPartner(JAXBElement<Partner> value) {
        this.partner = ((JAXBElement<Partner> ) value);
    }

}
