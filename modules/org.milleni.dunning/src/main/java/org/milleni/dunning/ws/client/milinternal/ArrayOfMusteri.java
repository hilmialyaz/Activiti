
package org.milleni.dunning.ws.client.milinternal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMusteri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMusteri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Musteri" type="{http://milleni.com/internal}Musteri" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMusteri", propOrder = {
    "musteri"
})
public class ArrayOfMusteri {

    @XmlElement(name = "Musteri", nillable = true)
    protected List<Musteri> musteri;

    /**
     * Gets the value of the musteri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the musteri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMusteri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Musteri }
     * 
     * 
     */
    public List<Musteri> getMusteri() {
        if (musteri == null) {
            musteri = new ArrayList<Musteri>();
        }
        return this.musteri;
    }

}
