package io.sjhello.refactoring.chapter7.encapsulaterecord;

public class EncapsulatedRecord {

	public static Organization getOrganization() {
		Organization organization = new Organization();
		organization.name = "Acme Gooseberries";
		organization.country = "GB";
		return organization;
	}
}
