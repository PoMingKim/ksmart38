package com.cafemgt.dto;

public class BonusDto {
	private String ubCode;
	private String storeInfoCode;
	private String storeInfoName;
	private String userId;
	private String userName;
	private String ubYearMonth;
	private String btaxCode;
	private String btaxOption;
	private String btaxCate;
	private int ubPay;
	private String ubEtc;
	private String ubRegDate;
	
	
	public String getUbCode() {
		return ubCode;
	}
	public void setUbCode(String ubCode) {
		this.ubCode = ubCode;
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUbYearMonth() {
		return ubYearMonth;
	}
	public void setUbYearMonth(String ubYearMonth) {
		this.ubYearMonth = ubYearMonth;
	}
	public String getBtaxCode() {
		return btaxCode;
	}
	public void setBtaxCode(String btaxCode) {
		this.btaxCode = btaxCode;
	}
	public String getBtaxOption() {
		return btaxOption;
	}
	public void setBtaxOption(String btaxOption) {
		this.btaxOption = btaxOption;
	}
	public String getBtaxCate() {
		return btaxCate;
	}
	public void setBtaxCate(String btaxCate) {
		this.btaxCate = btaxCate;
	}
	public int getUbPay() {
		return ubPay;
	}
	public void setUbPay(int ubPay) {
		this.ubPay = ubPay;
	}
	public String getUbEtc() {
		return ubEtc;
	}
	public void setUbEtc(String ubEtc) {
		this.ubEtc = ubEtc;
	}
	public String getUbRegDate() {
		return ubRegDate;
	}
	public void setUbRegDate(String ubRegDate) {
		this.ubRegDate = ubRegDate;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((btaxCate == null) ? 0 : btaxCate.hashCode());
		result = prime * result + ((btaxCode == null) ? 0 : btaxCode.hashCode());
		result = prime * result + ((btaxOption == null) ? 0 : btaxOption.hashCode());
		result = prime * result + ((storeInfoCode == null) ? 0 : storeInfoCode.hashCode());
		result = prime * result + ((storeInfoName == null) ? 0 : storeInfoName.hashCode());
		result = prime * result + ((ubCode == null) ? 0 : ubCode.hashCode());
		result = prime * result + ((ubEtc == null) ? 0 : ubEtc.hashCode());
		result = prime * result + ubPay;
		result = prime * result + ((ubRegDate == null) ? 0 : ubRegDate.hashCode());
		result = prime * result + ((ubYearMonth == null) ? 0 : ubYearMonth.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BonusDto other = (BonusDto) obj;
		if (btaxCate == null) {
			if (other.btaxCate != null)
				return false;
		} else if (!btaxCate.equals(other.btaxCate))
			return false;
		if (btaxCode == null) {
			if (other.btaxCode != null)
				return false;
		} else if (!btaxCode.equals(other.btaxCode))
			return false;
		if (btaxOption == null) {
			if (other.btaxOption != null)
				return false;
		} else if (!btaxOption.equals(other.btaxOption))
			return false;
		if (storeInfoCode == null) {
			if (other.storeInfoCode != null)
				return false;
		} else if (!storeInfoCode.equals(other.storeInfoCode))
			return false;
		if (storeInfoName == null) {
			if (other.storeInfoName != null)
				return false;
		} else if (!storeInfoName.equals(other.storeInfoName))
			return false;
		if (ubCode == null) {
			if (other.ubCode != null)
				return false;
		} else if (!ubCode.equals(other.ubCode))
			return false;
		if (ubEtc == null) {
			if (other.ubEtc != null)
				return false;
		} else if (!ubEtc.equals(other.ubEtc))
			return false;
		if (ubPay != other.ubPay)
			return false;
		if (ubRegDate == null) {
			if (other.ubRegDate != null)
				return false;
		} else if (!ubRegDate.equals(other.ubRegDate))
			return false;
		if (ubYearMonth == null) {
			if (other.ubYearMonth != null)
				return false;
		} else if (!ubYearMonth.equals(other.ubYearMonth))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "BonusDto [ubCode=" + ubCode + ", storeInfoCode=" + storeInfoCode + ", storeInfoName=" + storeInfoName
				+ ", userId=" + userId + ", userName=" + userName + ", ubYearMonth=" + ubYearMonth + ", btaxCode="
				+ btaxCode + ", btaxOption=" + btaxOption + ", btaxCate=" + btaxCate + ", ubPay=" + ubPay + ", ubEtc="
				+ ubEtc + ", ubRegDate=" + ubRegDate + "]";
	}

	
}
