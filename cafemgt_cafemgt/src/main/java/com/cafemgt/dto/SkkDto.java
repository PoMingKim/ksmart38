package com.cafemgt.dto;

public class SkkDto {
	private String  skCode;
	private String  storeInfoCode;
	private String  storeInfoName;
	private String  articleCode;
	private String  articleName;
	private String  stockCode;
	private int 	stockNowVolume;
	private int 	skProbeVolume;
	private int 	skErrorVolume;
	private String  stockMinUnit;
	private String  skErrorPriceTotal;
	private String  skEtc;
	private String  skDate;
	private String  skRegDate;
	private String  skSystemId;
	private String  skSystemName;
	
	public String getSkCode() {
		return skCode;
	}
	public void setSkCode(String skCode) {
		this.skCode = skCode;
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
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public int getStockNowVolume() {
		return stockNowVolume;
	}
	public void setStockNowVolume(int stockNowVolume) {
		this.stockNowVolume = stockNowVolume;
	}
	public int getSkProbeVolume() {
		return skProbeVolume;
	}
	public void setSkProbeVolume(int skProbeVolume) {
		this.skProbeVolume = skProbeVolume;
	}
	public int getSkErrorVolume() {
		return skErrorVolume;
	}
	public void setSkErrorVolume(int skErrorVolume) {
		this.skErrorVolume = skErrorVolume;
	}
	public String getStockMinUnit() {
		return stockMinUnit;
	}
	public void setStockMinUnit(String stockMinUnit) {
		this.stockMinUnit = stockMinUnit;
	}
	public String getSkErrorPriceTotal() {
		return skErrorPriceTotal;
	}
	public void setSkErrorPriceTotal(String skErrorPriceTotal) {
		this.skErrorPriceTotal = skErrorPriceTotal;
	}
	public String getSkEtc() {
		return skEtc;
	}
	public void setSkEtc(String skEtc) {
		this.skEtc = skEtc;
	}
	public String getSkDate() {
		return skDate;
	}
	public void setSkDate(String skDate) {
		this.skDate = skDate;
	}
	public String getSkRegDate() {
		return skRegDate;
	}
	public void setSkRegDate(String skRegDate) {
		this.skRegDate = skRegDate;
	}
	public String getSkSystemId() {
		return skSystemId;
	}
	public void setSkSystemId(String skSystemId) {
		this.skSystemId = skSystemId;
	}
	public String getSkSystemName() {
		return skSystemName;
	}
	public void setSkSystemName(String skSystemName) {
		this.skSystemName = skSystemName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SkkDto [skCode=");
		builder.append(skCode);
		builder.append(", storeInfoCode=");
		builder.append(storeInfoCode);
		builder.append(", storeInfoName=");
		builder.append(storeInfoName);
		builder.append(", articleCode=");
		builder.append(articleCode);
		builder.append(", articleName=");
		builder.append(articleName);
		builder.append(", stockCode=");
		builder.append(stockCode);
		builder.append(", stockNowVolume=");
		builder.append(stockNowVolume);
		builder.append(", skProbeVolume=");
		builder.append(skProbeVolume);
		builder.append(", skErrorVolume=");
		builder.append(skErrorVolume);
		builder.append(", stockMinUnit=");
		builder.append(stockMinUnit);
		builder.append(", skErrorPriceTotal=");
		builder.append(skErrorPriceTotal);
		builder.append(", skEtc=");
		builder.append(skEtc);
		builder.append(", skDate=");
		builder.append(skDate);
		builder.append(", skRegDate=");
		builder.append(skRegDate);
		builder.append(", skSystemId=");
		builder.append(skSystemId);
		builder.append(", skSystemName=");
		builder.append(skSystemName);
		builder.append("]");
		return builder.toString();
	}
	
}
