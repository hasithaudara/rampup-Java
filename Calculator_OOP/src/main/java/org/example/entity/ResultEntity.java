package org.example.entity;

import java.lang.ref.SoftReference;

public class ResultEntity {

    private double result;
    //    private CalculatorOperation calculatorOperation;
    private String additionalData;

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(String additionalData) {
        this.additionalData = additionalData;
    }

    @Override
    public String toString() {
        return "ResultEntity{" +
                "result=" + result +
                ", additionalData='" + additionalData + '\'' +
                '}';
    }
}
