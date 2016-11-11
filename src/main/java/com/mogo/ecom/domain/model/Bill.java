package com.mogo.ecom.domain.model;

import java.util.UUID;

public class Bill implements ValueObject<Bill>{

	private final Currency currency;
	private final int amount;
	private final UUID orderUUID;
	
	public Bill(Currency currency, int amount, UUID orderUUID){
		this.currency = currency;
		this.amount = amount;
		this.orderUUID = orderUUID;
	}

	@Override
	public boolean sameValueAs(Bill other) {
		return other != null && currency.equals(other.getCurrency()) && amount == other.getAmount();
	}

	public int getAmount() {
		return amount;
	}

	public Currency getCurrency() {
		return currency;
	}

	public UUID getOrderUUID() {
		return orderUUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((orderUUID == null) ? 0 : orderUUID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bill other = (Bill) obj;
		if (amount != other.amount)
			return false;
		if (currency != other.currency)
			return false;
		if (orderUUID == null) {
			if (other.orderUUID != null)
				return false;
		} else if (!orderUUID.equals(other.orderUUID))
			return false;
		return true;
	}
	
}
