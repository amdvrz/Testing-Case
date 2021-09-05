package com.javaprogram;

public enum AppEnums {
	
	LOGIN("Log In"),REGISTER("Register");
	
	private String filter;
	
	private AppEnums(String filter) {
		this.filter = filter;
	}
	public String getString() {
		return filter;
	}

}
