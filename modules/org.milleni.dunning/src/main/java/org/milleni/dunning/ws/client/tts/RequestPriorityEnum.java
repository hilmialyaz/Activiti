
package org.milleni.dunning.ws.client.tts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestPriorityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestPriorityEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOTSET"/>
 *     &lt;enumeration value="LOW"/>
 *     &lt;enumeration value="MIDDLE"/>
 *     &lt;enumeration value="HIGH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestPriorityEnum", namespace = "http://milleni.com/TTS/TTS/Service/v1")
@XmlEnum
public enum RequestPriorityEnum {

    NOTSET,
    LOW,
    MIDDLE,
    HIGH;

    public String value() {
        return name();
    }

    public static RequestPriorityEnum fromValue(String v) {
        return valueOf(v);
    }

}
