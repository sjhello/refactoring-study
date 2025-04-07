package io.sjhello.refactoring.chapter12.replaceTypeCodeWithSubclasses;

import java.util.List;

public class Employee {
    private String name;
    private String type;

    protected Employee(String name, String type) {
        validateType(type);
        this.name = name;
        this.type = type;
    }

    private void validateType(String type) {
        List<String> employee = List.of("engineer", "sales", "manager");
        if (!employee.contains(type)) {
            throw new IllegalArgumentException("Invalid Employee type: " + type);
        }
    }

    public static Employee createEmployee(String name, String type) {
        return switch (type) {
            case "engineer" -> new Engineer(name, type);
            default -> new Employee(name, type);
        };
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
