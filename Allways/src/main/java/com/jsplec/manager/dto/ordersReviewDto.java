package com.jsplec.manager.dto;

import java.sql.Timestamp;

public class ordersReviewDto {

	int oreviewId;
	String or_customerId;
	String or_customerName;
	String or_cakeName;
	String or_goodsName;
	String oreviewContent;
	int oreviewStarrating;
	
	Timestamp oreviewInitdate;
	Timestamp oreviewUpadatedate;
	
	
	public ordersReviewDto(String or_customerId, int oreviewStarrating, Timestamp oreviewInitdate) {
		super();
		this.or_customerId = or_customerId;
		this.oreviewStarrating = oreviewStarrating;
		this.oreviewInitdate = oreviewInitdate;
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
	public String getOr_customerName() {
		return or_customerName;
	}
	public void setOr_customerName(String or_customerName) {
		this.or_customerName = or_customerName;
	}
	public String getOr_cakeName() {
		return or_cakeName;
	}
	public void setOr_cakeName(String or_cakeName) {
		this.or_cakeName = or_cakeName;
	}
	public String getOreviewContent() {
		return oreviewContent;
	}
	public void setOreviewContent(String oreviewContent) {
		this.oreviewContent = oreviewContent;
	}
	public int getOreviewStarrating() {
		return oreviewStarrating;
	}
	public void setOreviewStarrating(int oreviewStarrating) {
		this.oreviewStarrating = oreviewStarrating;
	}
	public Timestamp getOreviewInitdate() {
		return oreviewInitdate;
	}
	public void setOreviewInitdate(Timestamp oreviewInitdate) {
		this.oreviewInitdate = oreviewInitdate;
	}
	public Timestamp getOreviewUpadatedate() {
		return oreviewUpadatedate;
	}
	public void setOreviewUpadatedate(Timestamp oreviewUpadatedate) {
		this.oreviewUpadatedate = oreviewUpadatedate;
	}
	
	
}
