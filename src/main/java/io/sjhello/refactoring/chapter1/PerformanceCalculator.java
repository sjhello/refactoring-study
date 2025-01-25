package io.sjhello.refactoring.chapter1;

import io.sjhello.refactoring.chapter1.calculator.ComedyCalculator;
import io.sjhello.refactoring.chapter1.calculator.TragedyCalculator;

public class PerformanceCalculator {

    private Performance performance;

    private Play play;

    public PerformanceCalculator(Performance performance, Play play) {
        this.performance = performance;
        this.play = play;
    }

    public int amount() {
        switch (this.play.getType()) {
            case TRAGEDY:	// 비극
                return new TragedyCalculator(performance, play).amount();
            case COMEDY:	// 희극
                return new ComedyCalculator(performance, play).amount();
            default:
                throw new IllegalArgumentException("알 수 없는 장르: " + this.play.getType());
        }
    }

    public int volumeCredits() {
        switch (this.play.getType()) {
            case TRAGEDY:	// 비극
                return new TragedyCalculator(performance, play).volumeCredits();
            case COMEDY:	// 희극
                return new ComedyCalculator(performance, play).volumeCredits();
            default:
                throw new IllegalArgumentException("알 수 없는 장르: " + this.play.getType());
        }
    }
}
