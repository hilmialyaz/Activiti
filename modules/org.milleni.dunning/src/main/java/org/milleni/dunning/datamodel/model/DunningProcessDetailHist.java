/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.milleni.dunning.datamodel.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kemala
 */
@Entity
@Table(name = "DUNNING_PROCESS_DETAIL_HIST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DunningProcessDetailHist.findAll", query = "SELECT d FROM DunningProcessDetailHist d"),
    @NamedQuery(name = "DunningProcessDetailHist.findByHistId", query = "SELECT d FROM DunningProcessDetailHist d WHERE d.histId = :histId"),
    @NamedQuery(name = "DunningProcessDetailHist.findByProcessId", query = "SELECT d FROM DunningProcessDetailHist d WHERE d.processId = :processId"),
    @NamedQuery(name = "DunningProcessDetailHist.findByProcessStepId", query = "SELECT d FROM DunningProcessDetailHist d WHERE d.processStepId = :processStepId"),
    @NamedQuery(name = "DunningProcessDetailHist.findByStatus", query = "SELECT d FROM DunningProcessDetailHist d WHERE d.status = :status"),
    @NamedQuery(name = "DunningProcessDetailHist.findByStatusDate", query = "SELECT d FROM DunningProcessDetailHist d WHERE d.statusDate = :statusDate"),
    @NamedQuery(name = "DunningProcessDetailHist.findByCreateDate", query = "SELECT d FROM DunningProcessDetailHist d WHERE d.createDate = :createDate"),
    @NamedQuery(name = "DunningProcessDetailHist.findByCreateUser", query = "SELECT d FROM DunningProcessDetailHist d WHERE d.createUser = :createUser")})
public class DunningProcessDetailHist extends BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "HIST_ID")
    private Long histId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PROCESS_ID")
    private BigInteger processId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PROCESS_STEP_ID")
    private BigInteger processStepId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "STATUS")
    private String status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STATUS_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusDate;

    public DunningProcessDetailHist() {
    }

    public DunningProcessDetailHist(Long histId) {
        this.histId = histId;
    }

    public DunningProcessDetailHist(Long histId, BigInteger processId, BigInteger processStepId, String status, Date statusDate) {
        this.histId = histId;
        this.processId = processId;
        this.processStepId = processStepId;
        this.status = status;
        this.statusDate = statusDate;
    }

    public Long getHistId() {
        return histId;
    }

    public void setHistId(Long histId) {
        this.histId = histId;
    }

    public BigInteger getProcessId() {
        return processId;
    }

    public void setProcessId(BigInteger processId) {
        this.processId = processId;
    }

    public BigInteger getProcessStepId() {
        return processStepId;
    }

    public void setProcessStepId(BigInteger processStepId) {
        this.processStepId = processStepId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (histId != null ? histId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DunningProcessDetailHist)) {
            return false;
        }
        DunningProcessDetailHist other = (DunningProcessDetailHist) object;
        if ((this.histId == null && other.histId != null) || (this.histId != null && !this.histId.equals(other.histId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.milleni.dunning.datamodel.model.DunningProcessDetailHist[ histId=" + histId + " ]";
    }
    
}
