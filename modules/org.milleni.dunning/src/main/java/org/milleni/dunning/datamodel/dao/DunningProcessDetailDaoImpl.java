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
import javax.persistence.criteria.Fetch;
import javax.persistence.criteria.FetchParent;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository(value = "dunningProcessDetailDao")
public class DunningProcessDetailDaoImpl implements DunningProcessDetailDao{
	
	
	@Autowired
	DunningProcessDetailRepository  dunningProcessDetailRepository;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public int findByExampleRowCount(DunningProcessDetail dpDetail,Map<String,Object> criteriaMap) {
		Long rowCount = getByCriteriaRowCount(dpDetail,criteriaMap);
		return rowCount.intValue();
	}

	public List<DunningProcessDetail> findByExample(DunningProcessDetail dpDetail ,Map<String,Object> criteriaMap, int start, int count) {
		return getByCriteria(dpDetail,criteriaMap,start,count);
	}
	
	
	public List<DunningProcessDetail> getByCriteria(DunningProcessDetail dpDetail,Map<String,Object> criteriaMap,int start, int count){
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<DunningProcessDetail> query = builder.createQuery(DunningProcessDetail.class);
		query.distinct(true);
		Root<DunningProcessDetail> dpmRoot = query.from(DunningProcessDetail.class);
		
		
		 FetchParent<DunningProcessDetail, DunningProcessDetail> fetch = dpmRoot;
		  fetch.fetch("processStepId", JoinType.LEFT);
		  Fetch<DunningProcessDetail,DunningProcessMaster>  master = fetch.fetch("processId", JoinType.LEFT);
		  master.fetch("customerId", JoinType.LEFT);
		  master.fetch("dunningInvoiceId", JoinType.LEFT);
		 
		 //dpmRoot.join("processId",JoinType.LEFT).join("customerId",JoinType.LEFT);
		 //dpmRoot.join("processStepId",JoinType.LEFT);
		 
		defineWhereParams(dpDetail, builder, dpmRoot, query,criteriaMap);
		final TypedQuery typedQuery = entityManager.createQuery(query);
		typedQuery.setFirstResult(start);
		typedQuery.setMaxResults(count);
		List<DunningProcessDetail> resultList = typedQuery.getResultList();
		
		return resultList;
		
	}
	
	public Long  getByCriteriaRowCount(DunningProcessDetail dpDetail,Map<String,Object> criteriaMap){
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Long> query = builder.createQuery(Long.class);
		Root<DunningProcessDetail> dpmRoot = query.from(DunningProcessDetail.class);
		CriteriaQuery<Long> select = query.select(builder.count(dpmRoot));
		
		defineWhereParams(dpDetail, builder, dpmRoot, query, criteriaMap);
		final TypedQuery typedQuery = entityManager.createQuery(query);
		return (Long)typedQuery.getSingleResult();
	}
	
	public void defineWhereParams(DunningProcessDetail dpDetail,CriteriaBuilder builder,Root<DunningProcessDetail> dpmRoot,CriteriaQuery query , Map<String,Object> criteriaMap ){
		List<Predicate> criteriaList = new ArrayList<Predicate>();
		if(dpDetail==null) return;
		
		if (dpDetail.getProcessId() != null && dpDetail.getProcessId().getDunningPolicyId()!=null ){
			Predicate predicate1 = builder.equal(dpmRoot.get("processId").get("dunningPolicyId"), dpDetail.getProcessId().getDunningPolicyId());
			criteriaList.add(predicate1);
		}
		
		if (dpDetail.getProcessId() != null && dpDetail.getProcessId().getCreateDate()!=null ){
			Predicate predicate1 = builder.greaterThanOrEqualTo(dpmRoot.get("processId").<Date>get("createDate"), dpDetail.getProcessId().getCreateDate() );
			criteriaList.add(predicate1);
		}
		
		if (dpDetail.getProcessId() != null && dpDetail.getProcessId().getProcessLastStepId()!=null){
			Predicate predicate1 = builder.equal(dpmRoot.get("processStepId").get("stepId"), dpDetail.getProcessId().getProcessLastStepId().getStepId());
			criteriaList.add(predicate1);
		}
		
		if (dpDetail.getProcessId() != null && dpDetail.getProcessId().getStatus()!=null){
			Predicate predicate1 = builder.equal(dpmRoot.get("processId").get("status"), dpDetail.getProcessId().getStatus());
			criteriaList.add(predicate1);
		}
		if (dpDetail.getStatus() != null){
			Predicate predicate1 = builder.equal(dpmRoot.get("status"), dpDetail.getStatus());
			criteriaList.add(predicate1);
		}
		
		
		if (criteriaMap.get("stepCreateDate") != null){
			//ParameterExpression<Date> param = builder.parameter(Date.class, "createDate");
			Predicate predicate1 = builder.greaterThanOrEqualTo(dpmRoot.<Date>get("createDate"), (Date)criteriaMap.get("stepCreateDate"));
			criteriaList.add(predicate1);
		}
		if (criteriaMap.get("stepCreateDateEnd") != null){
			//ParameterExpression<Date> param = builder.parameter(Date.class, "createDate");
			Predicate predicate1 = builder.lessThanOrEqualTo(dpmRoot.<Date>get("createDate"),(Date)criteriaMap.get("stepCreateDateEnd") );
			criteriaList.add(predicate1);
		}
		
		if (criteriaMap.get("statusChangeDate") != null){
			//ParameterExpression<Date> param = builder.parameter(Date.class, "createDate");
			Predicate predicate1 = builder.greaterThanOrEqualTo(dpmRoot.<Date>get("statusDate"), (Date)criteriaMap.get("statusChangeDate"));
			criteriaList.add(predicate1);
		}
		
		if (criteriaMap.get("statusChangeDateEnd") != null){
			//ParameterExpression<Date> param = builder.parameter(Date.class, "createDate");
			Predicate predicate1 = builder.lessThanOrEqualTo(dpmRoot.<Date>get("statusDate"), (Date)criteriaMap.get("statusChangeDateEnd"));
			criteriaList.add(predicate1);
		}
		
		query.where(builder.and(criteriaList.toArray(new Predicate[0])));
	}
	
	
	
	public Iterable<DunningProcessDetail> listAllDunnningProcessMasters(int page, int pageSize) {
		Pageable pageable = new PageRequest(page, pageSize);
		return dunningProcessDetailRepository.findAll(pageable);
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
}
