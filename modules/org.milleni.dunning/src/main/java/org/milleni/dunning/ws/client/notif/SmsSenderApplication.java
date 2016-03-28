
package org.milleni.dunning.ws.client.notif;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmsSenderApplication.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SmsSenderApplication">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVOICE_INFO"/>
 *     &lt;enumeration value="INVOICE_NOTICE"/>
 *     &lt;enumeration value="MANUEL"/>
 *     &lt;enumeration value="OTOKK_INFO"/>
 *     &lt;enumeration value="OTOKK_REMOVE_EXPIRED"/>
 *     &lt;enumeration value="COMMITMENT_OFFER"/>
 *     &lt;enumeration value="SUBSCRIBER_PROCESSES"/>
 *     &lt;enumeration value="MILLENICRM"/>
 *     &lt;enumeration value="ONLINE_SERVICES"/>
 *     &lt;enumeration value="DOPINGWEB"/>
 *     &lt;enumeration value="AUTOJOBS"/>
 *     &lt;enumeration value="SFA"/>
 *     &lt;enumeration value="REQUEST_MANAGEMENT"/>
 *     &lt;enumeration value="INTERACTICE_SMS"/>
 *     &lt;enumeration value="DUNNING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SmsSenderApplication", namespace = "http://milleni.com/Common/Notification")
@XmlEnum
public enum SmsSenderApplication {

    INVOICE_INFO,
    INVOICE_NOTICE,
    MANUEL,
    OTOKK_INFO,
    OTOKK_REMOVE_EXPIRED,
    COMMITMENT_OFFER,
    SUBSCRIBER_PROCESSES,
    MILLENICRM,
    ONLINE_SERVICES,
    DOPINGWEB,
    AUTOJOBS,
    SFA,
    REQUEST_MANAGEMENT,
    INTERACTICE_SMS,
    DUNNING;

    public String value() {
        return name();
    }

    public static SmsSenderApplication fromValue(String v) {
        return valueOf(v);
    }

}
