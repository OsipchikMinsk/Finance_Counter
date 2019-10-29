package by.epam.accounting_finance.service.impl;

import by.epam.accounting_finance.beans.Transaction;
import by.epam.accounting_finance.service.ServiceException;
import by.epam.accounting_finance.service.TransactionService;

import java.util.List;

public class TransactionServiceImpl implements TransactionService {


    @Override
    public void addTransaction(Transaction Transaction) throws ServiceException {

    }

    @Override
    public List<Transaction> getTransactionByDate(String date) throws ServiceException {
        return null;
    }

    @Override
    public void updateTransaction(Transaction transaction) throws ServiceException {

    }

    @Override
    public void deleteTransaction(Transaction transaction) throws ServiceException {

    }
}
