package com.zxx.domain;

public class Person {
	private String name;
	private String password;
	private String picture;
	private String pictureFileName;
	private String pictureContentType;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getPictureFileName() {
		return pictureFileName;
	}
	public void setPictureFileName(String pictureFileName) {
		this.pictureFileName = pictureFileName;
	}
	public String getPictureContentType() {
		return pictureContentType;
	}
	public void setPictureContentType(String pictureContentType) {
		this.pictureContentType = pictureContentType;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", password=" + password + ", picture=" + picture + ", pictureFileName="
				+ pictureFileName + ", pictureContentType=" + pictureContentType + "]";
	}
	

}
