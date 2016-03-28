
package org.milleni.dunning.ws.client.tts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestFeedBackEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestFeedBackEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOTSET"/>
 *     &lt;enumeration value="SMS"/>
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="TEL"/>
 *     &lt;enumeration value="WEBS�TE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestFeedBackEnum", namespace = "http://milleni.com/TTS/TTS/Service/v1")
@XmlEnum
public enum RequestFeedBackEnum {

    NOTSET,
    SMS,
    EMAIL,
    TEL,
    WEBSITE;

    public String value() {
        return name();
    }

    public static RequestFeedBackEnum fromValue(String v) {
        return valueOf(v);
    }

}
