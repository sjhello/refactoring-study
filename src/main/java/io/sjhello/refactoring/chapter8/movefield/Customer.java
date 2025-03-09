package io.sjhello.refactoring.chapter8.movefield;

import java.time.LocalDate;

public class Customer {

    private String name;
    private double discountRate;
    private CustomerContract contract;

    public Customer(String name, double discountRate) {
        this.name = name;
        this.discountRate = discountRate;
        this.contract = new CustomerContract(LocalDate.now());
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void becomePreferred() {
        this.discountRate += 0.03;
        // 다른 멋진 일들
    }

    public double applyDiscount(double amount) {
        return amount - (amount * discountRate);
    }
}
