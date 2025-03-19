package io.sjhello.refactoring.chapter9.changeReferenceToValue;

public class TelephoneNumber {

	String areaCode;
	int number;

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
