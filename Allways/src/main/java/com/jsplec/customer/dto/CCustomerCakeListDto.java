package com.jsplec.customer.dto;

public class CCustomerCakeListDto {
	
	// Field
	
	String cakeName;
	int cakePrice;
	String cakeImage;
	int cakeLike;
	int cakeViews;
	
	// Constructor
	
	public CCustomerCakeListDto() {
		// TODO Auto-generated constructor stub
	}

	public CCustomerCakeListDto(String cakeName, int cakePrice, String cakeImage, int cakeLike, int cakeViews) {
		super();
		this.cakeName = cakeName;
		this.cakePrice = cakePrice;
		this.cakeImage = cakeImage;
		this.cakeLike = cakeLike;
		this.cakeViews = cakeViews;
	}

	public String getCakeName() {
		return cakeName;
	}

	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
	}

	public int getCakePrice() {
		return cakePrice;
	}

	public void setCakePrice(int cakePrice) {
		this.cakePrice = cakePrice;
	}

	public String getCakeImage() {
		return cakeImage;
	}

	public void setCakeImage(String cakeImage) {
		this.cakeImage = cakeImage;
	}

	public int getCakeLike() {
		return cakeLike;
	}

	public void setCakeLike(int cakeLike) {
		this.cakeLike = cakeLike;
	}

	public int getCakeViews() {
		return cakeViews;
	}

	public void setCakeViews(int cakeViews) {
		this.cakeViews = cakeViews;
	}
	
	

}
