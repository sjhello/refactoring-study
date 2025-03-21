package io.sjhello.refactoring.chapter1.calculator;

import io.sjhello.refactoring.chapter1.Performance;
import io.sjhello.refactoring.chapter1.Play;
import io.sjhello.refactoring.chapter1.PlayType;

public class TragedyCalculator extends PerformanceCalculator {

	public TragedyCalculator(Performance performance, Play play) {
		super(performance, play);
	}

	public int amount() {
		int result = 40000;
		if (this.performance.getAudience() > 30) {
			result += 1000 * (this.performance.getAudience() - 30);
		}
		return result;
	}

	public int volumeCredits() {
		int result = 0;

		// 포인트를 적립한다.
		result += Math.max(performance.getAudience() - 30, 0);

		// 희극 관객 5명마다 추가포인트를 제공한다.
		if (this.play.getType().equals(PlayType.COMEDY)) {
			result += Math.floor(performance.getAudience() / 5);
		}
		return result;
	}
}
