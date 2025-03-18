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
		return production;
	}

	public List<Adjustment> getAdjustments() {
		return adjustments;
	}

	public void applyAdjestment(Adjustment anAdjustment) {
		adjustments.add(anAdjustment);
		production += anAdjustment.getAmount();
	}
}
