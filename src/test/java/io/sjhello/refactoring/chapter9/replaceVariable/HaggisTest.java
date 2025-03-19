package io.sjhello.refactoring.chapter9.replaceVariable;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HaggisTest {

	@Test
	void distanceTravelledTest() {
		Scenario scenario = new Scenario(10, 4, 20, 2);

		Haggis haggis = new Haggis();
		double result = haggis.distanceTravelled(scenario, 10);

		assertThat(result).isEqualTo(430.0);
	}
}
