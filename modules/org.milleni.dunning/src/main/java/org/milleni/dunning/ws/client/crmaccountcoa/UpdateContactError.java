
package org.milleni.dunning.ws.client.crmaccountcoa;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateContactError.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateContactError">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="BUSINESSERROR"/>
 *     &lt;enumeration value="INVALIDMOBILE"/>
 *     &lt;enumeration value="INVALIDEMAIL"/>
 *     &lt;enumeration value="INVALIDWORKPHONE"/>
 *     &lt;enumeration value="INVALIDFAX"/>
 *     &lt;enumeration value="MOBILEINDIFFERENTIDENTIFICATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UpdateContactError")
@XmlEnum
public enum UpdateContactError {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    BUSINESSERROR("BUSINESSERROR"),
    INVALIDMOBILE("INVALIDMOBILE"),
    INVALIDEMAIL("INVALIDEMAIL"),
    INVALIDWORKPHONE("INVALIDWORKPHONE"),
    INVALIDFAX("INVALIDFAX"),
    MOBILEINDIFFERENTIDENTIFICATION("MOBILEINDIFFERENTIDENTIFICATION");
    private final String value;

    UpdateContactError(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateContactError fromValue(String v) {
        for (UpdateContactError c: UpdateContactError.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
