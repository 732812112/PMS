package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.neu.entity.TbStorage;

public class TbStorageDaoImpl  implements TbStorageDao {

	@Override
	public List<TbStorage> getAll() throws Exception {
		String sql = "select * from tb_storage";
		DBUtils util = new DBUtils();
		Connection connection = util.getConnection();
		ResultSet rs = util.executeQuery(connection, sql);
		List<TbStorage> list = new ArrayList<>();
		TbStorage tbStorage = null;
		
		String goodsId;
		String goodsName;
		Date goodsInDate;
		Date goodsProductDate;
		Integer goodsCount;
		String storageName;
		
		
		while(rs.next()) {
			goodsId = rs.getString("goods_id");
			goodsName = rs.getString("goods_name");
			goodsInDate = rs.getDate("goods_in_date");
			goodsProductDate = rs.getDate("goods_product_date");
			goodsCount = rs.getInt("goods_count");
			storageName = rs.getString("storage_name");
			tbStorage = new TbStorage(goodsId, goodsName, goodsInDate, goodsProductDate, goodsCount, storageName);
			
			list.add(tbStorage);
		}
		util.closeConnection(connection);
		return list;
	}

	@Override
	public int update(TbStorage tbStorage) throws Exception {
		String sql = "update tb_Storage set goods_count = ? where goods_id = ?";
		DBUtils util = new DBUtils();
		int n = util.executeUpdate(sql, tbStorage.getGoodsCount(),tbStorage.getGoodsId());
		return n;
	}

	@Override
	public TbStorage getById(String goodsName) throws Exception {
		String sql = "select * from tb_storage where goods_name = ?";
		DBUtils util = new DBUtils();
		Connection connection = util.getConnection();
		ResultSet rs = util.executeQuery(connection, sql, goodsName);
		
		TbStorage tbStorage = null;
		
		String goodsId;
		Date goodsInDate;
		Date goodsProductDate;
		Integer goodsCount;
		String storageName;
		
		while(rs.next()) {
			goodsId = rs.getString("goods_id");
			goodsInDate = rs.getDate("goods_in_date");
			goodsProductDate = rs.getDate("goods_product_date");
			goodsCount = rs.getInt("goods_count");
			storageName = rs.getString("storage_name");
			tbStorage = new TbStorage(goodsId, goodsName, goodsInDate, goodsProductDate, goodsCount, storageName);
					
		}
		util.closeConnection(connection);
		return tbStorage;
	}

}
