
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StockItemDeviceSubType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StockItemDeviceSubType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Adsl"/>
 *     &lt;enumeration value="Vdsl"/>
 *     &lt;enumeration value="Fiber"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StockItemDeviceSubType", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm.Stock")
@XmlEnum
public enum StockItemDeviceSubType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Adsl")
    ADSL("Adsl"),
    @XmlEnumValue("Vdsl")
    VDSL("Vdsl"),
    @XmlEnumValue("Fiber")
    FIBER("Fiber");
    private final String value;

    StockItemDeviceSubType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StockItemDeviceSubType fromValue(String v) {
        for (StockItemDeviceSubType c: StockItemDeviceSubType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
