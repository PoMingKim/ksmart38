package com.cafemgt.dto;

public class DetailVolDto {
	private String	detailvolCode;
	private String	storeInfoCode;
	private String 	storeInfoName;
	private String 	conCode;
	private String 	conName;
	private String 	incoCode;
	private String 	articleName;
	private int 	incoCount;
	private int 	articleVolume;
	private String 	articleDan;
	private int 	incoVolumeSubtotal;
	private String 	detailvolGroupCode;
	private int 	detailvolVolumeTotal;
	private int 	detailvolFinalTotal;
	private int 	detailvolConCount;
	private int 	detailvolRemainVolume;
	private int 	detailvolRemainCount;
	private String 	incoDate;
	private String 	detailvolRegDate;
	private String 	detailvolDeadlineCheck;
	private int 	detailvolCheck;
	private String 	detailvolStockGroupCode;
	private String 	detailvolSystemId;
	private String 	detailvolSystemName;
	
	
	public String getDetailvolCode() {
		return detailvolCode;
	}
	public void setDetailvolCode(String detailvolCode) {
		this.detailvolCode = detailvolCode;
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
	public String getConCode() {
		return conCode;
	}
	public void setConCode(String conCode) {
		this.conCode = conCode;
	}
	public String getConName() {
		return conName;
	}
	public void setConName(String conName) {
		this.conName = conName;
	}
	public String getIncoCode() {
		return incoCode;
	}
	public void setIncoCode(String incoCode) {
		this.incoCode = incoCode;
	}
	public String getArticleName() {
		return articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}
	public int getIncoCount() {
		return incoCount;
	}
	public void setIncoCount(int incoCount) {
		this.incoCount = incoCount;
	}
	public int getArticleVolume() {
		return articleVolume;
	}
	public void setArticleVolume(int articleVolume) {
		this.articleVolume = articleVolume;
	}
	public String getArticleDan() {
		return articleDan;
	}
	public void setArticleDan(String articleDan) {
		this.articleDan = articleDan;
	}
	public int getIncoVolumeSubtotal() {
		return incoVolumeSubtotal;
	}
	public void setIncoVolumeSubtotal(int incoVolumeSubtotal) {
		this.incoVolumeSubtotal = incoVolumeSubtotal;
	}
	public String getDetailvolGroupCode() {
		return detailvolGroupCode;
	}
	public void setDetailvolGroupCode(String detailvolGroupCode) {
		this.detailvolGroupCode = detailvolGroupCode;
	}
	public int getDetailvolVolumeTotal() {
		return detailvolVolumeTotal;
	}
	public void setDetailvolVolumeTotal(int detailvolVolumeTotal) {
		this.detailvolVolumeTotal = detailvolVolumeTotal;
	}
	public int getDetailvolFinalTotal() {
		return detailvolFinalTotal;
	}
	public void setDetailvolFinalTotal(int detailvolFinalTotal) {
		this.detailvolFinalTotal = detailvolFinalTotal;
	}
	public int getDetailvolConCount() {
		return detailvolConCount;
	}
	public void setDetailvolConCount(int detailvolConCount) {
		this.detailvolConCount = detailvolConCount;
	}
	public int getDetailvolRemainVolume() {
		return detailvolRemainVolume;
	}
	public void setDetailvolRemainVolume(int detailvolRemainVolume) {
		this.detailvolRemainVolume = detailvolRemainVolume;
	}
	public int getDetailvolRemainCount() {
		return detailvolRemainCount;
	}
	public void setDetailvolRemainCount(int detailvolRemainCount) {
		this.detailvolRemainCount = detailvolRemainCount;
	}
	public String getIncoDate() {
		return incoDate;
	}
	public void setIncoDate(String incoDate) {
		this.incoDate = incoDate;
	}
	public String getDetailvolRegDate() {
		return detailvolRegDate;
	}
	public void setDetailvolRegDate(String detailvolRegDate) {
		this.detailvolRegDate = detailvolRegDate;
	}
	public String getDetailvolDeadlineCheck() {
		return detailvolDeadlineCheck;
	}
	public void setDetailvolDeadlineCheck(String detailvolDeadlineCheck) {
		this.detailvolDeadlineCheck = detailvolDeadlineCheck;
	}
	public int getDetailvolCheck() {
		return detailvolCheck;
	}
	public void setDetailvolCheck(int detailvolCheck) {
		this.detailvolCheck = detailvolCheck;
	}
	public String getDetailvolStockGroupCode() {
		return detailvolStockGroupCode;
	}
	public void setDetailvolStockGroupCode(String detailvolStockGroupCode) {
		this.detailvolStockGroupCode = detailvolStockGroupCode;
	}
	public String getDetailvolSystemId() {
		return detailvolSystemId;
	}
	public void setDetailvolSystemId(String detailvolSystemId) {
		this.detailvolSystemId = detailvolSystemId;
	}
	public String getDetailvolSystemName() {
		return detailvolSystemName;
	}
	public void setDetailvolSystemName(String detailvolSystemName) {
		this.detailvolSystemName = detailvolSystemName;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DetailVolDto [detailvolCode=");
		builder.append(detailvolCode);
		builder.append(", storeInfoCode=");
		builder.append(storeInfoCode);
		builder.append(", storeInfoName=");
		builder.append(storeInfoName);
		builder.append(", conCode=");
		builder.append(conCode);
		builder.append(", conName=");
		builder.append(conName);
		builder.append(", incoCode=");
		builder.append(incoCode);
		builder.append(", articleName=");
		builder.append(articleName);
		builder.append(", incoCount=");
		builder.append(incoCount);
		builder.append(", articleVolume=");
		builder.append(articleVolume);
		builder.append(", articleDan=");
		builder.append(articleDan);
		builder.append(", incoVolumeSubtotal=");
		builder.append(incoVolumeSubtotal);
		builder.append(", detailvolGroupCode=");
		builder.append(detailvolGroupCode);
		builder.append(", detailvolVolumeTotal=");
		builder.append(detailvolVolumeTotal);
		builder.append(", detailvolFinalTotal=");
		builder.append(detailvolFinalTotal);
		builder.append(", detailvolConCount=");
		builder.append(detailvolConCount);
		builder.append(", detailvolRemainVolume=");
		builder.append(detailvolRemainVolume);
		builder.append(", detailvolRemainCount=");
		builder.append(detailvolRemainCount);
		builder.append(", incoDate=");
		builder.append(incoDate);
		builder.append(", detailvolRegDate=");
		builder.append(detailvolRegDate);
		builder.append(", detailvolDeadlineCheck=");
		builder.append(detailvolDeadlineCheck);
		builder.append(", detailvolCheck=");
		builder.append(detailvolCheck);
		builder.append(", detailvolStockGroupCode=");
		builder.append(detailvolStockGroupCode);
		builder.append(", detailvolSystemId=");
		builder.append(detailvolSystemId);
		builder.append(", detailvolSystemName=");
		builder.append(detailvolSystemName);
		builder.append("]");
		return builder.toString();
	}
	
}
