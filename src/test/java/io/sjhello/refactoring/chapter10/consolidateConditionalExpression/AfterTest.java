package io.sjhello.refactoring.chapter10.consolidateConditionalExpression;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AfterTest {
    @Test
    void disabilityAmountOrCondition() {
        Employee anEmployee = new Employee(1, 13, true);
        assertThat(After.disabilityAmountOrCondition(anEmployee)).isEqualTo(0);
    }

    @Test
    void disabilityAmountAndCondition() {
        Employee anEmployee = new Employee(3, 13, true);
        assertThat(After.disabilityAmountAndCondition(anEmployee)).isEqualTo(100);
    }
}
