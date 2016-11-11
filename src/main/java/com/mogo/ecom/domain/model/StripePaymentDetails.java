package com.mogo.ecom.domain.model;

public class StripePaymentDetails extends PaymentDetails implements ValueObject<StripePaymentDetails>{
	
	private final String token;
	
	public StripePaymentDetails(Client client, String token){
		super(client);
		this.token = token;
	}
	
	public String getToken(){
		return token;
	}

	@Override
	public boolean sameValueAs(StripePaymentDetails other) {
		return other != null && super.sameValueAs(other) && token.equals(other.getToken());
	}
}
