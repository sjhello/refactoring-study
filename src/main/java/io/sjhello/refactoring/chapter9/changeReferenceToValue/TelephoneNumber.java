package io.sjhello.refactoring.chapter9.changeReferenceToValue;

import java.util.Objects;

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

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass())
			return false;
		TelephoneNumber that = (TelephoneNumber)o;
		return getNumber() == that.getNumber() && Objects.equals(getAreaCode(), that.getAreaCode());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getAreaCode(), getNumber());
	}
}
