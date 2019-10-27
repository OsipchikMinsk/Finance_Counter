package by.epam.accounting_finance.dao;

import by.epam.accounting_finance.util.UtilProperty;

import java.util.List;

public interface FileReaderDAO {

    String AUTHORIZATION_PATH = UtilProperty.getPropertyValue("authorization.file.path");
    String getAuthorizationData (String filePath);
}
