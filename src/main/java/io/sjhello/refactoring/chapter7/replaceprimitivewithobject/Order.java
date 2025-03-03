package io.sjhello.refactoring.chapter7.replaceprimitivewithobject;

public class Order {

	private Priority priority;

	public Order(Priority priority) {
		setPriority(priority);
	}

	public Priority getPriority() {
		return priority;
	}

	public String getPriorityToString() {
		return priority.toString();
	}

	public void setPriority(String priorityValue) {
		this.priority = new Priority(priorityValue);
	}

	private void setPriority(Priority priority) {
		setPriority(priority.toString());
	}
}
