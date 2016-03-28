
package org.milleni.dunning.ws.client.crm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrmAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrmAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BuildingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuildingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuildingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="District" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DistrictCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid"/>
 *         &lt;element name="IndependentParts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndependentPartsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Neighborhood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NeighborhoodCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Village" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VillageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrmAddress", namespace = "http://milleni.com/Crm", propOrder = {
    "buildingCode",
    "buildingName",
    "buildingNumber",
    "city",
    "cityCode",
    "county",
    "countyCode",
    "district",
    "districtCode",
    "id",
    "independentParts",
    "independentPartsCode",
    "name",
    "neighborhood",
    "neighborhoodCode",
    "shipment",
    "shipmentCode",
    "village",
    "villageCode"
})
public class CrmAddress {

    @XmlElementRef(name = "BuildingCode", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> buildingCode;
    @XmlElementRef(name = "BuildingName", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> buildingName;
    @XmlElementRef(name = "BuildingNumber", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> buildingNumber;
    @XmlElementRef(name = "City", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "CityCode", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> cityCode;
    @XmlElementRef(name = "County", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> county;
    @XmlElementRef(name = "CountyCode", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> countyCode;
    @XmlElementRef(name = "District", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> district;
    @XmlElementRef(name = "DistrictCode", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> districtCode;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElementRef(name = "IndependentParts", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> independentParts;
    @XmlElementRef(name = "IndependentPartsCode", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> independentPartsCode;
    @XmlElementRef(name = "Name", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Neighborhood", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> neighborhood;
    @XmlElementRef(name = "NeighborhoodCode", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> neighborhoodCode;
    @XmlElementRef(name = "Shipment", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> shipment;
    @XmlElementRef(name = "ShipmentCode", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> shipmentCode;
    @XmlElementRef(name = "Village", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> village;
    @XmlElementRef(name = "VillageCode", namespace = "http://milleni.com/Crm", type = JAXBElement.class)
    protected JAXBElement<String> villageCode;

    /**
     * Gets the value of the buildingCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuildingCode() {
        return buildingCode;
    }

    /**
     * Sets the value of the buildingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuildingCode(JAXBElement<String> value) {
        this.buildingCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the buildingName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuildingName() {
        return buildingName;
    }

    /**
     * Sets the value of the buildingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuildingName(JAXBElement<String> value) {
        this.buildingName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the buildingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Sets the value of the buildingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuildingNumber(JAXBElement<String> value) {
        this.buildingNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCityCode(JAXBElement<String> value) {
        this.cityCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCounty(JAXBElement<String> value) {
        this.county = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the countyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountyCode() {
        return countyCode;
    }

    /**
     * Sets the value of the countyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountyCode(JAXBElement<String> value) {
        this.countyCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistrict(JAXBElement<String> value) {
        this.district = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the districtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistrictCode() {
        return districtCode;
    }

    /**
     * Sets the value of the districtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistrictCode(JAXBElement<String> value) {
        this.districtCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the independentParts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndependentParts() {
        return independentParts;
    }

    /**
     * Sets the value of the independentParts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndependentParts(JAXBElement<String> value) {
        this.independentParts = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the independentPartsCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndependentPartsCode() {
        return independentPartsCode;
    }

    /**
     * Sets the value of the independentPartsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndependentPartsCode(JAXBElement<String> value) {
        this.independentPartsCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the neighborhood property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNeighborhood() {
        return neighborhood;
    }

    /**
     * Sets the value of the neighborhood property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNeighborhood(JAXBElement<String> value) {
        this.neighborhood = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the neighborhoodCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNeighborhoodCode() {
        return neighborhoodCode;
    }

    /**
     * Sets the value of the neighborhoodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNeighborhoodCode(JAXBElement<String> value) {
        this.neighborhoodCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the shipment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipment() {
        return shipment;
    }

    /**
     * Sets the value of the shipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipment(JAXBElement<String> value) {
        this.shipment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the shipmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipmentCode() {
        return shipmentCode;
    }

    /**
     * Sets the value of the shipmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipmentCode(JAXBElement<String> value) {
        this.shipmentCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the village property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVillage() {
        return village;
    }

    /**
     * Sets the value of the village property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVillage(JAXBElement<String> value) {
        this.village = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the villageCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVillageCode() {
        return villageCode;
    }

    /**
     * Sets the value of the villageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVillageCode(JAXBElement<String> value) {
        this.villageCode = ((JAXBElement<String> ) value);
    }

}
