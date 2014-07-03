
package org.milleni.dunning.ws.client.tahsilat;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTahsilatKalemi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTahsilatKalemi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TahsilatKalemi" type="{http://milleni.com/online_tahsilat}TahsilatKalemi" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTahsilatKalemi", propOrder = {
    "tahsilatKalemi"
})
public class ArrayOfTahsilatKalemi {

    @XmlElement(name = "TahsilatKalemi", nillable = true)
    protected List<TahsilatKalemi> tahsilatKalemi;

    /**
     * Gets the value of the tahsilatKalemi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tahsilatKalemi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTahsilatKalemi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TahsilatKalemi }
     * 
     * 
     */
    public List<TahsilatKalemi> getTahsilatKalemi() {
        if (tahsilatKalemi == null) {
            tahsilatKalemi = new ArrayList<TahsilatKalemi>();
        }
        return this.tahsilatKalemi;
    }

}
