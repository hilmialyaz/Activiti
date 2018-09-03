/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.milleni.dunning.datamodel.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.AccessType;

/**
 * 
 * @author kemala
 */
@Entity
@Table(name = "CUSTOMER")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c"), @NamedQuery(name = "Customer.findByCustomerId", query = "SELECT c FROM Customer c WHERE c.customerId = :customerId"),
		@NamedQuery(name = "Customer.findByCustomerName", query = "SELECT c FROM Customer c WHERE c.customerName = :customerName"), @NamedQuery(name = "Customer.findByCustomerGroup", query = "SELECT c FROM Customer c WHERE c.customerGroup = :customerGroup"),
		@NamedQuery(name = "Customer.findByActivationDate", query = "SELECT c FROM Customer c WHERE c.activationDate = :activationDate"), @NamedQuery(name = "Customer.findByLastSuspensionDate", query = "SELECT c FROM Customer c WHERE c.lastSuspensionDate = :lastSuspensionDate"),
		@NamedQuery(name = "Customer.findByDeactivationDate", query = "SELECT c FROM Customer c WHERE c.deactivationDate = :deactivationDate"), @NamedQuery(name = "Customer.findByStatus", query = "SELECT c FROM Customer c WHERE c.status = :status"),
		@NamedQuery(name = "Customer.findByLastInvoiceDate", query = "SELECT c FROM Customer c WHERE c.lastInvoiceDate = :lastInvoiceDate"), @NamedQuery(name = "Customer.findByCreateDate", query = "SELECT c FROM Customer c WHERE c.createDate = :createDate"),
		@NamedQuery(name = "Customer.findByCreateUser", query = "SELECT c FROM Customer c WHERE c.createUser = :createUser"), @NamedQuery(name = "Customer.findByUpdateDate", query = "SELECT c FROM Customer c WHERE c.updateDate = :updateDate"),
		@NamedQuery(name = "Customer.findByUpdateUser", query = "SELECT c FROM Customer c WHERE c.updateUser = :updateUser") })
public class Customer extends BaseModel implements Serializable {
	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@NotNull
	@AccessType("property")
	@Column(name = "CUSTOMER_ID")
	private Long customerId;
	@Basic(optional = false)
	
