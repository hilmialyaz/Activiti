
package org.milleni.dunning.ws.client.crmaccountcoa;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApproveNotificationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApproveNotificationEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOTSET"/>
 *     &lt;enumeration value="ACCEPT"/>
 *     &lt;enumeration value="REJECT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ApproveNotificationEnum")
@XmlEnum
public enum ApproveNotificationEnum {

    NOTSET,
    ACCEPT,
    REJECT;

    public String value() {
        return name();
    }

    public static ApproveNotificationEnum fromValue(String v) {
        return valueOf(v);
    }

}
