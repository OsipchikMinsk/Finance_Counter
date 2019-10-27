package by.epam.accounting_finance.dao;

import by.epam.accounting_finance.dao.impl.FileReaderDaoImpl;
import by.epam.accounting_finance.dao.impl.FileUserDaoImpl;
import by.epam.accounting_finance.dao.impl.FileWalletDaoImpl;

public class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();
    private final UserDAO fileUserImpl = new FileUserDaoImpl();
    private final WalletDAO fileWalletImpl = new FileWalletDaoImpl();
    private final FileReaderDAO fileReaderDAOImpl = new FileReaderDaoImpl();

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public UserDAO getFileUserImpl() {
        return fileUserImpl;
    }

    public WalletDAO getFileWalletImpl() {
        return fileWalletImpl;
    }

    public FileReaderDAO getFileReaderDAOImpl() {
        return fileReaderDAOImpl;
    }
}
