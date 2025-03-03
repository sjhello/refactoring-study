package io.sjhello.refactoring.chapter7.replaceprimitivewithobject;

import java.util.Arrays;

public enum Priority {

    HIGH("high"),
    RUSH("rush");

    private final String value;

    Priority(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Priority from(String value) {
        return Arrays.stream(values())
                .filter(enumValue -> enumValue.value.equalsIgnoreCase(value))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(value + "는 유효하지 않은 우선순위 입니다."));
    }

    public boolean isHigher() {
        return this == HIGH || this == RUSH;
    }
}
