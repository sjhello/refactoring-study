package io.sjhello.refactoring.chapter1.calculator;

import io.sjhello.refactoring.chapter1.Performance;
import io.sjhello.refactoring.chapter1.Play;

public class PerformanceCalculator {

    protected Performance performance;

    protected Play play;

    public PerformanceCalculator(Performance performance, Play play) {
        this.performance = performance;
        this.play = play;
    }

    public int amount() {
        throw new IllegalArgumentException("이미 서브 클래스에서 구현함");
    }

    public int volumeCredits() {
        throw new IllegalArgumentException("이미 서브 클래스에서 구현함");
    }
}
