package io.sjhello.refactoring.chapter12.replaceTypeCodeWithSubclasses.direct;

public class Engineer extends Employee {

    protected Engineer(String name) {
        super(name);
    }

    public String getType() {
        return "engineer!!!!";
    }
}
