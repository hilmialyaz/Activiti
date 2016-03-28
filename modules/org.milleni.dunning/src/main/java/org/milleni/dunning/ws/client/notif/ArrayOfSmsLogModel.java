
package org.milleni.dunning.ws.client.notif;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSmsLogModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSmsLogModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SmsLogModel" type="{http://milleni.com/Common/Notification/CommonNotification/Service/v1}SmsLogModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSmsLogModel", propOrder = {
    "smsLogModel"
})
public class ArrayOfSmsLogModel {

    @XmlElement(name = "SmsLogModel", nillable = true)
    protected List<SmsLogModel> smsLogModel;

    /**
     * Gets the value of the smsLogModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smsLogModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmsLogModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmsLogModel }
     * 
     * 
     */
    public List<SmsLogModel> getSmsLogModel() {
        if (smsLogModel == null) {
            smsLogModel = new ArrayList<SmsLogModel>();
        }
        return this.smsLogModel;
    }

}
