package io.sjhello.refactoring.chapter1.calculator;

import io.sjhello.refactoring.chapter1.Performance;

public class TragedyCalculator {

	private Performance performance;

	public TragedyCalculator(Performance performance) {
		this.performance = performance;
	}

	public int amount() {
		int result = 40000;
		if (this.performance.getAudience() > 30) {
			result += 1000 * (this.performance.getAudience() - 30);
		}
		return result;
	}
}
