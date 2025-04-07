package io.sjhello.refactoring.chapter12.replaceTypeCodeWithSubclasses;

import io.sjhello.refactoring.chapter12.replaceTypeCodeWithSubclasses.direct.Employee;
import io.sjhello.refactoring.chapter12.replaceTypeCodeWithSubclasses.direct.Engineer;
import io.sjhello.refactoring.chapter12.replaceTypeCodeWithSubclasses.direct.Manager;
import io.sjhello.refactoring.chapter12.replaceTypeCodeWithSubclasses.direct.Sales;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class EmployeeTest {

    @Test
    void createEngineer() {
        Employee engineer = Engineer.createEmployee("good engineer", "engineer");
        assertThat(engineer).isInstanceOf(Engineer.class);
    }

    @Test
    void createSales() {
        Employee sales = Employee.createEmployee("good sales", "sales");
        assertThat(sales).isInstanceOf(Sales.class);
    }

    @Test
    void createManager() {
        Employee manager = Employee.createEmployee("good manager", "manager");
        assertThat(manager).isInstanceOf(Manager.class);
    }

    @Test
    void failCreateEmployee() {
        assertThatThrownBy(() -> Employee.createEmployee("anonymous", "anonymous"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
