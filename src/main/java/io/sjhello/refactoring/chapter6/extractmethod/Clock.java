package io.sjhello.refactoring.chapter6.extractmethod;

import java.time.LocalDateTime;

public class Clock {

    public static LocalDateTime today() {
        return LocalDateTime.now();
    }
}
