package io.sjhello.refactoring.chapter10.replaceNestedConditionalWithGuardClauses;

public class PayAmountResult {
    private int amount;
    private ReasonCode reasonCode;

    public PayAmountResult(int amount, ReasonCode reasonCode) {
        this.amount = amount;
        this.reasonCode = reasonCode;
    }

    public ReasonCode getReasonCode() {
        return reasonCode;
    }

    public enum ReasonCode {
        SEP("SEP"),
        RET("RET"),
        AMOUNT("AMOUNT");

        private final String value;

        ReasonCode(String sep) {
            this.value = sep;
        }

        public String getValue() {
            return value;
        }
    }
}
