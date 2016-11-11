package com.mogo.ecom.domain.model.order;

import java.util.List;
import java.util.UUID;

import com.mogo.ecom.domain.model.Bill;
import com.mogo.ecom.domain.model.Client;
import com.mogo.ecom.domain.model.Entity;

public class Order implements Entity<Order> {

	private final UUID id = UUID.randomUUID();

	private final Client client;
	private final List<Document> documents;
	private final Bill bill;

	public Order(Client client, List<Document> documents, Bill bill){
		this.client = client;
		this.documents = documents;
		this.bill = bill;
	}

	@Override
	public boolean sameIdentityAs(Order other) {
		return other != null && this.id.equals(other.id);
	}
	
	public UUID getId() {
		return id;
	}
	public Client getClient() {
		return client;
	}

	public List<Document> getDocuments() {
		return documents;
	}
	
	public Bill getBill() {
		return bill;
	}
	
	
	@Override
	public boolean equals(final Object object) {
		if (this == object)
			return true;
		if (object == null || getClass() != object.getClass())
			return false;

		final Order other = (Order) object;
		return sameIdentityAs(other);
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}	
}
