package io.sjhello.refactoring.chapter8.movefunction;

public class AccountType {

    private boolean premium;

    public AccountType(boolean premium) {
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }

    public double getOverDraftCharge(Account account) {
        if (isPremium()) {
            double baseCharge = 10;
            if (account.getDaysOverdrawn() <= 7) return baseCharge;
            else return baseCharge + (account.getDaysOverdrawn() - 7) * 0.85;
        } else {
            return account.getDaysOverdrawn() * 1.75;
        }
    }
}
