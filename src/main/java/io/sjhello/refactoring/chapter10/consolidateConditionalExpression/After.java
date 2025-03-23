package io.sjhello.refactoring.chapter10.consolidateConditionalExpression;

public class After {
    public static int disablityAmount(Employee anEmployee) {
        int result = 100;
        if (isNotEligibleForDisability(anEmployee)) return 0;
        return result;
    }

    private static boolean isNotEligibleForDisability(Employee anEmployee) {
        return anEmployee.getSeniority() < 2
                || anEmployee.getMonthsDisabled() > 12
                || anEmployee.isPartTime();
    }
}
