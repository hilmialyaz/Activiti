
package org.milleni.dunning.ws.client.tts;

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
 *     &lt;enumeration value="CALL"/>
 *     &lt;enumeration value="DEMAND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ApproveNotificationEnum", namespace = "http://milleni.com/TTS/TTS/Service/v1")
@XmlEnum
public enum ApproveNotificationEnum {

    CALL,
    DEMAND;

    public String value() {
        return name();
    }

    public static ApproveNotificationEnum fromValue(String v) {
        return valueOf(v);
    }

}
