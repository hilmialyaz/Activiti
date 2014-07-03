package org.milleni.dunning.datamodel.dao;

import java.io.Serializable;

import org.milleni.dunning.datamodel.model.BaseModel;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface BaseRepository<T extends BaseModel, ID extends Serializable> extends PagingAndSortingRepository<T, ID>  {


}
