package io.sjhello.refactoring.chapter8.movestatementintofunction;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class PhotoTest {

    @Test
    void renderPersonWithValidData() {
        Photo photo = new Photo("Vacation", "Paris", LocalDate.of(2022, 2, 22));
        Person person = new Person("John Doe", photo);
        List<String> result = photo.renderPerson(person);

        assertThat(result).contains("John Doe");
        assertThat(result).contains("Vacation");
        assertThat(result).contains("Paris");
        assertThat(result).contains("2022-02-22");
    }

    @Test
    void photoDivWithValidData() {
        Photo photo = new Photo("Vacation", "Paris", LocalDate.of(2022, 2, 22));
        Person person = new Person("John Doe", photo);
        List<String> result = photo.photoDiv(person);

        assertThat(result).contains("Vacation");
        assertThat(result).contains("Paris");
        assertThat(result).contains("2022-02-22");
    }
}
