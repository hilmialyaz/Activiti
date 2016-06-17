
package org.milleni.dunning.ws.client.crmaccountcoa;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCardOrderStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditCardOrderStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOTSET"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="DEACTIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditCardOrderStatusEnum", namespace = "http://milleni.com/Payment")
@XmlEnum
public enum CreditCardOrderStatusEnum {

    NOTSET,
    ACTIVE,
    DEACTIVE;

    public String value() {
        return name();
    }

    public static CreditCardOrderStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
