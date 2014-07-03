
package org.milleni.dunning.ws.client.milldesk;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Add_Task_ExtResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addTaskExtResult"
})
@XmlRootElement(name = "Add_Task_ExtResponse")
public class AddTaskExtResponse {

    @XmlElement(name = "Add_Task_ExtResult")
    protected String addTaskExtResult;

    /**
     * Gets the value of the addTaskExtResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddTaskExtResult() {
        return addTaskExtResult;
    }

    /**
     * Sets the value of the addTaskExtResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddTaskExtResult(String value) {
        this.addTaskExtResult = value;
    }

}
