
package org.milleni.dunning.ws.client.crmcontact;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmsCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SmsCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DUNNING_BIR_HATIRLATMA1"/>
 *     &lt;enumeration value="DUNNING_BIR_HATIRLATMA2"/>
 *     &lt;enumeration value="DUNNING_BIR_IHTAR1"/>
 *     &lt;enumeration value="DUNNING_BIR_SUSPEND"/>
 *     &lt;enumeration value="DUNNING_BIR_DEACTIVATION"/>
 *     &lt;enumeration value="DUNNING_KUR_HATIRLATMA1"/>
 *     &lt;enumeration value="DUNNING_KUR_IHTAR1"/>
 *     &lt;enumeration value="DUNNING_BULUT_HATIRLATMA1"/>
 *     &lt;enumeration value="DUNNING_BULUT_IHTAR1"/>
 *     &lt;enumeration value="DUNNING_VOIP_DEACTIVATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SmsCode", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Crm.CustomerInfoService.ServiceModel")
@XmlEnum
public enum SmsCode {

    @XmlEnumValue("DUNNING_BIR_HATIRLATMA1")
    DUNNING_BIR_HATIRLATMA_1("DUNNING_BIR_HATIRLATMA1"),
    @XmlEnumValue("DUNNING_BIR_HATIRLATMA2")
    DUNNING_BIR_HATIRLATMA_2("DUNNING_BIR_HATIRLATMA2"),
    @XmlEnumValue("DUNNING_BIR_IHTAR1")
    DUNNING_BIR_IHTAR_1("DUNNING_BIR_IHTAR1"),
    DUNNING_BIR_SUSPEND("DUNNING_BIR_SUSPEND"),
    DUNNING_BIR_DEACTIVATION("DUNNING_BIR_DEACTIVATION"),
    @XmlEnumValue("DUNNING_KUR_HATIRLATMA1")
    DUNNING_KUR_HATIRLATMA_1("DUNNING_KUR_HATIRLATMA1"),
    @XmlEnumValue("DUNNING_KUR_IHTAR1")
    DUNNING_KUR_IHTAR_1("DUNNING_KUR_IHTAR1"),
    @XmlEnumValue("DUNNING_BULUT_HATIRLATMA1")
    DUNNING_BULUT_HATIRLATMA_1("DUNNING_BULUT_HATIRLATMA1"),
    @XmlEnumValue("DUNNING_BULUT_IHTAR1")
    DUNNING_BULUT_IHTAR_1("DUNNING_BULUT_IHTAR1"),
    DUNNING_VOIP_DEACTIVATION("DUNNING_VOIP_DEACTIVATION");
    private final String value;

    SmsCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SmsCode fromValue(String v) {
        for (SmsCode c: SmsCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
