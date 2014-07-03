/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.milleni.dunning.datamodel.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 
 * @author kemala
 */
@Entity
@Table(name = "CUSTOMER_INVOICES")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "CustomerInvoices.findAll", query = "SELECT c FROM CustomerInvoices c"), @NamedQuery(name = "CustomerInvoices.findByInvoiceId", query = "SELECT c FROM CustomerInvoices c WHERE c.invoiceId = :invoiceId"), @NamedQuery(name = "CustomerInvoices.findByInvoiceAmount", query = "SELECT c FROM CustomerInvoices c WHERE c.invoiceAmount = :invoiceAmount"),
		@NamedQuery(name = "CustomerInvoices.findByInvoiceDate", query = "SELECT c FROM CustomerInvoices c WHERE c.invoiceDate = :invoiceDate"), @NamedQuery(name = "CustomerInvoices.findByInvoiceDueDate", query = "SELECT c FROM CustomerInvoices c WHERE c.invoiceDueDate = :invoiceDueDate"),
		@NamedQuery(name = "CustomerInvoices.findByPaymentStatus", query = "SELECT c FROM CustomerInvoices c WHERE c.paymentStatus = :paymentStatus"), @NamedQuery(name = "CustomerInvoices.findByCreateDate", query = "SELECT c FROM CustomerInvoices c WHERE c.createDate = :createDate"),
		@NamedQuery(name = "CustomerInvoices.findByCreateUser", query = "SELECT c FROM CustomerInvoices c WHERE c.createUser = :createUser"), @NamedQuery(name = "CustomerInvoices.findByUpdateDate", query = "SELECT c FROM CustomerInvoices c WHERE c.updateDate = :updateDate"),
		@NamedQuery(name = "CustomerInvoices.findByUpdateUser", query = "SELECT c FROM CustomerInvoices c WHERE c.updateUser = :updateUser") })
public class CustomerInvoices extends BaseModel implements Serializable {
	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Column(name = "INVOICE_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long invoiceId;

	@Size(max = 30)
	@Column(name = "EXT_BILLING_INV_ID")
	private String extBillingInvId;

	@Size(max = 30)
	@Column(name = "EXT_PAYMENT_INV_ID")
	private String extPaymentInvId;

	@Basic(optional = false)
	@NotNull
	@Column(name = "INVOICE_AMOUNT")
	private Double invoiceAmount;
	
	@Column(name = "INVOICE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date invoiceDate;
	@Basic(optional = false)
	@NotNull
	@Column(name = "INVOICE_DUE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date invoiceDueDate;
	
	@Column(name = "INVOICE_PERIOD_MONTH")
	private Integer invoicePeriodMonth;
	
	@Column(name = "INVOICE_PERIOD_YEAR")
	private Integer invoicePeriodYear;
	
	
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 1)
	@Column(name = "PAYMENT_STATUS")
	private String paymentStatus;
	@Column(name = "UPDATE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;
	@Size(max = 50)
	@Column(name = "UPDATE_USER")
	private String updateUser;
	@OneToMany(mappedBy = "dunningInvoiceId")
	private Collection<DunningProcessMaster> dunningProcessMasterCollection;
	@JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID")
	@ManyToOne(optional = false,fetch=FetchType.LAZY)
	private Customer customerId;

	public CustomerInvoices() {
	}

	public CustomerInvoices(Long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public CustomerInvoices(Long invoiceId, Double invoiceAmount, Date invoiceDate, Date invoiceDueDate, String paymentStatus) {
		this.invoiceId = invoiceId;
		this.invoiceAmount = invoiceAmount;
		this.invoiceDate = invoiceDate;
		this.invoiceDueDate = invoiceDueDate;
		this.paymentStatus = paymentStatus;
	}

	public Long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Double getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(Double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Date getInvoiceDueDate() {
		return invoiceDueDate;
	}

	public void setInvoiceDueDate(Date invoiceDueDate) {
		this.invoiceDueDate = invoiceDueDate;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
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
	
	

	public Integer getInvoicePeriodMonth() {
		return invoicePeriodMonth;
	}

	public void setInvoicePeriodMonth(Integer invoicePeriodMonth) {
		this.invoicePeriodMonth = invoicePeriodMonth;
	}

	public Integer getInvoicePeriodYear() {
		return invoicePeriodYear;
	}

	public void setInvoicePeriodYear(Integer invoicePeriodYear) {
		this.invoicePeriodYear = invoicePeriodYear;
	}

	@XmlTransient
	public Collection<DunningProcessMaster> getDunningProcessMasterCollection() {
		return dunningProcessMasterCollection;
	}

	public void setDunningProcessMasterCollection(Collection<DunningProcessMaster> dunningProcessMasterCollection) {
		this.dunningProcessMasterCollection = dunningProcessMasterCollection;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	

	public String getExtBillingInvId() {
		return extBillingInvId;
	}

	public void setExtBillingInvId(String extBillingInvId) {
		this.extBillingInvId = extBillingInvId;
	}

	public String getExtPaymentInvId() {
		return extPaymentInvId;
	}

	public void setExtPaymentInvId(String extPaymentInvId) {
		this.extPaymentInvId = extPaymentInvId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (invoiceId != null ? invoiceId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof CustomerInvoices)) {
			return false;
		}
		CustomerInvoices other = (CustomerInvoices) object;
		if ((this.invoiceId == null && other.invoiceId != null) || (this.invoiceId != null && !this.invoiceId.equals(other.invoiceId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.milleni.dunning.datamodel.model.CustomerInvoices[ invoiceId=" + invoiceId + " ]";
	}

}
