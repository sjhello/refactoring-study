package io.sjhello.refactoring.chapter8.movestatementintofunction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Photo {

    private String title;
    private String location;
    private LocalDate date;

    public Photo(String title, String location, LocalDate date) {
        this.title = title;
        this.location = location;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<String> renderPerson(Person person) {
        List<String> result = new ArrayList<>();
        result.add(person.getName());
        emitPhotoData(person, result);
        return result;
    }

    public List<String> photoDiv(Person person) {
        List<String> result = new ArrayList<>();
        emitPhotoData(person, result);
        return result;
    }

    private void emitPhotoData(Person person, List<String> result) {
        result.add(person.getPhoto().getTitle());
        result.add(getLocation());
        result.add(getDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }
}
