package io.sjhello.refactoring.chapter7.replaceprimitivewithobject;

public class Order {

	private Priority priority;

	public Order(Priority priority) {
		this(priority.toString());
	}

	public Order(String value) {
		this.priority = new Priority(value);
	}

	public Priority getPriority() {
		return priority;
	}

	public String getPriorityToString() {
		return priority.toString();
	}
}
