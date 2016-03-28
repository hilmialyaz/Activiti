
package org.milleni.dunning.ws.client.crmcontact;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
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
 *     &lt;enumeration value="INTERACTIVE_SMS"/>
 *     &lt;enumeration value="DUNNING"/>
 *     &lt;enumeration value="BILLING"/>
 *     &lt;enumeration value="CRM-THK-CHURN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SmsSenderApplication", namespace = "http://milleni.com/Common/Notification")
@XmlEnum
public enum SmsSenderApplication {

    INVOICE_INFO("INVOICE_INFO"),
    INVOICE_NOTICE("INVOICE_NOTICE"),
    MANUEL("MANUEL"),
    OTOKK_INFO("OTOKK_INFO"),
    OTOKK_REMOVE_EXPIRED("OTOKK_REMOVE_EXPIRED"),
    COMMITMENT_OFFER("COMMITMENT_OFFER"),
    SUBSCRIBER_PROCESSES("SUBSCRIBER_PROCESSES"),
    MILLENICRM("MILLENICRM"),
    ONLINE_SERVICES("ONLINE_SERVICES"),
    DOPINGWEB("DOPINGWEB"),
    AUTOJOBS("AUTOJOBS"),
    SFA("SFA"),
    REQUEST_MANAGEMENT("REQUEST_MANAGEMENT"),
    INTERACTIVE_SMS("INTERACTIVE_SMS"),
    DUNNING("DUNNING"),
    BILLING("BILLING"),
    @XmlEnumValue("CRM-THK-CHURN")
    CRM_THK_CHURN("CRM-THK-CHURN");
    private final String value;

    SmsSenderApplication(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SmsSenderApplication fromValue(String v) {
        for (SmsSenderApplication c: SmsSenderApplication.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
