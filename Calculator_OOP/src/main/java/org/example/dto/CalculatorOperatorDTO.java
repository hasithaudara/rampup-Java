package org.example.dto;

public class CalculatorOperatorDTO {

    private double firstValue;
    private double secondValue;
    private String operation;

    public double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(double secondValue) {
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
        return "CalculatorOperatorDTO{" +
                "firstValue=" + firstValue +
                ", secondValue=" + secondValue +
                ", operation='" + operation + '\'' +
                '}';
    }
}
