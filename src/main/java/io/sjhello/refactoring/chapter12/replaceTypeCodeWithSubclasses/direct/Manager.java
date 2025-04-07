package io.sjhello.refactoring.chapter12.replaceTypeCodeWithSubclasses.direct;

public class Manager extends Employee {

    protected Manager(String name) {
        super(name);
    }

    public String getType() {
        return "manager!!!!";
    }
}
