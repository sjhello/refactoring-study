package io.sjhello.refactoring.chapter8.movefield;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CustomerTest {

    Customer customer;

    @BeforeEach
    void setUp() {
        customer = getCustomer();
    }

    private static Customer getCustomer() {
        return new Customer("name", 0.5);
    }

    @Test
    void createCustomer() {
        Customer customer = getCustomer();

        assertThat(customer.getDiscountRate()).isEqualTo(0.5);
    }

    @Test
    void customerPreferred() {
        Customer customer = getCustomer();

        customer.becomePreferred();

        assertThat(customer.getDiscountRate()).isEqualTo(0.53);
    }

    @Test
    void applyDiscountRate() {
        double discount = customer.applyDiscount(50);

        assertThat(discount).isEqualTo(25.0);
    }
}
