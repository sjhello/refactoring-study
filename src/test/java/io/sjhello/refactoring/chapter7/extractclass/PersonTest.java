package io.sjhello.refactoring.chapter7.extractclass;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void person() {
        Person person = new Person("person", "010", "3333");

        assertThat(person.getTelephoneNumber()).isEqualTo("010-3333");
    }
}
