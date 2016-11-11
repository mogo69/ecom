package com.mogo.ecom.domain.model;

public class Client implements ValueObject<Client> {

	private final String firstName;
	private final String lastName;

	public Client(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public boolean sameValueAs(Client other) {
		// TODO Auto-generated method stub
		return other != null && firstName == other.getFirstName() && lastName == other.getLastName();
	}
}
