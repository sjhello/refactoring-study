package io.sjhello.refactoring.chapter7.replacetempwithquery;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void orderTest() {
        Order order = new Order(10, new Item(1000));

        assertThat(order.getPrice()).isEqualTo(9500.0);
    }
}
