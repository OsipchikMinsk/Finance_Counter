package by.epam.accounting_finance.service;

import by.epam.accounting_finance.dao.FileReaderDAO;
import by.epam.accounting_finance.dao.impl.FileReaderDaoImpl;
import by.epam.accounting_finance.service.impl.AuthorizationServiceImpl;
import by.epam.accounting_finance.service.impl.SerializationServiceImpl;
import by.epam.accounting_finance.service.impl.UserServiceImpl;
import by.epam.accounting_finance.service.impl.WalletServiceImpl;

public class ServiceFactory {

    public static final ServiceFactory instance = new ServiceFactory();
    private final UserService userServiceImpl = new UserServiceImpl();
    private final  WalletService walletServiceImpl = new WalletServiceImpl();
    private final FileReaderDAO fileReaderDAO = new FileReaderDaoImpl();

    public AuthorizationService getAuthorizationService() {
        return authorizationService;
    }

    private final AuthorizationService authorizationService = new AuthorizationServiceImpl();

    public FileReaderDAO getFileReaderDAO() {
        return fileReaderDAO;
    }

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    public UserService getUserServiceImpl() {
        return userServiceImpl;
    }

    public WalletService getWalletServiceImpl() {
        return walletServiceImpl;
    }
}
