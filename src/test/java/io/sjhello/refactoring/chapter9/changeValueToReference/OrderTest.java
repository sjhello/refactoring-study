package io.sjhello.refactoring.chapter9.changeValueToReference;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrderTest {
	@Test
	void getCustomer() {
		Order firstOrder = new Order(1, 10, "sam");
		Order secondOrder = new Order(2, 10, "sam");

		firstOrder.getCustomer().setName("jack");

		assertThat(firstOrder.getCustomer().getName()).isEqualTo("jack");
		assertThat(secondOrder.getCustomer().getName()).isEqualTo("jack");
		assertThat(firstOrder.getCustomer().getName()).isEqualTo(secondOrder.getCustomer().getName());
		assertThat(firstOrder.getCustomer()).isEqualTo(secondOrder.getCustomer());
	}
}
