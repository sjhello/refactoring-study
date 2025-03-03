package io.sjhello.refactoring.chapter7.encapsulatecollection;

public class EncapsulateCollection {

	public static int advancedCourses(Person aPerson) {
		aPerson.getCourses()
			.add(new Course("science", true));

		return aPerson.getCourses()
			.stream()
			.filter(Course::isAdvanced)
			.toList()
			.size();
	}
}
