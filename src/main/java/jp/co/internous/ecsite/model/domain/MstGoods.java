package jp.co.internous.ecsite.model.domain;

import java.sql.Timestamp;

public class MstGoods {
	private int id;
	
	private String goodsName;
	
	private int price;
	
	private Timestamp createAt;
	
	private Timestamp updateAt;
	
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
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
		
	}
	
	public Timestamp getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Timestamp createAt) {
		this.createAt = createAt;
		
	}
	public Timestamp getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Timestamp updateAt) {
		this.updateAt = updateAt;
		
	}

}
