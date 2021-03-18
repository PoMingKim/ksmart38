package com.cafemgt.dto;

public class RecipyDto {
	private String conCode;
	private String storeInfoCode;
	private String storeInfoName;
	private String menuCode;
	private String menuName;
	private String conName;
	private String conVolume;
	private String conDan;
	public String getConCode() {
		return conCode;
	}
	public void setConCode(String conCode) {
		this.conCode = conCode;
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
	public String getMenuCode() {
		return menuCode;
	}
	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getConName() {
		return conName;
	}
	public void setConName(String conName) {
		this.conName = conName;
	}
	public String getConVolume() {
		return conVolume;
	}
	public void setConVolume(String conVolume) {
		this.conVolume = conVolume;
	}
	public String getConDan() {
		return conDan;
	}
	public void setConDan(String conDan) {
		this.conDan = conDan;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RecipyDto [conCode=");
		builder.append(conCode);
		builder.append(", storeInfoCode=");
		builder.append(storeInfoCode);
		builder.append(", storeInfoName=");
		builder.append(storeInfoName);
		builder.append(", menuCode=");
		builder.append(menuCode);
		builder.append(", menuName=");
		builder.append(menuName);
		builder.append(", conName=");
		builder.append(conName);
		builder.append(", conVolume=");
		builder.append(conVolume);
		builder.append(", conDan=");
		builder.append(conDan);
		builder.append(", getConCode()=");
		builder.append(getConCode());
		builder.append(", getStoreInfoCode()=");
		builder.append(getStoreInfoCode());
		builder.append(", getStoreInfoName()=");
		builder.append(getStoreInfoName());
		builder.append(", getMenuCode()=");
		builder.append(getMenuCode());
		builder.append(", getMenuName()=");
		builder.append(getMenuName());
		builder.append(", getConName()=");
		builder.append(getConName());
		builder.append(", getConVolume()=");
		builder.append(getConVolume());
		builder.append(", getConDan()=");
		builder.append(getConDan());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
