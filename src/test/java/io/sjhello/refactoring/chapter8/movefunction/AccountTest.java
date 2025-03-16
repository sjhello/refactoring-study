package io.sjhello.refactoring.chapter8.movefunction;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AccountTest {

    @Test
    void bankChargeWithNoOverdrawnDays() {
        Account account = new Account(0, new AccountType(false));
        assertThat(account.getBankCharge()).isEqualTo(4.5);
    }

    @Test
    void bankChargeWithOverdrawnDays() {
        Account account = new Account(5, new AccountType(false));
        assertThat(account.getBankCharge()).isEqualTo(13.25);
    }

    @Test
    void overDraftChargeForPremiumAccountWithFewOverdrawnDays() {
        Account account = new Account(5, new AccountType(true));
        assertThat(account.getOverDraftCharge()).isEqualTo(10);
    }

    @Test
    void overDraftChargeForPremiumAccountWithManyOverdrawnDays() {
        Account account = new Account(10, new AccountType(true));
        assertThat(account.getOverDraftCharge()).isEqualTo(12.55);
    }

    @Test
    void overDraftChargeForNonPremiumAccount() {
        Account account = new Account(5, new AccountType(false));
        assertThat(account.getOverDraftCharge()).isEqualTo(8.75);
    }
}
