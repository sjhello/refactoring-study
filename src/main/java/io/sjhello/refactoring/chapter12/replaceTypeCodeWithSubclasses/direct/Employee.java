package io.sjhello.refactoring.chapter12.replaceTypeCodeWithSubclasses.direct;

public class Employee {
    private String name;

    protected Employee(String name) {
        this.name = name;
    }

    public static Employee createEmployee(String name, String type) {
        return switch (type) {
            case "engineer" -> new Engineer(name);
            case "sales" -> new Sales(name);
            case "manager" -> new Manager(name);
            default -> throw new IllegalArgumentException("Invalid Employee type: " + type);
        };
    }
}
