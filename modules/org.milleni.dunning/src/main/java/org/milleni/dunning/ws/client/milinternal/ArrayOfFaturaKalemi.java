
package org.milleni.dunning.ws.client.milinternal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFaturaKalemi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFaturaKalemi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FaturaKalemi" type="{http://milleni.com/internal}FaturaKalemi" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFaturaKalemi", propOrder = {
    "faturaKalemi"
})
public class ArrayOfFaturaKalemi {

    @XmlElement(name = "FaturaKalemi", nillable = true)
    protected List<FaturaKalemi> faturaKalemi;

    /**
     * Gets the value of the faturaKalemi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faturaKalemi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaturaKalemi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaturaKalemi }
     * 
     * 
     */
    public List<FaturaKalemi> getFaturaKalemi() {
        if (faturaKalemi == null) {
            faturaKalemi = new ArrayList<FaturaKalemi>();
        }
        return this.faturaKalemi;
    }

}
