package org.milleni.dunning.datamodel.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.FetchParent;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.milleni.dunning.datamodel.model.DunningProcessMaster;

public interface DunningProcessMasterDao {
	public int findByExampleRowCount(DunningProcessMaster dpMaster,Map<String,Object> criteriaMap) ;
	public List<DunningProcessMaster> findByExample(DunningProcessMaster dpMaster, Map<String,Object> criteriaMap,int start, int count);
	
	public EntityManager getEntityManager() ;
	
	public Iterable<DunningProcessMaster> listAllDunnningProcessMasters(int page, int pageSize) ;
}
