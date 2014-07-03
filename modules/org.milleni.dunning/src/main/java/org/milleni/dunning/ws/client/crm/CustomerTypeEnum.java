
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PERSONAL"/>
 *     &lt;enumeration value="CORPORATE"/>
 *     &lt;enumeration value="SOHO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerTypeEnum", namespace = "http://milleni.com/Common/Customer")
@XmlEnum
public enum CustomerTypeEnum {

    PERSONAL,
    CORPORATE,
    SOHO;

    public String value() {
        return name();
    }

    public static CustomerTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
