package com.javaprogram;

public class Class1 {
	
	int numberId;
	public Class1(int numberId, String name, String address) {
		super();
		this.numberId = numberId;
		this.name = name;
		this.address = address;
	}
	String name;
	String address;
	
	public int getNumberId() {
		return numberId;
	}
	public void setNumberId(int numberId) {
		this.numberId = numberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
