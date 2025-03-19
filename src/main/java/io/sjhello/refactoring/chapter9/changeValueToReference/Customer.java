package io.sjhello.refactoring.chapter9.changeValueToReference;

import java.util.Objects;

public class Customer {
	private int id;
	private String name;

	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass())
			return false;
		Customer customer = (Customer)o;
		return getId() == customer.getId();
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}
}
