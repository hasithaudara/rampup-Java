package org.example.service;

import org.example.dto.CalculatorOperatorDTO;
import org.example.dto.UserDataDTO;

public interface IValidation {

    CalculatorOperatorDTO checkUserData(UserDataDTO userDataDTO);

}
