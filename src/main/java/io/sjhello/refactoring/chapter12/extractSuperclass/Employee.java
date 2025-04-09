package io.sjhello.refactoring.chapter12.extractSuperclass;

public class Employee extends Party {
    private Long id;
    private String name;
    private int monthlyCost;

    public Employee(Long id, String name, int monthlyCost) {
        this.id = id;
        this.name = name;
        this.monthlyCost = monthlyCost;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMonthlyCost() {
        return monthlyCost;
    }

    public int getAnnualCost() {
        return monthlyCost * 12;
    }
}

