package org.example.service;

import org.example.dto.UserDataDTO;

public interface IDataRetriever {
    UserDataDTO userDataRetrieval();
    Boolean endUserInteraction();
}
