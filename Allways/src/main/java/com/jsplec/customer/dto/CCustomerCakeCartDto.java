package com.jsplec.customer.dto;

public class CCustomerCakeCartDto {

	int d_cakeoptionId;
	int d_ordersId;
	String d_ordersStatus;
	String d_customerId;
	int d_cakeId;
	int d_goodsId;
	String detailoptionLettering;

	public CCustomerCakeCartDto() {
		// TODO Auto-generated constructor stub
	}

	public CCustomerCakeCartDto(int d_cakeoptionId, int d_ordersId, String d_ordersStatus, String d_customerId,
			int d_cakeId, int d_goodsId, String detailoptionLettering) {
		super();
		this.d_cakeoptionId = d_cakeoptionId;
		this.d_ordersId = d_ordersId;
		this.d_ordersStatus = d_ordersStatus;
		this.d_customerId = d_customerId;
		this.d_cakeId = d_cakeId;
		this.d_goodsId = d_goodsId;
		this.detailoptionLettering = detailoptionLettering;
	}

	public int getD_cakeoptionId() {
		return d_cakeoptionId;
	}

	public void setD_cakeoptionId(int d_cakeoptionId) {
		this.d_cakeoptionId = d_cakeoptionId;
	}

	public int getD_ordersId() {
		return d_ordersId;
	}

	public void setD_ordersId(int d_ordersId) {
		this.d_ordersId = d_ordersId;
	}

	public String getD_ordersStatus() {
		return d_ordersStatus;
	}

	public void setD_ordersStatus(String d_ordersStatus) {
		this.d_ordersStatus = d_ordersStatus;
	}

	public String getD_customerId() {
		return d_customerId;
	}

	public void setD_customerId(String d_customerId) {
		this.d_customerId = d_customerId;
	}

	public int getD_cakeId() {
		return d_cakeId;
	}

	public void setD_cakeId(int d_cakeId) {
		this.d_cakeId = d_cakeId;
	}

	public int getD_goodsId() {
		return d_goodsId;
	}

	public void setD_goodsId(int d_goodsId) {
		this.d_goodsId = d_goodsId;
	}

	public String getDetailoptionLettering() {
		return detailoptionLettering;
	}

	public void setDetailoptionLettering(String detailoptionLettering) {
		this.detailoptionLettering = detailoptionLettering;
	}

}