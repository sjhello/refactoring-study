package io.sjhello.refactoring.chapter10.replaceNestedConditionalWithGuardClauses;

public class AdjustedCapital {

    public static int adjustedCapital(Instrument instrument) {
        int result = 0;
        if (instrument.getCapital() <= 0) return result;
        if (instrument.getInterestRate() > 0 && instrument.getDuration() > 0) {
            result = (instrument.getIncome() / instrument.getDuration()) * instrument.getAdjustmentFactor();
        }
        return result;
    }
}
