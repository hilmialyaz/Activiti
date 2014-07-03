/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.milleni.dunning.datamodel.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author kemala
 */
@Embeddable
public class DunningPolicyStepsPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "POLICY_ID")
    private Long policyId;
  
    @Basic(optional = false)
    @NotNull
    @Column(name = "STEP_ID")
    private Long stepId;

    public DunningPolicyStepsPK() {
    }

    public DunningPolicyStepsPK(Long policyId, Long stepId) {
        this.policyId = policyId;
        this.stepId = stepId;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public Long getStepId() {
        return stepId;
    }

    public void setStepId(Long stepId) {
        this.stepId = stepId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (policyId != null ? policyId.hashCode() : 0);
        hash += (stepId != null ? stepId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DunningPolicyStepsPK)) {
            return false;
        }
        DunningPolicyStepsPK other = (DunningPolicyStepsPK) object;
        if ((this.policyId == null && other.policyId != null) || (this.policyId != null && !this.policyId.equals(other.policyId))) {
            return false;
        }
        if ((this.stepId == null && other.stepId != null) || (this.stepId != null && !this.stepId.equals(other.stepId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.milleni.dunning.datamodel.model.DunningPolicyStepsPK[ policyId=" + policyId + ", versionId=" +", stepId=" + stepId + " ]";
    }
    
}
