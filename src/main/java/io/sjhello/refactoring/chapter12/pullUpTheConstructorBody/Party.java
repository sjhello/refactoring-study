package io.sjhello.refactoring.chapter12.pullUpTheConstructorBody;

public class Party {

    class Employee extends Party {
        private String name;
        private String id;
        private int monthlyCost;

        public Employee(String name, String id, int monthlyCost) {
            super();
            this.name = name;
            this.id = id;
            this.monthlyCost = monthlyCost;
        }
    }

    class Department extends Party {
        private String name;
        private String staff;

        public Department(String name, String staff) {
            super();
            this.name = name;
            this.staff = staff;
        }
    }
}
