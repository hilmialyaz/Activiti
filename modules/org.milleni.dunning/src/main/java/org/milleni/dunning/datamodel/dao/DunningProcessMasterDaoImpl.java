package org.milleni.dunning.datamodel.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.FetchParent;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository(value = "dunningProcessMasterDao")
public class DunningProcessMasterDaoImpl implements DunningProcessMasterDao{
	
	@Autowired
	DunningProcessMasterRepository dunningProcessMasterRepository;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public int findByExampleRowCount(DunningProcessMaster dpMaster,Map<String,Object> criteriaMap) {
		Long rowCount = getByCriteriaRowCount(dpMaster,criteriaMap);
		return rowCount.intValue();
	}

	public List<DunningProcessMaster> findByExample(DunningProcessMaster dpMaster,Map<String,Object> criteriaMap,int start, int count) {
		return getByCriteria(dpMaster, criteriaMap,start,count);
	}
	
	
	public List<DunningProcessMaster> getByCriteria(DunningProcessMaster dpMaster,Map<String,Object> criteriaMap,int start, int count){
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<DunningProcessMaster> query = builder.createQuery(DunningProcessMaster.class);
		query.distinct(true);
		Root<DunningProcessMaster> dpmRoot = query.from(DunningProcessMaster.class);
		
		 FetchParent<DunningProcessMaster, DunningProcessMaster> fetch = dpmRoot;
		 fetch.fetch("customerId", JoinType.LEFT);
		 fetch.fetch("status", JoinType.LEFT);
		 fetch.fetch("currentStepId", JoinType.LEFT);
		 fetch.fetch("lastStepId", JoinType.LEFT);
		 fetch.fetch("nextStepId", JoinType.LEFT);
		 fetch.fetch("dunningInvoiceId", JoinType.LEFT);
		
		defineWhereParams(dpMaster, builder, dpmRoot, query, criteriaMap);
		final TypedQuery typedQuery = entityManager.createQuery(query);
		typedQuery.setFirstResult(start);
		typedQuery.setMaxResults(count);
		List<DunningProcessMaster> resultList = typedQuery.getResultList();
		
		return resultList;
		
	}
	
	public Long  getByCriteriaRowCount(DunningProcessMaster dpMaster, Map<String,Object> criteriaMap){
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Long> query = builder.createQuery(Long.class);
		Root<DunningProcessMaster> dpmRoot = query.from(DunningProcessMaster.class);
		CriteriaQuery<Long> select = query.select(builder.count(dpmRoot));
		
		defineWhereParams(dpMaster, builder, dpmRoot, query,criteriaMap);
		final TypedQuery typedQuery = entityManager.createQuery(query);
		return (Long)typedQuery.getSingleResult();
	}
	
