package io.sjhello.refactoring.chapter12.extractSuperclass;

public class Employee extends Party {
    private Long id;
    private int monthlyCost;

    public Employee(Long id, String name, int monthlyCost) {
        super(name);
        this.id = id;
        this.monthlyCost = monthlyCost;
    }

    public Long getId() {
        return id;
    }

    @Override
    public int monthlyCost() {
        return monthlyCost;
    }
}

