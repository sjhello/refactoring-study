package io.sjhello.refactoring.chapter7.hidedelegate;

public class Department {

    private String manager;

    public Department(String manager) {
        this.manager = manager;
    }

    public String getManager() {
        return manager;
    }
}