	public void defineWhereParams(DunningProcessMaster dpMaster,CriteriaBuilder builder,Root<DunningProcessMaster> dpmRoot,CriteriaQuery query ,Map<String,Object> criteriaMap ){
		List<Predicate> criteriaList = new ArrayList<Predicate>();

		if (dpMaster != null && dpMaster.getDunningPolicyId() != null){
			Predicate predicate1 = builder.equal(dpmRoot.get("dunningPolicyId").get("policyId"), dpMaster.getDunningPolicyId().getPolicyId());
			criteriaList.add(predicate1);
		}
		
		if (dpMaster != null && dpMaster.getProcessLastStepId() != null){
			Predicate predicate1 = builder.equal(dpmRoot.get("lastStepId").get("stepId"), dpMaster.getProcessLastStepId().getStepId());
			criteriaList.add(predicate1);
		}
		if (dpMaster != null && dpMaster.getCurrentStepId() != null){
			Predicate predicate1 = builder.equal(dpmRoot.get("currentStepId").get("stepId"), dpMaster.getCurrentStepId().getStepId());
			criteriaList.add(predicate1);
		}
		if (dpMaster != null && dpMaster.getNextStepId() != null){
			Predicate predicate1 = builder.equal(dpmRoot.get("nextStepId").get("stepId"), dpMaster.getNextStepId().getStepId());
			criteriaList.add(predicate1);
		}
		if (dpMaster != null && dpMaster.getStatus() != null){
			Predicate predicate1 = builder.equal(dpmRoot.get("status"), dpMaster.getStatus());
			criteriaList.add(predicate1);
		}
		
		if (criteriaMap.get("processStartDateStart") != null){
			//ParameterExpression<Date> param = builder.parameter(Date.class, "createDate");
			Predicate predicate1 = builder.greaterThanOrEqualTo(dpmRoot.<Date>get("createDate"), (Date)criteriaMap.get("processStartDateStart"));
			criteriaList.add(predicate1);
		}
		if (criteriaMap.get("processStartDateEnd") != null){
			//ParameterExpression<Date> param = builder.parameter(Date.class, "createDate");
			Predicate predicate1 = builder.lessThanOrEqualTo(dpmRoot.<Date>get("createDate"),(Date)criteriaMap.get("processStartDateEnd") );
			criteriaList.add(predicate1);
		}
		
		if (criteriaMap.get("nextStepDateStart") != null){
			//ParameterExpression<Date> param = builder.parameter(Date.class, "createDate");
			Predicate predicate1 = builder.greaterThanOrEqualTo(dpmRoot.<Date>get("nextStepExecutionDate"), (Date)criteriaMap.get("nextStepDateStart"));
			criteriaList.add(predicate1);
		}
		if (criteriaMap.get("nextStepDateEnd") != null){
			//ParameterExpression<Date> param = builder.parameter(Date.class, "createDate");
			Predicate predicate1 = builder.lessThanOrEqualTo(dpmRoot.<Date>get("nextStepExecutionDate"),(Date)criteriaMap.get("nextStepDateEnd") );
			criteriaList.add(predicate1);
		}
		
		
		if (criteriaMap.get("statusDateStart") != null){
			//ParameterExpression<Date> param = builder.parameter(Date.class, "createDate");
			Predicate predicate1 = builder.greaterThanOrEqualTo(dpmRoot.<Date>get("statusDate"), (Date)criteriaMap.get("statusDateStart"));
			criteriaList.add(predicate1);
		}
		if (criteriaMap.get("statusDateEnd") != null){
			//ParameterExpression<Date> param = builder.parameter(Date.class, "createDate");
			Predicate predicate1 = builder.lessThanOrEqualTo(dpmRoot.<Date>get("statusDate"),(Date)criteriaMap.get("statusDateEnd") );
			criteriaList.add(predicate1);
		}
		
		if (criteriaMap.get("invoiceDateStart") != null){
			//ParameterExpression<Date> param = builder.parameter(Date.class, "createDate");
			Predicate predicate1 = builder.greaterThanOrEqualTo(dpmRoot.get("dunningInvoiceId").<Date>get("invoiceDate"), (Date)criteriaMap.get("invoiceDateStart"));
			criteriaList.add(predicate1);
		}
		if (criteriaMap.get("invoiceDateEnd") != null){
			//ParameterExpression<Date> param = builder.parameter(Date.class, "createDate");
			Predicate predicate1 = builder.lessThanOrEqualTo(dpmRoot.get("dunningInvoiceId").<Date>get("invoiceDate"),(Date)criteriaMap.get("invoiceDateEnd") );
			criteriaList.add(predicate1);
		}
		
		if (dpMaster != null && dpMaster.getCustomerId() != null){
			Predicate predicate1 = builder.equal(dpmRoot.get("customerId"), dpMaster.getCustomerId());
			criteriaList.add(predicate1);
		}

		query.where(builder.and(criteriaList.toArray(new Predicate[0])));
	}
	
	public Iterable<DunningProcessMaster> listAllDunnningProcessMasters(int page, int pageSize) {
		Pageable pageable = new PageRequest(page, pageSize);
		return dunningProcessMasterRepository.findAll(pageable);
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
}
