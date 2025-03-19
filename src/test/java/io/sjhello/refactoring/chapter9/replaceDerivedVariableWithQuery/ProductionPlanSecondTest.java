package io.sjhello.refactoring.chapter9.replaceDerivedVariableWithQuery;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductionPlanSecondTest {

	@Test
	void applyAdjustment() {
		ProductionPlanSecond productionPlanSecond = new ProductionPlanSecond(0);
		Adjustment adjustment = new Adjustment(40);

		productionPlanSecond.applyAdjustment(adjustment);

		assertThat(productionPlanSecond.getAdjustments()).hasSize(1);
		assertThat(productionPlanSecond.getProduction()).isEqualTo(40);
	}

}
