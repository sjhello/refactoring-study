package io.sjhello.refactoring.chapter7.extractclass;

import java.util.Objects;

public class TelephoneNumber {

    private String officeAreaCode;
    private String officeNumber;

    public TelephoneNumber(String officeAreaCode, String officeNumber) {
        this.officeAreaCode = officeAreaCode;
        this.officeNumber = officeNumber;
    }

    @Override
    public String toString() {
        return officeAreaCode + "-" + officeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TelephoneNumber that = (TelephoneNumber) o;
        return Objects.equals(officeAreaCode, that.officeAreaCode) && Objects.equals(officeNumber, that.officeNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(officeAreaCode, officeNumber);
    }

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}
