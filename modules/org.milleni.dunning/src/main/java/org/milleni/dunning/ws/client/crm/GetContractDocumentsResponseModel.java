
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetContractDocumentsResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetContractDocumentsResponseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Documents" type="{http://schemas.datacontract.org/2004/07/ServiceCatalog.Model.Crm}ArrayOfCrmDocument"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetContractDocumentsResponseModel", propOrder = {
    "documents"
})
public class GetContractDocumentsResponseModel {

    @XmlElement(name = "Documents", required = true, nillable = true)
    protected ArrayOfCrmDocument documents;

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCrmDocument }
     *     
     */
    public ArrayOfCrmDocument getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCrmDocument }
     *     
     */
    public void setDocuments(ArrayOfCrmDocument value) {
        this.documents = value;
    }

}
