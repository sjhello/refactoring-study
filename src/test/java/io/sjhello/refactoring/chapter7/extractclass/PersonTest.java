package io.sjhello.refactoring.chapter7.extractclass;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {

    @Test
    void person() {
        Person person = new Person("person", "010", "3333");

        assertThat(person.getTelephoneNumber()).isEqualTo(new TelephoneNumber("010", "3333"));
    }
}
