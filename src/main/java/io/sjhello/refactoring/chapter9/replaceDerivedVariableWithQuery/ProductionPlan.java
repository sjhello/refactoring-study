package io.sjhello.refactoring.chapter9.replaceDerivedVariableWithQuery;

import java.util.ArrayList;
import java.util.List;

public class ProductionPlan {
	private int production;
	private List<Adjustment> adjustments = new ArrayList<>();

	public ProductionPlan(int production) {
		this.production = production;
	}

	public int getProduction() {
		return adjustments.stream()
			.map(Adjustment::getAmount)
			.reduce(production, Integer::sum);
	}

	public List<Adjustment> getAdjustments() {
		return adjustments;
	}

	public void applyAdjestment(Adjustment anAdjustment) {
		adjustments.add(anAdjustment);
	}
}
