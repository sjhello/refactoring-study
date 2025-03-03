package io.sjhello.refactoring.chapter7.encapsulatecollection;

import java.util.List;

public class Person {

	private String name;
	private List<Course> courses;

	public Person(String name, List<Course> courses) {
		this.name = name;
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void addCourse(Course course) {
		this.courses.add(course);
	}
}
