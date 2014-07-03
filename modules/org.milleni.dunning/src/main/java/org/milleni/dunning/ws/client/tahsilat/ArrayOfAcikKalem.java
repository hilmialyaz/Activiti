
package org.milleni.dunning.ws.client.tahsilat;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAcikKalem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAcikKalem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcikKalem" type="{http://milleni.com/online_tahsilat}AcikKalem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAcikKalem", propOrder = {
    "acikKalem"
})
public class ArrayOfAcikKalem {

    @XmlElement(name = "AcikKalem", nillable = true)
    protected List<AcikKalem> acikKalem;

    /**
     * Gets the value of the acikKalem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acikKalem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcikKalem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcikKalem }
     * 
     * 
     */
    public List<AcikKalem> getAcikKalem() {
        if (acikKalem == null) {
            acikKalem = new ArrayList<AcikKalem>();
        }
        return this.acikKalem;
    }

}
