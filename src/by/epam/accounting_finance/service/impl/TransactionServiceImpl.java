package by.epam.accounting_finance.service.impl;

import by.epam.accounting_finance.beans.Transaction;
import by.epam.accounting_finance.controller.command.impl.AddTransaction;
import by.epam.accounting_finance.dao.DAOException;
import by.epam.accounting_finance.dao.DAOFactory;
import by.epam.accounting_finance.dao.TransactionDAO;
import by.epam.accounting_finance.service.ServiceException;
import by.epam.accounting_finance.service.TransactionService;
import by.epam.accounting_finance.util.Validator;

import java.util.List;

public class TransactionServiceImpl implements TransactionService {

    public static final String INCORRECT_TRANSACTION_DATA = "Incorrect transaction data!";


    @Override
    public boolean addTransaction(Transaction transaction) throws ServiceException {
        long amount = transaction.getAmount();
        double operationSum = transaction.getOperationSum();
        String date = transaction.getDate();

        if (!Validator.isValidTransactionData(amount, operationSum, date)) {
            throw new ServiceException(INCORRECT_TRANSACTION_DATA);
        }
        DAOFactory daoFactory = DAOFactory.getInstance();
        TransactionDAO fileTransactionDao = daoFactory.getTransactionDao();
        try {
            return fileTransactionDao.addTransaction(transaction);
        } catch (DAOException e) {
            throw new ServiceException(AddTransaction.SERVICE_ERROR);
        }

    }

    @Override
    public List<Transaction> getTransactionByDate(String date) throws ServiceException {
        return null;
    }

    @Override
    public void updateTransaction(Transaction transaction) throws ServiceException {

    }

    @Override
    public boolean deleteTransaction(Transaction transaction) throws ServiceException {
        boolean isDeletedTransaction;
        long amount = transaction.getAmount();
        double operationSum = transaction.getOperationSum();
        String date = transaction.getDate();
        if (!Validator.isValidTransactionData(amount, operationSum, date)) {
            throw new ServiceException(INCORRECT_TRANSACTION_DATA);
        }
        DAOFactory daoFactory = DAOFactory.getInstance();
        TransactionDAO transactionDAO = daoFactory.getTransactionDao();
        try {
            return transactionDAO.deleteTransaction(transaction);
        } catch (DAOException e) {
            throw new ServiceException(AddTransaction.SERVICE_ERROR);
        }
    }
}