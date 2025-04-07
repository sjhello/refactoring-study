package io.sjhello.refactoring.chapter12.replaceTypeCodeWithSubclasses;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class EmployeeTest {

    @Test
    void createEngineer() {
        Employee engineer = Employee.createEmployee("good engineer", "engineer");
        assertThat(engineer.getType()).isEqualTo("engineer!!!!");
    }

    @Test
    void createSales() {
        Employee engineer = Employee.createEmployee("good sales", "sales");
        assertThat(engineer.getType()).isEqualTo("sales!!!!");
    }

    @Test
    void createManager() {
        Employee engineer = Employee.createEmployee("good manager", "manager");
        assertThat(engineer.getType()).isEqualTo("manager!!!!");
    }

    @Test
    void failCreateEmployee() {
        assertThatThrownBy(() -> Employee.createEmployee("anonymous", "anonymous"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
