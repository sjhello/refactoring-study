package io.sjhello.refactoring.chapter6.extractmethod;

import java.time.LocalDateTime;
import java.util.List;

public class Invoice {

    private List<Integer> orders;

    private LocalDateTime dueDate;

    private String customer;

    public List<Integer> getOrders() {
        return orders;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setOrders(List<Integer> orders) {
        this.orders = orders;
    }

    public String getCustomer() {
        return customer;
    }
}
