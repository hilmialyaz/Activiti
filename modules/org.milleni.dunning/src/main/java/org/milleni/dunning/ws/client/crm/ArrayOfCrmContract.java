
package org.milleni.dunning.ws.client.crm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCrmContract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCrmContract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CrmContract" type="{http://milleni.com/Crm}CrmContract" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCrmContract", namespace = "http://milleni.com/Crm", propOrder = {
    "crmContract"
})
public class ArrayOfCrmContract {

    @XmlElement(name = "CrmContract", nillable = true)
    protected List<CrmContract> crmContract;

    /**
     * Gets the value of the crmContract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crmContract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrmContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrmContract }
     * 
     * 
     */
    public List<CrmContract> getCrmContract() {
        if (crmContract == null) {
            crmContract = new ArrayList<CrmContract>();
        }
        return this.crmContract;
    }

}
