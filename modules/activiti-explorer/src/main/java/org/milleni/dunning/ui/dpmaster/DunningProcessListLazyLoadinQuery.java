/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.milleni.dunning.ui.dpmaster;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.explorer.data.AbstractLazyLoadingQuery;
import org.milleni.dunning.datamodel.dao.DunningProcessMasterDao;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.util.DaoHelper;

import com.vaadin.data.Item;

/**
 * @author Joram Barrez
 */
public class DunningProcessListLazyLoadinQuery extends AbstractLazyLoadingQuery {

	private DunningProcessMasterDao dunningProcessMasterDao;
	private DunningProcessMaster dpMaster = null;
	private Long customerId = null;
	private String customerName = null;
	private int maxSize = 50;
	
	private Map<String,Object> criteriaMap= new HashMap<String,Object>();
			
	
	public DunningProcessListLazyLoadinQuery() {
		this.dunningProcessMasterDao = DaoHelper.getInstance().getDunningProcessMasterDao();
	}

	public List<Item> loadItems(int start, int count) {
		List<Item> dpMasterItems = new ArrayList<Item>();
		if(dpMaster!=null){			
			List<DunningProcessMaster> dpMasterList = dunningProcessMasterDao.findByExample(dpMaster,criteriaMap,start,count);
			for (DunningProcessMaster dpMaster : dpMasterList) {
				dpMasterItems.add(new DunningProcessTableListItem(dpMaster));
			}
			return dpMasterItems;
		}
		
		Iterable<DunningProcessMaster> dpMasterList = dunningProcessMasterDao.listAllDunnningProcessMasters(start,count);
		for (DunningProcessMaster dpMaster : dpMasterList) {
			dpMasterItems.add(new DunningProcessTableListItem(dpMaster));
		}
		return dpMasterItems;
	}
	
	public Item loadSingleResult(String id) {
		return null;
		//return new DunningProcessTableListItem(customerService.findOne(Long.parseLong(id)));
	}

	public void setSorting(Object[] propertyIds, boolean[] ascending) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int size() {
		if(dpMaster!=null){			
			return  dunningProcessMasterDao.findByExampleRowCount(dpMaster,criteriaMap);
		}
		return maxSize;	
	}

	public void setDpMaster(DunningProcessMaster dpMaster) {
		this.dpMaster = dpMaster;
	}

	

	public void setNextStepDateStart(Date nextStepDateStart) {
		criteriaMap.put("nextStepDateStart", nextStepDateStart);
	}

	public void setNextStepDateEnd(Date nextStepDateEnd) {
		criteriaMap.put("nextStepDateEnd", nextStepDateEnd);
	}

	
	public void setProcessStartDateStart(Date processStartDateStart) {
		criteriaMap.put("processStartDateStart", processStartDateStart);
	}
	
	public void setProcessStartDateEnd(Date processStartDateEnd) {
		criteriaMap.put("processStartDateEnd", processStartDateEnd);
	}

	public void setStatusDateStart(Date statusDateStart) {
		criteriaMap.put("statusDateStart", statusDateStart);
	}
	
	public void setStatusDateEnd(Date statusDateEnd) {
		criteriaMap.put("statusDateEnd", statusDateEnd);
	}
	
	
	public void setInvoiceDateEnd(Date invoiceDateEnd) {
		criteriaMap.put("invoiceDateEnd", invoiceDateEnd);
	}
	
	public void setInvoiceDateStart(Date invoiceDateStart) {
		criteriaMap.put("invoiceDateStart", invoiceDateStart);
	}
	

	

	

}
