package io.sjhello.refactoring.chapter7.encapsulaterecord;

public class Organization {

	private String name;
	private String country;

	public String getName() {
		this.name = "Acme Gooseberries";
		return name;
	}

	public String getCountry() {
		this.country = "GB";
		return country;
	}
}
