package io.sjhello.refactoring.chapter6.changefunctiondeclaration;

import java.util.List;

public class Before {

    public static boolean inNewEngland(Customer customer) {
        return xxNewInNewEngland(customer.getAddress().getState());
    }

    private static boolean xxNewInNewEngland(String state) {
        return List.of(
                "MA",
                "CT",
                "ME",
                "VT",
                "NH",
                "RI"
        ).contains(state);
    }
}
