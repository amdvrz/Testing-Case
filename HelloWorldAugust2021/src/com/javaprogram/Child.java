package com.javaprogram;

public class Child extends Parent{
	public String getParentsName() {
		setParentName("Wheny Aisyah");
		return getParentName();
	}
	
	@Deprecated
	protected void printMessage() {
		System.out.println("This Message is from Child Class");
	}
	
	public void printMessage2() {
		System.out.println("This Message is from ");
	}

}
