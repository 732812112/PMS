package com.neu.entity;

import java.util.Date;

/*create table tb_storage(
		goods_id varchar(20) primary key not null,
		goods_name varchar(100) not null,
		goods_in_date Date not null,
		goods_product_date Date not null,
		goods_count int not null,
		storage_name varchar(100) not null
	)*/
public class TbStorage {
	private String goodsId;
	private String goodsName;
	private Date goodsInDate;
	private Date goodsProductDate;
	private Integer goodsCount;
	private String storageName;
	
	@Override
	public String toString() {
		return "TbStorage [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsInDate=" + goodsInDate
				+ ", goodsProductDate=" + goodsProductDate + ", goodsCount=" + goodsCount + ", storageName="
				+ storageName + "]";
	}
	public TbStorage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TbStorage(String goodsId, String goodsName, Date goodsInDate, Date goodsProductDate, Integer goodsCount,
			String storageName) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsInDate = goodsInDate;
		this.goodsProductDate = goodsProductDate;
		this.goodsCount = goodsCount;
		this.storageName = storageName;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Date getGoodsInDate() {
		return goodsInDate;
	}
	public void setGoodsInDate(Date goodsInDate) {
		this.goodsInDate = goodsInDate;
	}
	public Date getGoodsProductDate() {
		return goodsProductDate;
	}
	public void setGoodsProductDate(Date goodsProductDate) {
		this.goodsProductDate = goodsProductDate;
	}
	public Integer getGoodsCount() {
		return goodsCount;
	}
	public void setGoodsCount(Integer goodsCount) {
		this.goodsCount = goodsCount;
	}
	public String getStorageName() {
		return storageName;
	}
	public void setStorageName(String storageName) {
		this.storageName = storageName;
	}
	
	

}
