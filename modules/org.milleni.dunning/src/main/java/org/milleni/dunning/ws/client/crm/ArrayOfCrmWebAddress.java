
package org.milleni.dunning.ws.client.crm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCrmWebAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCrmWebAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CrmWebAddress" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm}CrmWebAddress" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCrmWebAddress", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", propOrder = {
    "crmWebAddress"
})
public class ArrayOfCrmWebAddress {

    @XmlElement(name = "CrmWebAddress", nillable = true)
    protected List<CrmWebAddress> crmWebAddress;

    /**
     * Gets the value of the crmWebAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crmWebAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrmWebAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrmWebAddress }
     * 
     * 
     */
    public List<CrmWebAddress> getCrmWebAddress() {
        if (crmWebAddress == null) {
            crmWebAddress = new ArrayList<CrmWebAddress>();
        }
        return this.crmWebAddress;
    }

}
