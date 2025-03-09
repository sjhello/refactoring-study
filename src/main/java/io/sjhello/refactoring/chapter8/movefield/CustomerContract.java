package io.sjhello.refactoring.chapter8.movefield;

import java.time.LocalDate;

public class CustomerContract {

    private LocalDate startDate;
    private double discountRate;

    public CustomerContract(LocalDate startDate, double discountRate) {
        this.startDate = startDate;
        setDiscountRate(discountRate);
    }

    private void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void becomePreferred() {
        setDiscountRate(getDiscountRate() + 0.03);
    }
}
