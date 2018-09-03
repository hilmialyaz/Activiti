
package org.milleni.dunning.ws.client.crmaccountcoa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeDealerResult" type="{/CustomerInfo/Service/v1}ChangeAccountDealerResponseModel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "changeDealerResult"
})
@XmlRootElement(name = "ChangeDealerResponse")
public class ChangeDealerResponse {

    @XmlElementRef(name = "ChangeDealerResult", namespace = "/CustomerInfo/Service/v1", type = JAXBElement.class)
    protected JAXBElement<ChangeAccountDealerResponseModel> changeDealerResult;

    /**
     * Gets the value of the changeDealerResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChangeAccountDealerResponseModel }{@code >}
     *     
     */
    public JAXBElement<ChangeAccountDealerResponseModel> getChangeDealerResult() {
        return changeDealerResult;
    }

    /**
     * Sets the value of the changeDealerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChangeAccountDealerResponseModel }{@code >}
     *     
     */
    public void setChangeDealerResult(JAXBElement<ChangeAccountDealerResponseModel> value) {
        this.changeDealerResult = ((JAXBElement<ChangeAccountDealerResponseModel> ) value);
    }

}
