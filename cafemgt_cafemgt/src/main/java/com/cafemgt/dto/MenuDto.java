package com.cafemgt.dto;

public class MenuDto {

		private String menuCode;
		private String storeInfoCode;
		private String storeInfoName;
		private String menuName;
		private String menuCate;
		private int    menuPrice;
		private String menuRegDate;
		
		
		public String getMenuCode() {
			return menuCode;
		}
		public void setMenuCode(String menuCode) {
			this.menuCode = menuCode;
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
		public String getMenuName() {
			return menuName;
		}
		public void setMenuName(String menuName) {
			this.menuName = menuName;
		}
		public String getMenuCate() {
			return menuCate;
		}
		public void setMenuCate(String menuCate) {
			this.menuCate = menuCate;
		}
		public int getMenuPrice() {
			return menuPrice;
		}
		public void setMenuPrice(int menuPrice) {
			this.menuPrice = menuPrice;
		}
		public String getMenuRegDate() {
			return menuRegDate;
		}
		public void setMenuRegDate(String menuRegDate) {
			this.menuRegDate = menuRegDate;
		}
		
		
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("MenuDto [menuCode=");
			builder.append(menuCode);
			builder.append(", storeInfoCode=");
			builder.append(storeInfoCode);
			builder.append(", storeInfoName=");
			builder.append(storeInfoName);
			builder.append(", menuName=");
			builder.append(menuName);
			builder.append(", menuCate=");
			builder.append(menuCate);
			builder.append(", menuPrice=");
			builder.append(menuPrice);
			builder.append(", menuRegDate=");
			builder.append(menuRegDate);
			builder.append(", getMenuCode()=");
			builder.append(getMenuCode());
			builder.append(", getStoreInfoCode()=");
			builder.append(getStoreInfoCode());
			builder.append(", getStoreInfoName()=");
			builder.append(getStoreInfoName());
			builder.append(", getMenuName()=");
			builder.append(getMenuName());
			builder.append(", getMenuCate()=");
			builder.append(getMenuCate());
			builder.append(", getMenuPrice()=");
			builder.append(getMenuPrice());
			builder.append(", getMenuRegDate()=");
			builder.append(getMenuRegDate());
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
