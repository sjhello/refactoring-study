package io.sjhello.refactoring.chapter9.changeValueToReference;

public class Customer {
	private int id;

	public Customer(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
