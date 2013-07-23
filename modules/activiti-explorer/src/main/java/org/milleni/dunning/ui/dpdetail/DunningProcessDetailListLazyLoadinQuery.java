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

package org.milleni.dunning.ui.dpdetail;

import java.util.ArrayList;
import java.util.List;

import org.activiti.explorer.data.AbstractLazyLoadingQuery;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.milleni.dunning.datamodel.dao.DunningProcessDetailDao;
import org.milleni.dunning.datamodel.model.Customer;
import org.milleni.dunning.datamodel.model.DunningProcessDetail;
import org.milleni.dunning.datamodel.model.DunningProcessMaster;
import org.milleni.dunning.datamodel.service.DunningProcessService;
import org.milleni.dunning.datamodel.util.DaoHelper;

import com.vaadin.data.Item;

/**
 * @author Joram Barrez
 */
public class DunningProcessDetailListLazyLoadinQuery extends AbstractLazyLoadingQuery {

	private DunningProcessDetailDao dunningProcessDetailDao;
	private DunningProcessDetail dpDetail = null;
	private Long customerId = null;
	private String customerName = null;
	
	private int maxSize = 50;
	
	public DunningProcessDetailListLazyLoadinQuery() {
		this.dunningProcessDetailDao = DaoHelper.getInstance().getDunningProcessDetailDao();
	}

	public List<Item> loadItems(int start, int count) {

		List<Item> dpMasterItems = new ArrayList<Item>();
		if(dpDetail!=null){			
			List<DunningProcessDetail> dpMasterList = dunningProcessDetailDao.findByExample(dpDetail,start,count);
			for (DunningProcessDetail dpMaster : dpMasterList) {
				dpMasterItems.add(new DunningProcessDetailTableListItem(dpDetail));
			}
			return dpMasterItems;
		}
		
		Iterable<DunningProcessDetail> dpMasterList = dunningProcessDetailDao.listAllDunnningProcessMasters(start,count);
		for (DunningProcessDetail dpMaster : dpMasterList) {
			dpMasterItems.add(new DunningProcessDetailTableListItem(dpDetail));
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
		if(dpDetail!=null){			
			return  dunningProcessDetailDao.findByExampleRowCount(dpDetail);
		}
		return maxSize;	
	}

	public void setDpDetail(DunningProcessDetail dpDetail) {
		this.dpDetail = dpDetail;
	}



	

	

	

}
