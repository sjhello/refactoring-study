package io.sjhello.refactoring.chapter9.changeReferenceToValue;

public class Person {
	private TelephoneNumber telephoneNumber;

	public Person() {
		this.telephoneNumber = new TelephoneNumber();
	}

	public String getOfficeAreaCode() {
		return telephoneNumber.areaCode;
	}

	public void setOfficeAreaCode(String officeAreaCode) {
		this.telephoneNumber.areaCode = officeAreaCode;
	}

	public int getOfficeNumber() {
		return telephoneNumber.number;
	}

	public void setOfficeNumber(int officeNumber) {
		this.telephoneNumber.number = officeNumber;
	}
}
