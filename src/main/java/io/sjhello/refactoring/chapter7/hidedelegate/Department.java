package io.sjhello.refactoring.chapter7.hidedelegate;

public class Department {

    private String code;
    private String manager;

    public Department(String code, String manager) {
        this.code = code;
        this.manager = manager;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
