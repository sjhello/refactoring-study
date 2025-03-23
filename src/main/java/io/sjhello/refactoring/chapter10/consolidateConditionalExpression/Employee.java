package io.sjhello.refactoring.chapter10.consolidateConditionalExpression;

public class Employee {
    private int seniority;
    private int monthsDisabled;
    private boolean isPartTime;

    public int getSeniority() {
        return seniority;
    }

    public int getMonthsDisabled() {
        return monthsDisabled;
    }

    public boolean isPartTime() {
        return isPartTime;
    }
}
