/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.milleni.dunning.datamodel.model;

import java.io.Serializable;
import java.math.BigInteger;
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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author kemala
 */
@Entity
@Table(name = "DUNNING_PROCESS_DETAIL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DunningProcessDetail.findAll", query = "SELECT d FROM DunningProcessDetail d"),
    @NamedQuery(name = "DunningProcessDetail.findByProcessDetailId", query = "SELECT d FROM DunningProcessDetail d WHERE d.processDetailId = :processDetailId"),
    @NamedQuery(name = "DunningProcessDetail.findByStatus", query = "SELECT d FROM DunningProcessDetail d WHERE d.status = :status"),
    @NamedQuery(name = "DunningProcessDetail.findByStatusDate", query = "SELECT d FROM DunningProcessDetail d WHERE d.statusDate = :statusDate"),
    @NamedQuery(name = "DunningProcessDetail.findByBpmTaskId", query = "SELECT d FROM DunningProcessDetail d WHERE d.bpmTaskId = :bpmTaskId"),
    @NamedQuery(name = "DunningProcessDetail.findByCreateDate", query = "SELECT d FROM DunningProcessDetail d WHERE d.createDate = :createDate"),
    @NamedQuery(name = "DunningProcessDetail.findByCreateUser", query = "SELECT d FROM DunningProcessDetail d WHERE d.createUser = :createUser"),
    @NamedQuery(name = "DunningProcessDetail.findByUpdateDate", query = "SELECT d FROM DunningProcessDetail d WHERE d.updateDate = :updateDate"),
    @NamedQuery(name = "DunningProcessDetail.findByUpdateUser", query = "SELECT d FROM DunningProcessDetail d WHERE d.updateUser = :updateUser")})
public class DunningProcessDetail extends BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Column(name = "PROCESS_DETAIL_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long processDetailId;
    @JoinColumn(name = "STATUS", referencedColumnName = "ID")
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private DunningProcessDetailStatus status;
    
    @Column(name = "STATUS_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusDate;
    
    @Size(max = 10)
    @Column(name = "BACKEND_STATUS")
    private String backendStatus;
    @Size(max = 100)
    @Column(name = "BACKEND_STATUS_DESC")
    private String backendStatusDesc;
    
    @Column(name = "BPM_TASK_ID")
    private BigInteger bpmTaskId;
    
	@Basic(optional = true)	
	@Column(name = "CURRENT_DEBIT")
	private Double currentDebit;
	
    @Column(name = "UPDATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    @Size(max = 50)
    @Column(name = "UPDATE_USER")
    private String updateUser;
    @JoinColumn(name = "PROCESS_STEP_ID", referencedColumnName = "STEP_ID")
    @ManyToOne(optional = false,  fetch=FetchType.LAZY)
    private ProcessSteps processStepId;
    @JoinColumn(name = "PROCESS_ID", referencedColumnName = "PROCESS_ID")
    @ManyToOne(optional = false, fetch=FetchType.LAZY)
    private DunningProcessMaster processId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "processDetailId" , fetch=FetchType.LAZY)
    @Fetch(value = FetchMode.SUBSELECT)
    private Collection<DunningProcessDetailLogs> dunningProcessDetailLogsCollection;

    public DunningProcessDetail() {
    }

    public DunningProcessDetail(Long processDetailId) {
        this.processDetailId = processDetailId;
    }

    public DunningProcessDetail(Long processDetailId,Date statusDate) {
        this.processDetailId = processDetailId;
        this.statusDate = statusDate;
    }

    public Long getProcessDetailId() {
        return processDetailId;
    }

    public void setProcessDetailId(Long processDetailId) {
        this.processDetailId = processDetailId;
    }

    public DunningProcessDetailStatus getStatus() {
        return status;
    }

    public void setStatus(DunningProcessDetailStatus status) {
        this.status = status;
        this.statusDate = new Date();
    }

    
    public String getBackendStatus() {
		return backendStatus;
	}

	public void setBackendStatus(String backendStatus) {
		this.backendStatus = backendStatus;
	}

	public String getBackendStatusDesc() {
		return backendStatusDesc;
	}

	public void setBackendStatusDesc(String backendStatusDesc) {
		this.backendStatusDesc = backendStatusDesc;
	}

	public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public BigInteger getBpmTaskId() {
        return bpmTaskId;
    }

    public void setBpmTaskId(BigInteger bpmTaskId) {
        this.bpmTaskId = bpmTaskId;
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

    public ProcessSteps getProcessStepId() {
        return processStepId;
    }

    public void setProcessStepId(ProcessSteps processStepId) {
        this.processStepId = processStepId;
    }

    public DunningProcessMaster getProcessId() {
        return processId;
    }

    public void setProcessId(DunningProcessMaster processId) {
        this.processId = processId;
    }
    
    

    public Double getCurrentDebit() {
		return currentDebit;
	}

	public void setCurrentDebit(Double currentDebit) {
		this.currentDebit = currentDebit;
	}

	@XmlTransient
    public Collection<DunningProcessDetailLogs> getDunningProcessDetailLogsCollection() {
        return dunningProcessDetailLogsCollection;
    }

    public void setDunningProcessDetailLogsCollection(Collection<DunningProcessDetailLogs> dunningProcessDetailLogsCollection) {
        this.dunningProcessDetailLogsCollection = dunningProcessDetailLogsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (processDetailId != null ? processDetailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DunningProcessDetail)) {
            return false;
        }
        DunningProcessDetail other = (DunningProcessDetail) object;
        if ((this.processDetailId == null && other.processDetailId != null) || (this.processDetailId != null && !this.processDetailId.equals(other.processDetailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.milleni.dunning.datamodel.model.DunningProcessDetail[ processDetailId=" + processDetailId + " ]";
    }
    
}
