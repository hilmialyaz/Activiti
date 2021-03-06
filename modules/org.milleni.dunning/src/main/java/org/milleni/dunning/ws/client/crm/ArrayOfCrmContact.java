
package org.milleni.dunning.ws.client.crm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCrmContact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCrmContact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CrmContact" type="{http://milleni.com/Crm}CrmContact" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCrmContact", namespace = "http://milleni.com/Crm", propOrder = {
    "crmContact"
})
public class ArrayOfCrmContact {

    @XmlElement(name = "CrmContact", nillable = true)
    protected List<CrmContact> crmContact;

    /**
     * Gets the value of the crmContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crmContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrmContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrmContact }
     * 
     * 
     */
    public List<CrmContact> getCrmContact() {
        if (crmContact == null) {
            crmContact = new ArrayList<CrmContact>();
        }
        return this.crmContact;
    }

}
