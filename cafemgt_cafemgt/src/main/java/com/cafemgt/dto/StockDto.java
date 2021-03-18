package com.cafemgt.dto;

public class StockDto {
	private String stockCode;
	private String storeInfoCode;
	private String storeInfoName;
	private String articleCode;
	private String articleName;
	private String stockGroupCode;	
	private String articleVolume;	
	private String articleDan;	
	private int incoCount;	
	private int incoVolumeSubtotal;	
	private int stockIncoUnitTotal;
	private int stockMinUnit;
	private int stockConCount;
	private int stocklVolumeTotal;
	private int stockNowCount;
	private int stockNowVolume;
	private String stockRegDate;
	private String stockGroupCode2;
	private String stockRelation;
	
	
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getStoreInfoCode() {
		return storeInfoCode;
	}
	public void setStoreInfoCode(String storeInfoCode) {
		this.storeInfoCode = storeInfoCode;
	}
	public String getStoreInfoName() {
		return storeInfoName;
	}
	public void setStoreInfoName(String storeInfoName) {
		this.storeInfoName = storeInfoName;
	}
	public String getArticleCode() {
		return articleCode;
	}
	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}
	public String getArticleName() {
		return articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}
	public String getStockGroupCode() {
		return stockGroupCode;
	}
	public void setStockGroupCode(String stockGroupCode) {
		this.stockGroupCode = stockGroupCode;
	}
	public String getArticleVolume() {
		return articleVolume;
	}
	public void setArticleVolume(String articleVolume) {
		this.articleVolume = articleVolume;
	}
	public String getArticleDan() {
		return articleDan;
	}
	public void setArticleDan(String articleDan) {
		this.articleDan = articleDan;
	}
	public int getIncoCount() {
		return incoCount;
	}
	public void setIncoCount(int incoCount) {
		this.incoCount = incoCount;
	}
	public int getIncoVolumeSubtotal() {
		return incoVolumeSubtotal;
	}
	public void setIncoVolumeSubtotal(int incoVolumeSubtotal) {
		this.incoVolumeSubtotal = incoVolumeSubtotal;
	}
	public int getStockIncoUnitTotal() {
		return stockIncoUnitTotal;
	}
	public void setStockIncoUnitTotal(int stockIncoUnitTotal) {
		this.stockIncoUnitTotal = stockIncoUnitTotal;
	}
	public int getStockMinUnit() {
		return stockMinUnit;
	}
	public void setStockMinUnit(int stockMinUnit) {
		this.stockMinUnit = stockMinUnit;
	}
	public int getStockConCount() {
		return stockConCount;
	}
	public void setStockConCount(int stockConCount) {
		this.stockConCount = stockConCount;
	}
	public int getStocklVolumeTotal() {
		return stocklVolumeTotal;
	}
	public void setStocklVolumeTotal(int stocklVolumeTotal) {
		this.stocklVolumeTotal = stocklVolumeTotal;
	}
	public int getStockNowCount() {
		return stockNowCount;
	}
	public void setStockNowCount(int stockNowCount) {
		this.stockNowCount = stockNowCount;
	}
	public int getStockNowVolume() {
		return stockNowVolume;
	}
	public void setStockNowVolume(int stockNowVolume) {
		this.stockNowVolume = stockNowVolume;
	}
	public String getStockRegDate() {
		return stockRegDate;
	}
	public void setStockRegDate(String stockRegDate) {
		this.stockRegDate = stockRegDate;
	}
	public String getStockGroupCode2() {
		return stockGroupCode2;
	}
	public void setStockGroupCode2(String stockGroupCode2) {
		this.stockGroupCode2 = stockGroupCode2;
	}
	public String getStockRelation() {
		return stockRelation;
	}
	public void setStockRelation(String stockRelation) {
		this.stockRelation = stockRelation;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StockDto [stockCode=");
		builder.append(stockCode);
		builder.append(", storeInfoCode=");
		builder.append(storeInfoCode);
		builder.append(", storeInfoName=");
		builder.append(storeInfoName);
		builder.append(", articleCode=");
		builder.append(articleCode);
		builder.append(", articleName=");
		builder.append(articleName);
		builder.append(", stockGroupCode=");
		builder.append(stockGroupCode);
		builder.append(", articleVolume=");
		builder.append(articleVolume);
		builder.append(", articleDan=");
		builder.append(articleDan);
		builder.append(", incoCount=");
		builder.append(incoCount);
		builder.append(", incoVolumeSubtotal=");
		builder.append(incoVolumeSubtotal);
		builder.append(", stockIncoUnitTotal=");
		builder.append(stockIncoUnitTotal);
		builder.append(", stockMinUnit=");
		builder.append(stockMinUnit);
		builder.append(", stockConCount=");
		builder.append(stockConCount);
		builder.append(", stocklVolumeTotal=");
		builder.append(stocklVolumeTotal);
		builder.append(", stockNowCount=");
		builder.append(stockNowCount);
		builder.append(", stockNowVolume=");
		builder.append(stockNowVolume);
		builder.append(", stockRegDate=");
		builder.append(stockRegDate);
		builder.append(", stockGroupCode2=");
		builder.append(stockGroupCode2);
		builder.append(", stockRelation=");
		builder.append(stockRelation);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
