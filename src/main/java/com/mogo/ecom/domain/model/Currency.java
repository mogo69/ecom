package com.mogo.ecom.domain.model;

public enum Currency {
	USD("usd"), UAH("uah");
	
	private final String code;
	
	private Currency(String code){
		this.code = code;
	}
	
	public String getCode(){
		return code;
	}
}
