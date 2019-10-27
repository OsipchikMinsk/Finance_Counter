package by.epam.accounting_finance.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderDaoImpl implements by.epam.accounting_finance.dao.FileReaderDAO {
    @Override
    public String getAuthorizationData(String filePath) {
        String data = "";
        String line;
        String value;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null) { //TODO распарсить одну строку
                value = line.substring(1, ' ');
                data += value;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}

