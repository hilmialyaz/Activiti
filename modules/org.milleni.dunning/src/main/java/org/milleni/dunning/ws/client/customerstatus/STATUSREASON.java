
package org.milleni.dunning.ws.client.customerstatus;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STATUS_REASON.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="STATUS_REASON">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BORCTAN_DOLAYI_IPTAL"/>
 *     &lt;enumeration value="BORCTAN_DOLAYI_SUSPEND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "STATUS_REASON")
@XmlEnum
public enum STATUSREASON {

    BORCTAN_DOLAYI_IPTAL,
    BORCTAN_DOLAYI_SUSPEND;

    public String value() {
        return name();
    }

    public static STATUSREASON fromValue(String v) {
        return valueOf(v);
    }

}
