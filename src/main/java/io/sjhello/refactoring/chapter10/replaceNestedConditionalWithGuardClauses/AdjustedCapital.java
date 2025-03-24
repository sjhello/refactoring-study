package io.sjhello.refactoring.chapter10.replaceNestedConditionalWithGuardClauses;

public class AdjustedCapital {

    public static int adjustedCapital(Instrument instrument) {
        if (isABoolean(instrument)) return 0;
        return (instrument.getIncome() / instrument.getDuration()) * instrument.getAdjustmentFactor();
    }

    private static boolean isABoolean(Instrument instrument) {
        return instrument.getInterestRate() <= 0 || instrument.getDuration() <= 0 || instrument.getCapital() <= 0;
    }
}
