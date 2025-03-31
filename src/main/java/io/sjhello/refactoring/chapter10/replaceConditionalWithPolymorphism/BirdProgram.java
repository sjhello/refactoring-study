package io.sjhello.refactoring.chapter10.replaceConditionalWithPolymorphism;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BirdProgram {
    public static Map<String, String> plumages(List<Bird> birds) {
        return birds.stream()
                .collect(Collectors.toMap(Bird::getName, BirdProgram::plumage));
    }

    private static String plumage(Bird bird) {
        switch (bird.getType()) {
            case EUROPEAN_SWALLOW:
                return "보통이다";
            case AFRICAN_SWALLOW:
                return (bird.getNumberOfCoconuts() > 2) ? "지쳤다" : "보통이다";
            case NORWEGIAN_BLUE_PARROT:
                return (bird.getVoltage() > 100) ? "그을렸다" : "예쁘다";
            default:
                return "알 수 없다";
        }
    }
}
