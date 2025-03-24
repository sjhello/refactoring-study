package io.sjhello.refactoring.chapter10.replaceNestedConditionalWithGuardClauses;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;
import static org.junit.jupiter.api.Assertions.*;

class AdjustedCapitalTest {

    @Test
    void adjustedCapitalInstrumentCapitalIsLessThanZero() {
        Instrument instrument = new Instrument(10);
        assertThat(AdjustedCapital.adjustedCapital(instrument)).isEqualTo(0);
    }

    @Test
    void adjustedCapitalInstrumentCapitalIsGreaterThanZero() {
        Instrument instrument = new Instrument(10, 5, 2, 100, 1);
        assertThat(AdjustedCapital.adjustedCapital(instrument)).isEqualTo(50);
    }
}
