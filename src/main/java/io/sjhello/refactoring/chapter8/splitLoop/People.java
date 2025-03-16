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

		System.out.println("총 급여: " + totalSalary(peoples));
		System.out.println("최연소:" + youngestAge(peoples));
	}

	private static int totalSalary(List<People> peoples) {
		int totalSalary = 0;
		for (People people : peoples) {
			totalSalary += people.getSalary();
		}
		return totalSalary;
	}

	private static int youngestAge(List<People> peoples) {
		int youngest = peoples.isEmpty() ? Integer.MAX_VALUE : peoples.get(0).getAge();
		for (People people : peoples) {
			if (people.getAge() < youngest) youngest = people.getAge();
		}
		return youngest;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}
}
