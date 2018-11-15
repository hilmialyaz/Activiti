
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StockItemDeviceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StockItemDeviceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Modem"/>
 *     &lt;enumeration value="Dopingbox"/>
 *     &lt;enumeration value="Tablet"/>
 *     &lt;enumeration value="SmartWatch"/>
 *     &lt;enumeration value="Gateway"/>
 *     &lt;enumeration value="Router"/>
 *     &lt;enumeration value="SoundBar"/>
 *     &lt;enumeration value="IpPhone"/>
 *     &lt;enumeration value="Ont"/>
 *     &lt;enumeration value="WifiExtender"/>
 *     &lt;enumeration value="Filbox"/>
 *     &lt;enumeration value="ApDevice"/>
 *     &lt;enumeration value="CepTelefonu"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StockItemDeviceType", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm.Stock")
@XmlEnum
public enum StockItemDeviceType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Modem")
    MODEM("Modem"),
    @XmlEnumValue("Dopingbox")
    DOPINGBOX("Dopingbox"),
    @XmlEnumValue("Tablet")
    TABLET("Tablet"),
    @XmlEnumValue("SmartWatch")
    SMART_WATCH("SmartWatch"),
    @XmlEnumValue("Gateway")
    GATEWAY("Gateway"),
    @XmlEnumValue("Router")
    ROUTER("Router"),
    @XmlEnumValue("SoundBar")
    SOUND_BAR("SoundBar"),
    @XmlEnumValue("IpPhone")
    IP_PHONE("IpPhone"),
    @XmlEnumValue("Ont")
    ONT("Ont"),
    @XmlEnumValue("WifiExtender")
    WIFI_EXTENDER("WifiExtender"),
    @XmlEnumValue("Filbox")
    FILBOX("Filbox"),
    @XmlEnumValue("ApDevice")
    AP_DEVICE("ApDevice"),
    @XmlEnumValue("CepTelefonu")
    CEP_TELEFONU("CepTelefonu");
    private final String value;

    StockItemDeviceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StockItemDeviceType fromValue(String v) {
        for (StockItemDeviceType c: StockItemDeviceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
