package by.epam.accounting_finance.service;


import by.epam.accounting_finance.beans.User;

public interface UserService {
    boolean authorization (String login, String password) throws ServiceException;
}
