package io.sjhello.refactoring.chapter12.replaceTypeCodeWithSubclasses;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class EmployeeTest {

    @Test
    void createEmployee() {
        Employee engineer = Employee.createEmployee("good engineer", "engineer");
        assertThat(engineer.getType()).isEqualTo("engineer!!!!");
    }

    @Test
    void failCreateEmployee() {
        assertThatThrownBy(() -> Employee.createEmployee("anonymous", "anonymous"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
