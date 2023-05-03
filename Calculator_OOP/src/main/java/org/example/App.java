package org.example;

import org.example.dto.CalculatorOperatorDTO;
import org.example.dto.ResultDTO;
import org.example.dto.UserDataDTO;
import org.example.service.*;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        while (true) {
            IDataRetriever dataRetriever = new DataRetrieverImpl();
            UserDataDTO userDataDTO = dataRetriever.userDataRetrieval();

            IValidation validation = new ValidationImpl();
            CalculatorOperatorDTO calculatorOperatorDTO = validation.checkUserData(userDataDTO);

            ICalculator calculator = new CalculatorImpl();
            ResultDTO resultDTO = calculator.processCalculation(calculatorOperatorDTO);
            System.out.println(resultDTO.getResult());

            if (dataRetriever.endUserInteraction()) {
                break;
            }
        }
    }
}