	@Size(min = 1, max = 300)
	@Column(name = "CUSTOMER_NAME")
	private String customerName;
	@Column(name = "ACTIVATION_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date activationDate;
	@Column(name = "LAST_SUSPENSION_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastSuspensionDate;
	@Column(name = "DEACTIVATION_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date deactivationDate;

	@Column(name = "LAST_INVOICE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastInvoiceDate;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 1)
	@Column(name = "STATUS")
	private String status;

	@Size(max = 300)
	@Column(name = "CUSTOMER_ADDRESS")
	private String customerAddress;

	@Size(max = 50)
	@Column(name = "CITY")
	private String city;

	@Size(max = 50)
	@Column(name = "DISTRICT")
	private String district;

	@Size(max = 20)
	@Column(name = "TEL1")
	private String tel1;

	@Size(max = 20)
	@Column(name = "TEL2")
	private String tel2;

	@Size(max = 20)
	@Column(name = "MOBIL")
	private String mobil;

	@Size(max = 20)
	@Column(name = "FAX")
	private String fax;

	@Column(name = "FIRST_CDR_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date firstCdrDate;

	@Column(name = "SOZLESME")
	private String sozlesme;

	@Column(name = "SIKAYET_SAYISI")
	private Integer sikayetSayisi;

	@Column(name = "TAKSIT_SAYISI")
	private Integer taksitSayisi = 0;

	@Column(name = "UPDATE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;
	@Size(max = 50)
	@Column(name = "UPDATE_USER")
	private String updateUser;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customerId",fetch=FetchType.LAZY)
	private Collection<DunningProcessMaster> dunningProcessMasterCollection;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customerId",fetch=FetchType.LAZY)
	private Collection<CustomerInvoices> customerInvoicesCollection;

	@JoinColumn(name = "CUSTOMER_TYPE", referencedColumnName = "TYPE_ID")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private CustomerType customerType;

	@JoinColumn(name = "CUSTOMER_GROUP", referencedColumnName = "GROUP_ID")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private CustomerGroup customerGroup;

	@Size(max = 100)
	@Column(name = "CONTRACT_TYPE")
	private String contractType;

	@Basic(optional = true)
	@Column(name = "CURRENT_DEBIT")
	private Double currentDebit;

	@JoinColumn(name = "CURRENT_PRC_MASTER_ID", referencedColumnName = "PROCESS_ID")
	@OneToOne(optional = false, fetch = FetchType.LAZY)
	private DunningProcessMaster dunningProcessMaster;
	
	@Size(max = 1)
	@Column(name = "YASAL_TAKIP")
	private String yasalTakipte;
	
	@Column(name = "YASAL_TAKIP_TARIHI")
	@Temporal(TemporalType.TIMESTAMP)
	private Date yasalTakipTarihi;
	
	@Column(name = "LAST_INVOICE_UPDATE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastInvoiceUpdateDate;
	
	@Column(name = "LAST_STATUS_UPDATE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastStatusUpdateDate;
	
	@Column(name = "REGISTER_NUMBER")
	private String registerNumber;

	public Customer() {
	}

	public Customer(Long customerId) {
		this.customerId = customerId;
	}

	public Customer(String customerId) {
		try {
			this.customerId = Long.parseLong(customerId);
		} catch (Exception e) {
		}
	}

	public Customer(Long customerId, String customerName, CustomerGroup customerGroup, Date activationDate, String status) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerGroup = customerGroup;
		this.activationDate = activationDate;
		this.status = status;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}

	public CustomerGroup getCustomerGroup() {
		return customerGroup;
	}

	public void setCustomerGroup(CustomerGroup customerGroup) {
		this.customerGroup = customerGroup;
	}

	public Date getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;
	}

	public Date getLastSuspensionDate() {
		return lastSuspensionDate;
	}

	public void setLastSuspensionDate(Date lastSuspensionDate) {
		this.lastSuspensionDate = lastSuspensionDate;
	}

	public Date getDeactivationDate() {
		return deactivationDate;
	}

	public void setDeactivationDate(Date deactivationDate) {
		this.deactivationDate = deactivationDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getLastInvoiceDate() {
		return lastInvoiceDate;
	}

	public void setLastInvoiceDate(Date lastInvoiceDate) {
		this.lastInvoiceDate = lastInvoiceDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getFirstCdrDate() {
		return firstCdrDate;
	}

	public void setFirstCdrDate(Date firstCdrDate) {
		this.firstCdrDate = firstCdrDate;
	}

	public Integer getTaksitSayisi() {
		return taksitSayisi;
	}

	public void setTaksitSayisi(Integer taksitSayisi) {
		this.taksitSayisi = taksitSayisi;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	@XmlTransient
	public Collection<DunningProcessMaster> getDunningProcessMasterCollection() {
		return dunningProcessMasterCollection;
	}

	public void setDunningProcessMasterCollection(Collection<DunningProcessMaster> dunningProcessMasterCollection) {
		this.dunningProcessMasterCollection = dunningProcessMasterCollection;
	}

	@XmlTransient
	public Collection<CustomerInvoices> getCustomerInvoicesCollection() {
		return customerInvoicesCollection;
	}

	public void setCustomerInvoicesCollection(Collection<CustomerInvoices> customerInvoicesCollection) {
		this.customerInvoicesCollection = customerInvoicesCollection;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTel1() {
		return tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getTel2() {
		return tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	public String getMobil() {
		return mobil;
	}

	public void setMobil(String mobil) {
		this.mobil = mobil;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getSozlesme() {
		return sozlesme;
	}

	public void setSozlesme(String sozlesme) {
		this.sozlesme = sozlesme;
	}

	public Integer getSikayetSayisi() {
		return sikayetSayisi;
	}

	public void setSikayetSayisi(Integer sikayetSayisi) {
		this.sikayetSayisi = sikayetSayisi;
	}

	public Double getCurrentDebit() {
		return currentDebit;
	}

	public void setCurrentDebit(Double currentDebit) {
		this.currentDebit = currentDebit;
	}

	
	
	public Date getYasalTakipTarihi() {
		return yasalTakipTarihi;
	}

	public void setYasalTakipTarihi(Date yasalTakipTarihi) {
		this.yasalTakipTarihi = yasalTakipTarihi;
	}

	public String getYasalTakipte() {
		return yasalTakipte;
	}

	public void setYasalTakipte(String yasalTakipte) {
		this.yasalTakipte = yasalTakipte;
	}

	public DunningProcessMaster getDunningProcessMaster() {
		return dunningProcessMaster;
	}

	public void setDunningProcessMaster(DunningProcessMaster dunningProcessMaster) {
		this.dunningProcessMaster = dunningProcessMaster;
	}

	
	
	public Date getLastInvoiceUpdateDate() {
		return lastInvoiceUpdateDate;
	}

	public void setLastInvoiceUpdateDate(Date lastInvoiceUpdateDate) {
		this.lastInvoiceUpdateDate = lastInvoiceUpdateDate;
	}

	public Date getLastStatusUpdateDate() {
		return lastStatusUpdateDate;
	}

	public void setLastStatusUpdateDate(Date lastStatusUpdateDate) {
		this.lastStatusUpdateDate = lastStatusUpdateDate;
	}
	
	

	public String getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (customerId != null ? customerId.hashCode() : 0);
		return hash;
	}

	@PrePersist
	protected void onCreate() {
		super.prepersist();
		if (sozlesme == null) {
			sozlesme = "N";
		}
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Customer)) {
			return false;
		}
		Customer other = (Customer) object;
		if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.milleni.dunning.datamodel.model.Customer[ customerId=" + customerId + " ]";
	}

}
