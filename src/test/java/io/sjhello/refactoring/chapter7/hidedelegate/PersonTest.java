package io.sjhello.refactoring.chapter7.hidedelegate;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {

    @Test
    void hideDelegate() {
        Person person = new Person("person");

        String manager = person.getManager();

        assertThat(manager).isEqualTo("manager");
    }
}
