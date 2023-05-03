package org.example.service;

import org.example.dto.CalculatorOperatorDTO;
import org.example.dto.ResultDTO;
import org.example.entity.CalculatorOperation;
import org.example.entity.ResultEntity;

public interface ICalculator {
    ResultDTO processCalculation(CalculatorOperatorDTO calculatorOperatorDTO);
    ResultEntity add(double firstValue, double secondValue, String additionalData);
    ResultEntity subtract(double firstValue, double secondValue, String additionalData);
    ResultEntity multiply(double firstValue, double secondValue, String additionalData);
    ResultEntity divide(double firstValue, double secondValue, String additionalData);
}
