
package org.milleni.dunning.ws.client.crmaccountcoa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCreditCardOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCreditCardOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditCardOrder" type="{http://milleni.com/Payment}CreditCardOrder" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCreditCardOrder", namespace = "http://milleni.com/Payment", propOrder = {
    "creditCardOrder"
})
public class ArrayOfCreditCardOrder {

    @XmlElement(name = "CreditCardOrder", nillable = true)
    protected List<CreditCardOrder> creditCardOrder;

    /**
     * Gets the value of the creditCardOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditCardOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditCardOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditCardOrder }
     * 
     * 
     */
    public List<CreditCardOrder> getCreditCardOrder() {
        if (creditCardOrder == null) {
            creditCardOrder = new ArrayList<CreditCardOrder>();
        }
        return this.creditCardOrder;
    }

}
