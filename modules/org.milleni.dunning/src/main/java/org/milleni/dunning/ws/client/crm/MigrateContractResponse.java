
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="MigrateContractResult" type="{/CustomerInfo/Service/v1}MigrateContractResponseModel" minOccurs="0"/>
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
    "migrateContractResult"
})
@XmlRootElement(name = "MigrateContractResponse")
public class MigrateContractResponse {

    @XmlElementRef(name = "MigrateContractResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<MigrateContractResponseModel> migrateContractResult;

    /**
     * Gets the value of the migrateContractResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MigrateContractResponseModel }{@code >}
     *     
     */
    public JAXBElement<MigrateContractResponseModel> getMigrateContractResult() {
        return migrateContractResult;
    }

    /**
     * Sets the value of the migrateContractResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MigrateContractResponseModel }{@code >}
     *     
     */
    public void setMigrateContractResult(JAXBElement<MigrateContractResponseModel> value) {
        this.migrateContractResult = ((JAXBElement<MigrateContractResponseModel> ) value);
    }

}
