package io.sjhello.refactoring.chapter9.replaceDerivedVariableWithQuery;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductionPlanTest {

	@Test
	void applyAdjestment() {
		ProductionPlan productionPlan = new ProductionPlan(10);
		Adjustment adjustment = new Adjustment(40);

		productionPlan.applyAdjestment(adjustment);

		assertThat(productionPlan.getAdjustments()).hasSize(1);
		assertThat(productionPlan.getProduction()).isEqualTo(50);
	}
}
