
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiagnosticTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiagnosticTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WARNING"/>
 *     &lt;enumeration value="ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiagnosticTypeEnum", namespace = "http://milleni.com/Common/Customer")
@XmlEnum
public enum DiagnosticTypeEnum {

    WARNING,
    ERROR;

    public String value() {
        return name();
    }

    public static DiagnosticTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
