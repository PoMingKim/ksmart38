package com.cafemgt.dto;

public class WtimeDto {
	private String attCode;
	private String storeInfoCode;
	private String storeInfoName;
	private String userId;
	private String userName;
	private String attDate;
	private String attStart;
	private String attEnd;
	private String attTodailyTime;
	private String attRegDate;
	
	
	public String getAttCode() {
		return attCode;
	}
	public void setAttCode(String attCode) {
		this.attCode = attCode;
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
	public String getAttDate() {
		return attDate;
	}
	public void setAttDate(String attDate) {
		this.attDate = attDate;
	}
	public String getAttStart() {
		return attStart;
	}
	public void setAttStart(String attStart) {
		this.attStart = attStart;
	}
	public String getAttEnd() {
		return attEnd;
	}
	public void setAttEnd(String attEnd) {
		this.attEnd = attEnd;
	}
	public String getAttTodailyTime() {
		return attTodailyTime;
	}
	public void setAttTodailyTime(String attTodailyTime) {
		this.attTodailyTime = attTodailyTime;
	}
	public String getAttRegDate() {
		return attRegDate;
	}
	public void setAttRegDate(String attRegDate) {
		this.attRegDate = attRegDate;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attCode == null) ? 0 : attCode.hashCode());
		result = prime * result + ((attDate == null) ? 0 : attDate.hashCode());
		result = prime * result + ((attEnd == null) ? 0 : attEnd.hashCode());
		result = prime * result + ((attRegDate == null) ? 0 : attRegDate.hashCode());
		result = prime * result + ((attStart == null) ? 0 : attStart.hashCode());
		result = prime * result + ((attTodailyTime == null) ? 0 : attTodailyTime.hashCode());
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
		WtimeDto other = (WtimeDto) obj;
		if (attCode == null) {
			if (other.attCode != null)
				return false;
		} else if (!attCode.equals(other.attCode))
			return false;
		if (attDate == null) {
			if (other.attDate != null)
				return false;
		} else if (!attDate.equals(other.attDate))
			return false;
		if (attEnd == null) {
			if (other.attEnd != null)
				return false;
		} else if (!attEnd.equals(other.attEnd))
			return false;
		if (attRegDate == null) {
			if (other.attRegDate != null)
				return false;
		} else if (!attRegDate.equals(other.attRegDate))
			return false;
		if (attStart == null) {
			if (other.attStart != null)
				return false;
		} else if (!attStart.equals(other.attStart))
			return false;
		if (attTodailyTime == null) {
			if (other.attTodailyTime != null)
				return false;
		} else if (!attTodailyTime.equals(other.attTodailyTime))
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
		return "WtimeDto [attCode=" + attCode + ", storeInfoCode=" + storeInfoCode + ", storeInfoName=" + storeInfoName
				+ ", userId=" + userId + ", userName=" + userName + ", attDate=" + attDate + ", attStart=" + attStart
				+ ", attEnd=" + attEnd + ", attTodailyTime=" + attTodailyTime + ", attRegDate=" + attRegDate + "]";
	}
	
	
	
}
	