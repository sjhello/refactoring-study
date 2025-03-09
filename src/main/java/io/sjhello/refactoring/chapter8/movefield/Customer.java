package io.sjhello.refactoring.chapter8.movefield;

import java.time.LocalDate;

public class Customer {

    private String name;
    private CustomerContract contract;

    public Customer(String name, double discountRate) {
        this.name = name;
        this.contract = new CustomerContract(LocalDate.now(), discountRate);
        contract.setDiscountRate(discountRate);
    }

    public double getDiscountRate() {
        return contract.getDiscountRate();
    }

    public void becomePreferred() {
        contract.setDiscountRate(contract.getDiscountRate() + 0.03);
        // 다른 멋진 일들
    }

    public double applyDiscount(double amount) {
        return amount - (amount * contract.getDiscountRate());
    }
}
