package by.epam.accounting_finance.service;

import by.epam.accounting_finance.util.UtilProperty;




public interface FileService {

    String USER_FILE_PATH = UtilProperty.getPropertyValue("path.file");

    byte[] getUsersData(String name);





}
