package io.sjhello.refactoring.chapter12.pullUpTheConstructorBody;

public class Party {
    private String name;

    public Party(String name) {
        this.name = name;
    }

    class Employee extends Party {
        private String name;
        private String id;
        private int monthlyCost;

        public Employee(String name, String id, int monthlyCost) {
            super(name);
            this.id = id;
            this.monthlyCost = monthlyCost;
        }
    }

    class Department extends Party {
        private String name;
        private String staff;

        public Department(String name, String staff) {
            super(name);
            this.staff = staff;
        }
    }
}
