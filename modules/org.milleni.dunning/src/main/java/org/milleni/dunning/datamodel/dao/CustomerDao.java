package org.milleni.dunning.datamodel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.milleni.dunning.datamodel.model.Customer;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service bean that handles loan requests.
 * 
 * @author Frederik Heremans
 */
public class CustomerDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public Customer newLoanRequest(String customerName, Long amount) {
		Customer lr = new Customer();
		lr.setCustomerName("test");
		entityManager.persist(lr);
		return lr;
	}

	@Transactional
	public Customer getCustomer(Long id) {
		return entityManager.find(Customer.class, id);
	}

	@Transactional
	public List<Customer> findRange(int start, int end) {
		Query query = entityManager.createNamedQuery("Customer.findAll");
		query.setMaxResults(end - start);
		query.setFirstResult(start);
		return query.getResultList();
	}

	@Transactional
	public void findByExample() {
		Customer foo = new Customer();
		Session session = (Session) entityManager.getDelegate();
		// create an example from our customer, exclude all zero valued numeric
		// properties
		Example customerExample = Example.create(foo).excludeZeroes();
		// create criteria based on the customer example
		Criteria criteria = session.createCriteria(Customer.class).add(customerExample);
		criteria.list();
	}

}
