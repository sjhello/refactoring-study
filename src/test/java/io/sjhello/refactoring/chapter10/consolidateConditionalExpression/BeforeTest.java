package io.sjhello.refactoring.chapter10.consolidateConditionalExpression;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BeforeTest {
    @Test
    void disabilityAmountOrCondition() {
        Employee anEmployee = new Employee(1, 13, true);
        assertThat(Before.disabilityAmountOrCondition(anEmployee)).isEqualTo(0);
    }

    @Test
    void disabilityAmountAndCondition() {
        Employee anEmployee = new Employee(3, 13, true);
        assertThat(Before.disabilityAmountAndCondition(anEmployee)).isEqualTo(100);
    }
}
