package com.javaprogram;

public class Parent {
	
	protected String parentName;

	protected String getParentName() {
		return parentName;
	}

	protected void setParentName(String parentName) {
		this.parentName = parentName;
	}
	
	protected void printMessage() {
		System.out.println("This Message is from Parent Class");
	}
}
