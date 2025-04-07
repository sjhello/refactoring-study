package io.sjhello.refactoring.chapter12.replaceTypeCodeWithSubclasses;

public class Manager extends Employee {

    protected Manager(String name) {
        super(name);
    }

    public String getType() {
        return "manager!!!!";
    }
}
