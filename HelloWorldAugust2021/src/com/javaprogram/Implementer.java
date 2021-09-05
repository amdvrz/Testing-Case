package com.javaprogram;

public class Implementer implements Interface1, Interface2 {
	
	@Override
	public void test1() {
		System.out.println(baseUrl);
	}

	@Override
	public void test2() {
		System.out.println(baseUrl2);
		
	}
}
