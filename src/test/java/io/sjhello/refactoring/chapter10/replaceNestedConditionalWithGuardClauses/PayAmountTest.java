package io.sjhello.refactoring.chapter10.replaceNestedConditionalWithGuardClauses;

import org.junit.jupiter.api.Test;

import static io.sjhello.refactoring.chapter10.replaceNestedConditionalWithGuardClauses.PayAmountResult.ReasonCode.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PayAmountTest {
    @Test
    void payAmount() {
        Employee separated = new Employee(true, false);
        Employee retired = new Employee(false, true);
        Employee employee = new Employee(false, false);

        assertThat(PayAmount.payAmount(separated).getReasonCode()).isEqualTo(SEP);
        assertThat(PayAmount.payAmount(retired).getReasonCode()).isEqualTo(RET);
        assertThat(PayAmount.payAmount(employee).getReasonCode()).isEqualTo(AMOUNT);
    }
}
