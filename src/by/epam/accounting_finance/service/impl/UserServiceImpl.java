package by.epam.accounting_finance.service.impl;

import by.epam.accounting_finance.dao.DAOException;
import by.epam.accounting_finance.dao.DAOFactory;
import by.epam.accounting_finance.dao.UserDao;
import by.epam.accounting_finance.service.ServiceException;
import by.epam.accounting_finance.service.UserService;


public class UserServiceImpl implements UserService {


    @Override
    public boolean authorization(String login, String password) throws ServiceException {

        boolean isDataValid = false;
        DAOFactory daoFactory = DAOFactory.getInstance();
        UserDao userDao = daoFactory.getUserDao();
        try {
           isDataValid = userDao.authorization(login, password);
        } catch (DAOException e) {
            throw  new ServiceException(e);
        }
        return isDataValid;

    }
}


