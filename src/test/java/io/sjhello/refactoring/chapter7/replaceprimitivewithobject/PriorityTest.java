package io.sjhello.refactoring.chapter7.replaceprimitivewithobject;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

class PriorityTest {

	@Test
	void priorityToString() {
		Priority high = new Priority("high");

		assertThat(high.toString()).isEqualTo("high");
	}

	@Test
	void whenIllegalValueThrownException() {
		assertThatThrownBy(() -> new Priority("illegalValue"))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	void highPriorityCount() {
		List<Order> orders = List.of(
				new Order(new Priority("high")),
				new Order(new Priority("rush"))
		);

		int count = (int) orders.stream()
				.filter(order -> order.getPriority().higherThan(order.getPriorityToString()))
				.count();

		assertThat(count).isEqualTo(2);
	}


}
