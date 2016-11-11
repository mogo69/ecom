package com.mogo.ecom.domain.model.order;

public enum PageSize {
	 A0("A0"), A1("A1"), A2("A2"), A3("A3"), A4("A4"), A5("A5");
	
	private final String name;
	
	private PageSize(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}
