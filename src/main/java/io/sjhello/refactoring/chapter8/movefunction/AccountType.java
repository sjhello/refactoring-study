package io.sjhello.refactoring.chapter8.movefunction;

public class AccountType {

    private boolean premium;

    public AccountType(boolean premium) {
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }

    public double getOverDraftCharge(int daysOverdrawn) {
        if (isPremium()) {
            double baseCharge = 10;
            if (daysOverdrawn <= 7) return baseCharge;
            else return baseCharge + (daysOverdrawn - 7) * 0.85;
        } else {
            return daysOverdrawn * 1.75;
        }
    }
}
