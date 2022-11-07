package com.jsplec.manager.dto;

public class CManagerOptionListDto {

	int cakeoptionId;
	String cakeoptionCategory;
	String cakeoptionValue;
	String cakeoptionPrice;
	
	
	
	
	
	public String getCakeoptionPrice() {
		return cakeoptionPrice;
	}
	public void setCakeoptionPrice(String cakeoptionPrice) {
		this.cakeoptionPrice = cakeoptionPrice;
	}
	public int getCakeoptionId() {
		return cakeoptionId;
	}
	public void setCakeoptionId(int cakeoptionId) {
		this.cakeoptionId = cakeoptionId;
	}
	public String getCakeoptionCategory() {
		return cakeoptionCategory;
	}
	public void setCakeoptionCategory(String cakeoptionCategory) {
		this.cakeoptionCategory = cakeoptionCategory;
	}
	public String getCakeoptionValue() {
		return cakeoptionValue;
	}
	public void setCakeoptionValue(String cakeoptionValue) {
		this.cakeoptionValue = cakeoptionValue;
	}
	
	
	
	public CManagerOptionListDto(int cakeoptionId, String cakeoptionCategory, String cakeoptionValue, String cakeoptionPrice) {
		super();
		this.cakeoptionId = cakeoptionId;
		this.cakeoptionCategory = cakeoptionCategory;
		this.cakeoptionValue = cakeoptionValue;
		this.cakeoptionPrice = cakeoptionPrice;
	}
	
}
