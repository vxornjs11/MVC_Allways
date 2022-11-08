package com.jsplec.customer.dto;

import java.sql.Date;

public class CCustomerReviewListDto {

	int oreviewId;
	String or_customerId;
	String oreviewContent;
	Date oreviewInitdate;
	String oreviewImage;
	
	public CCustomerReviewListDto() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	public CCustomerReviewListDto(int oreviewId, String or_customerId, String oreviewContent, Date oreviewInitdate) {
		super();
		this.oreviewId = oreviewId;
		this.or_customerId = or_customerId;
		this.oreviewContent = oreviewContent;
		this.oreviewInitdate = oreviewInitdate;
	}




	public CCustomerReviewListDto(int oreviewId, String or_customerId, String oreviewContent, Date oreviewInitdate,
			String oreviewImage) {
		super();
		this.oreviewId = oreviewId;
		this.or_customerId = or_customerId;
		this.oreviewContent = oreviewContent;
		this.oreviewInitdate = oreviewInitdate;
		this.oreviewImage = oreviewImage;
	}




	public int getOreviewId() {
		return oreviewId;
	}

	public void setOreviewId(int oreviewId) {
		this.oreviewId = oreviewId;
	}

	public String getOr_customerId() {
		return or_customerId;
	}

	public void setOr_customerId(String or_customerId) {
		this.or_customerId = or_customerId;
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

	public String getOreviewImage() {
		return oreviewImage;
	}

	public void setOreviewImage(String oreviewImage) {
		this.oreviewImage = oreviewImage;
	}

	



	
	
	
}
