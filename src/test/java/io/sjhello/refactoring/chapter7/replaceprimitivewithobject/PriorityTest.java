package io.sjhello.refactoring.chapter7.replaceprimitivewithobject;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PriorityTest {

	@Test
	void priorityGetValue() {
		Priority high = Priority.HIGH;

		assertThat(high.getValue()).isEqualTo("high");
	}

	@Test
	void whenIllegalValueThrownException() {
		assertThatThrownBy(() -> Priority.from("illegalValue"))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	void highPriorityCount() {
		List<Order> orders = List.of(
				new Order(Priority.HIGH),
				new Order(Priority.RUSH)
		);

		int count = (int) orders.stream()
				.filter(order -> order.getPriority().isHigher())
				.count();

		assertThat(count).isEqualTo(2);
	}
}
