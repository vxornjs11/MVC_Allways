package com.jsplec.customer.dto;

public class CCustomerCartListDto {
	
	int ordersId;
	String cakeName;
	int ordersSalePrice;
	int ordersQuantity;

	public CCustomerCartListDto() {
		// TODO Auto-generated constructor stub
	}

	public CCustomerCartListDto(int ordersId, String cakeName, int ordersSalePrice, int ordersQuantity) {
		super();
		this.ordersId = ordersId;
		this.cakeName = cakeName;
		this.ordersSalePrice = ordersSalePrice;
		this.ordersQuantity = ordersQuantity;
	}

	public int getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(int ordersId) {
		this.ordersId = ordersId;
	}

	public String getCakeName() {
		return cakeName;
	}

	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
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


}
