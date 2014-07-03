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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "DUNNING_PROCESS_MASTER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DunningProcessMaster.findAll", query = "SELECT d FROM DunningProcessMaster d"),
    @NamedQuery(name = "DunningProcessMaster.findByProcessId", query = "SELECT d FROM DunningProcessMaster d WHERE d.processId = :processId"),
    @NamedQuery(name = "DunningProcessMaster.findByStatus", query = "SELECT d FROM DunningProcessMaster d WHERE d.status = :status"),
    @NamedQuery(name = "DunningProcessMaster.findByStatusDate", query = "SELECT d FROM DunningProcessMaster d WHERE d.statusDate = :statusDate"),
    @NamedQuery(name = "DunningProcessMaster.findByBpmProcessId", query = "SELECT d FROM DunningProcessMaster d WHERE d.bpmProcessId = :bpmProcessId"),
    @NamedQuery(name = "DunningProcessMaster.findByDunningPolicyId", query = "SELECT d FROM DunningProcessMaster d WHERE d.dunningPolicyId = :dunningPolicyId"),
    @NamedQuery(name = "DunningProcessMaster.findByCreateDate", query = "SELECT d FROM DunningProcessMaster d WHERE d.createDate = :createDate"),
    @NamedQuery(name = "DunningProcessMaster.findByCreateUser", query = "SELECT d FROM DunningProcessMaster d WHERE d.createUser = :createUser"),
    @NamedQuery(name = "DunningProcessMaster.findByUpdateDate", query = "SELECT d FROM DunningProcessMaster d WHERE d.updateDate = :updateDate"),
    @NamedQuery(name = "DunningProcessMaster.findByUpdateUser", query = "SELECT d FROM DunningProcessMaster d WHERE d.updateUser = :updateUser")})
public class DunningProcessMaster extends BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Column(name = "PROCESS_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long processId;
    
    @JoinColumn(name = "STATUS", referencedColumnName = "ID")
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private DunningProcessMasterStatus status;
    @Basic(optional = true)
    @Size(max = 200)
    @Column(name = "STATUS_DESC")
    private String statusDesc;
    @Column(name = "STATUS_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusDate;
    @Column(name = "BPM_PROCESS_ID")
    private String bpmProcessId;
    
    @JoinColumn(name = "DUNNING_POLICY_ID", referencedColumnName = "POLICY_ID")
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private DunningPolicy dunningPolicyId;
    
    @Column(name = "UPDATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    @Size(max = 50)
    @Column(name = "UPDATE_USER")
    private String updateUser;
    @JoinColumn(name = "DUNNING_INVOICE_ID", referencedColumnName = "INVOICE_ID")
    @ManyToOne(fetch=FetchType.LAZY)
    private CustomerInvoices dunningInvoiceId;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID")
    @ManyToOne(optional = false ,fetch=FetchType.LAZY)
    private Customer customerId;
    
	@Basic(optional = true)	
	@Column(name = "CURRENT_DEBIT")
	private Double currentDebit;
	
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "processId" , fetch=FetchType.LAZY)
    private Collection<DunningProcessDetail> dunningProcessDetailCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "processId",fetch=FetchType.LAZY)
    private Collection<DunningProcessMasterHist> dunningProcessMasterHistCollection;
    
    @JoinColumn(name = "LAST_STEP_ID", referencedColumnName = "STEP_ID")
    @ManyToOne(optional = true ,fetch=FetchType.LAZY)
    private ProcessSteps lastStepId;
    
    
    @JoinColumn(name = "NEXT_STEP_ID", referencedColumnName = "STEP_ID")
    @ManyToOne(optional = true ,fetch=FetchType.LAZY)
    private ProcessSteps nextStepId;
    
    
    @JoinColumn(name = "CURRENT_STEP_ID", referencedColumnName = "STEP_ID")
    @ManyToOne(optional = true ,fetch=FetchType.LAZY)
    private ProcessSteps currentStepId;
    
    
    @Column(name = "NEXTSTEP_EXE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nextStepExecutionDate;
    

    public DunningProcessMaster() {
    }

    public DunningProcessMaster(Long processId) {
        this.processId = processId;
    }


    public Long getProcessId() {
        return processId;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
    }

    public DunningProcessMasterStatus getStatus() {
        return status;
    }

    public void setStatus(DunningProcessMasterStatus status) {
        this.status = status;
        this.statusDate=new Date();
    }
    
    

    public String getStatusDesc() {
		return statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public String getBpmProcessId() {
        return bpmProcessId;
    }

    public void setBpmProcessId(String bpmProcessId) {
        this.bpmProcessId = bpmProcessId;
    }

    public DunningPolicy getDunningPolicyId() {
        return dunningPolicyId;
    }

    public void setDunningPolicyId(DunningPolicy dunningPolicyId) {
        this.dunningPolicyId = dunningPolicyId;
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

    public CustomerInvoices getDunningInvoiceId() {
        return dunningInvoiceId;
    }

    public void setDunningInvoiceId(CustomerInvoices dunningInvoiceId) {
        this.dunningInvoiceId = dunningInvoiceId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }
    
    

   

	public Double getCurrentDebit() {
		return currentDebit;
	}

	public void setCurrentDebit(Double currentDebit) {
		this.currentDebit = currentDebit;
	}

	@XmlTransient
    public Collection<DunningProcessDetail> getDunningProcessDetailCollection() {
        return dunningProcessDetailCollection;
    }

    public void setDunningProcessDetailCollection(Collection<DunningProcessDetail> dunningProcessDetailCollection) {
        this.dunningProcessDetailCollection = dunningProcessDetailCollection;
    }

    @XmlTransient
    public Collection<DunningProcessMasterHist> getDunningProcessMasterHistCollection() {
        return dunningProcessMasterHistCollection;
    }

    public void setDunningProcessMasterHistCollection(Collection<DunningProcessMasterHist> dunningProcessMasterHistCollection) {
        this.dunningProcessMasterHistCollection = dunningProcessMasterHistCollection;
    }
    
    public ProcessSteps getProcessLastStepId() {
        return lastStepId;
    }

    public void setProcessLastStepId(ProcessSteps lastStepId) {
        this.lastStepId = lastStepId;
    }
    
    public ProcessSteps getNextStepId() {
		return nextStepId;
	}

	public void setNextStepId(ProcessSteps nextStepId) {
		this.nextStepId = nextStepId;
	}

	public ProcessSteps getCurrentStepId() {
		return currentStepId;
	}

	public void setCurrentStepId(ProcessSteps currrentStepId) {
		this.currentStepId = currrentStepId;
	}
	
	public Date getNextStepExecutionDate() {
		return nextStepExecutionDate;
	}

	public void setNextStepExecutionDate(Date nextStepExecutionDate) {
		this.nextStepExecutionDate = nextStepExecutionDate;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (processId != null ? processId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DunningProcessMaster)) {
            return false;
        }
        DunningProcessMaster other = (DunningProcessMaster) object;
        if ((this.processId == null && other.processId != null) || (this.processId != null && !this.processId.equals(other.processId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.milleni.dunning.datamodel.model.DunningProcessMaster[ processId=" + processId + " ]";
    }
    
}
