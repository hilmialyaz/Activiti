
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumberNetworkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NumberNetworkType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Free"/>
 *     &lt;enumeration value="Pilot"/>
 *     &lt;enumeration value="DID"/>
 *     &lt;enumeration value="IsdnBri"/>
 *     &lt;enumeration value="IsdnPri"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NumberNetworkType", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Contracts.CustomerInfoService.Type")
@XmlEnum
public enum NumberNetworkType {

    @XmlEnumValue("Free")
    FREE("Free"),
    @XmlEnumValue("Pilot")
    PILOT("Pilot"),
    DID("DID"),
    @XmlEnumValue("IsdnBri")
    ISDN_BRI("IsdnBri"),
    @XmlEnumValue("IsdnPri")
    ISDN_PRI("IsdnPri");
    private final String value;

    NumberNetworkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NumberNetworkType fromValue(String v) {
        for (NumberNetworkType c: NumberNetworkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
