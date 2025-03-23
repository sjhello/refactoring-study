package io.sjhello.refactoring.chapter10.consolidateConditionalExpression;

public class Employee {
    private int seniority;
    private int monthsDisabled;
    private boolean isPartTime;

    public Employee(int seniority, int monthsDisabled, boolean isPartTime) {
        this.seniority = seniority;
        this.monthsDisabled = monthsDisabled;
        this.isPartTime = isPartTime;
    }

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
