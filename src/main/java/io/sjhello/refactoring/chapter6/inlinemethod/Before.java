package io.sjhello.refactoring.chapter6.inlinemethod;

public class Before {

    public int rating(Driver aDriver) {
        return aDriver.getNumberOfLateDeliveries() > 5 ? 2 : 1;
    }

}
