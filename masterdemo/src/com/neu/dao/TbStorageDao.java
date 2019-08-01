package com.neu.dao;

import java.util.List;

import com.neu.entity.TbStorage;

public interface TbStorageDao {
	List<TbStorage> getAll() throws Exception;
	TbStorage getById(String goodsName) throws Exception;
	
	int update(TbStorage tbStorage) throws Exception;
	
	
	
}
