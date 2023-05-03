package org.example.service;

import org.example.dto.CalculatorOperatorDTO;
import org.example.dto.UserDataDTO;

public class ValidationImpl implements IValidation {

    @Override
    public CalculatorOperatorDTO checkUserData(UserDataDTO userDataDTO) {
        String firstValue = userDataDTO.getFirstValue();
        String secondValue = userDataDTO.getSecondValue();
        String operation = userDataDTO.getOperation();

        CalculatorOperatorDTO calculatorOperatorDTO = new CalculatorOperatorDTO();

        try {

            Double firstNumber = Double.parseDouble(firstValue);
            Double secondNumber = Double.parseDouble(secondValue);

            calculatorOperatorDTO.setFirstValue(firstNumber);
            calculatorOperatorDTO.setSecondValue(secondNumber);

            switch (operation) {
                case "+":
                    calculatorOperatorDTO.setOperation(operation);
                    break;
                case "-":
                    calculatorOperatorDTO.setOperation(operation);
                    break;
                case "*":
                    calculatorOperatorDTO.setOperation(operation);
                    break;
                case "/":
                    calculatorOperatorDTO.setOperation(operation);
                    break;
                default:
                    throw new Exception("Invalid operator");
            }

        } catch (NumberFormatException numberFormatException) {
            System.out.println(numberFormatException.getMessage());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        return calculatorOperatorDTO;
    }
}
