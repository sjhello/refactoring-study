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

	public void removeCourse(int index) {
		removeCoursesValidate(index);
		this.courses.remove(index);
	}

	private void removeCoursesValidate(int index) {
		if (index < 0) {
			throw new IllegalArgumentException("index는 음수가 될 수 없습니다.");
		}

		if (index >= this.courses.size()) {
			throw new IndexOutOfBoundsException("index는 size 보다 크거나 같을 수 없습니다.");
		}
	}
}
