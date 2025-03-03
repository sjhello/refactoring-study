package io.sjhello.refactoring.chapter7.encapsulatecollection;

public class EncapsulateCollection {

	public static int advancedCourses(Person aPerson) {
		return aPerson.getCourses()
			.stream()
			.filter(Course::isAdvanced)
			.toList()
			.size();
	}
}
