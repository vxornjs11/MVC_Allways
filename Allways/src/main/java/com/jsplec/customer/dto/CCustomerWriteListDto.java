package com.jsplec.customer.dto;

import java.sql.Date;

public class CCustomerWriteListDto {

	int rowNum;
	String writeTitle;
	String writeContent;
	String w_customerId;
	String customerName;
	Date writeInitdate;
	int distinguish;
	int writeId;
	
	
	public CCustomerWriteListDto() {
		// TODO Auto-generated constructor stub
	}

	public CCustomerWriteListDto(int rowNum, String writeTitle, String writeContent, String w_customerId, Date writeInitdate,
			int distinguish, int writeId) {
		super();
		this.rowNum = rowNum;
		this.writeTitle = writeTitle;
		this.writeContent = writeContent;
		this.w_customerId = w_customerId;
		this.writeInitdate = writeInitdate;
		this.distinguish = distinguish;
		this.writeId = writeId;
	}
	

	public CCustomerWriteListDto(int writeId, String customerName, String writeTitle, String writeContent,
			Date writeInitdate) {
		super();
		this.writeId = writeId;
		this.customerName = customerName;
		this.writeTitle = writeTitle;
		this.writeContent = writeContent;
		this.writeInitdate = writeInitdate;
	}

	
	
	public CCustomerWriteListDto(String customerName, String writeContent, Date writeInitdate, String w_customerId) {
		super();
		this.customerName = customerName;
		this.writeContent = writeContent;
		this.writeInitdate = writeInitdate;
		this.w_customerId = w_customerId;
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

	public int getWriteId() {
		return writeId;
	}

	public void setWriteId(int writeId) {
		this.writeId = writeId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getDistinguish() {
		return distinguish;
	}

	public void setDistinguish(int distinguish) {
		this.distinguish = distinguish;
	}
	
	
	
}
