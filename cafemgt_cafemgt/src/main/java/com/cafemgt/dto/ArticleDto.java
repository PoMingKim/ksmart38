package com.cafemgt.dto;

public class ArticleDto {

	private String articleCode;
	private String storeInfoCode;
	private String storeInfoName;
	private String articleName;
	private String articleTaxCate;
	private String artcleBig;
	private String artcleBigDan;
	private String artcleMiddle;
	private String artcleMiddleDan;
	private String articleVolume;
	private String articleDan;
	private String articleEtc;
	private String articleRegDate;
	
	public String getArticleCode() {
		return articleCode;
	}

	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
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

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public String getArticleTaxCate() {
		return articleTaxCate;
	}

	public void setArticleTaxCate(String articleTaxCate) {
		this.articleTaxCate = articleTaxCate;
	}

	public String getArtcleBig() {
		return artcleBig;
	}

	public void setArtcleBig(String artcleBig) {
		this.artcleBig = artcleBig;
	}

	public String getArtcleBigDan() {
		return artcleBigDan;
	}

	public void setArtcleBigDan(String artcleBigDan) {
		this.artcleBigDan = artcleBigDan;
	}

	public String getArtcleMiddle() {
		return artcleMiddle;
	}

	public void setArtcleMiddle(String artcleMiddle) {
		this.artcleMiddle = artcleMiddle;
	}

	public String getArtcleMiddleDan() {
		return artcleMiddleDan;
	}

	public void setArtcleMiddleDan(String artcleMiddleDan) {
		this.artcleMiddleDan = artcleMiddleDan;
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

	public String getArticleEtc() {
		return articleEtc;
	}

	public void setArticleEtc(String articleEtc) {
		this.articleEtc = articleEtc;
	}

	public String getArticleRegDate() {
		return articleRegDate;
	}

	public void setArticleRegDate(String articleRegDate) {
		this.articleRegDate = articleRegDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artcleBig == null) ? 0 : artcleBig.hashCode());
		result = prime * result + ((artcleBigDan == null) ? 0 : artcleBigDan.hashCode());
		result = prime * result + ((artcleMiddle == null) ? 0 : artcleMiddle.hashCode());
		result = prime * result + ((artcleMiddleDan == null) ? 0 : artcleMiddleDan.hashCode());
		result = prime * result + ((articleCode == null) ? 0 : articleCode.hashCode());
		result = prime * result + ((articleDan == null) ? 0 : articleDan.hashCode());
		result = prime * result + ((articleEtc == null) ? 0 : articleEtc.hashCode());
		result = prime * result + ((articleName == null) ? 0 : articleName.hashCode());
		result = prime * result + ((articleRegDate == null) ? 0 : articleRegDate.hashCode());
		result = prime * result + ((articleTaxCate == null) ? 0 : articleTaxCate.hashCode());
		result = prime * result + ((articleVolume == null) ? 0 : articleVolume.hashCode());
		result = prime * result + ((storeInfoCode == null) ? 0 : storeInfoCode.hashCode());
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
		ArticleDto other = (ArticleDto) obj;
		if (artcleBig == null) {
			if (other.artcleBig != null)
				return false;
		} else if (!artcleBig.equals(other.artcleBig))
			return false;
		if (artcleBigDan == null) {
			if (other.artcleBigDan != null)
				return false;
		} else if (!artcleBigDan.equals(other.artcleBigDan))
			return false;
		if (artcleMiddle == null) {
			if (other.artcleMiddle != null)
				return false;
		} else if (!artcleMiddle.equals(other.artcleMiddle))
			return false;
		if (artcleMiddleDan == null) {
			if (other.artcleMiddleDan != null)
				return false;
		} else if (!artcleMiddleDan.equals(other.artcleMiddleDan))
			return false;
		if (articleCode == null) {
			if (other.articleCode != null)
				return false;
		} else if (!articleCode.equals(other.articleCode))
			return false;
		if (articleDan == null) {
			if (other.articleDan != null)
				return false;
		} else if (!articleDan.equals(other.articleDan))
			return false;
		if (articleEtc == null) {
			if (other.articleEtc != null)
				return false;
		} else if (!articleEtc.equals(other.articleEtc))
			return false;
		if (articleName == null) {
			if (other.articleName != null)
				return false;
		} else if (!articleName.equals(other.articleName))
			return false;
		if (articleRegDate == null) {
			if (other.articleRegDate != null)
				return false;
		} else if (!articleRegDate.equals(other.articleRegDate))
			return false;
		if (articleTaxCate == null) {
			if (other.articleTaxCate != null)
				return false;
		} else if (!articleTaxCate.equals(other.articleTaxCate))
			return false;
		if (articleVolume == null) {
			if (other.articleVolume != null)
				return false;
		} else if (!articleVolume.equals(other.articleVolume))
			return false;
		if (storeInfoCode == null) {
			if (other.storeInfoCode != null)
				return false;
		} else if (!storeInfoCode.equals(other.storeInfoCode))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArticleDto [articleCode=");
		builder.append(articleCode);
		builder.append(", storeInfoCode=");
		builder.append(storeInfoCode);
		builder.append(", articleName=");
		builder.append(articleName);
		builder.append(", articleTaxCate=");
		builder.append(articleTaxCate);
		builder.append(", artcleBig=");
		builder.append(artcleBig);
		builder.append(", artcleBigDan=");
		builder.append(artcleBigDan);
		builder.append(", artcleMiddle=");
		builder.append(artcleMiddle);
		builder.append(", artcleMiddleDan=");
		builder.append(artcleMiddleDan);
		builder.append(", articleVolume=");
		builder.append(articleVolume);
		builder.append(", articleDan=");
		builder.append(articleDan);
		builder.append(", articleEtc=");
		builder.append(articleEtc);
		builder.append(", articleRegDate=");
		builder.append(articleRegDate);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
