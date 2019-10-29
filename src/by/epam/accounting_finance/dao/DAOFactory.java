package by.epam.accounting_finance.dao;

import by.epam.accounting_finance.dao.impl.FileTransactionDao;
import by.epam.accounting_finance.dao.impl.FileUserDao;

public class DAOFactory {

    private static final DAOFactory instance = new DAOFactory();
    private final UserDao userDao = new FileUserDao();
    private final TransactionDAO transactionDao = new FileTransactionDao();


    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public TransactionDAO getTransactionDao() {
        return transactionDao;
    }
}
