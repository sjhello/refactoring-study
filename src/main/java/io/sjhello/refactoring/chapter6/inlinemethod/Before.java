package io.sjhello.refactoring.chapter6.inlinemethod;

public class Before {

    public int rating(Driver aDriver) {
        return moreThanFiveLateDeliveries(aDriver) ? 2 : 1;
    }

    private boolean moreThanFiveLateDeliveries(Driver aDriver) {
        return aDriver.getNumberOfLateDeliveries() > 5;
    }
}
