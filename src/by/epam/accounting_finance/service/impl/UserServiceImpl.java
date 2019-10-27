package by.epam.accounting_finance.service.impl;

import by.epam.accounting_finance.beans.User;
import by.epam.accounting_finance.dao.DAOException;
import by.epam.accounting_finance.dao.DAOFactory;
import by.epam.accounting_finance.dao.UserDAO;
import by.epam.accounting_finance.service.ServiceException;
import by.epam.accounting_finance.service.UserService;
import by.epam.accounting_finance.util.UtilProperty;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO = DAOFactory.getInstance().getFileUserImpl();

    @Override
    public User authorization(String login, String password) throws ServiceException {
        login = UtilProperty.getPropertyValue("user.login");
        password = UtilProperty.getPropertyValue("user.password");



return null;
    }



    /*private UserDAO userDao = new FileUserDAO();


    @Override
    public User getUser(String name)throws DAOException {
        return userDao.getUser(name);
    }*/
}


