package io.sjhello.refactoring.chapter7.encapsulaterecord;

public class EncapsulatedRecord {

	public static Organization getOrganization() {
		Organization organization = new Organization();
		organization.setName("Acme Gooseberries");
		return organization;
	}
}
