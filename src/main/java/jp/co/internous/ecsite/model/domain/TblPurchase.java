package jp.co.internous.ecsite.model.domain;

import java.sql.Timestamp;

public class TblPurchase {
	
	private int id;
	private int userId;
	private int goodsId;
	private String goodsName;
	private int itemCount;
	private int total;
	private Timestamp createdAt;
	
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoddsName(String goodsName) {
		this.goodsName = goodsName;
		
	}
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int user_id) {
		this.userId = user_id;
		
	}

	public int getGoodsId() {
		return goodsId;
	}
	
	public void setGoodsId(int goods_id) {
		this.goodsId = goods_id;
		
	}
	
	public int getItemCount() {
		return itemCount;
	}
	
	public void setItem_count(int itemCount) {
		this.itemCount = itemCount;
		
	}
	
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
		
	}
	
	
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreateAt(Timestamp createdAt) {
		this.createdAt = createdAt;
		
	}


}
