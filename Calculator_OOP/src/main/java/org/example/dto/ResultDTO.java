package org.example.dto;

public class ResultDTO {

    private double result;

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ResultDTO{" +
                "result=" + result +
                '}';
    }
}
