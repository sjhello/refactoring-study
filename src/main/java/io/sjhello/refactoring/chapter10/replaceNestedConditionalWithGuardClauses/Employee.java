package io.sjhello.refactoring.chapter10.replaceNestedConditionalWithGuardClauses;

public class Employee {
    private boolean isSeparated;
    private boolean isRetired;

    public Employee(boolean isSeparated, boolean isRetired) {
        this.isSeparated = isSeparated;
        this.isRetired = isRetired;
    }

    public boolean isSeparated() {
        return isSeparated;
    }

    public boolean isRetired() {
        return isRetired;
    }
}
