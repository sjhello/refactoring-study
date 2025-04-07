package io.sjhello.refactoring.chapter12.replaceTypeCodeWithSubclasses;

public class Engineer extends Employee {

    protected Engineer(String name, String type) {
        super(name, type);
    }

    public String getType() {
        return "engineer!!!!";
    }
}
