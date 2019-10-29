package by.epam.accounting_finance.service;


import by.epam.accounting_finance.service.impl.UserServiceImpl;
import by.epam.accounting_finance.service.impl.TransactionServiceImpl;

public class ServiceFactory {

    public static final ServiceFactory instance = new ServiceFactory();
    private final UserService userService = new UserServiceImpl();
    private final TransactionService transactionService = new TransactionServiceImpl();

    public ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    public UserService getUserService() {
        return userService;
    }

    public TransactionService getTransactionService() {
        return transactionService;
    }
}
