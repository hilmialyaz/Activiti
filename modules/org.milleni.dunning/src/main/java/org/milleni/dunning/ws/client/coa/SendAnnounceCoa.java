
package org.milleni.dunning.ws.client.coa;

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
 *         &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="announceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="batchProcess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "channelId",
    "customerId",
    "announceType",
    "batchProcess"
})
@XmlRootElement(name = "SendAnnounceCoa")
public class SendAnnounceCoa {

    protected int channelId;
    protected int customerId;
    protected int announceType;
    protected boolean batchProcess;

    /**
     * Gets the value of the channelId property.
     * 
     */
    public int getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     * 
     */
    public void setChannelId(int value) {
        this.channelId = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     */
    public void setCustomerId(int value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the announceType property.
     * 
     */
    public int getAnnounceType() {
        return announceType;
    }

    /**
     * Sets the value of the announceType property.
     * 
     */
    public void setAnnounceType(int value) {
        this.announceType = value;
    }

    /**
     * Gets the value of the batchProcess property.
     * 
     */
    public boolean isBatchProcess() {
        return batchProcess;
    }

    /**
     * Sets the value of the batchProcess property.
     * 
     */
    public void setBatchProcess(boolean value) {
        this.batchProcess = value;
    }

}
