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
@Table(name = "CUSTOMER_TYPE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerType.findAll", query = "SELECT p FROM CustomerType p"),
    @NamedQuery(name = "CustomerType.findBytypeId", query = "SELECT p FROM CustomerType p WHERE p.typeId = :typeId"),
    @NamedQuery(name = "CustomerType.findBytypeName", query = "SELECT p FROM CustomerType p WHERE p.typeName = :typeName"),
    @NamedQuery(name = "CustomerType.findByCreateDate", query = "SELECT p FROM CustomerType p WHERE p.createDate = :createDate"),
    @NamedQuery(name = "CustomerType.findByCreateUser", query = "SELECT p FROM CustomerType p WHERE p.createUser = :createUser")})
public class CustomerType extends BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Column(name = "TYPE_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long typeId;
    @Size(max = 50)
    @Column(name = "TYPE_NAME")
    private String typeName;
    
    /*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerType")
    private Collection<Customer> customers;
	*/
    public CustomerType() {
    }

    public CustomerType(Long typeId) {
        this.typeId = typeId;
    }

    public CustomerType(Long typeId, String typeName) {
        this.typeId = typeId;
        this.typeName =typeName;
    }

    public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
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
        hash += (typeId != null ? typeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerType)) {
            return false;
        }
        CustomerType other = (CustomerType) object;
        if ((this.typeId == null && other.typeId != null) || (this.typeId != null && !this.typeId.equals(other.typeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.milleni.dunning.datamodel.model.CustomerType[ typeId=" + typeId + " ]";
    }
    
    
    
}
