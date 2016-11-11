package com.mogo.ecom.domain.model;

public abstract class PaymentDetails {
	
	private final Client client;
	
	public PaymentDetails(Client client){
		this.client = client;
	}

	public Client getClient() {
		return client;
	}

	public boolean sameValueAs(PaymentDetails other) {
		return other != null && client.sameValueAs(other.getClient());
	}
	
}
