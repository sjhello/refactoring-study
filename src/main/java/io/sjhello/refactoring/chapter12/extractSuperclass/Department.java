package io.sjhello.refactoring.chapter12.extractSuperclass;

import java.util.List;

public class Department extends Party {
    private List<Integer> staff = List.of(10, 20, 30);

    public Department(String name, List<Integer> staff) {
        super(name);
        this.staff = staff;
    }

    public List<Integer> getStaff() {
        return staff;
    }

    public int totalMonthlyCost() {
        return staff.stream().reduce(0, Integer::sum);
    }

    public int headCount() {
        return staff.size();
    }

    public int totalAnnualCost() {
        return totalMonthlyCost() * 12;
    }
}
