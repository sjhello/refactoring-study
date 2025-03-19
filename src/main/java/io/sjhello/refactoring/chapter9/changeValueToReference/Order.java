package io.sjhello.refactoring.chapter9.changeValueToReference;

public class Order {
	private int number;
	private Customer customer;

	public Order(int number, int id) {
		this.number = number;
		this.customer = new Customer(id);
	}

	public Customer getCustomer() {
		return customer;
	}
}
