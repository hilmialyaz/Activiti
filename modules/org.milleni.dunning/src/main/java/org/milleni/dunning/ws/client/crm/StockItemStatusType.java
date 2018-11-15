
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StockItemStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StockItemStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Availiable"/>
 *     &lt;enumeration value="Reserved"/>
 *     &lt;enumeration value="Assigned"/>
 *     &lt;enumeration value="Control"/>
 *     &lt;enumeration value="Billed"/>
 *     &lt;enumeration value="AvailiableSupport"/>
 *     &lt;enumeration value="AssignedSupport"/>
 *     &lt;enumeration value="OperationalTracing"/>
 *     &lt;enumeration value="Loss"/>
 *     &lt;enumeration value="Broken"/>
 *     &lt;enumeration value="ExchangeFromFirm"/>
 *     &lt;enumeration value="AssignedBilled"/>
 *     &lt;enumeration value="Waste"/>
 *     &lt;enumeration value="AvailiableUsed"/>
 *     &lt;enumeration value="WaitingRefund"/>
 *     &lt;enumeration value="Refund"/>
 *     &lt;enumeration value="SendToVendor"/>
 *     &lt;enumeration value="SendToDealer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StockItemStatusType", namespace = "http://schemas.datacontract.org/2004/07/ServiceCatalog.Contracts.CustomerInfoService.Type")
@XmlEnum
public enum StockItemStatusType {

    @XmlEnumValue("Availiable")
    AVAILIABLE("Availiable"),
    @XmlEnumValue("Reserved")
    RESERVED("Reserved"),
    @XmlEnumValue("Assigned")
    ASSIGNED("Assigned"),
    @XmlEnumValue("Control")
    CONTROL("Control"),
    @XmlEnumValue("Billed")
    BILLED("Billed"),
    @XmlEnumValue("AvailiableSupport")
    AVAILIABLE_SUPPORT("AvailiableSupport"),
    @XmlEnumValue("AssignedSupport")
    ASSIGNED_SUPPORT("AssignedSupport"),
    @XmlEnumValue("OperationalTracing")
    OPERATIONAL_TRACING("OperationalTracing"),
    @XmlEnumValue("Loss")
    LOSS("Loss"),
    @XmlEnumValue("Broken")
    BROKEN("Broken"),
    @XmlEnumValue("ExchangeFromFirm")
    EXCHANGE_FROM_FIRM("ExchangeFromFirm"),
    @XmlEnumValue("AssignedBilled")
    ASSIGNED_BILLED("AssignedBilled"),
    @XmlEnumValue("Waste")
    WASTE("Waste"),
    @XmlEnumValue("AvailiableUsed")
    AVAILIABLE_USED("AvailiableUsed"),
    @XmlEnumValue("WaitingRefund")
    WAITING_REFUND("WaitingRefund"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),
    @XmlEnumValue("SendToVendor")
    SEND_TO_VENDOR("SendToVendor"),
    @XmlEnumValue("SendToDealer")
    SEND_TO_DEALER("SendToDealer");
    private final String value;

    StockItemStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StockItemStatusType fromValue(String v) {
        for (StockItemStatusType c: StockItemStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
