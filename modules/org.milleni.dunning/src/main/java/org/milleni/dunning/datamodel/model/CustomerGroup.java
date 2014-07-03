/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.milleni.dunning.datamodel.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kemala
 */
@Entity
@Table(name = "CUSTOMER_GROUP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerGroup.findAll", query = "SELECT p FROM CustomerGroup p")})
public class CustomerGroup extends BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Column(name = "GROUP_ID")
    private Long groupId;
    @Size(max = 50)
    @Column(name = "GROUP_NAME")
    private String groupName;
    
    /*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "CustomerGroup")
    private Collection<Customer> customers;
	*/
    public CustomerGroup() {
    }

    public CustomerGroup(Long groupId) {
        this.groupId = groupId;
    }

    public CustomerGroup(Long groupId, String groupName) {
        this.groupId = groupId;
        this.groupName =groupName;
    }

    public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/*
	public Collection<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Collection<Customer> customers) {
		this.customers = customers;
	}*/
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupId != null ? groupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerGroup)) {
            return false;
        }
        CustomerGroup other = (CustomerGroup) object;
        if ((this.groupId == null && other.groupId != null) || (this.groupId != null && !this.groupId.equals(other.groupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.milleni.dunning.datamodel.model.CustomerGroup[ groupId=" + groupId + " ]";
    }
    
    
    
}
