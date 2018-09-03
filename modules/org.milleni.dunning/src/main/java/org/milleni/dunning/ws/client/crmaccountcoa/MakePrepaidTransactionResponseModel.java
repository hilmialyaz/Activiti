
package org.milleni.dunning.ws.client.crmaccountcoa;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MakePrepaidTransactionResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MakePrepaidTransactionResponseModel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/ServiceCatalog.Model}BaseResponseModel">
 *       &lt;sequence>
 *         &lt;element name="NewBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MakePrepaidTransactionResponseModel", propOrder = {
    "newBalance"
})
public class MakePrepaidTransactionResponseModel
    extends BaseResponseModel
{

    @XmlElement(name = "NewBalance")
    protected BigDecimal newBalance;

    /**
     * Gets the value of the newBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewBalance() {
        return newBalance;
    }

    /**
     * Sets the value of the newBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewBalance(BigDecimal value) {
        this.newBalance = value;
    }

}
