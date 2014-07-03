
package org.milleni.dunning.ws.client.customerservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsageResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://milleni.com.tr/CustomerInfoService/}ServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="resonseList" type="{http://milleni.com.tr/CustomerInfoService/}ArrayOfQuotaLoginNameResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageResponse", propOrder = {
    "resonseList"
})
public class UsageResponse
    extends ServiceResponse
{

    protected ArrayOfQuotaLoginNameResponse resonseList;

    /**
     * Gets the value of the resonseList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuotaLoginNameResponse }
     *     
     */
    public ArrayOfQuotaLoginNameResponse getResonseList() {
        return resonseList;
    }

    /**
     * Sets the value of the resonseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuotaLoginNameResponse }
     *     
     */
    public void setResonseList(ArrayOfQuotaLoginNameResponse value) {
        this.resonseList = value;
    }

}
