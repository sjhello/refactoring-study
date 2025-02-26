package io.sjhello.refactoring.chapter6.changefunctiondeclaration;

import java.util.List;

public class Before {

    public static void main(String[] args) {
        Customer.Address address = new Customer.Address("MA");

        Customer customer = new Customer(address);

        System.out.println(inNewEngland(customer.getAddress().getState()));
    }

    public static boolean inNewEngland(Customer customer) {
        return inNewEngland(customer.getAddress().getState());
    }

    private static boolean inNewEngland(String state) {
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
