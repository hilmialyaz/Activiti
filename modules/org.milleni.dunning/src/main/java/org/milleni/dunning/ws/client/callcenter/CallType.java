
package org.milleni.dunning.ws.client.callcenter;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CallType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TahsilatSes"/>
 *     &lt;enumeration value="TahsilatAdsl"/>
 *     &lt;enumeration value="TahsilatSuspendSes"/>
 *     &lt;enumeration value="TahsilatSuspendAdsl"/>
 *     &lt;enumeration value="AvukatSes"/>
 *     &lt;enumeration value="AvukatAdsl"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CallType")
@XmlEnum
public enum CallType {

    @XmlEnumValue("TahsilatSes")
    TAHSILAT_SES("TahsilatSes"),
    @XmlEnumValue("TahsilatAdsl")
    TAHSILAT_ADSL("TahsilatAdsl"),
    @XmlEnumValue("TahsilatSuspendSes")
    TAHSILAT_SUSPEND_SES("TahsilatSuspendSes"),
    @XmlEnumValue("TahsilatSuspendAdsl")
    TAHSILAT_SUSPEND_ADSL("TahsilatSuspendAdsl"),
    @XmlEnumValue("AvukatSes")
    AVUKAT_SES("AvukatSes"),
    @XmlEnumValue("AvukatAdsl")
    AVUKAT_ADSL("AvukatAdsl");
    private final String value;

    CallType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallType fromValue(String v) {
        for (CallType c: CallType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
