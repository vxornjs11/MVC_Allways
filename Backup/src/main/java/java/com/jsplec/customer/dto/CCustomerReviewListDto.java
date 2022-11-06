package com.jsplec.customer.dto;

import java.sql.Date;

public class CCustomerReviewListDto {

	int oreviewId;
	String d_customerId;
	String oreviewContent;
	Date oreviewInitdate;
	
	public CCustomerReviewListDto() {
		// TODO Auto-generated constructor stub
	}

	
	
	public CCustomerReviewListDto(int oreviewId, String d_customerId, String oreviewContent, Date oreviewInitdate) {
		super();
		this.oreviewId = oreviewId;
		this.d_customerId = d_customerId;
		this.oreviewContent = oreviewContent;
		this.oreviewInitdate = oreviewInitdate;
	}



	public int getOreviewId() {
		return oreviewId;
	}

	public void setOreviewId(int oreviewId) {
		this.oreviewId = oreviewId;
	}

	public String getD_customerId() {
		return d_customerId;
	}

	public void setD_customerId(String d_customerId) {
		this.d_customerId = d_customerId;
	}

	public String getOreviewContent() {
		return oreviewContent;
	}

	public void setOreviewContent(String oreviewContent) {
		this.oreviewContent = oreviewContent;
	}

	public Date getOreviewInitdate() {
		return oreviewInitdate;
	}

	public void setOreviewInitdate(Date oreviewInitdate) {
		this.oreviewInitdate = oreviewInitdate;
	}
	
	
	
}
