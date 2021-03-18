package com.cafemgt.dto;

public class DsalaryDto {
	private String sdCode;
	private String storeInfoCode;
	private String storeInfoName;
	private String userId;
	private String userName;
	private String sdYearMonth;
	private String sdWorktime;
	private int sdPay;
	private String intaxCode;
	private int intaxMin;
	private int intaxMax;
	private int intaxWork;
	private int intaxLocal;
	private int sdDeduction;
	private int sdReceipts;
	private String sdPayDate;
	private String sdRegDate;
	
	
	public String getSdCode() {
		return sdCode;
	}
	public void setSdCode(String sdCode) {
		this.sdCode = sdCode;
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
	public String getSdYearMonth() {
		return sdYearMonth;
	}
	public void setSdYearMonth(String sdYearMonth) {
		this.sdYearMonth = sdYearMonth;
	}
	public String getSdWorktime() {
		return sdWorktime;
	}
	public void setSdWorktime(String sdWorktime) {
		this.sdWorktime = sdWorktime;
	}
	public int getSdPay() {
		return sdPay;
	}
	public void setSdPay(int sdPay) {
		this.sdPay = sdPay;
	}
	public String getIntaxCode() {
		return intaxCode;
	}
	public void setIntaxCode(String intaxCode) {
		this.intaxCode = intaxCode;
	}
	public int getIntaxMin() {
		return intaxMin;
	}
	public void setIntaxMin(int intaxMin) {
		this.intaxMin = intaxMin;
	}
	public int getIntaxMax() {
		return intaxMax;
	}
	public void setIntaxMax(int intaxMax) {
		this.intaxMax = intaxMax;
	}
	public int getIntaxWork() {
		return intaxWork;
	}
	public void setIntaxWork(int intaxWork) {
		this.intaxWork = intaxWork;
	}
	public int getIntaxLocal() {
		return intaxLocal;
	}
	public void setIntaxLocal(int intaxLocal) {
		this.intaxLocal = intaxLocal;
	}
	public int getSdDeduction() {
		return sdDeduction;
	}
	public void setSdDeduction(int sdDeduction) {
		this.sdDeduction = sdDeduction;
	}
	public int getSdReceipts() {
		return sdReceipts;
	}
	public void setSdReceipts(int sdReceipts) {
		this.sdReceipts = sdReceipts;
	}
	public String getSdPayDate() {
		return sdPayDate;
	}
	public void setSdPayDate(String sdPayDate) {
		this.sdPayDate = sdPayDate;
	}
	public String getSdRegDate() {
		return sdRegDate;
	}
	public void setSdRegDate(String sdRegDate) {
		this.sdRegDate = sdRegDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((intaxCode == null) ? 0 : intaxCode.hashCode());
		result = prime * result + intaxLocal;
		result = prime * result + intaxMax;
		result = prime * result + intaxMin;
		result = prime * result + intaxWork;
		result = prime * result + ((sdCode == null) ? 0 : sdCode.hashCode());
		result = prime * result + sdDeduction;
		result = prime * result + sdPay;
		result = prime * result + ((sdPayDate == null) ? 0 : sdPayDate.hashCode());
		result = prime * result + sdReceipts;
		result = prime * result + ((sdRegDate == null) ? 0 : sdRegDate.hashCode());
		result = prime * result + ((sdWorktime == null) ? 0 : sdWorktime.hashCode());
		result = prime * result + ((sdYearMonth == null) ? 0 : sdYearMonth.hashCode());
		result = prime * result + ((storeInfoCode == null) ? 0 : storeInfoCode.hashCode());
		result = prime * result + ((storeInfoName == null) ? 0 : storeInfoName.hashCode());
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
		DsalaryDto other = (DsalaryDto) obj;
		if (intaxCode == null) {
			if (other.intaxCode != null)
				return false;
		} else if (!intaxCode.equals(other.intaxCode))
			return false;
		if (intaxLocal != other.intaxLocal)
			return false;
		if (intaxMax != other.intaxMax)
			return false;
		if (intaxMin != other.intaxMin)
			return false;
		if (intaxWork != other.intaxWork)
			return false;
		if (sdCode == null) {
			if (other.sdCode != null)
				return false;
		} else if (!sdCode.equals(other.sdCode))
			return false;
		if (sdDeduction != other.sdDeduction)
			return false;
		if (sdPay != other.sdPay)
			return false;
		if (sdPayDate == null) {
			if (other.sdPayDate != null)
				return false;
		} else if (!sdPayDate.equals(other.sdPayDate))
			return false;
		if (sdReceipts != other.sdReceipts)
			return false;
		if (sdRegDate == null) {
			if (other.sdRegDate != null)
				return false;
		} else if (!sdRegDate.equals(other.sdRegDate))
			return false;
		if (sdWorktime == null) {
			if (other.sdWorktime != null)
				return false;
		} else if (!sdWorktime.equals(other.sdWorktime))
			return false;
		if (sdYearMonth == null) {
			if (other.sdYearMonth != null)
				return false;
		} else if (!sdYearMonth.equals(other.sdYearMonth))
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
		return "DsalaryDto [sdCode=" + sdCode + ", storeInfoCode=" + storeInfoCode + ", storeInfoName=" + storeInfoName
				+ ", userId=" + userId + ", userName=" + userName + ", sdYearMonth=" + sdYearMonth + ", sdWorktime="
				+ sdWorktime + ", sdPay=" + sdPay + ", intaxCode=" + intaxCode + ", intaxMin=" + intaxMin
				+ ", intaxMax=" + intaxMax + ", intaxWork=" + intaxWork + ", intaxLocal=" + intaxLocal
				+ ", sdDeduction=" + sdDeduction + ", sdReceipts=" + sdReceipts + ", sdPayDate=" + sdPayDate
				+ ", sdRegDate=" + sdRegDate + "]";
	}


}
