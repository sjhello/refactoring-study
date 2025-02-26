package io.sjhello.refactoring.chapter6.changefunctiondeclaration;

public class Customer {

    public Customer(Address address) {
        this.address = address;
    }

    private Address address;

    public Address getAddress() {
        return address;
    }

    class Address {
        private String state;

        public Address(String state) {
            this.state = state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }
}
