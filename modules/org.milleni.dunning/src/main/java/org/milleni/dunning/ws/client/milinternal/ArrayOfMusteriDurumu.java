
package org.milleni.dunning.ws.client.milinternal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMusteriDurumu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMusteriDurumu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MusteriDurumu" type="{http://milleni.com/internal}MusteriDurumu" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMusteriDurumu", propOrder = {
    "musteriDurumu"
})
public class ArrayOfMusteriDurumu {

    @XmlElement(name = "MusteriDurumu", nillable = true)
    protected List<MusteriDurumu> musteriDurumu;

    /**
     * Gets the value of the musteriDurumu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the musteriDurumu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMusteriDurumu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MusteriDurumu }
     * 
     * 
     */
    public List<MusteriDurumu> getMusteriDurumu() {
        if (musteriDurumu == null) {
            musteriDurumu = new ArrayList<MusteriDurumu>();
        }
        return this.musteriDurumu;
    }

}
