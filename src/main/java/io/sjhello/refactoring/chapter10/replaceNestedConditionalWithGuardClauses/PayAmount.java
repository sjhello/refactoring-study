package io.sjhello.refactoring.chapter10.replaceNestedConditionalWithGuardClauses;

import static io.sjhello.refactoring.chapter10.replaceNestedConditionalWithGuardClauses.PayAmountResult.ReasonCode.*;

public class PayAmount {
    public static PayAmountResult payAmount(Employee employee) {
        if (employee.isSeparated()) return new PayAmountResult(0, SEP);
        if (employee.isRetired()) return new PayAmountResult(0, RET);
        return new PayAmountResult(1000, AMOUNT);
    }
}
