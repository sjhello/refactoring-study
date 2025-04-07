package io.sjhello.refactoring.chapter12.replaceTypeCodeWithSubclasses;

public class Sales extends Employee {

    protected Sales(String name, String type) {
        super(name, type);
    }

    @Override
    public String getType() {
        return "sales!!!!";
    }
}
