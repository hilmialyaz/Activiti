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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
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
@Table(name = "DUNNING_PROCESS_DETAIL_LOGS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DunningProcessDetailLogs.findAll", query = "SELECT d FROM DunningProcessDetailLogs d"),
    @NamedQuery(name = "DunningProcessDetailLogs.findByLogId", query = "SELECT d FROM DunningProcessDetailLogs d WHERE d.logId = :logId"),
    @NamedQuery(name = "DunningProcessDetailLogs.findByLogText", query = "SELECT d FROM DunningProcessDetailLogs d WHERE d.logText = :logText"),
    @NamedQuery(name = "DunningProcessDetailLogs.findByCreateDate", query = "SELECT d FROM DunningProcessDetailLogs d WHERE d.createDate = :createDate"),
    @NamedQuery(name = "DunningProcessDetailLogs.findByCreateUser", query = "SELECT d FROM DunningProcessDetailLogs d WHERE d.createUser = :createUser")})
public class DunningProcessDetailLogs extends BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Column(name = "LOG_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long logId;
    @Size(max = 50)
    @Column(name = "LOG_KEY")
    private String logKey;
    
    @Size(max = 400)
    @Column(name = "LOG_TEXT")
    private String logText;
    
    @Size(max = 50)
    @Column(name = "LOG_STEP")
    private String logStep;
    
    @JoinColumn(name = "PROCESS_DETAIL_ID", referencedColumnName = "PROCESS_DETAIL_ID")
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private DunningProcessDetail processDetailId;

    public DunningProcessDetailLogs() {
    }

    public DunningProcessDetailLogs(Long logId) {
        this.logId = logId;
    }


    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public String getLogText() {
        return logText;
    }

    public void setLogText(String logText) {
        this.logText = logText;
    }
    
    public String getLogKey() {
        return logKey;
    }

    public void setLogKey(String logKey) {
        this.logKey = logKey;
    }

    public DunningProcessDetail getProcessDetailId() {
        return processDetailId;
    }

    public void setProcessDetailId(DunningProcessDetail processDetailId) {
        this.processDetailId = processDetailId;
    }
    
    

    public String getLogStep() {
		return logStep;
	}

	public void setLogStep(String logStep) {
		this.logStep = logStep;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (logId != null ? logId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DunningProcessDetailLogs)) {
            return false;
        }
        DunningProcessDetailLogs other = (DunningProcessDetailLogs) object;
        if ((this.logId == null && other.logId != null) || (this.logId != null && !this.logId.equals(other.logId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.milleni.dunning.datamodel.model.DunningProcessDetailLogs[ logId=" + logId + " ]";
    }
    
}
