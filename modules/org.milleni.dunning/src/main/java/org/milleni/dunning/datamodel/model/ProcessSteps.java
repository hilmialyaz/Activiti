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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
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
@Table(name = "PROCESS_STEPS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProcessSteps.findAll", query = "SELECT p FROM ProcessSteps p"),
    @NamedQuery(name = "ProcessSteps.findByStepId", query = "SELECT p FROM ProcessSteps p WHERE p.stepId = :stepId"),
    @NamedQuery(name = "ProcessSteps.findByStepName", query = "SELECT p FROM ProcessSteps p WHERE p.stepName = :stepName"),
    @NamedQuery(name = "ProcessSteps.findByCreateDate", query = "SELECT p FROM ProcessSteps p WHERE p.createDate = :createDate"),
    @NamedQuery(name = "ProcessSteps.findByCreateUser", query = "SELECT p FROM ProcessSteps p WHERE p.createUser = :createUser")})
public class ProcessSteps extends BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Column(name = "STEP_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long stepId;
    @Size(max = 50)
    @Column(name = "STEP_NAME")
    private String stepName;
    @Size(max = 100)
    @Column(name = "STEP_TEXT")
    private String stepText;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "processStepId")
    private Collection<DunningProcessDetail> dunningProcessDetailCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "processSteps")
    private Collection<DunningPolicySteps> dunningPolicyStepsCollection;

    public ProcessSteps() {
    }

    public ProcessSteps(Long stepId) {
        this.stepId = stepId;
    }

    public Long getStepId() {
        return stepId;
    }

    public void setStepId(Long stepId) {
        this.stepId = stepId;
    }

    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    
   

    public String getStepText() {
		return stepText;
	}

	public void setStepText(String stepText) {
		this.stepText = stepText;
	}

	@XmlTransient
    public Collection<DunningProcessDetail> getDunningProcessDetailCollection() {
        return dunningProcessDetailCollection;
    }

    public void setDunningProcessDetailCollection(Collection<DunningProcessDetail> dunningProcessDetailCollection) {
        this.dunningProcessDetailCollection = dunningProcessDetailCollection;
    }

    @XmlTransient
    public Collection<DunningPolicySteps> getDunningPolicyStepsCollection() {
        return dunningPolicyStepsCollection;
    }

    public void setDunningPolicyStepsCollection(Collection<DunningPolicySteps> dunningPolicyStepsCollection) {
        this.dunningPolicyStepsCollection = dunningPolicyStepsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stepId != null ? stepId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcessSteps)) {
            return false;
        }
        ProcessSteps other = (ProcessSteps) object;
        if ((this.stepId == null && other.stepId != null) || (this.stepId != null && !this.stepId.equals(other.stepId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.milleni.dunning.datamodel.model.ProcessSteps[ stepId=" + stepId + " ]";
    }
    
    
    
}
