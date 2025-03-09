package io.sjhello.refactoring.chapter8.movefield;

import java.time.LocalDate;

public class Customer {

    private String name;
    private CustomerContract contract;

    public Customer(String name, double discountRate) {
        this.name = name;
        this.contract = new CustomerContract(LocalDate.now(), discountRate);
    }

    public double getDiscountRate() {
        return contract.getDiscountRate();
    }

    public void becomePreferred() {
        contract.becomePreferred();
    }

    public double applyDiscount(double amount) {
        return amount - (amount * contract.getDiscountRate());
    }
}
