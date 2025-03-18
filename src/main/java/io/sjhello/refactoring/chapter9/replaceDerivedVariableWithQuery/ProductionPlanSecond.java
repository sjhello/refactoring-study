package io.sjhello.refactoring.chapter9.replaceDerivedVariableWithQuery;

import java.util.ArrayList;
import java.util.List;

public class ProductionPlanSecond {
	private int production;
	private List<Adjustment> adjustments;

	public ProductionPlanSecond(int production) {
		this.production = production;
		this.adjustments = new ArrayList<>();
	}

	public int getProduction() {
		return production;
	}

	public List<Adjustment> getAdjustments() {
		return adjustments;
	}

	public void applyAdjustment(Adjustment adjustment) {
		adjustments.add(adjustment);
		production += adjustment.getAmount();
	}
}
