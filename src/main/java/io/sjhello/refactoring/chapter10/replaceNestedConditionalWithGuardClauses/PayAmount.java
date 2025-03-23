package io.sjhello.refactoring.chapter10.replaceNestedConditionalWithGuardClauses;

import static io.sjhello.refactoring.chapter10.replaceNestedConditionalWithGuardClauses.PayAmountResult.ReasonCode.*;

public class PayAmount {
    public static PayAmountResult payAmount(Employee employee) {
        if (employee.isSeparated()) { // 퇴사한 직원인가?
            return new PayAmountResult(0, SEP);
        } else {
            if (employee.isRetired()) { // 은퇴한 직원인가?
                return new PayAmountResult(0, RET);
            } else {    // 급여 계산 로직
                return new PayAmountResult(1000, AMOUNT);
            }
        }
    }
}
