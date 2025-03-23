package io.sjhello.refactoring.chapter10.consolidateConditionalExpression;

public class Before {
    public static int disablityAmount(Employee anEmployee) {
        int result = 0;
        if (anEmployee.getSeniority() < 2) return 0;
        if (anEmployee.getMonthsDisabled() > 12) return 0;
        if (anEmployee.isPartTime()) return 0;

        return result;
    }
}
