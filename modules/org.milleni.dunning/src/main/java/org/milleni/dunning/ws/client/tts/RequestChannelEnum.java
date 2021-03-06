
package org.milleni.dunning.ws.client.tts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestChannelEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestChannelEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOTSET"/>
 *     &lt;enumeration value="INBOUND"/>
 *     &lt;enumeration value="DEALER"/>
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="FAX"/>
 *     &lt;enumeration value="LAWOFFICE"/>
 *     &lt;enumeration value="CHAT"/>
 *     &lt;enumeration value="WEBSITE"/>
 *     &lt;enumeration value="BURSAGAZ"/>
 *     &lt;enumeration value="KAYSERIGAZ"/>
 *     &lt;enumeration value="SIKAYETVAR"/>
 *     &lt;enumeration value="BTKONLINE"/>
 *     &lt;enumeration value="ONCEMUSTERIM"/>
 *     &lt;enumeration value="SOCIALMEDIA"/>
 *     &lt;enumeration value="OFFICIALDOCUMENT"/>
 *     &lt;enumeration value="INDIVIDUALDOCUMENT"/>
 *     &lt;enumeration value="OUTBOUND"/>
 *     &lt;enumeration value="BACKOFFICE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestChannelEnum", namespace = "http://milleni.com/TTS/TTS/Service/v1")
@XmlEnum
public enum RequestChannelEnum {

    NOTSET,
    INBOUND,
    DEALER,
    EMAIL,
    FAX,
    LAWOFFICE,
    CHAT,
    WEBSITE,
    BURSAGAZ,
    KAYSERIGAZ,
    SIKAYETVAR,
    BTKONLINE,
    ONCEMUSTERIM,
    SOCIALMEDIA,
    OFFICIALDOCUMENT,
    INDIVIDUALDOCUMENT,
    OUTBOUND,
    BACKOFFICE;

    public String value() {
        return name();
    }

    public static RequestChannelEnum fromValue(String v) {
        return valueOf(v);
    }

}
