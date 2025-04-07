package io.sjhello.refactoring.chapter12.replaceTypeCodeWithSubclasses.direct;

public class Sales extends Employee {

    protected Sales(String name) {
        super(name);
    }

    public String getType() {
        return "sales!!!!";
    }
}
