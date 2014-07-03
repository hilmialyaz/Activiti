
package org.milleni.dunning.ws.client.milldesk;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="retrieveOpenTicklerCountResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "retrieveOpenTicklerCountResult"
})
@XmlRootElement(name = "retrieveOpenTicklerCountResponse")
public class RetrieveOpenTicklerCountResponse {

    protected int retrieveOpenTicklerCountResult;

    /**
     * Gets the value of the retrieveOpenTicklerCountResult property.
     * 
     */
    public int getRetrieveOpenTicklerCountResult() {
        return retrieveOpenTicklerCountResult;
    }

    /**
     * Sets the value of the retrieveOpenTicklerCountResult property.
     * 
     */
    public void setRetrieveOpenTicklerCountResult(int value) {
        this.retrieveOpenTicklerCountResult = value;
    }

}
