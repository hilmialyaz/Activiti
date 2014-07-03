
package org.milleni.dunning.ws.client.coa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COAUpdateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COAUpdateResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}ServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="IsUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COAUpdateResponse", propOrder = {
    "isUpdate"
})
public class COAUpdateResponse
    extends ServiceResponse
{

    @XmlElement(name = "IsUpdate")
    protected boolean isUpdate;

    /**
     * Gets the value of the isUpdate property.
     * 
     */
    public boolean isIsUpdate() {
        return isUpdate;
    }

    /**
     * Sets the value of the isUpdate property.
     * 
     */
    public void setIsUpdate(boolean value) {
        this.isUpdate = value;
    }

}
