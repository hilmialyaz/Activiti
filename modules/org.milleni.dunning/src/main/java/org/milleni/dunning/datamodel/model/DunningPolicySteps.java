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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "DUNNING_POLICY_STEPS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DunningPolicySteps.findAll", query = "SELECT d FROM DunningPolicySteps d"),
    @NamedQuery(name = "DunningPolicySteps.findByPolicyId", query = "SELECT d FROM DunningPolicySteps d WHERE d.dunningPolicyStepsPK.policyId = :policyId"),
    @NamedQuery(name = "DunningPolicySteps.findByStepId", query = "SELECT d FROM DunningPolicySteps d WHERE d.dunningPolicyStepsPK.stepId = :stepId"),
    @NamedQuery(name = "DunningPolicySteps.findBySeqNum", query = "SELECT d FROM DunningPolicySteps d WHERE d.seqNum = :seqNum"),
    @NamedQuery(name = "DunningPolicySteps.findByCreateDate", query = "SELECT d FROM DunningPolicySteps d WHERE d.createDate = :createDate"),
    @NamedQuery(name = "DunningPolicySteps.findByCreateUser", query = "SELECT d FROM DunningPolicySteps d WHERE d.createUser = :createUser")})
public class DunningPolicySteps extends BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DunningPolicyStepsPK dunningPolicyStepsPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SEQ_NUM")
    private int seqNum;
    @JoinColumn(name = "STEP_ID", referencedColumnName = "STEP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private ProcessSteps processSteps;    
    @Size(min = 1, max = 30)
    @Column(name = "NEXT_STEP_WAIT_DURATION")
    private String nextStepWaitDuration;

    public DunningPolicySteps() {
    }

    public DunningPolicySteps(DunningPolicyStepsPK dunningPolicyStepsPK) {
        this.dunningPolicyStepsPK = dunningPolicyStepsPK;
    }

    public DunningPolicySteps(DunningPolicyStepsPK dunningPolicyStepsPK, int seqNum) {
        this.dunningPolicyStepsPK = dunningPolicyStepsPK;
        this.seqNum = seqNum;
    }

    public DunningPolicySteps(Long policyId, Long stepId) {
        this.dunningPolicyStepsPK = new DunningPolicyStepsPK(policyId, stepId);
    }

    public DunningPolicyStepsPK getDunningPolicyStepsPK() {
        return dunningPolicyStepsPK;
    }

    public void setDunningPolicyStepsPK(DunningPolicyStepsPK dunningPolicyStepsPK) {
        this.dunningPolicyStepsPK = dunningPolicyStepsPK;
    }

    public int getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(int seqNum) {
        this.seqNum = seqNum;
    }

    public ProcessSteps getProcessSteps() {
        return processSteps;
    }

    public void setProcessSteps(ProcessSteps processSteps) {
        this.processSteps = processSteps;
    }
    
    

    public String getNextStepWaitDuration() {
		return nextStepWaitDuration;
	}

	public void setNextStepWaitDuration(String nextStepWaitDuration) {
		this.nextStepWaitDuration = nextStepWaitDuration;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (dunningPolicyStepsPK != null ? dunningPolicyStepsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DunningPolicySteps)) {
            return false;
        }
        DunningPolicySteps other = (DunningPolicySteps) object;
        if ((this.dunningPolicyStepsPK == null && other.dunningPolicyStepsPK != null) || (this.dunningPolicyStepsPK != null && !this.dunningPolicyStepsPK.equals(other.dunningPolicyStepsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.milleni.dunning.datamodel.model.DunningPolicySteps[ dunningPolicyStepsPK=" + dunningPolicyStepsPK + " ]";
    }
    
}
