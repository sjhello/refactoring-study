package io.sjhello.refactoring.chapter9.changeValueToReference;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepository {
	private static final Map<Integer, Customer> customer = new HashMap<>();

	public static Customer registerCustomer(int id, String name) {
		if (!customer.containsKey(id)) {
			customer.put(id, new Customer(id, name));
		}
		return findCustomer(id);
	}

	private static Customer findCustomer(int id) {
		return customer.get(id);
	}
}
