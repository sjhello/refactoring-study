package io.sjhello.refactoring.chapter9.replaceDerivedVariableWithQuery;

import java.util.ArrayList;
import java.util.List;

public class ProductionPlanSecond {
	private int initialProduction;
	private List<Adjustment> adjustments;

	public ProductionPlanSecond(int production) {
		this.initialProduction = production;
		this.adjustments = new ArrayList<>();
	}

	public int getProduction() {
		return initialProduction + calculateProductionAccumulator();
	}

	public List<Adjustment> getAdjustments() {
		return adjustments;
	}

	public void applyAdjustment(Adjustment adjustment) {
		adjustments.add(adjustment);
	}

	public int calculateProductionAccumulator() {
		return adjustments.stream()
			.map(Adjustment::getAmount)
			.reduce(0, Integer::sum);
	}
}
