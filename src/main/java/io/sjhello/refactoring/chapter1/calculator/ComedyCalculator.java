package io.sjhello.refactoring.chapter1.calculator;

import io.sjhello.refactoring.chapter1.Performance;

public class ComedyCalculator {

	private Performance performance;

	public ComedyCalculator(Performance performance) {
		this.performance = performance;
	}

	public int amount() {
		int result;
		result = 30000;
		if (this.performance.getAudience() > 20) {
			result += 10000 + 500 * (this.performance.getAudience() - 20);
		}
		result += 300 * this.performance.getAudience();
		return result;
	}
}
