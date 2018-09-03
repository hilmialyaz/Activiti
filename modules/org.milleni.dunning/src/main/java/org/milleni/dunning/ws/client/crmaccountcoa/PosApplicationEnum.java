
package org.milleni.dunning.ws.client.crmaccountcoa;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PosApplicationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PosApplicationEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ONLINE_WEB"/>
 *     &lt;enumeration value="CALL_CENTER_WEB"/>
 *     &lt;enumeration value="AUTO_PAYMENT"/>
 *     &lt;enumeration value="IVR"/>
 *     &lt;enumeration value="DOPING_WEB"/>
 *     &lt;enumeration value="COA"/>
 *     &lt;enumeration value="SFA"/>
 *     &lt;enumeration value="MILLENICOM_WEB"/>
 *     &lt;enumeration value="ONLINE_WEB_MOBILEAPP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PosApplicationEnum", namespace = "http://milleni.com/Payment")
@XmlEnum
public enum PosApplicationEnum {

    ONLINE_WEB,
    CALL_CENTER_WEB,
    AUTO_PAYMENT,
    IVR,
    DOPING_WEB,
    COA,
    SFA,
    MILLENICOM_WEB,
    ONLINE_WEB_MOBILEAPP;

    public String value() {
        return name();
    }

    public static PosApplicationEnum fromValue(String v) {
        return valueOf(v);
    }

}
