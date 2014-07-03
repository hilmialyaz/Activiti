
package org.milleni.dunning.ws.client.customerstatus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://milleni.com.tr/CustomerStatusOperations/}ServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="contractStatusList" type="{http://milleni.com.tr/CustomerStatusOperations/}ArrayOfContractStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractServiceResponse", propOrder = {
    "contractStatusList"
})
public class ContractServiceResponse
    extends ServiceResponse
{

    protected ArrayOfContractStatus contractStatusList;

    /**
     * Gets the value of the contractStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContractStatus }
     *     
     */
    public ArrayOfContractStatus getContractStatusList() {
        return contractStatusList;
    }

    /**
     * Sets the value of the contractStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContractStatus }
     *     
     */
    public void setContractStatusList(ArrayOfContractStatus value) {
        this.contractStatusList = value;
    }

}
