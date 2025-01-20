package io.sjhello.refactoring.chapter1;

public class PerformanceCalculator {

    private Performance performance;

    private Play play;

    public PerformanceCalculator(Performance performance, Play play) {
        this.performance = performance;
        this.play = play;
    }

    public int amount() {
        int result;
        switch (this.play.getType()) {
            case TRAGEDY:	// 비극
                result = 40000;
                if (this.performance.getAudience() > 30) {
                    result += 1000 * (this.performance.getAudience() - 30);
                }
                break;
            case COMEDY:	// 희극
                result = 30000;
                if (this.performance.getAudience() > 20) {
                    result += 10000 + 500 * (this.performance.getAudience() - 20);
                }
                result += 300 * this.performance.getAudience();
                break;
            default:
                throw new IllegalArgumentException("알 수 없는 장르: " + this.play.getType());
        }
        return result;
    }
}
