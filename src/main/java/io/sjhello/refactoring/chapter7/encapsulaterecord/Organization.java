package io.sjhello.refactoring.chapter7.encapsulaterecord;

public class Organization {

	private String name;
	private String country;

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
