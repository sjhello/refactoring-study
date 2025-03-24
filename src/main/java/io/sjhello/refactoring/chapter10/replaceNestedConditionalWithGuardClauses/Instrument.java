package io.sjhello.refactoring.chapter10.replaceNestedConditionalWithGuardClauses;

public class Instrument {
    private int capital;
    private int interestRate;
    private int duration;
    private int income;
    private int adjustmentFactor;

    public Instrument(int capital, int interestRate, int duration, int income, int adjustmentFactor) {
        this.capital = capital;
        this.interestRate = interestRate;
        this.duration = duration;
        this.income = income;
        this.adjustmentFactor = adjustmentFactor;
    }

    public Instrument(int capital) {
        this.capital = capital;
    }

    public int getCapital() {
        return capital;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public int getDuration() {
        return duration;
    }

    public int getIncome() {
        return income;
    }

    public int getAdjustmentFactor() {
        return adjustmentFactor;
    }
}
