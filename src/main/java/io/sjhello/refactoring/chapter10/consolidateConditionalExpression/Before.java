package io.sjhello.refactoring.chapter10.consolidateConditionalExpression;

public class Before {
    public static int disabilityAmountOrCondition(Employee anEmployee) {
        int result = 0;
        if (anEmployee.getSeniority() < 2) return 0;
        if (anEmployee.getMonthsDisabled() > 12) return 0;
        if (anEmployee.isPartTime()) return 0;

        return result;
    }

    public static int disabilityAmountAndCondition(Employee anEmployee) {
        int result = 100;
        if (anEmployee.getSeniority() < 2) {
            if (anEmployee.getMonthsDisabled() > 12) {
                if (anEmployee.isPartTime()) {
                    return 0;
                }
            }
        }
        return result;
    }
}
