package io.sjhello.refactoring.chapter8.movefield;

import java.time.LocalDate;

public class CustomerContract {

    private LocalDate startDate;
    private double discountRate;

    public CustomerContract(LocalDate startDate, double discountRate) {
        this.startDate = startDate;
        this.discountRate = discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
