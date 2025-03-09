package io.sjhello.refactoring.chapter8.movestatementintofunction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        result.add(person.getPhoto().getTitle());
        result.add(emitPhotoData());
        return result;
    }

    public List<String> photoDiv(Person person) {
        List<String> result = new ArrayList<>();
        result.add(person.getPhoto().getTitle());
        result.add(emitPhotoData());
        return result;
    }

    private String emitPhotoData() {
        List<String> result = new ArrayList<>();
        result.add(getLocation());
        result.add(getDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        return String.join(", ", result);
    }
}
