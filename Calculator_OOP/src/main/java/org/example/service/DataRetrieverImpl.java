package org.example.service;

import org.example.dto.UserDataDTO;

import java.util.Scanner;

public class DataRetrieverImpl implements IDataRetriever{
    @Override
    public UserDataDTO userDataRetrieval() {

        UserDataDTO userDataDTO = new UserDataDTO();
        Scanner getInput = null;

        System.out.print("Enter first number :");
        getInput = new Scanner(System.in);
        String firstInput = getInput.next();
        userDataDTO.setFirstValue(firstInput);

        System.out.print("Enter second number :");
        getInput = new Scanner(System.in);
        String secondInput = getInput.next();
        userDataDTO.setSecondValue(secondInput);

        System.out.print("Enter your desired operation : (+,-,*,/)");
        getInput = new Scanner(System.in);
        String selectedOperation = getInput.next(  );
        userDataDTO.setOperation(selectedOperation);

        return userDataDTO;
    }

    @Override
    public Boolean endUserInteraction() {
        System.out.println("Do you want to continue for another calculation? (y/n)");
        Scanner getInput = new Scanner(System.in);
        String flag = getInput.next();
        try {
            if (!isContinue(flag)) {
                return Boolean.TRUE;
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return Boolean.FALSE;
    }

    private boolean isContinue(String inputValue) throws Exception {
        if (inputValue.equals("y")) {
            return true;
        } else if (inputValue.equals("n")) {
            return false;
        } else {
            throw new Exception("Invalid Input");
        }
    }
}
