package io.sjhello.refactoring.chapter9.changeReferenceToValue;

public class Person {
	private TelephoneNumber telephoneNumber;

	public Person() {
		this.telephoneNumber = new TelephoneNumber("paris", 20);
	}

	public String getOfficeAreaCode() {
		return telephoneNumber.getAreaCode();
	}

	public void setOfficeAreaCode(String officeAreaCode) {
		this.telephoneNumber = new TelephoneNumber(officeAreaCode, getOfficeNumber());
	}

	public int getOfficeNumber() {
		return telephoneNumber.getNumber();
	}

	public void setOfficeNumber(int officeNumber) {
		this.telephoneNumber = new TelephoneNumber(getOfficeAreaCode(), officeNumber);
	}
}
