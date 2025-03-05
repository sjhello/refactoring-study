package io.sjhello.refactoring.chapter7.extractclass;

public class Person {

    private String name;
    private TelephoneNumber telephoneNumber;

    public Person(String name, String officeAreaCode, String officeNumber) {
        this.name = name;
        this.telephoneNumber = new TelephoneNumber(officeAreaCode, officeNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }
}
