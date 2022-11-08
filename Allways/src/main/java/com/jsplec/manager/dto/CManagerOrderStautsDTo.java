package com.jsplec.manager.dto;

public class CManagerOrderStautsDTo {
	int ordersId;
	String ordersStatus;
	String o_customerId;
	int o_cakeId;
	int o_goodsId;
	int ordersSalePrice;
	int ordersQuantity;
	
	
	
	public int getOrdersId() {
		return ordersId;
	}
	public void setOrdersId(int ordersId) {
		this.ordersId = ordersId;
	}
	public String getOrdersStatus() {
		return ordersStatus;
	}
	public void setOrdersStatus(String ordersStatus) {
		this.ordersStatus = ordersStatus;
	}
	public String getO_customerId() {
		return o_customerId;
	}
	public void setO_customerId(String o_customerId) {
		this.o_customerId = o_customerId;
	}
	public int getO_cakeId() {
		return o_cakeId;
	}
	public void setO_cakeId(int o_cakeId) {
		this.o_cakeId = o_cakeId;
	}
	public int getO_goodsId() {
		return o_goodsId;
	}
	public void setO_goodsId(int o_goodsId) {
		this.o_goodsId = o_goodsId;
	}
	public int getOrdersSalePrice() {
		return ordersSalePrice;
	}
	public void setOrdersSalePrice(int ordersSalePrice) {
		this.ordersSalePrice = ordersSalePrice;
	}
	public int getOrdersQuantity() {
		return ordersQuantity;
	}
	public void setOrdersQuantity(int ordersQuantity) {
		this.ordersQuantity = ordersQuantity;
	}
	
	
	public CManagerOrderStautsDTo(int ordersId, String ordersStatus, String o_customerId, int o_cakeId, int o_goodsId,
			int ordersSalePrice, int ordersQuantity) {
		super();
		this.ordersId = ordersId;
		this.ordersStatus = ordersStatus;
		this.o_customerId = o_customerId;
		this.o_cakeId = o_cakeId;
		this.o_goodsId = o_goodsId;
		this.ordersSalePrice = ordersSalePrice;
		this.ordersQuantity = ordersQuantity;
	}
	
	
	
	
	

}
