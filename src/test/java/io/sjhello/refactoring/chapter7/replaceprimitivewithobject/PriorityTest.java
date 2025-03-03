package io.sjhello.refactoring.chapter7.replaceprimitivewithobject;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

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

}
