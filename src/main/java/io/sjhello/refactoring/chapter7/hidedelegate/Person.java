package io.sjhello.refactoring.chapter7.hidedelegate;

public class Person {

    private String name;
    private Department department;

    public Person(String name) {
        this.name = name;
        this.department = new Department("manager");
    }

    public String getName() {
        return name;
    }

    public String getManager() {
        return department.getManager();
    }
}
