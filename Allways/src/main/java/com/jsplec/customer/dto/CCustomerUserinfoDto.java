package com.jsplec.customer.dto;

import java.sql.Date;
import java.sql.Timestamp;

public class CCustomerUserinfoDto {

	// F
	String customerId;
	String customerPw;
	String customerName;
	String customerGender;
	String customerPhone;
	String customerEmail;
	Date customerBirthday;
	int customerPostcode;
	String customerAddress;
	String customerAddressDetail;
	Timestamp customerInitdate;
	Timestamp customerUpdatedate;
	Timestamp customerDeletedate;
	
	// C
	public CCustomerUserinfoDto() {
		// TODO Auto-generated constructor stub
	}

	// M
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerPw() {
		return customerPw;
	}

	public void setCustomerPw(String customerPw) {
		this.customerPw = customerPw;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public Date getCustomerBirthday() {
		return customerBirthday;
	}

	public void setCustomerBirthday(Date customerBirthday) {
		this.customerBirthday = customerBirthday;
	}

	public int getCustomerPostcode() {
		return customerPostcode;
	}

	public void setCustomerPostcode(int customerPostcode) {
		this.customerPostcode = customerPostcode;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerAddressDetail() {
		return customerAddressDetail;
	}

	public void setCustomerAddressDetail(String customerAddressDetail) {
		this.customerAddressDetail = customerAddressDetail;
	}

	public Timestamp getCustomerInitdate() {
		return customerInitdate;
	}

	public void setCustomerInitdate(Timestamp customerInitdate) {
		this.customerInitdate = customerInitdate;
	}

	public Timestamp getCustomerUpdatedate() {
		return customerUpdatedate;
	}

	public void setCustomerUpdatedate(Timestamp customerUpdatedate) {
		this.customerUpdatedate = customerUpdatedate;
	}

	public Timestamp getCustomerDeletedate() {
		return customerDeletedate;
	}

	public void setCustomerDeletedate(Timestamp customerDeletedate) {
		this.customerDeletedate = customerDeletedate;
	}
	
	
	
	
	
}// End
