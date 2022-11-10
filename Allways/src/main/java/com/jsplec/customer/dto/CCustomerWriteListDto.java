package com.jsplec.customer.dto;

import java.sql.Date;

public class CCustomerWriteListDto {

	int rowNum;
	String writeTitle;
	String writeContent;
	String w_customerId;
	Date writeInitdate;
	int recommentId;
	
	public CCustomerWriteListDto() {
		// TODO Auto-generated constructor stub
	}

	public CCustomerWriteListDto(int rowNum, String writeTitle, String writeContent, String w_customerId, Date writeInitdate,
			int recommentId) {
		super();
		this.rowNum = rowNum;
		this.writeTitle = writeTitle;
		this.writeContent = writeContent;
		this.w_customerId = w_customerId;
		this.writeInitdate = writeInitdate;
		this.recommentId = recommentId;
	}

	public int getRowNum() {
		return rowNum;
	}

	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}

	public String getWriteTitle() {
		return writeTitle;
	}

	public void setWriteTitle(String writeTitle) {
		this.writeTitle = writeTitle;
	}

	public String getW_customerId() {
		return w_customerId;
	}

	public void setW_customerId(String w_customerId) {
		this.w_customerId = w_customerId;
	}

	public Date getWriteInitdate() {
		return writeInitdate;
	}

	public void setWriteInitdate(Date writeInitdate) {
		this.writeInitdate = writeInitdate;
	}

	public String getWriteContent() {
		return writeContent;
	}

	public void setWriteContent(String writeContent) {
		this.writeContent = writeContent;
	}

	public int getRecommentId() {
		return recommentId;
	}

	public void setRecommentId(int recommentId) {
		this.recommentId = recommentId;
	}
	
	
	
}
