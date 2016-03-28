
package org.milleni.dunning.ws.client.crm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCrmCustomerMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCrmCustomerMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CrmCustomerMessageType" type="{http://milleni.com/Crm}CrmCustomerMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCrmCustomerMessageType", namespace = "http://milleni.com/Crm", propOrder = {
    "crmCustomerMessageType"
})
public class ArrayOfCrmCustomerMessageType {

    @XmlElement(name = "CrmCustomerMessageType", nillable = true)
    protected List<CrmCustomerMessageType> crmCustomerMessageType;

    /**
     * Gets the value of the crmCustomerMessageType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crmCustomerMessageType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrmCustomerMessageType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrmCustomerMessageType }
     * 
     * 
     */
    public List<CrmCustomerMessageType> getCrmCustomerMessageType() {
        if (crmCustomerMessageType == null) {
            crmCustomerMessageType = new ArrayList<CrmCustomerMessageType>();
        }
        return this.crmCustomerMessageType;
    }

}
