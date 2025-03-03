package io.sjhello.refactoring.chapter7.replaceprimitivewithobject;

import java.util.List;

public class Priority {

	private String value;

	public Priority(String value) {
		if (legalValues().contains(value)) {
			this.value = value;
		} else {
			throw new IllegalArgumentException(value + "는 유효하지 않은 우선순위 입니다.");
		}
	}

	@Override
	public String toString() {
		return this.value;
	}

	private static List<String> legalValues() {
		return List.of("high", "rush");
	}
}
