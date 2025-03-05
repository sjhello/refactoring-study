package io.sjhello.refactoring.chapter7.hidedelegate;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void hideDelegate() {
        Person person = new Person("person");

        String manager = person.getDepartment().getManager();

        assertThat(manager).isEqualTo("manager");
    }
}
