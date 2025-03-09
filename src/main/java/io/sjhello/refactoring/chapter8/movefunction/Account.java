package io.sjhello.refactoring.chapter8.movefunction;

public class Account {

    private AccountType type;
    private int daysOverdrawn;

    public Account(int daysOverdrawn, AccountType type) {
        this.daysOverdrawn = daysOverdrawn;
        this.type = type;
    }

    public double getBankCharge() {
        double result = 4.5;
        if (daysOverdrawn > 0) result += getOverDraftCharge();
        return result;
    }

    public double getOverDraftCharge() {
        return type.getOverDraftCharge(getDaysOverdrawn());
    }

    private int getDaysOverdrawn() {
        return daysOverdrawn;
    }
}
