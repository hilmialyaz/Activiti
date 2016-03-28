
package org.milleni.dunning.ws.client.notif;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAttachmentByte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAttachmentByte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttachmentByte" type="{http://milleni.com/Common/Notification/CommonNotification/Service/v1}AttachmentByte" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAttachmentByte", propOrder = {
    "attachmentByte"
})
public class ArrayOfAttachmentByte {

    @XmlElement(name = "AttachmentByte", nillable = true)
    protected List<AttachmentByte> attachmentByte;

    /**
     * Gets the value of the attachmentByte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentByte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentByte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentByte }
     * 
     * 
     */
    public List<AttachmentByte> getAttachmentByte() {
        if (attachmentByte == null) {
            attachmentByte = new ArrayList<AttachmentByte>();
        }
        return this.attachmentByte;
    }

}
