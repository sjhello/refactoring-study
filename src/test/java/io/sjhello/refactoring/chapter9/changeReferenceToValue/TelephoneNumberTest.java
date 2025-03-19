package io.sjhello.refactoring.chapter9.changeReferenceToValue;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelephoneNumberTest {

	@Test
	void immutable() {
		TelephoneNumber paris = new TelephoneNumber("paris", 20);

		assertThat(paris).isEqualTo(new TelephoneNumber("paris", 20));
	}
}
