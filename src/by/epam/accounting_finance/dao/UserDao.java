package by.epam.accounting_finance.dao;

import by.epam.accounting_finance.beans.User;

public interface UserDao {

    boolean authorization (String login, String password) throws DAOException;

}