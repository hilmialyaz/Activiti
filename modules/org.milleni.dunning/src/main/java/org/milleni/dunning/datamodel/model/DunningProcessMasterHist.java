/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.milleni.dunning.datamodel.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "DUNNING_PROCESS_MASTER_HIST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DunningProcessMasterHist.findAll", query = "SELECT d FROM DunningProcessMasterHist d"),
    @NamedQuery(name = "DunningProcessMasterHist.findByHistId", query = "SELECT d FROM DunningProcessMasterHist d WHERE d.histId = :histId"),
    @NamedQuery(name = "DunningProcessMasterHist.findByStatus", query = "SELECT d FROM DunningProcessMasterHist d WHERE d.status = :status"),
    @NamedQuery(name = "DunningProcessMasterHist.findByStatusDate", query = "SELECT d FROM DunningProcessMasterHist d WHERE d.statusDate = :statusDate"),
    @NamedQuery(name = "DunningProcessMasterHist.findByCreateDate", query = "SELECT d FROM DunningProcessMasterHist d WHERE d.createDate = :createDate"),
    @NamedQuery(name = "DunningProcessMasterHist.findByCreateUser", query = "SELECT d FROM DunningProcessMasterHist d WHERE d.createUser = :createUser")})
public class DunningProcessMasterHist extends BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "HIST_ID")
    private Long histId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "STATUS")
    private String status;
    @Column(name = "STATUS_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusDate;
    @JoinColumn(name = "PROCESS_ID", referencedColumnName = "PROCESS_ID")
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private DunningProcessMaster processId;

    public DunningProcessMasterHist() {
    }

    public DunningProcessMasterHist(Long histId) {
        this.histId = histId;
    }

    public DunningProcessMasterHist(Long histId, String status) {
        this.histId = histId;
        this.status = status;
    }

    public Long getHistId() {
        return histId;
    }

    public void setHistId(Long histId) {
        this.histId = histId;
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

    public DunningProcessMaster getProcessId() {
        return processId;
    }

    public void setProcessId(DunningProcessMaster processId) {
        this.processId = processId;
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
        if (!(object instanceof DunningProcessMasterHist)) {
            return false;
        }
        DunningProcessMasterHist other = (DunningProcessMasterHist) object;
        if ((this.histId == null && other.histId != null) || (this.histId != null && !this.histId.equals(other.histId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.milleni.dunning.datamodel.model.DunningProcessMasterHist[ histId=" + histId + " ]";
    }
    
}
