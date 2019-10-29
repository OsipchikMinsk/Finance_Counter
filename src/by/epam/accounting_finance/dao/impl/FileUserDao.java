package by.epam.accounting_finance.dao.impl;
import by.epam.accounting_finance.beans.User;
import by.epam.accounting_finance.dao.DAOException;
import by.epam.accounting_finance.dao.UserDao;
import by.epam.accounting_finance.util.UtilProperty;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileUserDao implements UserDao {


    @Override
    public boolean authorization(String login, String password) throws DAOException {
    //AUTHORIZATION Admin 1234Admin4321
        String passwordPass;
        String loginPass;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(
                    UtilProperty.getPropertyValue("path.file")));
            String dataPass = bufferedReader.readLine();
           loginPass  = dataPass.split(" ")[1];
           passwordPass  = dataPass.split(" ")[2];
            } catch (FileNotFoundException e) {
            throw new DAOException(e.getMessage(),e);
        } catch (IOException e) {
            throw new DAOException(e.getMessage(),e);
        }
        return loginPass.equals(login)&&passwordPass.equals(password);
    }
}
