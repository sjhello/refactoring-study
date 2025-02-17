package io.sjhello.refactoring.chapter4;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ProvinceTest {

	private Province sampleProvince() {
		List<Producer> producers = new ArrayList<>();
		producers.add(new Producer("Byzantium", 10, 9));
		producers.add(new Producer("Attalia", 12, 10));
		producers.add(new Producer("Sinope", 10, 6));

		return new Province("Asia", producers, 30, 20);
	}

	@Test
	void getShortFallTest() {
		Province asia = sampleProvince();

		assertThat(asia.getShortFall()).isEqualTo(5);
	}
}
