
package org.milleni.dunning.ws.client.crm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBulutSantralNumbers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBulutSantralNumbers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BulutSantralNumbers" type="{/CustomerInfo/Service/v1}BulutSantralNumbers" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBulutSantralNumbers", propOrder = {
    "bulutSantralNumbers"
})
public class ArrayOfBulutSantralNumbers {

    @XmlElement(name = "BulutSantralNumbers", nillable = true)
    protected List<BulutSantralNumbers> bulutSantralNumbers;

    /**
     * Gets the value of the bulutSantralNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bulutSantralNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBulutSantralNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BulutSantralNumbers }
     * 
     * 
     */
    public List<BulutSantralNumbers> getBulutSantralNumbers() {
        if (bulutSantralNumbers == null) {
            bulutSantralNumbers = new ArrayList<BulutSantralNumbers>();
        }
        return this.bulutSantralNumbers;
    }

}
