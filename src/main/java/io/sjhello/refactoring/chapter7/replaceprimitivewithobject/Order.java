package io.sjhello.refactoring.chapter7.replaceprimitivewithobject;

public class Order {
	private final Priority priority;

	public Order(Priority priority) {
		this.priority = priority;
	}

	public Priority getPriority() {
		return priority;
	}
}
