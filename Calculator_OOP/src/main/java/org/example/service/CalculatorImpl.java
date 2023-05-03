package org.example.service;

import org.example.dto.CalculatorOperatorDTO;
import org.example.dto.ResultDTO;
import org.example.entity.CalculatorOperation;
import org.example.entity.ResultEntity;

public class CalculatorImpl implements ICalculator {
    public ResultDTO processCalculation(CalculatorOperatorDTO calculatorOperatorDTO) {

        ResultEntity resultEntity = null;
        String operation = calculatorOperatorDTO.getOperation();
        double firstValue = calculatorOperatorDTO.getFirstValue();
        double secondValue = calculatorOperatorDTO.getSecondValue();

        switch (operation) {
            case "+":
                resultEntity = add(firstValue, secondValue, "test");
                break;
            case "-":
                resultEntity = subtract(firstValue, secondValue, "test");
                break;
            case "*":
                resultEntity = multiply(firstValue, secondValue, "test");
                break;
            case "/":
                resultEntity = divide(firstValue, secondValue, "test");
                break;
            default:
                System.out.println("Invalid Input");
        }

        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setResult(resultEntity.getResult());
        return resultDTO;
    }

    public ResultEntity add(double firstValue, double secondValue, String additionalData) {
        double result = firstValue + secondValue;
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setResult(result);
        resultEntity.setAdditionalData(additionalData);

        return resultEntity;
    }

    public ResultEntity subtract(double firstValue, double secondValue, String additionalData) {

        double result = firstValue - secondValue;
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setResult(result);
        resultEntity.setAdditionalData(additionalData);

        return resultEntity;
    }

    public ResultEntity multiply(double firstValue, double secondValue, String additionalData) {

        double result = firstValue * secondValue;
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setResult(result);
        resultEntity.setAdditionalData(additionalData);

        return resultEntity;
    }

    public ResultEntity divide(double firstValue, double secondValue, String additionalData) {

        double result = firstValue / secondValue;
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setResult(result);
        resultEntity.setAdditionalData(additionalData);

        return resultEntity;
    }
}
