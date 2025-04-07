package io.sjhello.refactoring.chapter12.replaceTypeCodeWithSubclasses;

public class Manager extends Employee {

    protected Manager(String name, String type) {
        super(name, type);
    }

    @Override
    public String getType() {
        return "manager!!!!";
    }
}
