package io.sjhello.refactoring.chapter4;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProvinceTest {

	Province province;

	@BeforeEach
	void sampleProvince() {
		List<Producer> producers = new ArrayList<>();
		producers.add(new Producer("Byzantium", 10, 9));
		producers.add(new Producer("Attalia", 12, 10));
		producers.add(new Producer("Sinope", 10, 6));

		this.province = new Province("Asia", producers, 30, 20);
	}

	@Test
	void getShortFallTest() {
		assertThat(province.getShortFall()).isEqualTo(5);
	}

	@Test
	void profitTest() {
		assertThat(province.getProfit()).isEqualTo(230);
	}

	@Test
	void changeProduction() {
		// given
		province.getProducers().get(0).setProduction("20");

		// when & then
		assertThat(province.getShortFall()).isEqualTo(-6);
		assertThat(province.getProfit()).isEqualTo(292);
	}
}
