
package org.milleni.dunning.ws.client.customerstatus;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STATUS.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="STATUS">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVATE"/>
 *     &lt;enumeration value="SUSPEND"/>
 *     &lt;enumeration value="DEACTIVATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "STATUS")
@XmlEnum
public enum STATUS {

    ACTIVATE,
    SUSPEND,
    DEACTIVATE;

    public String value() {
        return name();
    }

    public static STATUS fromValue(String v) {
        return valueOf(v);
    }

}
