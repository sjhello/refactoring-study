package io.sjhello.refactoring.chapter10.consolidateConditionalExpression;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BeforeTest {
    @Test
    void disablityAmount() {
        Employee anEmployee = new Employee(1, 13, true);
        assertThat(Before.disablityAmount(anEmployee)).isEqualTo(0);
    }
}
