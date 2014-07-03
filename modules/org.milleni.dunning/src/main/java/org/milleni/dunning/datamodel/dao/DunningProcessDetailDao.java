package org.milleni.dunning.datamodel.dao;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.milleni.dunning.datamodel.model.DunningProcessDetail;

public interface DunningProcessDetailDao {
	public int findByExampleRowCount(DunningProcessDetail dpMaster,Map<String,Object> criteriaMap) ;
	public List<DunningProcessDetail> findByExample(DunningProcessDetail dpMaster,Map<String,Object> criteriaMap ,int start, int count);
	
	public List<DunningProcessDetail> getByCriteria(DunningProcessDetail dpMaster,Map<String,Object> criteriaMap,int start, int count);
	public Long  getByCriteriaRowCount(DunningProcessDetail dpMaster,Map<String,Object> criteriaMap);

	public EntityManager getEntityManager() ;
	
	public Iterable<DunningProcessDetail> listAllDunnningProcessMasters(int page, int pageSize) ;
}
