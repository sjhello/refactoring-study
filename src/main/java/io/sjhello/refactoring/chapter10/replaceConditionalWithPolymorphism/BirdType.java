package io.sjhello.refactoring.chapter10.replaceConditionalWithPolymorphism;

import java.util.Arrays;

public enum BirdType {
    EUROPEAN_SWALLOW("유럽 제비"),
    AFRICAN_SWALLOW("아프리카 제비"),
    NORWEGIAN_BLUE_PARROT("노르웨이 파랑 앵무");

    private final String value;

    BirdType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static BirdType from(String value) {
        return Arrays.stream(values())
                .filter(enumValue -> enumValue.value.equalsIgnoreCase(value))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(value + "는 유효하지 않은 타입 입니다."));
    }
}
