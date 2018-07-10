package com.zxx.domain;

public class Dog {
	private String name;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	

}
