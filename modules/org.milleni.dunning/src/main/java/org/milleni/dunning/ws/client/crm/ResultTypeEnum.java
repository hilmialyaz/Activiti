
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="BusinessError"/>
 *     &lt;enumeration value="SystemError"/>
 *     &lt;enumeration value="Undefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResultTypeEnum", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Enum")
@XmlEnum
public enum ResultTypeEnum {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("BusinessError")
    BUSINESS_ERROR("BusinessError"),
    @XmlEnumValue("SystemError")
    SYSTEM_ERROR("SystemError"),
    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined");
    private final String value;

    ResultTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultTypeEnum fromValue(String v) {
        for (ResultTypeEnum c: ResultTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
