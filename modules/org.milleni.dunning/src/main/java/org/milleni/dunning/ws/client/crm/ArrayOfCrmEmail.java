
package org.milleni.dunning.ws.client.crm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCrmEmail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCrmEmail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CrmEmail" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm}CrmEmail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCrmEmail", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm", propOrder = {
    "crmEmail"
})
public class ArrayOfCrmEmail {

    @XmlElement(name = "CrmEmail", nillable = true)
    protected List<CrmEmail> crmEmail;

    /**
     * Gets the value of the crmEmail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crmEmail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrmEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrmEmail }
     * 
     * 
     */
    public List<CrmEmail> getCrmEmail() {
        if (crmEmail == null) {
            crmEmail = new ArrayList<CrmEmail>();
        }
        return this.crmEmail;
    }

}
