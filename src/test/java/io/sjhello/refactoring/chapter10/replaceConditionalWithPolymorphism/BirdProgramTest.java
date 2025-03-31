package io.sjhello.refactoring.chapter10.replaceConditionalWithPolymorphism;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BirdProgramTest {

    @Test
    void plumages() {
        List<Bird> birds = List.of(
                new Bird("제비1", BirdType.EUROPEAN_SWALLOW),
                new Bird("제비2", BirdType.AFRICAN_SWALLOW, 3, 101),
                new Bird("제비3", BirdType.NORWEGIAN_BLUE_PARROT, 3, 101)
                );

        Map<String, String> plumages = BirdProgram.plumages(birds);

        assertThat(plumages).containsEntry("제비1", "보통이다");
        assertThat(plumages).containsEntry("제비2", "지쳤다");
        assertThat(plumages).containsEntry("제비3", "그을렸다");
    }
}
