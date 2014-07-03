/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.milleni.dunning.datamodel.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.OneToMany;

/**
 *
 * @author kemala
 */
@Entity
@Table(name = "DUNNING_POLICY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DunningPolicy.findAll", query = "SELECT d FROM DunningPolicy d"),
    @NamedQuery(name = "DunningPolicy.findByPolicyId", query = "SELECT d FROM DunningPolicy d WHERE d.policyId = :policyId"),
    @NamedQuery(name = "DunningPolicy.findByPolicyName", query = "SELECT d FROM DunningPolicy d WHERE d.policyName = :policyName"),
    @NamedQuery(name = "DunningPolicy.findByCreateDate", query = "SELECT d FROM DunningPolicy d WHERE d.createDate = :createDate"),
    @NamedQuery(name = "DunningPolicy.findByCreateUser", query = "SELECT d FROM DunningPolicy d WHERE d.createUser = :createUser")})
public class DunningPolicy extends BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "POLICY_ID")
    private Long policyId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "POLICY_NAME")
    private String policyName;
    
    
    @Column(name = "VALID_FROM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date validFrom;
    
    @Column(name = "VALID_TO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date validTo;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dunningPolicyId")
    private Collection<DunningProcessMaster> dunningProcessMasterCollection;

    public DunningPolicy() {
    }

    public DunningPolicy(Long policyId) {
        this.policyId = policyId;
    }

    public DunningPolicy(Long policyId , String policyName) {
        this.policyId = policyId;
        this.policyName = policyName;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    
    public Collection<DunningProcessMaster> getDunningProcessMasterCollection() {
        return dunningProcessMasterCollection;
    }

    public void setDunningProcessMasterCollection(Collection<DunningProcessMaster> dunningProcessMasterCollection) {
        this.dunningProcessMasterCollection = dunningProcessMasterCollection;
    }
    
    

    public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Date getValidTo() {
		return validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (policyId != null ? policyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DunningPolicy)) {
            return false;
        }
        DunningPolicy other = (DunningPolicy) object;
        if ((this.policyId == null && other.policyId != null) || (this.policyId != null && !this.policyId.equals(other.policyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.milleni.dunning.datamodel.model.DunningPolicy[ policyId=" + policyId + " ]";
    }
    
}
