
package org.milleni.dunning.ws.client.crm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCrmPoolItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCrmPoolItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CrmPoolItem" type="{http://milleni.com/Crm}CrmPoolItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCrmPoolItem", namespace = "http://milleni.com/Crm", propOrder = {
    "crmPoolItem"
})
public class ArrayOfCrmPoolItem {

    @XmlElement(name = "CrmPoolItem", nillable = true)
    protected List<CrmPoolItem> crmPoolItem;

    /**
     * Gets the value of the crmPoolItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crmPoolItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrmPoolItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrmPoolItem }
     * 
     * 
     */
    public List<CrmPoolItem> getCrmPoolItem() {
        if (crmPoolItem == null) {
            crmPoolItem = new ArrayList<CrmPoolItem>();
        }
        return this.crmPoolItem;
    }

}
