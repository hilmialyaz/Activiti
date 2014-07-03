
package org.milleni.dunning.ws.client.customerstatus;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TT_STATUS.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TT_STATUS">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEACTIVATE"/>
 *     &lt;enumeration value="FREEZE"/>
 *     &lt;enumeration value="UNFREEZE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TT_STATUS")
@XmlEnum
public enum TTSTATUS {

    DEACTIVATE,
    FREEZE,
    UNFREEZE;

    public String value() {
        return name();
    }

    public static TTSTATUS fromValue(String v) {
        return valueOf(v);
    }

}
