package io.sjhello.refactoring.chapter7.encapsulaterecord;

public class EncapsulatedRecord {

	public static Organization getOrganization() {
		Organization organization = new Organization();
		return organization;
	}
}
