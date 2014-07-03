
package org.milleni.dunning.ws.client.customerservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfQuotaLoginNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfQuotaLoginNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuotaLoginNameResponse" type="{http://milleni.com.tr/CustomerInfoService/}QuotaLoginNameResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQuotaLoginNameResponse", propOrder = {
    "quotaLoginNameResponse"
})
public class ArrayOfQuotaLoginNameResponse {

    @XmlElement(name = "QuotaLoginNameResponse", nillable = true)
    protected List<QuotaLoginNameResponse> quotaLoginNameResponse;

    /**
     * Gets the value of the quotaLoginNameResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotaLoginNameResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotaLoginNameResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuotaLoginNameResponse }
     * 
     * 
     */
    public List<QuotaLoginNameResponse> getQuotaLoginNameResponse() {
        if (quotaLoginNameResponse == null) {
            quotaLoginNameResponse = new ArrayList<QuotaLoginNameResponse>();
        }
        return this.quotaLoginNameResponse;
    }

}
