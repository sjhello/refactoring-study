package io.sjhello.refactoring.chapter10.replaceNestedConditionalWithGuardClauses;

public class AdjustedCapital {

    public static int adjustedCapital(Instrument instrument) {
        int result = 0;
        if (isABoolean(instrument)) return result;
        result = (instrument.getIncome() / instrument.getDuration()) * instrument.getAdjustmentFactor();
        return result;
    }

    private static boolean isABoolean(Instrument instrument) {
        return instrument.getInterestRate() <= 0 || instrument.getDuration() <= 0 || instrument.getCapital() <= 0;
    }
}
