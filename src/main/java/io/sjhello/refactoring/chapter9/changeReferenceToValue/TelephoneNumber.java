package io.sjhello.refactoring.chapter9.changeReferenceToValue;

public class TelephoneNumber {
	private final String areaCode;
	private final int number;

	public TelephoneNumber(String areaCode, int number) {
		this.areaCode = areaCode;
		this.number = number;
	}

	public String getAreaCode() {
		return areaCode;

	}
	public int getNumber() {
		return number;
	}
}
