package io.sjhello.refactoring.chapter7.encapsulatecollection;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class EncapsulateCollectionTest {

	@Test
	void advancedCourses() {
		Person person = mockPerson(mockCourses());
		person.addCourse(new Course("science", true));

		int numAdvancedCourses = EncapsulateCollection.advancedCourses(person);

		assertThat(numAdvancedCourses).isEqualTo(1);
	}

	@Test
	void removeCourse() {
		Person person = mockPerson(mockCourses());
		person.removeCourse(0);

		assertThat(person.getCourses().size()).isEqualTo(1);
	}

	@Test
	void removeCourseWhenIndexIsNegativeThrowException() {
		Person person = mockPerson(mockCourses());

		assertThatThrownBy(() -> person.removeCourse(-1))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	void removeCourseWhenIndexIsBiggerThanSizeThrowException() {
		Person person = mockPerson(mockCourses());

		assertThatThrownBy(() -> person.removeCourse(2))
			.isInstanceOf(IndexOutOfBoundsException.class);
	}

	private Person mockPerson(List<Course> courses) {
		return new Person("Xuemin", courses);
	}

	private List<Course> mockCourses() {
		List<Course> courses = new ArrayList<>();
		courses.add(new Course("Math", false));
		courses.add(new Course("Photography", false));
		return courses;
	}
}
