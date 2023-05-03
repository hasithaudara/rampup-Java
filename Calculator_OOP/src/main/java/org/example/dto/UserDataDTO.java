package org.example.dto;

public class UserDataDTO {
    private String firstValue;
    private String secondValue;
    private String operation;

    public String getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(String firstValue) {
        this.firstValue = firstValue;
    }

    public String getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(String secondValue) {
        this.secondValue = secondValue;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "UserDataDTO{" +
                "firstValue='" + firstValue + '\'' +
                ", secondValue='" + secondValue + '\'' +
                ", operation='" + operation + '\'' +
                '}';
    }

}
