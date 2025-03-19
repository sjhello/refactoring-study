package io.sjhello.refactoring.chapter9.changeValueToReference;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerRepositoryTest {

	@Test
	void registerCustomer() {
		CustomerRepository customerRepository = new CustomerRepository();

		Customer sam = customerRepository.registerCustomer(10, "sam");
		Customer jack = customerRepository.registerCustomer(20, "jack");

		assertThat(sam).isEqualTo(new Customer(10, "samsam"));
		assertThat(jack).isEqualTo(new Customer(20, "jackjack"));
	}
}
