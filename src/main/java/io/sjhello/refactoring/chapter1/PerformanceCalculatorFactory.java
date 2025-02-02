package io.sjhello.refactoring.chapter1;

import io.sjhello.refactoring.chapter1.calculator.ComedyCalculator;
import io.sjhello.refactoring.chapter1.calculator.TragedyCalculator;

public class PerformanceCalculatorFactory {

	public PerformanceCalculator createPerformanceCalculator(Play play, Performance performance) {
		switch (play.getType()) {
			case TRAGEDY:	// 비극
				return new TragedyCalculator(performance, play);
			case COMEDY:	// 희극
				return new ComedyCalculator(performance, play);
			default:
				throw new IllegalArgumentException("알 수 없는 장르: " + play.getType());
		}
	}
}
