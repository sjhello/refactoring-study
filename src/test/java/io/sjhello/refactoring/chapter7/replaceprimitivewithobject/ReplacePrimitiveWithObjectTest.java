package io.sjhello.refactoring.chapter7.replaceprimitivewithobject;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import java.util.Objects;

import org.junit.jupiter.api.Test;

class ReplacePrimitiveWithObjectTest {

	@Test
	void highPriorityCount() {
		Priority high = new Priority("high");
		Priority rush = new Priority("rush");
		List<Order> orders = List.of(new Order(high), new Order(rush));

		int size = orders.stream()
			.filter(order -> Objects.equals(order.getPriorityToString(), "high")
						|| Objects.equals(order.getPriorityToString(), "rush"))
			.toList()
			.size();

		assertThat(size).isEqualTo(2);
	}
}
