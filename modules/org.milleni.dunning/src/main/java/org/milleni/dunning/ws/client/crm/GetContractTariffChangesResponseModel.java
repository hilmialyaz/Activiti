
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetContractTariffChangesResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetContractTariffChangesResponseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TariffChanges" type="{/CustomerInfo/Service/v1}ArrayOfTariffChange"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetContractTariffChangesResponseModel", propOrder = {
    "tariffChanges"
})
public class GetContractTariffChangesResponseModel {

    @XmlElement(name = "TariffChanges", required = true, nillable = true)
    protected ArrayOfTariffChange tariffChanges;

    /**
     * Gets the value of the tariffChanges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTariffChange }
     *     
     */
    public ArrayOfTariffChange getTariffChanges() {
        return tariffChanges;
    }

    /**
     * Sets the value of the tariffChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTariffChange }
     *     
     */
    public void setTariffChanges(ArrayOfTariffChange value) {
        this.tariffChanges = value;
    }

}
