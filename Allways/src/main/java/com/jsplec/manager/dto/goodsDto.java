package com.jsplec.manager.dto;

public class goodsDto {
	
	int goodsId;
	String goodsName;
	String goodsCategory;
	int goodPrice;
	String goodsImage;
	String goodsDetail;
	
	public goodsDto(int goodsId, String goodsName, String goodsCategory, int goodPrice, String goodsImage, String goodsDetail) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsCategory=goodsCategory;
		this.goodPrice = goodPrice;
		this.goodsImage = goodsImage;
		this.goodsDetail = goodsDetail;
	}
	
	public goodsDto(int goodsId, String goodsName, String goodsCategory, int goodPrice) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsCategory = goodsCategory;
		this.goodPrice = goodPrice;
	}

	public String getGoodsCategory() {
		return goodsCategory;
	}

	public void setGoodsCategory(String goodCategory) {
		this.goodsCategory = goodCategory;
	}

	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getGoodPrice() {
		return goodPrice;
	}
	public void setGoodPrice(int goodPrice) {
		this.goodPrice = goodPrice;
	}
	public String getGoodsImage() {
		return goodsImage;
	}
	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}
	public String getGoodsDetail() {
		return goodsDetail;
	}
	public void setGoodsDetail(String goodsDetail) {
		this.goodsDetail = goodsDetail;
	}
	
	
}
