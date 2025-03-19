package io.sjhello.refactoring.chapter9.changeValueToReference;

public class Order {
	private int number;
	private Customer customer;

	public Order(int number, int id, String customerName) {
		this.number = number;
		this.customer = CustomerRepository.registerCustomer(id, customerName);
	}

	public Customer getCustomer() {
		return customer;
	}
}
