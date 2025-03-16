package io.sjhello.refactoring.chapter8.splitLoop;

import java.util.List;

public class People {
	private int age;
	private int salary;

	public People(int age, int salary) {
		this.age = age;
		this.salary = salary;
	}

	public static void main(String[] args) {
		List<People> peoples = List.of(new People(12, 500), new People(20, 1000));
		int youngest = peoples.isEmpty() ? Integer.MAX_VALUE : peoples.get(0).getAge();
		int totalSalary = 0;
		for (People people : peoples) {
			totalSalary += people.getSalary();
		}

		for (People people : peoples) {
			if (people.getAge() < youngest) youngest = people.getAge();
		}
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}
}
